/*
 * Decompiled with CFR 0.152.
 */
public abstract class cxe
extends cwx {
    protected cxe(dca.d $$0) {
        super($$0);
    }

    private static boolean b(dcb $$0, cmp $$1, gu $$2) {
        gu $$3 = $$2.c();
        dcb $$4 = $$1.a_($$3);
        if ($$4.a(cpo.dN) && $$4.c(cww.b) == 1) {
            return true;
        }
        if ($$4.u().e() == 8) {
            return false;
        }
        int $$5 = dwv.a($$1, $$0, $$2, $$4, $$3, ha.b, $$4.b($$1, $$3));
        return $$5 < $$1.M();
    }

    private static boolean c(dcb $$0, cmp $$1, gu $$2) {
        gu $$3 = $$2.c();
        return cxe.b($$0, $$1, $$2) && !$$1.b_($$3).a(anb.a);
    }

    @Override
    public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if (!cxe.b($$0, (cmp)$$1, $$2)) {
            $$1.b($$2, cpo.j.n());
            return;
        }
        if ($$1.z($$2.c()) >= 9) {
            dcb $$4 = this.n();
            for (int $$5 = 0; $$5 < 4; ++$$5) {
                gu $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
                if (!$$1.a_($$6).a(cpo.j) || !cxe.c($$4, (cmp)$$1, $$6)) continue;
                $$1.b($$6, (dcb)$$4.a(a, $$1.a_($$6.c()).a(cpo.dN)));
            }
        }
    }
}

