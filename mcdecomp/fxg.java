/*
 * Decompiled with CFR 0.152.
 */
public abstract class fxg
implements fxy {
    protected fxv a;
    protected final ami b;
    protected final acq c;
    protected float d = 1.0f;
    protected float e = 1.0f;
    protected double f;
    protected double g;
    protected double h;
    protected boolean i;
    protected int j;
    protected fxy.a k = fxy.a.b;
    protected boolean l;
    protected apf m;

    protected fxg(amg $$0, ami $$1, apf $$2) {
        this($$0.a(), $$1, $$2);
    }

    protected fxg(acq $$0, ami $$1, apf $$2) {
        this.c = $$0;
        this.b = $$1;
        this.m = $$2;
    }

    @Override
    public acq a() {
        return this.c;
    }

    @Override
    public fzd a(fzc $$0) {
        if (this.c.equals(fzc.b)) {
            this.a = fzc.d;
            return fzc.c;
        }
        fzd $$1 = $$0.a(this.c);
        this.a = $$1 == null ? fzc.a : $$1.a(this.m);
        return $$1;
    }

    @Override
    public fxv b() {
        return this.a;
    }

    @Override
    public ami c() {
        return this.b;
    }

    @Override
    public boolean d() {
        return this.i;
    }

    @Override
    public int e() {
        return this.j;
    }

    @Override
    public float f() {
        return this.d * this.a.c().a(this.m);
    }

    @Override
    public float g() {
        return this.e * this.a.d().a(this.m);
    }

    @Override
    public double h() {
        return this.f;
    }

    @Override
    public double i() {
        return this.g;
    }

    @Override
    public double j() {
        return this.h;
    }

    @Override
    public fxy.a k() {
        return this.k;
    }

    @Override
    public boolean l() {
        return this.l;
    }

    public String toString() {
        return "SoundInstance[" + this.c + "]";
    }
}

