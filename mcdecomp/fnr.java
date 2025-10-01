/*
 * Decompiled with CFR 0.152.
 */
public class fnr
implements fnd.a {
    private final enn a;

    public fnr(enn $$0) {
        this.a = $$0;
    }

    @Override
    public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
        gu $$5 = this.a.t.di();
        cmm $$6 = this.a.t.dI();
        for (gu $$7 : gu.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
            dxe $$8 = $$6.b_($$7);
            if (!$$8.a(anb.a)) continue;
            double $$9 = (float)$$7.v() + $$8.a((cls)$$6, $$7);
            fnd.a($$0, $$1, new eed((float)$$7.u() + 0.01f, (float)$$7.v() + 0.01f, (float)$$7.w() + 0.01f, (float)$$7.u() + 0.99f, $$9, (float)$$7.w() + 0.99f).d(-$$2, -$$3, -$$4), 0.0f, 1.0f, 0.0f, 0.15f);
        }
        for (gu $$10 : gu.a($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
            dxe $$11 = $$6.b_($$10);
            if (!$$11.a(anb.a)) continue;
            fnd.a($$0, $$1, String.valueOf($$11.e()), (double)$$10.u() + 0.5, (double)((float)$$10.v() + $$11.a((cls)$$6, $$10)), (double)$$10.w() + 0.5, -16777216);
        }
    }
}

