/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cdu
extends cfu {
    public static final int a = 3;
    public static final int b = 1;
    public static final int c = 3;

    public cdu(cfu.a $$0) {
        super($$0);
    }

    @Override
    public bdx a(cij $$0) {
        cmm $$1 = $$0.q();
        gu $$2 = $$0.a();
        gu $$3 = $$2.a($$0.k());
        if (cdu.a($$0.n(), $$1, $$2)) {
            if (!$$1.B) {
                $$1.c(1505, $$2, 0);
            }
            return bdx.a($$1.B);
        }
        dcb $$4 = $$1.a_($$2);
        boolean $$5 = $$4.d($$1, $$2, $$0.k());
        if ($$5 && cdu.a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
                $$1.c(1505, $$3, 0);
            }
            return bdx.a($$1.B);
        }
        return bdx.d;
    }

    public static boolean a(cfz $$0, cmm $$1, gu $$2) {
        cpp $$4;
        dcb $$3 = $$1.a_($$2);
        if ($$3.b() instanceof cpp && ($$4 = (cpp)((Object)$$3.b())).a((cmp)$$1, $$2, $$3, $$1.B)) {
            if ($$1 instanceof aif) {
                if ($$4.a($$1, $$1.z, $$2, $$3)) {
                    $$4.a((aif)$$1, $$1.z, $$2, $$3);
                }
                $$0.h(1);
            }
            return true;
        }
        return false;
    }

    public static boolean a(cfz $$02, cmm $$12, gu $$2, @Nullable ha $$3) {
        if (!$$12.a_($$2).a(cpo.G) || $$12.b_($$2).e() != 8) {
            return false;
        }
        if (!($$12 instanceof aif)) {
            return true;
        }
        apf $$4 = $$12.y_();
        block0: for (int $$5 = 0; $$5 < 128; ++$$5) {
            gu $$6 = $$2;
            dcb $$7 = cpo.bw.n();
            for (int $$8 = 0; $$8 < $$5 / 16; ++$$8) {
                if ($$12.a_($$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1)).r($$12, $$6)) continue block0;
            }
            he<cnk> $$9 = $$12.s($$6);
            if ($$9.a(amv.ab)) {
                if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                    $$7 = jb.f.b(amw.ap).flatMap($$1 -> $$1.a($$0.z)).map($$0 -> ((cpn)$$0.a()).n()).orElse($$7);
                    if ($$7.b(coz.a)) {
                        $$7 = (dcb)$$7.a(coz.a, $$3);
                    }
                } else if ($$4.a(4) == 0) {
                    $$7 = jb.f.b(amw.an).flatMap($$1 -> $$1.a($$0.z)).map($$0 -> ((cpn)$$0.a()).n()).orElse($$7);
                }
            }
            if ($$7.a(amw.ap, (dca.a $$0) -> $$0.b(coz.a))) {
                for (int $$10 = 0; !$$7.a((cmp)$$12, $$6) && $$10 < 4; ++$$10) {
                    $$7 = (dcb)$$7.a(coz.a, ha.c.a.a($$4));
                }
            }
            if (!$$7.a((cmp)$$12, $$6)) continue;
            dcb $$11 = $$12.a_($$6);
            if ($$11.a(cpo.G) && $$12.b_($$6).e() == 8) {
                $$12.a($$6, $$7, 3);
                continue;
            }
            if (!$$11.a(cpo.bw) || $$4.a(10) != 0) continue;
            ((cpp)((Object)cpo.bw)).a((aif)$$12, $$4, $$6, $$11);
        }
        $$02.h(1);
        return true;
    }

    public static void a(cmn $$0, gu $$1, int $$2) {
        double $$7;
        dcb $$3;
        if ($$2 == 0) {
            $$2 = 15;
        }
        if (($$3 = $$0.a_($$1)).i()) {
            return;
        }
        double $$4 = 0.5;
        if ($$3.a(cpo.G)) {
            $$2 *= 3;
            double $$5 = 1.0;
            $$4 = 3.0;
        } else if ($$3.i($$0, $$1)) {
            $$1 = $$1.c();
            $$2 *= 3;
            $$4 = 3.0;
            double $$6 = 1.0;
        } else {
            $$7 = $$3.j($$0, $$1).c(ha.a.b);
        }
        $$0.a(iv.K, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
        apf $$8 = $$0.y_();
        for (int $$9 = 0; $$9 < $$2; ++$$9) {
            double $$16;
            double $$15;
            double $$10 = $$8.k() * 0.02;
            double $$11 = $$8.k() * 0.02;
            double $$12 = $$8.k() * 0.02;
            double $$13 = 0.5 - $$4;
            double $$14 = (double)$$1.u() + $$13 + $$8.j() * $$4 * 2.0;
            if ($$0.a_(gu.a($$14, $$15 = (double)$$1.v() + $$8.j() * $$7, $$16 = (double)$$1.w() + $$13 + $$8.j() * $$4 * 2.0).d()).i()) continue;
            $$0.a(iv.K, $$14, $$15, $$16, $$10, $$11, $$12);
        }
    }
}

