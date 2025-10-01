/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.EnumSet;
import javax.annotation.Nullable;

public class bnk
extends bmv {
    private final bgi a;
    @Nullable
    private bfz b;
    private double c;
    private double d;
    private double e;
    private final double f;
    private final float g;

    public bnk(bgi $$0, double $$1, float $$2) {
        this.a = $$0;
        this.f = $$1;
        this.g = $$2;
        this.a(EnumSet.of(bmv.a.a));
    }

    @Override
    public boolean a() {
        this.b = this.a.j();
        if (this.b == null) {
            return false;
        }
        if (this.b.f((bfj)this.a) > (double)(this.g * this.g)) {
            return false;
        }
        eei $$0 = bqq.a(this.a, 16, 7, this.b.dg(), 1.5707963705062866);
        if ($$0 == null) {
            return false;
        }
        this.c = $$0.c;
        this.d = $$0.d;
        this.e = $$0.e;
        return true;
    }

    @Override
    public boolean b() {
        return !this.a.J().l() && this.b.bs() && this.b.f((bfj)this.a) < (double)(this.g * this.g);
    }

    @Override
    public void d() {
        this.b = null;
    }

    @Override
    public void c() {
        this.a.J().a(this.c, this.d, this.e, this.f);
    }
}

