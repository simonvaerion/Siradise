/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.joml.Vector3f
 */
import com.mojang.serialization.Codec;
import java.util.EnumSet;
import java.util.List;
import org.joml.Vector3f;

public class eei
implements ho {
    public static final Codec<eei> a = Codec.DOUBLE.listOf().comapFlatMap($$02 -> ac.a($$02, 3).map($$0 -> new eei((Double)$$0.get(0), (Double)$$0.get(1), (Double)$$0.get(2))), $$0 -> List.of(Double.valueOf($$0.a()), Double.valueOf($$0.b()), Double.valueOf($$0.c())));
    public static final eei b = new eei(0.0, 0.0, 0.0);
    public final double c;
    public final double d;
    public final double e;

    public static eei a(int $$0) {
        double $$1 = (double)($$0 >> 16 & 0xFF) / 255.0;
        double $$2 = (double)($$0 >> 8 & 0xFF) / 255.0;
        double $$3 = (double)($$0 & 0xFF) / 255.0;
        return new eei($$1, $$2, $$3);
    }

    public static eei a(hz $$0) {
        return new eei($$0.u(), $$0.v(), $$0.w());
    }

    public static eei a(hz $$0, double $$1, double $$2, double $$3) {
        return new eei((double)$$0.u() + $$1, (double)$$0.v() + $$2, (double)$$0.w() + $$3);
    }

    public static eei b(hz $$0) {
        return eei.a($$0, 0.5, 0.5, 0.5);
    }

    public static eei c(hz $$0) {
        return eei.a($$0, 0.5, 0.0, 0.5);
    }

    public static eei a(hz $$0, double $$1) {
        return eei.a($$0, 0.5, $$1, 0.5);
    }

    public eei(double $$0, double $$1, double $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public eei(Vector3f $$0) {
        this($$0.x(), $$0.y(), $$0.z());
    }

    public eei a(eei $$0) {
        return new eei($$0.c - this.c, $$0.d - this.d, $$0.e - this.e);
    }

    public eei d() {
        double $$0 = Math.sqrt(this.c * this.c + this.d * this.d + this.e * this.e);
        if ($$0 < 1.0E-4) {
            return b;
        }
        return new eei(this.c / $$0, this.d / $$0, this.e / $$0);
    }

    public double b(eei $$0) {
        return this.c * $$0.c + this.d * $$0.d + this.e * $$0.e;
    }

    public eei c(eei $$0) {
        return new eei(this.d * $$0.e - this.e * $$0.d, this.e * $$0.c - this.c * $$0.e, this.c * $$0.d - this.d * $$0.c);
    }

    public eei d(eei $$0) {
        return this.a($$0.c, $$0.d, $$0.e);
    }

    public eei a(double $$0, double $$1, double $$2) {
        return this.b(-$$0, -$$1, -$$2);
    }

    public eei e(eei $$0) {
        return this.b($$0.c, $$0.d, $$0.e);
    }

    public eei b(double $$0, double $$1, double $$2) {
        return new eei(this.c + $$0, this.d + $$1, this.e + $$2);
    }

    public boolean a(ho $$0, double $$1) {
        return this.c($$0.a(), $$0.b(), $$0.c()) < $$1 * $$1;
    }

    public double f(eei $$0) {
        double $$1 = $$0.c - this.c;
        double $$2 = $$0.d - this.d;
        double $$3 = $$0.e - this.e;
        return Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
    }

    public double g(eei $$0) {
        double $$1 = $$0.c - this.c;
        double $$2 = $$0.d - this.d;
        double $$3 = $$0.e - this.e;
        return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
    }

    public double c(double $$0, double $$1, double $$2) {
        double $$3 = $$0 - this.c;
        double $$4 = $$1 - this.d;
        double $$5 = $$2 - this.e;
        return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
    }

    public eei a(double $$0) {
        return this.d($$0, $$0, $$0);
    }

    public eei e() {
        return this.a(-1.0);
    }

    public eei h(eei $$0) {
        return this.d($$0.c, $$0.d, $$0.e);
    }

    public eei d(double $$0, double $$1, double $$2) {
        return new eei(this.c * $$0, this.d * $$1, this.e * $$2);
    }

    public eei a(apf $$0, float $$1) {
        return this.b(($$0.i() - 0.5f) * $$1, ($$0.i() - 0.5f) * $$1, ($$0.i() - 0.5f) * $$1);
    }

    public double f() {
        return Math.sqrt(this.c * this.c + this.d * this.d + this.e * this.e);
    }

    public double g() {
        return this.c * this.c + this.d * this.d + this.e * this.e;
    }

    public double h() {
        return Math.sqrt(this.c * this.c + this.e * this.e);
    }

    public double i() {
        return this.c * this.c + this.e * this.e;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof eei)) {
            return false;
        }
        eei $$1 = (eei)$$0;
        if (Double.compare($$1.c, this.c) != 0) {
            return false;
        }
        if (Double.compare($$1.d, this.d) != 0) {
            return false;
        }
        return Double.compare($$1.e, this.e) == 0;
    }

    public int hashCode() {
        long $$0 = Double.doubleToLongBits(this.c);
        int $$1 = (int)($$0 ^ $$0 >>> 32);
        $$0 = Double.doubleToLongBits(this.d);
        $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
        $$0 = Double.doubleToLongBits(this.e);
        $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
        return $$1;
    }

    public String toString() {
        return "(" + this.c + ", " + this.d + ", " + this.e + ")";
    }

    public eei a(eei $$0, double $$1) {
        return new eei(apa.d($$1, this.c, $$0.c), apa.d($$1, this.d, $$0.d), apa.d($$1, this.e, $$0.e));
    }

    public eei a(float $$0) {
        float $$1 = apa.b($$0);
        float $$2 = apa.a($$0);
        double $$3 = this.c;
        double $$4 = this.d * (double)$$1 + this.e * (double)$$2;
        double $$5 = this.e * (double)$$1 - this.d * (double)$$2;
        return new eei($$3, $$4, $$5);
    }

    public eei b(float $$0) {
        float $$1 = apa.b($$0);
        float $$2 = apa.a($$0);
        double $$3 = this.c * (double)$$1 + this.e * (double)$$2;
        double $$4 = this.d;
        double $$5 = this.e * (double)$$1 - this.c * (double)$$2;
        return new eei($$3, $$4, $$5);
    }

    public eei c(float $$0) {
        float $$1 = apa.b($$0);
        float $$2 = apa.a($$0);
        double $$3 = this.c * (double)$$1 + this.d * (double)$$2;
        double $$4 = this.d * (double)$$1 - this.c * (double)$$2;
        double $$5 = this.e;
        return new eei($$3, $$4, $$5);
    }

    public static eei a(eeh $$0) {
        return eei.a($$0.i, $$0.j);
    }

    public static eei a(float $$0, float $$1) {
        float $$2 = apa.b(-$$1 * ((float)Math.PI / 180) - (float)Math.PI);
        float $$3 = apa.a(-$$1 * ((float)Math.PI / 180) - (float)Math.PI);
        float $$4 = -apa.b(-$$0 * ((float)Math.PI / 180));
        float $$5 = apa.a(-$$0 * ((float)Math.PI / 180));
        return new eei($$3 * $$4, $$5, $$2 * $$4);
    }

    public eei a(EnumSet<ha.a> $$0) {
        double $$1 = $$0.contains(ha.a.a) ? (double)apa.a(this.c) : this.c;
        double $$2 = $$0.contains(ha.a.b) ? (double)apa.a(this.d) : this.d;
        double $$3 = $$0.contains(ha.a.c) ? (double)apa.a(this.e) : this.e;
        return new eei($$1, $$2, $$3);
    }

    public double a(ha.a $$0) {
        return $$0.a(this.c, this.d, this.e);
    }

    public eei a(ha.a $$0, double $$1) {
        double $$2 = $$0 == ha.a.a ? $$1 : this.c;
        double $$3 = $$0 == ha.a.b ? $$1 : this.d;
        double $$4 = $$0 == ha.a.c ? $$1 : this.e;
        return new eei($$2, $$3, $$4);
    }

    public eei a(ha $$0, double $$1) {
        hz $$2 = $$0.q();
        return new eei(this.c + $$1 * (double)$$2.u(), this.d + $$1 * (double)$$2.v(), this.e + $$1 * (double)$$2.w());
    }

    @Override
    public final double a() {
        return this.c;
    }

    @Override
    public final double b() {
        return this.d;
    }

    @Override
    public final double c() {
        return this.e;
    }

    public Vector3f j() {
        return new Vector3f((float)this.c, (float)this.d, (float)this.e);
    }
}

