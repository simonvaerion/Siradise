/*
 * Decompiled with CFR 0.152.
 */
public class cju
extends ciu {
    public cju(acq $$0, cis $$1) {
        super($$0, $$1);
    }

    @Override
    public boolean a(cbt $$0, cmm $$1) {
        boolean $$2 = false;
        boolean $$3 = false;
        boolean $$4 = false;
        boolean $$5 = false;
        for (int $$6 = 0; $$6 < $$0.b(); ++$$6) {
            cfz $$7 = $$0.a($$6);
            if ($$7.b()) continue;
            if ($$7.a(cpo.cf.k()) && !$$4) {
                $$4 = true;
                continue;
            }
            if ($$7.a(cpo.cg.k()) && !$$3) {
                $$3 = true;
                continue;
            }
            if ($$7.a(ane.O) && !$$2) {
                $$2 = true;
                continue;
            }
            if ($$7.a(cgc.oC) && !$$5) {
                $$5 = true;
                continue;
            }
            return false;
        }
        return $$2 && $$4 && $$3 && $$5;
    }

    @Override
    public cfz a(cbt $$0, hs $$1) {
        cfz $$2 = new cfz(cgc.va, 1);
        for (int $$3 = 0; $$3 < $$0.b(); ++$$3) {
            cxq $$5;
            cfz $$4 = $$0.a($$3);
            if ($$4.b() || ($$5 = cxq.a($$4.d())) == null) continue;
            chj.a($$2, $$5.a(), $$5.b());
            break;
        }
        return $$2;
    }

    @Override
    public boolean a(int $$0, int $$1) {
        return $$0 >= 2 && $$1 >= 2;
    }

    @Override
    public cje<?> aj_() {
        return cje.n;
    }
}

