/*
 * Decompiled with CFR 0.152.
 */
public class fxo
extends fxh {
    public static final int n = 20;
    private final fiy o;
    private int p;

    public fxo(fiy $$0) {
        super(amh.gP, ami.h, fxy.t());
        this.o = $$0;
        this.i = true;
        this.j = 0;
        this.d = 0.1f;
    }

    @Override
    public void q() {
        ++this.p;
        if (this.o.dD() || this.p > 20 && !this.o.fr()) {
            this.n();
            return;
        }
        this.f = (float)this.o.dn();
        this.g = (float)this.o.dp();
        this.h = (float)this.o.dt();
        float $$0 = (float)this.o.dl().g();
        this.d = (double)$$0 >= 1.0E-7 ? apa.a($$0 / 4.0f, 0.0f, 1.0f) : 0.0f;
        if (this.p < 20) {
            this.d = 0.0f;
        } else if (this.p < 40) {
            this.d *= (float)(this.p - 20) / 20.0f;
        }
        float $$1 = 0.8f;
        this.e = this.d > 0.8f ? 1.0f + (this.d - 0.8f) : 1.0f;
    }
}

