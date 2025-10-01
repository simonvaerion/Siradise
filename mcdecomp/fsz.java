/*
 * Decompiled with CFR 0.152.
 */
public class fsz<T extends bfz, M extends fbf<T>>
extends ftg<T, M> {
    private final fjt a;

    public fsz(fqt<T, M> $$0, fjt $$1) {
        super($$0);
        this.a = $$1;
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        cfz $$12;
        boolean $$10 = ((bfz)$$3).fh() == bft.b;
        cfz $$11 = $$10 ? ((bfz)$$3).eP() : ((bfz)$$3).eO();
        cfz cfz2 = $$12 = $$10 ? ((bfz)$$3).eO() : ((bfz)$$3).eP();
        if ($$11.b() && $$12.b()) {
            return;
        }
        $$0.a();
        if (((fbf)this.c()).e) {
            float $$13 = 0.5f;
            $$0.a(0.0f, 0.75f, 0.0f);
            $$0.b(0.5f, 0.5f, 0.5f);
        }
        this.a((bfz)$$3, $$12, cfw.c, bft.b, $$0, $$1, $$2);
        this.a((bfz)$$3, $$11, cfw.b, bft.a, $$0, $$1, $$2);
        $$0.b();
    }

    protected void a(bfz $$0, cfz $$1, cfw $$2, bft $$3, eij $$4, fjx $$5, int $$6) {
        if ($$1.b()) {
            return;
        }
        $$4.a();
        ((fag)this.c()).a($$3, $$4);
        $$4.a(a.b.rotationDegrees(-90.0f));
        $$4.a(a.d.rotationDegrees(180.0f));
        boolean $$7 = $$3 == bft.a;
        $$4.a((float)($$7 ? -1 : 1) / 16.0f, 0.125f, -0.625f);
        this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
        $$4.b();
    }
}

