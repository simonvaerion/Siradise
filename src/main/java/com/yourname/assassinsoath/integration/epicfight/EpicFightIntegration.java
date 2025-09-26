package com.yourname.assassinsoath.integration.epicfight;

import com.mojang.logging.LogUtils;
import com.yourname.assassinsoath.AssassinsOath;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import yesman.epicfight.api.forgeevent.SkillBuildEvent;
import yesman.epicfight.skill.Skill;
import yesman.epicfight.skill.passive.PassiveSkill;

@Mod.EventBusSubscriber(modid = AssassinsOath.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class EpicFightIntegration {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final AtomicBoolean LOGGED_CAPABILITY_MISSING = new AtomicBoolean(false);
    @SuppressWarnings("unchecked")
    private static final Capability<Object> SKILL_CAPABILITY;
    private static final Method HAS_LEARNED_METHOD;

    static {
        Capability<Object> capability = null;
        Method hasLearned = null;

        try {
            Class<?> capabilitiesClass = Class.forName("yesman.epicfight.world.capabilities.EpicFightCapabilities");
            Field capabilityField = capabilitiesClass.getField("CAPABILITY_SKILL");
            Object capabilityValue = capabilityField.get(null);
            if (capabilityValue instanceof Capability<?>) {
                capability = (Capability<Object>) capabilityValue;
            }

            Class<?> capabilityClass = Class.forName("yesman.epicfight.world.capabilities.SkillCapability");
            Class<?> skillClass = Class.forName("yesman.epicfight.skill.Skill");
            hasLearned = capabilityClass.getMethod("hasLearned", skillClass);
        } catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException | NoSuchMethodException exception) {
            LOGGER.debug("Epic Fight skill capability unavailable: {}", exception.toString());
        }

        SKILL_CAPABILITY = capability;
        HAS_LEARNED_METHOD = hasLearned;
    }

    public static PassiveSkill BACKSTAB_MASTERY;

    private EpicFightIntegration() {
    }

    @SubscribeEvent
    public static void onSkillBuild(SkillBuildEvent event) {
        SkillBuildEvent.ModRegistryWorker worker = event.createRegistryWorker(AssassinsOath.MODID);
        BACKSTAB_MASTERY = worker.build("backstab_mastery", BackstabPassiveSkill::new, PassiveSkill.createPassiveBuilder());
    }

    public static boolean hasBackstabSkill(Player player) {
        if (BACKSTAB_MASTERY == null || SKILL_CAPABILITY == null || HAS_LEARNED_METHOD == null) {
            if (SKILL_CAPABILITY == null && LOGGED_CAPABILITY_MISSING.compareAndSet(false, true)) {
                LOGGER.warn("Epic Fight skill capability is unavailable; backstab checks will be skipped");
            }
            return false;
        }
        return player.getCapability(SKILL_CAPABILITY)
                .map(cap -> hasLearnedBackstab(cap, Objects.requireNonNull(BACKSTAB_MASTERY)))
                .orElse(false);
    }

    private static boolean hasLearnedBackstab(Object capabilityInstance, Skill skill) {
        try {
            Object result = HAS_LEARNED_METHOD.invoke(capabilityInstance, skill);
            return result instanceof Boolean && (Boolean) result;
        } catch (IllegalAccessException | InvocationTargetException exception) {
            LOGGER.debug("Failed to query Epic Fight capability: {}", exception.toString());
            return false;
        }
    }
}
