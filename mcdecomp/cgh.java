/*
 * Decompiled with CFR 0.152.
 */
public class cgh
extends cfu {
    private static final int a = 32;

    public cgh(cfu.a $$0) {
        super($$0);
    }

    @Override
    public cfz a(cfz $$0, cmm $$1, bfz $$2) {
        if ($$2 instanceof aig) {
            aig $$3 = (aig)$$2;
            ai.z.a($$3, $$0);
            $$3.b(amr.c.b(this));
        }
        if ($$2 instanceof byo && !((byo)$$2).fO().d) {
            $$0.h(1);
        }
        if (!$$1.B) {
            $$2.en();
        }
        if ($$0.b()) {
            return new cfz(cgc.pK);
        }
        return $$0;
    }

    @Override
    public int b(cfz $$0) {
        return 32;
    }

    @Override
    public chs c(cfz $$0) {
        return chs.c;
    }

    @Override
    public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
        return cgb.a($$0, $$1, $$2);
    }
}

