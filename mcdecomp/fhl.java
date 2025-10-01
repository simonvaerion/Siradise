/*
 * Decompiled with CFR 0.152.
 */
public class fhl
extends fim {
    fhl(few $$0, double $$1, double $$2, double $$3, double $$4) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
        this.B = 0.66f;
        this.C = true;
        this.j *= (double)0.01f;
        this.k *= (double)0.01f;
        this.l *= (double)0.01f;
        this.k += 0.2;
        this.v = Math.max(0.0f, apa.a(((float)$$4 + 0.0f) * ((float)Math.PI * 2)) * 0.65f + 0.35f);
        this.w = Math.max(0.0f, apa.a(((float)$$4 + 0.33333334f) * ((float)Math.PI * 2)) * 0.65f + 0.35f);
        this.x = Math.max(0.0f, apa.a(((float)$$4 + 0.6666667f) * ((float)Math.PI * 2)) * 0.65f + 0.35f);
        this.D *= 1.5f;
        this.t = 6;
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
            fhl $$8 = new fhl($$1, $$2, $$3, $$4, $$5);
            $$8.a(this.a);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

