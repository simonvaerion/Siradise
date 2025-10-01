/*
 * Decompiled with CFR 0.152.
 */
public class cfh<T extends bfj>
extends cfu {
    private final bfn<T> a;
    private final int b;

    public cfh(cfu.a $$0, bfn<T> $$1, int $$2) {
        super($$0);
        this.a = $$1;
        this.b = $$2;
    }

    @Override
    public bdy<cfz> a(cmm $$0, byo $$12, bdw $$2) {
        cfz $$3 = $$12.b($$2);
        if ($$0.B) {
            return bdy.c($$3);
        }
        bfj $$4 = $$12.cX();
        if ($$12.bM() && $$4 instanceof bfw) {
            bfw $$5 = (bfw)((Object)$$4);
            if ($$4.ae() == this.a && $$5.a()) {
                $$3.a(this.b, $$12, (T $$1) -> $$1.d($$2));
                if ($$3.b()) {
                    cfz $$6 = new cfz(cgc.qh);
                    $$6.c($$3.v());
                    return bdy.a($$6);
                }
                return bdy.a($$3);
            }
        }
        $$12.b(amr.c.b(this));
        return bdy.c($$3);
    }
}

