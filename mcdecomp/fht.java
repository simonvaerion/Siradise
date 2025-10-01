/*
 * Decompiled with CFR 0.152.
 */
public class fht
extends fhs {
    fht(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        this.D *= 1.5f;
        this.t = (int)(Math.random() * 2.0) + 60;
    }

    @Override
    public float b(float $$0) {
        float $$1 = 1.0f - ((float)this.s + $$0) / ((float)this.t * 1.5f);
        return this.D * $$1;
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
        this.g += this.j * (double)$$0;
        this.h += this.k * (double)$$0;
        this.i += this.l * (double)$$0;
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fht $$8 = new fht($$1, $$2, $$3, $$4, $$5, $$6, $$7);
            $$8.a(this.a);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

