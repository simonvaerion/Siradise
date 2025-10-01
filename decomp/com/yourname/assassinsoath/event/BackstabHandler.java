/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.ParticleTypes
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.sounds.SoundEvents
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.event.entity.living.LivingDamageEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 */
package com.yourname.assassinsoath.event;

import com.yourname.assassinsoath.integration.epicfight.EpicFightIntegration;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid="assassinsoath")
public class BackstabHandler {
    @SubscribeEvent
    public static void onDamage(LivingDamageEvent event) {
        Entity entity = event.getSource().m_7639_();
        if (!(entity instanceof Player)) {
            return;
        }
        Player attacker = (Player)entity;
        if (!EpicFightIntegration.hasBackstabSkill(attacker)) {
            return;
        }
        LivingEntity target = event.getEntity();
        if (BackstabHandler.isBehind(attacker, target)) {
            event.setAmount(event.getAmount() * 1.5f);
            BackstabHandler.spawnBackstabFx(attacker, target);
        }
    }

    private static boolean isBehind(Player attacker, LivingEntity target) {
        Vec3 toAttacker;
        Vec3 targetLook = target.m_20252_(1.0f).m_82541_();
        return targetLook.m_82526_(toAttacker = attacker.m_20182_().m_82546_(target.m_20182_()).m_82541_()) < -0.5;
    }

    private static void spawnBackstabFx(Player attacker, LivingEntity target) {
        Level level = target.m_9236_();
        if (level.f_46443_) {
            return;
        }
        ServerLevel s = (ServerLevel)level;
        Vec3 pos = target.m_20182_().m_82520_(0.0, (double)target.m_20206_() * 0.6, 0.0);
        Vec3 dir = attacker.m_20154_().m_82541_().m_82490_(0.2);
        s.m_8767_((ParticleOptions)ParticleTypes.f_123797_, pos.f_82479_, pos.f_82480_, pos.f_82481_, 20, 0.25, 0.15, 0.15, 0.15);
        s.m_8767_((ParticleOptions)ParticleTypes.f_123797_, pos.f_82479_, pos.f_82480_, pos.f_82481_, 8, dir.f_82479_, 0.0, dir.f_82481_, 0.0);
        s.m_5594_(null, target.m_20183_(), SoundEvents.f_12313_, SoundSource.PLAYERS, 1.2f, 2.0f);
    }
}

