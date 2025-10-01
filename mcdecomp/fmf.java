/*
 * Decompiled with CFR 0.152.
 */
public class fmf
implements flu<dao> {
    private final fao a;

    public fmf(flv.a $$0) {
        this.a = new fao($$0.a(fed.m));
    }

    @Override
    public void a(dao $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
        dcb $$6 = $$0.q();
        if (!$$6.c(ctv.c).booleanValue()) {
            return;
        }
        $$2.a();
        $$2.a(0.5f, 1.0625f, 0.5f);
        float $$7 = $$6.c(ctv.a).h().p();
        $$2.a(a.d.rotationDegrees(-$$7));
        $$2.a(a.f.rotationDegrees(67.5f));
        $$2.a(0.0f, -0.125f, 0.0f);
        this.a.a(0.0f, 0.1f, 0.9f, 1.2f);
        ein $$8 = fmd.a.a($$3, fkf::b);
        this.a.b($$2, $$8, $$4, $$5, 1.0f, 1.0f, 1.0f, 1.0f);
        $$2.b();
    }
}

