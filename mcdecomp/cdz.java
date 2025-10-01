/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class cdz
extends cfu {
    public static final int a = 10;
    private static final int b = 200;
    private static final double c = Math.sqrt(aiy.a) - 1.0;

    public cdz(cfu.a $$0) {
        super($$0);
    }

    @Override
    public bdx a(cij $$0) {
        byo $$1 = $$0.o();
        if ($$1 != null && this.a($$1).c() == eeg.a.b) {
            $$1.c($$0.p());
        }
        return bdx.b;
    }

    @Override
    public chs c(cfz $$0) {
        return chs.j;
    }

    @Override
    public int b(cfz $$0) {
        return 200;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(cmm $$0, bfz $$12, cfz $$2, int $$3) {
        boolean $$10;
        block9: {
            block8: {
                if ($$3 < 0 || !($$12 instanceof byo)) {
                    $$12.fn();
                    return;
                }
                byo $$4 = (byo)$$12;
                eeg $$6 = this.a($$12);
                if (!($$6 instanceof eee)) break block8;
                eee $$7 = (eee)$$6;
                if ($$6.c() == eeg.a.b) break block9;
            }
            $$12.fn();
            return;
        }
        int $$9 = this.b($$2) - $$3 + 1;
        boolean bl2 = $$10 = $$9 % 10 == 5;
        if ($$10) {
            czr $$17;
            boolean $$18;
            amg $$16;
            void $$5;
            void $$8;
            gu $$11 = $$8.a();
            dcb $$122 = $$0.a_($$11);
            bft $$13 = $$12.fj() == bdw.a ? $$5.fh() : $$5.fh().d();
            this.a($$0, (eee)$$8, $$122, $$12.f(0.0f), $$13);
            Object object = $$122.b();
            if (object instanceof cpr) {
                cpr $$14 = (cpr)object;
                amg $$15 = $$14.b();
            } else {
                $$16 = amh.cl;
            }
            $$0.a((byo)$$5, $$11, $$16, ami.e);
            if (!$$0.r_() && (object = $$0.c_($$11)) instanceof czr && ($$18 = ($$17 = (czr)object).a($$0.V(), (byo)$$5, $$8.b()))) {
                bfo $$19 = $$2.equals($$5.c(bfo.b)) ? bfo.b : bfo.a;
                $$2.a(1, $$12, (T $$1) -> $$1.d($$19));
            }
        }
    }

    private eeg a(bfz $$02) {
        return bzh.a((bfj)$$02, (bfj $$0) -> !$$0.G_() && $$0.bo(), c);
    }

    public void a(cmm $$0, eee $$1, dcb $$2, eei $$3, bft $$4) {
        double $$5 = 3.0;
        int $$6 = $$4 == bft.b ? 1 : -1;
        int $$7 = $$0.y_().b(7, 12);
        in $$8 = new in(iv.c, $$2);
        ha $$9 = $$1.b();
        a $$10 = cdz$a.a($$3, $$9);
        eei $$11 = $$1.e();
        for (int $$12 = 0; $$12 < $$7; ++$$12) {
            $$0.a($$8, $$11.c - (double)($$9 == ha.e ? 1.0E-6f : 0.0f), $$11.d, $$11.e - (double)($$9 == ha.c ? 1.0E-6f : 0.0f), $$10.a() * (double)$$6 * 3.0 * $$0.y_().j(), 0.0, $$10.c() * (double)$$6 * 3.0 * $$0.y_().j());
        }
    }

    record a(double a, double b, double c) {
        private static final double d = 1.0;
        private static final double e = 0.1;

        public static a a(eei $$0, ha $$1) {
            double $$2 = 0.0;
            return switch ($$1) {
                default -> throw new IncompatibleClassChangeError();
                case ha.a, ha.b -> new a($$0.c(), 0.0, -$$0.a());
                case ha.c -> new a(1.0, 0.0, -0.1);
                case ha.d -> new a(-1.0, 0.0, 0.1);
                case ha.e -> new a(-0.1, 0.0, -1.0);
                case ha.f -> new a(0.1, 0.0, 1.0);
            };
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "xd;yd;zd", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "xd;yd;zd", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "xd;yd;zd", "a", "b", "c"}, this, $$0);
        }
    }
}

