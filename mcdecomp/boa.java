/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class boa
extends bmv {
    private final bgv a;

    public boa(bgv $$0) {
        this.a = $$0;
        this.a(EnumSet.of(bmv.a.c, bmv.a.a));
    }

    @Override
    public boolean b() {
        return this.a.fY();
    }

    @Override
    public boolean a() {
        if (!this.a.q()) {
            return false;
        }
        if (this.a.aY()) {
            return false;
        }
        if (!this.a.ay()) {
            return false;
        }
        bfz $$0 = this.a.I_();
        if ($$0 == null) {
            return true;
        }
        if (this.a.f((bfj)$$0) < 144.0 && $$0.ed() != null) {
            return false;
        }
        return this.a.fY();
    }

    @Override
    public void c() {
        this.a.J().n();
        this.a.y(true);
    }

    @Override
    public void d() {
        this.a.y(false);
    }
}

