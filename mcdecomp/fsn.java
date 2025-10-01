/*
 * Decompiled with CFR 0.152.
 */
public class fsn
extends ftg<brt, fba<brt>> {
    private final fjt a;

    public fsn(fqt<brt, fba<brt>> $$0, fjt $$1) {
        super($$0);
        this.a = $$1;
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, brt $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        boolean $$10 = $$3.fh() == bft.b;
        $$0.a();
        float $$11 = 1.0f;
        float $$12 = -1.0f;
        float $$13 = apa.e($$3.dA()) / 60.0f;
        if ($$3.dA() < 0.0f) {
            $$0.a(0.0f, 1.0f - $$13 * 0.5f, -1.0f + $$13 * 0.5f);
        } else {
            $$0.a(0.0f, 1.0f + $$13 * 0.8f, -1.0f + $$13 * 0.2f);
        }
        cfz $$14 = $$10 ? $$3.eO() : $$3.eP();
        this.a.a($$3, $$14, cfw.h, false, $$0, $$1, $$2);
        $$0.b();
    }
}

