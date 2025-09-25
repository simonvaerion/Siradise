package com.yourname.assassinsoath.client.effect;

import com.yourname.assassinsoath.AssassinsOath;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ViewportEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AssassinsOath.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class SmokeBombClientEffects {
    private static final RandomSource RANDOM = RandomSource.create();
    private static final ResourceLocation BLUR_SHADER = ResourceLocation.fromNamespaceAndPath("minecraft", "shaders/post/blur.json");

    private static int shakeTicks;
    private static int shakeDuration;
    private static float shakeStrength;
    private static int blurTicks;
    private static boolean blurActive;

    private SmokeBombClientEffects() {
    }

    public static void trigger(int shakeDurationTicks, float strength, int blurDurationTicks) {
        shakeDuration = Math.max(shakeDurationTicks, 0);
        shakeTicks = shakeDuration;
        shakeStrength = Math.max(strength, 0f);
        if (blurDurationTicks > 0) {
            blurTicks = blurDurationTicks;
            ensureBlurShader();
        }
    }

    @SubscribeEvent
    public static void onCamera(ViewportEvent.ComputeCameraAngles event) {
        if (shakeTicks <= 0 || shakeDuration <= 0 || shakeStrength <= 0f) {
            return;
        }
        float elapsed = shakeDuration - shakeTicks;
        float progress = 1.0F - (elapsed / shakeDuration);
        float intensity = shakeStrength * progress;
        float yawOffset = (RANDOM.nextFloat() - 0.5F) * 2.0F * intensity;
        float pitchOffset = (RANDOM.nextFloat() - 0.5F) * 2.0F * intensity * 0.7F;
        float rollOffset = (RANDOM.nextFloat() - 0.5F) * 2.0F * intensity * 0.5F;
        event.setYaw(event.getYaw() + yawOffset);
        event.setPitch(Mth.clamp(event.getPitch() + pitchOffset, -90.0F, 90.0F));
        event.setRoll(event.getRoll() + rollOffset);
    }

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.END) {
            return;
        }
        if (shakeTicks > 0) {
            shakeTicks--;
        }
        if (blurTicks > 0) {
            blurTicks--;
            if (blurTicks == 0) {
                clearBlurShader();
            }
        }
    }

    private static void ensureBlurShader() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level == null) {
            return;
        }
        if (!blurActive) {
            try {
                mc.gameRenderer.loadEffect(BLUR_SHADER);
                blurActive = true;
            } catch (Exception ignored) {
                blurActive = false;
            }
        }
    }

    private static void clearBlurShader() {
        Minecraft mc = Minecraft.getInstance();
        if (blurActive) {
            try {
                mc.gameRenderer.shutdownEffect();
            } catch (Exception ignored) {
            }
            blurActive = false;
        }
    }
}
