package com.yourname.assassinsoath.item;

import com.yourname.assassinsoath.AssassinsOath;
import com.yourname.assassinsoath.entity.SmokeBombProjectile;
import com.yourname.assassinsoath.network.S2CSmokeBombImpact;
import com.yourname.assassinsoath.network.StealthChannel;
import com.yourname.assassinsoath.registry.ModSoundEvents;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
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

public class SmokeBombItem extends Item {
<<<<<<< ours
    private static final int SERVER_POOF_BURST = 64 * 9;
    private static final int CLIENT_POOF_BURST = 48 * 9;
    private static final int EMITTER_DURATION_TICKS = 600;
    private static final int SERVER_POOF_PER_TICK = 4 * 9;
    private static final int CLIENT_POOF_PER_TICK = 4 * 9;
    private static final int SERVER_CYLINDER_PARTICLES = 80 * 9;
    private static final int CLIENT_CYLINDER_PARTICLES = 60 * 9;
    private static final double PARTICLE_OFFSET_Y = 0.2D;
    private static final double HEMISPHERE_HORIZONTAL_RADIUS = 3.0D;
    private static final double HEMISPHERE_VERTICAL_RADIUS = 3.0D;
    private static final double CYLINDER_HEIGHT = 1.5D;
    private static final double CYLINDER_MAX_RADIUS = 12.0D;
    private static final double CYLINDER_EXPANSION_PER_TICK = 2.0D / 6.0D;
=======
    private static final int SERVER_POOF_BURST = 64;
    private static final int CLIENT_POOF_BURST = 48;
    private static final int EMITTER_DURATION_TICKS = 600;
    private static final int SERVER_POOF_PER_TICK = 4;
    private static final int CLIENT_POOF_PER_TICK = 4;
    private static final int SERVER_CYLINDER_PARTICLES = 80;
    private static final int CLIENT_CYLINDER_PARTICLES = 60;
    private static final double PARTICLE_OFFSET_Y = 0.2D;
    private static final double HEMISPHERE_HORIZONTAL_RADIUS = 3.0D;
    private static final double HEMISPHERE_VERTICAL_RADIUS = 3.0D;
    private static final double CYLINDER_HEIGHT = 1.0D;
    private static final double CYLINDER_MAX_RADIUS = 10.0D;
    private static final double CYLINDER_EXPANSION_PER_TICK = 2.0D / 20.0D;
>>>>>>> theirs
    private static final double INITIAL_CYLINDER_RADIUS = CYLINDER_EXPANSION_PER_TICK;
    private static final int SHAKE_DURATION_TICKS = 12;
    private static final float SHAKE_STRENGTH = 1.25F;
    private static final int BLUR_DURATION_TICKS = 20;
    private static final double IMPACT_EFFECT_RADIUS = 50.0D;

    public SmokeBombItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    @Nonnull
    public InteractionResultHolder<ItemStack> use(@Nonnull Level level, @Nonnull Player player, @Nonnull InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        level.playSound(null, player.getX(), player.getY(), player.getZ(), ModSoundEvents.SMOKE_BOMB_USE.get(), SoundSource.PLAYERS, 0.8F,
                0.7F + level.getRandom().nextFloat() * 0.4F);

        if (!level.isClientSide) {
            SmokeBombProjectile projectile = new SmokeBombProjectile(level, player);
            projectile.setItem(stack.copyWithCount(1));
            projectile.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
            level.addFreshEntity(projectile);
        }

        level.gameEvent(player, GameEvent.PROJECTILE_SHOOT, player.blockPosition());
        player.awardStat(Stats.ITEM_USED.get(this));

        if (!player.getAbilities().instabuild) {
            stack.shrink(1);
        }

        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
    }

    public static void explode(Level level, @Nullable LivingEntity owner, Vec3 hitPos) {
        RandomSource random = level.getRandom();
        Vec3 hemisphereCenter = hitPos.add(0.0D, PARTICLE_OFFSET_Y, 0.0D);
        BlockPos basePos = BlockPos.containing(hitPos);
        if (!level.getBlockState(basePos).isAir()) {
            basePos = basePos.above();
        }
        Vec3 cylinderBase = Vec3.atBottomCenterOf(basePos);

        if (level instanceof ServerLevel server) {
            for (int index = 0; index < SERVER_POOF_BURST; ++index) {
                Vec3 spawnPos = hemisphereCenter.add(sampleHemisphereOffset(random));
                server.sendParticles(ParticleTypes.POOF, spawnPos.x, spawnPos.y, spawnPos.z, 1, 0.0D, 0.0D, 0.0D, 0.0D);
            }

            spawnCylinderParticles(server, cylinderBase, SERVER_CYLINDER_PARTICLES, random, INITIAL_CYLINDER_RADIUS);
            SmokeEmitterTicker.addEmitter(server, cylinderBase);

            S2CSmokeBombImpact impact = new S2CSmokeBombImpact(SHAKE_DURATION_TICKS, SHAKE_STRENGTH, BLUR_DURATION_TICKS);
            double radiusSq = IMPACT_EFFECT_RADIUS * IMPACT_EFFECT_RADIUS;
            for (ServerPlayer serverPlayer : server.players()) {
                if (serverPlayer.level() != server || serverPlayer.distanceToSqr(hemisphereCenter) > radiusSq) {
                    continue;
                }
                StealthChannel.CHANNEL.send(PacketDistributor.PLAYER.with(() -> serverPlayer), impact);
            }

            server.gameEvent(owner, GameEvent.PROJECTILE_LAND, basePos);
            server.playSound(null, hitPos.x, hitPos.y, hitPos.z, ModSoundEvents.SMOKE_BOMB_CRACK.get(), SoundSource.PLAYERS, 0.8F,
                    0.7F + random.nextFloat() * 0.4F);
            return;
        }

        for (int index = 0; index < CLIENT_POOF_BURST; ++index) {
            Vec3 spawnPos = hemisphereCenter.add(sampleHemisphereOffset(random));
            level.addParticle(ParticleTypes.POOF, spawnPos.x, spawnPos.y, spawnPos.z, 0.0D, 0.01D + random.nextDouble() * 0.01D, 0.0D);
        }

        spawnCylinderParticles(level, cylinderBase, CLIENT_CYLINDER_PARTICLES, random, INITIAL_CYLINDER_RADIUS);
        SmokeEmitterTicker.addEmitter(level, cylinderBase);
        level.playLocalSound(hitPos.x, hitPos.y, hitPos.z, ModSoundEvents.SMOKE_BOMB_CRACK.get(), SoundSource.PLAYERS, 0.8F,
                0.7F + random.nextFloat() * 0.4F, false);
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

    private static void spawnCylinderParticles(Level level, Vec3 base, int count, RandomSource random, double radius) {
        if (count <= 0 || radius <= 0.0D) {
            return;
        }

        if (level instanceof ServerLevel server) {
            for (int index = 0; index < count; ++index) {
<<<<<<< ours
                Vec3 spawnPos = base.add(sampleCylinderOffset(random, radius, CYLINDER_HEIGHT));
=======
                Vec3 spawnPos = base.add(sampleLogarithmicCylinderOffset(random, radius, CYLINDER_HEIGHT));
>>>>>>> theirs
                server.sendParticles(ParticleTypes.POOF, spawnPos.x, spawnPos.y, spawnPos.z, 1, 0.0D, 0.0D, 0.0D, 0.0D);
            }
            return;
        }

        for (int index = 0; index < count; ++index) {
<<<<<<< ours
            Vec3 spawnPos = base.add(sampleCylinderOffset(random, radius, CYLINDER_HEIGHT));
=======
            Vec3 spawnPos = base.add(sampleLogarithmicCylinderOffset(random, radius, CYLINDER_HEIGHT));
>>>>>>> theirs
            double ySpeed = 0.01D + random.nextDouble() * 0.01D;
            level.addParticle(ParticleTypes.POOF, spawnPos.x, spawnPos.y, spawnPos.z, 0.0D, ySpeed, 0.0D);
        }
    }

    private static Vec3 sampleHemisphereOffset(RandomSource random) {
        double x;
        double y;
        double z;
        do {
            x = random.nextDouble() * 2.0D - 1.0D;
            y = random.nextDouble();
            z = random.nextDouble() * 2.0D - 1.0D;
        } while (x * x + y * y + z * z > 1.0D);
        return new Vec3(x * HEMISPHERE_HORIZONTAL_RADIUS, y * HEMISPHERE_VERTICAL_RADIUS, z * HEMISPHERE_HORIZONTAL_RADIUS);
    }

<<<<<<< ours
    private static Vec3 sampleCylinderOffset(RandomSource random, double radius, double height) {
        if (radius <= 0.0D) {
            return new Vec3(0.0D, random.nextDouble() * height, 0.0D);
        }
        double angle = random.nextDouble() * (Math.PI * 2.0D);
        double radial = Math.sqrt(random.nextDouble()) * radius;
        double x = Math.cos(angle) * radial;
        double z = Math.sin(angle) * radial;
        double y = random.nextDouble() * height;
        return new Vec3(x, y, z);
=======
    private static Vec3 sampleLogarithmicCylinderOffset(RandomSource random, double radius, double height) {
        if (radius <= 0.0D) {
            return new Vec3(0.0D, random.nextDouble() * height, 0.0D);
        }
        for (int attempt = 0; attempt < 12; ++attempt) {
            double angle = random.nextDouble() * (Math.PI * 2.0D);
            double sqrtRand = Math.sqrt(random.nextDouble());
            double radial = sqrtRand * radius;
            double normalized = Math.min(1.0D, radial / radius);
            double density = 1.0D - Math.log1p((Math.E - 1.0D) * normalized);
            if (random.nextDouble() > density) {
                continue;
            }
            double x = Math.cos(angle) * radial;
            double z = Math.sin(angle) * radial;
            double y = random.nextDouble() * height;
            return new Vec3(x, y, z);
        }
        return new Vec3(0.0D, random.nextDouble() * height, 0.0D);
>>>>>>> theirs
    }

    @Mod.EventBusSubscriber(modid = AssassinsOath.MODID)
    private static final class SmokeEmitterTicker {
        private static final Map<Level, List<SmokeEmitter>> ACTIVE_EMITTERS = new IdentityHashMap<>();

        private SmokeEmitterTicker() {
        }

        static void addEmitter(Level level, Vec3 cylinderBase) {
            ACTIVE_EMITTERS.computeIfAbsent(level, ignored -> new ArrayList<>()).add(new SmokeEmitter(cylinderBase));
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
        private final Vec3 cylinderBase;
        private final RandomSource random = RandomSource.create();
        private int ticksRemaining = EMITTER_DURATION_TICKS;
        private double currentRadius = 0.0D;

        private SmokeEmitter(Vec3 cylinderBase) {
            this.cylinderBase = cylinderBase;
        }

        private void tick(Level level) {
            if (this.ticksRemaining-- <= 0) {
                return;
            }

            this.currentRadius = Math.min(this.currentRadius + CYLINDER_EXPANSION_PER_TICK, CYLINDER_MAX_RADIUS);

            if (level instanceof ServerLevel server) {
                spawnServerCylinderParticles(server, ParticleTypes.POOF, SERVER_POOF_PER_TICK, this.currentRadius);
            } else {
                spawnClientCylinderParticles(level, ParticleTypes.POOF, CLIENT_POOF_PER_TICK, this.currentRadius, 0.01D, 0.01D);
            }
        }

        private void spawnServerCylinderParticles(ServerLevel server, ParticleOptions type, int count, double radius) {
            if (count <= 0 || radius <= 0.0D) {
                return;
            }
            for (int index = 0; index < count; ++index) {
<<<<<<< ours
                Vec3 spawnPos = this.cylinderBase.add(sampleCylinderOffset(this.random, radius, CYLINDER_HEIGHT));
=======
                Vec3 spawnPos = this.cylinderBase.add(sampleLogarithmicCylinderOffset(this.random, radius, CYLINDER_HEIGHT));
>>>>>>> theirs
                server.sendParticles(type, spawnPos.x, spawnPos.y, spawnPos.z, 1, 0.0D, 0.0D, 0.0D, 0.0D);
            }
        }

        private void spawnClientCylinderParticles(Level level, ParticleOptions type, int count, double radius, double baseSpeed, double speedRange) {
            if (count <= 0 || radius <= 0.0D) {
                return;
            }
            for (int index = 0; index < count; ++index) {
<<<<<<< ours
                Vec3 spawnPos = this.cylinderBase.add(sampleCylinderOffset(this.random, radius, CYLINDER_HEIGHT));
=======
                Vec3 spawnPos = this.cylinderBase.add(sampleLogarithmicCylinderOffset(this.random, radius, CYLINDER_HEIGHT));
>>>>>>> theirs
                double ySpeed = baseSpeed + this.random.nextDouble() * speedRange;
                level.addParticle(type, spawnPos.x, spawnPos.y, spawnPos.z, 0.0D, ySpeed, 0.0D);
            }
        }

        private boolean isFinished() {
            return this.ticksRemaining <= 0;
        }
    }
}
