/*
 * Decompiled with CFR 0.152.
 */
public class ie
extends ig {
    private final ig c = new ig();
    private final cah.b d;
    private final boolean e;

    public ie(cah.b $$0) {
        this($$0, false);
    }

    public ie(cah.b $$0, boolean $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public cfz a(gv $$0, cfz $$1) {
        void $$11;
        ha $$2 = $$0.e().c(cro.a);
        aif $$3 = $$0.g();
        double $$4 = 0.5625 + (double)bfn.k.k() / 2.0;
        double $$5 = $$0.a() + (double)$$2.j() * $$4;
        double $$6 = $$0.b() + (double)((float)$$2.k() * 1.125f);
        double $$7 = $$0.c() + (double)$$2.l() * $$4;
        gu $$8 = $$0.d().a($$2);
        if ($$3.b_($$8).a(anb.a)) {
            double $$9 = 1.0;
        } else if ($$3.a_($$8).i() && $$3.b_($$8.d()).a(anb.a)) {
            double $$10 = 0.0;
        } else {
            return this.c.dispense($$0, $$1);
        }
        cah $$12 = this.e ? new cai($$3, $$5, $$6 + $$11, $$7) : new cah($$3, $$5, $$6 + $$11, $$7);
        $$12.a(this.d);
        $$12.a_($$2.p());
        $$3.b($$12);
        $$1.h(1);
        return $$1;
    }

    @Override
    protected void a(gv $$0) {
        $$0.g().c(1000, $$0.d(), 0);
    }
}

