/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class cmx {
    private static final Logger c = LogUtils.getLogger();
    private static final int d = 24;
    public static final int a = 8;
    public static final int b = 128;
    static final int e = (int)Math.pow(17.0, 2.0);
    private static final bgc[] f = (bgc[])Stream.of(bgc.values()).filter($$0 -> $$0 != bgc.h).toArray(bgc[]::new);

    private cmx() {
    }

    public static d a(int $$0, Iterable<bfj> $$1, b $$2, cmw $$3) {
        cna $$4 = new cna();
        Object2IntOpenHashMap $$5 = new Object2IntOpenHashMap();
        for (bfj $$62 : $$1) {
            bgc $$8;
            bgb $$7;
            if ($$62 instanceof bgb && (($$7 = (bgb)$$62).fH() || $$7.T()) || ($$8 = $$62.ae().f()) == bgc.h) continue;
            gu $$9 = $$62.di();
            $$2.query(clt.a($$9), $$6 -> {
                cnw.b $$7 = cmx.a($$9, (ddx)$$6).b().a($$62.ae());
                if ($$7 != null) {
                    $$4.a($$62.di(), $$7.b());
                }
                if ($$62 instanceof bgb) {
                    $$3.a($$6.f(), $$8);
                }
                $$5.addTo((Object)$$8, 1);
            });
        }
        return new d($$0, (Object2IntOpenHashMap<bgc>)$$5, $$4, $$3);
    }

    static cnk a(gu $$0, ddx $$1) {
        return $$1.getNoiseBiome(hq.a($$0.u()), hq.a($$0.v()), hq.a($$0.w())).a();
    }

    public static void a(aif $$0, dei $$1, d $$2, boolean $$3, boolean $$4, boolean $$5) {
        $$0.ad().a("spawner");
        for (bgc $$6 : f) {
            if (!$$3 && $$6.d() || !$$4 && !$$6.d() || !$$5 && $$6.e() || !$$2.a($$6, $$1.f())) continue;
            cmx.a($$6, $$0, $$1, $$2::a, $$2::a);
        }
        $$0.ad().c();
    }

    public static void a(bgc $$0, aif $$1, dei $$2, c $$3, a $$4) {
        gu $$5 = cmx.a((cmm)$$1, $$2);
        if ($$5.v() < $$1.C_() + 1) {
            return;
        }
        cmx.a($$0, $$1, $$2, $$5, $$3, $$4);
    }

    @aqa
    public static void a(bgc $$02, aif $$12, gu $$22) {
        cmx.a($$02, $$12, $$12.x($$22), $$22, (bfn<?> $$0, gu $$1, ddx $$2) -> true, (bgb $$0, ddx $$1) -> {});
    }

    public static void a(bgc $$0, aif $$1, ddx $$2, gu $$3, c $$4, a $$5) {
        cne $$6 = $$1.a();
        ddy $$7 = $$1.k().g();
        int $$8 = $$3.v();
        dcb $$9 = $$2.a_($$3);
        if ($$9.g($$2, $$3)) {
            return;
        }
        gu.a $$10 = new gu.a();
        int $$11 = 0;
        block0: for (int $$12 = 0; $$12 < 3; ++$$12) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            cnw.c $$16 = null;
            bgt $$17 = null;
            int $$18 = apa.f($$1.z.i() * 4.0f);
            int $$19 = 0;
            for (int $$20 = 0; $$20 < $$18; ++$$20) {
                double $$24;
                $$10.d($$13 += $$1.z.a(6) - $$1.z.a(6), $$8, $$14 += $$1.z.a(6) - $$1.z.a(6));
                double $$21 = (double)$$13 + 0.5;
                double $$22 = (double)$$14 + 0.5;
                byo $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
                if ($$23 == null || !cmx.a($$1, $$2, $$10, $$24 = $$23.i($$21, $$8, $$22))) continue;
                if ($$16 == null) {
                    Optional<cnw.c> $$25 = cmx.a($$1, $$6, $$7, $$0, $$1.z, (gu)$$10);
                    if ($$25.isEmpty()) continue block0;
                    $$16 = $$25.get();
                    $$18 = $$16.c + $$1.z.a(1 + $$16.d - $$16.c);
                }
                if (!cmx.a($$1, $$0, $$6, $$7, $$16, $$10, $$24) || !$$4.test($$16.b, $$10, $$2)) continue;
                bgb $$26 = cmx.a($$1, $$16.b);
                if ($$26 == null) {
                    return;
                }
                $$26.b($$21, $$8, $$22, $$1.z.i() * 360.0f, 0.0f);
                if (!cmx.a($$1, $$26, $$24)) continue;
                $$17 = $$26.a($$1, $$1.d_($$26.di()), bgd.a, $$17, null);
                ++$$19;
                $$1.a_($$26);
                $$5.run($$26, $$2);
                if (++$$11 >= $$26.fE()) {
                    return;
                }
                if ($$26.d($$19)) continue block0;
            }
        }
    }

    private static boolean a(aif $$0, ddx $$1, gu.a $$2, double $$3) {
        if ($$3 <= 576.0) {
            return false;
        }
        if ($$0.R().a(new eei((double)$$2.u() + 0.5, $$2.v(), (double)$$2.w() + 0.5), 24.0)) {
            return false;
        }
        return Objects.equals(new clt($$2), $$1.f()) || $$0.f($$2);
    }

    private static boolean a(aif $$0, bgc $$1, cne $$2, ddy $$3, cnw.c $$4, gu.a $$5, double $$6) {
        bfn<?> $$7 = $$4.b;
        if ($$7.f() == bgc.h) {
            return false;
        }
        if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
            return false;
        }
        if (!$$7.c() || !cmx.a($$0, $$2, $$3, $$1, $$4, (gu)$$5)) {
            return false;
        }
        bgu.c $$8 = bgu.a($$7);
        if (!cmx.a($$8, (cmp)$$0, (gu)$$5, $$7)) {
            return false;
        }
        if (!bgu.a($$7, $$0, bgd.a, $$5, $$0.z)) {
            return false;
        }
        return $$0.b($$7.a((double)$$5.u() + 0.5, $$5.v(), (double)$$5.w() + 0.5));
    }

    @Nullable
    private static bgb a(aif $$0, bfn<?> $$1) {
        try {
            Object obj = $$1.a($$0);
            if (obj instanceof bgb) {
                bgb $$2 = (bgb)obj;
                return $$2;
            }
            c.warn("Can't spawn entity of type: {}", (Object)jb.h.b($$1));
        }
        catch (Exception $$3) {
            c.warn("Failed to create mob", (Throwable)$$3);
        }
        return null;
    }

    private static boolean a(aif $$0, bgb $$1, double $$2) {
        if ($$2 > (double)($$1.ae().f().f() * $$1.ae().f().f()) && $$1.h($$2)) {
            return false;
        }
        return $$1.a((cmn)$$0, bgd.a) && $$1.a((cmp)$$0);
    }

    private static Optional<cnw.c> a(aif $$0, cne $$1, ddy $$2, bgc $$3, apf $$4, gu $$5) {
        he<cnk> $$6 = $$0.s($$5);
        if ($$3 == bgc.g && $$6.a(amv.al) && $$4.i() < 0.98f) {
            return Optional.empty();
        }
        return cmx.a($$0, $$1, $$2, $$3, $$5, $$6).b($$4);
    }

    private static boolean a(aif $$0, cne $$1, ddy $$2, bgc $$3, cnw.c $$4, gu $$5) {
        return cmx.a($$0, $$1, $$2, $$3, $$5, null).e().contains($$4);
    }

    private static bcl<cnw.c> a(aif $$0, cne $$1, ddy $$2, bgc $$3, gu $$4, @Nullable he<cnk> $$5) {
        if (cmx.a($$4, $$0, $$3, $$1)) {
            return dtz.d;
        }
        return $$2.a($$5 != null ? $$5 : $$0.s($$4), $$1, $$3, $$4);
    }

    public static boolean a(gu $$0, aif $$1, bgc $$2, cne $$3) {
        if ($$2 != bgc.a || !$$1.a_($$0.d()).a(cpo.fn)) {
            return false;
        }
        dsa $$4 = $$3.b().d(jc.az).a(dru.o);
        if ($$4 == null) {
            return false;
        }
        return $$3.a($$0, $$4).b();
    }

    private static gu a(cmm $$0, dei $$1) {
        clt $$2 = $$1.f();
        int $$3 = $$2.d() + $$0.z.a(16);
        int $$4 = $$2.e() + $$0.z.a(16);
        int $$5 = $$1.a(dhk.a.b, $$3, $$4) + 1;
        int $$6 = apa.b($$0.z, $$0.C_(), $$5);
        return new gu($$3, $$6, $$4);
    }

    public static boolean a(cls $$0, gu $$1, dcb $$2, dxe $$3, bfn<?> $$4) {
        if ($$2.r($$0, $$1)) {
            return false;
        }
        if ($$2.m()) {
            return false;
        }
        if (!$$3.c()) {
            return false;
        }
        if ($$2.a(amw.aV)) {
            return false;
        }
        return !$$4.a($$2);
    }

    public static boolean a(bgu.c $$0, cmp $$1, gu $$2, @Nullable bfn<?> $$3) {
        if ($$0 == bgu.c.c) {
            return true;
        }
        if ($$3 == null || !$$1.w_().a($$2)) {
            return false;
        }
        dcb $$4 = $$1.a_($$2);
        dxe $$5 = $$1.b_($$2);
        gu $$6 = $$2.c();
        gu $$7 = $$2.d();
        switch ($$0) {
            case b: {
                return $$5.a(anb.a) && !$$1.a_($$6).g($$1, $$6);
            }
            case d: {
                return $$5.a(anb.b);
            }
        }
        dcb $$8 = $$1.a_($$7);
        if (!$$8.a((cls)$$1, $$7, $$3)) {
            return false;
        }
        return cmx.a($$1, $$2, $$4, $$5, $$3) && cmx.a($$1, $$6, $$1.a_($$6), $$1.b_($$6), $$3);
    }

    /*
     * WARNING - void declaration
     */
    public static void a(cnb $$0, he<cnk> $$1, clt $$2, apf $$3) {
        cnw $$4 = $$1.a().b();
        bcl<cnw.c> $$5 = $$4.a(bgc.b);
        if ($$5.d()) {
            return;
        }
        int $$6 = $$2.d();
        int $$7 = $$2.e();
        while ($$3.i() < $$4.a()) {
            Optional<cnw.c> $$8 = $$5.b($$3);
            if (!$$8.isPresent()) continue;
            cnw.c $$9 = $$8.get();
            int $$10 = $$9.c + $$3.a(1 + $$9.d - $$9.c);
            bgt $$11 = null;
            int $$12 = $$6 + $$3.a(16);
            int $$13 = $$7 + $$3.a(16);
            int $$14 = $$12;
            int $$15 = $$13;
            for (int $$16 = 0; $$16 < $$10; ++$$16) {
                boolean $$17 = false;
                for (int $$18 = 0; !$$17 && $$18 < 4; ++$$18) {
                    gu $$19 = cmx.a((cmp)$$0, $$9.b, $$12, $$13);
                    if ($$9.b.c() && cmx.a(bgu.a($$9.b), $$0, $$19, $$9.b)) {
                        bgb $$26;
                        void $$25;
                        float $$20 = $$9.b.k();
                        double $$21 = apa.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = apa.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.b.a($$21, $$19.v(), $$22)) || !bgu.a($$9.b, $$0, bgd.b, gu.a($$21, (double)$$19.v(), $$22), $$0.y_())) continue;
                        try {
                            Object $$23 = $$9.b.a($$0.C());
                        }
                        catch (Exception $$24) {
                            c.warn("Failed to create mob", (Throwable)$$24);
                            continue;
                        }
                        if ($$25 == null) continue;
                        $$25.b($$21, $$19.v(), $$22, $$3.i() * 360.0f, 0.0f);
                        if ($$25 instanceof bgb && ($$26 = (bgb)$$25).a($$0, bgd.b) && $$26.a($$0)) {
                            $$11 = $$26.a($$0, $$0.d_($$26.di()), bgd.b, $$11, null);
                            $$0.a_($$26);
                            $$17 = true;
                        }
                    }
                    $$12 += $$3.a(5) - $$3.a(5);
                    $$13 += $$3.a(5) - $$3.a(5);
                    while ($$12 < $$6 || $$12 >= $$6 + 16 || $$13 < $$7 || $$13 >= $$7 + 16) {
                        $$12 = $$14 + $$3.a(5) - $$3.a(5);
                        $$13 = $$15 + $$3.a(5) - $$3.a(5);
                    }
                }
            }
        }
    }

    private static gu a(cmp $$0, bfn<?> $$1, int $$2, int $$3) {
        gu $$6;
        int $$4 = $$0.a(bgu.b($$1), $$2, $$3);
        gu.a $$5 = new gu.a($$2, $$4, $$3);
        if ($$0.x_().h()) {
            do {
                $$5.c(ha.a);
            } while (!$$0.a_($$5).i());
            do {
                $$5.c(ha.a);
            } while ($$0.a_($$5).i() && $$5.v() > $$0.C_());
        }
        if (bgu.a($$1) == bgu.c.a && $$0.a_($$6 = $$5.d()).a((cls)$$0, $$6, dxu.a)) {
            return $$6;
        }
        return $$5.i();
    }

    @FunctionalInterface
    public static interface b {
        public void query(long var1, Consumer<dei> var3);
    }

    public static class d {
        private final int a;
        private final Object2IntOpenHashMap<bgc> b;
        private final cna c;
        private final Object2IntMap<bgc> d;
        private final cmw e;
        @Nullable
        private gu f;
        @Nullable
        private bfn<?> g;
        private double h;

        d(int $$0, Object2IntOpenHashMap<bgc> $$1, cna $$2, cmw $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.e = $$3;
            this.d = Object2IntMaps.unmodifiable($$1);
        }

        private boolean a(bfn<?> $$0, gu $$1, ddx $$2) {
            double $$4;
            this.f = $$1;
            this.g = $$0;
            cnw.b $$3 = cmx.a($$1, $$2).b().a($$0);
            if ($$3 == null) {
                this.h = 0.0;
                return true;
            }
            this.h = $$4 = $$3.b();
            double $$5 = this.c.b($$1, $$4);
            return $$5 <= $$3.a();
        }

        private void a(bgb $$0, ddx $$1) {
            double $$7;
            bfn<?> $$2 = $$0.ae();
            gu $$3 = $$0.di();
            if ($$3.equals(this.f) && $$2 == this.g) {
                double $$4 = this.h;
            } else {
                cnw.b $$5 = cmx.a($$3, $$1).b().a($$2);
                if ($$5 != null) {
                    double $$6 = $$5.b();
                } else {
                    $$7 = 0.0;
                }
            }
            this.c.a($$3, $$7);
            bgc $$8 = $$2.f();
            this.b.addTo((Object)$$8, 1);
            this.e.a(new clt($$3), $$8);
        }

        public int a() {
            return this.a;
        }

        public Object2IntMap<bgc> b() {
            return this.d;
        }

        boolean a(bgc $$0, clt $$1) {
            int $$2 = $$0.b() * this.a / e;
            if (this.b.getInt((Object)$$0) >= $$2) {
                return false;
            }
            return this.e.a($$0, $$1);
        }
    }

    @FunctionalInterface
    public static interface c {
        public boolean test(bfn<?> var1, gu var2, ddx var3);
    }

    @FunctionalInterface
    public static interface a {
        public void run(bgb var1, ddx var2);
    }
}

