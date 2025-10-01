/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class cdw
extends cfu {
    public cdw(cfu.a $$0) {
        super($$0);
    }

    @Override
    public bdy<cfz> a(cmm $$02, byo $$1, bdw $$2) {
        List<bfg> $$3 = $$02.a(bfg.class, $$1.cE().g(2.0), (? super T $$0) -> $$0 != null && $$0.bs() && $$0.s() instanceof bub);
        cfz $$4 = $$1.b($$2);
        if (!$$3.isEmpty()) {
            bfg $$5 = $$3.get(0);
            $$5.a($$5.h() - 0.5f);
            $$02.a(null, $$1.dn(), $$1.dp(), $$1.dt(), amh.cj, ami.g, 1.0f, 1.0f);
            $$02.a((bfj)$$1, dgl.z, $$1.dg());
            if ($$1 instanceof aig) {
                aig $$6 = (aig)$$1;
                ai.Q.a($$6, $$4, $$5);
            }
            return bdy.a(this.a($$4, $$1, new cfz(cgc.ut)), $$02.r_());
        }
        eee $$7 = cdw.a($$02, $$1, clv.b.b);
        if ($$7.c() == eeg.a.a) {
            return bdy.c($$4);
        }
        if ($$7.c() == eeg.a.b) {
            gu $$8 = $$7.a();
            if (!$$02.a($$1, $$8)) {
                return bdy.c($$4);
            }
            if ($$02.b_($$8).a(anb.a)) {
                $$02.a($$1, $$1.dn(), $$1.dp(), $$1.dt(), amh.ci, ami.g, 1.0f, 1.0f);
                $$02.a((bfj)$$1, dgl.z, $$8);
                return bdy.a(this.a($$4, $$1, chy.a(new cfz(cgc.rv), chz.c)), $$02.r_());
            }
        }
        return bdy.c($$4);
    }

    protected cfz a(cfz $$0, byo $$1, cfz $$2) {
        $$1.b(amr.c.b(this));
        return cgb.a($$0, $$1, $$2);
    }
}

