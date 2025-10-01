/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.slf4j.Logger
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fff {
    static final Splitter a = Splitter.on((char)'\u0000').limit(6);
    private static final Logger b = LogUtils.getLogger();
    private static final sw c = sw.c("multiplayer.status.cannot_connect").a($$0 -> $$0.a(-65536));
    private final List<sd> d = Collections.synchronizedList(Lists.newArrayList());

    public void a(final ffd $$0, final Runnable $$1) throws UnknownHostException {
        fga $$2 = fga.a($$0.b);
        Optional<InetSocketAddress> $$3 = fgc.a.a($$2).map(ffz::d);
        if (!$$3.isPresent()) {
            this.a(etl.a, $$0);
            return;
        }
        final InetSocketAddress $$4 = $$3.get();
        final sd $$5 = sd.a($$4, false);
        this.d.add($$5);
        $$0.d = sw.c("multiplayer.status.pinging");
        $$0.f = -1L;
        $$0.j = Collections.emptyList();
        $$5.a(new abq(){
            private boolean f;
            private boolean g;
            private long h;

            @Override
            public void a(abs $$02) {
                if (this.g) {
                    $$5.a(sw.c("multiplayer.status.unrequested"));
                    return;
                }
                this.g = true;
                abt $$12 = $$02.a();
                $$0.d = $$12.a();
                $$12.c().ifPresentOrElse($$1 -> {
                    $$02.h = sw.b($$1.b());
                    $$02.g = $$1.c();
                }, () -> {
                    $$02.h = sw.c("multiplayer.status.old");
                    $$02.g = 0;
                });
                $$12.b().ifPresentOrElse($$1 -> {
                    $$02.c = fff.a($$1.b(), $$1.a());
                    $$02.e = $$1;
                    if (!$$1.c().isEmpty()) {
                        ArrayList<sw> $$2 = new ArrayList<sw>($$1.c().size());
                        for (GameProfile $$3 : $$1.c()) {
                            $$2.add(sw.b($$3.getName()));
                        }
                        if ($$1.c().size() < $$1.b()) {
                            $$2.add(sw.a("multiplayer.status.and_more", $$1.b() - $$1.c().size()));
                        }
                        $$02.j = $$2;
                    } else {
                        $$02.j = List.of();
                    }
                }, () -> {
                    $$02.c = sw.c("multiplayer.status.unknown").a(n.i);
                });
                $$12.d().ifPresent($$2 -> {
                    if (!Arrays.equals($$2.a(), $$0.c())) {
                        $$0.a($$2.a());
                        $$1.run();
                    }
                });
                this.h = ac.b();
                $$5.a(new abv(this.h));
                this.f = true;
            }

            @Override
            public void a(abr $$02) {
                long $$12 = this.h;
                long $$2 = ac.b();
                $$0.f = $$2 - $$12;
                $$5.a(sw.c("multiplayer.status.finished"));
            }

            @Override
            public void a(sw $$02) {
                if (!this.f) {
                    fff.this.a($$02, $$0);
                    fff.this.a($$4, $$0);
                }
            }

            @Override
            public boolean a() {
                return $$5.h();
            }
        });
        try {
            $$5.a(new abb($$2.a(), $$2.b(), se.c));
            $$5.a(new abw());
        }
        catch (Throwable $$6) {
            b.error("Failed to ping server {}", (Object)$$2, (Object)$$6);
        }
    }

    void a(sw $$0, ffd $$1) {
        b.error("Can't ping {}: {}", (Object)$$1.b, (Object)$$0.getString());
        $$1.d = c;
        $$1.c = sv.a;
    }

    void a(final InetSocketAddress $$0, final ffd $$1) {
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)sd.f.a())).handler((ChannelHandler)new ChannelInitializer<Channel>(){

            protected void initChannel(Channel $$02) {
                try {
                    $$02.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
                }
                catch (ChannelException channelException) {
                    // empty catch block
                }
                $$02.pipeline().addLast(new ChannelHandler[]{new SimpleChannelInboundHandler<ByteBuf>(){

                    /*
                     * WARNING - Removed try catching itself - possible behaviour change.
                     */
                    public void channelActive(ChannelHandlerContext $$0) throws Exception {
                        super.channelActive($$0);
                        ByteBuf $$1 = Unpooled.buffer();
                        try {
                            $$1.writeByte(254);
                            $$1.writeByte(1);
                            $$1.writeByte(250);
                            char[] $$2 = "MC|PingHost".toCharArray();
                            $$1.writeShort($$2.length);
                            for (char $$3 : $$2) {
                                $$1.writeChar((int)$$3);
                            }
                            $$1.writeShort(7 + 2 * $$0.getHostName().length());
                            $$1.writeByte(127);
                            $$2 = $$0.getHostName().toCharArray();
                            $$1.writeShort($$2.length);
                            for (char $$4 : $$2) {
                                $$1.writeChar((int)$$4);
                            }
                            $$1.writeInt($$0.getPort());
                            $$0.channel().writeAndFlush((Object)$$1).addListener((GenericFutureListener)ChannelFutureListener.CLOSE_ON_FAILURE);
                        }
                        finally {
                            $$1.release();
                        }
                    }

                    protected void a(ChannelHandlerContext $$0, ByteBuf $$1) {
                        String $$3;
                        String[] $$4;
                        short $$2 = $$1.readUnsignedByte();
                        if ($$2 == 255 && "\u00a71".equals(($$4 = (String[])Iterables.toArray((Iterable)fff.a.split((CharSequence)($$3 = new String($$1.readBytes($$1.readShort() * 2).array(), StandardCharsets.UTF_16BE))), String.class))[0])) {
                            int $$5 = apa.a($$4[1], 0);
                            String $$6 = $$4[2];
                            String $$7 = $$4[3];
                            int $$8 = apa.a($$4[4], -1);
                            int $$9 = apa.a($$4[5], -1);
                            $$1.g = -1;
                            $$1.h = sw.b($$6);
                            $$1.d = sw.b($$7);
                            $$1.c = fff.a($$8, $$9);
                            $$1.e = new abt.b($$9, $$8, List.of());
                        }
                        $$0.close();
                    }

                    public void exceptionCaught(ChannelHandlerContext $$0, Throwable $$1) {
                        $$0.close();
                    }

                    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
                        this.a(channelHandlerContext, (ByteBuf)object);
                    }
                }});
            }
        })).channel(NioSocketChannel.class)).connect($$0.getAddress(), $$0.getPort());
    }

    static sw a(int $$0, int $$1) {
        return sw.b(Integer.toString($$0)).b(sw.b("/").a(n.i)).f(Integer.toString($$1)).a(n.h);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        List<sd> list = this.d;
        synchronized (list) {
            Iterator<sd> $$0 = this.d.iterator();
            while ($$0.hasNext()) {
                sd $$1 = $$0.next();
                if ($$1.h()) {
                    $$1.a();
                    continue;
                }
                $$0.remove();
                $$1.m();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        List<sd> list = this.d;
        synchronized (list) {
            Iterator<sd> $$0 = this.d.iterator();
            while ($$0.hasNext()) {
                sd $$1 = $$0.next();
                if (!$$1.h()) continue;
                $$0.remove();
                $$1.a(sw.c("multiplayer.status.cancelled"));
            }
        }
    }
}

