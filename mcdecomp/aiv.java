/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aiv
extends ChannelInboundHandlerAdapter {
    private static final Logger b = LogUtils.getLogger();
    public static final int a = 127;
    private final aix c;

    public aiv(aix $$0) {
        this.c = $$0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void channelRead(ChannelHandlerContext $$0, Object $$1) {
        ByteBuf $$2 = (ByteBuf)$$1;
        $$2.markReaderIndex();
        boolean $$3 = true;
        try {
            if ($$2.readUnsignedByte() != 254) {
                return;
            }
            InetSocketAddress $$4 = (InetSocketAddress)$$0.channel().remoteAddress();
            MinecraftServer $$5 = this.c.d();
            int $$6 = $$2.readableBytes();
            switch ($$6) {
                case 0: {
                    b.debug("Ping: (<1.3.x) from {}:{}", (Object)$$4.getAddress(), (Object)$$4.getPort());
                    String $$7 = String.format(Locale.ROOT, "%s\u00a7%d\u00a7%d", $$5.aa(), $$5.H(), $$5.I());
                    this.a($$0, this.a($$7));
                    break;
                }
                case 1: {
                    if ($$2.readUnsignedByte() != 1) {
                        return;
                    }
                    b.debug("Ping: (1.4-1.5.x) from {}:{}", (Object)$$4.getAddress(), (Object)$$4.getPort());
                    String $$8 = String.format(Locale.ROOT, "\u00a71\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, $$5.G(), $$5.aa(), $$5.H(), $$5.I());
                    this.a($$0, this.a($$8));
                    break;
                }
                default: {
                    boolean $$9 = $$2.readUnsignedByte() == 1;
                    $$9 &= $$2.readUnsignedByte() == 250;
                    $$9 &= "MC|PingHost".equals(new String($$2.readBytes($$2.readShort() * 2).array(), StandardCharsets.UTF_16BE));
                    int $$10 = $$2.readUnsignedShort();
                    $$9 &= $$2.readUnsignedByte() >= 73;
                    $$9 &= 3 + $$2.readBytes($$2.readShort() * 2).array().length + 4 == $$10;
                    $$9 &= $$2.readInt() <= 65535;
                    if (!($$9 &= $$2.readableBytes() == 0)) {
                        return;
                    }
                    b.debug("Ping: (1.6) from {}:{}", (Object)$$4.getAddress(), (Object)$$4.getPort());
                    String $$11 = String.format(Locale.ROOT, "\u00a71\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, $$5.G(), $$5.aa(), $$5.H(), $$5.I());
                    ByteBuf $$12 = this.a($$11);
                    try {
                        this.a($$0, $$12);
                        break;
                    }
                    finally {
                        $$12.release();
                    }
                }
            }
            $$2.release();
            $$3 = false;
        }
        catch (RuntimeException runtimeException) {
        }
        finally {
            if ($$3) {
                $$2.resetReaderIndex();
                $$0.channel().pipeline().remove("legacy_query");
                $$0.fireChannelRead($$1);
            }
        }
    }

    private void a(ChannelHandlerContext $$0, ByteBuf $$1) {
        $$0.pipeline().firstContext().writeAndFlush((Object)$$1).addListener((GenericFutureListener)ChannelFutureListener.CLOSE);
    }

    private ByteBuf a(String $$0) {
        ByteBuf $$1 = Unpooled.buffer();
        $$1.writeByte(255);
        char[] $$2 = $$0.toCharArray();
        $$1.writeShort($$2.length);
        for (char $$3 : $$2) {
            $$1.writeChar((int)$$3);
        }
        return $$1;
    }
}

