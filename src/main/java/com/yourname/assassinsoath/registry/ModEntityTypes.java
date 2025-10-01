package com.yourname.assassinsoath.registry;

import com.yourname.assassinsoath.AssassinsOath;
import com.yourname.assassinsoath.entity.SmokeBombProjectile;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> REGISTER =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AssassinsOath.MODID);

    public static final RegistryObject<EntityType<SmokeBombProjectile>> SMOKE_BOMB = REGISTER.register("smoke_bomb",
            () -> EntityType.Builder.<SmokeBombProjectile>of(SmokeBombProjectile::new, MobCategory.MISC)
                    .sized(0.25F, 0.25F)
                    .clientTrackingRange(4)
                    .updateInterval(10)
                    .build(new ResourceLocation(AssassinsOath.MODID, "smoke_bomb").toString()));

    private ModEntityTypes() {
    }
}