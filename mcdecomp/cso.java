/*
 * Decompiled with CFR 0.152.
 */
public class cso
extends cti {
    public static final int a = 3;
    public static final ddb b = dcr.as;
    private static final int c = 4;
    private static final int d = 2;

    public cso(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)this.C.b()).a(b, 0));
    }

    @Override
    public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
        this.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if (($$3.a(3) == 0 || this.a((cls)$$1, $$2, 4)) && $$1.z($$2) > 11 - $$0.c(b) - $$0.b((cls)$$1, $$2) && this.e($$0, $$1, $$2)) {
            gu.a $$4 = new gu.a();
            for (ha $$5 : ha.values()) {
                $$4.a((hz)$$2, $$5);
                dcb $$6 = $$1.a_($$4);
                if (!$$6.a(this) || this.e($$6, $$1, $$4)) continue;
                $$1.a((gu)$$4, (cpn)this, apa.a($$3, 20, 40));
            }
            return;
        }
        $$1.a($$2, (cpn)this, apa.a($$3, 20, 40));
    }

    private boolean e(dcb $$0, cmm $$1, gu $$2) {
        int $$3 = $$0.c(b);
        if ($$3 < 3) {
            $$1.a($$2, (dcb)$$0.a(b, $$3 + 1), 2);
            return false;
        }
        this.d($$0, $$1, $$2);
        return true;
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
        if ($$3.n().a(this) && this.a((cls)$$1, $$2, 2)) {
            this.d($$0, $$1, $$2);
        }
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    private boolean a(cls $$0, gu $$1, int $$2) {
        int $$3 = 0;
        gu.a $$4 = new gu.a();
        for (ha $$5 : ha.values()) {
            $$4.a((hz)$$1, $$5);
            if (!$$0.a_($$4).a(this) || ++$$3 < $$2) continue;
            return false;
        }
        return true;
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{b});
    }

    @Override
    public cfz a(cls $$0, gu $$1, dcb $$2) {
        return cfz.b;
    }
}

