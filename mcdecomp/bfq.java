/*
 * Decompiled with CFR 0.152.
 */
public abstract class bfq
extends bgb {
    protected bfq(bfn<? extends bfq> $$0, cmm $$1) {
        super((bfn<? extends bgb>)$$0, $$1);
    }

    @Override
    protected void a(double $$0, boolean $$1, dcb $$2, gu $$3) {
    }

    @Override
    public void h(eei $$0) {
        if (this.cU()) {
            if (this.aV()) {
                this.a(0.02f, $$0);
                this.a(bgf.a, this.dl());
                this.f(this.dl().a((double)0.8f));
            } else if (this.bi()) {
                this.a(0.02f, $$0);
                this.a(bgf.a, this.dl());
                this.f(this.dl().a(0.5));
            } else {
                float $$1 = 0.91f;
                if (this.ay()) {
                    $$1 = this.dI().a_(this.aE()).b().h() * 0.91f;
                }
                float $$2 = 0.16277137f / ($$1 * $$1 * $$1);
                $$1 = 0.91f;
                if (this.ay()) {
                    $$1 = this.dI().a_(this.aE()).b().h() * 0.91f;
                }
                this.a(this.ay() ? 0.1f * $$2 : 0.02f, $$0);
                this.a(bgf.a, this.dl());
                this.f(this.dl().a((double)$$1));
            }
        }
        this.q(false);
    }

    @Override
    public boolean i_() {
        return false;
    }
}

