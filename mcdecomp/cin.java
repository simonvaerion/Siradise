/*
 * Decompiled with CFR 0.152.
 */
public class cin
extends ciu {
    public cin(acq $$0, cis $$1) {
        super($$0, $$1);
    }

    @Override
    public boolean a(cbt $$0, cmm $$1) {
        cen $$2 = null;
        cfz $$3 = null;
        cfz $$4 = null;
        for (int $$5 = 0; $$5 < $$0.b(); ++$$5) {
            cfz $$6 = $$0.a($$5);
            if ($$6.b()) continue;
            cfu $$7 = $$6.d();
            if (!($$7 instanceof cdp)) {
                return false;
            }
            cdp $$8 = (cdp)$$7;
            if ($$2 == null) {
                $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
                return false;
            }
            int $$9 = czd.c($$6);
            if ($$9 > 6) {
                return false;
            }
            if ($$9 > 0) {
                if ($$3 == null) {
                    $$3 = $$6;
                    continue;
                }
                return false;
            }
            if ($$4 == null) {
                $$4 = $$6;
                continue;
            }
            return false;
        }
        return $$3 != null && $$4 != null;
    }

    @Override
    public cfz a(cbt $$0, hs $$1) {
        for (int $$2 = 0; $$2 < $$0.b(); ++$$2) {
            int $$4;
            cfz $$3 = $$0.a($$2);
            if ($$3.b() || ($$4 = czd.c($$3)) <= 0 || $$4 > 6) continue;
            return $$3.c(1);
        }
        return cfz.b;
    }

    @Override
    public hn<cfz> a(cbt $$0) {
        hn<cfz> $$1 = hn.a($$0.b(), cfz.b);
        for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            cfz $$3 = $$0.a($$2);
            if ($$3.b()) continue;
            if ($$3.d().t()) {
                $$1.set($$2, new cfz($$3.d().s()));
                continue;
            }
            if (!$$3.u() || czd.c($$3) <= 0) continue;
            $$1.set($$2, $$3.c(1));
        }
        return $$1;
    }

    @Override
    public cje<?> aj_() {
        return cje.k;
    }

    @Override
    public boolean a(int $$0, int $$1) {
        return $$0 * $$1 >= 2;
    }
}

