/*
 * Decompiled with CFR 0.152.
 */
public class ftl
extends ftg<bsj, fdf<bsj>> {
    private final fko a;
    private final fpw b;

    public ftl(fqt<bsj, fdf<bsj>> $$0, fko $$1, fpw $$2) {
        super($$0);
        this.a = $$1;
        this.b = $$2;
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, bsj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        boolean $$10;
        if (!$$3.r()) {
            return;
        }
        boolean bl2 = $$10 = enn.N().b($$3) && $$3.cb();
        if ($$3.cb() && !$$10) {
            return;
        }
        $$0.a();
        ((fdf)this.c()).c().a($$0);
        float $$11 = 0.625f;
        $$0.a(0.0f, -0.34375f, 0.0f);
        $$0.a(a.d.rotationDegrees(180.0f));
        $$0.b(0.625f, -0.625f, -0.625f);
        cfz $$12 = new cfz(cpo.ef);
        if ($$10) {
            dcb $$13 = cpo.ef.n();
            fwr $$14 = this.a.a($$13);
            int $$15 = fpz.c($$3, 0.0f);
            $$0.a(-0.5f, -0.5f, -0.5f);
            this.a.b().a($$0.c(), $$1.getBuffer(fkf.p(fuu.e)), $$13, $$14, 0.0f, 0.0f, 0.0f, $$2, $$15);
        } else {
            this.b.a($$3, $$12, cfw.f, false, $$0, $$1, $$3.dI(), $$2, fpz.c($$3, 0.0f), $$3.af());
        }
        $$0.b();
    }
}

