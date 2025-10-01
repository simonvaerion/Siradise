/*
 * Decompiled with CFR 0.152.
 */
public class cuy
extends cpv
implements cpp {
    public static final int a = 1;
    public static final int b = 4;
    public static final dcv c = dcr.R;
    public static final ddb d = dcr.S;

    protected cuy(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)this.C.b()).a(c, ha.c)).a(d, 1));
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        return (dcb)$$0.a(c, $$1.a($$0.c(c)));
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        return $$0.a($$1.a($$0.c(c)));
    }

    @Override
    public boolean a(dcb $$0, cih $$1) {
        if (!$$1.h() && $$1.n().a(this.k()) && $$0.c(d) < 4) {
            return true;
        }
        return super.a($$0, $$1);
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return cpn.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
    }

    @Override
    public dcb a(cih $$0) {
        dcb $$1 = $$0.q().a_($$0.a());
        if ($$1.a(this)) {
            return (dcb)$$1.a(d, Math.min(4, $$1.c(d) + 1));
        }
        return (dcb)this.n().a(c, $$0.g().g());
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(c, d);
    }

    @Override
    public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
        return true;
    }

    @Override
    public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
        return true;
    }

    @Override
    public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
        int $$4 = $$3.c(d);
        if ($$4 < 4) {
            $$0.a($$2, (dcb)$$3.a(d, $$4 + 1), 2);
        } else {
            cuy.a((cmm)$$0, $$2, new cfz(this));
        }
    }
}

