/*
 * Decompiled with CFR 0.152.
 */
public class cxv
extends cpn {
    private static final ddb a = dcr.aT;
    private static final int b = 20;
    private static final int c = 8;

    public cxv(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)this.C.b()).a(a, 0));
    }

    @Override
    public void a(cmm $$0, dcb $$1, eee $$2, bzg $$3) {
        int $$4 = cxv.a((cmn)$$0, $$1, $$2, $$3);
        bfj $$5 = $$3.v();
        if ($$5 instanceof aig) {
            aig $$6 = (aig)$$5;
            $$6.a(amr.aE);
            ai.L.a($$6, $$3, $$2.e(), $$4);
        }
    }

    private static int a(cmn $$0, dcb $$1, eee $$2, bfj $$3) {
        int $$5;
        int $$4 = cxv.a($$2, $$2.e());
        int n2 = $$5 = $$3 instanceof byu ? 20 : 8;
        if (!$$0.L().a($$2.a(), $$1.b())) {
            cxv.a($$0, $$1, $$4, $$2.a(), $$5);
        }
        return $$4;
    }

    private static int a(eee $$0, eei $$1) {
        double $$9;
        ha $$2 = $$0.b();
        double $$3 = Math.abs(apa.e($$1.c) - 0.5);
        double $$4 = Math.abs(apa.e($$1.d) - 0.5);
        double $$5 = Math.abs(apa.e($$1.e) - 0.5);
        ha.a $$6 = $$2.o();
        if ($$6 == ha.a.b) {
            double $$7 = Math.max($$3, $$5);
        } else if ($$6 == ha.a.c) {
            double $$8 = Math.max($$3, $$4);
        } else {
            $$9 = Math.max($$4, $$5);
        }
        return Math.max(1, apa.c(15.0 * apa.a((0.5 - $$9) / 0.5, 0.0, 1.0)));
    }

    private static void a(cmn $$0, dcb $$1, int $$2, gu $$3, int $$4) {
        $$0.a($$3, (dcb)$$1.a(a, $$2), 3);
        $$0.a($$3, $$1.b(), $$4);
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if ($$0.c(a) != 0) {
            $$1.a($$2, (dcb)$$0.a(a, 0), 3);
        }
    }

    @Override
    public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
        return $$0.c(a);
    }

    @Override
    public boolean f_(dcb $$0) {
        return true;
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{a});
    }

    @Override
    public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$1.r_() || $$0.a($$3.b())) {
            return;
        }
        if ($$0.c(a) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, (dcb)$$0.a(a, 0), 18);
        }
    }
}

