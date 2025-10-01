/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.eventbus.api.IEventBus
 *  net.minecraftforge.fml.common.Mod
 *  net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
 */
package com.yourname.assassinsoath;

import com.yourname.assassinsoath.event.BackstabHandler;
import com.yourname.assassinsoath.network.StealthChannel;
import com.yourname.assassinsoath.registry.ModCreativeTabs;
import com.yourname.assassinsoath.registry.ModItems;
import com.yourname.assassinsoath.registry.ModParticles;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value="assassinsoath")
public class AssassinsOath {
    public static final String MODID = "assassinsoath";

    public AssassinsOath(FMLJavaModLoadingContext context) {
        IEventBus modBus = context.getModEventBus();
        ModItems.REGISTER.register(modBus);
        ModParticles.PARTICLES.register(modBus);
        ModCreativeTabs.REGISTER.register(modBus);
        StealthChannel.register();
        MinecraftForge.EVENT_BUS.addListener(BackstabHandler::onDamage);
    }
}

