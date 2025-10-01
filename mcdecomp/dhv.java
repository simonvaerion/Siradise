/*
 * Decompiled with CFR 0.152.
 */
public class dhv
implements clz {
    private int a;

    @Override
    public int a(aif $$0, boolean $$1, boolean $$2) {
        if (!$$1) {
            return 0;
        }
        if (!$$0.X().b(cmi.G)) {
            return 0;
        }
        apf $$3 = $$0.z;
        --this.a;
        if (this.a > 0) {
            return 0;
        }
        this.a += 12000 + $$3.a(1200);
        long $$4 = $$0.W() / 24000L;
        if ($$4 < 5L || !$$0.N()) {
            return 0;
        }
        if ($$3.a(5) != 0) {
            return 0;
        }
        int $$5 = $$0.v().size();
        if ($$5 < 1) {
            return 0;
        }
        byo $$6 = $$0.v().get($$3.a($$5));
        if ($$6.G_()) {
            return 0;
        }
        if ($$0.a($$6.di(), 2)) {
            return 0;
        }
        int $$7 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
        int $$8 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
        gu.a $$9 = $$6.di().j().e($$7, 0, $$8);
        int $$10 = 10;
        if (!$$0.b($$9.u() - 10, $$9.w() - 10, $$9.u() + 10, $$9.w() + 10)) {
            return 0;
        }
        he<cnk> $$11 = $$0.s($$9);
        if ($$11.a(amv.af)) {
            return 0;
        }
        int $$12 = 0;
        int $$13 = (int)Math.ceil($$0.d_($$9).b()) + 1;
        for (int $$14 = 0; $$14 < $$13; ++$$14) {
            ++$$12;
            $$9.q($$0.a(dhk.a.f, (gu)$$9).v());
            if ($$14 == 0) {
                if (!this.a($$0, $$9, $$3, true)) {
                    break;
                }
            } else {
                this.a($$0, $$9, $$3, false);
            }
            $$9.p($$9.u() + $$3.a(5) - $$3.a(5));
            $$9.r($$9.w() + $$3.a(5) - $$3.a(5));
        }
        return $$12;
    }

    private boolean a(aif $$0, gu $$1, apf $$2, boolean $$3) {
        dcb $$4 = $$0.a_($$1);
        if (!cmx.a($$0, $$1, $$4, $$4.u(), bfn.ay)) {
            return false;
        }
        if (!bwd.b(bfn.ay, (cmn)$$0, bgd.p, $$1, $$2)) {
            return false;
        }
        bwd $$5 = bfn.ay.a($$0);
        if ($$5 != null) {
            if ($$3) {
                $$5.w(true);
                $$5.gg();
            }
            $$5.e($$1.u(), $$1.v(), $$1.w());
            $$5.a($$0, $$0.d_($$1), bgd.p, null, null);
            $$0.a_($$5);
            return true;
        }
        return false;
    }
}

