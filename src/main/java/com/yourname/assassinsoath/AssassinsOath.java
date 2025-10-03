package com.yourname.assassinsoath;

import com.yourname.assassinsoath.event.BackstabHandler;
import com.yourname.assassinsoath.network.StealthChannel;
import com.yourname.assassinsoath.registry.ModCreativeTabs;
import com.yourname.assassinsoath.registry.ModEntityTypes;
import com.yourname.assassinsoath.registry.ModItems;
import com.yourname.assassinsoath.registry.ModParticleTypes;
import com.yourname.assassinsoath.registry.ModParticles;
import com.yourname.assassinsoath.registry.ModSoundEvents;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib.GeckoLib;

@Mod(AssassinsOath.MODID)
public final class AssassinsOath {
    public static final String MODID = "assassinsoath";

    public AssassinsOath(FMLJavaModLoadingContext context) {
        GeckoLib.initialize();
        IEventBus modBus = context.getModEventBus();
        ModItems.REGISTER.register(modBus);
        ModEntityTypes.REGISTER.register(modBus);
        ModParticles.PARTICLES.register(modBus);
        ModParticleTypes.PARTICLE_TYPES.register(modBus);
        ModSoundEvents.REGISTER.register(modBus);
        ModCreativeTabs.REGISTER.register(modBus);
        StealthChannel.register();
        MinecraftForge.EVENT_BUS.addListener(BackstabHandler::onDamage);
    }
}
