/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class enq<T> {
    private static final Logger c = LogUtils.getLogger();
    public static final e<Boolean> a = new e(ImmutableList.of((Object)Boolean.TRUE, (Object)Boolean.FALSE), Codec.BOOL);
    public static final b<Boolean> b = ($$0, $$1) -> $$1 != false ? sv.b : sv.c;
    private final l<T> d;
    final Function<T, sw> e;
    private final n<T> f;
    private final Codec<T> g;
    private final T h;
    private final Consumer<T> i;
    final sw j;
    T k;

    public static enq<Boolean> a(String $$0, boolean $$1, Consumer<Boolean> $$2) {
        return enq.a($$0, enq.a(), $$1, $$2);
    }

    public static enq<Boolean> a(String $$02, boolean $$1) {
        return enq.a($$02, enq.a(), $$1, $$0 -> {});
    }

    public static enq<Boolean> a(String $$02, l<Boolean> $$1, boolean $$2) {
        return enq.a($$02, $$1, $$2, $$0 -> {});
    }

    public static enq<Boolean> a(String $$0, l<Boolean> $$1, boolean $$2, Consumer<Boolean> $$3) {
        return enq.a($$0, $$1, b, $$2, $$3);
    }

    public static enq<Boolean> a(String $$0, l<Boolean> $$1, b<Boolean> $$2, boolean $$3, Consumer<Boolean> $$4) {
        return new enq<Boolean>($$0, $$1, $$2, a, $$3, $$4);
    }

    public enq(String $$0, l<T> $$1, b<T> $$2, n<T> $$3, T $$4, Consumer<T> $$5) {
        this($$0, $$1, $$2, $$3, $$3.f(), $$4, $$5);
    }

    public enq(String $$0, l<T> $$12, b<T> $$2, n<T> $$3, Codec<T> $$4, T $$5, Consumer<T> $$6) {
        this.j = sw.c($$0);
        this.d = $$12;
        this.e = $$1 -> $$2.toString(this.j, $$1);
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
        this.i = $$6;
        this.k = this.h;
    }

    public static <T> l<T> a() {
        return $$0 -> null;
    }

    public static <T> l<T> a(sw $$0) {
        return $$1 -> eqp.a($$0);
    }

    public static <T extends apc> b<T> b() {
        return ($$0, $$1) -> $$1.c();
    }

    public epf a(enr $$02, int $$1, int $$2, int $$3) {
        return this.a($$02, $$1, $$2, $$3, $$0 -> {});
    }

    public epf a(enr $$0, int $$1, int $$2, int $$3, Consumer<T> $$4) {
        return this.f.a(this.d, $$0, $$1, $$2, $$3, $$4).apply(this);
    }

    public T c() {
        return this.k;
    }

    public Codec<T> d() {
        return this.g;
    }

    public String toString() {
        return this.j.getString();
    }

    public void a(T $$0) {
        Object $$1 = this.f.a($$0).orElseGet(() -> {
            c.error("Illegal option value " + $$0 + " for " + this.j);
            return this.h;
        });
        if (!enn.N().q()) {
            this.k = $$1;
            return;
        }
        if (!Objects.equals(this.k, $$1)) {
            this.k = $$1;
            this.i.accept(this.k);
        }
    }

    public n<T> e() {
        return this.f;
    }

    @FunctionalInterface
    public static interface l<T> {
        @Nullable
        public eqp apply(T var1);
    }

    public static interface b<T> {
        public sw toString(sw var1, T var2);
    }

    public record e<T>(List<T> a, Codec<T> b) implements d<T>
    {
        private final List<T> a;
        private final Codec<T> b;

        @Override
        public Optional<T> a(T $$0) {
            return this.a.contains($$0) ? Optional.of($$0) : Optional.empty();
        }

        @Override
        public epp.c<T> a() {
            return epp.c.a(this.a);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "values;codec", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "values;codec", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "values;codec", "a", "b"}, this, $$0);
        }

        public List<T> b() {
            return this.a;
        }

        @Override
        public Codec<T> f() {
            return this.b;
        }
    }

    static interface n<T> {
        public Function<enq<T>, epf> a(l<T> var1, enr var2, int var3, int var4, int var5, Consumer<T> var6);

        public Optional<T> a(T var1);

        public Codec<T> f();
    }

    public static final class m
    extends Enum<m>
    implements k<Double> {
        public static final /* enum */ m a = new m();
        private static final /* synthetic */ m[] b;

        public static m[] values() {
            return (m[])b.clone();
        }

        public static m valueOf(String $$0) {
            return Enum.valueOf(m.class, $$0);
        }

        @Override
        public Optional<Double> a(Double $$0) {
            return $$0 >= 0.0 && $$0 <= 1.0 ? Optional.of($$0) : Optional.empty();
        }

        @Override
        public double b(Double $$0) {
            return $$0;
        }

        public Double a(double $$0) {
            return $$0;
        }

        public <R> k<R> a(final DoubleFunction<? extends R> $$0, final ToDoubleFunction<? super R> $$1) {
            return new k<R>(){

                @Override
                public Optional<R> a(R $$02) {
                    return this.a((Double)$$1.applyAsDouble($$02)).map($$0::apply);
                }

                @Override
                public double b(R $$02) {
                    return this.b((Double)$$1.applyAsDouble($$02));
                }

                @Override
                public R b(double $$02) {
                    return $$0.apply(this.a($$02));
                }

                @Override
                public Codec<R> f() {
                    return this.f().xmap($$0::apply, $$1::applyAsDouble);
                }
            };
        }

        @Override
        public Codec<Double> f() {
            return Codec.either((Codec)Codec.doubleRange((double)0.0, (double)1.0), (Codec)Codec.BOOL).xmap($$02 -> (Double)$$02.map($$0 -> $$0, $$0 -> $$0 != false ? 1.0 : 0.0), Either::left);
        }

        @Override
        public /* synthetic */ Object b(double d2) {
            return this.a(d2);
        }

        private static /* synthetic */ m[] a() {
            return new m[]{a};
        }

        static {
            b = m.a();
        }
    }

    public record c(int a, IntSupplier b, int c) implements g,
    j<Integer>
    {
        private final int a;
        private final IntSupplier b;
        private final int c;

        @Override
        public Optional<Integer> a(Integer $$0) {
            return Optional.of(apa.a((int)$$0, this.d(), this.b()));
        }

        @Override
        public int b() {
            return this.b.getAsInt();
        }

        @Override
        public Codec<Integer> f() {
            return aoi.a(Codec.INT, $$0 -> {
                int $$1 = this.c + 1;
                if ($$0.compareTo(this.a) >= 0 && $$0.compareTo($$1) <= 0) {
                    return DataResult.success((Object)$$0);
                }
                return DataResult.error(() -> "Value " + $$0 + " outside of range [" + this.a + ":" + $$1 + "]", (Object)$$0);
            });
        }

        @Override
        public boolean c() {
            return true;
        }

        @Override
        public epp.c<Integer> a() {
            return epp.c.a(IntStream.range(this.a, this.b() + 1).boxed().toList());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "minInclusive;maxSupplier;encodableMaxInclusive", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "minInclusive;maxSupplier;encodableMaxInclusive", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "minInclusive;maxSupplier;encodableMaxInclusive", "a", "b", "c"}, this, $$0);
        }

        @Override
        public int d() {
            return this.a;
        }

        public IntSupplier g() {
            return this.b;
        }

        public int h() {
            return this.c;
        }
    }

    public static final class f
    extends Record
    implements g {
        private final int a;
        private final int b;

        public f(int $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public Optional<Integer> a(Integer $$0) {
            return $$0.compareTo(this.d()) >= 0 && $$0.compareTo(this.b()) <= 0 ? Optional.of($$0) : Optional.empty();
        }

        @Override
        public Codec<Integer> f() {
            return Codec.intRange((int)this.a, (int)(this.b + 1));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "minInclusive;maxInclusive", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "minInclusive;maxInclusive", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "minInclusive;maxInclusive", "a", "b"}, this, $$0);
        }

        @Override
        public int d() {
            return this.a;
        }

        @Override
        public int b() {
            return this.b;
        }
    }

    static interface g
    extends k<Integer> {
        public int d();

        public int b();

        @Override
        default public double b(Integer $$0) {
            return apa.c($$0.intValue(), this.d(), this.b(), 0.0f, 1.0f);
        }

        default public Integer a(double $$0) {
            return apa.a(apa.b($$0, 0.0, 1.0, (double)this.d(), (double)this.b()));
        }

        default public <R> k<R> a(final IntFunction<? extends R> $$0, final ToIntFunction<? super R> $$1) {
            return new k<R>(){

                @Override
                public Optional<R> a(R $$02) {
                    return this.a(Integer.valueOf($$1.applyAsInt($$02))).map($$0::apply);
                }

                @Override
                public double b(R $$02) {
                    return this.b((Integer)$$1.applyAsInt($$02));
                }

                @Override
                public R b(double $$02) {
                    return $$0.apply(this.a($$02));
                }

                @Override
                public Codec<R> f() {
                    return this.f().xmap($$0::apply, $$1::applyAsInt);
                }
            };
        }

        @Override
        default public /* synthetic */ Object b(double d2) {
            return this.a(d2);
        }
    }

    static final class i<N>
    extends epa {
        private final enq<N> h;
        private final k<N> i;
        private final l<N> j;
        private final Consumer<N> k;

        i(enr $$0, int $$1, int $$2, int $$3, int $$4, enq<N> $$5, k<N> $$6, l<N> $$7, Consumer<N> $$8) {
            super($$0, $$1, $$2, $$3, $$4, $$6.b($$5.c()));
            this.h = $$5;
            this.i = $$6;
            this.j = $$7;
            this.k = $$8;
            this.b();
        }

        @Override
        protected void b() {
            this.b(this.h.e.apply(this.h.c()));
            this.a(this.j.apply(this.i.b(this.g)));
        }

        @Override
        protected void a() {
            this.h.a(this.i.b(this.g));
            this.a.aq();
            this.k.accept(this.h.c());
        }
    }

    public record h<T>(Supplier<List<T>> a, Function<T, Optional<T>> b, Codec<T> c) implements d<T>
    {
        private final Supplier<List<T>> a;
        private final Function<T, Optional<T>> b;
        private final Codec<T> c;

        @Override
        public Optional<T> a(T $$0) {
            return this.b.apply($$0);
        }

        @Override
        public epp.c<T> a() {
            return epp.c.a((Collection)this.a.get());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{h.class, "values;validateValue;codec", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{h.class, "values;validateValue;codec", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{h.class, "values;validateValue;codec", "a", "b", "c"}, this, $$0);
        }

        public Supplier<List<T>> b() {
            return this.a;
        }

        public Function<T, Optional<T>> c() {
            return this.b;
        }

        @Override
        public Codec<T> f() {
            return this.c;
        }
    }

    public record a<T>(List<T> a, List<T> b, BooleanSupplier c, d.a<T> d, Codec<T> e) implements d<T>
    {
        private final List<T> a;
        private final List<T> b;
        private final BooleanSupplier c;
        private final d.a<T> d;
        private final Codec<T> e;

        @Override
        public epp.c<T> a() {
            return epp.c.a(this.c, this.a, this.b);
        }

        @Override
        public Optional<T> a(T $$0) {
            return (this.c.getAsBoolean() ? this.b : this.a).contains($$0) ? Optional.of($$0) : Optional.empty();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "values;altValues;altCondition;valueSetter;codec", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "values;altValues;altCondition;valueSetter;codec", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "values;altValues;altCondition;valueSetter;codec", "a", "b", "c", "d", "e"}, this, $$0);
        }

        public List<T> b() {
            return this.a;
        }

        public List<T> c() {
            return this.b;
        }

        public BooleanSupplier d() {
            return this.c;
        }

        @Override
        public d.a<T> e() {
            return this.d;
        }

        @Override
        public Codec<T> f() {
            return this.e;
        }
    }

    static interface j<T>
    extends d<T>,
    k<T> {
        public boolean c();

        @Override
        default public Function<enq<T>, epf> a(l<T> $$0, enr $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
            if (this.c()) {
                return d.super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
            return k.super.a($$0, $$1, $$2, $$3, $$4, $$5);
        }
    }

    static interface d<T>
    extends n<T> {
        public epp.c<T> a();

        default public a<T> e() {
            return enq::a;
        }

        @Override
        default public Function<enq<T>, epf> a(l<T> $$0, enr $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
            return $$6 -> epp.a($$6.e).a(this.a()).a((epp.c<l>)((Object)$$0)).a((l)$$6.k).a($$2, $$3, $$4, 20, $$6.j, (epp<T> $$3, T $$4) -> {
                this.e().set((enq<Object>)$$6, $$4);
                $$1.aq();
                $$5.accept($$4);
            });
        }

        public static interface a<T> {
            public void set(enq<T> var1, T var2);
        }
    }

    static interface k<T>
    extends n<T> {
        public double b(T var1);

        public T b(double var1);

        @Override
        default public Function<enq<T>, epf> a(l<T> $$0, enr $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
            return $$6 -> new i($$1, $$2, $$3, $$4, 20, $$6, this, $$0, $$5);
        }
    }
}

