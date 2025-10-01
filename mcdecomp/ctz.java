/*
 * Decompiled with CFR 0.152.
 */
public class ctz
extends cvv
implements cwo {
    public static final dcs b = dcr.C;
    public static final dcs c = dcr.w;
    private static final int j = 8;
    public static final int d = 128;
    private static final int k = 200;

    public ctz(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)((dcb)this.C.b()).a(a, ha.b)).a(b, false)).a(c, false));
    }

    @Override
    public dcb a(cih $$0) {
        dxe $$1 = $$0.q().b_($$0.a());
        boolean $$2 = $$1.a() == dxf.c;
        return (dcb)((dcb)this.n().a(a, $$0.k())).a(b, $$2);
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(b).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(b).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
        return $$0.c(c) != false ? 15 : 0;
    }

    @Override
    public int b(dcb $$0, cls $$1, gu $$2, ha $$3) {
        if ($$0.c(c).booleanValue() && $$0.c(a) == $$3) {
            return 15;
        }
        return 0;
    }

    public void d(dcb $$0, cmm $$1, gu $$2) {
        $$1.a($$2, (dcb)$$0.a(c, true), 3);
        this.e($$0, $$1, $$2);
        $$1.a($$2, (cpn)this, 8);
        $$1.c(3002, $$2, $$0.c(a).o().ordinal());
    }

    private void e(dcb $$0, cmm $$1, gu $$2) {
        $$1.a($$2.a($$0.c(a).g()), this);
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        $$1.a($$2, (dcb)$$0.a(c, false), 3);
        this.e($$0, $$1, $$2);
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
        if (!$$1.Y() || (long)$$1.z.a(200) > $$1.V() % 200L || $$2.v() != $$1.a(dhk.a.b, $$2.u(), $$2.w()) - 1) {
            return;
        }
        apd.a($$0.c(a).o(), $$1, $$2, 0.125, iv.aN, bdi.a(1, 2));
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$0.a($$3.b())) {
            return;
        }
        if ($$0.c(c).booleanValue()) {
            this.e($$0, $$1, $$2);
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$0.a($$3.b())) {
            return;
        }
        if ($$0.c(c).booleanValue() && !$$1.L().a($$2, this)) {
            $$1.a($$2, (dcb)$$0.a(c, false), 18);
        }
    }

    @Override
    public void a(cmm $$0, dcb $$1, eee $$2, bzg $$3) {
        gu $$4;
        if ($$0.Y() && $$3 instanceof bzs && ((bzs)$$3).D() && $$0.g($$4 = $$2.a())) {
            bfy $$5 = bfn.ai.a($$0);
            if ($$5 != null) {
                $$5.d(eei.c($$4.c()));
                bfj $$6 = $$3.v();
                $$5.b($$6 instanceof aig ? (aig)$$6 : null);
                $$0.b($$5);
            }
            $$0.a(null, $$4, amh.xO, ami.d, 5.0f, 1.0f);
        }
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(a, c, b);
    }

    @Override
    public boolean f_(dcb $$0) {
        return true;
    }
}

