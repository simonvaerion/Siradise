/*
 * Decompiled with CFR 0.152.
 */
public class ftb<T extends bry>
extends ftg<T, fay<T>> {
    private final fko a;

    public ftb(fqt<T, fay<T>> $$0, fko $$1) {
        super($$0);
        this.a = $$1;
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        boolean $$11;
        if (((bfe)$$3).h_()) {
            return;
        }
        enn $$10 = enn.N();
        boolean bl2 = $$11 = $$10.b((bfj)$$3) && ((bfj)$$3).cb();
        if (((bfj)$$3).cb() && !$$11) {
            return;
        }
        dcb $$12 = ((bry)$$3).r().a();
        int $$13 = fpz.c($$3, 0.0f);
        fwr $$14 = this.a.a($$12);
        $$0.a();
        $$0.a(0.2f, -0.35f, 0.5f);
        $$0.a(a.d.rotationDegrees(-48.0f));
        $$0.b(-1.0f, -1.0f, 1.0f);
        $$0.a(-0.5f, -0.5f, -0.5f);
        this.a($$0, $$1, $$2, $$11, $$12, $$13, $$14);
        $$0.b();
        $$0.a();
        $$0.a(0.2f, -0.35f, 0.5f);
        $$0.a(a.d.rotationDegrees(42.0f));
        $$0.a(0.1f, 0.0f, -0.6f);
        $$0.a(a.d.rotationDegrees(-48.0f));
        $$0.b(-1.0f, -1.0f, 1.0f);
        $$0.a(-0.5f, -0.5f, -0.5f);
        this.a($$0, $$1, $$2, $$11, $$12, $$13, $$14);
        $$0.b();
        $$0.a();
        ((fay)this.c()).d().a($$0);
        $$0.a(0.0f, -0.7f, -0.2f);
        $$0.a(a.d.rotationDegrees(-78.0f));
        $$0.b(-1.0f, -1.0f, 1.0f);
        $$0.a(-0.5f, -0.5f, -0.5f);
        this.a($$0, $$1, $$2, $$11, $$12, $$13, $$14);
        $$0.b();
    }

    private void a(eij $$0, fjx $$1, int $$2, boolean $$3, dcb $$4, int $$5, fwr $$6) {
        if ($$3) {
            this.a.b().a($$0.c(), $$1.getBuffer(fkf.p(fuu.e)), $$4, $$6, 0.0f, 0.0f, 0.0f, $$2, $$5);
        } else {
            this.a.a($$4, $$0, $$1, $$2, $$5);
        }
    }
}

