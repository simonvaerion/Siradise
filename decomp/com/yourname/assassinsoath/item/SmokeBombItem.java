/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.ParticleTypes
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.sounds.SoundEvents
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.InteractionResultHolder
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.UseAnim
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.gameevent.GameEvent
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.event.TickEvent$LevelTickEvent
 *  net.minecraftforge.event.TickEvent$Phase
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.network.PacketDistributor
 */
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

public class SmokeBombItem
extends Item {
    private static final int QUICK_THRESHOLD_TICKS = 20;
    private static final int SERVER_POOF_BURST = 64;
    private static final int CLIENT_POOF_BURST = 48;
    private static final int EMITTER_DURATION_TICKS = 600;
    private static final int SERVER_POOF_PER_TICK = 4;
    private static final int CLIENT_POOF_PER_TICK = 4;
    private static final int SERVER_CYLINDER_PARTICLES = 80;
    private static final int CLIENT_CYLINDER_PARTICLES = 60;
    private static final double PARTICLE_OFFSET_Y = 0.2;
    private static final double HEMISPHERE_HORIZONTAL_RADIUS = 3.0;
    private static final double HEMISPHERE_VERTICAL_RADIUS = 3.0;
    private static final double CYLINDER_RADIUS = 7.0;
    private static final double CYLINDER_HEIGHT = 1.0;
    private static final int SHAKE_DURATION_TICKS = 12;
    private static final float SHAKE_STRENGTH = 1.25f;
    private static final int BLUR_DURATION_TICKS = 20;
    private static final double IMPACT_EFFECT_RADIUS = 50.0;

    public SmokeBombItem(Item.Properties properties) {
        super(properties);
    }

    @Nonnull
    public InteractionResultHolder<ItemStack> m_7203_(@Nonnull Level level, @Nonnull Player player, @Nonnull InteractionHand hand) {
        ItemStack stack = player.m_21120_(hand);
        player.m_6672_(hand);
        return InteractionResultHolder.m_19096_((Object)stack);
    }

    public void m_5551_(@Nonnull ItemStack stack, @Nonnull Level level, @Nonnull LivingEntity entity, int timeLeft) {
        if (!(entity instanceof Player)) {
            return;
        }
        Player player = (Player)entity;
        int usedTicks = this.m_8105_(stack) - timeLeft;
        if (usedTicks <= 20) {
            this.deploySmoke(level, (LivingEntity)player);
            if (!level.f_46443_ && !player.m_150110_().f_35937_) {
                stack.m_41774_(1);
            }
        }
    }

    private void deploySmoke(Level level, LivingEntity user) {
        Vec3 pos = user.m_20182_();
        RandomSource random = level.f_46441_;
        Vec3 hemisphereCenter = new Vec3(pos.f_82479_, user.m_20186_() + 0.2, pos.f_82481_);
        BlockPos blockAboveFeet = user.m_20183_().m_7494_();
        Vec3 cylinderBase = new Vec3((double)blockAboveFeet.m_123341_() + 0.5, (double)blockAboveFeet.m_123342_(), (double)blockAboveFeet.m_123343_() + 0.5);
        if (level instanceof ServerLevel) {
            ServerLevel server = (ServerLevel)level;
            for (int i = 0; i < 64; ++i) {
                Vec3 spawnPos = hemisphereCenter.m_82549_(SmokeBombItem.sampleHemisphereOffset(random));
                server.m_8767_((ParticleOptions)ParticleTypes.f_123759_, spawnPos.f_82479_, spawnPos.f_82480_, spawnPos.f_82481_, 1, 0.0, 0.0, 0.0, 0.0);
            }
            SmokeBombItem.spawnCylinderParticles((Level)server, cylinderBase, 80, random);
            SmokeEmitterTicker.addEmitter((Level)server, hemisphereCenter);
            S2CSmokeBombImpact impact = new S2CSmokeBombImpact(12, 1.25f, 20);
            double radiusSq = 100.0;
            for (ServerPlayer serverPlayer : server.m_6907_()) {
                if (serverPlayer.m_9236_() != server || !(serverPlayer.m_20275_(hemisphereCenter.f_82479_, hemisphereCenter.f_82480_, hemisphereCenter.f_82481_) <= radiusSq)) continue;
                StealthChannel.CHANNEL.send(PacketDistributor.PLAYER.with(() -> serverPlayer), (Object)impact);
            }
            server.m_220400_((Entity)user, GameEvent.f_157812_, pos);
            server.m_6263_(null, pos.f_82479_, user.m_20186_(), pos.f_82481_, SoundEvents.f_11937_, SoundSource.PLAYERS, 0.8f, 0.7f + level.f_46441_.m_188501_() * 0.4f);
            return;
        }
        for (int i = 0; i < 48; ++i) {
            Vec3 spawnPos = hemisphereCenter.m_82549_(SmokeBombItem.sampleHemisphereOffset(random));
            level.m_7106_((ParticleOptions)ParticleTypes.f_123759_, spawnPos.f_82479_, spawnPos.f_82480_, spawnPos.f_82481_, 0.0, 0.01 + random.m_188500_() * 0.01, 0.0);
        }
        SmokeBombItem.spawnCylinderParticles(level, cylinderBase, 60, random);
        SmokeEmitterTicker.addEmitter(level, hemisphereCenter);
        level.m_7785_(pos.f_82479_, user.m_20186_(), pos.f_82481_, SoundEvents.f_11937_, SoundSource.PLAYERS, 0.8f, 0.7f + level.f_46441_.m_188501_() * 0.4f, false);
    }

    private static void spawnCylinderParticles(Level level, Vec3 base, int count, RandomSource random) {
        if (count <= 0) {
            return;
        }
        if (level instanceof ServerLevel) {
            ServerLevel server = (ServerLevel)level;
            for (int i = 0; i < count; ++i) {
                Vec3 spawnPos = base.m_82549_(SmokeBombItem.sampleCylinderOffset(random));
                server.m_8767_((ParticleOptions)ParticleTypes.f_123759_, spawnPos.f_82479_, spawnPos.f_82480_, spawnPos.f_82481_, 1, 0.0, 0.0, 0.0, 0.0);
            }
            return;
        }
        for (int i = 0; i < count; ++i) {
            Vec3 spawnPos = base.m_82549_(SmokeBombItem.sampleCylinderOffset(random));
            double ySpeed = 0.01 + random.m_188500_() * 0.01;
            level.m_7106_((ParticleOptions)ParticleTypes.f_123759_, spawnPos.f_82479_, spawnPos.f_82480_, spawnPos.f_82481_, 0.0, ySpeed, 0.0);
        }
    }

    private static Vec3 sampleHemisphereOffset(RandomSource random) {
        double z;
        double y;
        double x;
        double lengthSquared;
        while (!((lengthSquared = (x = random.m_188500_() * 2.0 - 1.0) * x + (y = random.m_188500_()) * y + (z = random.m_188500_() * 2.0 - 1.0) * z) <= 1.0)) {
        }
        return new Vec3(x * 3.0, y * 3.0, z * 3.0);
    }

    private static Vec3 sampleCylinderOffset(RandomSource random) {
        double angle = random.m_188500_() * (Math.PI * 2);
        double radius = Math.sqrt(random.m_188500_()) * 7.0;
        double x = Math.cos(angle) * radius;
        double z = Math.sin(angle) * radius;
        double y = random.m_188500_() * 1.0;
        return new Vec3(x, y, z);
    }

    @Nonnull
    public UseAnim m_6164_(@Nonnull ItemStack stack) {
        return UseAnim.NONE;
    }

    public int m_8105_(@Nonnull ItemStack stack) {
        return 72000;
    }

    @Mod.EventBusSubscriber(modid="assassinsoath")
    private static final class SmokeEmitterTicker {
        private static final Map<Level, List<SmokeEmitter>> ACTIVE_EMITTERS = new IdentityHashMap<Level, List<SmokeEmitter>>();

        private SmokeEmitterTicker() {
        }

        static void addEmitter(Level level, Vec3 center) {
            ACTIVE_EMITTERS.computeIfAbsent(level, ignored -> new ArrayList()).add(new SmokeEmitter(center));
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
                if (!emitter.isFinished()) continue;
                iterator.remove();
            }
            if (emitters.isEmpty()) {
                ACTIVE_EMITTERS.remove(event.level);
            }
        }
    }

    private static final class SmokeEmitter {
        private final Vec3 center;
        private final RandomSource random = RandomSource.m_216327_();
        private int ticksRemaining = 600;

        private SmokeEmitter(Vec3 center) {
            this.center = center;
        }

        private void tick(Level level) {
            if (this.ticksRemaining-- <= 0) {
                return;
            }
            if (level instanceof ServerLevel) {
                ServerLevel server = (ServerLevel)level;
                this.spawnServerParticles(server, (ParticleOptions)ParticleTypes.f_123759_, 4, 0.0);
            } else {
                this.spawnClientParticles(level, (ParticleOptions)ParticleTypes.f_123759_, 4, 0.01, 0.01);
            }
        }

        private void spawnServerParticles(ServerLevel server, ParticleOptions type, int count, double speed) {
            for (int i = 0; i < count; ++i) {
                Vec3 spawnPos = this.center.m_82549_(SmokeBombItem.sampleHemisphereOffset(this.random));
                server.m_8767_(type, spawnPos.f_82479_, spawnPos.f_82480_, spawnPos.f_82481_, 1, 0.0, 0.0, 0.0, speed);
            }
        }

        private void spawnClientParticles(Level level, ParticleOptions type, int count, double baseSpeed, double speedRange) {
            for (int i = 0; i < count; ++i) {
                Vec3 spawnPos = this.center.m_82549_(SmokeBombItem.sampleHemisphereOffset(this.random));
                double ySpeed = baseSpeed + this.random.m_188500_() * speedRange;
                level.m_7106_(type, spawnPos.f_82479_, spawnPos.f_82480_, spawnPos.f_82481_, 0.0, ySpeed, 0.0);
            }
        }

        private boolean isFinished() {
            return this.ticksRemaining <= 0;
        }
    }
}

