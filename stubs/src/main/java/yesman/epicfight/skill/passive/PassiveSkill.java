package yesman.epicfight.skill.passive;

import yesman.epicfight.skill.Skill;
import yesman.epicfight.skill.SkillBuilder;

public class PassiveSkill extends Skill {
    public PassiveSkill(SkillBuilder<? extends PassiveSkill> builder) {
    }

    public static SkillBuilder<PassiveSkill> createPassiveBuilder() {
        return new SkillBuilder<>();
    }
}
