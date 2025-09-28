package com.yourname.assassinsoath.item;

import com.yourname.assassinsoath.AssassinsOath;
import com.yourname.assassinsoath.integration.epicfight.EpicFightIntegration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;
import yesman.epicfight.skill.Skill;
import yesman.epicfight.world.item.SkillBookItem;

public final class BackstabSkillBooks {
    private static final ResourceLocation EPIC_FIGHT_SKILLBOOK = new ResourceLocation("epicfight", "skillbook");
    private static final ResourceLocation BACKSTAB_SKILL = new ResourceLocation(AssassinsOath.MODID, "backstab_mastery");

    private BackstabSkillBooks() {
    }

    public static ItemStack createBook() {
        Item skillBookItem = ForgeRegistries.ITEMS.getValue(EPIC_FIGHT_SKILLBOOK);
        if (skillBookItem == null) {
            return ItemStack.EMPTY;
        }
        ItemStack stack = new ItemStack(skillBookItem);
        applyBackstabSkill(stack);
        return stack;
    }

    public static void applyBackstabSkill(ItemStack stack) {
        if (stack.isEmpty()) {
            return;
        }
        SkillBookItem.setContainingSkill(BACKSTAB_SKILL.toString(), stack);
        Skill skill = EpicFightIntegration.BACKSTAB_MASTERY;
        if (skill != null) {
            SkillBookItem.setContainingSkill(skill, stack);
        }
    }
}
