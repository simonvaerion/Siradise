/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntArraySet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.LongStream;
import javax.annotation.Nullable;

public class deq<T>
implements dep<T>,
der<T> {
    private static final int a = 0;
    private final dep<T> b = ($$0, $$1) -> 0;
    private final hj<T> c;
    private volatile c<T> d;
    private final d e;
    private final apu f = new apu("PalettedContainer");

    public void a() {
        this.f.a();
    }

    public void b() {
        this.f.b();
    }

    public static <T> Codec<deq<T>> a(hj<T> $$0, Codec<T> $$1, d $$2, T $$3) {
        der.b $$4 = deq::a;
        return deq.a($$0, $$1, $$2, $$3, $$4);
    }

    public static <T> Codec<der<T>> b(hj<T> $$0, Codec<T> $$12, d $$22, T $$3) {
        der.b $$4 = ($$02, $$1, $$2) -> deq.a($$02, $$1, $$2).map($$0 -> $$0);
        return deq.a($$0, $$12, $$22, $$3, $$4);
    }

    private static <T, C extends der<T>> Codec<C> a(hj<T> $$0, Codec<T> $$1, d $$22, T $$32, der.b<T, C> $$4) {
        return RecordCodecBuilder.create($$2 -> $$2.group((App)$$1.mapResult(aoi.a($$32)).listOf().fieldOf("palette").forGetter(der.a::a), (App)Codec.LONG_STREAM.optionalFieldOf("data").forGetter(der.a::b)).apply((Applicative)$$2, der.a::new)).comapFlatMap($$3 -> $$4.read($$0, $$22, (der.a)$$3), $$2 -> $$2.a($$0, $$22));
    }

    public deq(hj<T> $$02, d $$12, a<T> $$2, ans $$3, List<T> $$4) {
        this.c = $$02;
        this.e = $$12;
        this.d = new c<T>($$2, $$3, $$2.a().create($$2.b(), $$02, this, $$4));
    }

    private deq(hj<T> $$02, d $$12, c<T> $$2) {
        this.c = $$02;
        this.e = $$12;
        this.d = $$2;
    }

    public deq(hj<T> $$02, T $$12, d $$2) {
        this.e = $$2;
        this.c = $$02;
        this.d = this.a((c<T>)null, 0);
        this.d.c.a($$12);
    }

    private c<T> a(@Nullable c<T> $$0, int $$1) {
        a<T> $$2 = this.e.a(this.c, $$1);
        if ($$0 != null && $$2.equals($$0.c())) {
            return $$0;
        }
        return $$2.a(this.c, this, this.e.a());
    }

    @Override
    public int onResize(int $$0, T $$1) {
        c<T> $$2 = this.d;
        c $$3 = this.a($$2, $$0);
        $$3.a($$2.c, $$2.b);
        this.d = $$3;
        return $$3.c.a($$1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public T a(int $$0, int $$1, int $$2, T $$3) {
        this.a();
        try {
            T t2 = this.a(this.e.a($$0, $$1, $$2), $$3);
            return t2;
        }
        finally {
            this.b();
        }
    }

    public T b(int $$0, int $$1, int $$2, T $$3) {
        return this.a(this.e.a($$0, $$1, $$2), $$3);
    }

    private T a(int $$0, T $$1) {
        int $$2 = this.d.c.a($$1);
        int $$3 = this.d.b.a($$0, $$2);
        return this.d.c.a($$3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c(int $$0, int $$1, int $$2, T $$3) {
        this.a();
        try {
            this.b(this.e.a($$0, $$1, $$2), $$3);
        }
        finally {
            this.b();
        }
    }

    private void b(int $$0, T $$1) {
        int $$2 = this.d.c.a($$1);
        this.d.b.b($$0, $$2);
    }

    @Override
    public T a(int $$0, int $$1, int $$2) {
        return this.a(this.e.a($$0, $$1, $$2));
    }

    protected T a(int $$0) {
        c<T> $$1 = this.d;
        return $$1.c.a($$1.b.a($$0));
    }

    @Override
    public void a(Consumer<T> $$0) {
        deo $$1 = this.d.e();
        IntArraySet $$22 = new IntArraySet();
        this.d.b.a(arg_0 -> ((IntSet)$$22).add(arg_0));
        $$22.forEach($$2 -> $$0.accept($$1.a($$2)));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(sf $$0) {
        this.a();
        try {
            byte $$1 = $$0.readByte();
            c<T> $$2 = this.a(this.d, (int)$$1);
            $$2.c.a($$0);
            $$0.b($$2.b.a());
            this.d = $$2;
        }
        finally {
            this.b();
        }
    }

    @Override
    public void b(sf $$0) {
        this.a();
        try {
            this.d.a($$0);
        }
        finally {
            this.b();
        }
    }

    /*
     * WARNING - void declaration
     */
    private static <T> DataResult<deq<T>> a(hj<T> $$02, d $$12, der.a<T> $$22) {
        void $$16;
        List<T> $$3 = $$22.a();
        int $$4 = $$12.a();
        int $$5 = $$12.b($$02, $$3.size());
        a<T> $$6 = $$12.a($$02, $$5);
        if ($$5 == 0) {
            aqb $$7 = new aqb($$4);
        } else {
            Optional<LongStream> $$8 = $$22.b();
            if ($$8.isEmpty()) {
                return DataResult.error(() -> "Missing values for non-zero storage");
            }
            long[] $$9 = $$8.get().toArray();
            try {
                if ($$6.a() == deq$d.f) {
                    deg<Object> $$10 = new deg<Object>($$02, $$5, ($$0, $$1) -> 0, $$3);
                    apl $$11 = new apl($$5, $$4, $$9);
                    int[] $$122 = new int[$$4];
                    $$11.a($$122);
                    deq.a($$122, $$2 -> $$02.a($$10.a($$2)));
                    apl $$13 = new apl($$6.b(), $$4, $$122);
                } else {
                    apl $$14 = new apl($$6.b(), $$4, $$9);
                }
            }
            catch (apl.a $$15) {
                return DataResult.error(() -> "Failed to read PalettedContainer: " + $$15.getMessage());
            }
        }
        return DataResult.success(new deq<T>($$02, $$12, $$6, (ans)$$16, $$3));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public der.a<T> a(hj<T> $$0, d $$12) {
        this.a();
        try {
            Optional<LongStream> $$8;
            deg<T> $$2 = new deg<T>($$0, this.d.b.c(), this.b);
            int $$3 = $$12.a();
            int[] $$4 = new int[$$3];
            this.d.b.a($$4);
            deq.a($$4, $$1 -> $$2.a(this.d.c.a($$1)));
            int $$5 = $$12.b($$0, $$2.b());
            if ($$5 != 0) {
                apl $$6 = new apl($$5, $$3, $$4);
                Optional<LongStream> $$7 = Optional.of(Arrays.stream($$6.a()));
            } else {
                $$8 = Optional.empty();
            }
            der.a<T> a2 = new der.a<T>($$2.d(), $$8);
            return a2;
        }
        finally {
            this.b();
        }
    }

    private static <T> void a(int[] $$0, IntUnaryOperator $$1) {
        int $$2 = -1;
        int $$3 = -1;
        for (int $$4 = 0; $$4 < $$0.length; ++$$4) {
            int $$5 = $$0[$$4];
            if ($$5 != $$2) {
                $$2 = $$5;
                $$3 = $$1.applyAsInt($$5);
            }
            $$0[$$4] = $$3;
        }
    }

    @Override
    public int c() {
        return this.d.a();
    }

    @Override
    public boolean a(Predicate<T> $$0) {
        return this.d.c.a($$0);
    }

    public deq<T> d() {
        return new deq<T>(this.c, this.e, this.d.b());
    }

    @Override
    public deq<T> e() {
        return new deq<T>(this.c, this.d.c.a(0), this.e);
    }

    @Override
    public void a(b<T> $$0) {
        if (this.d.c.b() == 1) {
            $$0.accept(this.d.c.a(0), this.d.b.b());
            return;
        }
        Int2IntOpenHashMap $$12 = new Int2IntOpenHashMap();
        this.d.b.a((int $$1) -> $$12.addTo($$1, 1));
        $$12.int2IntEntrySet().forEach($$1 -> $$0.accept(this.d.c.a($$1.getIntKey()), $$1.getIntValue()));
    }

    public static abstract class d {
        public static final deo.a a = det::a;
        public static final deo.a b = dem::a;
        public static final deo.a c = deg::a;
        static final deo.a f = def::a;
        public static final d d = new d(4){

            @Override
            public <A> a<A> a(hj<A> $$0, int $$1) {
                return switch ($$1) {
                    case 0 -> new a(a, $$1);
                    case 1, 2, 3, 4 -> new a(b, 4);
                    case 5, 6, 7, 8 -> new a(c, $$1);
                    default -> new a(f, apa.e($$0.b()));
                };
            }
        };
        public static final d e = new d(2){

            @Override
            public <A> a<A> a(hj<A> $$0, int $$1) {
                return switch ($$1) {
                    case 0 -> new a(a, $$1);
                    case 1, 2, 3 -> new a(b, $$1);
                    default -> new a(f, apa.e($$0.b()));
                };
            }
        };
        private final int g;

        d(int $$0) {
            this.g = $$0;
        }

        public int a() {
            return 1 << this.g * 3;
        }

        public int a(int $$0, int $$1, int $$2) {
            return ($$1 << this.g | $$2) << this.g | $$0;
        }

        public abstract <A> a<A> a(hj<A> var1, int var2);

        <A> int b(hj<A> $$0, int $$1) {
            int $$2 = apa.e($$1);
            a<A> $$3 = this.a($$0, $$2);
            return $$3.a() == f ? $$2 : $$3.b();
        }
    }

    static final class c<T>
    extends Record {
        private final a<T> a;
        final ans b;
        final deo<T> c;

        c(a<T> $$0, ans $$1, deo<T> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public void a(deo<T> $$0, ans $$1) {
            for (int $$2 = 0; $$2 < $$1.b(); ++$$2) {
                T $$3 = $$0.a($$1.a($$2));
                this.b.b($$2, this.c.a($$3));
            }
        }

        public int a() {
            return 1 + this.c.a() + sf.a(this.b.b()) + this.b.a().length * 8;
        }

        public void a(sf $$0) {
            $$0.writeByte(this.b.c());
            this.c.b($$0);
            $$0.a(this.b.a());
        }

        public c<T> b() {
            return new c<T>(this.a, this.b.d(), this.c.c());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "configuration;storage;palette", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "configuration;storage;palette", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "configuration;storage;palette", "a", "b", "c"}, this, $$0);
        }

        public a<T> c() {
            return this.a;
        }

        public ans d() {
            return this.b;
        }

        public deo<T> e() {
            return this.c;
        }
    }

    record a<T>(deo.a a, int b) {
        public c<T> a(hj<T> $$0, dep<T> $$1, int $$2) {
            ans $$3 = this.b == 0 ? new aqb($$2) : new apl(this.b, $$2);
            deo<T> $$4 = this.a.create(this.b, $$0, $$1, List.of());
            return new c<T>(this, $$3, $$4);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "factory;bits", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "factory;bits", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "factory;bits", "a", "b"}, this, $$0);
        }
    }

    @FunctionalInterface
    public static interface b<T> {
        public void accept(T var1, int var2);
    }
}

