package com.yourname.assassinsoath.integration.epicfight;

import com.mojang.logging.LogUtils;
import com.yourname.assassinsoath.AssassinsOath;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import yesman.epicfight.api.forgeevent.SkillBuildEvent;
import yesman.epicfight.skill.Skill;
import yesman.epicfight.skill.passive.PassiveSkill;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

@Mod.EventBusSubscriber(modid = AssassinsOath.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class EpicFightIntegration {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final AtomicBoolean LOGGED_CAPABILITY_MISSING = new AtomicBoolean(false);
    private static final Capability<Object> SKILL_CAPABILITY;
    private static final Method HAS_LEARNED_METHOD;

    static {
        Capability<Object> capability = null;
        Method hasLearned = null;

        try {
            capability = resolveSkillCapability();
            Class<?> capabilityClass = tryLoadClass(
                    "yesman.epicfight.world.capabilities.SkillCapability",
                    "yesman.epicfight.world.capabilities.skill.CapabilitySkill");
            if (capabilityClass != null) {
                Class<?> skillClass = Class.forName("yesman.epicfight.skill.Skill");
                hasLearned = capabilityClass.getMethod("hasLearned", skillClass);
            } else {
                LOGGER.debug("Epic Fight skill capability class not found; disabling backstab integration");
            }
        } catch (ReflectiveOperationException | LinkageError exception) {
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
            if (LOGGED_CAPABILITY_MISSING.compareAndSet(false, true)) {
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

    @SuppressWarnings("unchecked")
    private static Capability<Object> resolveSkillCapability() throws ReflectiveOperationException {
        Class<?> capabilitiesClass = Class.forName("yesman.epicfight.world.capabilities.EpicFightCapabilities");
        Field capabilityField = capabilitiesClass.getField("CAPABILITY_SKILL");
        Object capabilityValue = capabilityField.get(null);
        if (capabilityValue instanceof Capability<?> cap) {
            return (Capability<Object>) cap;
        }
        return null;
    }

    private static Class<?> tryLoadClass(String... names) {
        for (String name : names) {
            try {
                return Class.forName(name);
            } catch (ClassNotFoundException | LinkageError exception) {
                LOGGER.debug("Epic Fight class {} unavailable: {}", name, exception.toString());
            }
        }
        return null;
    }
}
