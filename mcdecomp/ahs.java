/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Either
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongCollection
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  javax.annotation.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongCollection;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ahs<T> {
    public static final int a = ahq.a + 2;
    private final List<Long2ObjectLinkedOpenHashMap<List<Optional<T>>>> b = IntStream.range(0, a).mapToObj($$0 -> new Long2ObjectLinkedOpenHashMap()).collect(Collectors.toList());
    private volatile int c = a;
    private final String d;
    private final LongSet e = new LongOpenHashSet();
    private final int f;

    public ahs(String $$02, int $$1) {
        this.d = $$02;
        this.f = $$1;
    }

    protected void a(int $$02, clt $$1, int $$2) {
        if ($$02 >= a) {
            return;
        }
        Long2ObjectLinkedOpenHashMap<List<Optional<T>>> $$3 = this.b.get($$02);
        List $$4 = (List)$$3.remove($$1.a());
        if ($$02 == this.c) {
            while (this.b() && this.b.get(this.c).isEmpty()) {
                ++this.c;
            }
        }
        if ($$4 != null && !$$4.isEmpty()) {
            ((List)this.b.get($$2).computeIfAbsent($$1.a(), $$0 -> Lists.newArrayList())).addAll($$4);
            this.c = Math.min(this.c, $$2);
        }
    }

    protected void a(Optional<T> $$02, long $$1, int $$2) {
        ((List)this.b.get($$2).computeIfAbsent($$1, $$0 -> Lists.newArrayList())).add($$02);
        this.c = Math.min(this.c, $$2);
    }

    protected void a(long $$02, boolean $$1) {
        for (Long2ObjectLinkedOpenHashMap<List<Optional<T>>> $$2 : this.b) {
            List $$3 = (List)$$2.get($$02);
            if ($$3 == null) continue;
            if ($$1) {
                $$3.clear();
            } else {
                $$3.removeIf($$0 -> !$$0.isPresent());
            }
            if (!$$3.isEmpty()) continue;
            $$2.remove($$02);
        }
        while (this.b() && this.b.get(this.c).isEmpty()) {
            ++this.c;
        }
        this.e.remove($$02);
    }

    private Runnable a(long $$0) {
        return () -> this.e.add($$0);
    }

    @Nullable
    public Stream<Either<T, Runnable>> a() {
        if (this.e.size() >= this.f) {
            return null;
        }
        if (this.b()) {
            int $$0 = this.c;
            Long2ObjectLinkedOpenHashMap<List<Optional<T>>> $$12 = this.b.get($$0);
            long $$2 = $$12.firstLongKey();
            List $$3 = (List)$$12.removeFirst();
            while (this.b() && this.b.get(this.c).isEmpty()) {
                ++this.c;
            }
            return $$3.stream().map($$1 -> $$1.map(Either::left).orElseGet(() -> Either.right((Object)this.a($$2))));
        }
        return null;
    }

    public boolean b() {
        return this.c < a;
    }

    public String toString() {
        return this.d + " " + this.c + "...";
    }

    @VisibleForTesting
    LongSet c() {
        return new LongOpenHashSet((LongCollection)this.e);
    }
}

