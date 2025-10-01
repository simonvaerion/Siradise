/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  javax.annotation.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cvd
extends cpn
implements cse,
cwo {
    public static final dcv a = dcr.bm;
    public static final dcz<dcy> b = dcr.bn;
    public static final dcs c = dcr.C;
    private static final int d = 11;
    private static final int e = 2;
    private static final float f = 0.02f;
    private static final float g = 0.12f;
    private static final int h = 11;
    private static final float i = 0.17578125f;
    private static final float j = 0.05859375f;
    private static final double k = 0.6;
    private static final float l = 1.0f;
    private static final int m = 40;
    private static final int n = 6;
    private static final float D = 2.0f;
    private static final int E = 2;
    private static final float F = 5.0f;
    private static final float G = 0.011377778f;
    private static final int H = 7;
    private static final int I = 10;
    private static final float J = 0.6875f;
    private static final efb K = cpn.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
    private static final efb L = cpn.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
    private static final efb M = cpn.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
    private static final efb N = cpn.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
    private static final efb O = cpn.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
    private static final efb P = cpn.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
    private static final float Q = 0.125f;
    private static final efb R = cpn.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

    public cvd(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)((dcb)this.C.b()).a(a, ha.b)).a(b, dcy.b)).a(c, false));
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(a, b, c);
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        return cvd.c($$1, $$2, $$0.c(a));
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(c).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        if ($$1 != ha.b && $$1 != ha.a) {
            return $$0;
        }
        ha $$6 = $$0.c(a);
        if ($$6 == ha.a && $$3.L().a($$4, this)) {
            return $$0;
        }
        if ($$1 == $$6.g() && !this.a($$0, $$3, $$4)) {
            if ($$6 == ha.a) {
                $$3.a($$4, this, 2);
            } else {
                $$3.a($$4, this, 1);
            }
            return $$0;
        }
        boolean $$7 = $$0.c(b) == dcy.a;
        dcy $$8 = cvd.a((cmp)$$3, $$4, $$6, $$7);
        return (dcb)$$0.a(b, $$8);
    }

    @Override
    public void a(cmm $$0, dcb $$1, eee $$2, bzg $$3) {
        gu $$4 = $$2.a();
        if (!$$0.B && $$3.a($$0, $$4) && $$3 instanceof bzs && $$3.dl().f() > 0.6) {
            $$0.b($$4, true);
        }
    }

    @Override
    public void a(cmm $$0, dcb $$1, gu $$2, bfj $$3, float $$4) {
        if ($$1.c(a) == ha.b && $$1.c(b) == dcy.b) {
            $$3.a($$4 + 2.0f, 2.0f, $$0.ag().u());
        } else {
            super.a($$0, $$1, $$2, $$3, $$4);
        }
    }

    @Override
    public void a(dcb $$0, cmm $$12, gu $$2, apf $$32) {
        if (!cvd.h($$0)) {
            return;
        }
        float $$4 = $$32.i();
        if ($$4 > 0.12f) {
            return;
        }
        cvd.b($$12, $$2, $$0).filter($$1 -> $$4 < 0.02f || cvd.a($$1.b)).ifPresent($$3 -> cvd.a($$12, $$2, $$0, $$3.b));
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if (cvd.o($$0) && !this.a($$0, (cmp)$$1, $$2)) {
            $$1.b($$2, true);
        } else {
            cvd.a($$0, $$1, $$2);
        }
    }

    @Override
    public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
        cvd.a($$0, $$1, $$2, $$3.i());
        if ($$3.i() < 0.011377778f && cvd.b($$0, (cmp)$$1, $$2)) {
            cvd.c($$0, $$1, $$2, $$3);
        }
    }

    /*
     * WARNING - void declaration
     */
    @VisibleForTesting
    public static void a(dcb $$0, aif $$1, gu $$2, float $$3) {
        void $$8;
        if ($$3 > 0.17578125f && $$3 > 0.05859375f) {
            return;
        }
        if (!cvd.b($$0, (cmp)$$1, $$2)) {
            return;
        }
        Optional<a> $$4 = cvd.b($$1, $$2, $$0);
        if ($$4.isEmpty()) {
            return;
        }
        dxd $$5 = $$4.get().b;
        if ($$5 == dxf.c) {
            float $$6 = 0.17578125f;
        } else if ($$5 == dxf.e) {
            float $$7 = 0.05859375f;
        } else {
            return;
        }
        if ($$3 >= $$8) {
            return;
        }
        gu $$9 = cvd.a($$0, $$1, $$2, 11, false);
        if ($$9 == null) {
            return;
        }
        if ($$4.get().c.a(cpo.rH) && $$5 == dxf.c) {
            dcb $$10 = cpo.dR.n();
            $$1.b($$4.get().a, $$10);
            cpn.a($$4.get().c, $$10, $$1, $$4.get().a);
            $$1.a(dgl.c, $$4.get().a, dgl.a.a($$10));
            $$1.c(1504, $$9, 0);
            return;
        }
        gu $$11 = cvd.a((cmm)$$1, $$9, $$5);
        if ($$11 == null) {
            return;
        }
        $$1.c(1504, $$9, 0);
        int $$12 = $$9.v() - $$11.v();
        int $$13 = 50 + $$12;
        dcb $$14 = $$1.a_($$11);
        $$1.a($$11, $$14.b(), $$13);
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        ha $$3;
        gu $$2;
        cmm $$1 = $$0.q();
        ha $$4 = cvd.b((cmp)$$1, $$2 = $$0.a(), $$3 = $$0.e().g());
        if ($$4 == null) {
            return null;
        }
        boolean $$5 = !$$0.h();
        dcy $$6 = cvd.a((cmp)$$1, $$2, $$4, $$5);
        if ($$6 == null) {
            return null;
        }
        return (dcb)((dcb)((dcb)this.n().a(a, $$4)).a(b, $$6)).a(c, $$1.b_($$2).a() == dxf.c);
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(c).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    public efb f(dcb $$0, cls $$1, gu $$2) {
        return eey.a();
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        efb $$10;
        dcy $$4 = $$0.c(b);
        if ($$4 == dcy.a) {
            efb $$5 = K;
        } else if ($$4 == dcy.b) {
            if ($$0.c(a) == ha.a) {
                efb $$6 = M;
            } else {
                efb $$7 = L;
            }
        } else if ($$4 == dcy.c) {
            efb $$8 = N;
        } else if ($$4 == dcy.d) {
            efb $$9 = O;
        } else {
            $$10 = P;
        }
        eei $$11 = $$0.n($$1, $$2);
        return $$10.a($$11.c, 0.0, $$11.e);
    }

    @Override
    public boolean a_(dcb $$0, cls $$1, gu $$2) {
        return false;
    }

    @Override
    public float al_() {
        return 0.125f;
    }

    @Override
    public void a(cmm $$0, gu $$1, bvg $$2) {
        if (!$$2.aQ()) {
            $$0.c(1045, $$1, 0);
        }
    }

    @Override
    public ben a(bfj $$0) {
        return $$0.dJ().c($$0);
    }

    private static void a(dcb $$0, aif $$1, gu $$2) {
        gu.a $$3 = $$2.j();
        dcb $$4 = $$0;
        while (cvd.n($$4)) {
            bvg $$5 = bvg.a($$1, $$3, $$4);
            if (cvd.a($$4, true)) {
                int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
                float $$7 = 1.0f * (float)$$6;
                $$5.b($$7, 40);
                break;
            }
            $$3.c(ha.a);
            $$4 = $$1.a_($$3);
        }
    }

    @VisibleForTesting
    public static void c(dcb $$0, aif $$1, gu $$2, apf $$3) {
        dcb $$5;
        dcb $$4 = $$1.a_($$2.b(1));
        if (!cvd.a($$4, $$5 = $$1.a_($$2.b(2)))) {
            return;
        }
        gu $$6 = cvd.a($$0, $$1, $$2, 7, false);
        if ($$6 == null) {
            return;
        }
        dcb $$7 = $$1.a_($$6);
        if (!cvd.h($$7) || !cvd.b($$7, $$1, $$6)) {
            return;
        }
        if ($$3.h()) {
            cvd.a($$1, $$6, ha.a);
        } else {
            cvd.b($$1, $$6);
        }
    }

    private static void b(aif $$0, gu $$1) {
        gu.a $$2 = $$1.j();
        for (int $$3 = 0; $$3 < 10; ++$$3) {
            $$2.c(ha.a);
            dcb $$4 = $$0.a_($$2);
            if (!$$4.u().c()) {
                return;
            }
            if (cvd.a($$4, ha.b) && cvd.b($$4, $$0, (gu)$$2)) {
                cvd.a($$0, (gu)$$2, ha.b);
                return;
            }
            if (cvd.c((cmp)$$0, (gu)$$2, ha.b) && !$$0.y($$2.d())) {
                cvd.a($$0, $$2.d(), ha.b);
                return;
            }
            if (cvd.b((cls)$$0, (gu)$$2, $$4)) continue;
            return;
        }
    }

    private static void a(aif $$0, gu $$1, ha $$2) {
        gu $$3 = $$1.a($$2);
        dcb $$4 = $$0.a_($$3);
        if (cvd.a($$4, $$2.g())) {
            cvd.a($$4, (cmn)$$0, $$3);
        } else if ($$4.i() || $$4.a(cpo.G)) {
            cvd.a((cmn)$$0, $$3, $$2, dcy.b);
        }
    }

    private static void a(cmn $$0, gu $$1, ha $$2, dcy $$3) {
        dcb $$4 = (dcb)((dcb)((dcb)cpo.rs.n().a(a, $$2)).a(b, $$3)).a(c, $$0.b_($$1).a() == dxf.c);
        $$0.a($$1, $$4, 3);
    }

    private static void a(dcb $$0, cmn $$1, gu $$2) {
        gu $$6;
        gu $$5;
        if ($$0.c(a) == ha.b) {
            gu $$3 = $$2;
            gu $$4 = $$2.c();
        } else {
            $$5 = $$2;
            $$6 = $$2.d();
        }
        cvd.a($$1, $$5, ha.a, dcy.a);
        cvd.a($$1, $$6, ha.b, dcy.a);
    }

    public static void a(cmm $$0, gu $$1, dcb $$2) {
        cvd.b($$0, $$1, $$2).ifPresent($$3 -> cvd.a($$0, $$1, $$2, $$3.b));
    }

    private static void a(cmm $$0, gu $$1, dcb $$2, dxd $$3) {
        eei $$4 = $$2.n($$0, $$1);
        double $$5 = 0.0625;
        double $$6 = (double)$$1.u() + 0.5 + $$4.c;
        double $$7 = (double)((float)($$1.v() + 1) - 0.6875f) - 0.0625;
        double $$8 = (double)$$1.w() + 0.5 + $$4.e;
        dxd $$9 = cvd.a($$0, $$3);
        iy $$10 = $$9.a(anb.b) ? iv.aF : iv.aH;
        $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
    }

    @Nullable
    private static gu a(dcb $$0, cmn $$12, gu $$22, int $$3, boolean $$4) {
        if (cvd.a($$0, $$4)) {
            return $$22;
        }
        ha $$5 = $$0.c(a);
        BiPredicate<gu, dcb> $$6 = ($$1, $$2) -> $$2.a(cpo.rs) && $$2.c(a) == $$5;
        return cvd.a($$12, $$22, $$5.f(), $$6, (dcb $$1) -> cvd.a($$1, $$4), $$3).orElse(null);
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    private static ha b(cmp $$0, gu $$1, ha $$2) {
        void $$5;
        if (cvd.c($$0, $$1, $$2)) {
            ha $$3 = $$2;
        } else if (cvd.c($$0, $$1, $$2.g())) {
            ha $$4 = $$2.g();
        } else {
            return null;
        }
        return $$5;
    }

    private static dcy a(cmp $$0, gu $$1, ha $$2, boolean $$3) {
        ha $$4 = $$2.g();
        dcb $$5 = $$0.a_($$1.a($$2));
        if (cvd.b($$5, $$4)) {
            if ($$3 || $$5.c(b) == dcy.a) {
                return dcy.a;
            }
            return dcy.b;
        }
        if (!cvd.b($$5, $$2)) {
            return dcy.b;
        }
        dcy $$6 = $$5.c(b);
        if ($$6 == dcy.b || $$6 == dcy.a) {
            return dcy.c;
        }
        dcb $$7 = $$0.a_($$1.a($$4));
        if (!cvd.b($$7, $$2)) {
            return dcy.e;
        }
        return dcy.d;
    }

    public static boolean h(dcb $$0) {
        return cvd.n($$0) && $$0.c(b) == dcy.b && $$0.c(c) == false;
    }

    private static boolean b(dcb $$0, aif $$1, gu $$2) {
        ha $$3 = $$0.c(a);
        gu $$4 = $$2.a($$3);
        dcb $$5 = $$1.a_($$4);
        if (!$$5.u().c()) {
            return false;
        }
        if ($$5.i()) {
            return true;
        }
        return cvd.a($$5, $$3.g());
    }

    private static Optional<gu> a(cmm $$02, gu $$12, dcb $$22, int $$3) {
        ha $$4 = $$22.c(a);
        BiPredicate<gu, dcb> $$5 = ($$1, $$2) -> $$2.a(cpo.rs) && $$2.c(a) == $$4;
        return cvd.a($$02, $$12, $$4.g().f(), $$5, (dcb $$0) -> !$$0.a(cpo.rs), $$3);
    }

    private static boolean c(cmp $$0, gu $$1, ha $$2) {
        gu $$3 = $$1.a($$2.g());
        dcb $$4 = $$0.a_($$3);
        return $$4.d($$0, $$3, $$2) || cvd.b($$4, $$2);
    }

    private static boolean a(dcb $$0, boolean $$1) {
        if (!$$0.a(cpo.rs)) {
            return false;
        }
        dcy $$2 = $$0.c(b);
        return $$2 == dcy.b || $$1 && $$2 == dcy.a;
    }

    private static boolean a(dcb $$0, ha $$1) {
        return cvd.a($$0, false) && $$0.c(a) == $$1;
    }

    private static boolean n(dcb $$0) {
        return cvd.b($$0, ha.a);
    }

    private static boolean o(dcb $$0) {
        return cvd.b($$0, ha.b);
    }

    private static boolean b(dcb $$0, cmp $$1, gu $$2) {
        return cvd.n($$0) && !$$1.a_($$2.c()).a(cpo.rs);
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        return false;
    }

    private static boolean b(dcb $$0, ha $$1) {
        return $$0.a(cpo.rs) && $$0.c(a) == $$1;
    }

    @Nullable
    private static gu a(cmm $$0, gu $$12, dxd $$22) {
        Predicate<dcb> $$3 = $$1 -> $$1.b() instanceof cof && ((cof)$$1.b()).a($$22);
        BiPredicate<gu, dcb> $$4 = ($$1, $$2) -> cvd.b((cls)$$0, $$1, $$2);
        return cvd.a($$0, $$12, ha.a.f(), $$4, $$3, 11).orElse(null);
    }

    @Nullable
    public static gu a(cmm $$0, gu $$12) {
        BiPredicate<gu, dcb> $$22 = ($$1, $$2) -> cvd.b((cls)$$0, $$1, $$2);
        return cvd.a($$0, $$12, ha.b.f(), $$22, cvd::h, 11).orElse(null);
    }

    public static dxd a(aif $$02, gu $$1) {
        return cvd.b($$02, $$1, $$02.a_($$1)).map($$0 -> $$0.b).filter(cvd::a).orElse(dxf.a);
    }

    private static Optional<a> b(cmm $$0, gu $$12, dcb $$2) {
        if (!cvd.n($$2)) {
            return Optional.empty();
        }
        return cvd.a($$0, $$12, $$2, 11).map($$1 -> {
            dxd $$5;
            gu $$2 = $$1.c();
            dcb $$3 = $$0.a_($$2);
            if ($$3.a(cpo.rH) && !$$0.x_().i()) {
                dxc $$4 = dxf.c;
            } else {
                $$5 = $$0.b_($$2).a();
            }
            return new a($$2, $$5, $$3);
        });
    }

    private static boolean a(dxd $$0) {
        return $$0 == dxf.e || $$0 == dxf.c;
    }

    private static boolean a(dcb $$0, dcb $$1) {
        return $$0.a(cpo.rt) && $$1.a(cpo.G) && $$1.u().b();
    }

    private static dxd a(cmm $$0, dxd $$1) {
        if ($$1.a(dxf.a)) {
            return $$0.x_().i() ? dxf.e : dxf.c;
        }
        return $$1;
    }

    private static Optional<gu> a(cmn $$0, gu $$1, ha.b $$2, BiPredicate<gu, dcb> $$3, Predicate<dcb> $$4, int $$5) {
        ha $$6 = ha.a($$2, ha.a.b);
        gu.a $$7 = $$1.j();
        for (int $$8 = 1; $$8 < $$5; ++$$8) {
            $$7.c($$6);
            dcb $$9 = $$0.a_($$7);
            if ($$4.test($$9)) {
                return Optional.of($$7.i());
            }
            if (!$$0.d($$7.v()) && $$3.test($$7, $$9)) continue;
            return Optional.empty();
        }
        return Optional.empty();
    }

    private static boolean b(cls $$0, gu $$1, dcb $$2) {
        if ($$2.i()) {
            return true;
        }
        if ($$2.i($$0, $$1)) {
            return false;
        }
        if (!$$2.u().c()) {
            return false;
        }
        efb $$3 = $$2.k($$0, $$1);
        return !eey.c(R, $$3, eem.i);
    }

    static final class a
    extends Record {
        final gu a;
        final dxd b;
        final dcb c;

        a(gu $$0, dxd $$1, dcb $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "pos;fluid;sourceState", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "pos;fluid;sourceState", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "pos;fluid;sourceState", "a", "b", "c"}, this, $$0);
        }

        public gu a() {
            return this.a;
        }

        public dxd b() {
            return this.b;
        }

        public dcb c() {
            return this.c;
        }
    }
}

