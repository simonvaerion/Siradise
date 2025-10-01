/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.mojang.logging.LogUtils
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.DefaultEventLoopGroup
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.channel.epoll.Epoll
 *  io.netty.channel.epoll.EpollEventLoopGroup
 *  io.netty.channel.epoll.EpollSocketChannel
 *  io.netty.channel.local.LocalChannel
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.handler.timeout.ReadTimeoutHandler
 *  io.netty.handler.timeout.TimeoutException
 *  io.netty.util.AttributeKey
 *  io.netty.util.concurrent.GenericFutureListener
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.Validate
 *  org.slf4j.Logger
 *  org.slf4j.Marker
 *  org.slf4j.MarkerFactory
 */
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.DefaultEventLoopGroup;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Queue;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class sd
extends SimpleChannelInboundHandler<uo<?>> {
    private static final float i = 0.75f;
    private static final Logger j = LogUtils.getLogger();
    public static final Marker a = MarkerFactory.getMarker((String)"NETWORK");
    public static final Marker b = ac.a(MarkerFactory.getMarker((String)"NETWORK_PACKETS"), (T $$0) -> $$0.add(a));
    public static final Marker c = ac.a(MarkerFactory.getMarker((String)"PACKET_RECEIVED"), (T $$0) -> $$0.add(b));
    public static final Marker d = ac.a(MarkerFactory.getMarker((String)"PACKET_SENT"), (T $$0) -> $$0.add(b));
    public static final AttributeKey<se> e = AttributeKey.valueOf((String)"protocol");
    public static final aov<NioEventLoopGroup> f = new aov<NioEventLoopGroup>(() -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build()));
    public static final aov<EpollEventLoopGroup> g = new aov<EpollEventLoopGroup>(() -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build()));
    public static final aov<DefaultEventLoopGroup> h = new aov<DefaultEventLoopGroup>(() -> new DefaultEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build()));
    private final up k;
    private final Queue<a> l = Queues.newConcurrentLinkedQueue();
    private Channel m;
    private SocketAddress n;
    private sk o;
    private sw p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private float u;
    private float v;
    private int w;
    private boolean x;
    @Nullable
    private volatile sw y;

    public sd(up $$0) {
        this.k = $$0;
    }

    public void channelActive(ChannelHandlerContext $$0) throws Exception {
        super.channelActive($$0);
        this.m = $$0.channel();
        this.n = this.m.remoteAddress();
        try {
            this.a(se.a);
        }
        catch (Throwable $$1) {
            j.error(LogUtils.FATAL_MARKER, "Failed to change protocol to handshake", $$1);
        }
        if (this.y != null) {
            this.a(this.y);
        }
    }

    public void a(se $$0) {
        this.m.attr(e).set((Object)$$0);
        this.m.attr(un.a).set((Object)$$0);
        this.m.config().setAutoRead(true);
        j.debug("Enabled auto read");
    }

    public void channelInactive(ChannelHandlerContext $$0) {
        this.a(sw.c("disconnect.endOfStream"));
    }

    public void exceptionCaught(ChannelHandlerContext $$0, Throwable $$1) {
        if ($$1 instanceof sn) {
            j.debug("Skipping packet due to errors", $$1.getCause());
            return;
        }
        boolean $$2 = !this.x;
        this.x = true;
        if (!this.m.isOpen()) {
            return;
        }
        if ($$1 instanceof TimeoutException) {
            j.debug("Timeout", $$1);
            this.a(sw.c("disconnect.timeout"));
        } else {
            tj $$3 = sw.a("disconnect.genericReason", new Object[]{"Internal Exception: " + $$1});
            if ($$2) {
                j.debug("Failed to sent packet", $$1);
                se $$4 = this.p();
                uo<abe> $$5 = $$4 == se.d ? new abj($$3) : new vs($$3);
                this.a($$5, sl.a(() -> this.a($$3)));
                this.l();
            } else {
                j.debug("Double fault", $$1);
                this.a($$3);
            }
        }
    }

    protected void a(ChannelHandlerContext $$0, uo<?> $$1) {
        if (this.m.isOpen()) {
            try {
                sd.a($$1, this.o);
            }
            catch (adb adb2) {
            }
            catch (RejectedExecutionException $$2) {
                this.a(sw.c("multiplayer.disconnect.server_shutdown"));
            }
            catch (ClassCastException $$3) {
                j.error("Received {} that couldn't be processed", $$1.getClass(), (Object)$$3);
                this.a(sw.c("multiplayer.disconnect.invalid_packet"));
            }
            ++this.s;
        }
    }

    private static <T extends sk> void a(uo<T> $$0, sk $$1) {
        $$0.a($$1);
    }

    public void a(sk $$0) {
        Validate.notNull((Object)$$0, (String)"packetListener", (Object[])new Object[0]);
        this.o = $$0;
    }

    public void a(uo<?> $$0) {
        this.a($$0, null);
    }

    public void a(uo<?> $$0, @Nullable sl $$1) {
        if (this.h()) {
            this.q();
            this.b($$0, $$1);
        } else {
            this.l.add(new a($$0, $$1));
        }
    }

    private void b(uo<?> $$0, @Nullable sl $$1) {
        se $$2 = se.a($$0);
        se $$3 = this.p();
        ++this.t;
        if ($$3 != $$2) {
            if ($$2 == null) {
                throw new IllegalStateException("Encountered packet without set protocol: " + $$0);
            }
            j.debug("Disabled auto read");
            this.m.config().setAutoRead(false);
        }
        if (this.m.eventLoop().inEventLoop()) {
            this.a($$0, $$1, $$2, $$3);
        } else {
            this.m.eventLoop().execute(() -> this.a($$0, $$1, $$2, $$3));
        }
    }

    private void a(uo<?> $$0, @Nullable sl $$12, se $$2, se $$3) {
        if ($$2 != $$3) {
            this.a($$2);
        }
        ChannelFuture $$4 = this.m.writeAndFlush($$0);
        if ($$12 != null) {
            $$4.addListener($$1 -> {
                if ($$1.isSuccess()) {
                    $$12.a();
                } else {
                    uo<?> $$2 = $$12.b();
                    if ($$2 != null) {
                        ChannelFuture $$3 = this.m.writeAndFlush($$2);
                        $$3.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
                    }
                }
            });
        }
        $$4.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
    }

    private se p() {
        return (se)this.m.attr(e).get();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void q() {
        if (this.m == null || !this.m.isOpen()) {
            return;
        }
        Queue<a> queue = this.l;
        synchronized (queue) {
            a $$0;
            while (($$0 = this.l.poll()) != null) {
                this.b($$0.a, $$0.b);
            }
        }
    }

    public void a() {
        this.q();
        sk sk2 = this.o;
        if (sk2 instanceof so) {
            so $$0 = (so)sk2;
            $$0.c();
        }
        if (!this.h() && !this.r) {
            this.m();
        }
        if (this.m != null) {
            this.m.flush();
        }
        if (this.w++ % 20 == 0) {
            this.b();
        }
    }

    protected void b() {
        this.v = apa.i(0.75f, this.t, this.v);
        this.u = apa.i(0.75f, this.s, this.u);
        this.t = 0;
        this.s = 0;
    }

    public SocketAddress c() {
        return this.n;
    }

    public void a(sw $$0) {
        if (this.m == null) {
            this.y = $$0;
        }
        if (this.h()) {
            this.m.close().awaitUninterruptibly();
            this.p = $$0;
        }
    }

    public boolean d() {
        return this.m instanceof LocalChannel || this.m instanceof LocalServerChannel;
    }

    public up e() {
        return this.k;
    }

    public up f() {
        return this.k.a();
    }

    public static sd a(InetSocketAddress $$0, boolean $$1) {
        sd $$2 = new sd(up.b);
        ChannelFuture $$3 = sd.a($$0, $$1, $$2);
        $$3.syncUninterruptibly();
        return $$2;
    }

    public static ChannelFuture a(InetSocketAddress $$0, boolean $$1, final sd $$2) {
        aov<NioEventLoopGroup> $$6;
        Class<NioSocketChannel> $$5;
        if (Epoll.isAvailable() && $$1) {
            Class<EpollSocketChannel> $$3 = EpollSocketChannel.class;
            aov<EpollEventLoopGroup> $$4 = g;
        } else {
            $$5 = NioSocketChannel.class;
            $$6 = f;
        }
        return ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)$$6.a())).handler((ChannelHandler)new ChannelInitializer<Channel>(){

            protected void initChannel(Channel $$0) {
                try {
                    $$0.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
                }
                catch (ChannelException channelException) {
                    // empty catch block
                }
                ChannelPipeline $$1 = $$0.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30));
                sd.a($$1, up.b);
                $$1.addLast("packet_handler", (ChannelHandler)$$2);
            }
        })).channel($$5)).connect($$0.getAddress(), $$0.getPort());
    }

    public static void a(ChannelPipeline $$0, up $$1) {
        up $$2 = $$1.a();
        $$0.addLast("splitter", (ChannelHandler)new sp()).addLast("decoder", (ChannelHandler)new si($$1)).addLast("prepender", (ChannelHandler)new sq()).addLast("encoder", (ChannelHandler)new sj($$2)).addLast("unbundler", (ChannelHandler)new sh($$2)).addLast("bundler", (ChannelHandler)new sg($$1));
    }

    public static sd a(SocketAddress $$0) {
        final sd $$1 = new sd(up.b);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)h.a())).handler((ChannelHandler)new ChannelInitializer<Channel>(){

            protected void initChannel(Channel $$0) {
                ChannelPipeline $$12 = $$0.pipeline();
                $$12.addLast("packet_handler", (ChannelHandler)$$1);
            }
        })).channel(LocalChannel.class)).connect($$0).syncUninterruptibly();
        return $$1;
    }

    public void a(Cipher $$0, Cipher $$1) {
        this.q = true;
        this.m.pipeline().addBefore("splitter", "decrypt", (ChannelHandler)new rz($$0));
        this.m.pipeline().addBefore("prepender", "encrypt", (ChannelHandler)new sa($$1));
    }

    public boolean g() {
        return this.q;
    }

    public boolean h() {
        return this.m != null && this.m.isOpen();
    }

    public boolean i() {
        return this.m == null;
    }

    public sk j() {
        return this.o;
    }

    @Nullable
    public sw k() {
        return this.p;
    }

    public void l() {
        if (this.m != null) {
            this.m.config().setAutoRead(false);
        }
    }

    public void a(int $$0, boolean $$1) {
        if ($$0 >= 0) {
            if (this.m.pipeline().get("decompress") instanceof sb) {
                ((sb)this.m.pipeline().get("decompress")).a($$0, $$1);
            } else {
                this.m.pipeline().addBefore("decoder", "decompress", (ChannelHandler)new sb($$0, $$1));
            }
            if (this.m.pipeline().get("compress") instanceof sc) {
                ((sc)this.m.pipeline().get("compress")).a($$0);
            } else {
                this.m.pipeline().addBefore("encoder", "compress", (ChannelHandler)new sc($$0));
            }
        } else {
            if (this.m.pipeline().get("decompress") instanceof sb) {
                this.m.pipeline().remove("decompress");
            }
            if (this.m.pipeline().get("compress") instanceof sc) {
                this.m.pipeline().remove("compress");
            }
        }
    }

    public void m() {
        if (this.m == null || this.m.isOpen()) {
            return;
        }
        if (this.r) {
            j.warn("handleDisconnection() called twice");
        } else {
            this.r = true;
            if (this.k() != null) {
                this.j().a(this.k());
            } else if (this.j() != null) {
                this.j().a(sw.c("multiplayer.disconnect.generic"));
            }
        }
    }

    public float n() {
        return this.u;
    }

    public float o() {
        return this.v;
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        this.a(channelHandlerContext, (uo)object);
    }

    static class a {
        final uo<?> a;
        @Nullable
        final sl b;

        public a(uo<?> $$0, @Nullable sl $$1) {
            this.a = $$0;
            this.b = $$1;
        }
    }
}

