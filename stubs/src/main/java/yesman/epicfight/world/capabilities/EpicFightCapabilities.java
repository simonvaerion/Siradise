package yesman.epicfight.world.capabilities;

import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;

import yesman.epicfight.world.capabilities.SkillCapability;

public final class EpicFightCapabilities {
    private EpicFightCapabilities() {
    }

    public static final Capability<SkillCapability> CAPABILITY_SKILL = CapabilityManager.get(new CapabilityToken<>() {
    });
}
