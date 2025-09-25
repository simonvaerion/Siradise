package com.yourname.assassinsoath.network;

import com.yourname.assassinsoath.client.hud.StealthOverlay;
import java.util.function.Supplier;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.network.NetworkEvent;

public record S2CStealthHud(float visibility, int aiStage) {
    public static void encode(S2CStealthHud message, FriendlyByteBuf buffer) {
        buffer.writeFloat(message.visibility);
        buffer.writeVarInt(message.aiStage);
    }

    public static S2CStealthHud decode(FriendlyByteBuf buffer) {
        return new S2CStealthHud(buffer.readFloat(), buffer.readVarInt());
    }

    public static void handle(S2CStealthHud message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            if (context.getDirection().getReceptionSide() == LogicalSide.CLIENT) {
                StealthOverlay.CLIENT_VIS = message.visibility();
                StealthOverlay.CLIENT_ALERT_STAGE = message.aiStage();
                StealthOverlay.LAST_UPDATE_MS = System.currentTimeMillis();
            }
        }));
        context.setPacketHandled(true);
    }
}
