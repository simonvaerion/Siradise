/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.FriendlyByteBuf
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 *  net.minecraftforge.fml.DistExecutor
 *  net.minecraftforge.fml.DistExecutor$SafeRunnable
 *  net.minecraftforge.network.NetworkEvent$Context
 */
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
    public void encode(FriendlyByteBuf buf) {
        buf.m_130130_(this.shakeDuration);
        buf.writeFloat(this.shakeStrength);
        buf.m_130130_(this.blurDuration);
    }

    public static S2CSmokeBombImpact decode(FriendlyByteBuf buf) {
        int shake = buf.m_130242_();
        float strength = buf.readFloat();
        int blur = buf.m_130242_();
        return new S2CSmokeBombImpact(shake, strength, blur);
    }

    public static void handle(S2CSmokeBombImpact message, Supplier<NetworkEvent.Context> ctx) {
        NetworkEvent.Context context = ctx.get();
        context.enqueueWork(() -> DistExecutor.safeRunWhenOn((Dist)Dist.CLIENT, () -> (DistExecutor.SafeRunnable & Serializable)() -> new ClientHandler(message)));
        context.setPacketHandled(true);
    }

    @OnlyIn(value=Dist.CLIENT)
    private static class ClientHandler
    implements DistExecutor.SafeRunnable {
        private final S2CSmokeBombImpact message;

        private ClientHandler(S2CSmokeBombImpact message) {
            this.message = message;
        }

        public void run() {
            SmokeBombClientEffects.trigger(this.message.shakeDuration(), this.message.shakeStrength(), this.message.blurDuration());
        }
    }
}

