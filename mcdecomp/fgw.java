/*
 * Decompiled with CFR 0.152.
 */
public class fgw
extends fim {
    private final double a;
    private final double b;
    private final double F;

    fgw(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
        super($$0, $$1, $$2, $$3);
        this.j = $$4;
        this.k = $$5;
        this.l = $$6;
        this.a = $$1;
        this.b = $$2;
        this.F = $$3;
        this.d = $$1 + $$4;
        this.e = $$2 + $$5;
        this.f = $$3 + $$6;
        this.g = this.d;
        this.h = this.e;
        this.i = this.f;
        this.D = 0.1f * (this.r.i() * 0.5f + 0.2f);
        float $$7 = this.r.i() * 0.6f + 0.4f;
        this.v = 0.9f * $$7;
        this.w = 0.9f * $$7;
        this.x = $$7;
        this.n = false;
        this.t = (int)(Math.random() * 10.0) + 30;
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
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        if (this.s++ >= this.t) {
            this.k();
            return;
        }
        float $$0 = (float)this.s / (float)this.t;
        $$0 = 1.0f - $$0;
        float $$1 = 1.0f - $$0;
        $$1 *= $$1;
        $$1 *= $$1;
        this.g = this.a + this.j * (double)$$0;
        this.h = this.b + this.k * (double)$$0 - (double)($$1 * 1.2f);
        this.i = this.F + this.l * (double)$$0;
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fgw $$8 = new fgw($$1, $$2, $$3, $$4, $$5, $$6, $$7);
            $$8.a(this.a);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }

    public static class b
    implements fhp<iy> {
        private final fih a;

        public b(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fgw $$8 = new fgw($$1, $$2, $$3, $$4, $$5, $$6, $$7);
            $$8.a(this.a);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

