/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dyc {
    private static final int c = 2;
    public static final int a = 21;
    private static final int d = 3;
    public static final int b = 21;
    private static final dca.f e = ($$0, $$1, $$2) -> $$0.a(cpo.co);
    private static final float f = 4.0f;
    private static final double g = 1.0;
    private final cmn h;
    private final ha.a i;
    private final ha j;
    private int k;
    @Nullable
    private gu l;
    private int m;
    private final int n;

    public static Optional<dyc> a(cmn $$02, gu $$1, ha.a $$2) {
        return dyc.a($$02, $$1, (dyc $$0) -> $$0.a() && $$0.k == 0, $$2);
    }

    public static Optional<dyc> a(cmn $$0, gu $$1, Predicate<dyc> $$2, ha.a $$3) {
        Optional<dyc> $$4 = Optional.of(new dyc($$0, $$1, $$3)).filter($$2);
        if ($$4.isPresent()) {
            return $$4;
        }
        ha.a $$5 = $$3 == ha.a.a ? ha.a.c : ha.a.a;
        return Optional.of(new dyc($$0, $$1, $$5)).filter($$2);
    }

    public dyc(cmn $$0, gu $$1, ha.a $$2) {
        this.h = $$0;
        this.i = $$2;
        this.j = $$2 == ha.a.a ? ha.e : ha.d;
        this.l = this.a($$1);
        if (this.l == null) {
            this.l = $$1;
            this.n = 1;
            this.m = 1;
        } else {
            this.n = this.d();
            if (this.n > 0) {
                this.m = this.e();
            }
        }
    }

    @Nullable
    private gu a(gu $$0) {
        int $$1 = Math.max(this.h.C_(), $$0.v() - 21);
        while ($$0.v() > $$1 && dyc.a(this.h.a_($$0.d()))) {
            $$0 = $$0.d();
        }
        ha $$2 = this.j.g();
        int $$3 = this.a($$0, $$2) - 1;
        if ($$3 < 0) {
            return null;
        }
        return $$0.a($$2, $$3);
    }

    private int d() {
        int $$0 = this.a(this.l, this.j);
        if ($$0 < 2 || $$0 > 21) {
            return 0;
        }
        return $$0;
    }

    private int a(gu $$0, ha $$1) {
        gu.a $$2 = new gu.a();
        for (int $$3 = 0; $$3 <= 21; ++$$3) {
            $$2.g($$0).c($$1, $$3);
            dcb $$4 = this.h.a_($$2);
            if (!dyc.a($$4)) {
                if (!e.test($$4, this.h, $$2)) break;
                return $$3;
            }
            dcb $$5 = this.h.a_($$2.c(ha.a));
            if (!e.test($$5, this.h, $$2)) break;
        }
        return 0;
    }

    private int e() {
        gu.a $$0 = new gu.a();
        int $$1 = this.a($$0);
        if ($$1 < 3 || $$1 > 21 || !this.a($$0, $$1)) {
            return 0;
        }
        return $$1;
    }

    private boolean a(gu.a $$0, int $$1) {
        for (int $$2 = 0; $$2 < this.n; ++$$2) {
            gu.a $$3 = $$0.g(this.l).c(ha.b, $$1).c(this.j, $$2);
            if (e.test(this.h.a_($$3), this.h, $$3)) continue;
            return false;
        }
        return true;
    }

    private int a(gu.a $$0) {
        for (int $$1 = 0; $$1 < 21; ++$$1) {
            $$0.g(this.l).c(ha.b, $$1).c(this.j, -1);
            if (!e.test(this.h.a_($$0), this.h, $$0)) {
                return $$1;
            }
            $$0.g(this.l).c(ha.b, $$1).c(this.j, this.n);
            if (!e.test(this.h.a_($$0), this.h, $$0)) {
                return $$1;
            }
            for (int $$2 = 0; $$2 < this.n; ++$$2) {
                $$0.g(this.l).c(ha.b, $$1).c(this.j, $$2);
                dcb $$3 = this.h.a_($$0);
                if (!dyc.a($$3)) {
                    return $$1;
                }
                if (!$$3.a(cpo.ee)) continue;
                ++this.k;
            }
        }
        return 21;
    }

    private static boolean a(dcb $$0) {
        return $$0.i() || $$0.a(amw.aI) || $$0.a(cpo.ee);
    }

    public boolean a() {
        return this.l != null && this.n >= 2 && this.n <= 21 && this.m >= 3 && this.m <= 21;
    }

    public void b() {
        dcb $$0 = (dcb)cpo.ee.n().a(cup.a, this.i);
        gu.a(this.l, this.l.a(ha.b, this.m - 1).a(this.j, this.n - 1)).forEach($$1 -> this.h.a((gu)$$1, $$0, 18));
    }

    public boolean c() {
        return this.a() && this.k == this.n * this.m;
    }

    public static eei a(l.a $$0, ha.a $$1, eei $$2, bfk $$3) {
        double $$12;
        double $$9;
        double $$4 = (double)$$0.b - (double)$$3.a;
        double $$5 = (double)$$0.c - (double)$$3.b;
        gu $$6 = $$0.a;
        if ($$4 > 0.0) {
            float $$7 = (float)$$6.a($$1) + $$3.a / 2.0f;
            double $$8 = apa.a(apa.c($$2.a($$1) - (double)$$7, 0.0, $$4), 0.0, 1.0);
        } else {
            $$9 = 0.5;
        }
        if ($$5 > 0.0) {
            ha.a $$10 = ha.a.b;
            double $$11 = apa.a(apa.c($$2.a($$10) - (double)$$6.a($$10), 0.0, $$5), 0.0, 1.0);
        } else {
            $$12 = 0.0;
        }
        ha.a $$13 = $$1 == ha.a.a ? ha.a.c : ha.a.a;
        double $$14 = $$2.a($$13) - ((double)$$6.a($$13) + 0.5);
        return new eei($$9, $$12, $$14);
    }

    public static dyb a(aif $$0, l.a $$1, ha.a $$2, eei $$3, bfj $$4, eei $$5, float $$6, float $$7) {
        gu $$8 = $$1.a;
        dcb $$9 = $$0.a_($$8);
        ha.a $$10 = $$9.d(dcr.H).orElse(ha.a.a);
        double $$11 = $$1.b;
        double $$12 = $$1.c;
        bfk $$13 = $$4.a($$4.al());
        int $$14 = $$2 == $$10 ? 0 : 90;
        eei $$15 = $$2 == $$10 ? $$5 : new eei($$5.e, $$5.d, -$$5.c);
        double $$16 = (double)$$13.a / 2.0 + ($$11 - (double)$$13.a) * $$3.a();
        double $$17 = ($$12 - (double)$$13.b) * $$3.b();
        double $$18 = 0.5 + $$3.c();
        boolean $$19 = $$10 == ha.a.a;
        eei $$20 = new eei((double)$$8.u() + ($$19 ? $$16 : $$18), (double)$$8.v() + $$17, (double)$$8.w() + ($$19 ? $$18 : $$16));
        eei $$21 = dyc.a($$20, $$0, $$4, $$13);
        return new dyb($$21, $$15, $$6 + (float)$$14, $$7);
    }

    private static eei a(eei $$0, aif $$12, bfj $$2, bfk $$3) {
        if ($$3.a > 4.0f || $$3.b > 4.0f) {
            return $$0;
        }
        double $$4 = (double)$$3.b / 2.0;
        eei $$5 = $$0.b(0.0, $$4, 0.0);
        efb $$6 = eey.a(eed.a($$5, $$3.a, 0.0, $$3.a).b(0.0, 1.0, 0.0).g(1.0E-6));
        Optional<eei> $$7 = $$12.a($$2, $$6, $$5, (double)$$3.a, (double)$$3.b, (double)$$3.a);
        Optional<eei> $$8 = $$7.map($$1 -> $$1.a(0.0, $$4, 0.0));
        return $$8.orElse($$0);
    }
}

