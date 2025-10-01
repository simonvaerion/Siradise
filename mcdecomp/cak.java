/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.Function;
import javax.annotation.Nullable;

public class cak {
    public static int[][] a(ha $$0) {
        ha $$1 = $$0.h();
        ha $$2 = $$1.g();
        ha $$3 = $$0.g();
        return new int[][]{{$$1.j(), $$1.l()}, {$$2.j(), $$2.l()}, {$$3.j() + $$1.j(), $$3.l() + $$1.l()}, {$$3.j() + $$2.j(), $$3.l() + $$2.l()}, {$$0.j() + $$1.j(), $$0.l() + $$1.l()}, {$$0.j() + $$2.j(), $$0.l() + $$2.l()}, {$$3.j(), $$3.l()}, {$$0.j(), $$0.l()}};
    }

    public static boolean a(double $$0) {
        return !Double.isInfinite($$0) && $$0 < 1.0;
    }

    public static boolean a(clw $$0, bfz $$1, eed $$2) {
        Iterable<efb> $$3 = $$0.d($$1, $$2);
        for (efb $$4 : $$3) {
            if ($$4.b()) continue;
            return false;
        }
        return $$0.w_().a($$2);
    }

    public static boolean a(clw $$0, eei $$1, bfz $$2, bgl $$3) {
        return cak.a($$0, $$2, $$2.g($$3).c($$1));
    }

    public static efb a(cls $$0, gu $$1) {
        dcb $$2 = $$0.a_($$1);
        if ($$2.a(amw.aN) || $$2.b() instanceof cya && $$2.c(cya.a).booleanValue()) {
            return eey.a();
        }
        return $$2.k($$0, $$1);
    }

    public static double a(gu $$0, int $$1, Function<gu, efb> $$2) {
        gu.a $$3 = $$0.j();
        for (int $$4 = 0; $$4 < $$1; ++$$4) {
            efb $$5 = $$2.apply($$3);
            if (!$$5.b()) {
                return (double)($$0.v() + $$4) + $$5.b(ha.a.b);
            }
            $$3.c(ha.b);
        }
        return Double.POSITIVE_INFINITY;
    }

    @Nullable
    public static eei a(bfn<?> $$0, clw $$1, gu $$2, boolean $$3) {
        if ($$3 && $$0.a($$1.a_($$2))) {
            return null;
        }
        double $$4 = $$1.a(cak.a((cls)$$1, $$2), () -> cak.a((cls)$$1, $$2.d()));
        if (!cak.a($$4)) {
            return null;
        }
        if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.d()))) {
            return null;
        }
        eei $$5 = eei.a($$2, $$4);
        eed $$6 = $$0.n().a($$5);
        Iterable<efb> $$7 = $$1.d(null, $$6);
        for (efb $$8 : $$7) {
            if ($$8.b()) continue;
            return null;
        }
        if ($$0 == bfn.bt && ($$1.a_($$2).a(amw.cg) || $$1.a_($$2.c()).a(amw.cg))) {
            return null;
        }
        if (!$$1.w_().a($$6)) {
            return null;
        }
        return $$5;
    }
}

