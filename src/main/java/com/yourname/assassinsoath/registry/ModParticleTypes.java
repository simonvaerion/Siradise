package com.yourname.assassinsoath.registry;

import com.yourname.assassinsoath.AssassinsOath;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModParticleTypes {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, AssassinsOath.MODID);

    public static final RegistryObject<SimpleParticleType> SMOKE_BOMB =
            PARTICLE_TYPES.register("smoke_bomb", () -> new SimpleParticleType(true));

    private ModParticleTypes() {
    }
}
