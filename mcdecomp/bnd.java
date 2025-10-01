/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.EnumSet;
import javax.annotation.Nullable;

public class bnd
extends bmv {
    public static final float a = 0.02f;
    protected final bgb b;
    @Nullable
    protected bfj c;
    protected final float d;
    private int h;
    protected final float e;
    private final boolean i;
    protected final Class<? extends bfz> f;
    protected final bqm g;

    public bnd(bgb $$0, Class<? extends bfz> $$1, float $$2) {
        this($$0, $$1, $$2, 0.02f);
    }

    public bnd(bgb $$0, Class<? extends bfz> $$1, float $$2, float $$3) {
        this($$0, $$1, $$2, $$3, false);
    }

    public bnd(bgb $$0, Class<? extends bfz> $$12, float $$2, float $$3, boolean $$4) {
        this.b = $$0;
        this.f = $$12;
        this.d = $$2;
        this.e = $$3;
        this.i = $$4;
        this.a(EnumSet.of(bmv.a.b));
        this.g = $$12 == byo.class ? bqm.b().a($$2).a((bfz $$1) -> bfm.b($$0).test((bfj)$$1)) : bqm.b().a($$2);
    }

    @Override
    public boolean a() {
        if (this.b.ec().i() >= this.e) {
            return false;
        }
        if (this.b.j() != null) {
            this.c = this.b.j();
        }
        this.c = this.f == byo.class ? this.b.dI().a(this.g, this.b, this.b.dn(), this.b.dr(), this.b.dt()) : this.b.dI().a(this.b.dI().a(this.f, this.b.cE().c(this.d, 3.0, this.d), $$0 -> true), this.g, this.b, this.b.dn(), this.b.dr(), this.b.dt());
        return this.c != null;
    }

    @Override
    public boolean b() {
        if (!this.c.bs()) {
            return false;
        }
        if (this.b.f(this.c) > (double)(this.d * this.d)) {
            return false;
        }
        return this.h > 0;
    }

    @Override
    public void c() {
        this.h = this.a(40 + this.b.ec().a(40));
    }

    @Override
    public void d() {
        this.c = null;
    }

    @Override
    public void e() {
        if (!this.c.bs()) {
            return;
        }
        double $$0 = this.i ? this.b.dr() : this.c.dr();
        this.b.E().a(this.c.dn(), $$0, this.c.dt());
        --this.h;
    }
}

