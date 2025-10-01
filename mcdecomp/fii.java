/*
 * Decompiled with CFR 0.152.
 */
public class fii
extends fhy {
    fii(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, int $$7, fih $$8) {
        super($$0, $$1, $$2, $$3, $$8, 0.0f);
        this.B = 0.92f;
        this.D = 0.5f;
        this.e(1.0f);
        this.a(aok.b.b($$7), aok.b.c($$7), (float)aok.b.d($$7));
        this.t = (int)((double)(this.D * 12.0f) / (Math.random() * (double)0.8f + (double)0.2f));
        this.b($$8);
        this.n = false;
        this.j = $$4;
        this.k = $$5;
        this.l = $$6;
    }

    @Override
    public void a() {
        super.a();
        if (!this.o) {
            this.b(this.a);
            if (this.s > this.t / 2) {
                this.e(1.0f - ((float)this.s - (float)(this.t / 2)) / (float)this.t);
            }
            if (this.c.a_(gu.a(this.g, this.h, this.i)).i()) {
                this.k -= (double)0.0074f;
            }
        }
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            return new fii($$1, $$2, $$3, $$4, $$5, $$6, $$7, aok.b.a(255, 204, 31, 102), this.a);
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
            return new fii($$1, $$2, $$3, $$4, $$5, $$6, $$7, aok.b.a(255, 255, 255, 255), this.a);
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

