/*
 * Decompiled with CFR 0.152.
 */
public class fgo
extends fim {
    fgo(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, boolean $$7) {
        super($$0, $$1, $$2, $$3);
        this.d(3.0f);
        this.b(0.25f, 0.25f);
        this.t = $$7 ? this.r.a(50) + 280 : this.r.a(50) + 80;
        this.u = 3.0E-6f;
        this.j = $$4;
        this.k = $$5 + (double)(this.r.i() / 500.0f);
        this.l = $$6;
    }

    @Override
    public void a() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        if (this.s++ >= this.t || this.y <= 0.0f) {
            this.k();
            return;
        }
        this.j += (double)(this.r.i() / 5000.0f * (float)(this.r.h() ? 1 : -1));
        this.l += (double)(this.r.i() / 5000.0f * (float)(this.r.h() ? 1 : -1));
        this.k -= (double)this.u;
        this.a(this.j, this.k, this.l);
        if (this.s >= this.t - 60 && this.y > 0.01f) {
            this.y -= 0.015f;
        }
    }

    @Override
    public fhq b() {
        return fhq.c;
    }

    public static class b
    implements fhp<iy> {
        private final fih a;

        public b(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fgo $$8 = new fgo($$1, $$2, $$3, $$4, $$5, $$6, $$7, true);
            $$8.e(0.95f);
            $$8.a(this.a);
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
            fgo $$8 = new fgo($$1, $$2, $$3, $$4, $$5, $$6, $$7, false);
            $$8.e(0.9f);
            $$8.a(this.a);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

