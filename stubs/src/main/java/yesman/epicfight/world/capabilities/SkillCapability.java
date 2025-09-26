package yesman.epicfight.world.capabilities;

import yesman.epicfight.skill.Skill;

public interface SkillCapability {
    boolean hasLearned(Skill skill);
}
