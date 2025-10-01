/*
 * Decompiled with CFR 0.152.
 */
public class fsm
extends ftg<fiv, fck<fiv>> {
    public fsm(fqt<fiv, fck<fiv>> $$0) {
        super($$0);
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, fiv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        if (!"deadmau5".equals($$3.Z().getString()) || !$$3.c() || $$3.cb()) {
            return;
        }
        ein $$10 = $$1.getBuffer(fkf.b($$3.d()));
        int $$11 = fpz.c($$3, 0.0f);
        for (int $$12 = 0; $$12 < 2; ++$$12) {
            float $$13 = apa.i($$6, $$3.M, $$3.dy()) - apa.i($$6, $$3.aW, $$3.aV);
            float $$14 = apa.i($$6, $$3.N, $$3.dA());
            $$0.a();
            $$0.a(a.d.rotationDegrees($$13));
            $$0.a(a.b.rotationDegrees($$14));
            $$0.a(0.375f * (float)($$12 * 2 - 1), 0.0f, 0.0f);
            $$0.a(0.0f, -0.375f, 0.0f);
            $$0.a(a.b.rotationDegrees(-$$14));
            $$0.a(a.d.rotationDegrees(-$$13));
            float $$15 = 1.3333334f;
            $$0.b(1.3333334f, 1.3333334f, 1.3333334f);
            ((fck)this.c()).a($$0, $$10, $$2, $$11);
            $$0.b();
        }
    }
}

