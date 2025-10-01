/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  javax.annotation.concurrent.Immutable
 */
import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.stream.IntStream;
import javax.annotation.concurrent.Immutable;

@Immutable
public class hz
implements Comparable<hz> {
    public static final Codec<hz> f = Codec.INT_STREAM.comapFlatMap($$02 -> ac.a($$02, 3).map($$0 -> new hz($$0[0], $$0[1], $$0[2])), $$0 -> IntStream.of($$0.u(), $$0.v(), $$0.w()));
    public static final hz g = new hz(0, 0, 0);
    private int a;
    private int b;
    private int c;

    public static Codec<hz> v(int $$0) {
        return aoi.a(f, (T $$1) -> {
            if (Math.abs($$1.u()) < $$0 && Math.abs($$1.v()) < $$0 && Math.abs($$1.w()) < $$0) {
                return DataResult.success((Object)$$1);
            }
            return DataResult.error(() -> "Position out of range, expected at most " + $$0 + ": " + $$1);
        });
    }

    public hz(int $$0, int $$1, int $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof hz)) {
            return false;
        }
        hz $$1 = (hz)$$0;
        if (this.u() != $$1.u()) {
            return false;
        }
        if (this.v() != $$1.v()) {
            return false;
        }
        return this.w() == $$1.w();
    }

    public int hashCode() {
        return (this.v() + this.w() * 31) * 31 + this.u();
    }

    public int i(hz $$0) {
        if (this.v() == $$0.v()) {
            if (this.w() == $$0.w()) {
                return this.u() - $$0.u();
            }
            return this.w() - $$0.w();
        }
        return this.v() - $$0.v();
    }

    public int u() {
        return this.a;
    }

    public int v() {
        return this.b;
    }

    public int w() {
        return this.c;
    }

    protected hz u(int $$0) {
        this.a = $$0;
        return this;
    }

    protected hz t(int $$0) {
        this.b = $$0;
        return this;
    }

    protected hz s(int $$0) {
        this.c = $$0;
        return this;
    }

    public hz c(int $$0, int $$1, int $$2) {
        if ($$0 == 0 && $$1 == 0 && $$2 == 0) {
            return this;
        }
        return new hz(this.u() + $$0, this.v() + $$1, this.w() + $$2);
    }

    public hz f(hz $$0) {
        return this.c($$0.u(), $$0.v(), $$0.w());
    }

    public hz e(hz $$0) {
        return this.c(-$$0.u(), -$$0.v(), -$$0.w());
    }

    public hz o(int $$0) {
        if ($$0 == 1) {
            return this;
        }
        if ($$0 == 0) {
            return g;
        }
        return new hz(this.u() * $$0, this.v() * $$0, this.w() * $$0);
    }

    public hz p() {
        return this.n(1);
    }

    public hz n(int $$0) {
        return this.b(ha.b, $$0);
    }

    public hz o() {
        return this.m(1);
    }

    public hz m(int $$0) {
        return this.b(ha.a, $$0);
    }

    public hz n() {
        return this.l(1);
    }

    public hz l(int $$0) {
        return this.b(ha.c, $$0);
    }

    public hz m() {
        return this.k(1);
    }

    public hz k(int $$0) {
        return this.b(ha.d, $$0);
    }

    public hz l() {
        return this.j(1);
    }

    public hz j(int $$0) {
        return this.b(ha.e, $$0);
    }

    public hz k() {
        return this.i(1);
    }

    public hz i(int $$0) {
        return this.b(ha.f, $$0);
    }

    public hz b(ha $$0) {
        return this.b($$0, 1);
    }

    public hz b(ha $$0, int $$1) {
        if ($$1 == 0) {
            return this;
        }
        return new hz(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
    }

    public hz b(ha.a $$0, int $$1) {
        if ($$1 == 0) {
            return this;
        }
        int $$2 = $$0 == ha.a.a ? $$1 : 0;
        int $$3 = $$0 == ha.a.b ? $$1 : 0;
        int $$4 = $$0 == ha.a.c ? $$1 : 0;
        return new hz(this.u() + $$2, this.v() + $$3, this.w() + $$4);
    }

    public hz d(hz $$0) {
        return new hz(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
    }

    public boolean a(hz $$0, double $$1) {
        return this.j($$0) < apa.k($$1);
    }

    public boolean a(ho $$0, double $$1) {
        return this.b($$0) < apa.k($$1);
    }

    public double j(hz $$0) {
        return this.d($$0.u(), $$0.v(), $$0.w());
    }

    public double b(ho $$0) {
        return this.c($$0.a(), $$0.b(), $$0.c());
    }

    public double c(double $$0, double $$1, double $$2) {
        double $$3 = (double)this.u() + 0.5 - $$0;
        double $$4 = (double)this.v() + 0.5 - $$1;
        double $$5 = (double)this.w() + 0.5 - $$2;
        return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
    }

    public double d(double $$0, double $$1, double $$2) {
        double $$3 = (double)this.u() - $$0;
        double $$4 = (double)this.v() - $$1;
        double $$5 = (double)this.w() - $$2;
        return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
    }

    public int k(hz $$0) {
        float $$1 = Math.abs($$0.u() - this.u());
        float $$2 = Math.abs($$0.v() - this.v());
        float $$3 = Math.abs($$0.w() - this.w());
        return (int)($$1 + $$2 + $$3);
    }

    public int a(ha.a $$0) {
        return $$0.a(this.a, this.b, this.c);
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("x", this.u()).add("y", this.v()).add("z", this.w()).toString();
    }

    public String x() {
        return this.u() + ", " + this.v() + ", " + this.w();
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.i((hz)object);
    }
}

