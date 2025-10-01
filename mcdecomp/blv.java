/*
 * Decompiled with CFR 0.152.
 */
public class blv
extends bly {
    private final int l;
    private final boolean m;

    public blv(bgb $$0, int $$1, boolean $$2) {
        super($$0);
        this.l = $$1;
        this.m = $$2;
    }

    @Override
    public void a() {
        if (this.k == bly.a.b) {
            float $$6;
            this.k = bly.a.a;
            this.d.e(true);
            double $$0 = this.e - this.d.dn();
            double $$1 = this.f - this.d.dp();
            double $$2 = this.g - this.d.dt();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if ($$3 < 2.500000277905201E-7) {
                this.d.A(0.0f);
                this.d.z(0.0f);
                return;
            }
            float $$4 = (float)(apa.d($$2, $$0) * 57.2957763671875) - 90.0f;
            this.d.a_(this.a(this.d.dy(), $$4, 90.0f));
            if (this.d.ay()) {
                float $$5 = (float)(this.h * this.d.b(bhg.d));
            } else {
                $$6 = (float)(this.h * this.d.b(bhg.e));
            }
            this.d.w($$6);
            double $$7 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            if (Math.abs($$1) > (double)1.0E-5f || Math.abs($$7) > (double)1.0E-5f) {
                float $$8 = (float)(-(apa.d($$1, $$7) * 57.2957763671875));
                this.d.b_(this.a(this.d.dA(), $$8, this.l));
                this.d.A($$1 > 0.0 ? $$6 : -$$6);
            }
        } else {
            if (!this.m) {
                this.d.e(false);
            }
            this.d.A(0.0f);
            this.d.z(0.0f);
        }
    }
}

