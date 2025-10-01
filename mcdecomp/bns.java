/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.EnumSet;
import javax.annotation.Nullable;

public class bns
extends bmv {
    public static final int a = 120;
    protected final bgi b;
    protected double c;
    protected double d;
    protected double e;
    protected final double f;
    protected int g;
    protected boolean h;
    private final boolean i;

    public bns(bgi $$0, double $$1) {
        this($$0, $$1, 120);
    }

    public bns(bgi $$0, double $$1, int $$2) {
        this($$0, $$1, $$2, true);
    }

    public bns(bgi $$0, double $$1, int $$2, boolean $$3) {
        this.b = $$0;
        this.f = $$1;
        this.g = $$2;
        this.i = $$3;
        this.a(EnumSet.of(bmv.a.a));
    }

    @Override
    public boolean a() {
        eei $$0;
        if (this.b.bN()) {
            return false;
        }
        if (!this.h) {
            if (this.i && this.b.eh() >= 100) {
                return false;
            }
            if (this.b.ec().a(bns.b(this.g)) != 0) {
                return false;
            }
        }
        if (($$0 = this.h()) == null) {
            return false;
        }
        this.c = $$0.c;
        this.d = $$0.d;
        this.e = $$0.e;
        this.h = false;
        return true;
    }

    @Nullable
    protected eei h() {
        return bqq.a(this.b, 10, 7);
    }

    @Override
    public boolean b() {
        return !this.b.J().l() && !this.b.bN();
    }

    @Override
    public void c() {
        this.b.J().a(this.c, this.d, this.e, this.f);
    }

    @Override
    public void d() {
        this.b.J().n();
        super.d();
    }

    public void i() {
        this.h = true;
    }

    public void c(int $$0) {
        this.g = $$0;
    }
}

