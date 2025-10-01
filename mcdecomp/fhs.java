/*
 * Decompiled with CFR 0.152.
 */
public class fhs
extends fim {
    private final double a;
    private final double b;
    private final double F;

    protected fhs(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
        super($$0, $$1, $$2, $$3);
        this.j = $$4;
        this.k = $$5;
        this.l = $$6;
        this.g = $$1;
        this.h = $$2;
        this.i = $$3;
        this.a = this.g;
        this.b = this.h;
        this.F = this.i;
        this.D = 0.1f * (this.r.i() * 0.2f + 0.5f);
        float $$7 = this.r.i() * 0.6f + 0.4f;
        this.v = $$7 * 0.9f;
        this.w = $$7 * 0.3f;
        this.x = $$7;
        this.t = (int)(Math.random() * 10.0) + 40;
    }

    @Override
    public fhq b() {
        return fhq.b;
    }

    @Override
    public void a(double $$0, double $$1, double $$2) {
        this.a(this.n().d($$0, $$1, $$2));
        this.l();
    }

    @Override
    public float b(float $$0) {
        float $$1 = ((float)this.s + $$0) / (float)this.t;
        $$1 = 1.0f - $$1;
        $$1 *= $$1;
        $$1 = 1.0f - $$1;
        return this.D * $$1;
    }

    @Override
    public int a(float $$0) {
        int $$1 = super.a($$0);
        float $$2 = (float)this.s / (float)this.t;
        $$2 *= $$2;
        $$2 *= $$2;
        int $$3 = $$1 & 0xFF;
        int $$4 = $$1 >> 16 & 0xFF;
        if (($$4 += (int)($$2 * 15.0f * 16.0f)) > 240) {
            $$4 = 240;
        }
        return $$3 | $$4 << 16;
    }

    @Override
    public void a() {
        float $$0;
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        if (this.s++ >= this.t) {
            this.k();
            return;
        }
        float $$1 = $$0 = (float)this.s / (float)this.t;
        $$0 = -$$0 + $$0 * $$0 * 2.0f;
        $$0 = 1.0f - $$0;
        this.g = this.a + this.j * (double)$$0;
        this.h = this.b + this.k * (double)$$0 + (double)(1.0f - $$1);
        this.i = this.F + this.l * (double)$$0;
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fhs $$8 = new fhs($$1, $$2, $$3, $$4, $$5, $$6, $$7);
            $$8.a(this.a);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

