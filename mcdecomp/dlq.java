/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public class dlq
extends dko<dni> {
    public dlq(Codec<dni> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dni> $$0) {
        gu $$2;
        cng $$1 = $$0.b();
        if (!$$1.a_($$2 = $$0.e()).i()) {
            return false;
        }
        apf $$3 = $$0.d();
        gu $$4 = $$0.e();
        dni $$5 = $$0.f();
        gu.a $$6 = $$4.j();
        if (dlq.a($$1, $$0.c(), $$5, $$3, $$6, $$4)) {
            dlq.a($$1, $$5, $$3, $$4, $$6);
        }
        return true;
    }

    private static boolean a(cng $$0, dni $$1, gu $$2) {
        gu.a $$3 = $$2.j();
        for (int $$4 = 1; $$4 <= $$1.c; ++$$4) {
            $$3.c(ha.b);
            dcb $$5 = $$0.a_($$3);
            if (dlq.a($$5, $$4, $$1.n)) continue;
            return false;
        }
        return true;
    }

    private static boolean a(dcb $$0, int $$1, int $$2) {
        if ($$0.i()) {
            return true;
        }
        int $$3 = $$1 + 1;
        return $$3 <= $$2 && $$0.u().a(anb.a);
    }

    private static boolean a(cng $$0, ddy $$1, dni $$2, apf $$3, gu.a $$4, gu $$5) {
        for (int $$6 = 0; $$6 < $$2.h; ++$$6) {
            $$4.c(ha.b);
            if (!$$2.o.test($$0, $$4) || !dlq.a($$0, $$2, $$4)) continue;
            gu $$7 = $$4.d();
            if ($$0.b_($$7).a(anb.b) || !$$0.a_($$7).e()) {
                return false;
            }
            if (!$$2.b.a().a($$0, $$1, $$3, $$4)) continue;
            dlq.a($$5, $$5.v() + $$6, $$0, $$2, $$3);
            return true;
        }
        return false;
    }

    private static void a(gu $$0, int $$1, cng $$2, dni $$3, apf $$4) {
        int $$5 = $$0.u();
        int $$6 = $$0.w();
        gu.a $$7 = $$0.j();
        for (int $$8 = $$0.v(); $$8 < $$1; ++$$8) {
            dlq.a($$2, $$3, $$4, $$5, $$6, $$7.d($$5, $$8, $$6));
        }
    }

    private static void a(cng $$0, dni $$12, apf $$2, int $$3, int $$4, gu.a $$5) {
        int $$6 = $$12.d;
        Predicate<dcb> $$7 = $$1 -> $$1.a($$0.e);
        for (int $$8 = 0; $$8 < $$12.g; ++$$8) {
            $$5.a($$5, $$2.a($$6) - $$2.a($$6), 0, $$2.a($$6) - $$2.a($$6));
            if ($$7.test($$0.a_($$5))) {
                $$0.a((gu)$$5, $$12.f.a($$2, $$5), 2);
            }
            $$5.p($$3);
            $$5.r($$4);
        }
    }

    private static void a(cng $$0, dni $$1, apf $$2, gu $$3, gu.a $$4) {
        int $$5 = $$1.i;
        int $$6 = $$1.j;
        for (int $$7 = 0; $$7 < $$1.l; ++$$7) {
            dcb $$8;
            $$4.a($$3, $$2.a($$5) - $$2.a($$5), $$2.a($$6) - $$2.a($$6), $$2.a($$5) - $$2.a($$5));
            if (!$$0.t($$4) || !($$8 = $$1.k.a($$2, $$4)).a($$0, (gu)$$4) || !$$0.a_($$4.c()).d($$0, $$4, ha.a)) continue;
            $$0.a((gu)$$4, $$8, 2);
        }
    }
}

