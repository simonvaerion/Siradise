/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public abstract class bov
extends bmv {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    protected final bgb e;
    protected final boolean f;
    private final boolean d;
    private int i;
    private int j;
    private int k;
    @Nullable
    protected bfz g;
    protected int h = 60;

    public bov(bgb $$0, boolean $$1) {
        this($$0, $$1, false);
    }

    public bov(bgb $$0, boolean $$1, boolean $$2) {
        this.e = $$0;
        this.f = $$1;
        this.d = $$2;
    }

    @Override
    public boolean b() {
        bfz $$0 = this.e.j();
        if ($$0 == null) {
            $$0 = this.g;
        }
        if ($$0 == null) {
            return false;
        }
        if (!this.e.c($$0)) {
            return false;
        }
        efi $$1 = this.e.cd();
        efi $$2 = $$0.cd();
        if ($$1 != null && $$2 == $$1) {
            return false;
        }
        double $$3 = this.l();
        if (this.e.f((bfj)$$0) > $$3 * $$3) {
            return false;
        }
        if (this.f) {
            if (this.e.K().a($$0)) {
                this.k = 0;
            } else if (++this.k > bov.b(this.h)) {
                return false;
            }
        }
        this.e.h($$0);
        return true;
    }

    protected double l() {
        return this.e.b(bhg.b);
    }

    @Override
    public void c() {
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }

    @Override
    public void d() {
        this.e.h((bfz)null);
        this.g = null;
    }

    protected boolean a(@Nullable bfz $$0, bqm $$1) {
        if ($$0 == null) {
            return false;
        }
        if (!$$1.a(this.e, $$0)) {
            return false;
        }
        if (!this.e.a($$0.di())) {
            return false;
        }
        if (this.d) {
            if (--this.j <= 0) {
                this.i = 0;
            }
            if (this.i == 0) {
                int n2 = this.i = this.a($$0) ? 1 : 2;
            }
            if (this.i == 2) {
                return false;
            }
        }
        return true;
    }

    private boolean a(bfz $$0) {
        int $$4;
        this.j = bov.b(10 + this.e.ec().a(5));
        dxt $$1 = this.e.J().a((bfj)$$0, 0);
        if ($$1 == null) {
            return false;
        }
        dxr $$2 = $$1.d();
        if ($$2 == null) {
            return false;
        }
        int $$3 = $$2.a - $$0.dm();
        return (double)($$3 * $$3 + ($$4 = $$2.c - $$0.ds()) * $$4) <= 2.25;
    }

    public bov c(int $$0) {
        this.h = $$0;
        return this;
    }
}

