/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import javax.annotation.Nullable;

public class bmu
extends bmv {
    public static final int a = 8;
    public static final int b = 4;
    public static final int c = 3;
    private final brl d;
    @Nullable
    private brl e;
    private final double f;
    private int g;

    public bmu(brl $$0, double $$1) {
        this.d = $$0;
        this.f = $$1;
    }

    @Override
    public boolean a() {
        if (this.d.h() >= 0) {
            return false;
        }
        List<?> $$0 = this.d.dI().a(this.d.getClass(), this.d.cE().c(8.0, 4.0, 8.0));
        brl $$1 = null;
        double $$2 = Double.MAX_VALUE;
        for (brl $$3 : $$0) {
            double $$4;
            if ($$3.h() < 0 || ($$4 = this.d.f((bfj)$$3)) > $$2) continue;
            $$2 = $$4;
            $$1 = $$3;
        }
        if ($$1 == null) {
            return false;
        }
        if ($$2 < 9.0) {
            return false;
        }
        this.e = $$1;
        return true;
    }

    @Override
    public boolean b() {
        if (this.d.h() >= 0) {
            return false;
        }
        if (!this.e.bs()) {
            return false;
        }
        double $$0 = this.d.f((bfj)this.e);
        return !($$0 < 9.0) && !($$0 > 256.0);
    }

    @Override
    public void c() {
        this.g = 0;
    }

    @Override
    public void d() {
        this.e = null;
    }

    @Override
    public void e() {
        if (--this.g > 0) {
            return;
        }
        this.g = this.a(10);
        this.d.J().a((bfj)this.e, this.f);
    }
}

