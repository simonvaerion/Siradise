/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.eventbus.api.GenericEvent
 *  net.minecraftforge.fml.ModLoader
 *  net.minecraftforge.fml.event.IModBusEvent
 *  yesman.epicfight.skill.Skill
 *  yesman.epicfight.skill.SkillBuilder
 */
package yesman.epicfight.api.forgeevent;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.GenericEvent;
import net.minecraftforge.fml.ModLoader;
import net.minecraftforge.fml.event.IModBusEvent;
import yesman.epicfight.skill.Skill;
import yesman.epicfight.skill.SkillBuilder;

public class SkillBuildEvent extends Event implements IModBusEvent {
  private final List<ModRegistryWorker> modRegisterWorkers = Lists.newArrayList();

  public ModRegistryWorker createRegistryWorker(String modid) {
    ModRegistryWorker modRegisterWorker = new ModRegistryWorker(modid);
    this.modRegisterWorkers.add(modRegisterWorker);
    return modRegisterWorker;
  }

  public Set<String> getNamespaces() {
    return this.modRegisterWorkers.stream().map(worker -> worker.modid).collect(Collectors.toSet());
  }

  public List<Skill> getAllSkills() {
    ArrayList skills = Lists.newArrayList();
    this.modRegisterWorkers.forEach(registryWorker -> skills.addAll(registryWorker.modSkills));
    return skills;
  }

  public static class ModRegistryWorker {
    private final String modid;
    private final List<Skill> modSkills = Lists.newArrayList();

    private ModRegistryWorker(String modid) {
      this.modid = modid;
    }

    public <S extends Skill, B extends SkillBuilder<S>> S build(
        String name, Function<B, S> constructor, B builder) {
      ResourceLocation registryName =
          ResourceLocation.fromNamespaceAndPath((String) this.modid, (String) name);
      builder.setRegistryName(registryName);
      SkillCreateEvent skillCreateEvent = new SkillCreateEvent(this, registryName, builder);
      ModLoader.get().postEvent((Event) skillCreateEvent);
      Skill skill = (Skill) constructor.apply(builder);
      this.modSkills.add(skill);
      return (S) skill;
    }

    public static class SkillCreateEvent<B extends SkillBuilder<?>> extends GenericEvent<B>
        implements IModBusEvent {
      private final ResourceLocation registryName;
      private final B skillBuilder;
      final /* synthetic */ ModRegistryWorker this$0;

      private SkillCreateEvent(ResourceLocation registryName, B skillBuilder) {
        this.this$0 = this$0;
        super(skillBuilder.getClass());
        this.registryName = registryName;
        this.skillBuilder = skillBuilder;
      }

      public ResourceLocation getRegistryName() {
        return this.registryName;
      }

      public B getSkillBuilder() {
        return this.skillBuilder;
      }
    }
  }
}
