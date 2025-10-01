/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class kx {
    private final Map<ky, List<kz>> a = Maps.newHashMap();

    protected void a(ky $$0, List<kz> $$1) {
        List<kz> $$2 = this.a.put($$0, $$1);
        if ($$2 != null) {
            throw new IllegalStateException("Value " + $$0 + " is already defined");
        }
    }

    Map<ky, List<kz>> a() {
        this.c();
        return ImmutableMap.copyOf(this.a);
    }

    private void c() {
        List<dde<?>> $$02 = this.b();
        Stream<ky> $$12 = Stream.of(ky.a());
        for (dde<?> $$2 : $$02) {
            $$12 = $$12.flatMap($$1 -> $$2.c().map($$1::a));
        }
        List $$3 = $$12.filter($$0 -> !this.a.containsKey($$0)).collect(Collectors.toList());
        if (!$$3.isEmpty()) {
            throw new IllegalStateException("Missing definition for properties: " + $$3);
        }
    }

    abstract List<dde<?>> b();

    public static <T1 extends Comparable<T1>> a<T1> a(dde<T1> $$0) {
        return new a<T1>($$0);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> b<T1, T2> a(dde<T1> $$0, dde<T2> $$1) {
        return new b<T1, T2>($$0, $$1);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> c<T1, T2, T3> a(dde<T1> $$0, dde<T2> $$1, dde<T3> $$2) {
        return new c<T1, T2, T3>($$0, $$1, $$2);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> d<T1, T2, T3, T4> a(dde<T1> $$0, dde<T2> $$1, dde<T3> $$2, dde<T4> $$3) {
        return new d<T1, T2, T3, T4>($$0, $$1, $$2, $$3);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> e<T1, T2, T3, T4, T5> a(dde<T1> $$0, dde<T2> $$1, dde<T3> $$2, dde<T4> $$3, dde<T5> $$4) {
        return new e<T1, T2, T3, T4, T5>($$0, $$1, $$2, $$3, $$4);
    }

    public static class a<T1 extends Comparable<T1>>
    extends kx {
        private final dde<T1> a;

        a(dde<T1> $$0) {
            this.a = $$0;
        }

        @Override
        public List<dde<?>> b() {
            return ImmutableList.of(this.a);
        }

        public a<T1> a(T1 $$0, List<kz> $$1) {
            ky $$2 = ky.a(this.a.b($$0));
            this.a($$2, $$1);
            return this;
        }

        public a<T1> a(T1 $$0, kz $$1) {
            return this.a($$0, Collections.singletonList($$1));
        }

        public kx a(Function<T1, kz> $$0) {
            this.a.a().forEach($$1 -> this.a($$1, (kz)$$0.apply($$1)));
            return this;
        }

        public kx b(Function<T1, List<kz>> $$0) {
            this.a.a().forEach($$1 -> this.a($$1, (List<kz>)((List)$$0.apply($$1))));
            return this;
        }
    }

    public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>>
    extends kx {
        private final dde<T1> a;
        private final dde<T2> b;

        b(dde<T1> $$0, dde<T2> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public List<dde<?>> b() {
            return ImmutableList.of(this.a, this.b);
        }

        public b<T1, T2> a(T1 $$0, T2 $$1, List<kz> $$2) {
            ky $$3 = ky.a(this.a.b($$0), this.b.b($$1));
            this.a($$3, $$2);
            return this;
        }

        public b<T1, T2> a(T1 $$0, T2 $$1, kz $$2) {
            return this.a($$0, $$1, Collections.singletonList($$2));
        }

        public kx a(BiFunction<T1, T2, kz> $$0) {
            this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a($$1, $$2, (kz)$$0.apply($$1, $$2))));
            return this;
        }

        public kx b(BiFunction<T1, T2, List<kz>> $$0) {
            this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a($$1, $$2, (List)$$0.apply($$1, $$2))));
            return this;
        }
    }

    public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>>
    extends kx {
        private final dde<T1> a;
        private final dde<T2> b;
        private final dde<T3> c;

        c(dde<T1> $$0, dde<T2> $$1, dde<T3> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public List<dde<?>> b() {
            return ImmutableList.of(this.a, this.b, this.c);
        }

        public c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<kz> $$3) {
            ky $$4 = ky.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
            this.a($$4, $$3);
            return this;
        }

        public c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, kz $$3) {
            return this.a($$0, $$1, $$2, Collections.singletonList($$3));
        }

        public kx a(h<T1, T2, T3, kz> $$0) {
            this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a($$1, $$2, $$3, (kz)$$0.apply($$1, $$2, $$3)))));
            return this;
        }

        public kx b(h<T1, T2, T3, List<kz>> $$0) {
            this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a($$1, $$2, $$3, (List)$$0.apply($$1, $$2, $$3)))));
            return this;
        }
    }

    public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>>
    extends kx {
        private final dde<T1> a;
        private final dde<T2> b;
        private final dde<T3> c;
        private final dde<T4> d;

        d(dde<T1> $$0, dde<T2> $$1, dde<T3> $$2, dde<T4> $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public List<dde<?>> b() {
            return ImmutableList.of(this.a, this.b, this.c, this.d);
        }

        public d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<kz> $$4) {
            ky $$5 = ky.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
            this.a($$5, $$4);
            return this;
        }

        public d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, kz $$4) {
            return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
        }

        public kx a(g<T1, T2, T3, T4, kz> $$0) {
            this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.d.a().forEach($$4 -> this.a($$1, $$2, $$3, $$4, (kz)$$0.apply($$1, $$2, $$3, $$4))))));
            return this;
        }

        public kx b(g<T1, T2, T3, T4, List<kz>> $$0) {
            this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.d.a().forEach($$4 -> this.a($$1, $$2, $$3, $$4, (List)$$0.apply($$1, $$2, $$3, $$4))))));
            return this;
        }
    }

    public static class e<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>>
    extends kx {
        private final dde<T1> a;
        private final dde<T2> b;
        private final dde<T3> c;
        private final dde<T4> d;
        private final dde<T5> e;

        e(dde<T1> $$0, dde<T2> $$1, dde<T3> $$2, dde<T4> $$3, dde<T5> $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        @Override
        public List<dde<?>> b() {
            return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
        }

        public e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<kz> $$5) {
            ky $$6 = ky.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
            this.a($$6, $$5);
            return this;
        }

        public e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, kz $$5) {
            return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
        }

        public kx a(f<T1, T2, T3, T4, T5, kz> $$0) {
            this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.d.a().forEach($$4 -> this.e.a().forEach($$5 -> this.a($$1, $$2, $$3, $$4, $$5, (kz)$$0.apply($$1, $$2, $$3, $$4, $$5)))))));
            return this;
        }

        public kx b(f<T1, T2, T3, T4, T5, List<kz>> $$0) {
            this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.d.a().forEach($$4 -> this.e.a().forEach($$5 -> this.a($$1, $$2, $$3, $$4, $$5, (List)$$0.apply($$1, $$2, $$3, $$4, $$5)))))));
            return this;
        }
    }

    @FunctionalInterface
    public static interface f<P1, P2, P3, P4, P5, R> {
        public R apply(P1 var1, P2 var2, P3 var3, P4 var4, P5 var5);
    }

    @FunctionalInterface
    public static interface g<P1, P2, P3, P4, R> {
        public R apply(P1 var1, P2 var2, P3 var3, P4 var4);
    }

    @FunctionalInterface
    public static interface h<P1, P2, P3, R> {
        public R apply(P1 var1, P2 var2, P3 var3);
    }
}

