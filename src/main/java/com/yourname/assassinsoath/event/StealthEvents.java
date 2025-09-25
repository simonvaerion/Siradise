package com.yourname.assassinsoath.event;

import com.yourname.assassinsoath.AssassinsOath;
import com.yourname.assassinsoath.ai.StealthAwarenessTracker;
import com.yourname.assassinsoath.network.S2CMobAwareness;
import com.yourname.assassinsoath.network.S2CStealthHud;
import com.yourname.assassinsoath.network.StealthChannel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.target.TargetGoal;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.network.PacketDistributor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Mod.EventBusSubscriber(modid = AssassinsOath.MODID)
public final class StealthEvents {
    private StealthEvents() {}

    private static final Map<UUID, HudSnapshot> LAST_CLIENT_STATE = new HashMap<>();
    private static final Map<Integer, HudSnapshot> LAST_MOB_STATE = new HashMap<>();
    private static final Map<Integer, Integer> LOST_SIGHT_TICKS = new HashMap<>();

    private static final double FULL_STRENGTH_FOV_COSINE = Math.cos(Math.toRadians(120.0));
    private static final double EXTENDED_FOV_COSINE = Math.cos(Math.toRadians(180.0));
    private static final double MAX_VISUAL_DISTANCE = 50.0;
    private static final double MAX_VISUAL_DISTANCE_SQR = MAX_VISUAL_DISTANCE * MAX_VISUAL_DISTANCE;
    private static final double MAX_CHASE_DISTANCE_SQR = 30.0 * 30.0;
    private static final int UPDATE_INTERVAL_TICKS = 5;
    private static final int LOST_SIGHT_RELEASE_TICKS = 200;
    private static final float RELEASE_DETECTION_LEVEL = 0.8f;
    private static final float BASE_VISUAL_INCREMENT = 0.5f;
    private static final double DISTANCE_DECAY_RATE = Math.log(1000.0) / MAX_VISUAL_DISTANCE;
    private static final double MIN_BRIGHTNESS_COEFFICIENT = 0.01;

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) {
            return;
        }
        if (!(event.player instanceof ServerPlayer player)) {
            return;
        }
        if (player.tickCount % UPDATE_INTERVAL_TICKS != 0) {
            return;
        }

        Level level = player.level();
        float detection = 0f;
        int stage = 0;

        if (shouldTrackPlayer(player)) {
            List<Mob> mobs = level.getEntitiesOfClass(Mob.class, player.getBoundingBox().inflate(20.0),
                    mob -> mob.isAlive() && mob instanceof Enemy && !mob.isAlliedTo(player));
            for (Mob mob : mobs) {
                float trackedDetection = StealthAwarenessTracker.get(mob)
                        .filter(state -> state.targetId().map(id -> id.equals(player.getUUID())).orElse(false))
                        .map(StealthAwarenessTracker.AwarenessState::detection)
                        .orElse(0f);
                float gain = computeVisualDetectionGain(mob, player);
                float prospective = Math.min(1.0f, trackedDetection + gain);
                detection = Math.max(detection, prospective);
            }
            stage = StealthAwarenessTracker.stageFor(detection);
        }

        HudSnapshot snapshot = LAST_CLIENT_STATE.get(player.getUUID());
        if (snapshot == null || snapshot.stage != stage || Math.abs(snapshot.visibility - detection) > 0.02f) {
            StealthChannel.CHANNEL.send(PacketDistributor.PLAYER.with(() -> player),
                    new S2CStealthHud(detection, stage));
            LAST_CLIENT_STATE.put(player.getUUID(), new HudSnapshot(detection, stage));
        }
    }

    @SubscribeEvent
    public static void onMobTick(LivingEvent.LivingTickEvent event) {
        if (!(event.getEntity() instanceof Mob mob)) {
            return;
        }
        if (mob.level().isClientSide) {
            return;
        }

        StealthAwarenessTracker.tick(mob);

        if (mob.tickCount % UPDATE_INTERVAL_TICKS != 0) {
            return;
        }

        Player initialForcedTarget = mob.getTarget() instanceof Player t && !t.isSpectator() ? t : null;
        Player forcedTarget = updateTargetLock(mob, initialForcedTarget);

        Player candidate = forcedTarget;
        if (candidate == null) {
            double nearestDistance = Double.MAX_VALUE;
            for (Player potential : mob.level().players()) {
                if (!shouldTrackPlayer(potential)) {
                    continue;
                }
                double distanceSq = mob.distanceToSqr(potential);
                if (distanceSq > 16.0 * 16.0 || distanceSq >= nearestDistance) {
                    continue;
                }
                nearestDistance = distanceSq;
                candidate = potential;
            }
        }

        if (candidate == null) {
            LOST_SIGHT_TICKS.remove(mob.getId());
            LAST_MOB_STATE.remove(mob.getId());
            return;
        }

        boolean hostile = mob instanceof Enemy;
        boolean passiveAlert = StealthAwarenessTracker.get(mob)
                .map(state -> state.stage() >= StealthAwarenessTracker.STAGE_ALERT && state.detection() > 0.1f)
                .orElse(false);
        if (!hostile && forcedTarget == null && !passiveAlert) {
            LOST_SIGHT_TICKS.remove(mob.getId());
            LAST_MOB_STATE.remove(mob.getId());
            return;
        }

        float existingDetection = StealthAwarenessTracker.get(mob)
                .map(StealthAwarenessTracker.AwarenessState::detection)
                .orElse(0f);
        float detection = existingDetection;

        float visualGain = computeVisualDetectionGain(mob, candidate);
        if (visualGain > 0f) {
            detection = Math.min(1.0f, detection + visualGain);
        }
        if (forcedTarget != null && detection < 1.0f) {
            detection = 1.0f;
        }
        int stage = StealthAwarenessTracker.stageFor(detection);

        if (forcedTarget == null && detection < 0.01f && StealthAwarenessTracker.get(mob).isEmpty()) {
            LOST_SIGHT_TICKS.remove(mob.getId());
            LAST_MOB_STATE.remove(mob.getId());
            return;
        }

        if (forcedTarget != null || detection > existingDetection) {
            StealthAwarenessTracker.update(mob, candidate, detection, stage);
        }

        final Player targetCandidate = candidate;
        StealthAwarenessTracker.get(mob).ifPresentOrElse(state -> {
            float trackedDetection = state.detection();
            int trackedStage = state.stage();

            HudSnapshot snapshot = LAST_MOB_STATE.get(mob.getId());
            if (snapshot == null || snapshot.stage != trackedStage
                    || Math.abs(snapshot.visibility - trackedDetection) > 0.02f) {
                StealthChannel.CHANNEL.send(PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> mob),
                        new S2CMobAwareness(mob.getId(), trackedDetection, trackedStage));
                LAST_MOB_STATE.put(mob.getId(), new HudSnapshot(trackedDetection, trackedStage));
            }

            if (trackedStage >= StealthAwarenessTracker.STAGE_ALERT) {
                if (!(mob.getTarget() instanceof Player) && targetCandidate != null) {
                    mob.setTarget(targetCandidate);
                }
            } else if (forcedTarget == null && mob.getTarget() instanceof Player current) {
                if (targetCandidate == null || current.equals(targetCandidate)) {
                    mob.setTarget(null);
                }
            }
        }, () -> LAST_MOB_STATE.remove(mob.getId()));
    }

    @SubscribeEvent
    public static void onEntityDamaged(LivingDamageEvent event) {
        if (!(event.getSource().getEntity() instanceof Player attacker)) {
            return;
        }
        if (!shouldTrackPlayer(attacker)) {
            return;
        }
        if (!(event.getEntity() instanceof Mob mob)) {
            return;
        }
        if (mob.isAlliedTo(attacker)) {
            return;
        }

        StealthAwarenessTracker.update(mob, attacker, 1.0f, StealthAwarenessTracker.STAGE_ALERT);
        StealthAwarenessTracker.get(mob).ifPresent(state -> {
            LAST_MOB_STATE.put(mob.getId(), new HudSnapshot(state.detection(), state.stage()));
            StealthChannel.CHANNEL.send(PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> mob),
                    new S2CMobAwareness(mob.getId(), state.detection(), state.stage()));
        });
    }

    @SubscribeEvent
    public static void onEntityJoin(EntityJoinLevelEvent event) {
        if (!(event.getEntity() instanceof Mob mob)) {
            return;
        }
        if (event.getLevel().isClientSide()) {
            return;
        }

        stripVanillaTargetGoals(mob);
        mob.goalSelector.addGoal(3, new com.yourname.assassinsoath.ai.goal.SearchLookGoal(mob));
        mob.goalSelector.addGoal(4, new com.yourname.assassinsoath.ai.goal.InvestigateSoundGoal(mob));
    }

    private static void stripVanillaTargetGoals(Mob mob) {
        mob.targetSelector.getAvailableGoals().removeIf(goal -> goal.getGoal() instanceof TargetGoal);
    }

    private static Player updateTargetLock(Mob mob, Player target) {
        if (target == null) {
            LOST_SIGHT_TICKS.remove(mob.getId());
            return null;
        }
        if (!target.isAlive() || !shouldTrackPlayer(target)) {
            releaseTarget(mob);
            return null;
        }
        double distanceSq = mob.distanceToSqr(target);
        if (distanceSq > MAX_CHASE_DISTANCE_SQR) {
            releaseTarget(mob);
            return null;
        }
        if (distanceSq <= MAX_VISUAL_DISTANCE_SQR && !mob.hasLineOfSight(target)) {
            int ticks = LOST_SIGHT_TICKS.getOrDefault(mob.getId(), 0) + UPDATE_INTERVAL_TICKS;
            if (ticks >= LOST_SIGHT_RELEASE_TICKS) {
                releaseTarget(mob);
                return null;
            }
            LOST_SIGHT_TICKS.put(mob.getId(), ticks);
        } else {
            LOST_SIGHT_TICKS.remove(mob.getId());
        }
        return target;
    }

    private static void releaseTarget(Mob mob) {
        LOST_SIGHT_TICKS.remove(mob.getId());
        StealthAwarenessTracker.reduceDetection(mob, RELEASE_DETECTION_LEVEL);
        mob.setTarget(null);
        StealthAwarenessTracker.get(mob)
                .ifPresentOrElse(
                        state -> {
                            LAST_MOB_STATE.put(mob.getId(), new HudSnapshot(state.detection(), state.stage()));
                            StealthChannel.CHANNEL.send(
                                    PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> mob),
                                    new S2CMobAwareness(mob.getId(), state.detection(), state.stage()));
                        },
                        () -> LAST_MOB_STATE.remove(mob.getId()));
    }

    private static boolean shouldTrackPlayer(Player player) {
        return player != null && !player.isSpectator() && !player.isCreative() && !player.isInvisible();
    }

    private static float computeVisualDetectionGain(Mob mob, Player player) {
        if (!shouldTrackPlayer(player)) {
            return 0f;
        }
        if (!mob.hasLineOfSight(player)) {
            return 0f;
        }

        Vec3 mobEye = mob.position().add(0.0, mob.getEyeHeight(), 0.0);
        Vec3 playerEye = player.position().add(0.0, player.getEyeHeight(), 0.0);
        Vec3 toPlayer = playerEye.subtract(mobEye);
        double distance = toPlayer.length();
        if (distance > MAX_VISUAL_DISTANCE) {
            return 0f;
        }

        if (distance <= 1.0E-4) {
            distance = 0.0;
        }

        Vec3 look = mob.getViewVector(1.0F).normalize();
        Vec3 direction = toPlayer.normalize();
        double dot = look.dot(direction);
        double clampedDot = Math.max(-1.0, Math.min(1.0, dot));
        double angleMultiplier;
        if (clampedDot >= FULL_STRENGTH_FOV_COSINE) {
            angleMultiplier = 1.0;
        } else if (clampedDot >= EXTENDED_FOV_COSINE) {
            angleMultiplier = 0.5;
        } else {
            return 0f;
        }

        double distanceCoefficient = Math.exp(-DISTANCE_DECAY_RATE * distance);

        Level level = mob.level();
        int block = level.getBrightness(LightLayer.BLOCK, player.blockPosition());
        int sky = level.getBrightness(LightLayer.SKY, player.blockPosition());
        double brightness = Math.max(block, sky);
        double brightnessCoefficient = MIN_BRIGHTNESS_COEFFICIENT
                + (brightness / 15.0) * (1.0 - MIN_BRIGHTNESS_COEFFICIENT);

        double movementCoefficient = resolveMovementCoefficient(player);
        double totalCoefficient = distanceCoefficient * brightnessCoefficient * movementCoefficient;
        return (float) (BASE_VISUAL_INCREMENT * totalCoefficient * angleMultiplier);
    }

    private static double resolveMovementCoefficient(Player player) {
        if (player.getDeltaMovement().lengthSqr() < 1.0E-4) {
            return 1.0 / 3.0;
        }
        if (player.isCrouching()) {
            return 0.5;
        }
        return 1.0;
    }

    private record HudSnapshot(float visibility, int stage) {}
}
