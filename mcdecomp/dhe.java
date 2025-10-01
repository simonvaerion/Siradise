/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.doubles.Double2DoubleFunction
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.doubles.Double2DoubleFunction;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.slf4j.Logger;

public final class dhe {
    private static final Codec<dhd> c = jb.ag.q().dispatch($$0 -> $$0.c().a(), Function.identity());
    protected static final double a = 1000000.0;
    static final Codec<Double> d = Codec.doubleRange((double)-1000000.0, (double)1000000.0);
    public static final Codec<dhd> b = Codec.either(d, c).xmap($$0 -> (dhd)$$0.map(dhe::a, Function.identity()), $$0 -> {
        if ($$0 instanceof h) {
            h $$1 = (h)$$0;
            return Either.left((Object)$$1.j());
        }
        return Either.right((Object)$$0);
    });

    public static Codec<? extends dhd> a(hr<Codec<? extends dhd>> $$0) {
        dhe.a($$0, "blend_alpha", dhe$d.e);
        dhe.a($$0, "blend_offset", f.e);
        dhe.a($$0, "beardifier", dhe$b.e);
        dhe.a($$0, "old_blended_noise", dwe.a);
        for (l.a a2 : l.a.values()) {
            dhe.a($$0, a2.c(), a2.g);
        }
        dhe.a($$0, "noise", o.e);
        dhe.a($$0, "end_islands", i.a);
        dhe.a($$0, "weird_scaled_sampler", z.a);
        dhe.a($$0, "shifted_noise", v.a);
        dhe.a($$0, "range_choice", q.e);
        dhe.a($$0, "shift_a", s.e);
        dhe.a($$0, "shift_b", t.e);
        dhe.a($$0, "shift", r.e);
        dhe.a($$0, "blend_density", e.e);
        dhe.a($$0, "clamp", g.a);
        for (Enum enum_ : k.a.values()) {
            dhe.a($$0, ((k.a)enum_).c(), ((k.a)enum_).h);
        }
        for (Enum enum_ : y.a.values()) {
            dhe.a($$0, ((y.a)enum_).c(), ((y.a)enum_).e);
        }
        dhe.a($$0, "spline", w.a);
        dhe.a($$0, "constant", h.e);
        return dhe.a($$0, "y_clamped_gradient", aa.a);
    }

    private static Codec<? extends dhd> a(hr<Codec<? extends dhd>> $$0, String $$1, aou<? extends dhd> $$2) {
        return hr.a($$0, $$1, $$2.a());
    }

    static <A, O> aou<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
        return aou.a($$0.fieldOf("argument").xmap($$1, $$2));
    }

    static <O> aou<O> a(Function<dhd, O> $$0, Function<O, dhd> $$1) {
        return dhe.a(dhd.d, $$0, $$1);
    }

    static <O> aou<O> a(BiFunction<dhd, dhd, O> $$0, Function<O, dhd> $$1, Function<O, dhd> $$2) {
        return aou.a(RecordCodecBuilder.mapCodec($$3 -> $$3.group((App)dhd.d.fieldOf("argument1").forGetter($$1), (App)dhd.d.fieldOf("argument2").forGetter($$2)).apply((Applicative)$$3, $$0)));
    }

    static <O> aou<O> a(MapCodec<O> $$0) {
        return aou.a($$0);
    }

    private dhe() {
    }

    public static dhd a(dhd $$0) {
        return new l(l.a.a, $$0);
    }

    public static dhd b(dhd $$0) {
        return new l(l.a.b, $$0);
    }

    public static dhd c(dhd $$0) {
        return new l(l.a.c, $$0);
    }

    public static dhd d(dhd $$0) {
        return new l(l.a.d, $$0);
    }

    public static dhd e(dhd $$0) {
        return new l(l.a.e, $$0);
    }

    public static dhd a(he<dwh.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
        return dhe.a((dhd)new o(new dhd.c($$0), $$1, $$2), $$3, $$4);
    }

    public static dhd a(he<dwh.a> $$0, double $$1, double $$2, double $$3) {
        return dhe.a($$0, 1.0, $$1, $$2, $$3);
    }

    public static dhd a(he<dwh.a> $$0, double $$1, double $$2) {
        return dhe.a($$0, 1.0, 1.0, $$1, $$2);
    }

    public static dhd a(dhd $$0, dhd $$1, double $$2, he<dwh.a> $$3) {
        return new v($$0, dhe.a(), $$1, $$2, 0.0, new dhd.c($$3));
    }

    public static dhd a(he<dwh.a> $$0) {
        return dhe.b($$0, 1.0, 1.0);
    }

    public static dhd b(he<dwh.a> $$0, double $$1, double $$2) {
        return new o(new dhd.c($$0), $$1, $$2);
    }

    public static dhd a(he<dwh.a> $$0, double $$1) {
        return dhe.b($$0, 1.0, $$1);
    }

    public static dhd a(dhd $$0, double $$1, double $$2, dhd $$3, dhd $$4) {
        return new q($$0, $$1, $$2, $$3, $$4);
    }

    public static dhd b(he<dwh.a> $$0) {
        return new s(new dhd.c($$0));
    }

    public static dhd c(he<dwh.a> $$0) {
        return new t(new dhd.c($$0));
    }

    public static dhd d(he<dwh.a> $$0) {
        return new r(new dhd.c($$0));
    }

    public static dhd f(dhd $$0) {
        return new e($$0);
    }

    public static dhd a(long $$0) {
        return new i($$0);
    }

    public static dhd a(dhd $$0, he<dwh.a> $$1, z.a $$2) {
        return new z($$0, new dhd.c($$1), $$2);
    }

    public static dhd a(dhd $$0, dhd $$1) {
        return y.a(y.a.a, $$0, $$1);
    }

    public static dhd b(dhd $$0, dhd $$1) {
        return y.a(y.a.b, $$0, $$1);
    }

    public static dhd c(dhd $$0, dhd $$1) {
        return y.a(y.a.c, $$0, $$1);
    }

    public static dhd d(dhd $$0, dhd $$1) {
        return y.a(y.a.d, $$0, $$1);
    }

    public static dhd a(aod<w.b, w.a> $$0) {
        return new w($$0);
    }

    public static dhd a() {
        return h.f;
    }

    public static dhd a(double $$0) {
        return new h($$0);
    }

    public static dhd a(int $$0, int $$1, double $$2, double $$3) {
        return new aa($$0, $$1, $$2, $$3);
    }

    public static dhd a(dhd $$0, k.a $$1) {
        return k.a($$1, $$0);
    }

    private static dhd a(dhd $$0, double $$1, double $$2) {
        double $$3 = ($$1 + $$2) * 0.5;
        double $$4 = ($$2 - $$1) * 0.5;
        return dhe.a(dhe.a($$3), dhe.b(dhe.a($$4), $$0));
    }

    public static dhd b() {
        return dhe$d.a;
    }

    public static dhd c() {
        return f.a;
    }

    public static dhd a(dhd $$0, dhd $$1, dhd $$2) {
        if ($$1 instanceof h) {
            h $$3 = (h)$$1;
            return dhe.a($$0, $$3.a, $$2);
        }
        dhd $$4 = dhe.d($$0);
        dhd $$5 = dhe.a(dhe.b($$4, dhe.a(-1.0)), dhe.a(1.0));
        return dhe.a(dhe.b($$1, $$5), dhe.b($$2, $$4));
    }

    public static dhd a(dhd $$0, double $$1, dhd $$2) {
        return dhe.a(dhe.b($$0, dhe.a($$2, dhe.a(-$$1))), dhe.a($$1));
    }

    protected static final class d
    extends Enum<d>
    implements dhd.d {
        public static final /* enum */ d a = new d();
        public static final aou<dhd> e;
        private static final /* synthetic */ d[] f;

        public static d[] values() {
            return (d[])f.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        @Override
        public double a(dhd.b $$0) {
            return 1.0;
        }

        @Override
        public void a(double[] $$0, dhd.a $$1) {
            Arrays.fill($$0, 1.0);
        }

        @Override
        public double a() {
            return 1.0;
        }

        @Override
        public double b() {
            return 1.0;
        }

        @Override
        public aou<? extends dhd> c() {
            return e;
        }

        private static /* synthetic */ d[] j() {
            return new d[]{a};
        }

        static {
            f = dhe$d.j();
            e = aou.a(MapCodec.unit((Object)a));
        }
    }

    protected static final class f
    extends Enum<f>
    implements dhd.d {
        public static final /* enum */ f a = new f();
        public static final aou<dhd> e;
        private static final /* synthetic */ f[] f;

        public static f[] values() {
            return (f[])f.clone();
        }

        public static f valueOf(String $$0) {
            return Enum.valueOf(f.class, $$0);
        }

        @Override
        public double a(dhd.b $$0) {
            return 0.0;
        }

        @Override
        public void a(double[] $$0, dhd.a $$1) {
            Arrays.fill($$0, 0.0);
        }

        @Override
        public double a() {
            return 0.0;
        }

        @Override
        public double b() {
            return 0.0;
        }

        @Override
        public aou<? extends dhd> c() {
            return e;
        }

        private static /* synthetic */ f[] j() {
            return new f[]{a};
        }

        static {
            f = dhe$f.j();
            e = aou.a(MapCodec.unit((Object)a));
        }
    }

    protected static final class b
    extends Enum<b>
    implements c {
        public static final /* enum */ b a = new b();
        private static final /* synthetic */ b[] f;

        public static b[] values() {
            return (b[])f.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        @Override
        public double a(dhd.b $$0) {
            return 0.0;
        }

        @Override
        public void a(double[] $$0, dhd.a $$1) {
            Arrays.fill($$0, 0.0);
        }

        @Override
        public double a() {
            return 0.0;
        }

        @Override
        public double b() {
            return 0.0;
        }

        private static /* synthetic */ b[] j() {
            return new b[]{a};
        }

        static {
            f = dhe$b.j();
        }
    }

    protected static final class l
    extends Record
    implements m {
        private final a a;
        private final dhd e;

        protected l(a $$0, dhd $$1) {
            this.a = $$0;
            this.e = $$1;
        }

        @Override
        public double a(dhd.b $$0) {
            return this.e.a($$0);
        }

        @Override
        public void a(double[] $$0, dhd.a $$1) {
            this.e.a($$0, $$1);
        }

        @Override
        public double a() {
            return this.e.a();
        }

        @Override
        public double b() {
            return this.e.b();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{l.class, "type;wrapped", "a", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{l.class, "type;wrapped", "a", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{l.class, "type;wrapped", "a", "e"}, this, $$0);
        }

        @Override
        public a j() {
            return this.a;
        }

        @Override
        public dhd k() {
            return this.e;
        }

        static final class a
        extends Enum<a>
        implements apr {
            public static final /* enum */ a a = new a("interpolated");
            public static final /* enum */ a b = new a("flat_cache");
            public static final /* enum */ a c = new a("cache_2d");
            public static final /* enum */ a d = new a("cache_once");
            public static final /* enum */ a e = new a("cache_all_in_cell");
            private final String f;
            final aou<m> g = dhe.a((dhd $$0) -> new l(this, (dhd)$$0), m::k);
            private static final /* synthetic */ a[] h;

            public static a[] values() {
                return (a[])h.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private a(String $$02) {
                this.f = $$02;
            }

            @Override
            public String c() {
                return this.f;
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b, c, d, e};
            }

            static {
                h = dhe$l$a.a();
            }
        }
    }

    protected static final class o
    extends Record
    implements dhd {
        private final dhd.c f;
        @Deprecated
        private final double g;
        private final double h;
        public static final MapCodec<o> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dhd.c.a.fieldOf("noise").forGetter(o::j), (App)Codec.DOUBLE.fieldOf("xz_scale").forGetter(o::k), (App)Codec.DOUBLE.fieldOf("y_scale").forGetter(o::l)).apply((Applicative)$$0, o::new));
        public static final aou<o> e = dhe.a(a);

        protected o(dhd.c $$0, @Deprecated double $$1, double $$2) {
            this.f = $$0;
            this.g = $$1;
            this.h = $$2;
        }

        @Override
        public double a(dhd.b $$0) {
            return this.f.a((double)$$0.a() * this.g, (double)$$0.b() * this.h, (double)$$0.c() * this.g);
        }

        @Override
        public void a(double[] $$0, dhd.a $$1) {
            $$1.a($$0, this);
        }

        @Override
        public dhd a(dhd.f $$0) {
            return $$0.apply(new o($$0.a(this.f), this.g, this.h));
        }

        @Override
        public double a() {
            return -this.b();
        }

        @Override
        public double b() {
            return this.f.a();
        }

        @Override
        public aou<? extends dhd> c() {
            return e;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{o.class, "noise;xzScale;yScale", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{o.class, "noise;xzScale;yScale", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{o.class, "noise;xzScale;yScale", "f", "g", "h"}, this, $$0);
        }

        public dhd.c j() {
            return this.f;
        }

        @Deprecated
        public double k() {
            return this.g;
        }

        public double l() {
            return this.h;
        }
    }

    protected static final class i
    implements dhd.d {
        public static final aou<i> a = aou.a(MapCodec.unit((Object)new i(0L)));
        private static final float e = -0.9f;
        private final dwk f;

        public i(long $$0) {
            dhl $$1 = new dhl($$0);
            $$1.b(17292);
            this.f = new dwk($$1);
        }

        private static float a(dwk $$0, int $$1, int $$2) {
            int $$3 = $$1 / 2;
            int $$4 = $$2 / 2;
            int $$5 = $$1 % 2;
            int $$6 = $$2 % 2;
            float $$7 = 100.0f - apa.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0f;
            $$7 = apa.a($$7, -100.0f, 80.0f);
            for (int $$8 = -12; $$8 <= 12; ++$$8) {
                for (int $$9 = -12; $$9 <= 12; ++$$9) {
                    long $$10 = $$3 + $$8;
                    long $$11 = $$4 + $$9;
                    if ($$10 * $$10 + $$11 * $$11 <= 4096L || !($$0.a($$10, $$11) < (double)-0.9f)) continue;
                    float $$12 = (apa.e($$10) * 3439.0f + apa.e($$11) * 147.0f) % 13.0f + 9.0f;
                    float $$13 = $$5 - $$8 * 2;
                    float $$14 = $$6 - $$9 * 2;
                    float $$15 = 100.0f - apa.c($$13 * $$13 + $$14 * $$14) * $$12;
                    $$15 = apa.a($$15, -100.0f, 80.0f);
                    $$7 = Math.max($$7, $$15);
                }
            }
            return $$7;
        }

        @Override
        public double a(dhd.b $$0) {
            return ((double)i.a(this.f, $$0.a() / 8, $$0.c() / 8) - 8.0) / 128.0;
        }

        @Override
        public double a() {
            return -0.84375;
        }

        @Override
        public double b() {
            return 0.5625;
        }

        @Override
        public aou<? extends dhd> c() {
            return a;
        }
    }

    protected static final class z
    extends Record
    implements x {
        private final dhd e;
        private final dhd.c f;
        private final a g;
        private static final MapCodec<z> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dhd.d.fieldOf("input").forGetter(z::j), (App)dhd.c.a.fieldOf("noise").forGetter(z::k), (App)a.c.fieldOf("rarity_value_mapper").forGetter(z::l)).apply((Applicative)$$0, z::new));
        public static final aou<z> a = dhe.a(h);

        protected z(dhd $$0, dhd.c $$1, a $$2) {
            this.e = $$0;
            this.f = $$1;
            this.g = $$2;
        }

        @Override
        public double a(dhd.b $$0, double $$1) {
            double $$2 = this.g.e.get($$1);
            return $$2 * Math.abs(this.f.a((double)$$0.a() / $$2, (double)$$0.b() / $$2, (double)$$0.c() / $$2));
        }

        @Override
        public dhd a(dhd.f $$0) {
            return $$0.apply(new z(this.e.a($$0), $$0.a(this.f), this.g));
        }

        @Override
        public double a() {
            return 0.0;
        }

        @Override
        public double b() {
            return this.g.f * this.f.a();
        }

        @Override
        public aou<? extends dhd> c() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{z.class, "input;noise;rarityValueMapper", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{z.class, "input;noise;rarityValueMapper", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{z.class, "input;noise;rarityValueMapper", "e", "f", "g"}, this, $$0);
        }

        @Override
        public dhd j() {
            return this.e;
        }

        public dhd.c k() {
            return this.f;
        }

        public a l() {
            return this.g;
        }

        public static final class a
        extends Enum<a>
        implements apr {
            public static final /* enum */ a a = new a("type_1", dhr.a::b, 2.0);
            public static final /* enum */ a b = new a("type_2", dhr.a::a, 3.0);
            public static final Codec<a> c;
            private final String d;
            final Double2DoubleFunction e;
            final double f;
            private static final /* synthetic */ a[] g;

            public static a[] values() {
                return (a[])g.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private a(String $$0, Double2DoubleFunction $$1, double $$2) {
                this.d = $$0;
                this.e = $$1;
                this.f = $$2;
            }

            @Override
            public String c() {
                return this.d;
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b};
            }

            static {
                g = dhe$z$a.a();
                c = apr.a(a::values);
            }
        }
    }

    protected static final class v
    extends Record
    implements dhd {
        private final dhd e;
        private final dhd f;
        private final dhd g;
        private final double h;
        private final double i;
        private final dhd.c j;
        private static final MapCodec<v> k = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dhd.d.fieldOf("shift_x").forGetter(v::j), (App)dhd.d.fieldOf("shift_y").forGetter(v::k), (App)dhd.d.fieldOf("shift_z").forGetter(v::l), (App)Codec.DOUBLE.fieldOf("xz_scale").forGetter(v::m), (App)Codec.DOUBLE.fieldOf("y_scale").forGetter(v::n), (App)dhd.c.a.fieldOf("noise").forGetter(v::o)).apply((Applicative)$$0, v::new));
        public static final aou<v> a = dhe.a(k);

        protected v(dhd $$0, dhd $$1, dhd $$2, double $$3, double $$4, dhd.c $$5) {
            this.e = $$0;
            this.f = $$1;
            this.g = $$2;
            this.h = $$3;
            this.i = $$4;
            this.j = $$5;
        }

        @Override
        public double a(dhd.b $$0) {
            double $$1 = (double)$$0.a() * this.h + this.e.a($$0);
            double $$2 = (double)$$0.b() * this.i + this.f.a($$0);
            double $$3 = (double)$$0.c() * this.h + this.g.a($$0);
            return this.j.a($$1, $$2, $$3);
        }

        @Override
        public void a(double[] $$0, dhd.a $$1) {
            $$1.a($$0, this);
        }

        @Override
        public dhd a(dhd.f $$0) {
            return $$0.apply(new v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
        }

        @Override
        public double a() {
            return -this.b();
        }

        @Override
        public double b() {
            return this.j.a();
        }

        @Override
        public aou<? extends dhd> c() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{v.class, "shiftX;shiftY;shiftZ;xzScale;yScale;noise", "e", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{v.class, "shiftX;shiftY;shiftZ;xzScale;yScale;noise", "e", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{v.class, "shiftX;shiftY;shiftZ;xzScale;yScale;noise", "e", "f", "g", "h", "i", "j"}, this, $$0);
        }

        public dhd j() {
            return this.e;
        }

        public dhd k() {
            return this.f;
        }

        public dhd l() {
            return this.g;
        }

        public double m() {
            return this.h;
        }

        public double n() {
            return this.i;
        }

        public dhd.c o() {
            return this.j;
        }
    }

    static final class q
    extends Record
    implements dhd {
        private final dhd f;
        private final double g;
        private final double h;
        private final dhd i;
        private final dhd j;
        public static final MapCodec<q> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dhd.d.fieldOf("input").forGetter(q::j), (App)d.fieldOf("min_inclusive").forGetter(q::k), (App)d.fieldOf("max_exclusive").forGetter(q::l), (App)dhd.d.fieldOf("when_in_range").forGetter(q::m), (App)dhd.d.fieldOf("when_out_of_range").forGetter(q::n)).apply((Applicative)$$0, q::new));
        public static final aou<q> e = dhe.a(a);

        q(dhd $$0, double $$1, double $$2, dhd $$3, dhd $$4) {
            this.f = $$0;
            this.g = $$1;
            this.h = $$2;
            this.i = $$3;
            this.j = $$4;
        }

        @Override
        public double a(dhd.b $$0) {
            double $$1 = this.f.a($$0);
            if ($$1 >= this.g && $$1 < this.h) {
                return this.i.a($$0);
            }
            return this.j.a($$0);
        }

        @Override
        public void a(double[] $$0, dhd.a $$1) {
            this.f.a($$0, $$1);
            for (int $$2 = 0; $$2 < $$0.length; ++$$2) {
                double $$3 = $$0[$$2];
                $$0[$$2] = $$3 >= this.g && $$3 < this.h ? this.i.a($$1.a($$2)) : this.j.a($$1.a($$2));
            }
        }

        @Override
        public dhd a(dhd.f $$0) {
            return $$0.apply(new q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
        }

        @Override
        public double a() {
            return Math.min(this.i.a(), this.j.a());
        }

        @Override
        public double b() {
            return Math.max(this.i.b(), this.j.b());
        }

        @Override
        public aou<? extends dhd> c() {
            return e;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{q.class, "input;minInclusive;maxExclusive;whenInRange;whenOutOfRange", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{q.class, "input;minInclusive;maxExclusive;whenInRange;whenOutOfRange", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{q.class, "input;minInclusive;maxExclusive;whenInRange;whenOutOfRange", "f", "g", "h", "i", "j"}, this, $$0);
        }

        public dhd j() {
            return this.f;
        }

        public double k() {
            return this.g;
        }

        public double l() {
            return this.h;
        }

        public dhd m() {
            return this.i;
        }

        public dhd n() {
            return this.j;
        }
    }

    protected static final class s
    extends Record
    implements u {
        private final dhd.c a;
        static final aou<s> e = dhe.a(dhd.c.a, s::new, s::j);

        protected s(dhd.c $$0) {
            this.a = $$0;
        }

        @Override
        public double a(dhd.b $$0) {
            return this.a($$0.a(), 0.0, $$0.c());
        }

        @Override
        public dhd a(dhd.f $$0) {
            return $$0.apply(new s($$0.a(this.a)));
        }

        @Override
        public aou<? extends dhd> c() {
            return e;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{s.class, "offsetNoise", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{s.class, "offsetNoise", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{s.class, "offsetNoise", "a"}, this, $$0);
        }

        @Override
        public dhd.c j() {
            return this.a;
        }
    }

    protected static final class t
    extends Record
    implements u {
        private final dhd.c a;
        static final aou<t> e = dhe.a(dhd.c.a, t::new, t::j);

        protected t(dhd.c $$0) {
            this.a = $$0;
        }

        @Override
        public double a(dhd.b $$0) {
            return this.a($$0.c(), $$0.a(), 0.0);
        }

        @Override
        public dhd a(dhd.f $$0) {
            return $$0.apply(new t($$0.a(this.a)));
        }

        @Override
        public aou<? extends dhd> c() {
            return e;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{t.class, "offsetNoise", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{t.class, "offsetNoise", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{t.class, "offsetNoise", "a"}, this, $$0);
        }

        @Override
        public dhd.c j() {
            return this.a;
        }
    }

    protected static final class r
    extends Record
    implements u {
        private final dhd.c a;
        static final aou<r> e = dhe.a(dhd.c.a, r::new, r::j);

        protected r(dhd.c $$0) {
            this.a = $$0;
        }

        @Override
        public double a(dhd.b $$0) {
            return this.a($$0.a(), $$0.b(), $$0.c());
        }

        @Override
        public dhd a(dhd.f $$0) {
            return $$0.apply(new r($$0.a(this.a)));
        }

        @Override
        public aou<? extends dhd> c() {
            return e;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{r.class, "offsetNoise", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{r.class, "offsetNoise", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{r.class, "offsetNoise", "a"}, this, $$0);
        }

        @Override
        public dhd.c j() {
            return this.a;
        }
    }

    record e(dhd a) implements x
    {
        private final dhd a;
        static final aou<e> e = dhe.a(e::new, e::j);

        @Override
        public double a(dhd.b $$0, double $$1) {
            return $$0.d().a($$0, $$1);
        }

        @Override
        public dhd a(dhd.f $$0) {
            return $$0.apply(new e(this.a.a($$0)));
        }

        @Override
        public double a() {
            return Double.NEGATIVE_INFINITY;
        }

        @Override
        public double b() {
            return Double.POSITIVE_INFINITY;
        }

        @Override
        public aou<? extends dhd> c() {
            return e;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "input", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "input", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "input", "a"}, this, $$0);
        }

        @Override
        public dhd j() {
            return this.a;
        }
    }

    protected static final class g
    extends Record
    implements p {
        private final dhd e;
        private final double f;
        private final double g;
        private static final MapCodec<g> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dhd.b.fieldOf("input").forGetter(g::as_), (App)d.fieldOf("min").forGetter(g::a), (App)d.fieldOf("max").forGetter(g::b)).apply((Applicative)$$0, g::new));
        public static final aou<g> a = dhe.a(h);

        protected g(dhd $$0, double $$1, double $$2) {
            this.e = $$0;
            this.f = $$1;
            this.g = $$2;
        }

        @Override
        public double a(double $$0) {
            return apa.a($$0, this.f, this.g);
        }

        @Override
        public dhd a(dhd.f $$0) {
            return new g(this.e.a($$0), this.f, this.g);
        }

        @Override
        public aou<? extends dhd> c() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{g.class, "input;minValue;maxValue", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{g.class, "input;minValue;maxValue", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{g.class, "input;minValue;maxValue", "e", "f", "g"}, this, $$0);
        }

        @Override
        public dhd as_() {
            return this.e;
        }

        @Override
        public double a() {
            return this.f;
        }

        @Override
        public double b() {
            return this.g;
        }
    }

    protected static final class k
    extends Record
    implements p {
        private final a a;
        private final dhd e;
        private final double f;
        private final double g;

        protected k(a $$0, dhd $$1, double $$2, double $$3) {
            this.a = $$0;
            this.e = $$1;
            this.f = $$2;
            this.g = $$3;
        }

        public static k a(a $$0, dhd $$1) {
            double $$2 = $$1.a();
            double $$3 = k.a($$0, $$2);
            double $$4 = k.a($$0, $$1.b());
            if ($$0 == a.a || $$0 == a.b) {
                return new k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
            }
            return new k($$0, $$1, $$3, $$4);
        }

        private static double a(a $$0, double $$1) {
            return switch ($$0) {
                default -> throw new IncompatibleClassChangeError();
                case a.a -> Math.abs($$1);
                case a.b -> $$1 * $$1;
                case a.c -> $$1 * $$1 * $$1;
                case a.d -> {
                    if ($$1 > 0.0) {
                        yield $$1;
                    }
                    yield $$1 * 0.5;
                }
                case a.e -> {
                    if ($$1 > 0.0) {
                        yield $$1;
                    }
                    yield $$1 * 0.25;
                }
                case a.f -> {
                    double $$2 = apa.a($$1, -1.0, 1.0);
                    yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
                }
            };
        }

        @Override
        public double a(double $$0) {
            return k.a(this.a, $$0);
        }

        public k b(dhd.f $$0) {
            return k.a(this.a, this.e.a($$0));
        }

        @Override
        public aou<? extends dhd> c() {
            return this.a.h;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{k.class, "type;input;minValue;maxValue", "a", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{k.class, "type;input;minValue;maxValue", "a", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{k.class, "type;input;minValue;maxValue", "a", "e", "f", "g"}, this, $$0);
        }

        public a k() {
            return this.a;
        }

        @Override
        public dhd as_() {
            return this.e;
        }

        @Override
        public double a() {
            return this.f;
        }

        @Override
        public double b() {
            return this.g;
        }

        @Override
        public /* synthetic */ dhd a(dhd.f f2) {
            return this.b(f2);
        }

        static final class a
        extends Enum<a>
        implements apr {
            public static final /* enum */ a a = new a("abs");
            public static final /* enum */ a b = new a("square");
            public static final /* enum */ a c = new a("cube");
            public static final /* enum */ a d = new a("half_negative");
            public static final /* enum */ a e = new a("quarter_negative");
            public static final /* enum */ a f = new a("squeeze");
            private final String g;
            final aou<k> h = dhe.a((dhd $$0) -> k.a(this, $$0), k::as_);
            private static final /* synthetic */ a[] i;

            public static a[] values() {
                return (a[])i.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private a(String $$02) {
                this.g = $$02;
            }

            @Override
            public String c() {
                return this.g;
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b, c, d, e, f};
            }

            static {
                i = dhe$k$a.a();
            }
        }
    }

    static interface y
    extends dhd {
        public static final Logger a = LogUtils.getLogger();

        public static y a(a $$0, dhd $$1, dhd $$2) {
            double $$10;
            double $$3 = $$1.a();
            double $$4 = $$2.a();
            double $$5 = $$1.b();
            double $$6 = $$2.b();
            if ($$0 == a.c || $$0 == a.d) {
                boolean $$8;
                boolean $$7 = $$3 >= $$6;
                boolean bl2 = $$8 = $$4 >= $$5;
                if ($$7 || $$8) {
                    a.warn("Creating a " + $$0 + " function between two non-overlapping inputs: " + $$1 + " and " + $$2);
                }
            }
            double $$9 = switch ($$0) {
                default -> throw new IncompatibleClassChangeError();
                case a.a -> $$3 + $$4;
                case a.d -> Math.max($$3, $$4);
                case a.c -> Math.min($$3, $$4);
                case a.b -> $$3 > 0.0 && $$4 > 0.0 ? $$3 * $$4 : ($$5 < 0.0 && $$6 < 0.0 ? $$5 * $$6 : Math.min($$3 * $$6, $$5 * $$4));
            };
            switch ($$0) {
                default: {
                    throw new IncompatibleClassChangeError();
                }
                case a: {
                    double d2 = $$5 + $$6;
                    break;
                }
                case d: {
                    double d2 = Math.max($$5, $$6);
                    break;
                }
                case c: {
                    double d2 = Math.min($$5, $$6);
                    break;
                }
                case b: {
                    double d2 = $$3 > 0.0 && $$4 > 0.0 ? $$5 * $$6 : ($$10 = $$5 < 0.0 && $$6 < 0.0 ? $$3 * $$4 : Math.max($$3 * $$4, $$5 * $$6));
                }
            }
            if ($$0 == a.b || $$0 == a.a) {
                if ($$1 instanceof h) {
                    h $$11 = (h)$$1;
                    return new n($$0 == a.a ? n.a.b : n.a.a, $$2, $$9, $$10, $$11.a);
                }
                if ($$2 instanceof h) {
                    h $$12 = (h)$$2;
                    return new n($$0 == a.a ? n.a.b : n.a.a, $$1, $$9, $$10, $$12.a);
                }
            }
            return new dhe$a($$0, $$1, $$2, $$9, $$10);
        }

        public a j();

        public dhd k();

        public dhd l();

        @Override
        default public aou<? extends dhd> c() {
            return this.j().e;
        }

        public static final class a
        extends Enum<a>
        implements apr {
            public static final /* enum */ a a = new a("add");
            public static final /* enum */ a b = new a("mul");
            public static final /* enum */ a c = new a("min");
            public static final /* enum */ a d = new a("max");
            final aou<y> e = dhe.a(($$0, $$1) -> y.a(this, $$0, $$1), y::k, y::l);
            private final String f;
            private static final /* synthetic */ a[] g;

            public static a[] values() {
                return (a[])g.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private a(String $$02) {
                this.f = $$02;
            }

            @Override
            public String c() {
                return this.f;
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b, c, d};
            }

            static {
                g = dhe$y$a.a();
            }
        }
    }

    public static final class w
    extends Record
    implements dhd {
        private final aod<b, a> e;
        private static final Codec<aod<b, a>> f = aod.a(a.b);
        private static final MapCodec<w> g = f.fieldOf("spline").xmap(w::new, w::j);
        public static final aou<w> a = dhe.a(g);

        public w(aod<b, a> $$0) {
            this.e = $$0;
        }

        @Override
        public double a(dhd.b $$0) {
            return this.e.a(new b($$0));
        }

        @Override
        public double a() {
            return this.e.b();
        }

        @Override
        public double b() {
            return this.e.c();
        }

        @Override
        public void a(double[] $$0, dhd.a $$1) {
            $$1.a($$0, this);
        }

        @Override
        public dhd a(dhd.f $$0) {
            return $$0.apply(new w(this.e.a((I $$1) -> $$1.a($$0))));
        }

        @Override
        public aou<? extends dhd> c() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{w.class, "spline", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{w.class, "spline", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{w.class, "spline", "e"}, this, $$0);
        }

        public aod<b, a> j() {
            return this.e;
        }

        public record b(dhd.b a) {
            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "context", "a"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "context", "a"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "context", "a"}, this, $$0);
            }
        }

        public record a(he<dhd> c) implements apx<b>
        {
            private final he<dhd> c;
            public static final Codec<a> b = dhd.c.xmap(a::new, a::a);

            @Override
            public String toString() {
                Optional<acp<dhd>> $$0 = this.c.e();
                if ($$0.isPresent()) {
                    acp<dhd> $$1 = $$0.get();
                    if ($$1 == dhr.d) {
                        return "continents";
                    }
                    if ($$1 == dhr.e) {
                        return "erosion";
                    }
                    if ($$1 == dhr.f) {
                        return "weirdness";
                    }
                    if ($$1 == dhr.g) {
                        return "ridges";
                    }
                }
                return "Coordinate[" + this.c + "]";
            }

            @Override
            public float a(b $$0) {
                return (float)this.c.a().a($$0.a());
            }

            @Override
            public float b() {
                return this.c.b() ? (float)this.c.a().a() : Float.NEGATIVE_INFINITY;
            }

            @Override
            public float c() {
                return this.c.b() ? (float)this.c.a().b() : Float.POSITIVE_INFINITY;
            }

            public a a(dhd.f $$0) {
                return new a(new he.a<dhd>(this.c.a().a($$0)));
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "function", "c"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "function", "c"}, this, $$0);
            }

            public he<dhd> a() {
                return this.c;
            }
        }
    }

    static final class h
    extends Record
    implements dhd.d {
        final double a;
        static final aou<h> e = dhe.a(d, h::new, h::j);
        static final h f = new h(0.0);

        h(double $$0) {
            this.a = $$0;
        }

        @Override
        public double a(dhd.b $$0) {
            return this.a;
        }

        @Override
        public void a(double[] $$0, dhd.a $$1) {
            Arrays.fill($$0, this.a);
        }

        @Override
        public double a() {
            return this.a;
        }

        @Override
        public double b() {
            return this.a;
        }

        @Override
        public aou<? extends dhd> c() {
            return e;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{h.class, "value", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{h.class, "value", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{h.class, "value", "a"}, this, $$0);
        }

        public double j() {
            return this.a;
        }
    }

    static final class aa
    extends Record
    implements dhd.d {
        private final int e;
        private final int f;
        private final double g;
        private final double h;
        private static final MapCodec<aa> i = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.intRange((int)(dfk.e * 2), (int)(dfk.d * 2)).fieldOf("from_y").forGetter(aa::j), (App)Codec.intRange((int)(dfk.e * 2), (int)(dfk.d * 2)).fieldOf("to_y").forGetter(aa::k), (App)d.fieldOf("from_value").forGetter(aa::l), (App)d.fieldOf("to_value").forGetter(aa::m)).apply((Applicative)$$0, aa::new));
        public static final aou<aa> a = dhe.a(i);

        aa(int $$0, int $$1, double $$2, double $$3) {
            this.e = $$0;
            this.f = $$1;
            this.g = $$2;
            this.h = $$3;
        }

        @Override
        public double a(dhd.b $$0) {
            return apa.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
        }

        @Override
        public double a() {
            return Math.min(this.g, this.h);
        }

        @Override
        public double b() {
            return Math.max(this.g, this.h);
        }

        @Override
        public aou<? extends dhd> c() {
            return a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{aa.class, "fromY;toY;fromValue;toValue", "e", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aa.class, "fromY;toY;fromValue;toValue", "e", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aa.class, "fromY;toY;fromValue;toValue", "e", "f", "g", "h"}, this, $$0);
        }

        public int j() {
            return this.e;
        }

        public int k() {
            return this.f;
        }

        public double l() {
            return this.g;
        }

        public double m() {
            return this.h;
        }
    }

    static final class a
    extends Record
    implements y {
        private final y.a e;
        private final dhd f;
        private final dhd g;
        private final double h;
        private final double i;

        a(y.a $$0, dhd $$1, dhd $$2, double $$3, double $$4) {
            this.e = $$0;
            this.f = $$1;
            this.g = $$2;
            this.h = $$3;
            this.i = $$4;
        }

        @Override
        public double a(dhd.b $$0) {
            double $$1 = this.f.a($$0);
            return switch (this.e) {
                default -> throw new IncompatibleClassChangeError();
                case y.a.a -> $$1 + this.g.a($$0);
                case y.a.b -> {
                    if ($$1 == 0.0) {
                        yield 0.0;
                    }
                    yield $$1 * this.g.a($$0);
                }
                case y.a.c -> {
                    if ($$1 < this.g.a()) {
                        yield $$1;
                    }
                    yield Math.min($$1, this.g.a($$0));
                }
                case y.a.d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
            };
        }

        @Override
        public void a(double[] $$0, dhd.a $$1) {
            this.f.a($$0, $$1);
            switch (this.e) {
                case a: {
                    double[] $$2 = new double[$$0.length];
                    this.g.a($$2, $$1);
                    for (int $$3 = 0; $$3 < $$0.length; ++$$3) {
                        $$0[$$3] = $$0[$$3] + $$2[$$3];
                    }
                    break;
                }
                case b: {
                    for (int $$4 = 0; $$4 < $$0.length; ++$$4) {
                        double $$5 = $$0[$$4];
                        $$0[$$4] = $$5 == 0.0 ? 0.0 : $$5 * this.g.a($$1.a($$4));
                    }
                    break;
                }
                case c: {
                    double $$6 = this.g.a();
                    for (int $$7 = 0; $$7 < $$0.length; ++$$7) {
                        double $$8 = $$0[$$7];
                        $$0[$$7] = $$8 < $$6 ? $$8 : Math.min($$8, this.g.a($$1.a($$7)));
                    }
                    break;
                }
                case d: {
                    double $$9 = this.g.b();
                    for (int $$10 = 0; $$10 < $$0.length; ++$$10) {
                        double $$11 = $$0[$$10];
                        $$0[$$10] = $$11 > $$9 ? $$11 : Math.max($$11, this.g.a($$1.a($$10)));
                    }
                    break;
                }
            }
        }

        @Override
        public dhd a(dhd.f $$0) {
            return $$0.apply(y.a(this.e, this.f.a($$0), this.g.a($$0)));
        }

        @Override
        public double a() {
            return this.h;
        }

        @Override
        public double b() {
            return this.i;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "type;argument1;argument2;minValue;maxValue", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "type;argument1;argument2;minValue;maxValue", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "type;argument1;argument2;minValue;maxValue", "e", "f", "g", "h", "i"}, this, $$0);
        }

        @Override
        public y.a j() {
            return this.e;
        }

        @Override
        public dhd k() {
            return this.f;
        }

        @Override
        public dhd l() {
            return this.g;
        }
    }

    static final class n
    extends Record
    implements p,
    y {
        private final a e;
        private final dhd f;
        private final double g;
        private final double h;
        private final double i;

        n(a $$0, dhd $$1, double $$2, double $$3, double $$4) {
            this.e = $$0;
            this.f = $$1;
            this.g = $$2;
            this.h = $$3;
            this.i = $$4;
        }

        @Override
        public y.a j() {
            return this.e == a.a ? y.a.b : y.a.a;
        }

        @Override
        public dhd k() {
            return dhe.a(this.i);
        }

        @Override
        public dhd l() {
            return this.f;
        }

        @Override
        public double a(double $$0) {
            return switch (this.e) {
                default -> throw new IncompatibleClassChangeError();
                case a.a -> $$0 * this.i;
                case a.b -> $$0 + this.i;
            };
        }

        @Override
        public dhd a(dhd.f $$0) {
            double $$9;
            double $$8;
            dhd $$1 = this.f.a($$0);
            double $$2 = $$1.a();
            double $$3 = $$1.b();
            if (this.e == a.b) {
                double $$4 = $$2 + this.i;
                double $$5 = $$3 + this.i;
            } else if (this.i >= 0.0) {
                double $$6 = $$2 * this.i;
                double $$7 = $$3 * this.i;
            } else {
                $$8 = $$3 * this.i;
                $$9 = $$2 * this.i;
            }
            return new n(this.e, $$1, $$8, $$9, this.i);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{n.class, "specificType;input;minValue;maxValue;argument", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{n.class, "specificType;input;minValue;maxValue;argument", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{n.class, "specificType;input;minValue;maxValue;argument", "e", "f", "g", "h", "i"}, this, $$0);
        }

        public a m() {
            return this.e;
        }

        @Override
        public dhd as_() {
            return this.f;
        }

        @Override
        public double a() {
            return this.g;
        }

        @Override
        public double b() {
            return this.h;
        }

        public double n() {
            return this.i;
        }

        static final class a
        extends Enum<a> {
            public static final /* enum */ a a = new a();
            public static final /* enum */ a b = new a();
            private static final /* synthetic */ a[] c;

            public static a[] values() {
                return (a[])c.clone();
            }

            public static a valueOf(String $$0) {
                return Enum.valueOf(a.class, $$0);
            }

            private static /* synthetic */ a[] a() {
                return new a[]{a, b};
            }

            static {
                c = dhe$n$a.a();
            }
        }
    }

    static interface u
    extends dhd {
        public dhd.c j();

        @Override
        default public double a() {
            return -this.b();
        }

        @Override
        default public double b() {
            return this.j().a() * 4.0;
        }

        default public double a(double $$0, double $$1, double $$2) {
            return this.j().a($$0 * 0.25, $$1 * 0.25, $$2 * 0.25) * 4.0;
        }

        @Override
        default public void a(double[] $$0, dhd.a $$1) {
            $$1.a($$0, this);
        }
    }

    public static interface m
    extends dhd {
        public l.a j();

        public dhd k();

        @Override
        default public aou<? extends dhd> c() {
            return this.j().g;
        }

        @Override
        default public dhd a(dhd.f $$0) {
            return $$0.apply(new l(this.j(), this.k().a($$0)));
        }
    }

    @aqa
    public record j(he<dhd> a) implements dhd
    {
        private final he<dhd> a;

        @Override
        public double a(dhd.b $$0) {
            return this.a.a().a($$0);
        }

        @Override
        public void a(double[] $$0, dhd.a $$1) {
            this.a.a().a($$0, $$1);
        }

        @Override
        public dhd a(dhd.f $$0) {
            return $$0.apply(new j(new he.a<dhd>(this.a.a().a($$0))));
        }

        @Override
        public double a() {
            return this.a.b() ? this.a.a().a() : Double.NEGATIVE_INFINITY;
        }

        @Override
        public double b() {
            return this.a.b() ? this.a.a().b() : Double.POSITIVE_INFINITY;
        }

        @Override
        public aou<? extends dhd> c() {
            throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{j.class, "function", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{j.class, "function", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{j.class, "function", "a"}, this, $$0);
        }

        public he<dhd> j() {
            return this.a;
        }
    }

    public static interface c
    extends dhd.d {
        public static final aou<dhd> e = aou.a(MapCodec.unit((Object)dhe$b.a));

        @Override
        default public aou<? extends dhd> c() {
            return e;
        }
    }

    static interface p
    extends dhd {
        public dhd as_();

        @Override
        default public double a(dhd.b $$0) {
            return this.a(this.as_().a($$0));
        }

        @Override
        default public void a(double[] $$0, dhd.a $$1) {
            this.as_().a($$0, $$1);
            for (int $$2 = 0; $$2 < $$0.length; ++$$2) {
                $$0[$$2] = this.a($$0[$$2]);
            }
        }

        public double a(double var1);
    }

    static interface x
    extends dhd {
        public dhd j();

        @Override
        default public double a(dhd.b $$0) {
            return this.a($$0, this.j().a($$0));
        }

        @Override
        default public void a(double[] $$0, dhd.a $$1) {
            this.j().a($$0, $$1);
            for (int $$2 = 0; $$2 < $$0.length; ++$$2) {
                $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
            }
        }

        public double a(dhd.b var1, double var2);
    }
}

