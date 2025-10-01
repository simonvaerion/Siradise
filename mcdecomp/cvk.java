/*
 * Decompiled with CFR 0.152.
 */
public class cvk
extends cxk {
    protected cvk(dca.d $$0) {
        super($$0);
    }

    @Override
    public bdx a(dcb $$0, cmm $$12, gu $$2, byo $$3, bdw $$4, eee $$5) {
        cfz $$6 = $$3.b($$4);
        if ($$6.a(cgc.rg)) {
            if (!$$12.B) {
                ha $$7 = $$5.b();
                ha $$8 = $$7.o() == ha.a.b ? $$3.cB().g() : $$7;
                $$12.a(null, $$2, amh.tj, ami.e, 1.0f, 1.0f);
                $$12.a($$2, (dcb)cpo.ef.n().a(cqg.a, $$8), 11);
                bvh $$9 = new bvh($$12, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new cfz(cgc.rj, 4));
                $$9.o(0.05 * (double)$$8.j() + $$12.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$12.z.j() * 0.02);
                $$12.b($$9);
                $$6.a(1, $$3, (T $$1) -> $$1.d($$4));
                $$12.a((bfj)$$3, dgl.N, $$2);
                $$3.b(amr.c.b(cgc.rg));
            }
            return bdx.a($$12.B);
        }
        return super.a($$0, $$12, $$2, $$3, $$4, $$5);
    }

    @Override
    public cxj a() {
        return (cxj)cpo.fd;
    }

    @Override
    public cop b() {
        return (cop)cpo.fb;
    }
}

