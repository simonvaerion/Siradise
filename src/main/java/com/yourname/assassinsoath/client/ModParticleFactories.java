package com.yourname.assassinsoath.client;

import com.yourname.assassinsoath.AssassinsOath;
import com.yourname.assassinsoath.client.particle.SmokeBombParticle;
import com.yourname.assassinsoath.client.particle.SmokePuffParticle;
import com.yourname.assassinsoath.registry.ModParticleTypes;
import com.yourname.assassinsoath.registry.ModParticles;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AssassinsOath.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ModParticleFactories {
    private ModParticleFactories() {
    }

    @SubscribeEvent
    public static void registerFactories(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ModParticles.SMOKE_PUFF.get(), SmokePuffParticle.Provider::new);
        event.registerSpriteSet(ModParticleTypes.SMOKE_BOMB.get(), SmokeBombParticle.Provider::new);
    }
}
