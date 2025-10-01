/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  io.netty.channel.ChannelFuture
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etl
extends euq {
    private static final AtomicInteger b = new AtomicInteger(0);
    static final Logger c = LogUtils.getLogger();
    private static final long k = 2000L;
    static final sw l = sw.c("connect.aborted");
    public static final sw a = sw.a("disconnect.genericReason", sw.c("disconnect.unknownHost"));
    @Nullable
    volatile sd m;
    @Nullable
    ChannelFuture n;
    volatile boolean o;
    final euq p;
    private sw q = sw.c("connect.connecting");
    private long r = -1L;
    final sw s;

    private etl(euq $$0, sw $$1) {
        super(enf.a);
        this.p = $$0;
        this.s = $$1;
    }

    public static void a(euq $$0, enn $$1, fga $$2, ffd $$3, boolean $$4) {
        if ($$1.z instanceof etl) {
            c.error("Attempt to connect while already connecting");
            return;
        }
        etl $$5 = new etl($$0, $$4 ? fjf.a : sv.p);
        $$1.y();
        $$1.aQ();
        $$1.a(ffq.a($$3 != null ? $$3.b : $$2.a()));
        $$1.aY().a(fjg.c.b, $$3.b, $$3.a);
        $$1.a($$5);
        $$5.a($$1, $$2, $$3);
    }

    private void a(final enn $$0, final fga $$1, final @Nullable ffd $$2) {
        c.info("Connecting to {}, {}", (Object)$$1.a(), (Object)$$1.b());
        Thread $$3 = new Thread("Server Connector #" + b.incrementAndGet()){

            /*
             * WARNING - Removed try catching itself - possible behaviour change.
             * WARNING - void declaration
             */
            @Override
            public void run() {
                InetSocketAddress $$02 = null;
                try {
                    if (etl.this.o) {
                        return;
                    }
                    Optional<InetSocketAddress> $$12 = fgc.a.a($$1).map(ffz::d);
                    if (etl.this.o) {
                        return;
                    }
                    if (!$$12.isPresent()) {
                        $$0.execute(() -> $$0.a(new ett(etl.this.p, etl.this.s, a)));
                        return;
                    }
                    $$02 = $$12.get();
                    etl etl2 = etl.this;
                    synchronized (etl2) {
                        if (etl.this.o) {
                            return;
                        }
                        sd $$22 = new sd(up.b);
                        etl.this.n = sd.a($$02, $$0.m.at(), $$22);
                    }
                    etl.this.n.syncUninterruptibly();
                    etl2 = etl.this;
                    synchronized (etl2) {
                        void $$3;
                        if (etl.this.o) {
                            $$3.a(l);
                            return;
                        }
                        etl.this.m = $$3;
                    }
                    etl.this.m.a(new fev(etl.this.m, $$0, $$2, etl.this.p, false, null, etl.this::a));
                    etl.this.m.a(new abb($$02.getHostName(), $$02.getPort(), se.d));
                    etl.this.m.a(new abm($$0.U().c(), Optional.ofNullable($$0.U().g())));
                }
                catch (Exception $$4) {
                    Exception $$7;
                    if (etl.this.o) {
                        return;
                    }
                    Throwable throwable = $$4.getCause();
                    if (throwable instanceof Exception) {
                        Exception $$5;
                        Exception $$6 = $$5 = (Exception)throwable;
                    } else {
                        $$7 = $$4;
                    }
                    c.error("Couldn't connect to server", (Throwable)$$4);
                    String $$8 = $$02 == null ? $$7.getMessage() : $$7.getMessage().replaceAll($$02.getHostName() + ":" + $$02.getPort(), "").replaceAll($$02.toString(), "");
                    $$0.execute(() -> $$0.a(new ett(etl.this.p, etl.this.s, sw.a("disconnect.genericReason", new Object[]{$$8}))));
                }
            }
        };
        $$3.setUncaughtExceptionHandler(new r(c));
        $$3.start();
    }

    private void a(sw $$0) {
        this.q = $$0;
    }

    @Override
    public void f() {
        if (this.m != null) {
            if (this.m.h()) {
                this.m.a();
            } else {
                this.m.m();
            }
        }
    }

    @Override
    public boolean av_() {
        return false;
    }

    @Override
    protected void b() {
        this.d(epi.a(sv.e, (epi $$0) -> {
            etl etl2 = this;
            synchronized (etl2) {
                this.o = true;
                if (this.n != null) {
                    this.n.cancel(true);
                    this.n = null;
                }
                if (this.m != null) {
                    this.m.a(l);
                }
            }
            this.f.a(this.p);
        }).a(this.g / 2 - 100, this.h / 4 + 120 + 12, 200, 20).a());
    }

    @Override
    public void a(eox $$0, int $$1, int $$2, float $$3) {
        this.a($$0);
        long $$4 = ac.b();
        if ($$4 - this.r > 2000L) {
            this.r = $$4;
            this.f.aU().c(sw.c("narrator.joining"));
        }
        $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 0xFFFFFF);
        super.a($$0, $$1, $$2, $$3);
    }
}

