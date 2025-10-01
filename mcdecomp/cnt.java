/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  javax.annotation.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cnt {
    private static final boolean b = false;
    private static final float c = 10000.0f;
    @VisibleForTesting
    protected static final int a = 7;

    public static h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        return new h(cnt.a($$0), cnt.a($$1), cnt.a($$2), cnt.a($$3), cnt.a($$4), cnt.a($$5));
    }

    public static d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
        return new d(cnt$b.a($$0), cnt$b.a($$1), cnt$b.a($$2), cnt$b.a($$3), cnt$b.a($$4), cnt$b.a($$5), cnt.a($$6));
    }

    public static d a(b $$0, b $$1, b $$2, b $$3, b $$4, b $$5, float $$6) {
        return new d($$0, $$1, $$2, $$3, $$4, $$5, cnt.a($$6));
    }

    public static long a(float $$0) {
        return (long)($$0 * 10000.0f);
    }

    public static float a(long $$0) {
        return (float)$$0 / 10000.0f;
    }

    public static f a() {
        dhd $$0 = dhe.a();
        return new f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
    }

    public static gu a(List<d> $$0, f $$1) {
        return new g($$0, (f)$$1).a.a();
    }

    public static final class h
    extends Record {
        final long a;
        final long b;
        final long c;
        final long d;
        final long e;
        final long f;

        public h(long $$0, long $$1, long $$2, long $$3, long $$4, long $$5) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
        }

        @VisibleForTesting
        protected long[] a() {
            return new long[]{this.a, this.b, this.c, this.d, this.e, this.f, 0L};
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{h.class, "temperature;humidity;continentalness;erosion;depth;weirdness", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{h.class, "temperature;humidity;continentalness;erosion;depth;weirdness", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{h.class, "temperature;humidity;continentalness;erosion;depth;weirdness", "a", "b", "c", "d", "e", "f"}, this, $$0);
        }

        public long b() {
            return this.a;
        }

        public long c() {
            return this.b;
        }

        public long d() {
            return this.c;
        }

        public long e() {
            return this.d;
        }

        public long f() {
            return this.e;
        }

        public long g() {
            return this.f;
        }
    }

    public record d(b b, b c, b d, b e, b f, b g, long h) {
        public static final Codec<d> a = RecordCodecBuilder.create($$02 -> $$02.group((App)cnt$b.a.fieldOf("temperature").forGetter($$0 -> $$0.b), (App)cnt$b.a.fieldOf("humidity").forGetter($$0 -> $$0.c), (App)cnt$b.a.fieldOf("continentalness").forGetter($$0 -> $$0.d), (App)cnt$b.a.fieldOf("erosion").forGetter($$0 -> $$0.e), (App)cnt$b.a.fieldOf("depth").forGetter($$0 -> $$0.f), (App)cnt$b.a.fieldOf("weirdness").forGetter($$0 -> $$0.g), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("offset").xmap(cnt::a, cnt::a).forGetter($$0 -> $$0.h)).apply((Applicative)$$02, d::new));

        long a(h $$0) {
            return apa.a(this.b.a($$0.a)) + apa.a(this.c.a($$0.b)) + apa.a(this.d.a($$0.c)) + apa.a(this.e.a($$0.d)) + apa.a(this.f.a($$0.e)) + apa.a(this.g.a($$0.f)) + apa.a(this.h);
        }

        protected List<b> a() {
            return ImmutableList.of((Object)this.b, (Object)this.c, (Object)this.d, (Object)this.e, (Object)this.f, (Object)this.g, (Object)new b(this.h, this.h));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "temperature;humidity;continentalness;erosion;depth;weirdness;offset", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "temperature;humidity;continentalness;erosion;depth;weirdness;offset", "b", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "temperature;humidity;continentalness;erosion;depth;weirdness;offset", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
        }
    }

    public static final class b
    extends Record {
        private final long b;
        private final long c;
        public static final Codec<b> a = aoi.a(Codec.floatRange((float)-2.0f, (float)2.0f), "min", "max", ($$0, $$1) -> {
            if ($$0.compareTo((Float)$$1) > 0) {
                return DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")");
            }
            return DataResult.success((Object)new b(cnt.a($$0.floatValue()), cnt.a($$1.floatValue())));
        }, $$0 -> Float.valueOf(cnt.a($$0.a())), $$0 -> Float.valueOf(cnt.a($$0.b())));

        public b(long $$0, long $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public static b a(float $$0) {
            return cnt$b.a($$0, $$0);
        }

        public static b a(float $$0, float $$1) {
            if ($$0 > $$1) {
                throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
            }
            return new b(cnt.a($$0), cnt.a($$1));
        }

        public static b a(b $$0, b $$1) {
            if ($$0.a() > $$1.b()) {
                throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
            }
            return new b($$0.a(), $$1.b());
        }

        @Override
        public String toString() {
            return this.b == this.c ? String.format(Locale.ROOT, "%d", this.b) : String.format(Locale.ROOT, "[%d-%d]", this.b, this.c);
        }

        public long a(long $$0) {
            long $$1 = $$0 - this.c;
            long $$2 = this.b - $$0;
            if ($$1 > 0L) {
                return $$1;
            }
            return Math.max($$2, 0L);
        }

        public long a(b $$0) {
            long $$1 = $$0.a() - this.c;
            long $$2 = this.b - $$0.b();
            if ($$1 > 0L) {
                return $$1;
            }
            return Math.max($$2, 0L);
        }

        public b b(@Nullable b $$0) {
            return $$0 == null ? this : new b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "min;max", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "min;max", "b", "c"}, this, $$0);
        }

        public long a() {
            return this.b;
        }

        public long b() {
            return this.c;
        }
    }

    public record f(dhd a, dhd b, dhd c, dhd d, dhd e, dhd f, List<d> g) {
        private final dhd a;
        private final dhd b;
        private final dhd c;
        private final dhd d;
        private final dhd e;
        private final dhd f;
        private final List<d> g;

        public h a(int $$0, int $$1, int $$2) {
            int $$3 = hq.c($$0);
            int $$4 = hq.c($$1);
            int $$5 = hq.c($$2);
            dhd.e $$6 = new dhd.e($$3, $$4, $$5);
            return cnt.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
        }

        public gu a() {
            if (this.g.isEmpty()) {
                return gu.b;
            }
            return cnt.a(this.g, this);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "temperature;humidity;continentalness;erosion;depth;weirdness;spawnTarget", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "temperature;humidity;continentalness;erosion;depth;weirdness;spawnTarget", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "temperature;humidity;continentalness;erosion;depth;weirdness;spawnTarget", "a", "b", "c", "d", "e", "f", "g"}, this, $$0);
        }

        public dhd b() {
            return this.a;
        }

        public dhd c() {
            return this.b;
        }

        public dhd d() {
            return this.c;
        }

        public dhd e() {
            return this.d;
        }

        public dhd f() {
            return this.e;
        }

        public dhd g() {
            return this.f;
        }

        public List<d> h() {
            return this.g;
        }
    }

    static class g {
        a a;

        g(List<d> $$0, f $$1) {
            this.a = g.a($$0, $$1, 0, 0);
            this.a($$0, $$1, 2048.0f, 512.0f);
            this.a($$0, $$1, 512.0f, 32.0f);
        }

        private void a(List<d> $$0, f $$1, float $$2, float $$3) {
            float $$4 = 0.0f;
            float $$5 = $$3;
            gu $$6 = this.a.a();
            while ($$5 <= $$2) {
                int $$8;
                int $$7 = $$6.u() + (int)(Math.sin($$4) * (double)$$5);
                a $$9 = g.a($$0, $$1, $$7, $$8 = $$6.w() + (int)(Math.cos($$4) * (double)$$5));
                if ($$9.b() < this.a.b()) {
                    this.a = $$9;
                }
                if (!((double)($$4 += $$3 / $$5) > Math.PI * 2)) continue;
                $$4 = 0.0f;
                $$5 += $$3;
            }
        }

        private static a a(List<d> $$0, f $$1, int $$2, int $$3) {
            double $$4 = apa.k(2500.0);
            int $$5 = 2;
            long $$6 = (long)((double)apa.k(10000.0f) * Math.pow((double)(apa.a((long)$$2) + apa.a((long)$$3)) / $$4, 2.0));
            h $$7 = $$1.a(hq.a($$2), 0, hq.a($$3));
            h $$8 = new h($$7.b(), $$7.c(), $$7.d(), $$7.e(), 0L, $$7.g());
            long $$9 = Long.MAX_VALUE;
            for (d $$10 : $$0) {
                $$9 = Math.min($$9, $$10.a($$8));
            }
            return new a(new gu($$2, 0, $$3), $$6 + $$9);
        }

        record a(gu a, long b) {
            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "location;fitness", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "location;fitness", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "location;fitness", "a", "b"}, this, $$0);
            }
        }
    }

    public static class c<T> {
        private final List<Pair<d, T>> a;
        private final e<T> b;

        public static <T> Codec<c<T>> a(MapCodec<T> $$0) {
            return aoi.a(RecordCodecBuilder.create($$1 -> $$1.group((App)d.a.fieldOf("parameters").forGetter(Pair::getFirst), (App)$$0.forGetter(Pair::getSecond)).apply((Applicative)$$1, Pair::of)).listOf()).xmap(c::new, c::a);
        }

        public c(List<Pair<d, T>> $$0) {
            this.a = $$0;
            this.b = e.a($$0);
        }

        public List<Pair<d, T>> a() {
            return this.a;
        }

        public T a(h $$0) {
            return this.c($$0);
        }

        @VisibleForTesting
        public T b(h $$0) {
            Iterator<Pair<d, T>> $$1 = this.a().iterator();
            Pair<d, T> $$2 = $$1.next();
            long $$3 = ((d)$$2.getFirst()).a($$0);
            Object $$4 = $$2.getSecond();
            while ($$1.hasNext()) {
                Pair<d, T> $$5 = $$1.next();
                long $$6 = ((d)$$5.getFirst()).a($$0);
                if ($$6 >= $$3) continue;
                $$3 = $$6;
                $$4 = $$5.getSecond();
            }
            return (T)$$4;
        }

        public T c(h $$0) {
            return this.a($$0, e.b::a);
        }

        protected T a(h $$0, a<T> $$1) {
            return this.b.a($$0, $$1);
        }
    }

    protected static final class e<T> {
        private static final int a = 6;
        private final b<T> b;
        private final ThreadLocal<a<T>> c = new ThreadLocal();

        private e(b<T> $$0) {
            this.b = $$0;
        }

        public static <T> e<T> a(List<Pair<d, T>> $$02) {
            if ($$02.isEmpty()) {
                throw new IllegalArgumentException("Need at least one value to build the search tree.");
            }
            int $$1 = ((d)$$02.get(0).getFirst()).a().size();
            if ($$1 != 7) {
                throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            }
            List $$2 = $$02.stream().map($$0 -> new a<Object>((d)$$0.getFirst(), $$0.getSecond())).collect(Collectors.toCollection(ArrayList::new));
            return new e<T>(e.a($$1, $$2));
        }

        private static <T> b<T> a(int $$0, List<? extends b<T>> $$12) {
            if ($$12.isEmpty()) {
                throw new IllegalStateException("Need at least one child to build a node");
            }
            if ($$12.size() == 1) {
                return $$12.get(0);
            }
            if ($$12.size() <= 6) {
                $$12.sort(Comparator.comparingLong($$1 -> {
                    long $$2 = 0L;
                    for (int $$3 = 0; $$3 < $$0; ++$$3) {
                        cnt$b $$4 = $$1.a[$$3];
                        $$2 += Math.abs(($$4.a() + $$4.b()) / 2L);
                    }
                    return $$2;
                }));
                return new c($$12);
            }
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<c<T>> $$4 = null;
            for (int $$5 = 0; $$5 < $$0; ++$$5) {
                e.a($$12, $$0, $$5, false);
                List<c<T>> $$6 = e.b($$12);
                long $$7 = 0L;
                for (c<T> $$8 : $$6) {
                    $$7 += e.a($$8.a);
                }
                if ($$2 <= $$7) continue;
                $$2 = $$7;
                $$3 = $$5;
                $$4 = $$6;
            }
            e.a($$4, $$0, $$3, true);
            return new c($$4.stream().map($$1 -> e.a($$0, Arrays.asList($$1.b))).collect(Collectors.toList()));
        }

        private static <T> void a(List<? extends b<T>> $$0, int $$1, int $$2, boolean $$3) {
            Comparator<b<b<T>>> $$4 = e.a($$2, $$3);
            for (int $$5 = 1; $$5 < $$1; ++$$5) {
                $$4 = $$4.thenComparing(e.a(($$2 + $$5) % $$1, $$3));
            }
            $$0.sort($$4);
        }

        private static <T> Comparator<b<T>> a(int $$0, boolean $$1) {
            return Comparator.comparingLong($$2 -> {
                cnt$b $$3 = $$2.a[$$0];
                long $$4 = ($$3.a() + $$3.b()) / 2L;
                return $$1 ? Math.abs($$4) : $$4;
            });
        }

        private static <T> List<c<T>> b(List<? extends b<T>> $$0) {
            ArrayList $$1 = Lists.newArrayList();
            ArrayList $$2 = Lists.newArrayList();
            int $$3 = (int)Math.pow(6.0, Math.floor(Math.log((double)$$0.size() - 0.01) / Math.log(6.0)));
            for (b<T> $$4 : $$0) {
                $$2.add($$4);
                if ($$2.size() < $$3) continue;
                $$1.add(new c($$2));
                $$2 = Lists.newArrayList();
            }
            if (!$$2.isEmpty()) {
                $$1.add(new c($$2));
            }
            return $$1;
        }

        private static long a(cnt$b[] $$0) {
            long $$1 = 0L;
            for (cnt$b $$2 : $$0) {
                $$1 += Math.abs($$2.b() - $$2.a());
            }
            return $$1;
        }

        static <T> List<cnt$b> c(List<? extends b<T>> $$0) {
            if ($$0.isEmpty()) {
                throw new IllegalArgumentException("SubTree needs at least one child");
            }
            int $$1 = 7;
            ArrayList $$2 = Lists.newArrayList();
            for (int $$3 = 0; $$3 < 7; ++$$3) {
                $$2.add(null);
            }
            for (b<T> $$4 : $$0) {
                for (int $$5 = 0; $$5 < 7; ++$$5) {
                    $$2.set($$5, $$4.a[$$5].b((cnt$b)$$2.get($$5)));
                }
            }
            return $$2;
        }

        public T a(h $$0, cnt$a<T> $$1) {
            long[] $$2 = $$0.a();
            a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
            this.c.set($$3);
            return $$3.b;
        }

        static abstract class b<T> {
            protected final cnt$b[] a;

            protected b(List<cnt$b> $$0) {
                this.a = $$0.toArray(new cnt$b[0]);
            }

            protected abstract a<T> a(long[] var1, @Nullable a<T> var2, cnt$a<T> var3);

            protected long a(long[] $$0) {
                long $$1 = 0L;
                for (int $$2 = 0; $$2 < 7; ++$$2) {
                    $$1 += apa.a(this.a[$$2].a($$0[$$2]));
                }
                return $$1;
            }

            public String toString() {
                return Arrays.toString(this.a);
            }
        }

        static final class c<T>
        extends b<T> {
            final b<T>[] b;

            protected c(List<? extends b<T>> $$0) {
                this(e.c($$0), $$0);
            }

            protected c(List<cnt$b> $$0, List<? extends b<T>> $$1) {
                super($$0);
                this.b = $$1.toArray(new b[0]);
            }

            @Override
            protected a<T> a(long[] $$0, @Nullable a<T> $$1, cnt$a<T> $$2) {
                long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
                a<T> $$4 = $$1;
                for (b<T> $$5 : this.b) {
                    long $$8;
                    long $$6 = $$2.distance($$5, $$0);
                    if ($$3 <= $$6) continue;
                    a<T> $$7 = $$5.a($$0, $$4, $$2);
                    long l2 = $$8 = $$5 == $$7 ? $$6 : $$2.distance($$7, $$0);
                    if ($$3 <= $$8) continue;
                    $$3 = $$8;
                    $$4 = $$7;
                }
                return $$4;
            }
        }

        static final class a<T>
        extends b<T> {
            final T b;

            a(d $$0, T $$1) {
                super($$0.a());
                this.b = $$1;
            }

            @Override
            protected a<T> a(long[] $$0, @Nullable a<T> $$1, cnt$a<T> $$2) {
                return this;
            }
        }
    }

    static interface a<T> {
        public long distance(e.b<T> var1, long[] var2);
    }
}

