/*
 * Decompiled with CFR 0.152.
 */
public class ftt<T extends bfz>
extends fsk<T, fdt<T>> {
    public ftt(fqt<T, fdt<T>> $$0, fjt $$1) {
        super($$0, $$1);
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        cfz $$10 = ((bfz)$$3).eO();
        $$0.a();
        if ($$10.a(cgc.rv)) {
            ((fdt)this.c()).d().a($$0);
            ((fdt)this.c()).e().a($$0);
            $$0.a(0.0625f, 0.25f, 0.0f);
            $$0.a(a.f.rotationDegrees(180.0f));
            $$0.a(a.b.rotationDegrees(140.0f));
            $$0.a(a.f.rotationDegrees(10.0f));
            $$0.a(0.0f, -0.4f, 0.4f);
        }
        super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
        $$0.b();
    }
}

