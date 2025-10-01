/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class bnf
extends bmv {
    protected final bgi a;
    private final double b;
    private final boolean c;
    private dxt d;
    private double e;
    private double f;
    private double g;
    private int h;
    private int i;
    private final int j = 20;
    private long k;
    private static final long l = 20L;

    public bnf(bgi $$0, double $$1, boolean $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.a(EnumSet.of(bmv.a.a, bmv.a.b));
    }

    @Override
    public boolean a() {
        long $$0 = this.a.dI().V();
        if ($$0 - this.k < 20L) {
            return false;
        }
        this.k = $$0;
        bfz $$1 = this.a.j();
        if ($$1 == null) {
            return false;
        }
        if (!$$1.bs()) {
            return false;
        }
        this.d = this.a.J().a((bfj)$$1, 0);
        if (this.d != null) {
            return true;
        }
        return this.a($$1) >= this.a.i($$1.dn(), $$1.dp(), $$1.dt());
    }

    @Override
    public boolean b() {
        bfz $$0 = this.a.j();
        if ($$0 == null) {
            return false;
        }
        if (!$$0.bs()) {
            return false;
        }
        if (!this.c) {
            return !this.a.J().l();
        }
        if (!this.a.a($$0.di())) {
            return false;
        }
        return !($$0 instanceof byo) || !$$0.G_() && !((byo)$$0).f();
    }

    @Override
    public void c() {
        this.a.J().a(this.d, this.b);
        this.a.v(true);
        this.h = 0;
        this.i = 0;
    }

    @Override
    public void d() {
        bfz $$0 = this.a.j();
        if (!bfm.e.test($$0)) {
            this.a.h((bfz)null);
        }
        this.a.v(false);
        this.a.J().n();
    }

    @Override
    public boolean K_() {
        return true;
    }

    @Override
    public void e() {
        bfz $$0 = this.a.j();
        if ($$0 == null) {
            return;
        }
        this.a.E().a($$0, 30.0f, 30.0f);
        double $$1 = this.a.j($$0);
        this.h = Math.max(this.h - 1, 0);
        if ((this.c || this.a.K().a($$0)) && this.h <= 0 && (this.e == 0.0 && this.f == 0.0 && this.g == 0.0 || $$0.i(this.e, this.f, this.g) >= 1.0 || this.a.ec().i() < 0.05f)) {
            this.e = $$0.dn();
            this.f = $$0.dp();
            this.g = $$0.dt();
            this.h = 4 + this.a.ec().a(7);
            if ($$1 > 1024.0) {
                this.h += 10;
            } else if ($$1 > 256.0) {
                this.h += 5;
            }
            if (!this.a.J().a((bfj)$$0, this.b)) {
                this.h += 15;
            }
            this.h = this.a(this.h);
        }
        this.i = Math.max(this.i - 1, 0);
        this.a($$0, $$1);
    }

    protected void a(bfz $$0, double $$1) {
        double $$2 = this.a($$0);
        if ($$1 <= $$2 && this.i <= 0) {
            this.h();
            this.a.a(bdw.a);
            this.a.z($$0);
        }
    }

    protected void h() {
        this.i = this.a(20);
    }

    protected boolean i() {
        return this.i <= 0;
    }

    protected int k() {
        return this.i;
    }

    protected int l() {
        return this.a(20);
    }

    protected double a(bfz $$0) {
        return this.a.dd() * 2.0f * (this.a.dd() * 2.0f) + $$0.dd();
    }
}

