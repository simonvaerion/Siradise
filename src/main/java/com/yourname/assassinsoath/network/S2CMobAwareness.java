package com.yourname.assassinsoath.network;

import com.yourname.assassinsoath.client.hud.StealthOverlay;
import java.util.function.Supplier;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.network.NetworkEvent;

public record S2CMobAwareness(int entityId, float detection, int stage) {
    public static void encode(S2CMobAwareness message, FriendlyByteBuf buffer) {
        buffer.writeVarInt(message.entityId);
        buffer.writeFloat(message.detection);
        buffer.writeVarInt(message.stage);
    }

    public static S2CMobAwareness decode(FriendlyByteBuf buffer) {
        return new S2CMobAwareness(buffer.readVarInt(), buffer.readFloat(), buffer.readVarInt());
    }

    public static void handle(S2CMobAwareness message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            if (context.getDirection().getReceptionSide() == LogicalSide.CLIENT) {
                StealthOverlay.updateMobAwareness(message.entityId(), message.detection(), message.stage());
            }
        }));
        context.setPacketHandled(true);
    }
}
