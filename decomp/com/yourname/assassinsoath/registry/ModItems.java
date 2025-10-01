/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package com.yourname.assassinsoath.registry;

import com.yourname.assassinsoath.item.SmokeBombItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create((IForgeRegistry)ForgeRegistries.ITEMS, (String)"assassinsoath");
    public static final RegistryObject<Item> SMOKE_BOMB = REGISTER.register("smoke_bomb", () -> new SmokeBombItem(new Item.Properties().m_41487_(16)));
}

