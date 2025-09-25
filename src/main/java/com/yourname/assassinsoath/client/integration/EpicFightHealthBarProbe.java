package com.yourname.assassinsoath.client.integration;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.slf4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Small reflective bridge that inspects Epic Fight's HUD renderer so the stealth overlay can align
 * its billboards with the combat health bar when the mod is present.
 */
public final class EpicFightHealthBarProbe {
    private static final Logger LOGGER = LogUtils.getLogger();

    private static final boolean AVAILABLE;
    private static final Method GET_ENTITY_PATCH;
    private static final Class<?> LIVING_ENTITY_PATCH_CLASS;
    private static final Class<?> LOCAL_PLAYER_PATCH_CLASS;
    private static final Object HEALTH_BAR_INSTANCE;
    private static final Method SHOULD_DRAW_METHOD;
    private static final Field TRACKING_ENTITIES_FIELD;
    private static final double ICON_GAP_ABOVE_BAR = 0.5D;
    private static final AtomicBoolean LOGGED_FAILURE = new AtomicBoolean(false);

    static {
        Method getEntityPatch = null;
        Class<?> livingEntityPatchClass = null;
        Class<?> localPlayerPatchClass = null;
        Object healthBarInstance = null;
        Method shouldDrawMethod = null;
        Field trackingEntitiesField = null;
        boolean available = false;

        try {
            Class<?> capabilities = Class.forName("yesman.epicfight.world.capabilities.EpicFightCapabilities");
            livingEntityPatchClass = Class.forName("yesman.epicfight.world.capabilities.entitypatch.LivingEntityPatch");
            localPlayerPatchClass = Class.forName("yesman.epicfight.client.world.capabilites.entitypatch.player.LocalPlayerPatch");
            Class<?> entityUiClass = Class.forName("yesman.epicfight.client.gui.EntityUI");
            Class<?> healthBarClass = Class.forName("yesman.epicfight.client.gui.HealthBar");

            getEntityPatch = capabilities.getMethod("getEntityPatch", Entity.class, Class.class);
            healthBarInstance = entityUiClass.getField("HEALTH_BAR").get(null);
            shouldDrawMethod = healthBarClass.getMethod("shouldDraw", LivingEntity.class, livingEntityPatchClass, localPlayerPatchClass, float.class);
            trackingEntitiesField = healthBarClass.getDeclaredField("trackingEntities");
            trackingEntitiesField.setAccessible(true);

            available = true;
        } catch (ClassNotFoundException | NoSuchMethodException | NoSuchFieldException | IllegalAccessException exception) {
            LOGGER.debug("Epic Fight HUD integration unavailable: {}", exception.toString());
        }

        GET_ENTITY_PATCH = getEntityPatch;
        LIVING_ENTITY_PATCH_CLASS = livingEntityPatchClass;
        LOCAL_PLAYER_PATCH_CLASS = localPlayerPatchClass;
        HEALTH_BAR_INSTANCE = healthBarInstance;
        SHOULD_DRAW_METHOD = shouldDrawMethod;
        TRACKING_ENTITIES_FIELD = trackingEntitiesField;
        AVAILABLE = available;
    }

    private EpicFightHealthBarProbe() {
    }

    public static OptionalDouble resolveBillboardOffset(LivingEntity entity, float partialTick) {
        if (!AVAILABLE) {
            return OptionalDouble.empty();
        }
        Minecraft minecraft = Minecraft.getInstance();
        LocalPlayer player = minecraft.player;
        if (player == null) {
            return OptionalDouble.empty();
        }

        try {
            Object playerPatch = GET_ENTITY_PATCH.invoke(null, player, LOCAL_PLAYER_PATCH_CLASS);
            if (playerPatch == null) {
                return OptionalDouble.empty();
            }
            Object entityPatch = GET_ENTITY_PATCH.invoke(null, entity, LIVING_ENTITY_PATCH_CLASS);
            boolean shouldDraw = (Boolean) SHOULD_DRAW_METHOD.invoke(HEALTH_BAR_INSTANCE, entity, entityPatch, playerPatch, partialTick);
            if (!shouldDraw && !isEntityTracked(entity)) {
                return OptionalDouble.empty();
            }

            double offset = entity.getBbHeight() + 0.25D + ICON_GAP_ABOVE_BAR;
            return OptionalDouble.of(offset);
        } catch (IllegalAccessException | InvocationTargetException reflectionFailure) {
            if (LOGGED_FAILURE.compareAndSet(false, true)) {
                LOGGER.warn("Failed to query Epic Fight health bar state: {}", reflectionFailure.toString());
            }
            return OptionalDouble.empty();
        }
    }

    @SuppressWarnings("unchecked")
    private static boolean isEntityTracked(LivingEntity entity) throws IllegalAccessException {
        if (TRACKING_ENTITIES_FIELD == null) {
            return false;
        }
        Map<LivingEntity, ?> map = (Map<LivingEntity, ?>) TRACKING_ENTITIES_FIELD.get(HEALTH_BAR_INSTANCE);
        return map.containsKey(entity);
    }
}
