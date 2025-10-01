/*
 * Decompiled with CFR 0.152.
 */
public class fie
extends fim {
    private static final apf a = apf.a();
    private final fih b;

    fie(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fih $$7) {
        super($$0, $$1, $$2, $$3, 0.5 - a.j(), $$5, 0.5 - a.j());
        this.B = 0.96f;
        this.u = -0.1f;
        this.C = true;
        this.b = $$7;
        this.k *= (double)0.2f;
        if ($$4 == 0.0 && $$6 == 0.0) {
            this.j *= (double)0.1f;
            this.l *= (double)0.1f;
        }
        this.D *= 0.75f;
        this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.n = false;
        this.b($$7);
        if (this.g()) {
            this.e(0.0f);
        }
    }

    @Override
    public fhq b() {
        return fhq.c;
    }

    @Override
    public void a() {
        super.a();
        this.b(this.b);
        if (this.g()) {
            this.e(0.0f);
        } else {
            this.e(apa.i(0.05f, this.y, 1.0f));
        }
    }

    private boolean g() {
        enn $$0 = enn.N();
        fiy $$1 = $$0.t;
        return $$1 != null && $$1.bm().c(this.g, this.h, this.i) <= 9.0 && $$0.m.au().a() && $$1.gl();
    }

    public static class b
    implements fhp<iy> {
        private final fih a;

        public b(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            return new fie($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }

    public static class e
    implements fhp<iy> {
        private final fih a;

        public e(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fie $$8 = new fie($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
            float $$9 = $$1.z.i() * 0.5f + 0.35f;
            $$8.a(1.0f * $$9, 0.0f * $$9, 1.0f * $$9);
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
            fie $$8 = new fie($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
            $$8.e(0.15f);
            $$8.a((float)$$5, (float)$$6, (float)$$7);
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
            fie $$8 = new fie($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
            $$8.a((float)$$5, (float)$$6, (float)$$7);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }

    public static class d
    implements fhp<iy> {
        private final fih a;

        public d(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            return new fie($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

