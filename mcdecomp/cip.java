/*
 * Decompiled with CFR 0.152.
 */
public class cip
extends ciu {
    public cip(acq $$0, cis $$1) {
        super($$0, $$1);
    }

    @Override
    public boolean a(cbt $$0, cmm $$1) {
        int $$2 = 0;
        cfz $$3 = cfz.b;
        for (int $$4 = 0; $$4 < $$0.b(); ++$$4) {
            cfz $$5 = $$0.a($$4);
            if ($$5.b()) continue;
            if ($$5.a(cgc.th)) {
                if (!$$3.b()) {
                    return false;
                }
                $$3 = $$5;
                continue;
            }
            if ($$5.a(cgc.tg)) {
                ++$$2;
                continue;
            }
            return false;
        }
        return !$$3.b() && $$3.u() && $$2 > 0;
    }

    @Override
    public cfz a(cbt $$0, hs $$1) {
        int $$2 = 0;
        cfz $$3 = cfz.b;
        for (int $$4 = 0; $$4 < $$0.b(); ++$$4) {
            cfz $$5 = $$0.a($$4);
            if ($$5.b()) continue;
            if ($$5.a(cgc.th)) {
                if (!$$3.b()) {
                    return cfz.b;
                }
                $$3 = $$5;
                continue;
            }
            if ($$5.a(cgc.tg)) {
                ++$$2;
                continue;
            }
            return cfz.b;
        }
        if ($$3.b() || !$$3.u() || $$2 < 1 || chv.d($$3) >= 2) {
            return cfz.b;
        }
        cfz $$6 = new cfz(cgc.th, $$2);
        qr $$7 = $$3.v().h();
        $$7.a("generation", chv.d($$3) + 1);
        $$6.c($$7);
        return $$6;
    }

    @Override
    public hn<cfz> a(cbt $$0) {
        hn<cfz> $$1 = hn.a($$0.b(), cfz.b);
        for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            cfz $$3 = $$0.a($$2);
            if ($$3.d().t()) {
                $$1.set($$2, new cfz($$3.d().s()));
                continue;
            }
            if (!($$3.d() instanceof chv)) continue;
            $$1.set($$2, $$3.c(1));
            break;
        }
        return $$1;
    }

    @Override
    public cje<?> aj_() {
        return cje.d;
    }

    @Override
    public boolean a(int $$0, int $$1) {
        return $$0 >= 3 && $$1 >= 3;
    }
}

