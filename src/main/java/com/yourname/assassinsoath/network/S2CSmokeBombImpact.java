package com.yourname.assassinsoath.network;

import com.yourname.assassinsoath.client.effect.SmokeBombClientEffects;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public record S2CSmokeBombImpact(int shakeDuration, float shakeStrength, int blurDuration) {
    public void encode(FriendlyByteBuf buf) {
        buf.writeVarInt(shakeDuration);
        buf.writeFloat(shakeStrength);
        buf.writeVarInt(blurDuration);
    }

    public static S2CSmokeBombImpact decode(FriendlyByteBuf buf) {
        int shake = buf.readVarInt();
        float strength = buf.readFloat();
        int blur = buf.readVarInt();
        return new S2CSmokeBombImpact(shake, strength, blur);
    }

    public static void handle(S2CSmokeBombImpact message, Supplier<NetworkEvent.Context> ctx) {
        NetworkEvent.Context context = ctx.get();
        context.enqueueWork(() -> DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> () -> new ClientHandler(message)));
        context.setPacketHandled(true);
    }

    @OnlyIn(Dist.CLIENT)
    private static class ClientHandler implements DistExecutor.SafeRunnable {
        private final S2CSmokeBombImpact message;

        private ClientHandler(S2CSmokeBombImpact message) {
            this.message = message;
        }

        @Override
        public void run() {
            SmokeBombClientEffects.trigger(message.shakeDuration(), message.shakeStrength(), message.blurDuration());
        }
    }
}

