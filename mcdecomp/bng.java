/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class bng
extends bns {
    private static final int i = 10;
    private static final int j = 7;

    public bng(bgi $$0, double $$1, boolean $$2) {
        super($$0, $$1, 10, $$2);
    }

    @Override
    public boolean a() {
        gu $$1;
        aif $$0 = (aif)this.b.dI();
        if ($$0.b($$1 = this.b.di())) {
            return false;
        }
        return super.a();
    }

    @Override
    @Nullable
    protected eei h() {
        gu $$1;
        hx $$2;
        aif $$0 = (aif)this.b.dI();
        hx $$3 = bht.a($$0, $$2 = hx.a($$1 = this.b.di()), 2);
        if ($$3 != $$2) {
            return bqq.a(this.b, 10, 7, eei.c($$3.q()), 1.5707963705062866);
        }
        return null;
    }
}

