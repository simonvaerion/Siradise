/*
 * Decompiled with CFR 0.152.
 */
public class crz
extends cvv {
    protected crz(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)this.C.b()).a(a, ha.b));
    }

    @Override
    public dcb a(cih $$0) {
        ha $$1 = $$0.k();
        dcb $$2 = $$0.q().a_($$0.a().a($$1.g()));
        if ($$2.a(this) && $$2.c(a) == $$1) {
            return (dcb)this.n().a(a, $$1.g());
        }
        return (dcb)this.n().a(a, $$1);
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
        ha $$4 = $$0.c(a);
        double $$5 = (double)$$2.u() + 0.55 - (double)($$3.i() * 0.1f);
        double $$6 = (double)$$2.v() + 0.55 - (double)($$3.i() * 0.1f);
        double $$7 = (double)$$2.w() + 0.55 - (double)($$3.i() * 0.1f);
        double $$8 = 0.4f - ($$3.i() + $$3.i()) * 0.4f;
        if ($$3.a(5) == 0) {
            $$1.a(iv.u, $$5 + (double)$$4.j() * $$8, $$6 + (double)$$4.k() * $$8, $$7 + (double)$$4.l() * $$8, $$3.k() * 0.005, $$3.k() * 0.005, $$3.k() * 0.005);
        }
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{a});
    }
}

