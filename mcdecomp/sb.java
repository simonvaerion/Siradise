/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.DecoderException
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import java.util.List;
import java.util.zip.Inflater;

public class sb
extends ByteToMessageDecoder {
    public static final int a = 0x200000;
    public static final int b = 0x800000;
    private final Inflater c;
    private int d;
    private boolean e;

    public sb(int $$0, boolean $$1) {
        this.d = $$0;
        this.e = $$1;
        this.c = new Inflater();
    }

    protected void decode(ChannelHandlerContext $$0, ByteBuf $$1, List<Object> $$2) throws Exception {
        if ($$1.readableBytes() == 0) {
            return;
        }
        sf $$3 = new sf($$1);
        int $$4 = $$3.m();
        if ($$4 == 0) {
            $$2.add($$3.readBytes($$3.readableBytes()));
            return;
        }
        if (this.e) {
            if ($$4 < this.d) {
                throw new DecoderException("Badly compressed packet - size of " + $$4 + " is below server threshold of " + this.d);
            }
            if ($$4 > 0x800000) {
                throw new DecoderException("Badly compressed packet - size of " + $$4 + " is larger than protocol maximum of 8388608");
            }
        }
        byte[] $$5 = new byte[$$3.readableBytes()];
        $$3.readBytes($$5);
        this.c.setInput($$5);
        byte[] $$6 = new byte[$$4];
        this.c.inflate($$6);
        $$2.add(Unpooled.wrappedBuffer((byte[])$$6));
        this.c.reset();
    }

    public void a(int $$0, boolean $$1) {
        this.d = $$0;
        this.e = $$1;
    }
}

