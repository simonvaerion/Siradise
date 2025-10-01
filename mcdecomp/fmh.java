/*
 * Decompiled with CFR 0.152.
 */
public class fmh
implements flu<dau> {
    private final fcy<?> a;

    public fmh(flv.a $$0) {
        this.a = new fcy($$0.a(fed.be));
    }

    @Override
    public void a(dau $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
        fwu $$10;
        cen $$8;
        dcb $$7;
        ha $$6 = ha.b;
        if ($$0.l() && ($$7 = $$0.k().a_($$0.p())).b() instanceof cwm) {
            $$6 = $$7.c(cwm.a);
        }
        if (($$8 = $$0.j()) == null) {
            fwu $$9 = fkj.i;
        } else {
            $$10 = fkj.j.get($$8.a());
        }
        $$2.a();
        $$2.a(0.5f, 0.5f, 0.5f);
        float $$11 = 0.9995f;
        $$2.b(0.9995f, 0.9995f, 0.9995f);
        $$2.a($$6.b());
        $$2.b(1.0f, -1.0f, -1.0f);
        $$2.a(0.0f, -1.0f, 0.0f);
        fee $$12 = this.a.b();
        $$12.a(0.0f, 24.0f - $$0.a($$1) * 0.5f * 16.0f, 0.0f);
        $$12.f = 270.0f * $$0.a($$1) * ((float)Math.PI / 180);
        ein $$13 = $$10.a($$3, fkf::d);
        this.a.a($$2, $$13, $$4, $$5, 1.0f, 1.0f, 1.0f, 1.0f);
        $$2.b();
    }
}

