/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 */
import com.google.common.annotations.VisibleForTesting;

public final class dwf {
    private static final float d = 1.0E-7f;
    private final byte[] e;
    public final double a;
    public final double b;
    public final double c;

    public dwf(apf $$0) {
        this.a = $$0.j() * 256.0;
        this.b = $$0.j() * 256.0;
        this.c = $$0.j() * 256.0;
        this.e = new byte[256];
        for (int $$1 = 0; $$1 < 256; ++$$1) {
            this.e[$$1] = (byte)$$1;
        }
        for (int $$2 = 0; $$2 < 256; ++$$2) {
            int $$3 = $$0.a(256 - $$2);
            byte $$4 = this.e[$$2];
            this.e[$$2] = this.e[$$2 + $$3];
            this.e[$$2 + $$3] = $$4;
        }
    }

    public double a(double $$0, double $$1, double $$2) {
        return this.a($$0, $$1, $$2, 0.0, 0.0);
    }

    @Deprecated
    public double a(double $$0, double $$1, double $$2, double $$3, double $$4) {
        double $$17;
        double $$5 = $$0 + this.a;
        double $$6 = $$1 + this.b;
        double $$7 = $$2 + this.c;
        int $$8 = apa.a($$5);
        int $$9 = apa.a($$6);
        int $$10 = apa.a($$7);
        double $$11 = $$5 - (double)$$8;
        double $$12 = $$6 - (double)$$9;
        double $$13 = $$7 - (double)$$10;
        if ($$3 != 0.0) {
            double $$15;
            if ($$4 >= 0.0 && $$4 < $$12) {
                double $$14 = $$4;
            } else {
                $$15 = $$12;
            }
            double $$16 = (double)apa.a($$15 / $$3 + (double)1.0E-7f) * $$3;
        } else {
            $$17 = 0.0;
        }
        return this.a($$8, $$9, $$10, $$11, $$12 - $$17, $$13, $$12);
    }

    public double a(double $$0, double $$1, double $$2, double[] $$3) {
        double $$4 = $$0 + this.a;
        double $$5 = $$1 + this.b;
        double $$6 = $$2 + this.c;
        int $$7 = apa.a($$4);
        int $$8 = apa.a($$5);
        int $$9 = apa.a($$6);
        double $$10 = $$4 - (double)$$7;
        double $$11 = $$5 - (double)$$8;
        double $$12 = $$6 - (double)$$9;
        return this.a($$7, $$8, $$9, $$10, $$11, $$12, $$3);
    }

    private static double a(int $$0, double $$1, double $$2, double $$3) {
        return dwk.a(dwk.a[$$0 & 0xF], $$1, $$2, $$3);
    }

    private int a(int $$0) {
        return this.e[$$0 & 0xFF] & 0xFF;
    }

    private double a(int $$0, int $$1, int $$2, double $$3, double $$4, double $$5, double $$6) {
        int $$7 = this.a($$0);
        int $$8 = this.a($$0 + 1);
        int $$9 = this.a($$7 + $$1);
        int $$10 = this.a($$7 + $$1 + 1);
        int $$11 = this.a($$8 + $$1);
        int $$12 = this.a($$8 + $$1 + 1);
        double $$13 = dwf.a(this.a($$9 + $$2), $$3, $$4, $$5);
        double $$14 = dwf.a(this.a($$11 + $$2), $$3 - 1.0, $$4, $$5);
        double $$15 = dwf.a(this.a($$10 + $$2), $$3, $$4 - 1.0, $$5);
        double $$16 = dwf.a(this.a($$12 + $$2), $$3 - 1.0, $$4 - 1.0, $$5);
        double $$17 = dwf.a(this.a($$9 + $$2 + 1), $$3, $$4, $$5 - 1.0);
        double $$18 = dwf.a(this.a($$11 + $$2 + 1), $$3 - 1.0, $$4, $$5 - 1.0);
        double $$19 = dwf.a(this.a($$10 + $$2 + 1), $$3, $$4 - 1.0, $$5 - 1.0);
        double $$20 = dwf.a(this.a($$12 + $$2 + 1), $$3 - 1.0, $$4 - 1.0, $$5 - 1.0);
        double $$21 = apa.h($$3);
        double $$22 = apa.h($$6);
        double $$23 = apa.h($$5);
        return apa.a($$21, $$22, $$23, $$13, $$14, $$15, $$16, $$17, $$18, $$19, $$20);
    }

    private double a(int $$0, int $$1, int $$2, double $$3, double $$4, double $$5, double[] $$6) {
        int $$7 = this.a($$0);
        int $$8 = this.a($$0 + 1);
        int $$9 = this.a($$7 + $$1);
        int $$10 = this.a($$7 + $$1 + 1);
        int $$11 = this.a($$8 + $$1);
        int $$12 = this.a($$8 + $$1 + 1);
        int $$13 = this.a($$9 + $$2);
        int $$14 = this.a($$11 + $$2);
        int $$15 = this.a($$10 + $$2);
        int $$16 = this.a($$12 + $$2);
        int $$17 = this.a($$9 + $$2 + 1);
        int $$18 = this.a($$11 + $$2 + 1);
        int $$19 = this.a($$10 + $$2 + 1);
        int $$20 = this.a($$12 + $$2 + 1);
        int[] $$21 = dwk.a[$$13 & 0xF];
        int[] $$22 = dwk.a[$$14 & 0xF];
        int[] $$23 = dwk.a[$$15 & 0xF];
        int[] $$24 = dwk.a[$$16 & 0xF];
        int[] $$25 = dwk.a[$$17 & 0xF];
        int[] $$26 = dwk.a[$$18 & 0xF];
        int[] $$27 = dwk.a[$$19 & 0xF];
        int[] $$28 = dwk.a[$$20 & 0xF];
        double $$29 = dwk.a($$21, $$3, $$4, $$5);
        double $$30 = dwk.a($$22, $$3 - 1.0, $$4, $$5);
        double $$31 = dwk.a($$23, $$3, $$4 - 1.0, $$5);
        double $$32 = dwk.a($$24, $$3 - 1.0, $$4 - 1.0, $$5);
        double $$33 = dwk.a($$25, $$3, $$4, $$5 - 1.0);
        double $$34 = dwk.a($$26, $$3 - 1.0, $$4, $$5 - 1.0);
        double $$35 = dwk.a($$27, $$3, $$4 - 1.0, $$5 - 1.0);
        double $$36 = dwk.a($$28, $$3 - 1.0, $$4 - 1.0, $$5 - 1.0);
        double $$37 = apa.h($$3);
        double $$38 = apa.h($$4);
        double $$39 = apa.h($$5);
        double $$40 = apa.a($$37, $$38, $$39, $$21[0], $$22[0], $$23[0], $$24[0], $$25[0], $$26[0], $$27[0], $$28[0]);
        double $$41 = apa.a($$37, $$38, $$39, $$21[1], $$22[1], $$23[1], $$24[1], $$25[1], $$26[1], $$27[1], $$28[1]);
        double $$42 = apa.a($$37, $$38, $$39, $$21[2], $$22[2], $$23[2], $$24[2], $$25[2], $$26[2], $$27[2], $$28[2]);
        double $$43 = apa.a($$38, $$39, $$30 - $$29, $$32 - $$31, $$34 - $$33, $$36 - $$35);
        double $$44 = apa.a($$39, $$37, $$31 - $$29, $$35 - $$33, $$32 - $$30, $$36 - $$34);
        double $$45 = apa.a($$37, $$38, $$33 - $$29, $$34 - $$30, $$35 - $$31, $$36 - $$32);
        double $$46 = apa.i($$3);
        double $$47 = apa.i($$4);
        double $$48 = apa.i($$5);
        double $$49 = $$40 + $$46 * $$43;
        double $$50 = $$41 + $$47 * $$44;
        double $$51 = $$42 + $$48 * $$45;
        $$6[0] = $$6[0] + $$49;
        $$6[1] = $$6[1] + $$50;
        $$6[2] = $$6[2] + $$51;
        return apa.a($$37, $$38, $$39, $$29, $$30, $$31, $$32, $$33, $$34, $$35, $$36);
    }

    @VisibleForTesting
    public void a(StringBuilder $$0) {
        dwg.a($$0, this.a, this.b, this.c, this.e);
    }
}

