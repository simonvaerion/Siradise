/*
 * Decompiled with CFR 0.152.
 */
public class fhc
extends fim {
    static final apf a = apf.a();
    private final fih b;

    fhc(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fih $$7) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        this.B = 0.96f;
        this.C = true;
        this.b = $$7;
        this.D *= 0.75f;
        this.n = false;
        this.b($$7);
    }

    @Override
    public fhq b() {
        return fhq.c;
    }

    @Override
    public int a(float $$0) {
        float $$1 = ((float)this.s + $$0) / (float)this.t;
        $$1 = apa.a($$1, 0.0f, 1.0f);
        int $$2 = super.a($$0);
        int $$3 = $$2 & 0xFF;
        int $$4 = $$2 >> 16 & 0xFF;
        if (($$3 += (int)($$1 * 15.0f * 16.0f)) > 240) {
            $$3 = 240;
        }
        return $$3 | $$4 << 16;
    }

    @Override
    public void a() {
        super.a();
        this.b(this.b);
    }

    public static class c
    implements fhp<iy> {
        private final double a = 0.01;
        private final fih b;

        public c(fih $$0) {
            this.b = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fhc $$8 = new fhc($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, this.b);
            if ($$1.z.h()) {
                $$8.a(0.29f, 0.58f, 0.51f);
            } else {
                $$8.a(0.43f, 0.77f, 0.62f);
            }
            $$8.b($$5 * 0.01, $$6 * 0.01, $$7 * 0.01);
            int $$9 = 10;
            int $$10 = 40;
            $$8.a($$1.z.a(30) + 10);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }

    public static class a
    implements fhp<iy> {
        private final double a = 0.25;
        private final fih b;

        public a(fih $$0) {
            this.b = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fhc $$8 = new fhc($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, this.b);
            $$8.a(1.0f, 0.9f, 1.0f);
            $$8.b($$5 * 0.25, $$6 * 0.25, $$7 * 0.25);
            int $$9 = 2;
            int $$10 = 4;
            $$8.a($$1.z.a(2) + 2);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }

    public static class d
    implements fhp<iy> {
        private final double a = 0.01;
        private final fih b;

        public d(fih $$0) {
            this.b = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fhc $$8 = new fhc($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, this.b);
            $$8.a(1.0f, 0.9f, 1.0f);
            $$8.b($$5 * 0.01 / 2.0, $$6 * 0.01, $$7 * 0.01 / 2.0);
            int $$9 = 10;
            int $$10 = 40;
            $$8.a($$1.z.a(30) + 10);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }

    public static class e
    implements fhp<iy> {
        private final double a = 0.01;
        private final fih b;

        public e(fih $$0) {
            this.b = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fhc $$8 = new fhc($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, this.b);
            $$8.a(0.91f, 0.55f, 0.08f);
            $$8.b($$5 * 0.01 / 2.0, $$6 * 0.01, $$7 * 0.01 / 2.0);
            int $$9 = 10;
            int $$10 = 40;
            $$8.a($$1.z.a(30) + 10);
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
            fhc $$8 = new fhc($$1, $$2, $$3, $$4, 0.5 - a.j(), $$6, 0.5 - a.j(), this.a);
            if ($$1.z.h()) {
                $$8.a(0.6f, 1.0f, 0.8f);
            } else {
                $$8.a(0.08f, 0.4f, 0.4f);
            }
            $$8.k *= (double)0.2f;
            if ($$5 == 0.0 && $$7 == 0.0) {
                $$8.j *= (double)0.1f;
                $$8.l *= (double)0.1f;
            }
            $$8.a((int)(8.0 / ($$1.z.j() * 0.8 + 0.2)));
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

