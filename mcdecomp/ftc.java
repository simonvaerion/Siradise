/*
 * Decompiled with CFR 0.152.
 */
public class ftc
extends ftg<bsa, fce<bsa>> {
    private final fjt a;

    public ftc(fqt<bsa, fce<bsa>> $$0, fjt $$1) {
        super($$0);
        this.a = $$1;
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, bsa $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        cfz $$10 = $$3.c(bfo.a);
        if (!$$3.w() || $$3.gq()) {
            return;
        }
        float $$11 = -0.6f;
        float $$12 = 1.4f;
        if ($$3.ge()) {
            $$11 -= 0.2f * apa.a($$7 * 0.6f) + 0.2f;
            $$12 -= 0.09f * apa.a($$7 * 0.6f);
        }
        $$0.a();
        $$0.a(0.1f, $$12, $$11);
        this.a.a($$3, $$10, cfw.h, false, $$0, $$1, $$2);
        $$0.b();
    }
}

