/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class btl
extends btj {
    public btl(bfn<? extends btl> $$0, cmm $$1) {
        super((bfn<? extends btj>)$$0, $$1);
    }

    @Override
    protected amg s() {
        return amh.fZ;
    }

    @Override
    protected amg gx() {
        return amh.ga;
    }

    @Override
    protected amg g_() {
        return amh.gc;
    }

    @Override
    @Nullable
    protected amg gf() {
        return amh.gd;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.ge;
    }

    @Override
    public boolean a(brl $$0) {
        if ($$0 == this) {
            return false;
        }
        if ($$0 instanceof btl || $$0 instanceof btm) {
            return this.gG() && ((btk)$$0).gG();
        }
        return false;
    }

    @Override
    @Nullable
    public bfe a(aif $$0, bfe $$1) {
        bfn<btj> $$2 = $$1 instanceof btm ? bfn.ap : bfn.w;
        btk $$3 = $$2.a($$0);
        if ($$3 != null) {
            this.a($$1, $$3);
        }
        return $$3;
    }
}

