/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.PoseStack$Pose
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.entity.EntityRenderDispatcher
 *  net.minecraft.client.renderer.texture.OverlayTexture
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.Mth
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.monster.Enemy
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.client.event.RenderLivingEvent$Post
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 */
package com.yourname.assassinsoath.client.hud;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.joml.Matrix3f;
import org.joml.Matrix4f;

@Mod.EventBusSubscriber(modid="assassinsoath", value={Dist.CLIENT}, bus=Mod.EventBusSubscriber.Bus.FORGE)
public final class StealthOverlay {
    public static volatile float CLIENT_VIS = 1.0f;
    public static volatile int CLIENT_ALERT_STAGE = 0;
    public static volatile long LAST_UPDATE_MS = 0L;
    private static final ResourceLocation ALERT = ResourceLocation.fromNamespaceAndPath((String)"assassinsoath", (String)"textures/gui/stealth_alert.png");
    private static final Map<Integer, ResourceLocation> QUESTION_ICONS = new HashMap<Integer, ResourceLocation>();
    private static final Map<Integer, MobHudData> MOB_DATA = new HashMap<Integer, MobHudData>();
    private static final long DATA_TTL_MS = 3000L;

    private StealthOverlay() {
    }

    public static void updateMobAwareness(int entityId, float detection, int stage) {
        MOB_DATA.put(entityId, new MobHudData(Mth.m_14036_((float)detection, (float)0.0f, (float)1.0f), stage, System.currentTimeMillis()));
    }

    @SubscribeEvent
    public static void onRenderLiving(RenderLivingEvent.Post<?, ?> event) {
        LivingEntity entity = event.getEntity();
        MobHudData data = MOB_DATA.get(entity.m_19879_());
        if (data == null) {
            return;
        }
        long now = System.currentTimeMillis();
        if (now - data.receivedAt() > 3000L) {
            MOB_DATA.remove(entity.m_19879_());
            return;
        }
        if (data.detection() <= 0.0f) {
            return;
        }
        ResourceLocation icon = StealthOverlay.resolveIcon(entity, data);
        if (icon == null) {
            return;
        }
        PoseStack poseStack = event.getPoseStack();
        poseStack.m_85836_();
        double verticalOffset = (double)entity.m_20206_() + 0.6;
        poseStack.m_85837_(0.0, verticalOffset, 0.0);
        EntityRenderDispatcher dispatcher = Minecraft.m_91087_().m_91290_();
        poseStack.m_252781_(dispatcher.m_253208_());
        float zombieHeight = 1.95f;
        float zombieWidth = 0.6f;
        float heightScale = Mth.m_14036_((float)(entity.m_20206_() / zombieHeight), (float)0.4f, (float)3.0f);
        float widthScale = Mth.m_14036_((float)(entity.m_20205_() / zombieWidth), (float)0.4f, (float)3.0f);
        float scaleBase = 0.025f;
        poseStack.m_85841_(-scaleBase * widthScale, -scaleBase * heightScale, scaleBase * Math.max(widthScale, heightScale));
        int packedLight = 0xF000F0;
        MultiBufferSource buffers = event.getMultiBufferSource();
        VertexConsumer iconConsumer = buffers.m_6299_(RenderType.m_110473_((ResourceLocation)icon));
        float baseSize = 19.2f;
        StealthOverlay.drawTexturedQuad(poseStack, iconConsumer, packedLight, baseSize, baseSize, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f);
        poseStack.m_85849_();
    }

    private static ResourceLocation resolveIcon(LivingEntity entity, MobHudData data) {
        if (data.stage() >= 3 && data.detection() >= 0.99f) {
            return ALERT;
        }
        if (!(entity instanceof Enemy)) {
            return null;
        }
        int percent = Math.round(data.detection() * 100.0f / 5.0f) * 5;
        percent = Mth.m_14045_((int)percent, (int)5, (int)90);
        return QUESTION_ICONS.get(percent);
    }

    private static void drawTexturedQuad(PoseStack poseStack, VertexConsumer consumer, int packedLight, float width, float height, float z, float r, float g, float b, float a) {
        float x0 = -width / 2.0f;
        float x1 = width / 2.0f;
        float y0 = 0.0f;
        float y1 = height;
        StealthOverlay.drawQuad(poseStack, consumer, packedLight, x0, y0, x1, y1, 0.0f, 0.0f, 1.0f, 1.0f, z, r, g, b, a);
    }

    private static void drawQuad(PoseStack poseStack, VertexConsumer consumer, int packedLight, float x0, float y0, float x1, float y1, float u0, float v0, float u1, float v1, float z, float r, float g, float b, float a) {
        PoseStack.Pose last = poseStack.m_85850_();
        Matrix4f matrix = last.m_252922_();
        Matrix3f normal = last.m_252943_();
        consumer.m_252986_(matrix, x0, y1, z).m_85950_(r, g, b, a).m_7421_(u0, v1).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLight).m_252939_(normal, 0.0f, 0.0f, 1.0f).m_5752_();
        consumer.m_252986_(matrix, x1, y1, z).m_85950_(r, g, b, a).m_7421_(u1, v1).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLight).m_252939_(normal, 0.0f, 0.0f, 1.0f).m_5752_();
        consumer.m_252986_(matrix, x1, y0, z).m_85950_(r, g, b, a).m_7421_(u1, v0).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLight).m_252939_(normal, 0.0f, 0.0f, 1.0f).m_5752_();
        consumer.m_252986_(matrix, x0, y0, z).m_85950_(r, g, b, a).m_7421_(u0, v0).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLight).m_252939_(normal, 0.0f, 0.0f, 1.0f).m_5752_();
    }

    static {
        for (int i = 5; i <= 90; i += 5) {
            String file = "textures/gui/stealth_question_" + i + "pct.png";
            QUESTION_ICONS.put(i, ResourceLocation.fromNamespaceAndPath((String)"assassinsoath", (String)file));
        }
    }

    private record MobHudData(float detection, int stage, long receivedAt) {
    }
}

