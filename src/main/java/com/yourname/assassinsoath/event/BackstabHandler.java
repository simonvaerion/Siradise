package com.yourname.assassinsoath.event;

import com.yourname.assassinsoath.AssassinsOath;
import com.yourname.assassinsoath.integration.epicfight.EpicFightIntegration;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AssassinsOath.MODID)
public class BackstabHandler {
  @SubscribeEvent
  public static void onDamage(LivingDamageEvent event) {
    if (!(event.getSource().getEntity() instanceof Player attacker)) return;
    if (!EpicFightIntegration.hasBackstabSkill(attacker)) return;
    LivingEntity target = event.getEntity();
    if (isBehind(attacker, target)) {
      event.setAmount(event.getAmount() * 1.5F);
      spawnBackstabFx(attacker, target);
    }
  }

  private static boolean isBehind(Player attacker, LivingEntity target) {
    Vec3 targetLook = target.getViewVector(1.0F).normalize();
    Vec3 toAttacker = attacker.position().subtract(target.position()).normalize();
    return targetLook.dot(toAttacker) < -0.5D; // 夾角>120度
  }

  private static void spawnBackstabFx(Player attacker, LivingEntity target) {
    Level level = target.level();
    if (level.isClientSide) return;
    ServerLevel s = (ServerLevel) level;

    Vec3 pos = target.position().add(0.0, target.getBbHeight() * 0.6, 0.0);
    Vec3 dir = attacker.getLookAngle().normalize().scale(0.2);

    s.sendParticles(ParticleTypes.CRIT, pos.x, pos.y, pos.z, 20, 0.25, 0.15, 0.15, 0.15);
    s.sendParticles(ParticleTypes.CRIT, pos.x, pos.y, pos.z, 8, dir.x, 0.0, dir.z, 0.0);

    s.playSound(
        null,
        target.blockPosition(),
        SoundEvents.PLAYER_ATTACK_CRIT,
        SoundSource.PLAYERS,
        1.2f,
        2f);
  }
}
