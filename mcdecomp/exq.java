/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exq
extends eqc<a> {
    static final Logger a = LogUtils.getLogger();
    static final ThreadPoolExecutor l = new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new r(a)).build());
    private static final acq m = new acq("textures/misc/unknown_server.png");
    static final acq n = new acq("textures/gui/server_selection.png");
    static final acq o = new acq("textures/gui/icons.png");
    static final sw p = sw.c("lanServer.scanning");
    static final sw q = sw.c("multiplayer.status.cannot_resolve").a($$0 -> $$0.a(-65536));
    static final sw r = sw.c("multiplayer.status.cannot_connect").a($$0 -> $$0.a(-65536));
    static final sw s = sw.c("multiplayer.status.incompatible");
    static final sw t = sw.c("multiplayer.status.no_connection");
    static final sw u = sw.c("multiplayer.status.pinging");
    static final sw v = sw.c("multiplayer.status.online");
    private final exn w;
    private final List<d> x = Lists.newArrayList();
    private final a y = new b();
    private final List<c> z = Lists.newArrayList();

    public exq(exn $$0, enn $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
        super($$1, $$2, $$3, $$4, $$5, $$6);
        this.w = $$0;
    }

    private void e() {
        this.j();
        this.x.forEach($$1 -> this.b($$1));
        this.b(this.y);
        this.z.forEach($$1 -> this.b($$1));
    }

    @Override
    public void a(@Nullable a $$0) {
        super.a($$0);
        this.w.B();
    }

    @Override
    public boolean a(int $$0, int $$1, int $$2) {
        a $$3 = (a)this.f();
        return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
    }

    @Override
    public void a(ffe $$0) {
        this.x.clear();
        for (int $$1 = 0; $$1 < $$0.c(); ++$$1) {
            this.x.add(new d(this.w, $$0.a($$1)));
        }
        this.e();
    }

    @Override
    public void a(List<fyq> $$0) {
        int $$1 = $$0.size() - this.z.size();
        this.z.clear();
        for (fyq $$2 : $$0) {
            this.z.add(new c(this.w, $$2));
        }
        this.e();
        for (int $$3 = this.z.size() - $$1; $$3 < this.z.size(); ++$$3) {
            c $$4 = this.z.get($$3);
            int $$5 = $$3 - this.z.size() + this.i().size();
            int $$6 = this.g($$5);
            int $$7 = this.h($$5);
            if ($$7 < this.f || $$6 > this.g) continue;
            this.b.aU().b(sw.a("multiplayer.lan.server_found", $$4.d()));
        }
    }

    @Override
    protected int c() {
        return super.c() + 30;
    }

    @Override
    public int b() {
        return super.b() + 85;
    }

    public void d() {
    }

    public static class b
    extends a {
        private final enn a = enn.N();

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - this.a.h.b / 2;
            $$0.a(this.a.h, p, this.a.z.g / 2 - this.a.h.a(p) / 2, $$10, 0xFFFFFF, false);
            String $$11 = euc.a(ac.b());
            $$0.a(this.a.h, $$11, this.a.z.g / 2 - this.a.h.b($$11) / 2, $$10 + this.a.h.b, 0x808080, false);
        }

        @Override
        public sw a() {
            return p;
        }
    }

    public static abstract class a
    extends eqc.a<a>
    implements AutoCloseable {
        @Override
        public void close() {
        }
    }

    public class d
    extends a {
        private static final int b = 32;
        private static final int c = 32;
        private static final int d = 0;
        private static final int e = 32;
        private static final int f = 64;
        private static final int g = 96;
        private static final int h = 0;
        private static final int i = 32;
        private final exn j;
        private final enn k;
        private final ffd l;
        private final etw m;
        @Nullable
        private byte[] n;
        private long o;

        protected d(exn $$1, ffd $$2) {
            this.j = $$1;
            this.l = $$2;
            this.k = enn.N();
            this.m = etw.b(this.k.X(), $$2.b);
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            List<sw> $$31;
            sw $$30;
            int $$29;
            if (!this.l.i) {
                this.l.i = true;
                this.l.f = -2L;
                this.l.d = sv.a;
                this.l.c = sv.a;
                l.submit(() -> {
                    try {
                        this.j.C().a(this.l, () -> this.k.execute(this::b));
                    }
                    catch (UnknownHostException $$0) {
                        this.l.f = -1L;
                        this.l.d = q;
                    }
                    catch (Exception $$1) {
                        this.l.f = -1L;
                        this.l.d = r;
                    }
                });
            }
            boolean $$10 = !this.f();
            $$0.a(this.k.h, this.l.a, $$3 + 32 + 3, $$2 + 1, 0xFFFFFF, false);
            List<aom> $$11 = this.k.h.c(this.l.d, $$4 - 32 - 2);
            for (int $$12 = 0; $$12 < Math.min($$11.size(), 2); ++$$12) {
                $$0.a(this.k.h, $$11.get($$12), $$3 + 32 + 3, $$2 + 12 + this.k.h.b * $$12, 0x808080, false);
            }
            sw $$13 = $$10 ? this.l.h.e().a(n.m) : this.l.c;
            int $$14 = this.k.h.a($$13);
            $$0.a(this.k.h, $$13, $$3 + $$4 - $$14 - 15 - 2, $$2 + 1, 0x808080, false);
            int $$15 = 0;
            if ($$10) {
                int $$16 = 5;
                sw $$17 = s;
                List<sw> $$18 = this.l.j;
            } else if (this.e()) {
                if (this.l.f < 0L) {
                    int $$19 = 5;
                } else if (this.l.f < 150L) {
                    boolean $$20 = false;
                } else if (this.l.f < 300L) {
                    boolean $$21 = true;
                } else if (this.l.f < 600L) {
                    int $$22 = 2;
                } else if (this.l.f < 1000L) {
                    int $$23 = 3;
                } else {
                    int $$24 = 4;
                }
                if (this.l.f < 0L) {
                    sw $$25 = t;
                    List $$26 = Collections.emptyList();
                } else {
                    tj $$27 = sw.a("multiplayer.status.ping", this.l.f);
                    List<sw> $$28 = this.l.j;
                }
            } else {
                $$15 = 1;
                $$29 = (int)(ac.b() / 100L + (long)($$1 * 2) & 7L);
                if ($$29 > 4) {
                    $$29 = 8 - $$29;
                }
                $$30 = u;
                $$31 = Collections.emptyList();
            }
            $$0.a(o, $$3 + $$4 - 15, $$2, (float)($$15 * 10), (float)(176 + $$29 * 8), 10, 8, 256, 256);
            byte[] $$32 = this.l.c();
            if (!Arrays.equals($$32, this.n)) {
                if (this.a($$32)) {
                    this.n = $$32;
                } else {
                    this.l.a((byte[])null);
                    this.b();
                }
            }
            this.a($$0, $$3, $$2, this.m.b());
            int $$33 = $$6 - $$3;
            int $$34 = $$7 - $$2;
            if ($$33 >= $$4 - 15 && $$33 <= $$4 - 5 && $$34 >= 0 && $$34 <= 8) {
                this.j.c(Collections.singletonList($$30));
            } else if ($$33 >= $$4 - $$14 - 15 - 2 && $$33 <= $$4 - 15 - 2 && $$34 >= 0 && $$34 <= 8) {
                this.j.c($$31);
            }
            if (this.k.m.U().c().booleanValue() || $$8) {
                $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
                int $$35 = $$6 - $$3;
                int $$36 = $$7 - $$2;
                if (this.g()) {
                    if ($$35 < 32 && $$35 > 16) {
                        $$0.a(n, $$3, $$2, 0.0f, 32.0f, 32, 32, 256, 256);
                    } else {
                        $$0.a(n, $$3, $$2, 0.0f, 0.0f, 32, 32, 256, 256);
                    }
                }
                if ($$1 > 0) {
                    if ($$35 < 16 && $$36 < 16) {
                        $$0.a(n, $$3, $$2, 96.0f, 32.0f, 32, 32, 256, 256);
                    } else {
                        $$0.a(n, $$3, $$2, 96.0f, 0.0f, 32, 32, 256, 256);
                    }
                }
                if ($$1 < this.j.D().c() - 1) {
                    if ($$35 < 16 && $$36 > 16) {
                        $$0.a(n, $$3, $$2, 64.0f, 32.0f, 32, 32, 256, 256);
                    } else {
                        $$0.a(n, $$3, $$2, 64.0f, 0.0f, 32, 32, 256, 256);
                    }
                }
            }
        }

        private boolean e() {
            return this.l.i && this.l.f != -2L;
        }

        private boolean f() {
            return this.l.g == aa.b().e();
        }

        public void b() {
            this.j.D().b();
        }

        protected void a(eox $$0, int $$1, int $$2, acq $$3) {
            RenderSystem.enableBlend();
            $$0.a($$3, $$1, $$2, 0.0f, 0.0f, 32, 32, 32, 32);
            RenderSystem.disableBlend();
        }

        private boolean g() {
            return true;
        }

        private boolean a(@Nullable byte[] $$0) {
            if ($$0 == null) {
                this.m.a();
            } else {
                try {
                    this.m.a(ehk.a($$0));
                }
                catch (Throwable $$1) {
                    a.error("Invalid icon for server {} ({})", new Object[]{this.l.a, this.l.b, $$1});
                    return false;
                }
            }
            return true;
        }

        @Override
        public boolean a(int $$0, int $$1, int $$2) {
            if (euq.q()) {
                exq $$3 = this.j.l;
                int $$4 = $$3.i().indexOf(this);
                if ($$4 == -1) {
                    return true;
                }
                if ($$0 == 264 && $$4 < this.j.D().c() - 1 || $$0 == 265 && $$4 > 0) {
                    this.a($$4, $$0 == 264 ? $$4 + 1 : $$4 - 1);
                    return true;
                }
            }
            return super.a($$0, $$1, $$2);
        }

        private void a(int $$0, int $$1) {
            this.j.D().a($$0, $$1);
            this.j.l.a(this.j.D());
            a $$2 = (a)this.j.l.i().get($$1);
            this.j.l.a($$2);
            exq.this.f($$2);
        }

        @Override
        public boolean a(double $$0, double $$1, int $$2) {
            double $$3 = $$0 - (double)exq.this.o();
            double $$4 = $$1 - (double)exq.this.g(exq.this.i().indexOf(this));
            if ($$3 <= 32.0) {
                if ($$3 < 32.0 && $$3 > 16.0 && this.g()) {
                    this.j.a(this);
                    this.j.l();
                    return true;
                }
                int $$5 = this.j.l.i().indexOf(this);
                if ($$3 < 16.0 && $$4 < 16.0 && $$5 > 0) {
                    this.a($$5, $$5 - 1);
                    return true;
                }
                if ($$3 < 16.0 && $$4 > 16.0 && $$5 < this.j.D().c() - 1) {
                    this.a($$5, $$5 + 1);
                    return true;
                }
            }
            this.j.a(this);
            if (ac.b() - this.o < 250L) {
                this.j.l();
            }
            this.o = ac.b();
            return true;
        }

        public ffd d() {
            return this.l;
        }

        @Override
        public sw a() {
            tj $$0 = sw.h();
            $$0.b(sw.a("narrator.select", new Object[]{this.l.a}));
            $$0.b(sv.r);
            if (!this.f()) {
                $$0.b(s);
                $$0.b(sv.r);
                $$0.b(sw.a("multiplayer.status.version.narration", this.l.h));
                $$0.b(sv.r);
                $$0.b(sw.a("multiplayer.status.motd.narration", this.l.d));
            } else if (this.l.f < 0L) {
                $$0.b(t);
            } else if (!this.e()) {
                $$0.b(u);
            } else {
                $$0.b(v);
                $$0.b(sv.r);
                $$0.b(sw.a("multiplayer.status.ping.narration", this.l.f));
                $$0.b(sv.r);
                $$0.b(sw.a("multiplayer.status.motd.narration", this.l.d));
                if (this.l.e != null) {
                    $$0.b(sv.r);
                    $$0.b(sw.a("multiplayer.status.player_count.narration", this.l.e.b(), this.l.e.a()));
                    $$0.b(sv.r);
                    $$0.b(sy.a(this.l.j, sw.b(", ")));
                }
            }
            return $$0;
        }

        @Override
        public void close() {
            this.m.close();
        }
    }

    public static class c
    extends a {
        private static final int c = 32;
        private static final sw d = sw.c("lanServer.title");
        private static final sw e = sw.c("selectServer.hiddenAddress");
        private final exn f;
        protected final enn a;
        protected final fyq b;
        private long g;

        protected c(exn $$0, fyq $$1) {
            this.f = $$0;
            this.b = $$1;
            this.a = enn.N();
        }

        @Override
        public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(this.a.h, d, $$3 + 32 + 3, $$2 + 1, 0xFFFFFF, false);
            $$0.a(this.a.h, this.b.a(), $$3 + 32 + 3, $$2 + 12, 0x808080, false);
            if (this.a.m.l) {
                $$0.a(this.a.h, e, $$3 + 32 + 3, $$2 + 12 + 11, 0x303030, false);
            } else {
                $$0.a(this.a.h, this.b.b(), $$3 + 32 + 3, $$2 + 12 + 11, 0x303030, false);
            }
        }

        @Override
        public boolean a(double $$0, double $$1, int $$2) {
            this.f.a(this);
            if (ac.b() - this.g < 250L) {
                this.f.l();
            }
            this.g = ac.b();
            return false;
        }

        public fyq b() {
            return this.b;
        }

        @Override
        public sw a() {
            return sw.a("narrator.select", this.d());
        }

        public sw d() {
            return sw.h().b(d).b(sv.t).f(this.b.a());
        }
    }
}

