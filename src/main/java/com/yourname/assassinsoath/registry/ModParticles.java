package com.yourname.assassinsoath.registry;

import com.yourname.assassinsoath.AssassinsOath;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLES =
            DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, AssassinsOath.MODID);

    public static final RegistryObject<SimpleParticleType> BLOOD_SPLASH =
            PARTICLES.register("blood_splash", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> SMOKE_PUFF =
            PARTICLES.register("smoke_puff", () -> new SimpleParticleType(true));

    private ModParticles() {
    }
}

