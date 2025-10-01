/*
 * Decompiled with CFR 0.152.
 */
public class fhr
extends fim {
    private final fih a;

    fhr(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fih $$7) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
        float $$9;
        this.B = 0.96f;
        this.a = $$7;
        float $$8 = 2.5f;
        this.j *= (double)0.1f;
        this.k *= (double)0.1f;
        this.l *= (double)0.1f;
        this.j += $$4;
        this.k += $$5;
        this.l += $$6;
        this.v = $$9 = 1.0f - (float)(Math.random() * (double)0.3f);
        this.w = $$9;
        this.x = $$9;
        this.D *= 1.875f;
        int $$10 = (int)(8.0 / (Math.random() * 0.8 + 0.3));
        this.t = (int)Math.max((float)$$10 * 2.5f, 1.0f);
        this.n = false;
        this.b($$7);
    }

    @Override
    public fhq b() {
        return fhq.c;
    }

    @Override
    public float b(float $$0) {
        return this.D * apa.a(((float)this.s + $$0) / (float)this.t * 32.0f, 0.0f, 1.0f);
    }

    @Override
    public void a() {
        super.a();
        if (!this.o) {
            double $$1;
            this.b(this.a);
            byo $$0 = this.c.a(this.g, this.h, this.i, 2.0, false);
            if ($$0 != null && this.h > ($$1 = $$0.dp())) {
                this.h += ($$1 - this.h) * 0.2;
                this.k += ($$0.dl().d - this.k) * 0.2;
                this.c(this.g, this.h, this.i);
            }
        }
    }

    public static class b
    implements fhp<iy> {
        private final fih a;

        public b(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fhr $$8 = new fhr($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
            $$8.a(200.0f, 50.0f, 120.0f);
            $$8.e(0.4f);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            return new fhr($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

