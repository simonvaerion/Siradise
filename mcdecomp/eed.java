/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.Optional;
import javax.annotation.Nullable;

public class eed {
    private static final double g = 1.0E-7;
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;

    public eed(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        this.a = Math.min($$0, $$3);
        this.b = Math.min($$1, $$4);
        this.c = Math.min($$2, $$5);
        this.d = Math.max($$0, $$3);
        this.e = Math.max($$1, $$4);
        this.f = Math.max($$2, $$5);
    }

    public eed(gu $$0) {
        this($$0.u(), $$0.v(), $$0.w(), $$0.u() + 1, $$0.v() + 1, $$0.w() + 1);
    }

    public eed(gu $$0, gu $$1) {
        this($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
    }

    public eed(eei $$0, eei $$1) {
        this($$0.c, $$0.d, $$0.e, $$1.c, $$1.d, $$1.e);
    }

    public static eed a(drs $$0) {
        return new eed($$0.g(), $$0.h(), $$0.i(), $$0.j() + 1, $$0.k() + 1, $$0.l() + 1);
    }

    public static eed a(eei $$0) {
        return new eed($$0.c, $$0.d, $$0.e, $$0.c + 1.0, $$0.d + 1.0, $$0.e + 1.0);
    }

    public eed a(double $$0) {
        return new eed($$0, this.b, this.c, this.d, this.e, this.f);
    }

    public eed b(double $$0) {
        return new eed(this.a, $$0, this.c, this.d, this.e, this.f);
    }

    public eed c(double $$0) {
        return new eed(this.a, this.b, $$0, this.d, this.e, this.f);
    }

    public eed d(double $$0) {
        return new eed(this.a, this.b, this.c, $$0, this.e, this.f);
    }

    public eed e(double $$0) {
        return new eed(this.a, this.b, this.c, this.d, $$0, this.f);
    }

    public eed f(double $$0) {
        return new eed(this.a, this.b, this.c, this.d, this.e, $$0);
    }

    public double a(ha.a $$0) {
        return $$0.a(this.a, this.b, this.c);
    }

    public double b(ha.a $$0) {
        return $$0.a(this.d, this.e, this.f);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof eed)) {
            return false;
        }
        eed $$1 = (eed)$$0;
        if (Double.compare($$1.a, this.a) != 0) {
            return false;
        }
        if (Double.compare($$1.b, this.b) != 0) {
            return false;
        }
        if (Double.compare($$1.c, this.c) != 0) {
            return false;
        }
        if (Double.compare($$1.d, this.d) != 0) {
            return false;
        }
        if (Double.compare($$1.e, this.e) != 0) {
            return false;
        }
        return Double.compare($$1.f, this.f) == 0;
    }

    public int hashCode() {
        long $$0 = Double.doubleToLongBits(this.a);
        int $$1 = (int)($$0 ^ $$0 >>> 32);
        $$0 = Double.doubleToLongBits(this.b);
        $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
        $$0 = Double.doubleToLongBits(this.c);
        $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
        $$0 = Double.doubleToLongBits(this.d);
        $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
        $$0 = Double.doubleToLongBits(this.e);
        $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
        $$0 = Double.doubleToLongBits(this.f);
        $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
        return $$1;
    }

    public eed a(double $$0, double $$1, double $$2) {
        double $$3 = this.a;
        double $$4 = this.b;
        double $$5 = this.c;
        double $$6 = this.d;
        double $$7 = this.e;
        double $$8 = this.f;
        if ($$0 < 0.0) {
            $$3 -= $$0;
        } else if ($$0 > 0.0) {
            $$6 -= $$0;
        }
        if ($$1 < 0.0) {
            $$4 -= $$1;
        } else if ($$1 > 0.0) {
            $$7 -= $$1;
        }
        if ($$2 < 0.0) {
            $$5 -= $$2;
        } else if ($$2 > 0.0) {
            $$8 -= $$2;
        }
        return new eed($$3, $$4, $$5, $$6, $$7, $$8);
    }

    public eed b(eei $$0) {
        return this.b($$0.c, $$0.d, $$0.e);
    }

    public eed b(double $$0, double $$1, double $$2) {
        double $$3 = this.a;
        double $$4 = this.b;
        double $$5 = this.c;
        double $$6 = this.d;
        double $$7 = this.e;
        double $$8 = this.f;
        if ($$0 < 0.0) {
            $$3 += $$0;
        } else if ($$0 > 0.0) {
            $$6 += $$0;
        }
        if ($$1 < 0.0) {
            $$4 += $$1;
        } else if ($$1 > 0.0) {
            $$7 += $$1;
        }
        if ($$2 < 0.0) {
            $$5 += $$2;
        } else if ($$2 > 0.0) {
            $$8 += $$2;
        }
        return new eed($$3, $$4, $$5, $$6, $$7, $$8);
    }

    public eed c(double $$0, double $$1, double $$2) {
        double $$3 = this.a - $$0;
        double $$4 = this.b - $$1;
        double $$5 = this.c - $$2;
        double $$6 = this.d + $$0;
        double $$7 = this.e + $$1;
        double $$8 = this.f + $$2;
        return new eed($$3, $$4, $$5, $$6, $$7, $$8);
    }

    public eed g(double $$0) {
        return this.c($$0, $$0, $$0);
    }

    public eed a(eed $$0) {
        double $$1 = Math.max(this.a, $$0.a);
        double $$2 = Math.max(this.b, $$0.b);
        double $$3 = Math.max(this.c, $$0.c);
        double $$4 = Math.min(this.d, $$0.d);
        double $$5 = Math.min(this.e, $$0.e);
        double $$6 = Math.min(this.f, $$0.f);
        return new eed($$1, $$2, $$3, $$4, $$5, $$6);
    }

    public eed b(eed $$0) {
        double $$1 = Math.min(this.a, $$0.a);
        double $$2 = Math.min(this.b, $$0.b);
        double $$3 = Math.min(this.c, $$0.c);
        double $$4 = Math.max(this.d, $$0.d);
        double $$5 = Math.max(this.e, $$0.e);
        double $$6 = Math.max(this.f, $$0.f);
        return new eed($$1, $$2, $$3, $$4, $$5, $$6);
    }

    public eed d(double $$0, double $$1, double $$2) {
        return new eed(this.a + $$0, this.b + $$1, this.c + $$2, this.d + $$0, this.e + $$1, this.f + $$2);
    }

    public eed a(gu $$0) {
        return new eed(this.a + (double)$$0.u(), this.b + (double)$$0.v(), this.c + (double)$$0.w(), this.d + (double)$$0.u(), this.e + (double)$$0.v(), this.f + (double)$$0.w());
    }

    public eed c(eei $$0) {
        return this.d($$0.c, $$0.d, $$0.e);
    }

    public boolean c(eed $$0) {
        return this.a($$0.a, $$0.b, $$0.c, $$0.d, $$0.e, $$0.f);
    }

    public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        return this.a < $$3 && this.d > $$0 && this.b < $$4 && this.e > $$1 && this.c < $$5 && this.f > $$2;
    }

    public boolean a(eei $$0, eei $$1) {
        return this.a(Math.min($$0.c, $$1.c), Math.min($$0.d, $$1.d), Math.min($$0.e, $$1.e), Math.max($$0.c, $$1.c), Math.max($$0.d, $$1.d), Math.max($$0.e, $$1.e));
    }

    public boolean d(eei $$0) {
        return this.e($$0.c, $$0.d, $$0.e);
    }

    public boolean e(double $$0, double $$1, double $$2) {
        return $$0 >= this.a && $$0 < this.d && $$1 >= this.b && $$1 < this.e && $$2 >= this.c && $$2 < this.f;
    }

    public double a() {
        double $$0 = this.b();
        double $$1 = this.c();
        double $$2 = this.d();
        return ($$0 + $$1 + $$2) / 3.0;
    }

    public double b() {
        return this.d - this.a;
    }

    public double c() {
        return this.e - this.b;
    }

    public double d() {
        return this.f - this.c;
    }

    public eed f(double $$0, double $$1, double $$2) {
        return this.c(-$$0, -$$1, -$$2);
    }

    public eed h(double $$0) {
        return this.g(-$$0);
    }

    public Optional<eei> b(eei $$0, eei $$1) {
        double[] $$2 = new double[]{1.0};
        double $$3 = $$1.c - $$0.c;
        double $$4 = $$1.d - $$0.d;
        double $$5 = $$1.e - $$0.e;
        ha $$6 = eed.a(this, $$0, $$2, null, $$3, $$4, $$5);
        if ($$6 == null) {
            return Optional.empty();
        }
        double $$7 = $$2[0];
        return Optional.of($$0.b($$7 * $$3, $$7 * $$4, $$7 * $$5));
    }

    @Nullable
    public static eee a(Iterable<eed> $$0, eei $$1, eei $$2, gu $$3) {
        double[] $$4 = new double[]{1.0};
        ha $$5 = null;
        double $$6 = $$2.c - $$1.c;
        double $$7 = $$2.d - $$1.d;
        double $$8 = $$2.e - $$1.e;
        for (eed $$9 : $$0) {
            $$5 = eed.a($$9.a($$3), $$1, $$4, $$5, $$6, $$7, $$8);
        }
        if ($$5 == null) {
            return null;
        }
        double $$10 = $$4[0];
        return new eee($$1.b($$10 * $$6, $$10 * $$7, $$10 * $$8), $$5, $$3, false);
    }

    @Nullable
    private static ha a(eed $$0, eei $$1, double[] $$2, @Nullable ha $$3, double $$4, double $$5, double $$6) {
        if ($$4 > 1.0E-7) {
            $$3 = eed.a($$2, $$3, $$4, $$5, $$6, $$0.a, $$0.b, $$0.e, $$0.c, $$0.f, ha.e, $$1.c, $$1.d, $$1.e);
        } else if ($$4 < -1.0E-7) {
            $$3 = eed.a($$2, $$3, $$4, $$5, $$6, $$0.d, $$0.b, $$0.e, $$0.c, $$0.f, ha.f, $$1.c, $$1.d, $$1.e);
        }
        if ($$5 > 1.0E-7) {
            $$3 = eed.a($$2, $$3, $$5, $$6, $$4, $$0.b, $$0.c, $$0.f, $$0.a, $$0.d, ha.a, $$1.d, $$1.e, $$1.c);
        } else if ($$5 < -1.0E-7) {
            $$3 = eed.a($$2, $$3, $$5, $$6, $$4, $$0.e, $$0.c, $$0.f, $$0.a, $$0.d, ha.b, $$1.d, $$1.e, $$1.c);
        }
        if ($$6 > 1.0E-7) {
            $$3 = eed.a($$2, $$3, $$6, $$4, $$5, $$0.c, $$0.a, $$0.d, $$0.b, $$0.e, ha.c, $$1.e, $$1.c, $$1.d);
        } else if ($$6 < -1.0E-7) {
            $$3 = eed.a($$2, $$3, $$6, $$4, $$5, $$0.f, $$0.a, $$0.d, $$0.b, $$0.e, ha.d, $$1.e, $$1.c, $$1.d);
        }
        return $$3;
    }

    @Nullable
    private static ha a(double[] $$0, @Nullable ha $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8, double $$9, ha $$10, double $$11, double $$12, double $$13) {
        double $$14 = ($$5 - $$11) / $$2;
        double $$15 = $$12 + $$14 * $$3;
        double $$16 = $$13 + $$14 * $$4;
        if (0.0 < $$14 && $$14 < $$0[0] && $$6 - 1.0E-7 < $$15 && $$15 < $$7 + 1.0E-7 && $$8 - 1.0E-7 < $$16 && $$16 < $$9 + 1.0E-7) {
            $$0[0] = $$14;
            return $$10;
        }
        return $$1;
    }

    public double e(eei $$0) {
        double $$1 = Math.max(Math.max(this.a - $$0.c, $$0.c - this.d), 0.0);
        double $$2 = Math.max(Math.max(this.b - $$0.d, $$0.d - this.e), 0.0);
        double $$3 = Math.max(Math.max(this.c - $$0.e, $$0.e - this.f), 0.0);
        return apa.e($$1, $$2, $$3);
    }

    public String toString() {
        return "AABB[" + this.a + ", " + this.b + ", " + this.c + "] -> [" + this.d + ", " + this.e + ", " + this.f + "]";
    }

    public boolean e() {
        return Double.isNaN(this.a) || Double.isNaN(this.b) || Double.isNaN(this.c) || Double.isNaN(this.d) || Double.isNaN(this.e) || Double.isNaN(this.f);
    }

    public eei f() {
        return new eei(apa.d(0.5, this.a, this.d), apa.d(0.5, this.b, this.e), apa.d(0.5, this.c, this.f));
    }

    public static eed a(eei $$0, double $$1, double $$2, double $$3) {
        return new eed($$0.c - $$1 / 2.0, $$0.d - $$2 / 2.0, $$0.e - $$3 / 2.0, $$0.c + $$1 / 2.0, $$0.d + $$2 / 2.0, $$0.e + $$3 / 2.0);
    }
}

