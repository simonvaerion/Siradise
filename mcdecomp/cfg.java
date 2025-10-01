/*
 * Decompiled with CFR 0.152.
 */
public class cfg
extends cfu {
    public cfg(cfu.a $$0) {
        super($$0);
    }

    @Override
    public bdx a(cij $$0) {
        gu $$3;
        byo $$12 = $$0.o();
        cmm $$2 = $$0.q();
        dcb $$4 = $$2.a_($$3 = $$0.a());
        if (cqa.h($$4) || cqb.g($$4) || cqc.g($$4)) {
            $$2.a($$12, $$3, amh.hS, ami.e, 1.0f, $$2.y_().i() * 0.4f + 0.8f);
            $$2.a($$3, (dcb)$$4.a(dcr.r, true), 11);
            $$2.a((bfj)$$12, dgl.c, $$3);
            if ($$12 != null) {
                $$0.n().a(1, $$12, (T $$1) -> $$1.d($$0.p()));
            }
            return bdx.a($$2.r_());
        }
        gu $$5 = $$3.a($$0.k());
        if (cpb.a($$2, $$5, $$0.g())) {
            $$2.a($$12, $$5, amh.hS, ami.e, 1.0f, $$2.y_().i() * 0.4f + 0.8f);
            dcb $$6 = cpb.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a((bfj)$$12, dgl.i, $$3);
            cfz $$7 = $$0.n();
            if ($$12 instanceof aig) {
                ai.y.a((aig)$$12, $$5, $$7);
                $$7.a(1, $$12, (T $$1) -> $$1.d($$0.p()));
            }
            return bdx.a($$2.r_());
        }
        return bdx.e;
    }
}

