/*
 * Decompiled with CFR 0.152.
 */
public class cfc
extends cfu {
    public cfc(cfu.a $$0) {
        super($$0);
    }

    @Override
    public bdx a(cij $$0) {
        cmm $$1 = $$0.q();
        gu $$2 = $$0.a();
        dcb $$3 = $$1.a_($$2);
        boolean $$4 = false;
        if (cqa.h($$3) || cqb.g($$3) || cqc.g($$3)) {
            this.a($$1, $$2);
            $$1.b($$2, (dcb)$$3.a(dcr.r, true));
            $$1.a((bfj)$$0.o(), dgl.c, $$2);
            $$4 = true;
        } else if (cpb.a($$1, $$2 = $$2.a($$0.k()), $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, cpb.a($$1, $$2));
            $$1.a((bfj)$$0.o(), dgl.i, $$2);
            $$4 = true;
        }
        if ($$4) {
            $$0.n().h(1);
            return bdx.a($$1.B);
        }
        return bdx.e;
    }

    private void a(cmm $$0, gu $$1) {
        apf $$2 = $$0.y_();
        $$0.a(null, $$1, amh.hD, ami.e, 1.0f, ($$2.i() - $$2.i()) * 0.2f + 1.0f);
    }
}

