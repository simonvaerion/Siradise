package com.yourname.assassinsoath.event;

import com.yourname.assassinsoath.AssassinsOath;
import com.yourname.assassinsoath.ai.StealthAwarenessTracker;
import com.yourname.assassinsoath.network.S2CMobAwareness;
import com.yourname.assassinsoath.network.StealthChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.network.PacketDistributor;

@Mod.EventBusSubscriber(modid = AssassinsOath.MODID)
public final class StealthSoundEvents {
  private StealthSoundEvents() {}

  private static final Map<UUID, Integer> STEP_COOLDOWN = new HashMap<>();

  @SubscribeEvent
  public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
    if (event.phase != TickEvent.Phase.END) return;
    Player player = event.player;
    Level level = player.level();
    if (level.isClientSide || player.isSpectator()) return;

    UUID id = player.getUUID();
    STEP_COOLDOWN.computeIfPresent(id, (uuid, cd) -> cd > 0 ? cd - 1 : null);

    if (!player.onGround() || player.isSteppingCarefully()) return;
    double speedSq = player.getDeltaMovement().horizontalDistanceSqr();
    if (speedSq < 0.01) return;

    int cd = STEP_COOLDOWN.getOrDefault(id, 0);
    if (cd > 0) return;

    float intensity = player.isSprinting() ? 0.6f : 0.4f;
    emitNoise((ServerLevel) level, player, 14.0, intensity);
    STEP_COOLDOWN.put(id, player.isSprinting() ? 6 : 10);
  }

  @SubscribeEvent
  public static void onPlayerFall(LivingFallEvent event) {
    if (!(event.getEntity() instanceof Player player)) return;
    Level level = player.level();
    if (level.isClientSide || player.isSpectator()) return;

    float fallDistance = event.getDistance();
    if (fallDistance < 2.0f) return;

    float intensity = Mth.clamp(fallDistance / 4.0f, 0.6f, 1.0f);
    double radius = Mth.clamp(8.0 + fallDistance * 2.0, 12.0, 24.0);
    emitNoise((ServerLevel) level, player, radius, intensity);
  }

  private static void emitNoise(
      ServerLevel level, Player player, double radius, float baseIntensity) {
    Vec3 origin = player.position();
    AABB box = new AABB(origin, origin).inflate(radius);
    List<Mob> mobs =
        level.getEntitiesOfClass(Mob.class, box, mob -> mob.isAlive() && !mob.isAlliedTo(player));

    for (Mob mob : mobs) {
      double distance = Math.sqrt(mob.distanceToSqr(origin));
      if (distance > radius) continue;
      float falloff = 1.0f - (float) (distance / radius);
      if (falloff <= 0f) continue;

      float detection = baseIntensity * falloff + 0.2f;
      detection = Mth.clamp(detection, 0f, 1f);
      if (detection < 0.25f) continue;

      StealthAwarenessTracker.addNoise(mob, player, origin, detection);
      StealthAwarenessTracker.get(mob)
          .ifPresent(
              state ->
                  StealthChannel.CHANNEL.send(
                      PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> mob),
                      new S2CMobAwareness(mob.getId(), state.detection(), state.stage())));
    }
  }
}
