/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.EnumSet;
import javax.annotation.Nullable;

public class bno
extends bmv {
    public static final int a = 1;
    protected final bgi b;
    protected final double c;
    protected double d;
    protected double e;
    protected double f;
    protected boolean g;

    public bno(bgi $$0, double $$1) {
        this.b = $$0;
        this.c = $$1;
        this.a(EnumSet.of(bmv.a.a));
    }

    @Override
    public boolean a() {
        gu $$0;
        if (!this.h()) {
            return false;
        }
        if (this.b.bL() && ($$0 = this.a(this.b.dI(), this.b, 5)) != null) {
            this.d = $$0.u();
            this.e = $$0.v();
            this.f = $$0.w();
            return true;
        }
        return this.i();
    }

    protected boolean h() {
        return this.b.ed() != null || this.b.dx() || this.b.bL();
    }

    protected boolean i() {
        eei $$0 = bqq.a(this.b, 5, 4);
        if ($$0 == null) {
            return false;
        }
        this.d = $$0.c;
        this.e = $$0.d;
        this.f = $$0.e;
        return true;
    }

    public boolean k() {
        return this.g;
    }

    @Override
    public void c() {
        this.b.J().a(this.d, this.e, this.f, this.c);
        this.g = true;
    }

    @Override
    public void d() {
        this.g = false;
    }

    @Override
    public boolean b() {
        return !this.b.J().l();
    }

    @Nullable
    protected gu a(cls $$0, bfj $$12, int $$2) {
        gu $$3 = $$12.di();
        if (!$$0.a_($$3).k($$0, $$3).b()) {
            return null;
        }
        return gu.a($$12.di(), $$2, 1, $$1 -> $$0.b_((gu)$$1).a(anb.a)).orElse(null);
    }
}

