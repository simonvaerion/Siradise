package com.yourname.assassinsoath.registry;

import com.mojang.logging.LogUtils;
import com.yourname.assassinsoath.AssassinsOath;
import com.yourname.assassinsoath.integration.epicfight.EpicFightIntegration;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;
import yesman.epicfight.skill.Skill;
import yesman.epicfight.world.item.SkillBookItem;

public final class ModCreativeTabs {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final ResourceLocation EPIC_FIGHT_SKILLBOOK = new ResourceLocation("epicfight", "skillbook");
    private static final ResourceLocation BACKSTAB_SKILL = new ResourceLocation(AssassinsOath.MODID, "backstab_mastery");

    public static final DeferredRegister<CreativeModeTab> REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AssassinsOath.MODID);

    public static final RegistryObject<CreativeModeTab> MAIN = REGISTER.register("main", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.SMOKE_BOMB.get()))
            .title(Component.translatable("itemGroup.assassinsoath.main"))
            .displayItems((parameters, output) -> {
                output.accept(new ItemStack(ModItems.SMOKE_BOMB.get()));
                output.accept(new ItemStack(ModItems.RONIN_HAT.get()));
                ItemStack backstab = createBackstabBook();
                if (!backstab.isEmpty()) {
                    output.accept(backstab);
                }
            })
            .build());

    private ModCreativeTabs() {
    }

    private static ItemStack createBackstabBook() {
        Item skillBookItem = ForgeRegistries.ITEMS.getValue(EPIC_FIGHT_SKILLBOOK);
        if (skillBookItem == null) {
            return ItemStack.EMPTY;
        }
        try {
            ItemStack stack = new ItemStack(skillBookItem);
            applyBackstabSkill(stack);
            return stack;
        } catch (RuntimeException | LinkageError exception) {
            LOGGER.warn("Failed to configure Epic Fight skillbook for creative tab: {}", exception.toString());
            return ItemStack.EMPTY;
        }
    }

    private static void applyBackstabSkill(ItemStack stack) {
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
