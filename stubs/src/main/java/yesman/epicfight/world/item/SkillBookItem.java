package yesman.epicfight.world.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import yesman.epicfight.skill.Skill;

public class SkillBookItem extends Item {
    public SkillBookItem(Properties properties) {
        super(properties);
    }

    public static void setContainingSkill(Skill skill, ItemStack stack) {
        // stub - no-op
    }

    public static void setContainingSkill(String skillName, ItemStack stack) {
        // stub - no-op
    }
}
