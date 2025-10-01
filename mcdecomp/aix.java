/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.mojang.logging.LogUtils
 *  io.netty.bootstrap.ServerBootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.epoll.Epoll
 *  io.netty.channel.epoll.EpollEventLoopGroup
 *  io.netty.channel.epoll.EpollServerSocketChannel
 *  io.netty.channel.local.LocalAddress
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioServerSocketChannel
 *  io.netty.handler.timeout.ReadTimeoutHandler
 *  io.netty.util.HashedWheelTimer
 *  io.netty.util.Timeout
 *  io.netty.util.Timer
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import io.netty.util.Timer;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aix {
    private static final Logger d = LogUtils.getLogger();
    public static final aov<NioEventLoopGroup> a = new aov<NioEventLoopGroup>(() -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Server IO #%d").setDaemon(true).build()));
    public static final aov<EpollEventLoopGroup> b = new aov<EpollEventLoopGroup>(() -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Server IO #%d").setDaemon(true).build()));
    final MinecraftServer e;
    public volatile boolean c;
    private final List<ChannelFuture> f = Collections.synchronizedList(Lists.newArrayList());
    final List<sd> g = Collections.synchronizedList(Lists.newArrayList());

    public aix(MinecraftServer $$0) {
        this.e = $$0;
        this.c = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(@Nullable InetAddress $$0, int $$1) throws IOException {
        List<ChannelFuture> list = this.f;
        synchronized (list) {
            aov<NioEventLoopGroup> $$5;
            Class<NioServerSocketChannel> $$4;
            if (Epoll.isAvailable() && this.e.n()) {
                Class<EpollServerSocketChannel> $$2 = EpollServerSocketChannel.class;
                aov<EpollEventLoopGroup> $$3 = b;
                d.info("Using epoll channel type");
            } else {
                $$4 = NioServerSocketChannel.class;
                $$5 = a;
                d.info("Using default channel type");
            }
            this.f.add(((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel($$4)).childHandler((ChannelHandler)new ChannelInitializer<Channel>(){

                protected void initChannel(Channel $$0) {
                    try {
                        $$0.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
                    }
                    catch (ChannelException channelException) {
                        // empty catch block
                    }
                    ChannelPipeline $$1 = $$0.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30)).addLast("legacy_query", (ChannelHandler)new aiv(aix.this));
                    sd.a($$1, up.a);
                    int $$2 = aix.this.e.m();
                    sd $$3 = $$2 > 0 ? new sm($$2) : new sd(up.a);
                    aix.this.g.add($$3);
                    $$1.addLast("packet_handler", (ChannelHandler)$$3);
                    $$3.a(new aiz(aix.this.e, $$3));
                }
            }).group((EventLoopGroup)$$5.a()).localAddress($$0, $$1)).bind().syncUninterruptibly());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public SocketAddress a() {
        void $$1;
        List<ChannelFuture> list = this.f;
        synchronized (list) {
            ChannelFuture $$0 = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class)).childHandler((ChannelHandler)new ChannelInitializer<Channel>(){

                protected void initChannel(Channel $$0) {
                    sd $$1 = new sd(up.a);
                    $$1.a(new aiw(aix.this.e, $$1));
                    aix.this.g.add($$1);
                    ChannelPipeline $$2 = $$0.pipeline();
                    $$2.addLast("packet_handler", (ChannelHandler)$$1);
                }
            }).group((EventLoopGroup)a.a()).localAddress((SocketAddress)LocalAddress.ANY)).bind().syncUninterruptibly();
            this.f.add($$0);
        }
        return $$1.channel().localAddress();
    }

    public void b() {
        this.c = false;
        for (ChannelFuture $$0 : this.f) {
            try {
                $$0.channel().close().sync();
            }
            catch (InterruptedException $$1) {
                d.error("Interrupted whilst closing channel");
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        List<sd> list = this.g;
        synchronized (list) {
            Iterator<sd> $$0 = this.g.iterator();
            while ($$0.hasNext()) {
                sd $$1 = $$0.next();
                if ($$1.i()) continue;
                if ($$1.h()) {
                    try {
                        $$1.a();
                    }
                    catch (Exception $$2) {
                        if ($$1.d()) {
                            throw new y(o.a($$2, "Ticking memory connection"));
                        }
                        d.warn("Failed to handle packet for {}", (Object)$$1.c(), (Object)$$2);
                        tj $$3 = sw.b("Internal server error");
                        $$1.a(new vs($$3), sl.a(() -> $$1.a($$3)));
                        $$1.l();
                    }
                    continue;
                }
                $$0.remove();
                $$1.m();
            }
        }
    }

    public MinecraftServer d() {
        return this.e;
    }

    public List<sd> e() {
        return this.g;
    }

    static class aix$a
    extends ChannelInboundHandlerAdapter {
        private static final Timer a = new HashedWheelTimer();
        private final int b;
        private final int c;
        private final List<a> d = Lists.newArrayList();

        public aix$a(int $$0, int $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public void channelRead(ChannelHandlerContext $$0, Object $$1) {
            this.a($$0, $$1);
        }

        private void a(ChannelHandlerContext $$0, Object $$1) {
            int $$2 = this.b + (int)(Math.random() * (double)this.c);
            this.d.add(new a($$0, $$1));
            a.newTimeout(this::a, (long)$$2, TimeUnit.MILLISECONDS);
        }

        private void a(Timeout $$0) {
            a $$1 = this.d.remove(0);
            $$1.a.fireChannelRead($$1.b);
        }

        static class a {
            public final ChannelHandlerContext a;
            public final Object b;

            public a(ChannelHandlerContext $$0, Object $$1) {
                this.a = $$0;
                this.b = $$1;
            }
        }
    }
}

