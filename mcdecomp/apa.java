/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.math.NumberUtils
 *  org.joml.Math
 */
import java.util.Locale;
import java.util.UUID;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import org.apache.commons.lang3.math.NumberUtils;

public class apa {
    private static final long h = 61440L;
    private static final long i = 16384L;
    private static final long j = -4611686018427387904L;
    private static final long k = Long.MIN_VALUE;
    public static final float a = (float)Math.PI;
    public static final float b = 1.5707964f;
    public static final float c = (float)Math.PI * 2;
    public static final float d = (float)Math.PI / 180;
    public static final float e = 57.295776f;
    public static final float f = 1.0E-5f;
    public static final float g = apa.c(2.0f);
    private static final float l = 10430.378f;
    private static final float[] m = ac.a(new float[65536], $$0 -> {
        for (int $$1 = 0; $$1 < ((float[])$$0).length; ++$$1) {
            $$0[$$1] = (float)Math.sin((double)$$1 * Math.PI * 2.0 / 65536.0);
        }
    });
    private static final apf n = apf.b();
    private static final int[] o = new int[]{0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9};
    private static final double p = 0.16666666666666666;
    private static final int q = 8;
    private static final int r = 257;
    private static final double s = Double.longBitsToDouble(4805340802404319232L);
    private static final double[] t = new double[257];
    private static final double[] u = new double[257];

    public static float a(float $$0) {
        return m[(int)($$0 * 10430.378f) & 0xFFFF];
    }

    public static float b(float $$0) {
        return m[(int)($$0 * 10430.378f + 16384.0f) & 0xFFFF];
    }

    public static float c(float $$0) {
        return (float)Math.sqrt($$0);
    }

    public static int d(float $$0) {
        int $$1 = (int)$$0;
        return $$0 < (float)$$1 ? $$1 - 1 : $$1;
    }

    public static int a(double $$0) {
        int $$1 = (int)$$0;
        return $$0 < (double)$$1 ? $$1 - 1 : $$1;
    }

    public static long b(double $$0) {
        long $$1 = (long)$$0;
        return $$0 < (double)$$1 ? $$1 - 1L : $$1;
    }

    public static float e(float $$0) {
        return Math.abs($$0);
    }

    public static int a(int $$0) {
        return Math.abs($$0);
    }

    public static int f(float $$0) {
        int $$1 = (int)$$0;
        return $$0 > (float)$$1 ? $$1 + 1 : $$1;
    }

    public static int c(double $$0) {
        int $$1 = (int)$$0;
        return $$0 > (double)$$1 ? $$1 + 1 : $$1;
    }

    public static int a(int $$0, int $$1, int $$2) {
        return Math.min(Math.max($$0, $$1), $$2);
    }

    public static float a(float $$0, float $$1, float $$2) {
        if ($$0 < $$1) {
            return $$1;
        }
        return Math.min($$0, $$2);
    }

    public static double a(double $$0, double $$1, double $$2) {
        if ($$0 < $$1) {
            return $$1;
        }
        return Math.min($$0, $$2);
    }

    public static double b(double $$0, double $$1, double $$2) {
        if ($$2 < 0.0) {
            return $$0;
        }
        if ($$2 > 1.0) {
            return $$1;
        }
        return apa.d($$2, $$0, $$1);
    }

    public static float b(float $$0, float $$1, float $$2) {
        if ($$2 < 0.0f) {
            return $$0;
        }
        if ($$2 > 1.0f) {
            return $$1;
        }
        return apa.i($$2, $$0, $$1);
    }

    public static double a(double $$0, double $$1) {
        if ($$0 < 0.0) {
            $$0 = -$$0;
        }
        if ($$1 < 0.0) {
            $$1 = -$$1;
        }
        return Math.max($$0, $$1);
    }

    public static int a(int $$0, int $$1) {
        return Math.floorDiv($$0, $$1);
    }

    public static int a(apf $$0, int $$1, int $$2) {
        if ($$1 >= $$2) {
            return $$1;
        }
        return $$0.a($$2 - $$1 + 1) + $$1;
    }

    public static float a(apf $$0, float $$1, float $$2) {
        if ($$1 >= $$2) {
            return $$1;
        }
        return $$0.i() * ($$2 - $$1) + $$1;
    }

    public static double a(apf $$0, double $$1, double $$2) {
        if ($$1 >= $$2) {
            return $$1;
        }
        return $$0.j() * ($$2 - $$1) + $$1;
    }

    public static boolean a(float $$0, float $$1) {
        return Math.abs($$1 - $$0) < 1.0E-5f;
    }

    public static boolean b(double $$0, double $$1) {
        return Math.abs($$1 - $$0) < (double)1.0E-5f;
    }

    public static int b(int $$0, int $$1) {
        return Math.floorMod($$0, $$1);
    }

    public static float b(float $$0, float $$1) {
        return ($$0 % $$1 + $$1) % $$1;
    }

    public static double c(double $$0, double $$1) {
        return ($$0 % $$1 + $$1) % $$1;
    }

    public static boolean c(int $$0, int $$1) {
        return $$0 % $$1 == 0;
    }

    public static int b(int $$0) {
        int $$1 = $$0 % 360;
        if ($$1 >= 180) {
            $$1 -= 360;
        }
        if ($$1 < -180) {
            $$1 += 360;
        }
        return $$1;
    }

    public static float g(float $$0) {
        float $$1 = $$0 % 360.0f;
        if ($$1 >= 180.0f) {
            $$1 -= 360.0f;
        }
        if ($$1 < -180.0f) {
            $$1 += 360.0f;
        }
        return $$1;
    }

    public static double d(double $$0) {
        double $$1 = $$0 % 360.0;
        if ($$1 >= 180.0) {
            $$1 -= 360.0;
        }
        if ($$1 < -180.0) {
            $$1 += 360.0;
        }
        return $$1;
    }

    public static float c(float $$0, float $$1) {
        return apa.g($$1 - $$0);
    }

    public static float d(float $$0, float $$1) {
        return apa.e(apa.c($$0, $$1));
    }

    public static float c(float $$0, float $$1, float $$2) {
        float $$3 = apa.c($$0, $$1);
        float $$4 = apa.a($$3, -$$2, $$2);
        return $$1 - $$4;
    }

    public static float d(float $$0, float $$1, float $$2) {
        $$2 = apa.e($$2);
        if ($$0 < $$1) {
            return apa.a($$0 + $$2, $$0, $$1);
        }
        return apa.a($$0 - $$2, $$1, $$0);
    }

    public static float e(float $$0, float $$1, float $$2) {
        float $$3 = apa.c($$0, $$1);
        return apa.d($$0, $$0 + $$3, $$2);
    }

    public static int a(String $$0, int $$1) {
        return NumberUtils.toInt((String)$$0, (int)$$1);
    }

    public static int c(int $$0) {
        int $$1 = $$0 - 1;
        $$1 |= $$1 >> 1;
        $$1 |= $$1 >> 2;
        $$1 |= $$1 >> 4;
        $$1 |= $$1 >> 8;
        $$1 |= $$1 >> 16;
        return $$1 + 1;
    }

    public static boolean d(int $$0) {
        return $$0 != 0 && ($$0 & $$0 - 1) == 0;
    }

    public static int e(int $$0) {
        $$0 = apa.d($$0) ? $$0 : apa.c($$0);
        return o[(int)((long)$$0 * 125613361L >> 27) & 0x1F];
    }

    public static int f(int $$0) {
        return apa.e($$0) - (apa.d($$0) ? 0 : 1);
    }

    public static int f(float $$0, float $$1, float $$2) {
        return aok.b.a(0, apa.d($$0 * 255.0f), apa.d($$1 * 255.0f), apa.d($$2 * 255.0f));
    }

    public static float h(float $$0) {
        return $$0 - (float)apa.d($$0);
    }

    public static double e(double $$0) {
        return $$0 - (double)apa.b($$0);
    }

    @Deprecated
    public static long a(hz $$0) {
        return apa.b($$0.u(), $$0.v(), $$0.w());
    }

    @Deprecated
    public static long b(int $$0, int $$1, int $$2) {
        long $$3 = (long)($$0 * 3129871) ^ (long)$$2 * 116129781L ^ (long)$$1;
        $$3 = $$3 * $$3 * 42317861L + $$3 * 11L;
        return $$3 >> 16;
    }

    public static UUID a(apf $$0) {
        long $$1 = $$0.g() & 0xFFFFFFFFFFFF0FFFL | 0x4000L;
        long $$2 = $$0.g() & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
        return new UUID($$1, $$2);
    }

    public static UUID a() {
        return apa.a(n);
    }

    public static double c(double $$0, double $$1, double $$2) {
        return ($$0 - $$1) / ($$2 - $$1);
    }

    public static float g(float $$0, float $$1, float $$2) {
        return ($$0 - $$1) / ($$2 - $$1);
    }

    public static boolean a(eei $$0, eei $$1, eed $$2) {
        double $$3 = ($$2.a + $$2.d) * 0.5;
        double $$4 = ($$2.d - $$2.a) * 0.5;
        double $$5 = $$0.c - $$3;
        if (Math.abs($$5) > $$4 && $$5 * $$1.c >= 0.0) {
            return false;
        }
        double $$6 = ($$2.b + $$2.e) * 0.5;
        double $$7 = ($$2.e - $$2.b) * 0.5;
        double $$8 = $$0.d - $$6;
        if (Math.abs($$8) > $$7 && $$8 * $$1.d >= 0.0) {
            return false;
        }
        double $$9 = ($$2.c + $$2.f) * 0.5;
        double $$10 = ($$2.f - $$2.c) * 0.5;
        double $$11 = $$0.e - $$9;
        if (Math.abs($$11) > $$10 && $$11 * $$1.e >= 0.0) {
            return false;
        }
        double $$12 = Math.abs($$1.c);
        double $$13 = Math.abs($$1.d);
        double $$14 = Math.abs($$1.e);
        double $$15 = $$1.d * $$11 - $$1.e * $$8;
        if (Math.abs($$15) > $$7 * $$14 + $$10 * $$13) {
            return false;
        }
        $$15 = $$1.e * $$5 - $$1.c * $$11;
        if (Math.abs($$15) > $$4 * $$14 + $$10 * $$12) {
            return false;
        }
        $$15 = $$1.c * $$8 - $$1.d * $$5;
        return Math.abs($$15) < $$4 * $$13 + $$7 * $$12;
    }

    public static double d(double $$0, double $$1) {
        boolean $$5;
        boolean $$4;
        boolean $$3;
        double $$2 = $$1 * $$1 + $$0 * $$0;
        if (Double.isNaN($$2)) {
            return Double.NaN;
        }
        boolean bl2 = $$3 = $$0 < 0.0;
        if ($$3) {
            $$0 = -$$0;
        }
        boolean bl3 = $$4 = $$1 < 0.0;
        if ($$4) {
            $$1 = -$$1;
        }
        boolean bl4 = $$5 = $$0 > $$1;
        if ($$5) {
            double $$6 = $$1;
            $$1 = $$0;
            $$0 = $$6;
        }
        double $$7 = apa.g($$2);
        $$1 *= $$7;
        double $$8 = s + ($$0 *= $$7);
        int $$9 = (int)Double.doubleToRawLongBits($$8);
        double $$10 = t[$$9];
        double $$11 = u[$$9];
        double $$12 = $$8 - s;
        double $$13 = $$0 * $$11 - $$1 * $$12;
        double $$14 = (6.0 + $$13 * $$13) * $$13 * 0.16666666666666666;
        double $$15 = $$10 + $$14;
        if ($$5) {
            $$15 = 1.5707963267948966 - $$15;
        }
        if ($$4) {
            $$15 = Math.PI - $$15;
        }
        if ($$3) {
            $$15 = -$$15;
        }
        return $$15;
    }

    public static float i(float $$0) {
        return org.joml.Math.invsqrt((float)$$0);
    }

    public static double f(double $$0) {
        return org.joml.Math.invsqrt((double)$$0);
    }

    @Deprecated
    public static double g(double $$0) {
        double $$1 = 0.5 * $$0;
        long $$2 = Double.doubleToRawLongBits($$0);
        $$2 = 6910469410427058090L - ($$2 >> 1);
        $$0 = Double.longBitsToDouble($$2);
        $$0 *= 1.5 - $$1 * $$0 * $$0;
        return $$0;
    }

    public static float j(float $$0) {
        int $$1 = Float.floatToIntBits($$0);
        $$1 = 1419967116 - $$1 / 3;
        float $$2 = Float.intBitsToFloat($$1);
        $$2 = 0.6666667f * $$2 + 1.0f / (3.0f * $$2 * $$2 * $$0);
        $$2 = 0.6666667f * $$2 + 1.0f / (3.0f * $$2 * $$2 * $$0);
        return $$2;
    }

    /*
     * WARNING - void declaration
     */
    public static int h(float $$0, float $$1, float $$2) {
        void $$28;
        void $$27;
        void $$26;
        int $$3 = (int)($$0 * 6.0f) % 6;
        float $$4 = $$0 * 6.0f - (float)$$3;
        float $$5 = $$2 * (1.0f - $$1);
        float $$6 = $$2 * (1.0f - $$4 * $$1);
        float $$7 = $$2 * (1.0f - (1.0f - $$4) * $$1);
        switch ($$3) {
            case 0: {
                float $$8 = $$2;
                float $$9 = $$7;
                float $$10 = $$5;
                break;
            }
            case 1: {
                float $$11 = $$6;
                float $$12 = $$2;
                float $$13 = $$5;
                break;
            }
            case 2: {
                float $$14 = $$5;
                float $$15 = $$2;
                float $$16 = $$7;
                break;
            }
            case 3: {
                float $$17 = $$5;
                float $$18 = $$6;
                float $$19 = $$2;
                break;
            }
            case 4: {
                float $$20 = $$7;
                float $$21 = $$5;
                float $$22 = $$2;
                break;
            }
            case 5: {
                float $$23 = $$2;
                float $$24 = $$5;
                float $$25 = $$6;
                break;
            }
            default: {
                throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + $$0 + ", " + $$1 + ", " + $$2);
            }
        }
        return aok.b.a(0, apa.a((int)($$26 * 255.0f), 0, 255), apa.a((int)($$27 * 255.0f), 0, 255), apa.a((int)($$28 * 255.0f), 0, 255));
    }

    public static int g(int $$0) {
        $$0 ^= $$0 >>> 16;
        $$0 *= -2048144789;
        $$0 ^= $$0 >>> 13;
        $$0 *= -1028477387;
        $$0 ^= $$0 >>> 16;
        return $$0;
    }

    public static int a(int $$0, int $$1, IntPredicate $$2) {
        int $$3 = $$1 - $$0;
        while ($$3 > 0) {
            int $$4 = $$3 / 2;
            int $$5 = $$0 + $$4;
            if ($$2.test($$5)) {
                $$3 = $$4;
                continue;
            }
            $$0 = $$5 + 1;
            $$3 -= $$4 + 1;
        }
        return $$0;
    }

    public static int a(float $$0, int $$1, int $$2) {
        return $$1 + apa.d($$0 * (float)($$2 - $$1));
    }

    public static float i(float $$0, float $$1, float $$2) {
        return $$1 + $$0 * ($$2 - $$1);
    }

    public static double d(double $$0, double $$1, double $$2) {
        return $$1 + $$0 * ($$2 - $$1);
    }

    public static double a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        return apa.d($$1, apa.d($$0, $$2, $$3), apa.d($$0, $$4, $$5));
    }

    public static double a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8, double $$9, double $$10) {
        return apa.d($$2, apa.a($$0, $$1, $$3, $$4, $$5, $$6), apa.a($$0, $$1, $$7, $$8, $$9, $$10));
    }

    public static float a(float $$0, float $$1, float $$2, float $$3, float $$4) {
        return 0.5f * (2.0f * $$2 + ($$3 - $$1) * $$0 + (2.0f * $$1 - 5.0f * $$2 + 4.0f * $$3 - $$4) * $$0 * $$0 + (3.0f * $$2 - $$1 - 3.0f * $$3 + $$4) * $$0 * $$0 * $$0);
    }

    public static double h(double $$0) {
        return $$0 * $$0 * $$0 * ($$0 * ($$0 * 6.0 - 15.0) + 10.0);
    }

    public static double i(double $$0) {
        return 30.0 * $$0 * $$0 * ($$0 - 1.0) * ($$0 - 1.0);
    }

    public static int j(double $$0) {
        if ($$0 == 0.0) {
            return 0;
        }
        return $$0 > 0.0 ? 1 : -1;
    }

    public static float j(float $$0, float $$1, float $$2) {
        return $$1 + $$0 * apa.g($$2 - $$1);
    }

    public static float e(float $$0, float $$1) {
        return (Math.abs($$0 % $$1 - $$1 * 0.5f) - $$1 * 0.25f) / ($$1 * 0.25f);
    }

    public static float k(float $$0) {
        return $$0 * $$0;
    }

    public static double k(double $$0) {
        return $$0 * $$0;
    }

    public static int h(int $$0) {
        return $$0 * $$0;
    }

    public static long a(long $$0) {
        return $$0 * $$0;
    }

    public static double a(double $$0, double $$1, double $$2, double $$3, double $$4) {
        return apa.b($$3, $$4, apa.c($$0, $$1, $$2));
    }

    public static float b(float $$0, float $$1, float $$2, float $$3, float $$4) {
        return apa.b($$3, $$4, apa.g($$0, $$1, $$2));
    }

    public static double b(double $$0, double $$1, double $$2, double $$3, double $$4) {
        return apa.d(apa.c($$0, $$1, $$2), $$3, $$4);
    }

    public static float c(float $$0, float $$1, float $$2, float $$3, float $$4) {
        return apa.i(apa.g($$0, $$1, $$2), $$3, $$4);
    }

    public static double l(double $$0) {
        return $$0 + (2.0 * apf.a(apa.a($$0 * 3000.0)).j() - 1.0) * 1.0E-7 / 2.0;
    }

    public static int d(int $$0, int $$1) {
        return apa.e($$0, $$1) * $$1;
    }

    public static int e(int $$0, int $$1) {
        return -Math.floorDiv(-$$0, $$1);
    }

    public static int b(apf $$0, int $$1, int $$2) {
        return $$0.a($$2 - $$1 + 1) + $$1;
    }

    public static float b(apf $$0, float $$1, float $$2) {
        return $$0.i() * ($$2 - $$1) + $$1;
    }

    public static float c(apf $$0, float $$1, float $$2) {
        return $$1 + (float)$$0.k() * $$2;
    }

    public static double e(double $$0, double $$1) {
        return $$0 * $$0 + $$1 * $$1;
    }

    public static double f(double $$0, double $$1) {
        return Math.sqrt(apa.e($$0, $$1));
    }

    public static double e(double $$0, double $$1, double $$2) {
        return $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
    }

    public static double f(double $$0, double $$1, double $$2) {
        return Math.sqrt(apa.e($$0, $$1, $$2));
    }

    public static int a(double $$0, int $$1) {
        return apa.a($$0 / (double)$$1) * $$1;
    }

    public static IntStream c(int $$0, int $$1, int $$2) {
        return apa.a($$0, $$1, $$2, 1);
    }

    public static IntStream a(int $$0, int $$1, int $$2, int $$32) {
        if ($$1 > $$2) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "upperbound %d expected to be > lowerBound %d", $$2, $$1));
        }
        if ($$32 < 1) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "steps expected to be >= 1, was %d", $$32));
        }
        if ($$0 < $$1 || $$0 > $$2) {
            return IntStream.empty();
        }
        return IntStream.iterate($$0, $$3 -> {
            int $$4 = Math.abs($$0 - $$3);
            return $$0 - $$4 >= $$1 || $$0 + $$4 <= $$2;
        }, $$4 -> {
            int $$8;
            boolean $$7;
            boolean $$5 = $$4 <= $$0;
            int $$6 = Math.abs($$0 - $$4);
            boolean bl2 = $$7 = $$0 + $$6 + $$32 <= $$2;
            if (!($$5 && $$7 || ($$8 = $$0 - $$6 - ($$5 ? $$32 : 0)) < $$1)) {
                return $$8;
            }
            return $$0 + $$6 + $$32;
        });
    }

    static {
        for (int $$02 = 0; $$02 < 257; ++$$02) {
            double $$1 = (double)$$02 / 256.0;
            double $$2 = Math.asin($$1);
            apa.u[$$02] = Math.cos($$2);
            apa.t[$$02] = $$2;
        }
    }
}

