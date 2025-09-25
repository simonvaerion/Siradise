package com.yourname.assassinsoath.network;

import com.yourname.assassinsoath.client.hud.StealthOverlay;
import java.util.function.Supplier;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.network.NetworkEvent;

public record S2CMobAwareness(int entityId, float detection, int stage) {

  public static void encode(S2CMobAwareness pkt, FriendlyByteBuf buf) {
    buf.writeVarInt(pkt.entityId);
    buf.writeFloat(pkt.detection);
    buf.writeVarInt(pkt.stage);
  }

  public static S2CMobAwareness decode(FriendlyByteBuf buf) {
    return new S2CMobAwareness(buf.readVarInt(), buf.readFloat(), buf.readVarInt());
  }

  public static void handle(S2CMobAwareness pkt, Supplier<NetworkEvent.Context> ctx) {
    NetworkEvent.Context c = ctx.get();
    c.enqueueWork(
        () ->
            DistExecutor.unsafeRunWhenOn(
                Dist.CLIENT,
                () ->
                    () -> {
                      if (c.getDirection().getReceptionSide() == LogicalSide.CLIENT) {
                        StealthOverlay.updateMobAwareness(
                            pkt.entityId(), pkt.detection(), pkt.stage());
                      }
                    }));
    c.setPacketHandled(true);
  }
}
