/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class csd
extends ctg {
    public static final dcz<dcm> I = dcr.U;

    protected csd(dca.d $$0) {
        super($$0);
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        return csd.b($$1, $$2, csd.h($$0).g());
    }

    public static boolean b(cmp $$0, gu $$1, ha $$2) {
        gu $$3 = $$1.a($$2);
        return $$0.a_($$3).d($$0, $$3, $$2.g());
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        for (ha $$1 : $$0.f()) {
            dcb $$3;
            if ($$1.o() == ha.a.b) {
                dcb $$2 = (dcb)((dcb)this.n().a(I, $$1 == ha.b ? dcm.c : dcm.a)).a(aC, $$0.g());
            } else {
                $$3 = (dcb)((dcb)this.n().a(I, dcm.b)).a(aC, $$1.g());
            }
            if (!$$3.a((cmp)$$0.q(), $$0.a())) continue;
            return $$3;
        }
        return null;
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if (csd.h($$0).g() == $$1 && !$$0.a($$3, $$4)) {
            return cpo.a.n();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    protected static ha h(dcb $$0) {
        switch ($$0.c(I)) {
            case c: {
                return ha.a;
            }
            case a: {
                return ha.b;
            }
        }
        return $$0.c(aC);
    }
}

