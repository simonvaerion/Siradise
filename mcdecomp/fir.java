/*
 * Decompiled with CFR 0.152.
 */
public class fir
extends fim {
    private float a;

    fir(few $$0, double $$1, double $$2, double $$3) {
        super($$0, $$1, $$2, $$3);
        this.t = (int)(Math.random() * 60.0) + 30;
        this.n = false;
        this.j = 0.0;
        this.k = -0.05;
        this.l = 0.0;
        this.b(0.02f, 0.02f);
        this.D *= this.r.i() * 0.6f + 0.2f;
        this.u = 0.002f;
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
        if (this.s++ >= this.t) {
            this.k();
            return;
        }
        float $$0 = 0.6f;
        this.j += (double)(0.6f * apa.b(this.a));
        this.l += (double)(0.6f * apa.a(this.a));
        this.j *= 0.07;
        this.l *= 0.07;
        this.a(this.j, this.k, this.l);
        if (!this.c.b_(gu.a(this.g, this.h, this.i)).a(anb.a) || this.m) {
            this.k();
        }
        this.a += 0.08f;
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            fir $$8 = new fir($$1, $$2, $$3, $$4);
            $$8.a(this.a);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

