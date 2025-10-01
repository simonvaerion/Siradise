/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyo
extends dyj {
    private static final Logger i = LogUtils.getLogger();
    private static final int j = 128;
    private static final int k = 64;
    public static final int a = 4;
    public static final int b = 256;
    public final int c;
    public final int d;
    public final acp<cmm> e;
    private final boolean l;
    private final boolean m;
    public final byte f;
    public byte[] g = new byte[16384];
    public final boolean h;
    private final List<a> n = Lists.newArrayList();
    private final Map<byo, a> o = Maps.newHashMap();
    private final Map<String, dyk> p = Maps.newHashMap();
    final Map<String, dyl> q = Maps.newLinkedHashMap();
    private final Map<String, dym> r = Maps.newHashMap();
    private int s;

    private dyo(int $$0, int $$1, byte $$2, boolean $$3, boolean $$4, boolean $$5, acp<cmm> $$6) {
        this.f = $$2;
        this.c = $$0;
        this.d = $$1;
        this.e = $$6;
        this.l = $$3;
        this.m = $$4;
        this.h = $$5;
        this.b();
    }

    public static dyo a(double $$0, double $$1, byte $$2, boolean $$3, boolean $$4, acp<cmm> $$5) {
        int $$6 = 128 * (1 << $$2);
        int $$7 = apa.a(($$0 + 64.0) / (double)$$6);
        int $$8 = apa.a(($$1 + 64.0) / (double)$$6);
        int $$9 = $$7 * $$6 + $$6 / 2 - 64;
        int $$10 = $$8 * $$6 + $$6 / 2 - 64;
        return new dyo($$9, $$10, $$2, $$3, $$4, false, $$5);
    }

    public static dyo a(byte $$0, boolean $$1, acp<cmm> $$2) {
        return new dyo(0, 0, $$0, false, false, $$1, $$2);
    }

    public static dyo b(qr $$0) {
        acp $$1 = (acp)dfk.a(new Dynamic((DynamicOps)rc.a, (Object)$$0.c("dimension"))).resultOrPartial(arg_0 -> ((Logger)i).error(arg_0)).orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + $$0.c("dimension")));
        int $$2 = $$0.h("xCenter");
        int $$3 = $$0.h("zCenter");
        byte $$4 = (byte)apa.a((int)$$0.f("scale"), 0, 4);
        boolean $$5 = !$$0.b("trackingPosition", 1) || $$0.q("trackingPosition");
        boolean $$6 = $$0.q("unlimitedTracking");
        boolean $$7 = $$0.q("locked");
        dyo $$8 = new dyo($$2, $$3, $$4, $$5, $$6, $$7, $$1);
        byte[] $$9 = $$0.m("colors");
        if ($$9.length == 16384) {
            $$8.g = $$9;
        }
        qx $$10 = $$0.c("banners", 10);
        for (int $$11 = 0; $$11 < $$10.size(); ++$$11) {
            dyk $$12 = dyk.a($$10.a($$11));
            $$8.p.put($$12.f(), $$12);
            $$8.a($$12.c(), null, $$12.f(), $$12.a().u(), $$12.a().w(), 180.0, $$12.d());
        }
        qx $$13 = $$0.c("frames", 10);
        for (int $$14 = 0; $$14 < $$13.size(); ++$$14) {
            dym $$15 = dym.a($$13.a($$14));
            $$8.r.put($$15.e(), $$15);
            $$8.a(dyl.a.b, null, "frame-" + $$15.d(), $$15.b().u(), $$15.b().w(), $$15.c(), null);
        }
        return $$8;
    }

    @Override
    public qr a(qr $$0) {
        acq.a.encodeStart((DynamicOps)rc.a, (Object)this.e.a()).resultOrPartial(arg_0 -> ((Logger)i).error(arg_0)).ifPresent($$1 -> $$0.a("dimension", (rk)$$1));
        $$0.a("xCenter", this.c);
        $$0.a("zCenter", this.d);
        $$0.a("scale", this.f);
        $$0.a("colors", this.g);
        $$0.a("trackingPosition", this.l);
        $$0.a("unlimitedTracking", this.m);
        $$0.a("locked", this.h);
        qx $$12 = new qx();
        for (dyk $$2 : this.p.values()) {
            $$12.add($$2.e());
        }
        $$0.a("banners", $$12);
        qx $$3 = new qx();
        for (dym $$4 : this.r.values()) {
            $$3.add($$4.a());
        }
        $$0.a("frames", $$3);
        return $$0;
    }

    public dyo a() {
        dyo $$0 = new dyo(this.c, this.d, this.f, this.l, this.m, true, this.e);
        $$0.p.putAll(this.p);
        $$0.q.putAll(this.q);
        $$0.s = this.s;
        System.arraycopy(this.g, 0, $$0.g, 0, this.g.length);
        $$0.b();
        return $$0;
    }

    public dyo a(int $$0) {
        return dyo.a(this.c, this.d, (byte)apa.a(this.f + $$0, 0, 4), this.l, this.m, this.e);
    }

    public void a(byo $$0, cfz $$1) {
        qr $$10;
        if (!this.o.containsKey($$0)) {
            a $$2 = new a($$0);
            this.o.put($$0, $$2);
            this.n.add($$2);
        }
        if (!$$0.fN().h($$1)) {
            this.a($$0.Z().getString());
        }
        for (int $$3 = 0; $$3 < this.n.size(); ++$$3) {
            a $$4 = this.n.get($$3);
            String $$5 = $$4.a.Z().getString();
            if ($$4.a.dD() || !$$4.a.fN().h($$1) && !$$1.F()) {
                this.o.remove($$4.a);
                this.n.remove($$4);
                this.a($$5);
                continue;
            }
            if ($$1.F() || $$4.a.dI().ac() != this.e || !this.l) continue;
            this.a(dyl.a.a, $$4.a.dI(), $$5, $$4.a.dn(), $$4.a.dt(), $$4.a.dy(), null);
        }
        if ($$1.F() && this.l) {
            bva $$6 = $$1.G();
            gu $$7 = $$6.y();
            dym $$8 = this.r.get(dym.a($$7));
            if ($$8 != null && $$6.af() != $$8.d() && this.r.containsKey($$8.e())) {
                this.a("frame-" + $$8.d());
            }
            dym $$9 = new dym($$7, $$6.cB().e() * 90, $$6.af());
            this.a(dyl.a.b, $$0.dI(), "frame-" + $$6.af(), $$7.u(), $$7.w(), $$6.cB().e() * 90, null);
            this.r.put($$9.e(), $$9);
        }
        if (($$10 = $$1.v()) != null && $$10.b("Decorations", 9)) {
            qx $$11 = $$10.c("Decorations", 10);
            for (int $$12 = 0; $$12 < $$11.size(); ++$$12) {
                qr $$13 = $$11.a($$12);
                if (this.q.containsKey($$13.l("id"))) continue;
                this.a(dyl.a.a($$13.f("type")), $$0.dI(), $$13.l("id"), $$13.k("x"), $$13.k("z"), $$13.k("rot"), null);
            }
        }
    }

    private void a(String $$0) {
        dyl $$1 = this.q.remove($$0);
        if ($$1 != null && $$1.b().e()) {
            --this.s;
        }
        this.g();
    }

    public static void a(cfz $$0, gu $$1, String $$2, dyl.a $$3) {
        qx $$5;
        if ($$0.u() && $$0.v().b("Decorations", 9)) {
            qx $$4 = $$0.v().c("Decorations", 10);
        } else {
            $$5 = new qx();
            $$0.a("Decorations", $$5);
        }
        qr $$6 = new qr();
        $$6.a("type", $$3.a());
        $$6.a("id", $$2);
        $$6.a("x", (double)$$1.u());
        $$6.a("z", (double)$$1.w());
        $$6.a("rot", 180.0);
        $$5.add($$6);
        if ($$3.c()) {
            qr $$7 = $$0.a("display");
            $$7.a("MapColor", $$3.d());
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(dyl.a $$0, @Nullable cmn $$1, String $$2, double $$3, double $$4, double $$5, @Nullable sw $$6) {
        dyl $$19;
        void $$17;
        dyl $$18;
        int $$7 = 1 << this.f;
        float $$8 = (float)($$3 - (double)this.c) / (float)$$7;
        float $$9 = (float)($$4 - (double)this.d) / (float)$$7;
        byte $$10 = (byte)((double)($$8 * 2.0f) + 0.5);
        byte $$11 = (byte)((double)($$9 * 2.0f) + 0.5);
        int $$12 = 63;
        if ($$8 >= -63.0f && $$9 >= -63.0f && $$8 <= 63.0f && $$9 <= 63.0f) {
            byte $$13 = (byte)(($$5 += $$5 < 0.0 ? -8.0 : 8.0) * 16.0 / 360.0);
            if (this.e == cmm.i && $$1 != null) {
                int $$14 = (int)($$1.u_().f() / 10L);
                $$13 = (byte)($$14 * $$14 * 34187121 + $$14 * 121 >> 15 & 0xF);
            }
        } else if ($$0 == dyl.a.a) {
            int $$15 = 320;
            if (Math.abs($$8) < 320.0f && Math.abs($$9) < 320.0f) {
                $$0 = dyl.a.g;
            } else if (this.m) {
                $$0 = dyl.a.h;
            } else {
                this.a($$2);
                return;
            }
            boolean $$16 = false;
            if ($$8 <= -63.0f) {
                $$10 = -128;
            }
            if ($$9 <= -63.0f) {
                $$11 = -128;
            }
            if ($$8 >= 63.0f) {
                $$10 = 127;
            }
            if ($$9 >= 63.0f) {
                $$11 = 127;
            }
        } else {
            this.a($$2);
            return;
        }
        if (!($$18 = new dyl($$0, $$10, $$11, (byte)$$17, $$6)).equals($$19 = this.q.put($$2, $$18))) {
            if ($$19 != null && $$19.b().e()) {
                --this.s;
            }
            if ($$0.e()) {
                ++this.s;
            }
            this.g();
        }
    }

    @Nullable
    public uo<?> a(int $$0, byo $$1) {
        a $$2 = this.o.get($$1);
        if ($$2 == null) {
            return null;
        }
        return $$2.a($$0);
    }

    private void a(int $$0, int $$1) {
        this.b();
        for (a $$2 : this.n) {
            $$2.a($$0, $$1);
        }
    }

    private void g() {
        this.b();
        this.n.forEach(a::b);
    }

    public a a(byo $$0) {
        a $$1 = this.o.get($$0);
        if ($$1 == null) {
            $$1 = new a($$0);
            this.o.put($$0, $$1);
            this.n.add($$1);
        }
        return $$1;
    }

    public boolean a(cmn $$0, gu $$1) {
        double $$2 = (double)$$1.u() + 0.5;
        double $$3 = (double)$$1.w() + 0.5;
        int $$4 = 1 << this.f;
        double $$5 = ($$2 - (double)this.c) / (double)$$4;
        double $$6 = ($$3 - (double)this.d) / (double)$$4;
        int $$7 = 63;
        if ($$5 >= -63.0 && $$6 >= -63.0 && $$5 <= 63.0 && $$6 <= 63.0) {
            dyk $$8 = dyk.a($$0, $$1);
            if ($$8 == null) {
                return false;
            }
            if (this.p.remove($$8.f(), $$8)) {
                this.a($$8.f());
                return true;
            }
            if (!this.b(256)) {
                this.p.put($$8.f(), $$8);
                this.a($$8.c(), $$0, $$8.f(), $$2, $$3, 180.0, $$8.d());
                return true;
            }
        }
        return false;
    }

    public void a(cls $$0, int $$1, int $$2) {
        Iterator<dyk> $$3 = this.p.values().iterator();
        while ($$3.hasNext()) {
            dyk $$5;
            dyk $$4 = $$3.next();
            if ($$4.a().u() != $$1 || $$4.a().w() != $$2 || $$4.equals($$5 = dyk.a($$0, $$4.a()))) continue;
            $$3.remove();
            this.a($$4.f());
        }
    }

    public Collection<dyk> d() {
        return this.p.values();
    }

    public void a(gu $$0, int $$1) {
        this.a("frame-" + $$1);
        this.r.remove(dym.a($$0));
    }

    public boolean a(int $$0, int $$1, byte $$2) {
        byte $$3 = this.g[$$0 + $$1 * 128];
        if ($$3 != $$2) {
            this.b($$0, $$1, $$2);
            return true;
        }
        return false;
    }

    public void b(int $$0, int $$1, byte $$2) {
        this.g[$$0 + $$1 * 128] = $$2;
        this.a($$0, $$1);
    }

    public boolean e() {
        for (dyl $$0 : this.q.values()) {
            if ($$0.b() != dyl.a.i && $$0.b() != dyl.a.j) continue;
            return true;
        }
        return false;
    }

    public void a(List<dyl> $$0) {
        this.q.clear();
        this.s = 0;
        for (int $$1 = 0; $$1 < $$0.size(); ++$$1) {
            dyl $$2 = $$0.get($$1);
            this.q.put("icon-" + $$1, $$2);
            if (!$$2.b().e()) continue;
            ++this.s;
        }
    }

    public Iterable<dyl> f() {
        return this.q.values();
    }

    public boolean b(int $$0) {
        return this.s >= $$0;
    }

    public class a {
        public final byo a;
        private boolean d = true;
        private int e;
        private int f;
        private int g = 127;
        private int h = 127;
        private boolean i = true;
        private int j;
        public int b;

        a(byo $$1) {
            this.a = $$1;
        }

        private b a() {
            int $$0 = this.e;
            int $$1 = this.f;
            int $$2 = this.g + 1 - this.e;
            int $$3 = this.h + 1 - this.f;
            byte[] $$4 = new byte[$$2 * $$3];
            for (int $$5 = 0; $$5 < $$2; ++$$5) {
                for (int $$6 = 0; $$6 < $$3; ++$$6) {
                    $$4[$$5 + $$6 * $$2] = dyo.this.g[$$0 + $$5 + ($$1 + $$6) * 128];
                }
            }
            return new b($$0, $$1, $$2, $$3, $$4);
        }

        @Nullable
        uo<?> a(int $$0) {
            Collection<dyl> $$4;
            b $$2;
            if (this.d) {
                this.d = false;
                b $$1 = this.a();
            } else {
                $$2 = null;
            }
            if (this.i && this.j++ % 5 == 0) {
                this.i = false;
                Collection<dyl> $$3 = dyo.this.q.values();
            } else {
                $$4 = null;
            }
            if ($$4 != null || $$2 != null) {
                return new wj($$0, dyo.this.f, dyo.this.h, $$4, $$2);
            }
            return null;
        }

        void a(int $$0, int $$1) {
            if (this.d) {
                this.e = Math.min(this.e, $$0);
                this.f = Math.min(this.f, $$1);
                this.g = Math.max(this.g, $$0);
                this.h = Math.max(this.h, $$1);
            } else {
                this.d = true;
                this.e = $$0;
                this.f = $$1;
                this.g = $$0;
                this.h = $$1;
            }
        }

        private void b() {
            this.i = true;
        }
    }

    public static class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final byte[] e;

        public b(int $$0, int $$1, int $$2, int $$3, byte[] $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        public void a(dyo $$0) {
            for (int $$1 = 0; $$1 < this.c; ++$$1) {
                for (int $$2 = 0; $$2 < this.d; ++$$2) {
                    $$0.b(this.a + $$1, this.b + $$2, this.e[$$1 + $$2 * this.c]);
                }
            }
        }
    }
}

