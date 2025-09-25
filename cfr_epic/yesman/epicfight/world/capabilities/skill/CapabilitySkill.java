/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.nbt.Tag
 *  org.jetbrains.annotations.ApiStatus$Internal
 *  yesman.epicfight.api.data.reloader.SkillManager
 *  yesman.epicfight.skill.Skill
 *  yesman.epicfight.skill.SkillCategory
 *  yesman.epicfight.skill.SkillContainer
 *  yesman.epicfight.skill.SkillSlot
 *  yesman.epicfight.world.capabilities.entitypatch.player.PlayerPatch
 *  yesman.epicfight.world.capabilities.entitypatch.player.PlayerPatch$PlayerMode
 */
package yesman.epicfight.world.capabilities.skill;

import com.google.common.collect.HashMultimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import org.jetbrains.annotations.ApiStatus;
import yesman.epicfight.api.data.reloader.SkillManager;
import yesman.epicfight.skill.Skill;
import yesman.epicfight.skill.SkillCategory;
import yesman.epicfight.skill.SkillContainer;
import yesman.epicfight.skill.SkillSlot;
import yesman.epicfight.world.capabilities.entitypatch.player.PlayerPatch;

public class CapabilitySkill {
  public static final CapabilitySkill EMPTY = new CapabilitySkill(null);
  public final SkillContainer[] skillContainers;
  private final Map<Skill, SkillContainer> containersBySkill = new HashMap<Skill, SkillContainer>();
  private final HashMultimap<SkillCategory, SkillContainer> containersByCategory =
      HashMultimap.create();
  private final HashMultimap<SkillCategory, Skill> learnedSkills = HashMultimap.create();

  public CapabilitySkill(PlayerPatch<?> playerpatch) {
    Collection slots = SkillSlot.ENUM_MANAGER.universalValues();
    this.skillContainers = new SkillContainer[slots.size()];
    for (SkillSlot slot : slots) {
      SkillContainer skillContainer;
      this.skillContainers[slot.universalOrdinal()] =
          skillContainer = new SkillContainer(playerpatch, slot);
      this.containersByCategory.put((Object) slot.category(), (Object) skillContainer);
    }
  }

  public void addLearnedSkill(Skill skill) {
    SkillCategory category = skill.getCategory();
    if (!this.learnedSkills.containsKey((Object) category)
        || !this.learnedSkills.get((Object) category).contains(skill)) {
      this.learnedSkills.put((Object) category, (Object) skill);
    }
  }

  public boolean removeLearnedSkill(Skill skill) {
    SkillCategory category = skill.getCategory();
    if (this.learnedSkills.containsKey((Object) category)
        && this.learnedSkills.remove((Object) category, (Object) skill)) {
      if (this.learnedSkills.get((Object) category).isEmpty()) {
        this.learnedSkills.removeAll((Object) category);
      }
      return true;
    }
    return false;
  }

  public boolean hasCategory(SkillCategory skillCategory) {
    return this.learnedSkills.containsKey((Object) skillCategory);
  }

  public boolean isEquipping(Skill skill) {
    return this.containersBySkill.containsKey(skill);
  }

  public boolean hasLearned(Skill skill) {
    return this.learnedSkills.get((Object) skill.getCategory()).contains(skill);
  }

  public Set<SkillContainer> getSkillContainersFor(SkillCategory skillCategory) {
    return this.containersByCategory.get((Object) skillCategory);
  }

  public SkillContainer getSkillContainerFor(SkillSlot skillSlot) {
    return this.getSkillContainerFor(skillSlot.universalOrdinal());
  }

  public SkillContainer getSkillContainerFor(int slotIndex) {
    return this.skillContainers[slotIndex];
  }

  @ApiStatus.Internal
  public void setSkillToContainer(Skill skill, SkillContainer container) {
    this.containersBySkill.put(skill, container);
  }

  @ApiStatus.Internal
  public void removeSkillFromContainer(Skill skill) {
    this.containersBySkill.remove(skill);
  }

  public SkillContainer getSkillContainer(Skill skill) {
    return this.containersBySkill.get(skill);
  }

  public Stream<SkillContainer> listSkillContainers() {
    return Stream.of(this.skillContainers);
  }

  public Stream<Skill> listAcquiredSkills() {
    return this.learnedSkills.values().stream();
  }

  public void clearContainersAndLearnedSkills() {
    for (SkillContainer container : this.skillContainers) {
      if (!container.getSlot().category().learnable()) continue;
      container.setSkill(null);
    }
    this.learnedSkills.clear();
  }

  public void copyFrom(CapabilitySkill capabilitySkill) {
    int i = 0;
    for (SkillContainer container : this.skillContainers) {
      Skill oldone = capabilitySkill.skillContainers[i].getSkill();
      if (oldone != null && oldone.getCategory().shouldSynchronize()) {
        container.setSkill(capabilitySkill.skillContainers[i].getSkill());
      }
      ++i;
    }
    this.learnedSkills.putAll(capabilitySkill.learnedSkills);
  }

  public CompoundTag serialize() {
    CompoundTag nbt = new CompoundTag();
    for (SkillContainer container : this.skillContainers) {
      if (container.getSkill() == null || !container.getSkill().getCategory().shouldSave())
        continue;
      nbt.m_128359_(
          container.getSlot().toString().toLowerCase(Locale.ROOT), container.getSkill().toString());
    }
    for (Map.Entry entry : this.learnedSkills.asMap().entrySet()) {
      CompoundTag learnedNBT = new CompoundTag();
      int i = 0;
      for (Skill skill : (Collection) entry.getValue()) {
        learnedNBT.m_128359_(String.valueOf(i++), skill.toString());
      }
      nbt.m_128365_(
          "learned:" + ((SkillCategory) entry.getKey()).toString().toLowerCase(Locale.ROOT),
          (Tag) learnedNBT);
    }
    nbt.m_128359_("playerMode", this.skillContainers[0].getExecutor().getPlayerMode().toString());
    return nbt;
  }

  public void deserialize(CompoundTag compound) {
    Skill skill;
    for (SkillContainer container : this.skillContainers) {
      String key = container.getSlot().toString().toLowerCase(Locale.ROOT);
      if (!compound.m_128441_(key)
          || (skill = SkillManager.getSkill((String) compound.m_128461_(key))) == null) continue;
      container.setSkill(skill);
      this.addLearnedSkill(skill);
    }
    for (SkillCategory category : SkillCategory.ENUM_MANAGER.universalValues()) {
      if (!compound.m_128441_("learned:" + category.toString().toLowerCase(Locale.ROOT))) continue;
      CompoundTag learnedNBT =
          compound.m_128469_("learned:" + category.toString().toLowerCase(Locale.ROOT));
      for (String key : learnedNBT.m_128431_()) {
        skill = SkillManager.getSkill((String) learnedNBT.m_128461_(key));
        if (skill == null) continue;
        this.addLearnedSkill(skill);
      }
    }
    if (compound.m_128441_("playerMode")) {
      String playerMode = compound.m_128461_("playerMode");
      if ("MINING".equals(playerMode)) {
        playerMode = "VANILLA";
      } else if ("BATTLE".equals(playerMode)) {
        playerMode = "EPICFIGHT";
      }
      this.skillContainers[0]
          .getExecutor()
          .toMode(
              PlayerPatch.PlayerMode.valueOf((String) playerMode.toUpperCase(Locale.ROOT)), true);
    } else {
      this.skillContainers[0].getExecutor().toEpicFightMode(true);
    }
  }
}
