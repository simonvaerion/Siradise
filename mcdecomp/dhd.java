/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import javax.annotation.Nullable;

public interface dhd {
    public static final Codec<dhd> b = dhe.b;
    public static final Codec<he<dhd>> c = acm.a(jc.at, b);
    public static final Codec<dhd> d = c.xmap(dhe.j::new, $$0 -> {
        if ($$0 instanceof dhe.j) {
            dhe.j $$1 = (dhe.j)$$0;
            return $$1.j();
        }
        return new he.a<dhd>((dhd)$$0);
    });

    public double a(b var1);

    public void a(double[] var1, a var2);

    public dhd a(f var1);

    public double a();

    public double b();

    public aou<? extends dhd> c();

    default public dhd a(double $$0, double $$1) {
        return new dhe.g(this, $$0, $$1);
    }

    default public dhd d() {
        return dhe.a(this, dhe.k.a.a);
    }

    default public dhd e() {
        return dhe.a(this, dhe.k.a.b);
    }

    default public dhd f() {
        return dhe.a(this, dhe.k.a.c);
    }

    default public dhd g() {
        return dhe.a(this, dhe.k.a.d);
    }

    default public dhd h() {
        return dhe.a(this, dhe.k.a.e);
    }

    default public dhd i() {
        return dhe.a(this, dhe.k.a.f);
    }

    public record e(int a, int b, int c) implements b
    {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "blockX;blockY;blockZ", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "blockX;blockY;blockZ", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "blockX;blockY;blockZ", "a", "b", "c"}, this, $$0);
        }
    }

    public static interface b {
        public int a();

        public int b();

        public int c();

        default public dim d() {
            return dim.a();
        }
    }

    public static interface d
    extends dhd {
        @Override
        default public void a(double[] $$0, a $$1) {
            $$1.a($$0, this);
        }

        @Override
        default public dhd a(f $$0) {
            return $$0.apply(this);
        }
    }

    public static interface f {
        public dhd apply(dhd var1);

        default public c a(c $$0) {
            return $$0;
        }
    }

    public record c(he<dwh.a> b, @Nullable dwh c) {
        public static final Codec<c> a = dwh.a.b.xmap($$0 -> new c((he<dwh.a>)$$0, null), c::b);

        public c(he<dwh.a> $$0) {
            this($$0, null);
        }

        public double a(double $$0, double $$1, double $$2) {
            return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
        }

        public double a() {
            return this.c == null ? 2.0 : this.c.a();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "noiseData;noise", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "noiseData;noise", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "noiseData;noise", "b", "c"}, this, $$0);
        }
    }

    public static interface a {
        public b a(int var1);

        public void a(double[] var1, dhd var2);
    }
}

