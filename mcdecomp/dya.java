/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.Optional;

public class dya {
    private static final int a = 3;
    private static final int b = 128;
    private static final int c = 16;
    private static final int d = 5;
    private static final int e = 4;
    private static final int f = 3;
    private static final int g = -1;
    private static final int h = 4;
    private static final int i = -1;
    private static final int j = 3;
    private static final int k = -1;
    private static final int l = 2;
    private static final int m = -1;
    private final aif n;

    public dya(aif $$0) {
        this.n = $$0;
    }

    public Optional<l.a> a(gu $$02, boolean $$12, dds $$2) {
        bqz $$3 = this.n.w();
        int $$4 = $$12 ? 16 : 128;
        $$3.a(this.n, $$02, $$4);
        Optional<bra> $$5 = $$3.b($$0 -> $$0.a(brd.r), $$02, $$4, bqz.b.c).filter($$1 -> $$2.a($$1.f())).sorted(Comparator.comparingDouble($$1 -> $$1.f().j($$02)).thenComparingInt($$0 -> $$0.f().v())).filter($$0 -> this.n.a_($$0.f()).b(dcr.H)).findFirst();
        return $$5.map($$0 -> {
            gu $$12 = $$0.f();
            this.n.k().a(aik.f, new clt($$12), 3, $$12);
            dcb $$2 = this.n.a_($$12);
            return l.a($$12, $$2.c(dcr.H), 21, ha.a.b, 21, $$1 -> this.n.a_((gu)$$1) == $$2);
        });
    }

    public Optional<l.a> a(gu $$0, ha.a $$1) {
        ha $$2 = ha.a(ha.b.a, $$1);
        double $$3 = -1.0;
        gu $$4 = null;
        double $$5 = -1.0;
        gu $$6 = null;
        dds $$7 = this.n.w_();
        int $$8 = Math.min(this.n.aj(), this.n.C_() + this.n.j()) - 1;
        gu.a $$9 = $$0.j();
        for (gu.a $$10 : gu.a($$0, 16, ha.f, ha.d)) {
            int $$11 = Math.min($$8, this.n.a(dhk.a.e, $$10.u(), $$10.w()));
            boolean $$12 = true;
            if (!$$7.a($$10) || !$$7.a($$10.c($$2, 1))) continue;
            $$10.c($$2.g(), 1);
            for (int $$13 = $$11; $$13 >= this.n.C_(); --$$13) {
                int $$15;
                $$10.q($$13);
                if (!this.a($$10)) continue;
                int $$14 = $$13;
                while ($$13 > this.n.C_() && this.a($$10.c(ha.a))) {
                    --$$13;
                }
                if ($$13 + 4 > $$8 || ($$15 = $$14 - $$13) > 0 && $$15 < 3) continue;
                $$10.q($$13);
                if (!this.a($$10, $$9, $$2, 0)) continue;
                double $$16 = $$0.j($$10);
                if (this.a($$10, $$9, $$2, -1) && this.a($$10, $$9, $$2, 1) && ($$3 == -1.0 || $$3 > $$16)) {
                    $$3 = $$16;
                    $$4 = $$10.i();
                }
                if ($$3 != -1.0 || $$5 != -1.0 && !($$5 > $$16)) continue;
                $$5 = $$16;
                $$6 = $$10.i();
            }
        }
        if ($$3 == -1.0 && $$5 != -1.0) {
            $$4 = $$6;
            $$3 = $$5;
        }
        if ($$3 == -1.0) {
            int $$18 = $$8 - 9;
            int $$17 = Math.max(this.n.C_() - -1, 70);
            if ($$18 < $$17) {
                return Optional.empty();
            }
            $$4 = new gu($$0.u(), apa.a($$0.v(), $$17, $$18), $$0.w()).i();
            ha $$19 = $$2.h();
            if (!$$7.a($$4)) {
                return Optional.empty();
            }
            for (int $$20 = -1; $$20 < 2; ++$$20) {
                for (int $$21 = 0; $$21 < 2; ++$$21) {
                    for (int $$22 = -1; $$22 < 3; ++$$22) {
                        dcb $$23 = $$22 < 0 ? cpo.co.n() : cpo.a.n();
                        $$9.a($$4, $$21 * $$2.j() + $$20 * $$19.j(), $$22, $$21 * $$2.l() + $$20 * $$19.l());
                        this.n.b((gu)$$9, $$23);
                    }
                }
            }
        }
        for (int $$24 = -1; $$24 < 3; ++$$24) {
            for (int $$25 = -1; $$25 < 4; ++$$25) {
                if ($$24 != -1 && $$24 != 2 && $$25 != -1 && $$25 != 3) continue;
                $$9.a($$4, $$24 * $$2.j(), $$25, $$24 * $$2.l());
                this.n.a((gu)$$9, cpo.co.n(), 3);
            }
        }
        dcb $$26 = (dcb)cpo.ee.n().a(cup.a, $$1);
        for (int $$27 = 0; $$27 < 2; ++$$27) {
            for (int $$28 = 0; $$28 < 3; ++$$28) {
                $$9.a($$4, $$27 * $$2.j(), $$28, $$27 * $$2.l());
                this.n.a((gu)$$9, $$26, 18);
            }
        }
        return Optional.of(new l.a($$4.i(), 2, 3));
    }

    private boolean a(gu.a $$0) {
        dcb $$1 = this.n.a_($$0);
        return $$1.r() && $$1.u().c();
    }

    private boolean a(gu $$0, gu.a $$1, ha $$2, int $$3) {
        ha $$4 = $$2.h();
        for (int $$5 = -1; $$5 < 3; ++$$5) {
            for (int $$6 = -1; $$6 < 4; ++$$6) {
                $$1.a($$0, $$2.j() * $$5 + $$4.j() * $$3, $$6, $$2.l() * $$5 + $$4.l() * $$3);
                if ($$6 < 0 && !this.n.a_($$1).e()) {
                    return false;
                }
                if ($$6 < 0 || this.a($$1)) continue;
                return false;
            }
        }
        return true;
    }
}

