/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.item.ItemStack
 *  net.minecraftforge.common.capabilities.Capability
 *  net.minecraftforge.common.capabilities.CapabilityManager
 *  net.minecraftforge.common.capabilities.CapabilityToken
 *  net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent
 */
package yesman.epicfight.world.capabilities;

import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import yesman.epicfight.world.capabilities.entitypatch.EntityPatch;
import yesman.epicfight.world.capabilities.item.CapabilityItem;
import yesman.epicfight.world.capabilities.projectile.ProjectilePatch;
import yesman.epicfight.world.capabilities.skill.CapabilitySkill;

public class EpicFightCapabilities {
  public static final Capability<EntityPatch> CAPABILITY_ENTITY =
      CapabilityManager.get((CapabilityToken) new CapabilityToken<EntityPatch>() {});
  public static final Capability<CapabilityItem> CAPABILITY_ITEM =
      CapabilityManager.get((CapabilityToken) new CapabilityToken<CapabilityItem>() {});
  public static final Capability<ProjectilePatch> CAPABILITY_PROJECTILE =
      CapabilityManager.get((CapabilityToken) new CapabilityToken<ProjectilePatch>() {});
  public static final Capability<CapabilitySkill> CAPABILITY_SKILL =
      CapabilityManager.get((CapabilityToken) new CapabilityToken<CapabilitySkill>() {});

  public static void registerCapabilities(RegisterCapabilitiesEvent event) {
    event.register(CapabilityItem.class);
    event.register(EntityPatch.class);
    event.register(ProjectilePatch.class);
    event.register(CapabilitySkill.class);
  }

  public static CapabilityItem getItemStackCapability(ItemStack stack) {
    return stack.m_41619_()
        ? CapabilityItem.EMPTY
        : (CapabilityItem)
            stack.getCapability(CAPABILITY_ITEM).orElse((Object) CapabilityItem.EMPTY);
  }

  public static CapabilityItem getItemStackCapabilityOr(
      ItemStack stack, @Nullable CapabilityItem defaultCap) {
    return stack.m_41619_()
        ? defaultCap
        : (CapabilityItem) stack.getCapability(CAPABILITY_ITEM).orElse((Object) defaultCap);
  }

  public static <T extends EntityPatch> T getEntityPatch(Entity entity, Class<T> type) {
    EntityPatch entitypatch;
    if (entity != null
        && (entitypatch = (EntityPatch) entity.getCapability(CAPABILITY_ENTITY).orElse(null))
            != null
        && type.isAssignableFrom(entitypatch.getClass())) {
      return (T) entitypatch;
    }
    return null;
  }

  public static <T extends EntityPatch<?>> Optional<T> getUnparameterizedEntityPatch(
      Entity entity, Class<T> type) {
    EntityPatch entitypatch;
    if (entity != null
        && (entitypatch = (EntityPatch) entity.getCapability(CAPABILITY_ENTITY).orElse(null))
            != null
        && type.isAssignableFrom(entitypatch.getClass())) {
      return Optional.of(entitypatch);
    }
    return Optional.empty();
  }

  public static <E extends Entity, T extends EntityPatch<E>>
      Optional<T> getParameterizedEntityPatch(
          Entity entity, Class<E> entitytype, Class<?> patchtype) {
    EntityPatch entitypatch;
    if (entity != null
        && entitytype.isAssignableFrom(entity.getClass())
        && (entitypatch = (EntityPatch) entity.getCapability(CAPABILITY_ENTITY).orElse(null))
            != null
        && patchtype.isAssignableFrom(entitypatch.getClass())) {
      return Optional.of(entitypatch);
    }
    return Optional.empty();
  }
}
