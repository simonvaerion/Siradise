package com.yourname.assassinsoath.client.effect;

import com.mojang.logging.LogUtils;
import com.yourname.assassinsoath.AssassinsOath;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.client.event.ViewportEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import org.slf4j.Logger;

@Mod.EventBusSubscriber(modid = AssassinsOath.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class SmokeBombClientEffects {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final RandomSource RANDOM = RandomSource.create();
    private static final float MAX_OVERLAY_ALPHA = 0.7f;

    private static int shakeTicks;
    private static int shakeDuration;
    private static float shakeStrength;
    private static int overlayTicks;
    private static int overlayDuration;

    private SmokeBombClientEffects() {
    }

    public static void trigger(int shakeDurationTicks, float strength, int blurDurationTicks) {
        shakeDuration = Math.max(shakeDurationTicks, 0);
        shakeTicks = shakeDuration;
        shakeStrength = Math.max(strength, 0.0f);

        if (blurDurationTicks > 0) {
            overlayDuration = blurDurationTicks;
            overlayTicks = blurDurationTicks;
        } else {
            overlayDuration = 0;
            overlayTicks = 0;
        }
    }

    @SubscribeEvent
    public static void onCamera(ViewportEvent.ComputeCameraAngles event) {
        if (shakeTicks <= 0 || shakeDuration <= 0 || shakeStrength <= 0.0f) {
            return;
        }

        float elapsed = shakeDuration - shakeTicks;
        float progress = 1.0f - elapsed / (float) shakeDuration;
        float intensity = shakeStrength * progress;
        float yawOffset = (RANDOM.nextFloat() - 0.5f) * 2.0f * intensity;
        float pitchOffset = (RANDOM.nextFloat() - 0.5f) * 2.0f * intensity * 0.7f;
        float rollOffset = (RANDOM.nextFloat() - 0.5f) * 2.0f * intensity * 0.5f;

        event.setYaw(event.getYaw() + yawOffset);
        event.setPitch(Mth.clamp(event.getPitch() + pitchOffset, -90.0f, 90.0f));
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
        if (overlayTicks > 0) {
            --overlayTicks;
        }
    }

    @SubscribeEvent
    public static void onRenderOverlay(RenderGuiOverlayEvent.Post event) {
        if (overlayTicks <= 0 || overlayDuration <= 0) {
            return;
        }
        if (!event.getOverlay().id().equals(VanillaGuiOverlay.VIGNETTE.id())) {
            return;
        }

        Minecraft minecraft = Minecraft.getInstance();
        if (minecraft.player == null) {
            return;
        }

        float progress = overlayTicks / (float) overlayDuration;
        float alpha = MAX_OVERLAY_ALPHA * progress;
        if (alpha <= 0.0f) {
            return;
        }

        try {
            GuiGraphics guiGraphics = event.getGuiGraphics();
            int width = minecraft.getWindow().getGuiScaledWidth();
            int height = minecraft.getWindow().getGuiScaledHeight();
            int alphaChannel = ((int) (alpha * 255.0f) & 0xFF);
            int color = (alphaChannel << 24) | 0x00FFFFFF;
            guiGraphics.fill(0, 0, width, height, color);
        } catch (Exception exception) {
            LOGGER.debug("Failed to render smoke overlay: {}", exception.toString());
        }
    }
}
