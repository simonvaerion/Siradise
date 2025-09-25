package com.yourname.assassinsoath.registry;

import com.yourname.assassinsoath.AssassinsOath;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ModCreativeTabs {
    private ModCreativeTabs() {
    }

    public static final DeferredRegister<CreativeModeTab> REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AssassinsOath.MODID);

    public static final RegistryObject<CreativeModeTab> MAIN = REGISTER.register("main", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.SMOKE_BOMB.get()))
            .title(Component.translatable("itemGroup.assassinsoath.main"))
            .displayItems((parameters, output) -> ModItems.REGISTER.getEntries().stream()
                    .map(RegistryObject::get)
                    .forEach(output::accept))
            .build());
}
