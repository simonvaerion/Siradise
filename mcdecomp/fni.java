/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 */
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;

public class fni
implements fnd.a {
    private final enn a;
    private static final int b = 10;

    public fni(enn $$0) {
        this.a = $$0;
    }

    @Override
    public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
        few $$5 = this.a.s;
        gu $$6 = gu.a($$2, $$3, $$4);
        LongOpenHashSet $$7 = new LongOpenHashSet();
        for (gu $$8 : gu.a($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
            int $$9 = $$5.a(cmv.a, $$8);
            float $$10 = (float)(15 - $$9) / 15.0f * 0.5f + 0.16f;
            int $$11 = apa.h($$10, 0.9f, 0.9f);
            long $$12 = hx.e($$8.a());
            if ($$7.add($$12)) {
                fnd.a($$0, $$1, $$5.J().p().a(cmv.a, hx.a($$12)), (double)hx.a(hx.b($$12), 8), (double)hx.a(hx.c($$12), 8), (double)hx.a(hx.d($$12), 8), 0xFF0000, 0.3f);
            }
            if ($$9 == 15) continue;
            fnd.a($$0, $$1, String.valueOf($$9), (double)$$8.u() + 0.5, (double)$$8.v() + 0.25, (double)$$8.w() + 0.5, $$11);
        }
    }
}

