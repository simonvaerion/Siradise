/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class blx
implements blu {
    protected final bgb a;
    protected float b;
    protected float c;
    protected int d;
    protected double e;
    protected double f;
    protected double g;

    public blx(bgb $$0) {
        this.a = $$0;
    }

    public void a(eei $$0) {
        this.a($$0.c, $$0.d, $$0.e);
    }

    public void a(bfj $$0) {
        this.a($$0.dn(), blx.b($$0), $$0.dt());
    }

    public void a(bfj $$0, float $$1, float $$2) {
        this.a($$0.dn(), blx.b($$0), $$0.dt(), $$1, $$2);
    }

    public void a(double $$0, double $$1, double $$2) {
        this.a($$0, $$1, $$2, this.a.fD(), this.a.X());
    }

    public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.b = $$3;
        this.c = $$4;
        this.d = 2;
    }

    public void a() {
        if (this.c()) {
            this.a.b_(0.0f);
        }
        if (this.d > 0) {
            --this.d;
            this.i().ifPresent($$0 -> {
                this.a.aX = this.a(this.a.aX, $$0.floatValue(), this.b);
            });
            this.h().ifPresent($$0 -> this.a.b_(this.a(this.a.dA(), $$0.floatValue(), this.c)));
        } else {
            this.a.aX = this.a(this.a.aX, this.a.aV, 10.0f);
        }
        this.b();
    }

    protected void b() {
        if (!this.a.J().l()) {
            this.a.aX = apa.c(this.a.aX, this.a.aV, (float)this.a.fC());
        }
    }

    protected boolean c() {
        return true;
    }

    public boolean d() {
        return this.d > 0;
    }

    public double e() {
        return this.e;
    }

    public double f() {
        return this.f;
    }

    public double g() {
        return this.g;
    }

    protected Optional<Float> h() {
        double $$0 = this.e - this.a.dn();
        double $$1 = this.f - this.a.dr();
        double $$2 = this.g - this.a.dt();
        double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
        return Math.abs($$1) > (double)1.0E-5f || Math.abs($$3) > (double)1.0E-5f ? Optional.of(Float.valueOf((float)(-(apa.d($$1, $$3) * 57.2957763671875)))) : Optional.empty();
    }

    protected Optional<Float> i() {
        double $$0 = this.e - this.a.dn();
        double $$1 = this.g - this.a.dt();
        return Math.abs($$1) > (double)1.0E-5f || Math.abs($$0) > (double)1.0E-5f ? Optional.of(Float.valueOf((float)(apa.d($$1, $$0) * 57.2957763671875) - 90.0f)) : Optional.empty();
    }

    protected float a(float $$0, float $$1, float $$2) {
        float $$3 = apa.c($$0, $$1);
        float $$4 = apa.a($$3, -$$2, $$2);
        return $$0 + $$4;
    }

    private static double b(bfj $$0) {
        if ($$0 instanceof bfz) {
            return $$0.dr();
        }
        return ($$0.cE().b + $$0.cE().e) / 2.0;
    }
}

