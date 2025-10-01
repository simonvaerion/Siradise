/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.ai.goal.Goal
 *  net.minecraft.world.entity.ai.goal.target.TargetGoal
 *  net.minecraft.world.entity.monster.Enemy
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LightLayer
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.event.TickEvent$Phase
 *  net.minecraftforge.event.TickEvent$PlayerTickEvent
 *  net.minecraftforge.event.entity.EntityJoinLevelEvent
 *  net.minecraftforge.event.entity.living.LivingDamageEvent
 *  net.minecraftforge.event.entity.living.LivingEvent$LivingTickEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.network.PacketDistributor
 */
package com.yourname.assassinsoath.event;

import com.yourname.assassinsoath.ai.StealthAwarenessTracker;
import com.yourname.assassinsoath.ai.goal.InvestigateSoundGoal;
import com.yourname.assassinsoath.ai.goal.SearchLookGoal;
import com.yourname.assassinsoath.network.S2CMobAwareness;
import com.yourname.assassinsoath.network.S2CStealthHud;
import com.yourname.assassinsoath.network.StealthChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
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

@Mod.EventBusSubscriber(modid="assassinsoath")
public final class StealthEvents {
    private static final Map<UUID, HudSnapshot> LAST_CLIENT_STATE = new HashMap<UUID, HudSnapshot>();
    private static final Map<Integer, HudSnapshot> LAST_MOB_STATE = new HashMap<Integer, HudSnapshot>();
    private static final Map<Integer, Integer> LOST_SIGHT_TICKS = new HashMap<Integer, Integer>();
    private static final double FULL_STRENGTH_FOV_COSINE = Math.cos(Math.toRadians(120.0));
    private static final double EXTENDED_FOV_COSINE = Math.cos(Math.toRadians(180.0));
    private static final double MAX_VISUAL_DISTANCE = 50.0;
    private static final double MAX_VISUAL_DISTANCE_SQR = 2500.0;
    private static final double MAX_CHASE_DISTANCE_SQR = 900.0;
    private static final int UPDATE_INTERVAL_TICKS = 5;
    private static final int LOST_SIGHT_RELEASE_TICKS = 200;
    private static final float RELEASE_DETECTION_LEVEL = 0.8f;
    private static final float BASE_VISUAL_INCREMENT = 0.5f;
    private static final double DISTANCE_DECAY_RATE = Math.log(1000.0) / 50.0;
    private static final double MIN_BRIGHTNESS_COEFFICIENT = 0.01;

    private StealthEvents() {
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        HudSnapshot snapshot;
        if (event.phase != TickEvent.Phase.END) {
            return;
        }
        Player player = event.player;
        if (!(player instanceof ServerPlayer)) {
            return;
        }
        ServerPlayer player2 = (ServerPlayer)player;
        if (player2.f_19797_ % 5 != 0) {
            return;
        }
        Level level = player2.m_9236_();
        float detection = 0.0f;
        int stage = 0;
        if (StealthEvents.shouldTrackPlayer((Player)player2)) {
            List mobs = level.m_6443_(Mob.class, player2.m_20191_().m_82400_(20.0), mob -> mob.m_6084_() && mob instanceof Enemy && !mob.m_7307_((Entity)player2));
            for (Mob mob2 : mobs) {
                float trackedDetection = StealthAwarenessTracker.get(mob2).filter(state -> state.targetId().map(id -> id.equals(player2.m_20148_())).orElse(false)).map(StealthAwarenessTracker.AwarenessState::detection).orElse(Float.valueOf(0.0f)).floatValue();
                float gain = StealthEvents.computeVisualDetectionGain(mob2, (Player)player2);
                float prospective = Math.min(1.0f, trackedDetection + gain);
                detection = Math.max(detection, prospective);
            }
            stage = StealthAwarenessTracker.stageFor(detection);
        }
        if ((snapshot = LAST_CLIENT_STATE.get(player2.m_20148_())) == null || snapshot.stage != stage || Math.abs(snapshot.visibility - detection) > 0.02f) {
            StealthChannel.CHANNEL.send(PacketDistributor.PLAYER.with(() -> player2), (Object)new S2CStealthHud(detection, stage));
            LAST_CLIENT_STATE.put(player2.m_20148_(), new HudSnapshot(detection, stage));
        }
    }

    @SubscribeEvent
    public static void onMobTick(LivingEvent.LivingTickEvent event) {
        float existingDetection;
        Player t;
        LivingEntity livingEntity = event.getEntity();
        if (!(livingEntity instanceof Mob)) {
            return;
        }
        Mob mob = (Mob)livingEntity;
        if (mob.m_9236_().f_46443_) {
            return;
        }
        StealthAwarenessTracker.tick(mob);
        if (mob.f_19797_ % 5 != 0) {
            return;
        }
        LivingEntity livingEntity2 = mob.m_5448_();
        Player initialForcedTarget = livingEntity2 instanceof Player && !(t = (Player)livingEntity2).m_5833_() ? t : null;
        Player forcedTarget = StealthEvents.updateTargetLock(mob, initialForcedTarget);
        Player candidate = forcedTarget;
        if (candidate == null) {
            double nearestDistance = Double.MAX_VALUE;
            for (Player potential : mob.m_9236_().m_6907_()) {
                double distanceSq;
                if (!StealthEvents.shouldTrackPlayer(potential) || (distanceSq = mob.m_20280_((Entity)potential)) > 256.0 || distanceSq >= nearestDistance) continue;
                nearestDistance = distanceSq;
                candidate = potential;
            }
        }
        if (candidate == null) {
            LOST_SIGHT_TICKS.remove(mob.m_19879_());
            LAST_MOB_STATE.remove(mob.m_19879_());
            return;
        }
        boolean hostile = mob instanceof Enemy;
        boolean passiveAlert = StealthAwarenessTracker.get(mob).map(state -> state.stage() >= 3 && state.detection() > 0.1f).orElse(false);
        if (!hostile && forcedTarget == null && !passiveAlert) {
            LOST_SIGHT_TICKS.remove(mob.m_19879_());
            LAST_MOB_STATE.remove(mob.m_19879_());
            return;
        }
        float detection = existingDetection = StealthAwarenessTracker.get(mob).map(StealthAwarenessTracker.AwarenessState::detection).orElse(Float.valueOf(0.0f)).floatValue();
        float visualGain = StealthEvents.computeVisualDetectionGain(mob, candidate);
        if (visualGain > 0.0f) {
            detection = Math.min(1.0f, detection + visualGain);
        }
        if (forcedTarget != null && detection < 1.0f) {
            detection = 1.0f;
        }
        int stage = StealthAwarenessTracker.stageFor(detection);
        if (forcedTarget == null && detection < 0.01f && StealthAwarenessTracker.get(mob).isEmpty()) {
            LOST_SIGHT_TICKS.remove(mob.m_19879_());
            LAST_MOB_STATE.remove(mob.m_19879_());
            return;
        }
        if (forcedTarget != null || detection > existingDetection) {
            StealthAwarenessTracker.update(mob, candidate, detection, stage);
        }
        Player targetCandidate = candidate;
        StealthAwarenessTracker.get(mob).ifPresentOrElse(state -> {
            LivingEntity patt7860$temp;
            float trackedDetection = state.detection();
            int trackedStage = state.stage();
            HudSnapshot snapshot = LAST_MOB_STATE.get(mob.m_19879_());
            if (snapshot == null || snapshot.stage != trackedStage || Math.abs(snapshot.visibility - trackedDetection) > 0.02f) {
                StealthChannel.CHANNEL.send(PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> mob), (Object)new S2CMobAwareness(mob.m_19879_(), trackedDetection, trackedStage));
                LAST_MOB_STATE.put(mob.m_19879_(), new HudSnapshot(trackedDetection, trackedStage));
            }
            if (trackedStage >= 3) {
                if (!(mob.m_5448_() instanceof Player) && targetCandidate != null) {
                    mob.m_6710_((LivingEntity)targetCandidate);
                }
            } else if (forcedTarget == null && (patt7860$temp = mob.m_5448_()) instanceof Player) {
                Player current = (Player)patt7860$temp;
                if (targetCandidate == null || current.equals((Object)targetCandidate)) {
                    mob.m_6710_(null);
                }
            }
        }, () -> LAST_MOB_STATE.remove(mob.m_19879_()));
    }

    @SubscribeEvent
    public static void onEntityDamaged(LivingDamageEvent event) {
        Entity entity = event.getSource().m_7639_();
        if (!(entity instanceof Player)) {
            return;
        }
        Player attacker = (Player)entity;
        if (!StealthEvents.shouldTrackPlayer(attacker)) {
            return;
        }
        LivingEntity livingEntity = event.getEntity();
        if (!(livingEntity instanceof Mob)) {
            return;
        }
        Mob mob = (Mob)livingEntity;
        if (mob.m_7307_((Entity)attacker)) {
            return;
        }
        StealthAwarenessTracker.update(mob, attacker, 1.0f, 3);
        StealthAwarenessTracker.get(mob).ifPresent(state -> {
            LAST_MOB_STATE.put(mob.m_19879_(), new HudSnapshot(state.detection(), state.stage()));
            StealthChannel.CHANNEL.send(PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> mob), (Object)new S2CMobAwareness(mob.m_19879_(), state.detection(), state.stage()));
        });
    }

    @SubscribeEvent
    public static void onEntityJoin(EntityJoinLevelEvent event) {
        Entity entity = event.getEntity();
        if (!(entity instanceof Mob)) {
            return;
        }
        Mob mob = (Mob)entity;
        if (event.getLevel().m_5776_()) {
            return;
        }
        StealthEvents.stripVanillaTargetGoals(mob);
        mob.f_21345_.m_25352_(3, (Goal)new SearchLookGoal(mob));
        mob.f_21345_.m_25352_(4, (Goal)new InvestigateSoundGoal(mob));
    }

    private static void stripVanillaTargetGoals(Mob mob) {
        mob.f_21346_.m_148105_().removeIf(goal -> goal.m_26015_() instanceof TargetGoal);
    }

    private static Player updateTargetLock(Mob mob, Player target) {
        if (target == null) {
            LOST_SIGHT_TICKS.remove(mob.m_19879_());
            return null;
        }
        if (!target.m_6084_() || !StealthEvents.shouldTrackPlayer(target)) {
            StealthEvents.releaseTarget(mob);
            return null;
        }
        double distanceSq = mob.m_20280_((Entity)target);
        if (distanceSq > 900.0) {
            StealthEvents.releaseTarget(mob);
            return null;
        }
        if (distanceSq <= 2500.0 && !mob.m_142582_((Entity)target)) {
            int ticks = LOST_SIGHT_TICKS.getOrDefault(mob.m_19879_(), 0) + 5;
            if (ticks >= 200) {
                StealthEvents.releaseTarget(mob);
                return null;
            }
            LOST_SIGHT_TICKS.put(mob.m_19879_(), ticks);
        } else {
            LOST_SIGHT_TICKS.remove(mob.m_19879_());
        }
        return target;
    }

    private static void releaseTarget(Mob mob) {
        LOST_SIGHT_TICKS.remove(mob.m_19879_());
        StealthAwarenessTracker.reduceDetection(mob, 0.8f);
        mob.m_6710_(null);
        StealthAwarenessTracker.get(mob).ifPresentOrElse(state -> {
            LAST_MOB_STATE.put(mob.m_19879_(), new HudSnapshot(state.detection(), state.stage()));
            StealthChannel.CHANNEL.send(PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> mob), (Object)new S2CMobAwareness(mob.m_19879_(), state.detection(), state.stage()));
        }, () -> LAST_MOB_STATE.remove(mob.m_19879_()));
    }

    private static boolean shouldTrackPlayer(Player player) {
        return player != null && !player.m_5833_() && !player.m_7500_() && !player.m_20145_();
    }

    private static float computeVisualDetectionGain(Mob mob, Player player) {
        double angleMultiplier;
        Vec3 direction;
        Vec3 look;
        double dot;
        double clampedDot;
        if (!StealthEvents.shouldTrackPlayer(player)) {
            return 0.0f;
        }
        if (!mob.m_142582_((Entity)player)) {
            return 0.0f;
        }
        Vec3 mobEye = mob.m_20182_().m_82520_(0.0, (double)mob.m_20192_(), 0.0);
        Vec3 playerEye = player.m_20182_().m_82520_(0.0, (double)player.m_20192_(), 0.0);
        Vec3 toPlayer = playerEye.m_82546_(mobEye);
        double distance = toPlayer.m_82553_();
        if (distance > 50.0) {
            return 0.0f;
        }
        if (distance <= 1.0E-4) {
            distance = 0.0;
        }
        if ((clampedDot = Math.max(-1.0, Math.min(1.0, dot = (look = mob.m_20252_(1.0f).m_82541_()).m_82526_(direction = toPlayer.m_82541_())))) >= FULL_STRENGTH_FOV_COSINE) {
            angleMultiplier = 1.0;
        } else if (clampedDot >= EXTENDED_FOV_COSINE) {
            angleMultiplier = 0.5;
        } else {
            return 0.0f;
        }
        double distanceCoefficient = Math.exp(-DISTANCE_DECAY_RATE * distance);
        Level level = mob.m_9236_();
        int block = level.m_45517_(LightLayer.BLOCK, player.m_20183_());
        int sky = level.m_45517_(LightLayer.SKY, player.m_20183_());
        double brightness = Math.max(block, sky);
        double brightnessCoefficient = 0.01 + brightness / 15.0 * 0.99;
        double movementCoefficient = StealthEvents.resolveMovementCoefficient(player);
        double totalCoefficient = distanceCoefficient * brightnessCoefficient * movementCoefficient;
        return (float)(0.5 * totalCoefficient * angleMultiplier);
    }

    private static double resolveMovementCoefficient(Player player) {
        if (player.m_20184_().m_82556_() < 1.0E-4) {
            return 0.3333333333333333;
        }
        if (player.m_6047_()) {
            return 0.5;
        }
        return 1.0;
    }

    private record HudSnapshot(float visibility, int stage) {
    }
}

