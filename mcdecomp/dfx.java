/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectFunction
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongAVLTreeSet
 *  it.unimi.dsi.fastutil.longs.LongBidirectionalIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.longs.LongSortedSet
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectFunction;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongBidirectionalIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSortedSet;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.Spliterators;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public class dfx<T extends dfs> {
    private final Class<T> a;
    private final Long2ObjectFunction<dgf> b;
    private final Long2ObjectMap<dfw<T>> c = new Long2ObjectOpenHashMap();
    private final LongSortedSet d = new LongAVLTreeSet();

    public dfx(Class<T> $$0, Long2ObjectFunction<dgf> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public void a(eed $$0, anr<dfw<T>> $$1) {
        int $$2 = 2;
        int $$3 = hx.a($$0.a - 2.0);
        int $$4 = hx.a($$0.b - 4.0);
        int $$5 = hx.a($$0.c - 2.0);
        int $$6 = hx.a($$0.d + 2.0);
        int $$7 = hx.a($$0.e + 0.0);
        int $$8 = hx.a($$0.f + 2.0);
        for (int $$9 = $$3; $$9 <= $$6; ++$$9) {
            long $$10 = hx.b($$9, 0, 0);
            long $$11 = hx.b($$9, -1, -1);
            LongBidirectionalIterator $$12 = this.d.subSet($$10, $$11 + 1L).iterator();
            while ($$12.hasNext()) {
                dfw $$16;
                long $$13 = $$12.nextLong();
                int $$14 = hx.c($$13);
                int $$15 = hx.d($$13);
                if ($$14 < $$4 || $$14 > $$7 || $$15 < $$5 || $$15 > $$8 || ($$16 = (dfw)this.c.get($$13)) == null || $$16.a() || !$$16.c().b() || !$$1.accept($$16).a()) continue;
                return;
            }
        }
    }

    public LongStream a(long $$0) {
        int $$2;
        int $$1 = clt.a($$0);
        LongSortedSet $$3 = this.a($$1, $$2 = clt.b($$0));
        if ($$3.isEmpty()) {
            return LongStream.empty();
        }
        LongBidirectionalIterator $$4 = $$3.iterator();
        return StreamSupport.longStream(Spliterators.spliteratorUnknownSize((PrimitiveIterator.OfLong)$$4, 1301), false);
    }

    private LongSortedSet a(int $$0, int $$1) {
        long $$2 = hx.b($$0, 0, $$1);
        long $$3 = hx.b($$0, -1, $$1);
        return this.d.subSet($$2, $$3 + 1L);
    }

    public Stream<dfw<T>> b(long $$0) {
        return this.a($$0).mapToObj(arg_0 -> this.c.get(arg_0)).filter(Objects::nonNull);
    }

    private static long f(long $$0) {
        return clt.c(hx.b($$0), hx.d($$0));
    }

    public dfw<T> c(long $$0) {
        return (dfw)this.c.computeIfAbsent($$0, this::g);
    }

    @Nullable
    public dfw<T> d(long $$0) {
        return (dfw)this.c.get($$0);
    }

    private dfw<T> g(long $$0) {
        long $$1 = dfx.f($$0);
        dgf $$2 = (dgf)((Object)this.b.get($$1));
        this.d.add($$0);
        return new dfw<T>(this.a, $$2);
    }

    public LongSet a() {
        LongOpenHashSet $$0 = new LongOpenHashSet();
        this.c.keySet().forEach(arg_0 -> dfx.a((LongSet)$$0, arg_0));
        return $$0;
    }

    public void b(eed $$0, anr<T> $$1) {
        this.a($$0, $$2 -> $$2.a($$0, $$1));
    }

    public <U extends T> void a(dfz<T, U> $$0, eed $$1, anr<U> $$2) {
        this.a($$1, $$3 -> $$3.a($$0, $$1, $$2));
    }

    public void e(long $$0) {
        this.c.remove($$0);
        this.d.remove($$0);
    }

    @aqa
    public int b() {
        return this.d.size();
    }

    private static /* synthetic */ void a(LongSet $$0, long $$1) {
        $$0.add(dfx.f($$1));
    }
}

