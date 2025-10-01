/*
 * Decompiled with CFR 0.152.
 */
public class fik
extends fim {
    fik(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        float $$7;
        this.v = $$7 = this.r.i() * 0.1f + 0.2f;
        this.w = $$7;
        this.x = $$7;
        this.b(0.02f, 0.02f);
        this.D *= this.r.i() * 0.6f + 0.5f;
        this.j *= (double)0.02f;
        this.k *= (double)0.02f;
        this.l *= (double)0.02f;
        this.t = (int)(20.0 / (Math.random() * 0.8 + 0.2));
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
    public void a() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        if (this.t-- <= 0) {
            this.k();
            return;
        }
        this.a(this.j, this.k, this.l);
        this.j *= 0.99;
        this.k *= 0.99;
        this.l *= 0.99;
    }

    public static class c
    implements fhp<iy> {
        private final fih a;

        public c(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fik $$8 = new fik($$1, $$2, $$3, $$4, $$5, $$6, $$7);
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
            fik $$8 = new fik($$1, $$2, $$3, $$4, $$5, $$6, $$7);
            $$8.a(0.3f, 0.5f, 1.0f);
            $$8.a(this.a);
            $$8.e(1.0f - $$1.z.i() * 0.7f);
            $$8.a($$8.j() / 2);
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
            fik $$8 = new fik($$1, $$2, $$3, $$4, $$5, $$6, $$7);
            $$8.a(this.a);
            $$8.a(1.0f, 1.0f, 1.0f);
            $$8.a(3 + $$1.y_().a(5));
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
            fik $$8 = new fik($$1, $$2, $$3, $$4, $$5, $$6, $$7);
            $$8.a(this.a);
            $$8.a(1.0f, 1.0f, 1.0f);
            return $$8;
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
            fik $$8 = new fik($$1, $$2, $$3, $$4, $$5, $$6, $$7);
            $$8.a(this.a);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

