/*
 * Decompiled with CFR 0.152.
 */
public class cgv
extends cfu {
    public cgv(cfu.a $$0) {
        super($$0);
    }

    @Override
    public boolean a(cfz $$02, cmm $$1, dcb $$2, gu $$3, bfz $$4) {
        if (!$$1.B && !$$2.a(amw.aI)) {
            $$02.a(1, $$4, (T $$0) -> $$0.d(bfo.a));
        }
        if ($$2.a(amw.O) || $$2.a(cpo.bs) || $$2.a(cpo.bt) || $$2.a(cpo.bu) || $$2.a(cpo.bv) || $$2.a(cpo.rF) || $$2.a(cpo.ff) || $$2.a(cpo.fI) || $$2.a(amw.a)) {
            return true;
        }
        return super.a($$02, $$1, $$2, $$3, $$4);
    }

    @Override
    public boolean a_(dcb $$0) {
        return $$0.a(cpo.bs) || $$0.a(cpo.cw) || $$0.a(cpo.fI);
    }

    @Override
    public float a(cfz $$0, dcb $$1) {
        if ($$1.a(cpo.bs) || $$1.a(amw.O)) {
            return 15.0f;
        }
        if ($$1.a(amw.a)) {
            return 5.0f;
        }
        if ($$1.a(cpo.ff) || $$1.a(cpo.fg)) {
            return 2.0f;
        }
        return super.a($$0, $$1);
    }

    @Override
    public bdx a(cij $$0) {
        cta $$5;
        gu $$2;
        cmm $$12 = $$0.q();
        dcb $$3 = $$12.a_($$2 = $$0.a());
        cpn $$4 = $$3.b();
        if ($$4 instanceof cta && !($$5 = (cta)$$4).o($$3)) {
            byo $$6 = $$0.o();
            cfz $$7 = $$0.n();
            if ($$6 instanceof aig) {
                ai.M.a((aig)$$6, $$2, $$7);
            }
            $$12.a($$6, $$2, amh.ki, ami.e, 1.0f, 1.0f);
            dcb $$8 = $$5.n($$3);
            $$12.b($$2, $$8);
            $$12.a(dgl.c, $$2, dgl.a.a($$0.o(), $$8));
            if ($$6 != null) {
                $$7.a(1, $$6, (T $$1) -> $$1.d($$0.p()));
            }
            return bdx.a($$12.B);
        }
        return super.a($$0);
    }
}

