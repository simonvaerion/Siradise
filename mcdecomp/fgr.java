/*
 * Decompiled with CFR 0.152.
 */
public class fgr
extends fim {
    private static final int a = 11993298;
    private static final int b = 14614777;
    private static final float F = 0.7176471f;
    private static final float G = 0.0f;
    private static final float H = 0.8235294f;
    private static final float I = 0.8745098f;
    private static final float J = 0.0f;
    private static final float K = 0.9764706f;
    private boolean L;
    private final fih M;

    fgr(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fih $$7) {
        super($$0, $$1, $$2, $$3);
        this.B = 0.96f;
        this.j = $$4;
        this.k = $$5;
        this.l = $$6;
        this.v = apa.a(this.r, 0.7176471f, 0.8745098f);
        this.w = apa.a(this.r, 0.0f, 0.0f);
        this.x = apa.a(this.r, 0.8235294f, 0.9764706f);
        this.D *= 0.75f;
        this.t = (int)(20.0 / ((double)this.r.i() * 0.8 + 0.2));
        this.L = false;
        this.n = false;
        this.M = $$7;
        this.b($$7);
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
        this.b(this.M);
        if (this.m) {
            this.k = 0.0;
            this.L = true;
        }
        if (this.L) {
            this.k += 0.002;
        }
        this.a(this.j, this.k, this.l);
        if (this.h == this.e) {
            this.j *= 1.1;
            this.l *= 1.1;
        }
        this.j *= (double)this.B;
        this.l *= (double)this.B;
        if (this.L) {
            this.k *= (double)this.B;
        }
    }

    @Override
    public fhq b() {
        return fhq.b;
    }

    @Override
    public float b(float $$0) {
        return this.D * apa.a(((float)this.s + $$0) / (float)this.t * 32.0f, 0.0f, 1.0f);
    }

    public static class a
    implements fhp<iy> {
        private final fih a;

        public a(fih $$0) {
            this.a = $$0;
        }

        public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
            return new fgr($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
        }

        @Override
        public /* synthetic */ fhm createParticle(it it2, few few2, double d2, double d3, double d4, double d5, double d6, double d7) {
            return this.a((iy)it2, few2, d2, d3, d4, d5, d6, d7);
        }
    }
}

