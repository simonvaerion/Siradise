/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.util.Mth
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.event.TickEvent$Phase
 *  net.minecraftforge.event.TickEvent$PlayerTickEvent
 *  net.minecraftforge.event.entity.living.LivingFallEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.network.PacketDistributor
 */
package com.yourname.assassinsoath.event;

import com.yourname.assassinsoath.ai.StealthAwarenessTracker;
import com.yourname.assassinsoath.network.S2CMobAwareness;
import com.yourname.assassinsoath.network.StealthChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
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

@Mod.EventBusSubscriber(modid="assassinsoath")
public final class StealthSoundEvents {
    private static final Map<UUID, Integer> STEP_COOLDOWN = new HashMap<UUID, Integer>();

    private StealthSoundEvents() {
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) {
            return;
        }
        Player player = event.player;
        Level level = player.m_9236_();
        if (level.f_46443_ || player.m_5833_()) {
            return;
        }
        UUID id = player.m_20148_();
        STEP_COOLDOWN.computeIfPresent(id, (uuid, cd) -> cd > 0 ? Integer.valueOf(cd - 1) : null);
        if (!player.m_20096_() || player.m_20161_()) {
            return;
        }
        double speedSq = player.m_20184_().m_165925_();
        if (speedSq < 0.01) {
            return;
        }
        int cd2 = STEP_COOLDOWN.getOrDefault(id, 0);
        if (cd2 > 0) {
            return;
        }
        float intensity = player.m_20142_() ? 0.6f : 0.4f;
        StealthSoundEvents.emitNoise((ServerLevel)level, player, 14.0, intensity);
        STEP_COOLDOWN.put(id, player.m_20142_() ? 6 : 10);
    }

    @SubscribeEvent
    public static void onPlayerFall(LivingFallEvent event) {
        LivingEntity livingEntity = event.getEntity();
        if (!(livingEntity instanceof Player)) {
            return;
        }
        Player player = (Player)livingEntity;
        Level level = player.m_9236_();
        if (level.f_46443_ || player.m_5833_()) {
            return;
        }
        float fallDistance = event.getDistance();
        if (fallDistance < 2.0f) {
            return;
        }
        float intensity = Mth.m_14036_((float)(fallDistance / 4.0f), (float)0.6f, (float)1.0f);
        double radius = Mth.m_14008_((double)(8.0 + (double)fallDistance * 2.0), (double)12.0, (double)24.0);
        StealthSoundEvents.emitNoise((ServerLevel)level, player, radius, intensity);
    }

    private static void emitNoise(ServerLevel level, Player player, double radius, float baseIntensity) {
        Vec3 origin = player.m_20182_();
        AABB box = new AABB(origin, origin).m_82400_(radius);
        List mobs = level.m_6443_(Mob.class, box, mob -> mob.m_6084_() && !mob.m_7307_((Entity)player));
        for (Mob mob2 : mobs) {
            float falloff;
            double distance = Math.sqrt(mob2.m_20238_(origin));
            if (distance > radius || (falloff = 1.0f - (float)(distance / radius)) <= 0.0f) continue;
            float detection = baseIntensity * falloff + 0.2f;
            if ((detection = Mth.m_14036_((float)detection, (float)0.0f, (float)1.0f)) < 0.25f) continue;
            StealthAwarenessTracker.addNoise(mob2, player, origin, detection);
            StealthAwarenessTracker.get(mob2).ifPresent(state -> StealthChannel.CHANNEL.send(PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> mob2), (Object)new S2CMobAwareness(mob2.m_19879_(), state.detection(), state.stage())));
        }
    }
}

