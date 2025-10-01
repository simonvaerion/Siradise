/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class fij
extends fim {
    fij(few $$0, fih $$1, double $$2, double $$3, double $$4) {
        super($$0, $$2, $$3 - 0.125, $$4);
        this.b(0.01f, 0.01f);
        this.a($$1);
        this.D *= this.r.i() * 0.6f + 0.2f;
        this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.n = false;
        this.B = 1.0f;
        this.u = 0.0f;
    }

    fij(few $$0, fih $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        super($$0, $$2, $$3 - 0.125, $$4, $$5, $$6, $$7);
        this.b(0.01f, 0.01f);
        this.a($$1);
        this.D *= this.r.i() * 0.6f + 0.6f;
        this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.n = false;
        this.B = 1.0f;
        this.u = 0.0f;
    }

    @Override
    public fhq b() {
        return fhq.b;
    }

    public static class d
    implements fhp<iy> {
        private final fih a;

        public d(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            double $$8 = (double)$$1.z.i() * -1.9 * (double)$$1.z.i() * 0.1;
            fij $$9 = new fij($$1, this.a, $$2, $$3, $$4, 0.0, $$8, 0.0);
            $$9.a(0.1f, 0.1f, 0.3f);
            $$9.b(0.001f, 0.001f);
            return $$9;
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
            apf $$8 = $$1.z;
            double $$9 = $$8.k() * (double)1.0E-6f;
            double $$10 = $$8.k() * (double)1.0E-4f;
            double $$11 = $$8.k() * (double)1.0E-6f;
            fij $$12 = new fij($$1, this.a, $$2, $$3, $$4, $$9, $$10, $$11);
            $$12.a(0.9f, 0.4f, 0.5f);
            return $$12;
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
            fij $$8 = new fij($$1, this.a, $$2, $$3, $$4, 0.0, -0.8f, 0.0){

                @Override
                public Optional<is> o() {
                    return Optional.of(is.a);
                }
            };
            $$8.t = apa.b($$1.z, 500, 1000);
            $$8.u = 0.01f;
            $$8.a(0.32f, 0.5f, 0.22f);
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
            fij $$8 = new fij($$1, this.a, $$2, $$3, $$4);
            $$8.a(0.4f, 0.4f, 0.7f);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

