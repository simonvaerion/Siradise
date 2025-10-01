/*
 * Decompiled with CFR 0.152.
 */
public class fmd
implements flu<dag> {
    public static final fwu a = new fwu(fuu.e, new acq("entity/enchanting_table_book"));
    private final fao b;

    public fmd(flv.a $$0) {
        this.b = new fao($$0.a(fed.m));
    }

    @Override
    public void a(dag $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
        float $$7;
        $$2.a();
        $$2.a(0.5f, 0.75f, 0.5f);
        float $$6 = (float)$$0.a + $$1;
        $$2.a(0.0f, 0.1f + apa.a($$6 * 0.1f) * 0.01f, 0.0f);
        for ($$7 = $$0.h - $$0.i; $$7 >= (float)Math.PI; $$7 -= (float)Math.PI * 2) {
        }
        while ($$7 < (float)(-Math.PI)) {
            $$7 += (float)Math.PI * 2;
        }
        float $$8 = $$0.i + $$7 * $$1;
        $$2.a(a.d.rotation(-$$8));
        $$2.a(a.f.rotationDegrees(80.0f));
        float $$9 = apa.i($$1, $$0.c, $$0.b);
        float $$10 = apa.h($$9 + 0.25f) * 1.6f - 0.3f;
        float $$11 = apa.h($$9 + 0.75f) * 1.6f - 0.3f;
        float $$12 = apa.i($$1, $$0.g, $$0.f);
        this.b.a($$6, apa.a($$10, 0.0f, 1.0f), apa.a($$11, 0.0f, 1.0f), $$12);
        ein $$13 = a.a($$3, fkf::b);
        this.b.b($$2, $$13, $$4, $$5, 1.0f, 1.0f, 1.0f, 1.0f);
        $$2.b();
    }
}

