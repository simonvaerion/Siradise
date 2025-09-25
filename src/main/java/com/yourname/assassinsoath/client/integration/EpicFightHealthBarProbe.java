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
    private static final double DEFAULT_BAR_BASE_OFFSET = 0.25D;
    private static final double DEFAULT_BAR_HEIGHT = 0.35D;
    private static final AtomicBoolean LOGGED_FAILURE = new AtomicBoolean(false);
    private static final AtomicBoolean LOGGED_TRACKING_WARNING = new AtomicBoolean(false);
    private static volatile Method TRACKING_HEIGHT_METHOD;
    private static volatile Field TRACKING_HEIGHT_FIELD;

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

    public static OptionalDouble resolveHealthBarTop(LivingEntity entity, float partialTick) {
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

            double entityHeight = entity.getBbHeight();
            double base = entityHeight + DEFAULT_BAR_BASE_OFFSET;
            OptionalDouble trackedHeight = readTrackedBarHeight(entity);
            double barTop;
            if (trackedHeight.isPresent()) {
                double tracked = trackedHeight.getAsDouble();
                if (tracked > entityHeight + DEFAULT_BAR_BASE_OFFSET) {
                    barTop = tracked;
                } else {
                    barTop = base + tracked;
                }
            } else {
                barTop = base + DEFAULT_BAR_HEIGHT;
            }
            return OptionalDouble.of(barTop);
        } catch (IllegalAccessException | InvocationTargetException reflectionFailure) {
            if (LOGGED_FAILURE.compareAndSet(false, true)) {
                LOGGER.warn("Failed to query Epic Fight health bar state: {}", reflectionFailure.toString());
            }
            return OptionalDouble.empty();
        }
    }

    @SuppressWarnings("unchecked")
    private static OptionalDouble readTrackedBarHeight(LivingEntity entity)
            throws IllegalAccessException {
        if (TRACKING_ENTITIES_FIELD == null) {
            return OptionalDouble.empty();
        }
        Map<LivingEntity, ?> map = (Map<LivingEntity, ?>) TRACKING_ENTITIES_FIELD.get(HEALTH_BAR_INSTANCE);
        Object data = map.get(entity);
        if (data == null) {
            return OptionalDouble.empty();
        }

        if (data instanceof Number number) {
            return OptionalDouble.of(number.doubleValue());
        }

        Number resolved = tryResolveTrackingHeight(data);
        if (resolved != null) {
            return OptionalDouble.of(resolved.doubleValue());
        }

        if (LOGGED_TRACKING_WARNING.compareAndSet(false, true)) {
            LOGGER.debug("Epic Fight tracking data type {} unsupported for health bar alignment", data.getClass().getName());
        }
        return OptionalDouble.empty();
    }

    @SuppressWarnings("unchecked")
    private static boolean isEntityTracked(LivingEntity entity) throws IllegalAccessException {
        if (TRACKING_ENTITIES_FIELD == null) {
            return false;
        }
        Map<LivingEntity, ?> map = (Map<LivingEntity, ?>) TRACKING_ENTITIES_FIELD.get(HEALTH_BAR_INSTANCE);
        return map.containsKey(entity);
    }

    private static Number tryResolveTrackingHeight(Object data) {
        try {
            Method method = TRACKING_HEIGHT_METHOD;
            if (method != null) {
                Object value = method.invoke(data);
                if (value instanceof Number number) {
                    return number;
                }
            }
        } catch (IllegalAccessException | InvocationTargetException ignored) {
            // fall through and try field access
        }

        try {
            Field field = TRACKING_HEIGHT_FIELD;
            if (field != null) {
                Object value = field.get(data);
                if (value instanceof Number number) {
                    return number;
                }
            }
        } catch (IllegalAccessException ignored) {
            // best effort only
        }

        detectTrackingHeightAccessors(data);

        try {
            Method method = TRACKING_HEIGHT_METHOD;
            if (method != null) {
                Object value = method.invoke(data);
                if (value instanceof Number number) {
                    return number;
                }
            }
        } catch (IllegalAccessException | InvocationTargetException ignored) {
            // give up and fall back to field handling below
        }

        try {
            Field field = TRACKING_HEIGHT_FIELD;
            if (field != null) {
                Object value = field.get(data);
                if (value instanceof Number number) {
                    return number;
                }
            }
        } catch (IllegalAccessException ignored) {
            // nothing else to try
        }
        return null;
    }

    private static void detectTrackingHeightAccessors(Object data) {
        if (TRACKING_HEIGHT_METHOD != null || TRACKING_HEIGHT_FIELD != null) {
            return;
        }

        for (Method method : data.getClass().getDeclaredMethods()) {
            if (method.getParameterCount() == 0 && Number.class.isAssignableFrom(wrapPrimitive(method.getReturnType()))) {
                String lower = method.getName().toLowerCase();
                if (lower.contains("height") || lower.contains("offset") || lower.contains("y")) {
                    method.setAccessible(true);
                    TRACKING_HEIGHT_METHOD = method;
                    return;
                }
            }
        }

        for (Field field : data.getClass().getDeclaredFields()) {
            if (Number.class.isAssignableFrom(wrapPrimitive(field.getType()))) {
                String lower = field.getName().toLowerCase();
                if (lower.contains("height") || lower.contains("offset") || lower.contains("y")) {
                    field.setAccessible(true);
                    TRACKING_HEIGHT_FIELD = field;
                    return;
                }
            }
        }

        for (Field field : data.getClass().getDeclaredFields()) {
            if (Number.class.isAssignableFrom(wrapPrimitive(field.getType()))) {
                field.setAccessible(true);
                TRACKING_HEIGHT_FIELD = field;
                return;
            }
        }
    }

    private static Class<?> wrapPrimitive(Class<?> type) {
        if (!type.isPrimitive()) {
            return type;
        }
        if (type == float.class) {
            return Float.class;
        }
        if (type == double.class) {
            return Double.class;
        }
        if (type == int.class) {
            return Integer.class;
        }
        if (type == long.class) {
            return Long.class;
        }
        if (type == short.class) {
            return Short.class;
        }
        if (type == byte.class) {
            return Byte.class;
        }
        return type;
    }
}
