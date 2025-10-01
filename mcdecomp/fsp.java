/*
 * Decompiled with CFR 0.152.
 */
public class fsp<T extends bfz, M extends fbf<T>>
extends ftg<T, M> {
    private static final acq a = new acq("textures/entity/elytra.png");
    private final fbc<T> b;

    public fsp(fqt<T, M> $$0, fea $$1) {
        super($$0);
        this.b = new fbc($$1.a(fed.Q));
    }

    @Override
    public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
        acq $$15;
        cfz $$10 = ((bfz)$$3).c(bfo.e);
        if (!$$10.a(cgc.nh)) {
            return;
        }
        if ($$3 instanceof fiv) {
            fiv $$11 = (fiv)$$3;
            if ($$11.h() && $$11.i() != null) {
                acq $$12 = $$11.i();
            } else if ($$11.a() && $$11.e() != null && $$11.a(byp.a)) {
                acq $$13 = $$11.e();
            } else {
                acq $$14 = a;
            }
        } else {
            $$15 = a;
        }
        $$0.a();
        $$0.a(0.0f, 0.0f, 0.125f);
        ((fbf)this.c()).a(this.b);
        this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
        ein $$16 = fpw.a($$1, fkf.a($$15), false, $$10.B());
        this.b.a($$0, $$16, $$2, fum.d, 1.0f, 1.0f, 1.0f, 1.0f);
        $$0.b();
    }
}

