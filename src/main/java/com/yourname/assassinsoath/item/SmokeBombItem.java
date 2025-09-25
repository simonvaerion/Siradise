package com.yourname.assassinsoath.item;

import com.yourname.assassinsoath.AssassinsOath;
import com.yourname.assassinsoath.network.S2CSmokeBombImpact;
import com.yourname.assassinsoath.network.StealthChannel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
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

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SmokeBombItem extends Item {
    private static final int QUICK_THRESHOLD_TICKS = 20; // 1 second
    private static final int SERVER_POOF_BURST = 64;
    private static final int CLIENT_POOF_BURST = 48;
    private static final int EMITTER_DURATION_TICKS = 600; // 30 seconds
    private static final int SERVER_POOF_PER_TICK = 4;
    private static final int CLIENT_POOF_PER_TICK = 4;
    private static final int SERVER_CYLINDER_PARTICLES = 80;
    private static final int CLIENT_CYLINDER_PARTICLES = 60;
    private static final double PARTICLE_OFFSET_Y = 0.2D;
    private static final double HEMISPHERE_HORIZONTAL_RADIUS = 3.0D;
    private static final double HEMISPHERE_VERTICAL_RADIUS = 3.0D;
    private static final double CYLINDER_RADIUS = 7.0D;
    private static final double CYLINDER_HEIGHT = 1.0D;
    private static final int SHAKE_DURATION_TICKS = 12;
    private static final float SHAKE_STRENGTH = 1.25F;
    private static final int BLUR_DURATION_TICKS = 20;
    private static final double IMPACT_EFFECT_RADIUS = 10.0D;

    public SmokeBombItem(Properties properties) {
        super(properties);
    }

    @Override
    public @Nonnull InteractionResultHolder<ItemStack> use(@Nonnull Level level,
                                                           @Nonnull Player player,
                                                           @Nonnull InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        player.startUsingItem(hand);
        return InteractionResultHolder.consume(stack);
    }

    @Override
    public void releaseUsing(@Nonnull ItemStack stack,
                             @Nonnull Level level,
                             @Nonnull LivingEntity entity,
                             int timeLeft) {
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
        Vec3 hemisphereCenter = new Vec3(pos.x, user.getY() + PARTICLE_OFFSET_Y, pos.z);
        BlockPos blockAboveFeet = user.blockPosition().above();
        Vec3 cylinderBase = new Vec3(blockAboveFeet.getX() + 0.5D, blockAboveFeet.getY(),
                blockAboveFeet.getZ() + 0.5D);

        if (level instanceof ServerLevel server) {
            for (int i = 0; i < SERVER_POOF_BURST; i++) {
                Vec3 spawnPos = hemisphereCenter.add(sampleHemisphereOffset(random));
                server.sendParticles(
                        ParticleTypes.POOF,
                        spawnPos.x,
                        spawnPos.y,
                        spawnPos.z,
                        1,
                        0.0D,
                        0.0D,
                        0.0D,
                        0.0D);
            }
            spawnCylinderParticles(server, cylinderBase, SERVER_CYLINDER_PARTICLES, random);
            SmokeEmitterTicker.addEmitter(server, hemisphereCenter);
            S2CSmokeBombImpact impact = new S2CSmokeBombImpact(SHAKE_DURATION_TICKS, SHAKE_STRENGTH, BLUR_DURATION_TICKS);
            double radiusSq = IMPACT_EFFECT_RADIUS * IMPACT_EFFECT_RADIUS;
            for (ServerPlayer serverPlayer : server.players()) {
                if (serverPlayer.level() == server
                        && serverPlayer.distanceToSqr(hemisphereCenter.x, hemisphereCenter.y, hemisphereCenter.z) <= radiusSq) {
                    StealthChannel.CHANNEL.send(PacketDistributor.PLAYER.with(() -> serverPlayer), impact);
                }
            }
            server.gameEvent(user, GameEvent.EXPLODE, pos);
            server.playSound(
                    null,
                    pos.x,
                    user.getY(),
                    pos.z,
                    SoundEvents.FIRE_EXTINGUISH,
                    SoundSource.PLAYERS,
                    0.8F,
                    0.7F + level.random.nextFloat() * 0.4F);
            return;
        }

        for (int i = 0; i < CLIENT_POOF_BURST; i++) {
            Vec3 spawnPos = hemisphereCenter.add(sampleHemisphereOffset(random));
            level.addParticle(
                    ParticleTypes.POOF,
                    spawnPos.x,
                    spawnPos.y,
                    spawnPos.z,
                    0.0D,
                    0.01D + random.nextDouble() * 0.01D,
                    0.0D);
        }
        spawnCylinderParticles(level, cylinderBase, CLIENT_CYLINDER_PARTICLES, random);
        SmokeEmitterTicker.addEmitter(level, hemisphereCenter);
        level.playLocalSound(
                pos.x,
                user.getY(),
                pos.z,
                SoundEvents.FIRE_EXTINGUISH,
                SoundSource.PLAYERS,
                0.8F,
                0.7F + level.random.nextFloat() * 0.4F,
                false);
    }

    private static void spawnCylinderParticles(Level level, Vec3 base, int count, RandomSource random) {
        if (count <= 0) {
            return;
        }

        if (level instanceof ServerLevel server) {
            for (int i = 0; i < count; i++) {
                Vec3 spawnPos = base.add(sampleCylinderOffset(random));
                server.sendParticles(ParticleTypes.POOF, spawnPos.x, spawnPos.y, spawnPos.z,
                        1, 0.0D, 0.0D, 0.0D, 0.0D);
            }
            return;
        }

        for (int i = 0; i < count; i++) {
            Vec3 spawnPos = base.add(sampleCylinderOffset(random));
            double ySpeed = 0.01D + random.nextDouble() * 0.01D;
            level.addParticle(ParticleTypes.POOF, spawnPos.x, spawnPos.y, spawnPos.z, 0.0D, ySpeed, 0.0D);
        }
    }

    private static Vec3 sampleHemisphereOffset(RandomSource random) {
        while (true) {
            double x = random.nextDouble() * 2.0D - 1.0D;
            double y = random.nextDouble();
            double z = random.nextDouble() * 2.0D - 1.0D;
            double lengthSquared = x * x + y * y + z * z;
            if (lengthSquared <= 1.0D) {
                return new Vec3(
                        x * HEMISPHERE_HORIZONTAL_RADIUS,
                        y * HEMISPHERE_VERTICAL_RADIUS,
                        z * HEMISPHERE_HORIZONTAL_RADIUS);
            }
        }
    }

    private static Vec3 sampleCylinderOffset(RandomSource random) {
        double angle = random.nextDouble() * (Math.PI * 2.0D);
        double radius = Math.sqrt(random.nextDouble()) * CYLINDER_RADIUS;
        double x = Math.cos(angle) * radius;
        double z = Math.sin(angle) * radius;
        double y = random.nextDouble() * CYLINDER_HEIGHT;
        return new Vec3(x, y, z);
    }

    @Override
    public @Nonnull UseAnim getUseAnimation(@Nonnull ItemStack stack) {
        return UseAnim.NONE;
    }

    @Override
    public int getUseDuration(@Nonnull ItemStack stack) {
        return 72000;
    }

    @Mod.EventBusSubscriber(modid = AssassinsOath.MODID)
    private static final class SmokeEmitterTicker {
        private static final Map<Level, List<SmokeEmitter>> ACTIVE_EMITTERS = new IdentityHashMap<>();

        private SmokeEmitterTicker() {
        }

        static void addEmitter(Level level, Vec3 center) {
            ACTIVE_EMITTERS
                    .computeIfAbsent(level, ignored -> new ArrayList<>())
                    .add(new SmokeEmitter(center));
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
                if (emitter.isFinished()) {
                    iterator.remove();
                }
            }

            if (emitters.isEmpty()) {
                ACTIVE_EMITTERS.remove(event.level);
            }
        }
    }

    private static final class SmokeEmitter {
        private final Vec3 center;
        private final RandomSource random = RandomSource.create();
        private int ticksRemaining = EMITTER_DURATION_TICKS;

        private SmokeEmitter(Vec3 center) {
            this.center = center;
        }

        private void tick(Level level) {
            if (ticksRemaining-- <= 0) {
                return;
            }

            if (level instanceof ServerLevel server) {
                spawnServerParticles(server, ParticleTypes.POOF, SERVER_POOF_PER_TICK, 0.0D);
            } else {
                spawnClientParticles(level, ParticleTypes.POOF, CLIENT_POOF_PER_TICK, 0.01D, 0.01D);
            }
        }

        private void spawnServerParticles(ServerLevel server, net.minecraft.core.particles.ParticleOptions type,
                                          int count, double speed) {
            for (int i = 0; i < count; i++) {
                Vec3 spawnPos = center.add(sampleHemisphereOffset(random));
                server.sendParticles(type, spawnPos.x, spawnPos.y, spawnPos.z,
                        1, 0.0D, 0.0D, 0.0D, speed);
            }
        }

        private void spawnClientParticles(Level level, net.minecraft.core.particles.ParticleOptions type,
                                          int count, double baseSpeed, double speedRange) {
            for (int i = 0; i < count; i++) {
                Vec3 spawnPos = center.add(sampleHemisphereOffset(random));
                double ySpeed = baseSpeed + random.nextDouble() * speedRange;
                level.addParticle(type, spawnPos.x, spawnPos.y, spawnPos.z, 0.0D, ySpeed, 0.0D);
            }
        }

        private boolean isFinished() {
            return ticksRemaining <= 0;
        }
    }
}






