/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 *  yesman.epicfight.api.client.animation.property.TrailInfo
 *  yesman.epicfight.api.client.animation.property.TrailInfo$Builder
 *  yesman.epicfight.api.utils.ExtendableEnum
 *  yesman.epicfight.gameasset.EpicFightSounds
 *  yesman.epicfight.skill.Skill
 *  yesman.epicfight.skill.Skill$Resource
 *  yesman.epicfight.skill.SkillBuilder
 *  yesman.epicfight.skill.SkillCategories
 *  yesman.epicfight.skill.SkillCategory
 *  yesman.epicfight.skill.SkillContainer
 *  yesman.epicfight.world.capabilities.entitypatch.EntityDecorations
 *  yesman.epicfight.world.capabilities.entitypatch.EntityDecorations$AnimationPropertyModifier
 *  yesman.epicfight.world.capabilities.item.CapabilityItem
 *  yesman.epicfight.world.capabilities.item.CapabilityItem$WeaponCategories
 *  yesman.epicfight.world.capabilities.item.WeaponCategory
 *  yesman.epicfight.world.entity.eventlistener.PlayerEventListener$EventType
 */
package yesman.epicfight.skill.passive;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import yesman.epicfight.api.client.animation.property.TrailInfo;
import yesman.epicfight.api.utils.ExtendableEnum;
import yesman.epicfight.gameasset.EpicFightSounds;
import yesman.epicfight.skill.Skill;
import yesman.epicfight.skill.SkillBuilder;
import yesman.epicfight.skill.SkillCategories;
import yesman.epicfight.skill.SkillCategory;
import yesman.epicfight.skill.SkillContainer;
import yesman.epicfight.world.capabilities.entitypatch.EntityDecorations;
import yesman.epicfight.world.capabilities.item.CapabilityItem;
import yesman.epicfight.world.capabilities.item.WeaponCategory;
import yesman.epicfight.world.entity.eventlistener.PlayerEventListener;

public class SwordmasterSkill extends PassiveSkill {
  private static final UUID EVENT_UUID = UUID.fromString("a395b692-fd97-11eb-9a03-0242ac130003");
  private float speedBonus;
  private Set<WeaponCategory> availableWeaponCategories;

  @OnlyIn(value = Dist.CLIENT)
  private List<WeaponCategory> availableWeaponCategoryList;

  public static Builder createSwordMasterBuilder() {
    return (Builder)
        new Builder()
            .addAvailableWeaponCategory(
                new WeaponCategory[] {
                  CapabilityItem.WeaponCategories.UCHIGATANA,
                  CapabilityItem.WeaponCategories.LONGSWORD,
                  CapabilityItem.WeaponCategories.SWORD,
                  CapabilityItem.WeaponCategories.TACHI
                })
            .setCategory((SkillCategory) SkillCategories.PASSIVE)
            .setResource(Skill.Resource.NONE);
  }

  public SwordmasterSkill(Builder builder) {
    super(builder);
    this.availableWeaponCategories = ImmutableSet.copyOf(builder.availableWeaponCategories);
  }

  public void setParams(CompoundTag parameters) {
    super.setParams(parameters);
    this.speedBonus = parameters.m_128457_("speed_bonus");
  }

  public void onInitiate(SkillContainer container) {
    super.onInitiate(container);
    container
        .getExecutor()
        .getEventListener()
        .addEventListener(
            PlayerEventListener.EventType.MODIFY_ATTACK_SPEED_EVENT,
            EVENT_UUID,
            event -> {
              WeaponCategory heldWeaponCategory = event.getItemCapability().getWeaponCategory();
              if (this.availableWeaponCategories.contains(heldWeaponCategory)) {
                float attackSpeed = event.getAttackSpeed();
                event.setAttackSpeed(attackSpeed * (1.0f + this.speedBonus * 0.01f));
              }
            });
    if (!container.getExecutor().isLogicalClient()) {
      container
          .getExecutor()
          .getEntityDecorations()
          .addSwingSoundModifier(
              EntityDecorations.SWORDMASTER_SWING_SOUND,
              (EntityDecorations.AnimationPropertyModifier)
                  new EntityDecorations.AnimationPropertyModifier<SoundEvent, CapabilityItem>() {

                    public SoundEvent getModifiedValue(SoundEvent val, CapabilityItem object) {
                      return SwordmasterSkill.this.availableWeaponCategories.contains(
                                  object.getWeaponCategory())
                              && val == EpicFightSounds.WHOOSH.get()
                          ? (SoundEvent) EpicFightSounds.SWORDMASTER_SWING.get()
                          : val;
                    }

                    public boolean shouldRemove() {
                      return false;
                    }
                  });
    }
  }

  @OnlyIn(value = Dist.CLIENT)
  public void onInitiateClient(final SkillContainer container) {
    container
        .getExecutor()
        .getEntityDecorations()
        .addTrailInfoModifier(
            EntityDecorations.SWORDMASTER_TRAIL_MODIFIER,
            (EntityDecorations.AnimationPropertyModifier)
                new EntityDecorations.AnimationPropertyModifier<TrailInfo, CapabilityItem>() {

                  public TrailInfo getModifiedValue(TrailInfo val, CapabilityItem object) {
                    if (SwordmasterSkill.this
                        .getAvailableWeaponCategories()
                        .contains(object.getWeaponCategory())) {
                      TrailInfo.Builder builder = val.unpackAsBuilder();
                      builder.lifetime(val.trailLifetime() + 2);
                      builder.blockLight(val.blockLight() + 10);
                      if (val.texturePath().equals((Object) TrailInfo.GENERIC_TRAIL_TEXTURE)) {
                        builder.texture(TrailInfo.SWORDMASTER_SWING_TRAIL_TEX);
                      }
                      return builder.create();
                    }
                    return val;
                  }

                  public boolean shouldRemove() {
                    return container.getExecutor().getSkill((Skill) SwordmasterSkill.this) == null;
                  }
                });
  }

  public void onRemoved(SkillContainer container) {
    super.onRemoved(container);
    container
        .getExecutor()
        .getEventListener()
        .removeListener(PlayerEventListener.EventType.MODIFY_ATTACK_SPEED_EVENT, EVENT_UUID);
    if (!container.getExecutor().isLogicalClient()) {
      container
          .getExecutor()
          .getEntityDecorations()
          .removeSwingSoundModifier(EntityDecorations.SWORDMASTER_SWING_SOUND);
    }
  }

  @OnlyIn(value = Dist.CLIENT)
  public List<Object> getTooltipArgsOfScreen(List<Object> list) {
    list.add(String.format("%.0f", Float.valueOf(this.speedBonus)));
    StringBuilder sb = new StringBuilder();
    int i = 0;
    for (WeaponCategory weaponCategory : this.availableWeaponCategories) {
      sb.append(WeaponCategory.ENUM_MANAGER.toTranslated((ExtendableEnum) weaponCategory));
      if (i < this.availableWeaponCategories.size() - 1) {
        sb.append(", ");
      }
      ++i;
    }
    list.add(sb.toString());
    return list;
  }

  public Set<WeaponCategory> getAvailableWeaponCategories() {
    return this.availableWeaponCategories;
  }

  public static class Builder extends SkillBuilder<SwordmasterSkill> {
    protected final Set<WeaponCategory> availableWeaponCategories = Sets.newHashSet();

    public Builder addAvailableWeaponCategory(WeaponCategory... wc) {
      this.availableWeaponCategories.addAll(Arrays.asList(wc));
      return this;
    }
  }
}
