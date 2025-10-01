/*
 * Decompiled with CFR 0.152.
 */
public abstract class fxl
extends fxh {
    private static final float o = 0.0f;
    private static final float p = 1.2f;
    private static final float q = 0.0f;
    protected final brm n;
    private boolean r;

    public fxl(brm $$0, amg $$1, ami $$2) {
        super($$1, $$2, fxy.t());
        this.n = $$0;
        this.f = (float)$$0.dn();
        this.g = (float)$$0.dp();
        this.h = (float)$$0.dt();
        this.i = true;
        this.j = 0;
        this.d = 0.0f;
    }

    @Override
    public void q() {
        boolean $$0 = this.p();
        if ($$0 && !this.m()) {
            enn.N().ah().a(this.o());
            this.r = true;
        }
        if (this.n.dD() || this.r) {
            this.n();
            return;
        }
        this.f = (float)this.n.dn();
        this.g = (float)this.n.dp();
        this.h = (float)this.n.dt();
        float $$1 = (float)this.n.dl().h();
        if ($$1 >= 0.01f) {
            this.e = apa.i(apa.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = apa.i(apa.a($$1, 0.0f, 0.5f), 0.0f, 1.2f);
        } else {
            this.e = 0.0f;
            this.d = 0.0f;
        }
    }

    private float u() {
        if (this.n.h_()) {
            return 1.1f;
        }
        return 0.7f;
    }

    private float v() {
        if (this.n.h_()) {
            return 1.5f;
        }
        return 1.1f;
    }

    @Override
    public boolean r() {
        return true;
    }

    @Override
    public boolean s() {
        return !this.n.aQ();
    }

    protected abstract fxh o();

    protected abstract boolean p();
}

