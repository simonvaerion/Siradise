/*
 * Decompiled with CFR 0.152.
 */
public class cuw
extends crm {
    public static final dcs b = dcr.w;

    public cuw(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)this.C.b()).a(a, ha.d)).a(b, false));
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(a, b);
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        return (dcb)$$0.a(a, $$1.a($$0.c(a)));
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        return $$0.a($$1.a($$0.c(a)));
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if ($$0.c(b).booleanValue()) {
            $$1.a($$2, (dcb)$$0.a(b, false), 2);
        } else {
            $$1.a($$2, (dcb)$$0.a(b, true), 2);
            $$1.a($$2, (cpn)this, 2);
        }
        this.a((cmm)$$1, $$2, $$0);
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(a) == $$1 && !$$0.c(b).booleanValue()) {
            this.a($$3, $$4);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    private void a(cmn $$0, gu $$1) {
        if (!$$0.r_() && !$$0.L().a($$1, this)) {
            $$0.a($$1, this, 2);
        }
    }

    protected void a(cmm $$0, gu $$1, dcb $$2) {
        ha $$3 = $$2.c(a);
        gu $$4 = $$1.a($$3.g());
        $$0.a($$4, (cpn)this, $$1);
        $$0.a($$4, (cpn)this, $$3);
    }

    @Override
    public boolean f_(dcb $$0) {
        return true;
    }

    @Override
    public int b(dcb $$0, cls $$1, gu $$2, ha $$3) {
        return $$0.b($$1, $$2, $$3);
    }

    @Override
    public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
        if ($$0.c(b).booleanValue() && $$0.c(a) == $$3) {
            return 15;
        }
        return 0;
    }

    @Override
    public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$0.a($$3.b())) {
            return;
        }
        if (!$$1.r_() && $$0.c(b).booleanValue() && !$$1.L().a($$2, this)) {
            dcb $$5 = (dcb)$$0.a(b, false);
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
        }
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$0.a($$3.b())) {
            return;
        }
        if (!$$1.B && $$0.c(b).booleanValue() && $$1.L().a($$2, this)) {
            this.a($$1, $$2, (dcb)$$0.a(b, false));
        }
    }

    @Override
    public dcb a(cih $$0) {
        return (dcb)this.n().a(a, $$0.d().g().g());
    }
}

