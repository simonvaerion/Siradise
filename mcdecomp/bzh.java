/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bzh {
    public static eeg a(bfj $$0, Predicate<bfj> $$1) {
        eei $$2 = $$0.dl();
        cmm $$3 = $$0.dI();
        eei $$4 = $$0.dg();
        return bzh.a($$4, $$0, $$1, $$2, $$3);
    }

    public static eeg a(bfj $$0, Predicate<bfj> $$1, double $$2) {
        eei $$3 = $$0.f(0.0f).a($$2);
        cmm $$4 = $$0.dI();
        eei $$5 = $$0.bm();
        return bzh.a($$5, $$0, $$1, $$3, $$4);
    }

    private static eeg a(eei $$0, bfj $$1, Predicate<bfj> $$2, eei $$3, cmm $$4) {
        eef $$7;
        eei $$5 = $$0.e($$3);
        eeg $$6 = $$4.a(new clv($$0, $$5, clv.a.a, clv.b.a, $$1));
        if (((eeg)$$6).c() != eeg.a.a) {
            $$5 = $$6.e();
        }
        if (($$7 = bzh.a($$4, $$1, $$0, $$5, $$1.cE().b($$3).g(1.0), $$2)) != null) {
            $$6 = $$7;
        }
        return $$6;
    }

    @Nullable
    public static eef a(bfj $$0, eei $$1, eei $$2, eed $$3, Predicate<bfj> $$4, double $$5) {
        cmm $$6 = $$0.dI();
        double $$7 = $$5;
        bfj $$8 = null;
        eei $$9 = null;
        for (bfj $$10 : $$6.a($$0, $$3, $$4)) {
            eei $$13;
            double $$14;
            eed $$11 = $$10.cE().g($$10.bC());
            Optional<eei> $$12 = $$11.b($$1, $$2);
            if ($$11.d($$1)) {
                if (!($$7 >= 0.0)) continue;
                $$8 = $$10;
                $$9 = $$12.orElse($$1);
                $$7 = 0.0;
                continue;
            }
            if (!$$12.isPresent() || !(($$14 = $$1.g($$13 = $$12.get())) < $$7) && $$7 != 0.0) continue;
            if ($$10.cT() == $$0.cT()) {
                if ($$7 != 0.0) continue;
                $$8 = $$10;
                $$9 = $$13;
                continue;
            }
            $$8 = $$10;
            $$9 = $$13;
            $$7 = $$14;
        }
        if ($$8 == null) {
            return null;
        }
        return new eef($$8, $$9);
    }

    @Nullable
    public static eef a(cmm $$0, bfj $$1, eei $$2, eei $$3, eed $$4, Predicate<bfj> $$5) {
        return bzh.a($$0, $$1, $$2, $$3, $$4, $$5, 0.3f);
    }

    @Nullable
    public static eef a(cmm $$0, bfj $$1, eei $$2, eei $$3, eed $$4, Predicate<bfj> $$5, float $$6) {
        double $$7 = Double.MAX_VALUE;
        bfj $$8 = null;
        for (bfj $$9 : $$0.a($$1, $$4, $$5)) {
            double $$12;
            eed $$10 = $$9.cE().g($$6);
            Optional<eei> $$11 = $$10.b($$2, $$3);
            if (!$$11.isPresent() || !(($$12 = $$2.g($$11.get())) < $$7)) continue;
            $$8 = $$9;
            $$7 = $$12;
        }
        if ($$8 == null) {
            return null;
        }
        return new eef($$8);
    }

    public static void a(bfj $$0, float $$1) {
        eei $$2 = $$0.dl();
        if ($$2.g() == 0.0) {
            return;
        }
        double $$3 = $$2.h();
        $$0.a_((float)(apa.d($$2.e, $$2.c) * 57.2957763671875) + 90.0f);
        $$0.b_((float)(apa.d($$3, $$2.d) * 57.2957763671875) - 90.0f);
        while ($$0.dA() - $$0.N < -180.0f) {
            $$0.N -= 360.0f;
        }
        while ($$0.dA() - $$0.N >= 180.0f) {
            $$0.N += 360.0f;
        }
        while ($$0.dy() - $$0.M < -180.0f) {
            $$0.M -= 360.0f;
        }
        while ($$0.dy() - $$0.M >= 180.0f) {
            $$0.M += 360.0f;
        }
        $$0.b_(apa.i($$1, $$0.N, $$0.dA()));
        $$0.a_(apa.i($$1, $$0.M, $$0.dy()));
    }

    public static bdw a(bfz $$0, cfu $$1) {
        return $$0.eO().a($$1) ? bdw.a : bdw.b;
    }

    public static byu a(bfz $$0, cfz $$1, float $$2) {
        cdn $$3 = (cdn)($$1.d() instanceof cdn ? $$1.d() : cgc.nH);
        byu $$4 = $$3.a($$0.dI(), $$1, $$0);
        $$4.a($$0, $$2);
        if ($$1.a(cgc.uw) && $$4 instanceof byw) {
            ((byw)$$4).a($$1);
        }
        return $$4;
    }
}

