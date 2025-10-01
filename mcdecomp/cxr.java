/*
 * Decompiled with CFR 0.152.
 */
public class cxr
extends cpv
implements cpp {
    private static final float c = 0.003f;
    public static final int a = 3;
    public static final ddb b = dcr.as;
    private static final efb d = cpn.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
    private static final efb e = cpn.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

    public cxr(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)this.C.b()).a(b, 0));
    }

    @Override
    public cfz a(cls $$0, gu $$1, dcb $$2) {
        return new cfz(cgc.vv);
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        if ($$0.c(b) == 0) {
            return d;
        }
        if ($$0.c(b) < 3) {
            return e;
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public boolean e_(dcb $$0) {
        return $$0.c(b) < 3;
    }

    @Override
    public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
        int $$4 = $$0.c(b);
        if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
            dcb $$5 = (dcb)$$0.a(b, $$4 + 1);
            $$1.a($$2, $$5, 2);
            $$1.a(dgl.c, $$2, dgl.a.a($$5));
        }
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
        if (!($$3 instanceof bfz) || $$3.ae() == bfn.N || $$3.ae() == bfn.h) {
            return;
        }
        $$3.a($$0, new eei(0.8f, 0.75, 0.8f));
        if (!($$1.B || $$0.c(b) <= 0 || $$3.ab == $$3.dn() && $$3.ad == $$3.dt())) {
            double $$4 = Math.abs($$3.dn() - $$3.ab);
            double $$5 = Math.abs($$3.dt() - $$3.ad);
            if ($$4 >= (double)0.003f || $$5 >= (double)0.003f) {
                $$3.a($$1.ag().s(), 1.0f);
            }
        }
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        boolean $$7;
        int $$6 = $$0.c(b);
        boolean bl2 = $$7 = $$6 == 3;
        if (!$$7 && $$3.b($$4).a(cgc.qK)) {
            return bdx.d;
        }
        if ($$6 > 1) {
            int $$8 = 1 + $$1.z.a(2);
            cxr.a($$1, $$2, new cfz(cgc.vv, $$8 + ($$7 ? 1 : 0)));
            $$1.a(null, $$2, amh.xz, ami.e, 1.0f, 0.8f + $$1.z.i() * 0.4f);
            dcb $$9 = (dcb)$$0.a(b, 1);
            $$1.a($$2, $$9, 2);
            $$1.a(dgl.c, $$2, dgl.a.a($$3, $$9));
            return bdx.a($$1.B);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{b});
    }

    @Override
    public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
        return $$2.c(b) < 3;
    }

    @Override
    public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
        return true;
    }

    @Override
    public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
        int $$4 = Math.min(3, $$3.c(b) + 1);
        $$0.a($$2, (dcb)$$3.a(b, $$4), 2);
    }
}

