/*
 * Decompiled with CFR 0.152.
 */
public class fiq
extends fim {
    private final fih a;

    fiq(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fih $$7) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
        this.a = $$7;
        this.j *= (double)0.3f;
        this.k = Math.random() * (double)0.2f + (double)0.1f;
        this.l *= (double)0.3f;
        this.b(0.01f, 0.01f);
        this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.b($$7);
        this.u = 0.0f;
        this.j = $$4;
        this.k = $$5;
        this.l = $$6;
    }

    @Override
    public fhq b() {
        return fhq.b;
    }

    @Override
    public void a() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        int $$0 = 60 - this.t;
        if (this.t-- <= 0) {
            this.k();
            return;
        }
        this.k -= (double)this.u;
        this.a(this.j, this.k, this.l);
        this.j *= (double)0.98f;
        this.k *= (double)0.98f;
        this.l *= (double)0.98f;
        float $$1 = (float)$$0 * 0.001f;
        this.b($$1, $$1);
        this.a(this.a.a($$0 % 4, 4));
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            return new fiq($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

