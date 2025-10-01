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

public record S2CMobAwareness(int entityId, float detection, int stage) {
    public static void encode(S2CMobAwareness pkt, FriendlyByteBuf buf) {
        buf.m_130130_(pkt.entityId);
        buf.writeFloat(pkt.detection);
        buf.m_130130_(pkt.stage);
    }

    public static S2CMobAwareness decode(FriendlyByteBuf buf) {
        return new S2CMobAwareness(buf.m_130242_(), buf.readFloat(), buf.m_130242_());
    }

    public static void handle(S2CMobAwareness pkt, Supplier<NetworkEvent.Context> ctx) {
        NetworkEvent.Context c = ctx.get();
        c.enqueueWork(() -> DistExecutor.unsafeRunWhenOn((Dist)Dist.CLIENT, () -> () -> {
            if (c.getDirection().getReceptionSide() == LogicalSide.CLIENT) {
                StealthOverlay.updateMobAwareness(pkt.entityId(), pkt.detection(), pkt.stage());
            }
        }));
        c.setPacketHandled(true);
    }
}

