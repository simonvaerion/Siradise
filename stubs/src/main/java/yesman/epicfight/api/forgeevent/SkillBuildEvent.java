package yesman.epicfight.api.forgeevent;

import java.util.function.Function;
import net.minecraftforge.eventbus.api.Event;
import yesman.epicfight.skill.Skill;
import yesman.epicfight.skill.SkillBuilder;
import yesman.epicfight.skill.passive.PassiveSkill;

public class SkillBuildEvent extends Event {
    public ModRegistryWorker createRegistryWorker(String modId) {
        return new ModRegistryWorker();
    }

    public static final class ModRegistryWorker {
        public <T extends Skill> T build(String id,
                                         Function<? super SkillBuilder<T>, ? extends T> factory,
                                         SkillBuilder<T> builder) {
            return factory.apply(builder);
        }
    }
}
