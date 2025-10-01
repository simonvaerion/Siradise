/*
 * Decompiled with CFR 0.152.
 */
public class fgm
extends fim {
    fgm(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
        super($$0, $$1, $$2, $$3);
        this.b(0.02f, 0.02f);
        this.D *= this.r.i() * 0.6f + 0.2f;
        this.j = $$4 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.k = $$5 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.l = $$6 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2));
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
        this.k += 0.002;
        this.a(this.j, this.k, this.l);
        this.j *= (double)0.85f;
        this.k *= (double)0.85f;
        this.l *= (double)0.85f;
        if (!this.c.b_(gu.a(this.g, this.h, this.i)).a(anb.a)) {
            this.k();
        }
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
            fgm $$8 = new fgm($$1, $$2, $$3, $$4, $$5, $$6, $$7);
            $$8.a(this.a);
            return $$8;
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

