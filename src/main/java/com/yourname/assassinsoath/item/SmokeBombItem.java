package com.yourname.assassinsoath.item;

import com.yourname.assassinsoath.network.S2CSmokeBombImpact;
import com.yourname.assassinsoath.network.StealthChannel;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.network.PacketDistributor;

public class SmokeBombItem extends Item {
    private static final int QUICK_THRESHOLD_TICKS = 20;
    private static final int SERVER_POOF_BURST = 64;
    private static final int CLIENT_POOF_BURST = 48;
    private static final int EMITTER_DURATION_TICKS = 600;
    private static final int SERVER_POOF_PER_TICK = 4;
    private static final int CLIENT_POOF_PER_TICK = 4;
    private static final int SERVER_CYLINDER_PARTICLES = 80;
    private static final int CLIENT_CYLINDER_PARTICLES = 60;
    private static final int SERVER_CYLINDER_PER_TICK = 8;
    private static final int CLIENT_CYLINDER_PER_TICK = 6;
    private static final double PARTICLE_OFFSET_Y = 0.2;
    private static final double HEMISPHERE_RADIUS = 3.0;
    private static final double CYLINDER_RADIUS = 10.0;
    private static final double CYLINDER_HEIGHT = 1.0;
    private static final int SHAKE_DURATION_TICKS = 12;
    private static final float SHAKE_STRENGTH = 1.25f;
    private static final int BLUR_DURATION_TICKS = 20;
    private static final double IMPACT_EFFECT_RADIUS = 10.0;

    public SmokeBombItem(Properties properties) {
        super(properties);
    }

    @Override
    @Nonnull
    public InteractionResultHolder<ItemStack> use(@Nonnull Level level, @Nonnull Player player, @Nonnull InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        player.startUsingItem(hand);
        return InteractionResultHolder.consume(stack);
    }

    @Override
    public void releaseUsing(@Nonnull ItemStack stack, @Nonnull Level level, @Nonnull LivingEntity entity, int timeLeft) {
        if (!(entity instanceof Player player)) {
            return;
        }
        int usedTicks = getUseDuration(stack) - timeLeft;
        if (usedTicks <= QUICK_THRESHOLD_TICKS) {
            deploySmoke(level, player);
            if (!level.isClientSide && !player.getAbilities().instabuild) {
                stack.shrink(1);
            }
        }
    }

    private void deploySmoke(Level level, LivingEntity user) {
        Vec3 pos = user.position();
        RandomSource random = level.random;
        Vec3 hemisphereCenter = new Vec3(pos.x, user.getY() + user.getEyeHeight() + PARTICLE_OFFSET_Y - 1.0, pos.z);
        BlockPos blockPos = user.blockPosition();
        Vec3 cylinderBase = Vec3.atBottomCenterOf(blockPos);
        if (level instanceof ServerLevel serverLevel) {
            for (int i = 0; i < SERVER_POOF_BURST; ++i) {
                Vec3 spawnPos = hemisphereCenter.add(sampleHemisphereOffset(random));
                serverLevel.sendParticles(ParticleTypes.CLOUD, spawnPos.x, spawnPos.y, spawnPos.z, 1, 0.0, 0.0, 0.0, 0.0);
            }
            spawnCylinderParticles(serverLevel, cylinderBase, SERVER_CYLINDER_PARTICLES, random);
            SmokeEmitterTicker.addEmitter(serverLevel, hemisphereCenter, cylinderBase);
            S2CSmokeBombImpact impact = new S2CSmokeBombImpact(SHAKE_DURATION_TICKS, SHAKE_STRENGTH, BLUR_DURATION_TICKS);
            double radiusSq = IMPACT_EFFECT_RADIUS * IMPACT_EFFECT_RADIUS;
            for (ServerPlayer serverPlayer : serverLevel.players()) {
                if (serverPlayer.level() != serverLevel) {
                    continue;
                }
                if (serverPlayer.distanceToSqr(hemisphereCenter.x, hemisphereCenter.y, hemisphereCenter.z) > radiusSq) {
                    continue;
                }
                StealthChannel.CHANNEL.send(PacketDistributor.PLAYER.with(() -> serverPlayer), impact);
            }
            serverLevel.gameEvent(user, GameEvent.ITEM_INTERACT_FINISH, pos);
            serverLevel.playSound(null, pos.x, user.getY(), pos.z, SoundEvents.FIRECHARGE_USE, SoundSource.PLAYERS, 0.8f,
                    0.7f + random.nextFloat() * 0.4f);
            return;
        }

        for (int i = 0; i < CLIENT_POOF_BURST; ++i) {
            Vec3 spawnPos = hemisphereCenter.add(sampleHemisphereOffset(random));
            double ySpeed = 0.01 + random.nextDouble() * 0.01;
            level.addParticle(ParticleTypes.CLOUD, spawnPos.x, spawnPos.y, spawnPos.z, 0.0, ySpeed, 0.0);
        }
        spawnCylinderParticles(level, cylinderBase, CLIENT_CYLINDER_PARTICLES, random);
        SmokeEmitterTicker.addEmitter(level, hemisphereCenter, cylinderBase);
        level.playLocalSound(pos.x, user.getY(), pos.z, SoundEvents.FIRECHARGE_USE, SoundSource.PLAYERS, 0.8f,
                0.7f + random.nextFloat() * 0.4f, false);
    }

    private static void spawnCylinderParticles(Level level, Vec3 base, int count, RandomSource random) {
        if (count <= 0) {
            return;
        }
        if (level instanceof ServerLevel serverLevel) {
            for (int i = 0; i < count; ++i) {
                Vec3 spawnPos = base.add(sampleCylinderOffset(random));
                serverLevel.sendParticles(ParticleTypes.CLOUD, spawnPos.x, spawnPos.y, spawnPos.z, 1, 0.0, 0.0, 0.0, 0.0);
            }
            return;
        }
        for (int i = 0; i < count; ++i) {
            Vec3 spawnPos = base.add(sampleCylinderOffset(random));
            double ySpeed = 0.01 + random.nextDouble() * 0.01;
            level.addParticle(ParticleTypes.CLOUD, spawnPos.x, spawnPos.y, spawnPos.z, 0.0, ySpeed, 0.0);
        }
    }

    private static Vec3 sampleHemisphereOffset(RandomSource random) {
        double x;
        double y;
        double z;
        double lengthSquared;
        do {
            x = random.nextDouble() * 2.0 - 1.0;
            y = random.nextDouble();
            z = random.nextDouble() * 2.0 - 1.0;
            lengthSquared = x * x + y * y + z * z;
        } while (lengthSquared > 1.0);
        return new Vec3(x * HEMISPHERE_RADIUS, y * HEMISPHERE_RADIUS, z * HEMISPHERE_RADIUS);
    }

    private static Vec3 sampleCylinderOffset(RandomSource random) {
        double angle = random.nextDouble() * Math.PI * 2.0;
        double radius = Math.sqrt(random.nextDouble()) * CYLINDER_RADIUS;
        double x = Math.cos(angle) * radius;
        double z = Math.sin(angle) * radius;
        double y = random.nextDouble() * CYLINDER_HEIGHT;
        return new Vec3(x, y, z);
    }

    @Override
    @Nonnull
    public UseAnim getUseAnimation(@Nonnull ItemStack stack) {
        return UseAnim.NONE;
    }

    @Override
    public int getUseDuration(@Nonnull ItemStack stack) {
        return 72000;
    }

    @Mod.EventBusSubscriber(modid = com.yourname.assassinsoath.AssassinsOath.MODID)
    private static final class SmokeEmitterTicker {
        private static final Map<Level, List<SmokeEmitter>> ACTIVE_EMITTERS = new IdentityHashMap<>();

        private SmokeEmitterTicker() {
        }

        static void addEmitter(Level level, Vec3 center, Vec3 cylinderBase) {
            ACTIVE_EMITTERS.computeIfAbsent(level, ignored -> new ArrayList<>()).add(new SmokeEmitter(center, cylinderBase));
        }

        @SubscribeEvent
        public static void onLevelTick(TickEvent.LevelTickEvent event) {
            if (event.phase != TickEvent.Phase.END) {
                return;
            }
            List<SmokeEmitter> emitters = ACTIVE_EMITTERS.get(event.level);
            if (emitters == null || emitters.isEmpty()) {
                return;
            }
            Iterator<SmokeEmitter> iterator = emitters.iterator();
            while (iterator.hasNext()) {
                SmokeEmitter emitter = iterator.next();
                emitter.tick(event.level);
                if (!emitter.isFinished()) {
                    continue;
                }
                iterator.remove();
            }
            if (emitters.isEmpty()) {
                ACTIVE_EMITTERS.remove(event.level);
            }
        }
    }

    private static final class SmokeEmitter {
        private final Vec3 center;
        private final Vec3 cylinderBase;
        private final RandomSource random = RandomSource.create();
        private int ticksRemaining = EMITTER_DURATION_TICKS;

        private SmokeEmitter(Vec3 center, Vec3 cylinderBase) {
            this.center = center;
            this.cylinderBase = cylinderBase;
        }

        private void tick(Level level) {
            if (ticksRemaining-- <= 0) {
                return;
            }
            if (level instanceof ServerLevel serverLevel) {
                spawnServerParticles(serverLevel, ParticleTypes.CLOUD, SERVER_POOF_PER_TICK, 0.0);
                if (cylinderBase != null) {
                    spawnCylinderParticles(serverLevel, cylinderBase, SERVER_CYLINDER_PER_TICK, random);
                }
            } else {
                spawnClientParticles(level, ParticleTypes.CLOUD, CLIENT_POOF_PER_TICK, 0.01, 0.01);
                if (cylinderBase != null) {
                    spawnCylinderParticles(level, cylinderBase, CLIENT_CYLINDER_PER_TICK, random);
                }
            }
        }

        private void spawnServerParticles(ServerLevel serverLevel, ParticleOptions type, int count, double speed) {
            for (int i = 0; i < count; ++i) {
                Vec3 spawnPos = center.add(sampleHemisphereOffset(random));
                serverLevel.sendParticles(type, spawnPos.x, spawnPos.y, spawnPos.z, 1, 0.0, 0.0, 0.0, speed);
            }
        }

        private void spawnClientParticles(Level level, ParticleOptions type, int count, double baseSpeed, double speedRange) {
            for (int i = 0; i < count; ++i) {
                Vec3 spawnPos = center.add(sampleHemisphereOffset(random));
                double ySpeed = baseSpeed + random.nextDouble() * speedRange;
                level.addParticle(type, spawnPos.x, spawnPos.y, spawnPos.z, 0.0, ySpeed, 0.0);
            }
        }

        private boolean isFinished() {
            return ticksRemaining <= 0;
        }
    }
}
