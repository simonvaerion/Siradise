package com.yourname.assassinsoath.item;

import com.yourname.assassinsoath.AssassinsOath;
import com.yourname.assassinsoath.integration.epicfight.EpicFightIntegration;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import yesman.epicfight.skill.Skill;
import yesman.epicfight.world.item.SkillBookItem;

import java.util.List;
import javax.annotation.Nullable;

public class BackstabSkillBookItem extends SkillBookItem {
    private static final ResourceLocation BACKSTAB_SKILL = new ResourceLocation(AssassinsOath.MODID, "backstab_mastery");

    public BackstabSkillBookItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getDefaultInstance() {
        return ensureSkill(super.getDefaultInstance());
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        ensureSkill(stack);
        super.inventoryTick(stack, level, entity, slotId, isSelected);
    }

    @Override
    public void onCraftedBy(ItemStack stack, Level level, Player player) {
        ensureSkill(stack);
        super.onCraftedBy(stack, level, player);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        ensureSkill(stack);
        return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        ensureSkill(stack);
        super.appendHoverText(stack, level, tooltip, flag);
    }

    private static ItemStack ensureSkill(ItemStack stack) {
        if (stack.isEmpty()) {
            return stack;
        }
        // Always write the skill identifier so the item retains its binding even if Epic Fight
        // hasn't finished constructing the actual Skill instance on this side yet.
        SkillBookItem.setContainingSkill(BACKSTAB_SKILL.toString(), stack);

        Skill skill = EpicFightIntegration.BACKSTAB_MASTERY;
        if (skill != null) {
            SkillBookItem.setContainingSkill(skill, stack);
        }
        return stack;
    }
}
