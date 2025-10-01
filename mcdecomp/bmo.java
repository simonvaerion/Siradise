/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.EnumSet;
import javax.annotation.Nullable;

public class bmo
extends bmv {
    protected final bgi a;
    private double b;
    private double c;
    private double d;
    private final double e;
    private final cmm f;

    public bmo(bgi $$0, double $$1) {
        this.a = $$0;
        this.e = $$1;
        this.f = $$0.dI();
        this.a(EnumSet.of(bmv.a.a));
    }

    @Override
    public boolean a() {
        if (this.a.j() != null) {
            return false;
        }
        if (!this.f.N()) {
            return false;
        }
        if (!this.a.bL()) {
            return false;
        }
        if (!this.f.g(this.a.di())) {
            return false;
        }
        if (!this.a.c(bfo.f).b()) {
            return false;
        }
        return this.h();
    }

    protected boolean h() {
        eei $$0 = this.i();
        if ($$0 == null) {
            return false;
        }
        this.b = $$0.c;
        this.c = $$0.d;
        this.d = $$0.e;
        return true;
    }

    @Override
    public boolean b() {
        return !this.a.J().l();
    }

    @Override
    public void c() {
        this.a.J().a(this.b, this.c, this.d, this.e);
    }

    @Nullable
    protected eei i() {
        apf $$0 = this.a.ec();
        gu $$1 = this.a.di();
        for (int $$2 = 0; $$2 < 10; ++$$2) {
            gu $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
            if (this.f.g($$3) || !(this.a.h($$3) < 0.0f)) continue;
            return eei.c($$3);
        }
        return null;
    }
}

