package com.yourname.assassinsoath.registry;

import com.yourname.assassinsoath.AssassinsOath;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> REGISTER =
            DeferredRegister.create(Registries.SOUND_EVENT, AssassinsOath.MODID);

    public static final RegistryObject<SoundEvent> SMOKE_BOMB_USE =
            REGISTER.register("smoke_bomb.use", () -> SoundEvent.createVariableRangeEvent(resource("smoke_bomb.use")));

    public static final RegistryObject<SoundEvent> SMOKE_BOMB_CRACK =
            REGISTER.register("smoke_bomb.crack", () -> SoundEvent.createVariableRangeEvent(resource("smoke_bomb.crack")));

    private ModSoundEvents() {
    }

    private static ResourceLocation resource(String path) {
        return new ResourceLocation(AssassinsOath.MODID, path);
    }
}
