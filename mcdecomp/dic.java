/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;

public class dic {
    private static final dcb a = cpo.hj.n();
    private static final dcb b = cpo.hk.n();
    private static final dcb c = cpo.iA.n();
    private static final dcb d = cpo.hn.n();
    private static final dcb e = cpo.hv.n();
    private static final dcb f = cpo.hx.n();
    private static final dcb g = cpo.hr.n();
    private static final dcb h = cpo.iC.n();
    private static final dcb i = cpo.dP.n();
    private final dcb j;
    private final int k;
    private final dcb[] l;
    private final dwh m;
    private final dwh n;
    private final dwh o;
    private final dwh p;
    private final dwh q;
    private final dwh r;
    private final dwh s;
    private final dhx t;
    private final dwh u;
    private final dwh v;

    public dic(dhy $$0, dcb $$1, int $$2, dhx $$3) {
        this.j = $$1;
        this.k = $$2;
        this.t = $$3;
        this.m = $$0.a(dht.P);
        this.l = dic.a($$3.a(new acq("clay_bands")));
        this.u = $$0.a(dht.N);
        this.v = $$0.a(dht.O);
        this.n = $$0.a(dht.Q);
        this.o = $$0.a(dht.R);
        this.p = $$0.a(dht.S);
        this.q = $$0.a(dht.T);
        this.r = $$0.a(dht.U);
        this.s = $$0.a(dht.V);
    }

    public void a(dhy $$0, cnm $$1, hr<cnk> $$2, boolean $$3, dih $$4, final ddx $$5, dho $$6, dib.o $$7) {
        final gu.a $$8 = new gu.a();
        final clt $$9 = $$5.f();
        int $$10 = $$9.d();
        int $$11 = $$9.e();
        ddu $$12 = new ddu(){

            @Override
            public dcb a(int $$0) {
                return $$5.a_($$8.q($$0));
            }

            @Override
            public void a(int $$0, dcb $$1) {
                cmo $$2 = $$5.z();
                if ($$0 >= $$2.C_() && $$0 < $$2.aj()) {
                    $$5.a($$8.q($$0), $$1, false);
                    if (!$$1.u().c()) {
                        $$5.e($$8);
                    }
                }
            }

            public String toString() {
                return "ChunkBlockColumn " + $$9;
            }
        };
        dib.g $$13 = new dib.g(this, $$0, $$5, $$6, $$1::a, $$2, $$4);
        dib.u $$14 = (dib.u)$$7.apply($$13);
        gu.a $$15 = new gu.a();
        for (int $$16 = 0; $$16 < 16; ++$$16) {
            for (int $$17 = 0; $$17 < 16; ++$$17) {
                int $$18 = $$10 + $$16;
                int $$19 = $$11 + $$17;
                int $$20 = $$5.a(dhk.a.a, $$16, $$17) + 1;
                $$8.p($$18).r($$19);
                he<cnk> $$21 = $$1.a($$15.d($$18, $$3 ? 0 : $$20, $$19));
                if ($$21.a(cnr.B)) {
                    this.a($$12, $$18, $$19, $$20, $$5);
                }
                int $$22 = $$5.a(dhk.a.a, $$16, $$17) + 1;
                $$13.a($$18, $$19);
                int $$23 = 0;
                int $$24 = Integer.MIN_VALUE;
                int $$25 = Integer.MAX_VALUE;
                int $$26 = $$5.C_();
                for (int $$27 = $$22; $$27 >= $$26; --$$27) {
                    dcb $$32;
                    dcb $$28 = $$12.a($$27);
                    if ($$28.i()) {
                        $$23 = 0;
                        $$24 = Integer.MIN_VALUE;
                        continue;
                    }
                    if (!$$28.u().c()) {
                        if ($$24 != Integer.MIN_VALUE) continue;
                        $$24 = $$27 + 1;
                        continue;
                    }
                    if ($$25 >= $$27) {
                        $$25 = dfk.g;
                        for (int $$29 = $$27 - 1; $$29 >= $$26 - 1; --$$29) {
                            dcb $$30 = $$12.a($$29);
                            if (this.a($$30)) continue;
                            $$25 = $$29 + 1;
                            break;
                        }
                    }
                    int $$31 = $$27 - $$25 + 1;
                    $$13.a(++$$23, $$31, $$24, $$18, $$27, $$19);
                    if ($$28 != this.j || ($$32 = $$14.tryApply($$18, $$27, $$19)) == null) continue;
                    $$12.a($$27, $$32);
                }
                if (!$$21.a(cnr.W) && !$$21.a(cnr.X)) continue;
                this.a($$13.b(), $$21.a(), $$12, $$15, $$18, $$19, $$20);
            }
        }
    }

    protected int a(int $$0, int $$1) {
        double $$2 = this.u.a($$0, 0.0, $$1);
        return (int)($$2 * 2.75 + 3.0 + this.t.a($$0, 0, $$1).j() * 0.25);
    }

    protected double b(int $$0, int $$1) {
        return this.v.a($$0, 0.0, $$1);
    }

    private boolean a(dcb $$0) {
        return !$$0.i() && $$0.u().c();
    }

    @Deprecated
    public Optional<dcb> a(dib.o $$0, djk $$1, Function<gu, he<cnk>> $$2, ddx $$3, dho $$4, gu $$5, boolean $$6) {
        dib.g $$7 = new dib.g(this, $$1.d(), $$3, $$4, $$2, $$1.c().d(jc.ap), $$1);
        dib.u $$8 = (dib.u)$$0.apply($$7);
        int $$9 = $$5.u();
        int $$10 = $$5.v();
        int $$11 = $$5.w();
        $$7.a($$9, $$11);
        $$7.a(1, 1, $$6 ? $$10 + 1 : Integer.MIN_VALUE, $$9, $$10, $$11);
        dcb $$12 = $$8.tryApply($$9, $$10, $$11);
        return Optional.ofNullable($$12);
    }

    private void a(ddu $$0, int $$1, int $$2, int $$3, cmo $$4) {
        dcb $$13;
        double $$5 = 0.2;
        double $$6 = Math.min(Math.abs(this.p.a($$1, 0.0, $$2) * 8.25), this.n.a((double)$$1 * 0.2, 0.0, (double)$$2 * 0.2) * 15.0);
        if ($$6 <= 0.0) {
            return;
        }
        double $$7 = 0.75;
        double $$8 = 1.5;
        double $$9 = Math.abs(this.o.a((double)$$1 * 0.75, 0.0, (double)$$2 * 0.75) * 1.5);
        double $$10 = 64.0 + Math.min($$6 * $$6 * 2.5, Math.ceil($$9 * 50.0) + 24.0);
        int $$11 = apa.a($$10);
        if ($$3 > $$11) {
            return;
        }
        for (int $$12 = $$11; $$12 >= $$4.C_() && !($$13 = $$0.a($$12)).a(this.j.b()); --$$12) {
            if (!$$13.a(cpo.G)) continue;
            return;
        }
        for (int $$14 = $$11; $$14 >= $$4.C_() && $$0.a($$14).i(); --$$14) {
            $$0.a($$14, this.j);
        }
    }

    private void a(int $$0, cnk $$1, ddu $$2, gu.a $$3, int $$4, int $$5, int $$6) {
        double $$14;
        double $$7 = 1.28;
        double $$8 = Math.min(Math.abs(this.s.a($$4, 0.0, $$5) * 8.25), this.q.a((double)$$4 * 1.28, 0.0, (double)$$5 * 1.28) * 15.0);
        if ($$8 <= 1.8) {
            return;
        }
        double $$9 = 1.17;
        double $$10 = 1.5;
        double $$11 = Math.abs(this.r.a((double)$$4 * 1.17, 0.0, (double)$$5 * 1.17) * 1.5);
        double $$12 = Math.min($$8 * $$8 * 1.2, Math.ceil($$11 * 40.0) + 14.0);
        if ($$1.d($$3.d($$4, 63, $$5))) {
            $$12 -= 2.0;
        }
        if ($$12 > 2.0) {
            double $$13 = (double)this.k - $$12 - 7.0;
            $$12 += (double)this.k;
        } else {
            $$12 = 0.0;
            $$14 = 0.0;
        }
        double $$15 = $$12;
        apf $$16 = this.t.a($$4, 0, $$5);
        int $$17 = 2 + $$16.a(4);
        int $$18 = this.k + 18 + $$16.a(10);
        int $$19 = 0;
        for (int $$20 = Math.max($$6, (int)$$15 + 1); $$20 >= $$0; --$$20) {
            if (!($$2.a($$20).i() && $$20 < (int)$$15 && $$16.j() > 0.01) && (!$$2.a($$20).a(cpo.G) || $$20 <= (int)$$14 || $$20 >= this.k || $$14 == 0.0 || !($$16.j() > 0.15))) continue;
            if ($$19 <= $$17 && $$20 > $$18) {
                $$2.a($$20, i);
                ++$$19;
                continue;
            }
            $$2.a($$20, h);
        }
    }

    private static dcb[] a(apf $$0) {
        Object[] $$1 = new dcb[192];
        Arrays.fill($$1, c);
        for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
            if (($$2 += $$0.a(5) + 1) >= $$1.length) continue;
            $$1[$$2] = b;
        }
        dic.a($$0, (dcb[])$$1, 1, d);
        dic.a($$0, (dcb[])$$1, 2, e);
        dic.a($$0, (dcb[])$$1, 1, f);
        int $$3 = $$0.a(9, 15);
        int $$4 = 0;
        for (int $$5 = 0; $$4 < $$3 && $$5 < $$1.length; ++$$4, $$5 += $$0.a(16) + 4) {
            $$1[$$5] = a;
            if ($$5 - 1 > 0 && $$0.h()) {
                $$1[$$5 - 1] = g;
            }
            if ($$5 + 1 >= $$1.length || !$$0.h()) continue;
            $$1[$$5 + 1] = g;
        }
        return $$1;
    }

    private static void a(apf $$0, dcb[] $$1, int $$2, dcb $$3) {
        int $$4 = $$0.a(6, 15);
        for (int $$5 = 0; $$5 < $$4; ++$$5) {
            int $$6 = $$2 + $$0.a(3);
            int $$7 = $$0.a($$1.length);
            for (int $$8 = 0; $$7 + $$8 < $$1.length && $$8 < $$6; ++$$8) {
                $$1[$$7 + $$8] = $$3;
            }
        }
    }

    protected dcb a(int $$0, int $$1, int $$2) {
        int $$3 = (int)Math.round(this.m.a($$0, 0.0, $$2) * 4.0);
        return this.l[($$1 + $$3 + this.l.length) % this.l.length];
    }
}

