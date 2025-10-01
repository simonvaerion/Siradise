/*
 * Decompiled with CFR 0.152.
 */
public class cvn
extends cpn {
    public static final dcs a = cvq.a;

    public cvn(dca.d $$0) {
        super($$0);
        this.k((dcb)this.n().a(a, false));
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, byo $$3) {
        cvn.d($$0, $$1, $$2);
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, bfj $$3) {
        if (!$$3.bQ()) {
            cvn.d($$2, $$0, $$1);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        if ($$1.B) {
            cvn.a($$1, $$2);
        } else {
            cvn.d($$0, $$1, $$2);
        }
        cfz $$6 = $$3.b($$4);
        if ($$6.d() instanceof cds && new cih($$3, $$4, $$6, $$5).b()) {
            return bdx.d;
        }
        return bdx.a;
    }

    private static void d(dcb $$0, cmm $$1, gu $$2) {
        cvn.a($$1, $$2);
        if (!$$0.c(a).booleanValue()) {
            $$1.a($$2, (dcb)$$0.a(a, true), 3);
        }
    }

    @Override
    public boolean e_(dcb $$0) {
        return $$0.c(a);
    }

    @Override
    public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if ($$0.c(a).booleanValue()) {
            $$1.a($$2, (dcb)$$0.a(a, false), 3);
        }
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, cfz $$3, boolean $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        if ($$4 && cki.a(ckk.v, $$3) == 0) {
            int $$5 = 1 + $$1.z.a(5);
            this.a($$1, $$2, $$5);
        }
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
        if ($$0.c(a).booleanValue()) {
            cvn.a($$1, $$2);
        }
    }

    private static void a(cmm $$0, gu $$1) {
        double $$2 = 0.5625;
        apf $$3 = $$0.z;
        for (ha $$4 : ha.values()) {
            gu $$5 = $$1.a($$4);
            if ($$0.a_($$5).i($$0, $$5)) continue;
            ha.a $$6 = $$4.o();
            double $$7 = $$6 == ha.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ha.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ha.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(ip.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{a});
    }
}

