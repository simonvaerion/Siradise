package com.yourname.assassinsoath.client.hud;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.yourname.assassinsoath.AssassinsOath;
import com.yourname.assassinsoath.ai.StealthAwarenessTracker;
import com.yourname.assassinsoath.client.integration.EpicFightHealthBarProbe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Mod.EventBusSubscriber(modid = AssassinsOath.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class StealthOverlay {
    private StealthOverlay() {
    }

    public static volatile float CLIENT_VIS = 1f;
    public static volatile int CLIENT_ALERT_STAGE = 0;
    public static volatile long LAST_UPDATE_MS = 0L;

    private static final ResourceLocation ALERT = ResourceLocation.fromNamespaceAndPath(
            AssassinsOath.MODID, "textures/gui/stealth_alert.png");

    private static final Map<Integer, ResourceLocation> QUESTION_ICONS = new HashMap<>();

    private static final Map<Integer, MobHudData> MOB_DATA = new HashMap<>();
    private static final Set<Integer> RENDERED_THIS_FRAME = new HashSet<>();
    private static final long DATA_FADE_DELAY_MS = 3000L;
    private static final long DATA_FADE_DURATION_MS = 3000L;
    private static final double ICON_EXTRA_HEIGHT_BASE = 2.25D;
    private static final double ICON_EXTRA_HEIGHT_SCALE = 0.9D;
    private static final float REFERENCE_HEIGHT = 1.95f;
    private static final float SCALE_BASE = 0.025f;
    private static final float SCALE_MIN = 0.4f;
    private static final float SCALE_MAX = 3.0f;
    private static final double EPIC_FIGHT_ICON_GAP = 0.05D;
    private static final double MIN_ANCHOR_MARGIN = 0.1D;
    private static final float ICON_BASE_SIZE = 19.2f;

    static {
        for (int i = 5; i <= 90; i += 5) {
            String file = "textures/gui/stealth_question_" + i + "pct.png";
            QUESTION_ICONS.put(i, ResourceLocation.fromNamespaceAndPath(AssassinsOath.MODID, file));
        }
    }

    public static void updateMobAwareness(int entityId, float detection, int stage) {
        MOB_DATA.put(entityId, new MobHudData(Mth.clamp(detection, 0f, 1f), stage, System.currentTimeMillis()));
    }

    @SubscribeEvent
    public static void onRenderLiving(RenderLivingEvent.Post<?, ?> event) {
        LivingEntity entity = (LivingEntity) event.getEntity();
        RenderOutcome outcome = evaluateRenderOutcome(entity, System.currentTimeMillis());
        if (outcome.removeData()) {
            MOB_DATA.remove(entity.getId());
        }
        ResourceLocation icon = outcome.icon();
        if (icon == null) {
            return;
        }

        PoseStack poseStack = event.getPoseStack();
        poseStack.pushPose();

        float uniformScale = computeUniformScale(entity);
        double verticalOffset = resolveVerticalOffset(entity, event.getPartialTick(), uniformScale);
        poseStack.translate(0.0D, verticalOffset, 0.0D);
        EntityRenderDispatcher dispatcher = Minecraft.getInstance().getEntityRenderDispatcher();
        poseStack.mulPose(dispatcher.cameraOrientation());

        poseStack.scale(-uniformScale, -uniformScale, uniformScale);

        int packedLight = LightTexture.FULL_BRIGHT;
        MultiBufferSource buffers = event.getMultiBufferSource();
        VertexConsumer iconConsumer = buffers.getBuffer(RenderType.entityTranslucent(icon));
        drawTexturedQuad(poseStack, iconConsumer, packedLight, ICON_BASE_SIZE, ICON_BASE_SIZE, 0f, 1f, 1f, 1f, 1f);

        poseStack.popPose();
        RENDERED_THIS_FRAME.add(entity.getId());
    }

    @SubscribeEvent
    public static void onRenderLevelStage(RenderLevelStageEvent event) {
        if (event.getStage() != RenderLevelStageEvent.Stage.AFTER_PARTICLES) {
            return;
        }
        Minecraft minecraft = Minecraft.getInstance();
        var level = minecraft.level;
        if (level == null) {
            RENDERED_THIS_FRAME.clear();
            return;
        }

        EntityRenderDispatcher dispatcher = minecraft.getEntityRenderDispatcher();
        var camera = minecraft.gameRenderer.getMainCamera();
        var cameraPos = camera.getPosition();
        PoseStack poseStack = new PoseStack();
        MultiBufferSource.BufferSource bufferSource = minecraft.renderBuffers().bufferSource();
        long now = System.currentTimeMillis();
        boolean renderedAny = false;

        Iterator<Map.Entry<Integer, MobHudData>> iterator = MOB_DATA.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, MobHudData> entry = iterator.next();
            int entityId = entry.getKey();
            if (RENDERED_THIS_FRAME.contains(entityId)) {
                continue;
            }
            var entity = level.getEntity(entityId);
            if (!(entity instanceof LivingEntity living)) {
                iterator.remove();
                continue;
            }

            RenderOutcome outcome = evaluateRenderOutcome(living, now);
            if (outcome.removeData()) {
                iterator.remove();
            }
            ResourceLocation icon = outcome.icon();
            if (icon == null) {
                continue;
            }

            poseStack.pushPose();
            double x = Mth.lerp(event.getPartialTick(), living.xo, living.getX()) - cameraPos.x;
            double y = Mth.lerp(event.getPartialTick(), living.yo, living.getY()) - cameraPos.y;
            double z = Mth.lerp(event.getPartialTick(), living.zo, living.getZ()) - cameraPos.z;
            poseStack.translate(x, y, z);
            float uniformScale = computeUniformScale(living);
            double verticalOffset = resolveVerticalOffset(living, event.getPartialTick(), uniformScale);
            poseStack.translate(0.0D, verticalOffset, 0.0D);
            poseStack.mulPose(dispatcher.cameraOrientation());

            poseStack.scale(-uniformScale, -uniformScale, uniformScale);

            VertexConsumer iconConsumer = bufferSource.getBuffer(RenderType.entityTranslucent(icon));
            drawTexturedQuad(poseStack, iconConsumer, LightTexture.FULL_BRIGHT, ICON_BASE_SIZE, ICON_BASE_SIZE, 0f, 1f, 1f, 1f, 1f);
            poseStack.popPose();
            renderedAny = true;
        }

        if (renderedAny) {
            bufferSource.endBatch();
        }
        RENDERED_THIS_FRAME.clear();
    }

    private static RenderOutcome evaluateRenderOutcome(LivingEntity entity, long now) {
        MobHudData data = MOB_DATA.get(entity.getId());
        if (data == null) {
            return RenderOutcome.skip();
        }

        long age = now - data.receivedAt();
        if (age >= DATA_FADE_DELAY_MS + DATA_FADE_DURATION_MS) {
            return RenderOutcome.remove();
        }

        float detectionForRender = data.detection();
        if (detectionForRender <= 0f) {
            return RenderOutcome.remove();
        }

        if (age > DATA_FADE_DELAY_MS) {
            long fadeElapsed = age - DATA_FADE_DELAY_MS;
            float fadeFactor = Mth.clamp(1f - (float) fadeElapsed / (float) DATA_FADE_DURATION_MS, 0f, 1f);
            detectionForRender = Mth.clamp(detectionForRender * fadeFactor, 0f, 1f);
            if (detectionForRender <= 0f) {
                return RenderOutcome.remove();
            }
        }

        int stageForRender = Math.min(data.stage(), StealthAwarenessTracker.stageFor(detectionForRender));
        ResourceLocation icon = resolveIcon(detectionForRender, stageForRender);
        return icon == null ? RenderOutcome.skip() : RenderOutcome.display(icon);
    }

    private static ResourceLocation resolveIcon(float detection, int stage) {
        if (stage >= StealthAwarenessTracker.STAGE_ALERT && detection >= 0.99f) {
            return ALERT;
        }
        int percent = (int) (Math.round(detection * 100f / 5f) * 5);
        percent = Mth.clamp(percent, 5, 90);
        return QUESTION_ICONS.get(percent);
    }

    private static double resolveVerticalOffset(LivingEntity entity, float partialTick, float uniformScale) {
        var epicFightTop = EpicFightHealthBarProbe.resolveHealthBarTop(entity, partialTick);
        if (epicFightTop.isPresent()) {
            double iconHeight = ICON_BASE_SIZE * uniformScale;
            double anchor = Math.max(epicFightTop.getAsDouble(), entityHeight(entity) + MIN_ANCHOR_MARGIN);
            return anchor + iconHeight + EPIC_FIGHT_ICON_GAP;
        }
        return computeVerticalOffset(entity);
    }

    private static double computeVerticalOffset(LivingEntity entity) {
        float referenceHeight = entityHeight(entity);
        double extra = Math.max(ICON_EXTRA_HEIGHT_BASE, referenceHeight * ICON_EXTRA_HEIGHT_SCALE);
        return referenceHeight + extra;
    }

    private static float computeUniformScale(LivingEntity entity) {
        float heightScale = Mth.clamp(entityHeight(entity) / REFERENCE_HEIGHT, SCALE_MIN, SCALE_MAX);
        return SCALE_BASE * heightScale;
    }

    private static float entityHeight(LivingEntity entity) {
        float boundingHeight = entity.getBbHeight();
        float defaultHeight = entity.getType().getDimensions().height();
        return Math.max(boundingHeight, defaultHeight);
    }

    private static void drawTexturedQuad(PoseStack poseStack, VertexConsumer consumer, int packedLight,
                                         float width, float height, float z,
                                         float r, float g, float b, float a) {
        float x0 = -width / 2f;
        float x1 = width / 2f;
        float y0 = 0f;
        float y1 = height;
        drawQuad(poseStack, consumer, packedLight, x0, y0, x1, y1,
                0f, 0f, 1f, 1f, z, r, g, b, a);
    }

    private static void drawQuad(PoseStack poseStack, VertexConsumer consumer, int packedLight,
                                 float x0, float y0, float x1, float y1,
                                 float u0, float v0, float u1, float v1,
                                 float z,
                                 float r, float g, float b, float a) {
        var last = poseStack.last();
        var matrix = last.pose();
        var normal = last.normal();
        consumer.vertex(matrix, x0, y1, z).color(r, g, b, a).uv(u0, v1)
                .overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(normal, 0f, 0f, 1f).endVertex();
        consumer.vertex(matrix, x1, y1, z).color(r, g, b, a).uv(u1, v1)
                .overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(normal, 0f, 0f, 1f).endVertex();
        consumer.vertex(matrix, x1, y0, z).color(r, g, b, a).uv(u1, v0)
                .overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(normal, 0f, 0f, 1f).endVertex();
        consumer.vertex(matrix, x0, y0, z).color(r, g, b, a).uv(u0, v0)
                .overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(normal, 0f, 0f, 1f).endVertex();
    }

    private record MobHudData(float detection, int stage, long receivedAt) {
    }

    private record RenderOutcome(ResourceLocation icon, boolean removeData) {
        static RenderOutcome skip() {
            return new RenderOutcome(null, false);
        }

        static RenderOutcome remove() {
            return new RenderOutcome(null, true);
        }

        static RenderOutcome display(ResourceLocation icon) {
            return new RenderOutcome(icon, false);
        }
    }
}

