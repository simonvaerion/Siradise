package com.yourname.assassinsoath.registry;

import com.yourname.assassinsoath.AssassinsOath;
import com.yourname.assassinsoath.item.BackstabSkillBookItem;
import com.yourname.assassinsoath.item.SmokeBombItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, AssassinsOath.MODID);

    public static final RegistryObject<Item> SMOKE_BOMB = REGISTER.register("smoke_bomb",
            () -> new SmokeBombItem(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BACKSTAB_SKILL_BOOK = REGISTER.register("backstab_skill_book",
            () -> new BackstabSkillBookItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    private ModItems() {
    }
}
