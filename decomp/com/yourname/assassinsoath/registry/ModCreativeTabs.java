/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.network.chat.Component
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.world.item.CreativeModeTab
 *  net.minecraft.world.item.CreativeModeTab$Output
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.ItemLike
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.RegistryObject
 */
package com.yourname.assassinsoath.registry;

import com.yourname.assassinsoath.registry.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTER = DeferredRegister.create((ResourceKey)Registries.f_279569_, (String)"assassinsoath");
    public static final RegistryObject<CreativeModeTab> MAIN = REGISTER.register("main", () -> CreativeModeTab.builder().m_257737_(() -> new ItemStack((ItemLike)ModItems.SMOKE_BOMB.get())).m_257941_((Component)Component.m_237115_((String)"itemGroup.assassinsoath.main")).m_257501_((parameters, output) -> ModItems.REGISTER.getEntries().stream().map(RegistryObject::get).forEach(arg_0 -> ((CreativeModeTab.Output)output).m_246326_(arg_0))).m_257652_());

    private ModCreativeTabs() {
    }
}

