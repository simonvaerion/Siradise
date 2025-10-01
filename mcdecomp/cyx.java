/*
 * Decompiled with CFR 0.152.
 */
public class cyx
extends cpn {
    protected cyx(dca.d $$0) {
        super($$0);
    }

    @Override
    public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$1.x_().i()) {
            $$1.a($$2, cpo.aO.n(), 3);
            $$1.c(2009, $$2, 0);
            $$1.a(null, $$2, amh.hN, ami.e, 1.0f, (1.0f + $$1.y_().i() * 0.2f) * 0.7f);
        }
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
        ha $$4 = ha.b($$3);
        if ($$4 == ha.b) {
            return;
        }
        gu $$5 = $$2.a($$4);
        dcb $$6 = $$1.a_($$5);
        if ($$0.p() && $$6.d($$1, $$5, $$4.g())) {
            return;
        }
        double $$7 = $$2.u();
        double $$8 = $$2.v();
        double $$9 = $$2.w();
        if ($$4 == ha.a) {
            $$8 -= 0.05;
            $$7 += $$3.j();
            $$9 += $$3.j();
        } else {
            $$8 += $$3.j() * 0.8;
            if ($$4.o() == ha.a.a) {
                $$9 += $$3.j();
                $$7 = $$4 == ha.f ? ($$7 += 1.1) : ($$7 += 0.05);
            } else {
                $$7 += $$3.j();
                $$9 = $$4 == ha.d ? ($$9 += 1.1) : ($$9 += 0.05);
            }
        }
        $$1.a(iv.m, $$7, $$8, $$9, 0.0, 0.0, 0.0);
    }
}

