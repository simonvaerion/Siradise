/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class djs
extends dko<dnc> {
    private static final dcb a = (dcb)((dcb)((dcb)cpo.mZ.n().a(cos.g, 1)).a(cos.h, dcn.a)).a(cos.i, 0);
    private static final dcb b = (dcb)((dcb)a.a(cos.h, dcn.c)).a(cos.i, 1);
    private static final dcb c = (dcb)a.a(cos.h, dcn.c);
    private static final dcb d = (dcb)a.a(cos.h, dcn.b);

    public djs(Codec<dnc> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dnc> $$0) {
        int $$1 = 0;
        gu $$2 = $$0.e();
        cng $$3 = $$0.b();
        apf $$4 = $$0.d();
        dnc $$5 = $$0.f();
        gu.a $$6 = $$2.j();
        gu.a $$7 = $$2.j();
        if ($$3.t($$6)) {
            if (cpo.mZ.n().a($$3, (gu)$$6)) {
                int $$8 = $$4.a(12) + 5;
                if ($$4.i() < $$5.l) {
                    int $$9 = $$4.a(4) + 1;
                    for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; ++$$10) {
                        for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; ++$$11) {
                            int $$13;
                            int $$12 = $$10 - $$2.u();
                            if ($$12 * $$12 + ($$13 = $$11 - $$2.w()) * $$13 > $$9 * $$9) continue;
                            $$7.d($$10, $$3.a(dhk.a.b, $$10, $$11) - 1, $$11);
                            if (!djs.b($$3.a_($$7))) continue;
                            $$3.a((gu)$$7, cpo.l.n(), 2);
                        }
                    }
                }
                for (int $$14 = 0; $$14 < $$8 && $$3.t($$6); ++$$14) {
                    $$3.a((gu)$$6, a, 2);
                    $$6.c(ha.b, 1);
                }
                if ($$6.v() - $$2.v() >= 3) {
                    $$3.a((gu)$$6, b, 2);
                    $$3.a((gu)$$6.c(ha.a, 1), c, 2);
                    $$3.a((gu)$$6.c(ha.a, 1), d, 2);
                }
            }
            ++$$1;
        }
        return $$1 > 0;
    }
}

