/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.client.event.ViewportEvent$ComputeCameraAngles
 *  net.minecraftforge.event.TickEvent$ClientTickEvent
 *  net.minecraftforge.event.TickEvent$Phase
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 */
package com.yourname.assassinsoath.client.effect;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ViewportEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid="assassinsoath", value={Dist.CLIENT}, bus=Mod.EventBusSubscriber.Bus.FORGE)
public final class SmokeBombClientEffects {
    private static final RandomSource RANDOM = RandomSource.m_216327_();
    private static final ResourceLocation BLUR_SHADER = ResourceLocation.fromNamespaceAndPath((String)"minecraft", (String)"shaders/post/blur.json");
    private static int shakeTicks;
    private static int shakeDuration;
    private static float shakeStrength;
    private static int blurTicks;
    private static boolean blurActive;

    private SmokeBombClientEffects() {
    }

    public static void trigger(int shakeDurationTicks, float strength, int blurDurationTicks) {
        shakeTicks = shakeDuration = Math.max(shakeDurationTicks, 0);
        shakeStrength = Math.max(strength, 0.0f);
        if (blurDurationTicks > 0) {
            blurTicks = blurDurationTicks;
            SmokeBombClientEffects.ensureBlurShader();
        }
    }

    @SubscribeEvent
    public static void onCamera(ViewportEvent.ComputeCameraAngles event) {
        if (shakeTicks <= 0 || shakeDuration <= 0 || shakeStrength <= 0.0f) {
            return;
        }
        float elapsed = shakeDuration - shakeTicks;
        float progress = 1.0f - elapsed / (float)shakeDuration;
        float intensity = shakeStrength * progress;
        float yawOffset = (RANDOM.m_188501_() - 0.5f) * 2.0f * intensity;
        float pitchOffset = (RANDOM.m_188501_() - 0.5f) * 2.0f * intensity * 0.7f;
        float rollOffset = (RANDOM.m_188501_() - 0.5f) * 2.0f * intensity * 0.5f;
        event.setYaw(event.getYaw() + yawOffset);
        event.setPitch(Mth.m_14036_((float)(event.getPitch() + pitchOffset), (float)-90.0f, (float)90.0f));
        event.setRoll(event.getRoll() + rollOffset);
    }

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.END) {
            return;
        }
        if (shakeTicks > 0) {
            --shakeTicks;
        }
        if (blurTicks > 0 && --blurTicks == 0) {
            SmokeBombClientEffects.clearBlurShader();
        }
    }

    private static void ensureBlurShader() {
        Minecraft mc = Minecraft.m_91087_();
        if (mc.f_91073_ == null) {
            return;
        }
        if (!blurActive) {
            try {
                mc.f_91063_.m_109128_(BLUR_SHADER);
                blurActive = true;
            }
            catch (Exception ignored) {
                blurActive = false;
            }
        }
    }

    private static void clearBlurShader() {
        Minecraft mc = Minecraft.m_91087_();
        if (blurActive) {
            try {
                mc.f_91063_.m_109086_();
            }
            catch (Exception exception) {
                // empty catch block
            }
            blurActive = false;
        }
    }
}

