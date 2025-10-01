/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.FriendlyByteBuf
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.fml.DistExecutor
 *  net.minecraftforge.fml.LogicalSide
 *  net.minecraftforge.network.NetworkEvent$Context
 */
package com.yourname.assassinsoath.network;

import com.yourname.assassinsoath.client.hud.StealthOverlay;
import java.util.function.Supplier;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.network.NetworkEvent;

public record S2CStealthHud(float visibility, int aiStage) {
    public static void encode(S2CStealthHud pkt, FriendlyByteBuf buf) {
        buf.writeFloat(pkt.visibility);
        buf.m_130130_(pkt.aiStage);
    }

    public static S2CStealthHud decode(FriendlyByteBuf buf) {
        return new S2CStealthHud(buf.readFloat(), buf.m_130242_());
    }

    public static void handle(S2CStealthHud pkt, Supplier<NetworkEvent.Context> ctx) {
        NetworkEvent.Context c = ctx.get();
        c.enqueueWork(() -> DistExecutor.unsafeRunWhenOn((Dist)Dist.CLIENT, () -> () -> {
            if (c.getDirection().getReceptionSide() == LogicalSide.CLIENT) {
                StealthOverlay.CLIENT_VIS = pkt.visibility();
                StealthOverlay.CLIENT_ALERT_STAGE = pkt.aiStage();
                StealthOverlay.LAST_UPDATE_MS = System.currentTimeMillis();
            }
        }));
        c.setPacketHandled(true);
    }
}

