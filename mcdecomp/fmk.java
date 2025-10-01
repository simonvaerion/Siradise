/*
 * Decompiled with CFR 0.152.
 */
public class fmk
implements flu<daz> {
    private final fow a;

    public fmk(flv.a $$0) {
        this.a = $$0.c();
    }

    @Override
    public void a(daz $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
        $$2.a();
        $$2.a(0.5f, 0.0f, 0.5f);
        clo $$6 = $$0.d();
        bfj $$7 = $$6.a($$0.k(), $$0.k().y_(), $$0.p());
        if ($$7 != null) {
            float $$8 = 0.53125f;
            float $$9 = Math.max($$7.dd(), $$7.de());
            if ((double)$$9 > 1.0) {
                $$8 /= $$9;
            }
            $$2.a(0.0f, 0.4f, 0.0f);
            $$2.a(a.d.rotationDegrees((float)apa.d((double)$$1, $$6.b(), $$6.a()) * 10.0f));
            $$2.a(0.0f, -0.2f, 0.0f);
            $$2.a(a.b.rotationDegrees(-30.0f));
            $$2.b($$8, $$8, $$8);
            this.a.a($$7, 0.0, 0.0, 0.0, 0.0f, $$1, $$2, $$3, $$4);
        }
        $$2.b();
    }
}

