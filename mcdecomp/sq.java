/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

@ChannelHandler.Sharable
public class sq
extends MessageToByteEncoder<ByteBuf> {
    private static final int a = 3;

    protected void a(ChannelHandlerContext $$0, ByteBuf $$1, ByteBuf $$2) {
        int $$3 = $$1.readableBytes();
        int $$4 = sf.a($$3);
        if ($$4 > 3) {
            throw new IllegalArgumentException("unable to fit " + $$3 + " into 3");
        }
        sf $$5 = new sf($$2);
        $$5.ensureWritable($$4 + $$3);
        $$5.d($$3);
        $$5.writeBytes($$1, $$1.readerIndex(), $$3);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) throws Exception {
        this.a(channelHandlerContext, (ByteBuf)object, byteBuf);
    }
}

