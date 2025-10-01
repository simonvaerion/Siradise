/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 */
import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class flr
implements flu<czj> {
    private final fee a;
    private final fee b;

    public flr(flv.a $$0) {
        this.a = $$0.a(fed.i);
        this.b = $$0.a(fed.h);
    }

    public static fek b() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("main", fej.c().a(0, 0).a(0.0f, 0.0f, 0.0f, 16.0f, 16.0f, 6.0f), feg.a);
        $$1.a("left_leg", fej.c().a(50, 6).a(0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 3.0f), feg.b(1.5707964f, 0.0f, 1.5707964f));
        $$1.a("right_leg", fej.c().a(50, 18).a(-16.0f, 6.0f, 0.0f, 3.0f, 3.0f, 3.0f), feg.b(1.5707964f, 0.0f, (float)Math.PI));
        return fek.a($$0, 64, 64);
    }

    public static fek c() {
        fem $$0 = new fem();
        fen $$1 = $$0.a();
        $$1.a("main", fej.c().a(0, 22).a(0.0f, 0.0f, 0.0f, 16.0f, 16.0f, 6.0f), feg.a);
        $$1.a("left_leg", fej.c().a(50, 0).a(0.0f, 6.0f, -16.0f, 3.0f, 3.0f, 3.0f), feg.b(1.5707964f, 0.0f, 0.0f));
        $$1.a("right_leg", fej.c().a(50, 12).a(-16.0f, 6.0f, -16.0f, 3.0f, 3.0f, 3.0f), feg.b(1.5707964f, 0.0f, 4.712389f));
        return fek.a($$0, 64, 64);
    }

    @Override
    public void a(czj $$02, float $$12, eij $$2, fjx $$3, int $$4, int $$5) {
        fwu $$6 = fkj.p[$$02.d().a()];
        cmm $$7 = $$02.k();
        if ($$7 != null) {
            dcb $$8 = $$02.q();
            crq.c<czj> $$9 = crq.a(czp.y, cpg::h, cpg::g, cqp.b, $$8, $$7, $$02.p(), ($$0, $$1) -> false);
            int $$10 = ((Int2IntFunction)$$9.apply(new flx())).get($$4);
            this.a($$2, $$3, $$8.c(cpg.a) == dco.a ? this.a : this.b, $$8.c(cpg.aC), $$6, $$10, $$5, false);
        } else {
            this.a($$2, $$3, this.a, ha.d, $$6, $$4, $$5, false);
            this.a($$2, $$3, this.b, ha.d, $$6, $$4, $$5, true);
        }
    }

    private void a(eij $$0, fjx $$1, fee $$2, ha $$3, fwu $$4, int $$5, int $$6, boolean $$7) {
        $$0.a();
        $$0.a(0.0f, 0.5625f, $$7 ? -1.0f : 0.0f);
        $$0.a(a.b.rotationDegrees(90.0f));
        $$0.a(0.5f, 0.5f, 0.5f);
        $$0.a(a.f.rotationDegrees(180.0f + $$3.p()));
        $$0.a(-0.5f, -0.5f, -0.5f);
        ein $$8 = $$4.a($$1, fkf::b);
        $$2.a($$0, $$8, $$5, $$6);
        $$0.b();
    }
}

