/*
 * Decompiled with CFR 0.152.
 */
public class cjv
extends ciu {
    public cjv(acq $$0, cis $$1) {
        super($$0, $$1);
    }

    @Override
    public boolean a(cbt $$0, cmm $$1) {
        if ($$0.f() != 3 || $$0.g() != 3) {
            return false;
        }
        for (int $$2 = 0; $$2 < $$0.f(); ++$$2) {
            for (int $$3 = 0; $$3 < $$0.g(); ++$$3) {
                cfz $$4 = $$0.a($$2 + $$3 * $$0.f());
                if ($$4.b()) {
                    return false;
                }
                if (!($$2 == 1 && $$3 == 1 ? !$$4.a(cgc.ux) : !$$4.a(cgc.nH))) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public cfz a(cbt $$0, hs $$1) {
        cfz $$2 = $$0.a(1 + $$0.f());
        if (!$$2.a(cgc.ux)) {
            return cfz.b;
        }
        cfz $$3 = new cfz(cgc.uw, 8);
        chy.a($$3, chy.d($$2));
        chy.a($$3, chy.b($$2));
        return $$3;
    }

    @Override
    public boolean a(int $$0, int $$1) {
        return $$0 >= 2 && $$1 >= 2;
    }

    @Override
    public cje<?> aj_() {
        return cje.j;
    }
}

