/*
 * Decompiled with CFR 0.152.
 */
public class fxr
extends fxh {
    private static final float n = 0.0f;
    private static final float o = 0.7f;
    private static final float p = 0.0f;
    private static final float q = 1.0f;
    private static final float r = 0.0025f;
    private final caf s;
    private float t = 0.0f;

    public fxr(caf $$0) {
        super(amh.ni, ami.g, fxy.t());
        this.s = $$0;
        this.i = true;
        this.j = 0;
        this.d = 0.0f;
        this.f = (float)$$0.dn();
        this.g = (float)$$0.dp();
        this.h = (float)$$0.dt();
    }

    @Override
    public boolean s() {
        return !this.s.aQ();
    }

    @Override
    public boolean r() {
        return true;
    }

    @Override
    public void q() {
        if (this.s.dD()) {
            this.n();
            return;
        }
        this.f = (float)this.s.dn();
        this.g = (float)this.s.dp();
        this.h = (float)this.s.dt();
        float $$0 = (float)this.s.dl().h();
        if ($$0 >= 0.01f) {
            this.t = apa.a(this.t + 0.0025f, 0.0f, 1.0f);
            this.d = apa.i(apa.a($$0, 0.0f, 0.5f), 0.0f, 0.7f);
        } else {
            this.t = 0.0f;
            this.d = 0.0f;
        }
    }
}

