/*
 * Decompiled with CFR 0.152.
 */
public class fhd
extends fim {
    fhd(few $$0, double $$1, double $$2, double $$3) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
        this.C = true;
        this.B = 0.86f;
        this.j *= (double)0.01f;
        this.k *= (double)0.01f;
        this.l *= (double)0.01f;
        this.k += 0.1;
        this.D *= 1.5f;
        this.t = 16;
        this.n = false;
    }

    @Override
    public fhq b() {
        return fhq.b;
    }

    @Override
    public float b(float $$0) {
        return this.D * apa.a(((float)this.s + $$0) / (float)this.t * 32.0f, 0.0f, 1.0f);
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fhd $$8 = new fhd($$1, $$2, $$3 + 0.5, $$4);
            $$8.a(this.a);
            $$8.a(1.0f, 1.0f, 1.0f);
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
            fhd $$8 = new fhd($$1, $$2, $$3, $$4);
            $$8.a(this.a);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

