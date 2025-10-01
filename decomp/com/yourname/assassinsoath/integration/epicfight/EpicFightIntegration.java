/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.player.Player
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 *  yesman.epicfight.api.forgeevent.SkillBuildEvent
 *  yesman.epicfight.api.forgeevent.SkillBuildEvent$ModRegistryWorker
 *  yesman.epicfight.skill.Skill
 *  yesman.epicfight.skill.passive.PassiveSkill
 *  yesman.epicfight.world.capabilities.EpicFightCapabilities
 */
package com.yourname.assassinsoath.integration.epicfight;

import com.yourname.assassinsoath.integration.epicfight.BackstabPassiveSkill;
import java.util.Objects;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import yesman.epicfight.api.forgeevent.SkillBuildEvent;
import yesman.epicfight.skill.Skill;
import yesman.epicfight.skill.passive.PassiveSkill;
import yesman.epicfight.world.capabilities.EpicFightCapabilities;

@Mod.EventBusSubscriber(modid="assassinsoath", bus=Mod.EventBusSubscriber.Bus.MOD)
public final class EpicFightIntegration {
    public static PassiveSkill BACKSTAB_MASTERY;

    private EpicFightIntegration() {
    }

    @SubscribeEvent
    public static void onSkillBuild(SkillBuildEvent event) {
        SkillBuildEvent.ModRegistryWorker worker = event.createRegistryWorker("assassinsoath");
        BACKSTAB_MASTERY = (PassiveSkill)worker.build("backstab_mastery", BackstabPassiveSkill::new, PassiveSkill.createPassiveBuilder());
    }

    public static boolean hasBackstabSkill(Player player) {
        if (BACKSTAB_MASTERY == null) {
            return false;
        }
        return player.getCapability(EpicFightCapabilities.CAPABILITY_SKILL).map(cap -> cap.hasLearned((Skill)Objects.requireNonNull(BACKSTAB_MASTERY))).orElse(false);
    }
}

