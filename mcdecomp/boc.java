/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.EnumSet;
import javax.annotation.Nullable;

public class boc
extends bmv {
    private final bvo a;
    @Nullable
    private bfz b;

    public boc(bvo $$0) {
        this.a = $$0;
        this.a(EnumSet.of(bmv.a.a));
    }

    @Override
    public boolean a() {
        bfz $$0 = this.a.j();
        return this.a.r() > 0 || $$0 != null && this.a.f((bfj)$$0) < 9.0;
    }

    @Override
    public void c() {
        this.a.J().n();
        this.b = this.a.j();
    }

    @Override
    public void d() {
        this.b = null;
    }

    @Override
    public boolean K_() {
        return true;
    }

    @Override
    public void e() {
        if (this.b == null) {
            this.a.b(-1);
            return;
        }
        if (this.a.f((bfj)this.b) > 49.0) {
            this.a.b(-1);
            return;
        }
        if (!this.a.K().a(this.b)) {
            this.a.b(-1);
            return;
        }
        this.a.b(1);
    }
}

