/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class boe
extends bmv {
    private final bxw a;

    public boe(bxw $$0) {
        this.a = $$0;
        this.a(EnumSet.of(bmv.a.c, bmv.a.a));
    }

    @Override
    public boolean a() {
        if (!this.a.bs()) {
            return false;
        }
        if (this.a.aV()) {
            return false;
        }
        if (!this.a.ay()) {
            return false;
        }
        if (this.a.S) {
            return false;
        }
        byo $$0 = this.a.fY();
        if ($$0 == null) {
            return false;
        }
        if (this.a.f((bfj)$$0) > 16.0) {
            return false;
        }
        return $$0.bR != null;
    }

    @Override
    public void c() {
        this.a.J().n();
    }

    @Override
    public void d() {
        this.a.f((byo)null);
    }
}

