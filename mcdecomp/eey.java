/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.math.DoubleMath
 *  com.google.common.math.IntMath
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Objects;

public final class eey {
    public static final double a = 1.0E-7;
    public static final double b = 1.0E-6;
    private static final efb d = ac.a(() -> {
        eel $$0 = new eel(1, 1, 1);
        ((eer)$$0).c(0, 0, 0);
        return new eep($$0);
    });
    public static final efb c = eey.a(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
    private static final efb e = new eek((eer)new eel(0, 0, 0), (DoubleList)new DoubleArrayList(new double[]{0.0}), (DoubleList)new DoubleArrayList(new double[]{0.0}), (DoubleList)new DoubleArrayList(new double[]{0.0}));

    public static efb a() {
        return e;
    }

    public static efb b() {
        return d;
    }

    public static efb a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        if ($$0 > $$3 || $$1 > $$4 || $$2 > $$5) {
            throw new IllegalArgumentException("The min values need to be smaller or equals to the max values");
        }
        return eey.b($$0, $$1, $$2, $$3, $$4, $$5);
    }

    public static efb b(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        if ($$3 - $$0 < 1.0E-7 || $$4 - $$1 < 1.0E-7 || $$5 - $$2 < 1.0E-7) {
            return eey.a();
        }
        int $$6 = eey.a($$0, $$3);
        int $$7 = eey.a($$1, $$4);
        int $$8 = eey.a($$2, $$5);
        if ($$6 < 0 || $$7 < 0 || $$8 < 0) {
            return new eek(eey.d.a, (DoubleList)DoubleArrayList.wrap((double[])new double[]{$$0, $$3}), (DoubleList)DoubleArrayList.wrap((double[])new double[]{$$1, $$4}), (DoubleList)DoubleArrayList.wrap((double[])new double[]{$$2, $$5}));
        }
        if ($$6 == 0 && $$7 == 0 && $$8 == 0) {
            return eey.b();
        }
        int $$9 = 1 << $$6;
        int $$10 = 1 << $$7;
        int $$11 = 1 << $$8;
        eel $$12 = eel.a($$9, $$10, $$11, (int)Math.round($$0 * (double)$$9), (int)Math.round($$1 * (double)$$10), (int)Math.round($$2 * (double)$$11), (int)Math.round($$3 * (double)$$9), (int)Math.round($$4 * (double)$$10), (int)Math.round($$5 * (double)$$11));
        return new eep($$12);
    }

    public static efb a(eed $$0) {
        return eey.b($$0.a, $$0.b, $$0.c, $$0.d, $$0.e, $$0.f);
    }

    @VisibleForTesting
    protected static int a(double $$0, double $$1) {
        if ($$0 < -1.0E-7 || $$1 > 1.0000001) {
            return -1;
        }
        for (int $$2 = 0; $$2 <= 3; ++$$2) {
            boolean $$7;
            int $$3 = 1 << $$2;
            double $$4 = $$0 * (double)$$3;
            double $$5 = $$1 * (double)$$3;
            boolean $$6 = Math.abs($$4 - (double)Math.round($$4)) < 1.0E-7 * (double)$$3;
            boolean bl2 = $$7 = Math.abs($$5 - (double)Math.round($$5)) < 1.0E-7 * (double)$$3;
            if (!$$6 || !$$7) continue;
            return $$2;
        }
        return -1;
    }

    protected static long a(int $$0, int $$1) {
        return (long)$$0 * (long)($$1 / IntMath.gcd((int)$$0, (int)$$1));
    }

    public static efb a(efb $$0, efb $$1) {
        return eey.a($$0, $$1, eem.o);
    }

    public static efb a(efb $$0, efb ... $$1) {
        return Arrays.stream($$1).reduce($$0, eey::a);
    }

    public static efb a(efb $$0, efb $$1, eem $$2) {
        return eey.b($$0, $$1, $$2).c();
    }

    public static efb b(efb $$0, efb $$1, eem $$2) {
        if ($$2.apply(false, false)) {
            throw ac.b(new IllegalArgumentException());
        }
        if ($$0 == $$1) {
            return $$2.apply(true, true) ? $$0 : eey.a();
        }
        boolean $$3 = $$2.apply(true, false);
        boolean $$4 = $$2.apply(false, true);
        if ($$0.b()) {
            return $$4 ? $$1 : eey.a();
        }
        if ($$1.b()) {
            return $$3 ? $$0 : eey.a();
        }
        eeu $$5 = eey.a(1, $$0.a(ha.a.a), $$1.a(ha.a.a), $$3, $$4);
        eeu $$6 = eey.a($$5.size() - 1, $$0.a(ha.a.b), $$1.a(ha.a.b), $$3, $$4);
        eeu $$7 = eey.a(($$5.size() - 1) * ($$6.size() - 1), $$0.a(ha.a.c), $$1.a(ha.a.c), $$3, $$4);
        eel $$8 = eel.a($$0.a, $$1.a, $$5, $$6, $$7, $$2);
        if ($$5 instanceof eeq && $$6 instanceof eeq && $$7 instanceof eeq) {
            return new eep($$8);
        }
        return new eek((eer)$$8, $$5.a(), $$6.a(), $$7.a());
    }

    public static boolean c(efb $$0, efb $$1, eem $$2) {
        if ($$2.apply(false, false)) {
            throw ac.b(new IllegalArgumentException());
        }
        boolean $$3 = $$0.b();
        boolean $$4 = $$1.b();
        if ($$3 || $$4) {
            return $$2.apply(!$$3, !$$4);
        }
        if ($$0 == $$1) {
            return $$2.apply(true, true);
        }
        boolean $$5 = $$2.apply(true, false);
        boolean $$6 = $$2.apply(false, true);
        for (ha.a $$7 : gs.d) {
            if ($$0.c($$7) < $$1.b($$7) - 1.0E-7) {
                return $$5 || $$6;
            }
            if (!($$1.c($$7) < $$0.b($$7) - 1.0E-7)) continue;
            return $$5 || $$6;
        }
        eeu $$8 = eey.a(1, $$0.a(ha.a.a), $$1.a(ha.a.a), $$5, $$6);
        eeu $$9 = eey.a($$8.size() - 1, $$0.a(ha.a.b), $$1.a(ha.a.b), $$5, $$6);
        eeu $$10 = eey.a(($$8.size() - 1) * ($$9.size() - 1), $$0.a(ha.a.c), $$1.a(ha.a.c), $$5, $$6);
        return eey.a($$8, $$9, $$10, $$0.a, $$1.a, $$2);
    }

    private static boolean a(eeu $$0, eeu $$1, eeu $$2, eer $$3, eer $$4, eem $$52) {
        return !$$0.a(($$5, $$62, $$7) -> $$1.a(($$6, $$72, $$82) -> $$2.a(($$7, $$8, $$9) -> !$$52.apply($$3.d($$5, $$6, $$7), $$4.d($$62, $$72, $$8)))));
    }

    public static double a(ha.a $$0, eed $$1, Iterable<efb> $$2, double $$3) {
        for (efb $$4 : $$2) {
            if (Math.abs($$3) < 1.0E-7) {
                return 0.0;
            }
            $$3 = $$4.a($$0, $$1, $$3);
        }
        return $$3;
    }

    public static boolean a(efb $$0, efb $$1, ha $$2) {
        if ($$0 == eey.b() && $$1 == eey.b()) {
            return true;
        }
        if ($$1.b()) {
            return false;
        }
        ha.a $$3 = $$2.o();
        ha.b $$4 = $$2.f();
        efb $$5 = $$4 == ha.b.a ? $$0 : $$1;
        efb $$6 = $$4 == ha.b.a ? $$1 : $$0;
        eem $$7 = $$4 == ha.b.a ? eem.e : eem.c;
        return DoubleMath.fuzzyEquals((double)$$5.c($$3), (double)1.0, (double)1.0E-7) && DoubleMath.fuzzyEquals((double)$$6.b($$3), (double)0.0, (double)1.0E-7) && !eey.c(new eez($$5, $$3, $$5.a.c($$3) - 1), new eez($$6, $$3, 0), $$7);
    }

    public static efb a(efb $$0, ha $$1) {
        int $$6;
        boolean $$5;
        if ($$0 == eey.b()) {
            return eey.b();
        }
        ha.a $$2 = $$1.o();
        if ($$1.f() == ha.b.a) {
            boolean $$3 = DoubleMath.fuzzyEquals((double)$$0.c($$2), (double)1.0, (double)1.0E-7);
            int $$4 = $$0.a.c($$2) - 1;
        } else {
            $$5 = DoubleMath.fuzzyEquals((double)$$0.b($$2), (double)0.0, (double)1.0E-7);
            $$6 = 0;
        }
        if (!$$5) {
            return eey.a();
        }
        return new eez($$0, $$2, $$6);
    }

    public static boolean b(efb $$0, efb $$1, ha $$2) {
        efb $$6;
        if ($$0 == eey.b() || $$1 == eey.b()) {
            return true;
        }
        ha.a $$3 = $$2.o();
        ha.b $$4 = $$2.f();
        efb $$5 = $$4 == ha.b.a ? $$0 : $$1;
        efb efb2 = $$6 = $$4 == ha.b.a ? $$1 : $$0;
        if (!DoubleMath.fuzzyEquals((double)$$5.c($$3), (double)1.0, (double)1.0E-7)) {
            $$5 = eey.a();
        }
        if (!DoubleMath.fuzzyEquals((double)$$6.b($$3), (double)0.0, (double)1.0E-7)) {
            $$6 = eey.a();
        }
        return !eey.c(eey.b(), eey.b((efb)new eez($$5, $$3, $$5.a.c($$3) - 1), (efb)new eez($$6, $$3, 0), eem.o), eem.e);
    }

    public static boolean b(efb $$0, efb $$1) {
        if ($$0 == eey.b() || $$1 == eey.b()) {
            return true;
        }
        if ($$0.b() && $$1.b()) {
            return false;
        }
        return !eey.c(eey.b(), eey.b($$0, $$1, eem.o), eem.e);
    }

    @VisibleForTesting
    protected static eeu a(int $$0, DoubleList $$1, DoubleList $$2, boolean $$3, boolean $$4) {
        long $$7;
        int $$5 = $$1.size() - 1;
        int $$6 = $$2.size() - 1;
        if ($$1 instanceof eeo && $$2 instanceof eeo && (long)$$0 * ($$7 = eey.a($$5, $$6)) <= 256L) {
            return new eeq($$5, $$6);
        }
        if ($$1.getDouble($$5) < $$2.getDouble(0) - 1.0E-7) {
            return new eew($$1, $$2, false);
        }
        if ($$2.getDouble($$6) < $$1.getDouble(0) - 1.0E-7) {
            return new eew($$2, $$1, true);
        }
        if ($$5 == $$6 && Objects.equals($$1, $$2)) {
            return new eet($$1);
        }
        return new eev($$1, $$2, $$3, $$4);
    }

    public static interface a {
        public void consume(double var1, double var3, double var5, double var7, double var9, double var11);
    }
}

