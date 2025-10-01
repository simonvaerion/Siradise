/*
 * Decompiled with CFR 0.152.
 */
public class fxq
extends fxh {
    private static final float n = 0.0f;
    private static final float o = 1.0f;
    private static final float p = 0.7f;
    private static final float q = 0.5f;
    private final bvy r;

    public fxq(bvy $$0) {
        super(amh.kl, ami.f, fxy.t());
        this.r = $$0;
        this.k = fxy.a.a;
        this.i = true;
        this.j = 0;
    }

    @Override
    public boolean s() {
        return !this.r.aQ();
    }

    @Override
    public void q() {
        if (this.r.dD() || this.r.j() != null) {
            this.n();
            return;
        }
        this.f = (float)this.r.dn();
        this.g = (float)this.r.dp();
        this.h = (float)this.r.dt();
        float $$0 = this.r.F(0.0f);
        this.d = 0.0f + 1.0f * $$0 * $$0;
        this.e = 0.7f + 0.5f * $$0;
    }
}

