/*
 * Decompiled with CFR 0.152.
 */
public class fis
extends fim {
    protected fis(few $$0, double $$1, double $$2, double $$3) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
        this.j *= (double)0.3f;
        this.k = Math.random() * (double)0.2f + (double)0.1f;
        this.l *= (double)0.3f;
        this.b(0.01f, 0.01f);
        this.u = 0.06f;
        this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public fhq b() {
        return fhq.b;
    }

    @Override
    public void a() {
        gu $$0;
        double $$1;
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        if (this.t-- <= 0) {
            this.k();
            return;
        }
        this.k -= (double)this.u;
        this.a(this.j, this.k, this.l);
        this.j *= (double)0.98f;
        this.k *= (double)0.98f;
        this.l *= (double)0.98f;
        if (this.m) {
            if (Math.random() < 0.5) {
                this.k();
            }
            this.j *= (double)0.7f;
            this.l *= (double)0.7f;
        }
        if (($$1 = Math.max(this.c.a_($$0 = gu.a(this.g, this.h, this.i)).k(this.c, $$0).b(ha.a.b, this.g - (double)$$0.u(), this.i - (double)$$0.w()), (double)this.c.b_($$0).a((cls)this.c, $$0))) > 0.0 && this.h < (double)$$0.v() + $$1) {
            this.k();
        }
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fis $$8 = new fis($$1, $$2, $$3, $$4);
            $$8.a(this.a);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

