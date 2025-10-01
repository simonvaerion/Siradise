/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class cge
extends cfu {
    public cge(cfu.a $$0) {
        super($$0);
    }

    @Override
    public bdx a(cij $$0) {
        gu $$2;
        cmm $$1 = $$0.q();
        dcb $$3 = $$1.a_($$2 = $$0.a());
        if ($$3.a(amw.S)) {
            byo $$4 = $$0.o();
            if (!$$1.B && $$4 != null) {
                cge.a($$4, $$1, $$2);
            }
            return bdx.a($$1.B);
        }
        return bdx.d;
    }

    public static bdx a(byo $$0, cmm $$1, gu $$2) {
        bvb $$3 = null;
        boolean $$4 = false;
        double $$5 = 7.0;
        int $$6 = $$2.u();
        int $$7 = $$2.v();
        int $$8 = $$2.w();
        List<bgb> $$9 = $$1.a(bgb.class, new eed((double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$8 - 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0, (double)$$8 + 7.0));
        for (bgb $$10 : $$9) {
            if ($$10.fP() != $$0) continue;
            if ($$3 == null) {
                $$3 = bvb.b($$1, $$2);
                $$3.x();
            }
            $$10.b($$3, true);
            $$4 = true;
        }
        if ($$4) {
            $$1.a(dgl.b, $$2, dgl.a.a($$0));
        }
        return $$4 ? bdx.a : bdx.d;
    }
}

