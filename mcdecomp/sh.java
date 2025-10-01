/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.EncoderException
 *  io.netty.handler.codec.MessageToMessageEncoder
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.EncoderException;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;

public class sh
extends MessageToMessageEncoder<uo<?>> {
    private final up a;

    public sh(up $$0) {
        this.a = $$0;
    }

    protected void a(ChannelHandlerContext $$0, uo<?> $$1, List<Object> $$2) throws Exception {
        un.b $$3 = (un.b)$$0.channel().attr(un.a).get();
        if ($$3 == null) {
            throw new EncoderException("Bundler not configured: " + $$1);
        }
        $$3.a(this.a).a($$1, $$2::add);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, List list) throws Exception {
        this.a(channelHandlerContext, (uo)object, list);
    }
}

