/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 */
import com.google.common.hash.Hashing;

public class cnm {
    public static final int a = hq.a(8);
    private static final int b = 2;
    private static final int c = 4;
    private static final int d = 3;
    private final a e;
    private final long f;

    public cnm(a $$0, long $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    public static long a(long $$0) {
        return Hashing.sha256().hashLong($$0).asLong();
    }

    public cnm a(a $$0) {
        return new cnm($$0, this.f);
    }

    public he<cnk> a(gu $$0) {
        int $$1 = $$0.u() - 2;
        int $$2 = $$0.v() - 2;
        int $$3 = $$0.w() - 2;
        int $$4 = $$1 >> 2;
        int $$5 = $$2 >> 2;
        int $$6 = $$3 >> 2;
        double $$7 = (double)($$1 & 3) / 4.0;
        double $$8 = (double)($$2 & 3) / 4.0;
        double $$9 = (double)($$3 & 3) / 4.0;
        int $$10 = 0;
        double $$11 = Double.POSITIVE_INFINITY;
        for (int $$12 = 0; $$12 < 8; ++$$12) {
            double $$21;
            double $$20;
            double $$19;
            boolean $$15;
            int $$18;
            boolean $$14;
            int $$17;
            boolean $$13 = ($$12 & 4) == 0;
            int $$16 = $$13 ? $$4 : $$4 + 1;
            double $$22 = cnm.a(this.f, $$16, $$17 = ($$14 = ($$12 & 2) == 0) ? $$5 : $$5 + 1, $$18 = ($$15 = ($$12 & 1) == 0) ? $$6 : $$6 + 1, $$19 = $$13 ? $$7 : $$7 - 1.0, $$20 = $$14 ? $$8 : $$8 - 1.0, $$21 = $$15 ? $$9 : $$9 - 1.0);
            if (!($$11 > $$22)) continue;
            $$10 = $$12;
            $$11 = $$22;
        }
        int $$23 = ($$10 & 4) == 0 ? $$4 : $$4 + 1;
        int $$24 = ($$10 & 2) == 0 ? $$5 : $$5 + 1;
        int $$25 = ($$10 & 1) == 0 ? $$6 : $$6 + 1;
        return this.e.getNoiseBiome($$23, $$24, $$25);
    }

    public he<cnk> a(double $$0, double $$1, double $$2) {
        int $$3 = hq.a(apa.a($$0));
        int $$4 = hq.a(apa.a($$1));
        int $$5 = hq.a(apa.a($$2));
        return this.a($$3, $$4, $$5);
    }

    public he<cnk> b(gu $$0) {
        int $$1 = hq.a($$0.u());
        int $$2 = hq.a($$0.v());
        int $$3 = hq.a($$0.w());
        return this.a($$1, $$2, $$3);
    }

    public he<cnk> a(int $$0, int $$1, int $$2) {
        return this.e.getNoiseBiome($$0, $$1, $$2);
    }

    private static double a(long $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
        long $$7 = $$0;
        $$7 = aow.a($$7, $$1);
        $$7 = aow.a($$7, $$2);
        $$7 = aow.a($$7, $$3);
        $$7 = aow.a($$7, $$1);
        $$7 = aow.a($$7, $$2);
        $$7 = aow.a($$7, $$3);
        double $$8 = cnm.b($$7);
        $$7 = aow.a($$7, $$0);
        double $$9 = cnm.b($$7);
        $$7 = aow.a($$7, $$0);
        double $$10 = cnm.b($$7);
        return apa.k($$6 + $$10) + apa.k($$5 + $$9) + apa.k($$4 + $$8);
    }

    private static double b(long $$0) {
        double $$1 = (double)Math.floorMod($$0 >> 24, 1024) / 1024.0;
        return ($$1 - 0.5) * 0.9;
    }

    public static interface a {
        public he<cnk> getNoiseBiome(int var1, int var2, int var3);
    }
}

