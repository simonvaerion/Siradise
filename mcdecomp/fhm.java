/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;

public abstract class fhm {
    private static final eed a = new eed(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    private static final double b = apa.k(100.0);
    protected final few c;
    protected double d;
    protected double e;
    protected double f;
    protected double g;
    protected double h;
    protected double i;
    protected double j;
    protected double k;
    protected double l;
    private eed D = a;
    protected boolean m;
    protected boolean n = true;
    private boolean E;
    protected boolean o;
    protected float p = 0.6f;
    protected float q = 1.8f;
    protected final apf r = apf.a();
    protected int s;
    protected int t;
    protected float u;
    protected float v = 1.0f;
    protected float w = 1.0f;
    protected float x = 1.0f;
    protected float y = 1.0f;
    protected float z;
    protected float A;
    protected float B = 0.98f;
    protected boolean C = false;

    protected fhm(few $$0, double $$1, double $$2, double $$3) {
        this.c = $$0;
        this.b(0.2f, 0.2f);
        this.c($$1, $$2, $$3);
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.t = (int)(4.0f / (this.r.i() * 0.9f + 0.1f));
    }

    public fhm(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
        this($$0, $$1, $$2, $$3);
        this.j = $$4 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        this.k = $$5 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        this.l = $$6 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        double $$7 = (Math.random() + Math.random() + 1.0) * (double)0.15f;
        double $$8 = Math.sqrt(this.j * this.j + this.k * this.k + this.l * this.l);
        this.j = this.j / $$8 * $$7 * (double)0.4f;
        this.k = this.k / $$8 * $$7 * (double)0.4f + (double)0.1f;
        this.l = this.l / $$8 * $$7 * (double)0.4f;
    }

    public fhm c(float $$0) {
        this.j *= (double)$$0;
        this.k = (this.k - (double)0.1f) * (double)$$0 + (double)0.1f;
        this.l *= (double)$$0;
        return this;
    }

    public void b(double $$0, double $$1, double $$2) {
        this.j = $$0;
        this.k = $$1;
        this.l = $$2;
    }

    public fhm d(float $$0) {
        this.b(0.2f * $$0, 0.2f * $$0);
        return this;
    }

    public void a(float $$0, float $$1, float $$2) {
        this.v = $$0;
        this.w = $$1;
        this.x = $$2;
    }

    protected void e(float $$0) {
        this.y = $$0;
    }

    public void a(int $$0) {
        this.t = $$0;
    }

    public int j() {
        return this.t;
    }

    public void a() {
        this.d = this.g;
        this.e = this.h;
        this.f = this.i;
        if (this.s++ >= this.t) {
            this.k();
            return;
        }
        this.k -= 0.04 * (double)this.u;
        this.a(this.j, this.k, this.l);
        if (this.C && this.h == this.e) {
            this.j *= 1.1;
            this.l *= 1.1;
        }
        this.j *= (double)this.B;
        this.k *= (double)this.B;
        this.l *= (double)this.B;
        if (this.m) {
            this.j *= (double)0.7f;
            this.l *= (double)0.7f;
        }
    }

    public abstract void a(ein var1, emz var2, float var3);

    public abstract fhq b();

    public String toString() {
        return this.getClass().getSimpleName() + ", Pos (" + this.g + "," + this.h + "," + this.i + "), RGBA (" + this.v + "," + this.w + "," + this.x + "," + this.y + "), Age " + this.s;
    }

    public void k() {
        this.o = true;
    }

    protected void b(float $$0, float $$1) {
        if ($$0 != this.p || $$1 != this.q) {
            this.p = $$0;
            this.q = $$1;
            eed $$2 = this.n();
            double $$3 = ($$2.a + $$2.d - (double)$$0) / 2.0;
            double $$4 = ($$2.c + $$2.f - (double)$$0) / 2.0;
            this.a(new eed($$3, $$2.b, $$4, $$3 + (double)this.p, $$2.b + (double)this.q, $$4 + (double)this.p));
        }
    }

    public void c(double $$0, double $$1, double $$2) {
        this.g = $$0;
        this.h = $$1;
        this.i = $$2;
        float $$3 = this.p / 2.0f;
        float $$4 = this.q;
        this.a(new eed($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3));
    }

    public void a(double $$0, double $$1, double $$2) {
        if (this.E) {
            return;
        }
        double $$3 = $$0;
        double $$4 = $$1;
        double $$5 = $$2;
        if (this.n && ($$0 != 0.0 || $$1 != 0.0 || $$2 != 0.0) && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 < b) {
            eei $$6 = bfj.a(null, new eei($$0, $$1, $$2), this.n(), this.c, List.of());
            $$0 = $$6.c;
            $$1 = $$6.d;
            $$2 = $$6.e;
        }
        if ($$0 != 0.0 || $$1 != 0.0 || $$2 != 0.0) {
            this.a(this.n().d($$0, $$1, $$2));
            this.l();
        }
        if (Math.abs($$4) >= (double)1.0E-5f && Math.abs($$1) < (double)1.0E-5f) {
            this.E = true;
        }
        boolean bl2 = this.m = $$4 != $$1 && $$4 < 0.0;
        if ($$3 != $$0) {
            this.j = 0.0;
        }
        if ($$5 != $$2) {
            this.l = 0.0;
        }
    }

    protected void l() {
        eed $$0 = this.n();
        this.g = ($$0.a + $$0.d) / 2.0;
        this.h = $$0.b;
        this.i = ($$0.c + $$0.f) / 2.0;
    }

    protected int a(float $$0) {
        gu $$1 = gu.a(this.g, this.h, this.i);
        if (this.c.A($$1)) {
            return fjv.a(this.c, $$1);
        }
        return 0;
    }

    public boolean m() {
        return !this.o;
    }

    public eed n() {
        return this.D;
    }

    public void a(eed $$0) {
        this.D = $$0;
    }

    public Optional<is> o() {
        return Optional.empty();
    }
}

