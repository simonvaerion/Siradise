/*
 * Decompiled with CFR 0.152.
 */
public class fgp
extends fim {
    private static final float a = 0.0025f;
    private static final int b = 300;
    private static final int F = 300;
    private static final float G = 0.25f;
    private static final float H = 2.0f;
    private float I;
    private final float J;
    private final float K;

    protected fgp(few $$0, double $$1, double $$2, double $$3, fih $$4) {
        super($$0, $$1, $$2, $$3);
        float $$5;
        this.a($$4.a(this.r.a(12), 12));
        this.I = (float)Math.toRadians(this.r.h() ? -30.0 : 30.0);
        this.J = this.r.i();
        this.K = (float)Math.toRadians(this.r.h() ? -5.0 : 5.0);
        this.t = 300;
        this.u = 7.5E-4f;
        this.D = $$5 = this.r.h() ? 0.05f : 0.075f;
        this.b($$5, $$5);
        this.B = 1.0f;
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
        if (this.t-- <= 0) {
            this.k();
        }
        if (this.o) {
            return;
        }
        float $$0 = 300 - this.t;
        float $$1 = Math.min($$0 / 300.0f, 1.0f);
        double $$2 = Math.cos(Math.toRadians(this.J * 60.0f)) * 2.0 * Math.pow($$1, 1.25);
        double $$3 = Math.sin(Math.toRadians(this.J * 60.0f)) * 2.0 * Math.pow($$1, 1.25);
        this.j += $$2 * (double)0.0025f;
        this.l += $$3 * (double)0.0025f;
        this.k -= (double)this.u;
        this.I += this.K / 20.0f;
        this.A = this.z;
        this.z += this.I / 20.0f;
        this.a(this.j, this.k, this.l);
        if (this.m || this.t < 299 && (this.j == 0.0 || this.l == 0.0)) {
            this.k();
        }
        if (this.o) {
            return;
        }
        this.j *= (double)this.B;
        this.k *= (double)this.B;
        this.l *= (double)this.B;
    }
}

