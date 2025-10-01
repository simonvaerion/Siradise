/*
 * Decompiled with CFR 0.152.
 */
public class fgq
extends fim {
    fgq(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
        float $$7;
        this.B = 0.7f;
        this.u = 0.5f;
        this.j *= (double)0.1f;
        this.k *= (double)0.1f;
        this.l *= (double)0.1f;
        this.j += $$4 * 0.4;
        this.k += $$5 * 0.4;
        this.l += $$6 * 0.4;
        this.v = $$7 = (float)(Math.random() * (double)0.3f + (double)0.6f);
        this.w = $$7;
        this.x = $$7;
        this.D *= 0.75f;
        this.t = Math.max((int)(6.0 / (Math.random() * 0.8 + 0.6)), 1);
        this.n = false;
        this.a();
    }

    @Override
    public float b(float $$0) {
        return this.D * apa.a(((float)this.s + $$0) / (float)this.t * 32.0f, 0.0f, 1.0f);
    }

    @Override
    public void a() {
        super.a();
        this.w *= 0.96f;
        this.x *= 0.9f;
    }

    @Override
    public fhq b() {
        return fhq.b;
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fgq $$8 = new fgq($$1, $$2, $$3, $$4, $$5, $$6 + 1.0, $$7);
            $$8.a(20);
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
            fgq $$8 = new fgq($$1, $$2, $$3, $$4, $$5, $$6, $$7);
            $$8.v *= 0.3f;
            $$8.w *= 0.8f;
            $$8.a(this.a);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }

    public static class c
    implements fhp<iy> {
        private final fih a;

        public c(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fgq $$8 = new fgq($$1, $$2, $$3, $$4, $$5, $$6, $$7);
            $$8.a(this.a);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

