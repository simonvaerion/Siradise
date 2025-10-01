/*
 * Decompiled with CFR 0.152.
 */
public class fxu
extends fxh {
    private static final float n = 1.0f;
    private static final float o = 1.0f;
    private final btx p;

    public fxu(btx $$0) {
        super(amh.wH, ami.g, fxy.t());
        this.p = $$0;
        this.k = fxy.a.b;
        this.i = false;
        this.j = 0;
    }

    @Override
    public boolean s() {
        return !this.p.aQ();
    }

    @Override
    public void q() {
        if (this.p.dD() || this.p.j() != null || !this.p.gf()) {
            this.n();
            return;
        }
        this.f = (float)this.p.dn();
        this.g = (float)this.p.dp();
        this.h = (float)this.p.dt();
        this.d = 1.0f;
        this.e = 1.0f;
    }
}

