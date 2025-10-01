/*
 * Decompiled with CFR 0.152.
 */
public class bma
extends bly {
    private static final float l = 10.0f;
    private static final float m = 60.0f;
    private final int n;
    private final int o;
    private final float p;
    private final float q;
    private final boolean r;

    public bma(bgb $$0, int $$1, int $$2, float $$3, float $$4, boolean $$5) {
        super($$0);
        this.n = $$1;
        this.o = $$2;
        this.p = $$3;
        this.q = $$4;
        this.r = $$5;
    }

    @Override
    public void a() {
        double $$2;
        double $$1;
        if (this.r && this.d.aV()) {
            this.d.f(this.d.dl().b(0.0, 0.005, 0.0));
        }
        if (this.k != bly.a.b || this.d.J().l()) {
            this.d.w(0.0f);
            this.d.B(0.0f);
            this.d.A(0.0f);
            this.d.z(0.0f);
            return;
        }
        double $$0 = this.e - this.d.dn();
        double $$3 = $$0 * $$0 + ($$1 = this.f - this.d.dp()) * $$1 + ($$2 = this.g - this.d.dt()) * $$2;
        if ($$3 < 2.500000277905201E-7) {
            this.d.z(0.0f);
            return;
        }
        float $$4 = (float)(apa.d($$2, $$0) * 57.2957763671875) - 90.0f;
        this.d.a_(this.a(this.d.dy(), $$4, this.o));
        this.d.aV = this.d.dy();
        this.d.aX = this.d.dy();
        float $$5 = (float)(this.h * this.d.b(bhg.d));
        if (this.d.aV()) {
            this.d.w($$5 * this.p);
            double $$6 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            if (Math.abs($$1) > (double)1.0E-5f || Math.abs($$6) > (double)1.0E-5f) {
                float $$7 = -((float)(apa.d($$1, $$6) * 57.2957763671875));
                $$7 = apa.a(apa.g($$7), (float)(-this.n), (float)this.n);
                this.d.b_(this.a(this.d.dA(), $$7, 5.0f));
            }
            float $$8 = apa.b(this.d.dA() * ((float)Math.PI / 180));
            float $$9 = apa.a(this.d.dA() * ((float)Math.PI / 180));
            this.d.bn = $$8 * $$5;
            this.d.bm = -$$9 * $$5;
        } else {
            float $$10 = Math.abs(apa.g(this.d.dy() - $$4));
            float $$11 = bma.a($$10);
            this.d.w($$5 * this.q * $$11);
        }
    }

    private static float a(float $$0) {
        return 1.0f - apa.a(($$0 - 10.0f) / 50.0f, 0.0f, 1.0f);
    }
}

