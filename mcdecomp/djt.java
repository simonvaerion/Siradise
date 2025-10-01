/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class djt
extends dko<dmm> {
    private static final ImmutableList<cpn> a = ImmutableList.of((Object)cpo.H, (Object)cpo.F, (Object)cpo.kJ, (Object)cpo.dX, (Object)cpo.fn, (Object)cpo.fo, (Object)cpo.fp, (Object)cpo.fq, (Object)cpo.cv, (Object)cpo.ct);
    private static final int b = 5;
    private static final int c = 50;
    private static final int d = 8;
    private static final int an = 15;

    public djt(Codec<dmm> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dmm> $$0) {
        int $$1 = $$0.c().e();
        gu $$2 = $$0.e();
        cng $$3 = $$0.b();
        apf $$4 = $$0.d();
        dmm $$5 = $$0.f();
        if (!djt.a((cmn)$$3, $$1, $$2.j())) {
            return false;
        }
        int $$6 = $$5.b().a($$4);
        boolean $$7 = $$4.i() < 0.9f;
        int $$8 = Math.min($$6, $$7 ? 5 : 8);
        int $$9 = $$7 ? 50 : 15;
        boolean $$10 = false;
        for (gu $$11 : gu.a($$4, $$9, $$2.u() - $$8, $$2.v(), $$2.w() - $$8, $$2.u() + $$8, $$2.v(), $$2.w() + $$8)) {
            int $$12 = $$6 - $$11.k($$2);
            if ($$12 < 0) continue;
            $$10 |= this.a($$3, $$1, $$11, $$12, $$5.a().a($$4));
        }
        return $$10;
    }

    private boolean a(cmn $$0, int $$1, gu $$2, int $$3, int $$4) {
        boolean $$5 = false;
        block0: for (gu $$6 : gu.b($$2.u() - $$4, $$2.v(), $$2.w() - $$4, $$2.u() + $$4, $$2.v(), $$2.w() + $$4)) {
            gu $$8;
            int $$7 = $$6.k($$2);
            gu gu2 = $$8 = djt.a($$0, $$1, $$6) ? djt.a($$0, $$1, $$6.j(), $$7) : djt.a($$0, $$6.j(), $$7);
            if ($$8 == null) continue;
            gu.a $$10 = $$8.j();
            for (int $$9 = $$3 - $$7 / 2; $$9 >= 0; --$$9) {
                if (djt.a($$0, $$1, (gu)$$10)) {
                    this.a($$0, $$10, cpo.dZ.n());
                    $$10.c(ha.b);
                    $$5 = true;
                    continue;
                }
                if (!$$0.a_($$10).a(cpo.dZ)) continue block0;
                $$10.c(ha.b);
            }
        }
        return $$5;
    }

    @Nullable
    private static gu a(cmn $$0, int $$1, gu.a $$2, int $$3) {
        while ($$2.v() > $$0.C_() + 1 && $$3 > 0) {
            --$$3;
            if (djt.a($$0, $$1, $$2)) {
                return $$2;
            }
            $$2.c(ha.a);
        }
        return null;
    }

    private static boolean a(cmn $$0, int $$1, gu.a $$2) {
        if (djt.a($$0, $$1, (gu)$$2)) {
            dcb $$3 = $$0.a_($$2.c(ha.a));
            $$2.c(ha.b);
            return !$$3.i() && !a.contains((Object)$$3.b());
        }
        return false;
    }

    @Nullable
    private static gu a(cmn $$0, gu.a $$1, int $$2) {
        while ($$1.v() < $$0.aj() && $$2 > 0) {
            --$$2;
            dcb $$3 = $$0.a_($$1);
            if (a.contains((Object)$$3.b())) {
                return null;
            }
            if ($$3.i()) {
                return $$1;
            }
            $$1.c(ha.b);
        }
        return null;
    }

    private static boolean a(cmn $$0, int $$1, gu $$2) {
        dcb $$3 = $$0.a_($$2);
        return $$3.i() || $$3.a(cpo.H) && $$2.v() <= $$1;
    }
}

