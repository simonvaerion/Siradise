package com.yourname.assassinsoath.network;

import com.yourname.assassinsoath.client.effect.SmokeBombClientEffects;
import java.io.Serializable;
import java.util.function.Supplier;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.network.NetworkEvent;

public record S2CSmokeBombImpact(int shakeDuration, float shakeStrength, int blurDuration) {
    public static void encode(S2CSmokeBombImpact message, FriendlyByteBuf buffer) {
        buffer.writeVarInt(message.shakeDuration);
        buffer.writeFloat(message.shakeStrength);
        buffer.writeVarInt(message.blurDuration);
    }

    public static S2CSmokeBombImpact decode(FriendlyByteBuf buffer) {
        return new S2CSmokeBombImpact(buffer.readVarInt(), buffer.readFloat(), buffer.readVarInt());
    }

    public static void handle(S2CSmokeBombImpact message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> new ClientHandler(message)));
        context.setPacketHandled(true);
    }

    @OnlyIn(Dist.CLIENT)
    private record ClientHandler(S2CSmokeBombImpact payload) implements DistExecutor.SafeRunnable, Serializable {
        @Override
        public void run() {
            SmokeBombClientEffects.trigger(payload.shakeDuration(), payload.shakeStrength(), payload.blurDuration());
        }
    }
}
