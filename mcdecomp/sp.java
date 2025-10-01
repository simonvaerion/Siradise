/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.CorruptedFrameException
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;

public class sp
extends ByteToMessageDecoder {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void decode(ChannelHandlerContext $$0, ByteBuf $$1, List<Object> $$2) {
        $$1.markReaderIndex();
        byte[] $$3 = new byte[3];
        for (int $$4 = 0; $$4 < $$3.length; ++$$4) {
            if (!$$1.isReadable()) {
                $$1.resetReaderIndex();
                return;
            }
            $$3[$$4] = $$1.readByte();
            if ($$3[$$4] < 0) continue;
            sf $$5 = new sf(Unpooled.wrappedBuffer((byte[])$$3));
            try {
                int $$6 = $$5.m();
                if ($$1.readableBytes() < $$6) {
                    $$1.resetReaderIndex();
                    return;
                }
                $$2.add($$1.readBytes($$6));
                return;
            }
            finally {
                $$5.release();
            }
        }
        throw new CorruptedFrameException("length wider than 21-bit");
    }
}

