package com.yourname.assassinsoath.event;

import com.yourname.assassinsoath.AssassinsOath;
import com.yourname.assassinsoath.integration.epicfight.EpicFightIntegration;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AssassinsOath.MODID)
public final class BackstabHandler {
    private static final double DOT_THRESHOLD = -0.5D;

    private BackstabHandler() {
    }

    @SubscribeEvent
    public static void onDamage(LivingDamageEvent event) {
        Entity source = event.getSource().getEntity();
        if (!(source instanceof Player attacker)) {
            return;
        }
        if (!EpicFightIntegration.hasBackstabSkill(attacker)) {
            return;
        }
        LivingEntity target = event.getEntity();
        if (!isBehind(attacker, target)) {
            return;
        }
        event.setAmount(event.getAmount() * 1.5f);
        spawnBackstabFx(attacker, target);
    }

    private static boolean isBehind(Player attacker, LivingEntity target) {
        Vec3 targetLook = target.getViewVector(1.0F).normalize();
        Vec3 toAttacker = attacker.position().subtract(target.position()).normalize();
        return targetLook.dot(toAttacker) < DOT_THRESHOLD;
    }

    private static void spawnBackstabFx(Player attacker, LivingEntity target) {
        Level level = target.level();
        if (!(level instanceof ServerLevel serverLevel)) {
            return;
        }
        Vec3 center = target.position().add(0.0, target.getEyeHeight(), 0.0);
        Vec3 forward = attacker.getLookAngle().normalize().scale(0.2);
        serverLevel.sendParticles(ParticleTypes.CRIT, center.x, center.y, center.z, 20, 0.25, 0.15, 0.15, 0.15);
        serverLevel.sendParticles(ParticleTypes.CRIT, center.x, center.y, center.z, 8, forward.x, 0.0, forward.z, 0.0);
        serverLevel.playSound(null, target.blockPosition(), SoundEvents.PLAYER_ATTACK_CRIT, SoundSource.PLAYERS, 1.2f, 2.0f);
    }
}
