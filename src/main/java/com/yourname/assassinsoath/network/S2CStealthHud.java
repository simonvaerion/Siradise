package com.yourname.assassinsoath.network;

import com.yourname.assassinsoath.client.hud.StealthOverlay;
import java.util.function.Supplier;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.network.NetworkEvent;

/** 伺服器→客戶端：同步 HUD 可見度與 AI 警戒階段 */
public record S2CStealthHud(float visibility, int aiStage) {

  public static void encode(S2CStealthHud pkt, FriendlyByteBuf buf) {
    buf.writeFloat(pkt.visibility);
    buf.writeVarInt(pkt.aiStage);
  }

  public static S2CStealthHud decode(FriendlyByteBuf buf) {
    return new S2CStealthHud(buf.readFloat(), buf.readVarInt());
  }

  public static void handle(S2CStealthHud pkt, Supplier<NetworkEvent.Context> ctx) {
    var c = ctx.get();
    c.enqueueWork(
        () ->
            DistExecutor.unsafeRunWhenOn(
                Dist.CLIENT,
                () ->
                    () -> {
                      if (c.getDirection().getReceptionSide() == LogicalSide.CLIENT) {
                        StealthOverlay.CLIENT_VIS = pkt.visibility();
                        StealthOverlay.CLIENT_ALERT_STAGE = pkt.aiStage();
                        StealthOverlay.LAST_UPDATE_MS = System.currentTimeMillis();
                      }
                    }));
    c.setPacketHandled(true);
  }
}
