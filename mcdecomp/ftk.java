/*
 * Decompiled with CFR 0.152.
 */
public class ftk<T extends bfz>
extends ftg<T, fdd<T>> {
    private final fbf<T> a;

    public ftk(fqt<T, fdd<T>> $$0, fea $$1) {
        super($$0);
        this.a = new fdd($$1.a(fed.bn));
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        ein $$13;
        boolean $$11;
        enn $$10 = enn.N();
        boolean bl2 = $$11 = $$10.b((bfj)$$3) && ((bfj)$$3).cb();
        if (((bfj)$$3).cb() && !$$11) {
            return;
        }
        if ($$11) {
            ein $$12 = $$1.getBuffer(fkf.p(this.a($$3)));
        } else {
            $$13 = $$1.getBuffer(fkf.h(this.a($$3)));
        }
        ((fdd)this.c()).a(this.a);
        this.a.a($$3, $$4, $$5, $$6);
        this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
        this.a.a($$0, $$13, $$2, fpz.c($$3, 0.0f), 1.0f, 1.0f, 1.0f, 1.0f);
    }
}

