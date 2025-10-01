/*
 * Decompiled with CFR 0.152.
 */
public class frn
extends fox<bvi> {
    private final fko a;

    public frn(foy.a $$0) {
        super($$0);
        this.d = 0.5f;
        this.a = $$0.c();
    }

    @Override
    public void a(bvi $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
        $$3.a();
        $$3.a(0.0f, 0.5f, 0.0f);
        int $$6 = $$0.k();
        if ((float)$$6 - $$2 + 1.0f < 10.0f) {
            float $$7 = 1.0f - ((float)$$6 - $$2 + 1.0f) / 10.0f;
            $$7 = apa.a($$7, 0.0f, 1.0f);
            $$7 *= $$7;
            $$7 *= $$7;
            float $$8 = 1.0f + $$7 * 0.3f;
            $$3.b($$8, $$8, $$8);
        }
        $$3.a(a.d.rotationDegrees(-90.0f));
        $$3.a(-0.5f, -0.5f, 0.5f);
        $$3.a(a.d.rotationDegrees(90.0f));
        frm.a(this.a, cpo.ck.n(), $$3, $$4, $$5, $$6 / 5 % 2 == 0);
        $$3.b();
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public acq a(bvi $$0) {
        return fuu.e;
    }
}

