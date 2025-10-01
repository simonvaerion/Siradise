/*
 * Decompiled with CFR 0.152.
 */
public class blt
implements blu {
    private final bgb a;
    private static final int b = 15;
    private static final int c = 10;
    private static final int d = 10;
    private int e;
    private float f;

    public blt(bgb $$0) {
        this.a = $$0;
    }

    public void a() {
        if (this.f()) {
            this.a.aV = this.a.dy();
            this.c();
            this.f = this.a.aX;
            this.e = 0;
            return;
        }
        if (this.e()) {
            if (Math.abs(this.a.aX - this.f) > 15.0f) {
                this.e = 0;
                this.f = this.a.aX;
                this.b();
            } else {
                ++this.e;
                if (this.e > 10) {
                    this.d();
                }
            }
        }
    }

    private void b() {
        this.a.aV = apa.c(this.a.aV, this.a.aX, (float)this.a.fC());
    }

    private void c() {
        this.a.aX = apa.c(this.a.aX, this.a.aV, (float)this.a.fC());
    }

    private void d() {
        int $$0 = this.e - 10;
        float $$1 = apa.a((float)$$0 / 10.0f, 0.0f, 1.0f);
        float $$2 = (float)this.a.fC() * (1.0f - $$1);
        this.a.aV = apa.c(this.a.aV, this.a.aX, $$2);
    }

    private boolean e() {
        return !(this.a.cO() instanceof bgb);
    }

    private boolean f() {
        double $$1;
        double $$0 = this.a.dn() - this.a.J;
        return $$0 * $$0 + ($$1 = this.a.dt() - this.a.L) * $$1 > 2.500000277905201E-7;
    }
}

