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
import org.jetbrains.annotations.NotNull;

public class BackstabSkillBookItem extends SkillBookItem {
    private static final ResourceLocation BACKSTAB_SKILL = ResourceLocation.fromNamespaceAndPath(
            AssassinsOath.MODID, "backstab_mastery");

    public BackstabSkillBookItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull ItemStack getDefaultInstance() {
        return ensureSkill(super.getDefaultInstance());
    }

    @Override
    public void inventoryTick(@NotNull ItemStack stack, @NotNull Level level, @NotNull Entity entity,
                              int slotId, boolean isSelected) {
        ensureSkill(stack);
        super.inventoryTick(stack, level, entity, slotId, isSelected);
    }

    @Override
    public void onCraftedBy(@NotNull ItemStack stack, @NotNull Level level, @NotNull Player player) {
        ensureSkill(stack);
        super.onCraftedBy(stack, level, player);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, @NotNull Player player,
                                                           @NotNull InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        ensureSkill(stack);
        return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level,
                                @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        ensureSkill(stack);
        super.appendHoverText(stack, level, tooltip, flag);
    }

    private static ItemStack ensureSkill(ItemStack stack) {
        if (stack.isEmpty()) {
            return stack;
        }
        Skill skill = EpicFightIntegration.BACKSTAB_MASTERY;
        if (skill != null) {
            SkillBookItem.setContainingSkill(skill, stack);
        } else {
            SkillBookItem.setContainingSkill(BACKSTAB_SKILL.toString(), stack);
        }
        return stack;
    }
}
