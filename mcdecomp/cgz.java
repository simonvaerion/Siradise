/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cgz
extends chi {
    public cgz(cfu.a $$0, cpn $$1, cpn $$2) {
        super($$1, $$2, $$0, ha.a);
    }

    public cgz(cfu.a $$0, cpn $$1, cpn $$2, ha $$3) {
        super($$1, $$2, $$0, $$3);
    }

    @Override
    protected boolean a(gu $$0, cmm $$1, @Nullable byo $$2, cfz $$3, dcb $$4) {
        Object object;
        boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
        if (!$$1.B && !$$5 && $$2 != null && (object = $$1.c_($$0)) instanceof dav) {
            dav $$6 = (dav)object;
            object = $$1.a_($$0).b();
            if (object instanceof cwn) {
                cwn $$7 = (cwn)object;
                $$7.a($$2, $$6, true);
            }
        }
        return $$5;
    }
}

