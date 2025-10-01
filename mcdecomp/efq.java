/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2LongMap
 *  it.unimi.dsi.fastutil.longs.Long2LongMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2LongMaps
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet
 */
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongMaps;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class efq<T>
implements efp<T> {
    private static final Comparator<efo<?>> a = ($$0, $$1) -> eft.b.compare($$0.b(), $$1.b());
    private final LongPredicate b;
    private final Supplier<ban> c;
    private final Long2ObjectMap<efo<T>> d = new Long2ObjectOpenHashMap();
    private final Long2LongMap e = (Long2LongMap)ac.a(new Long2LongOpenHashMap(), (T $$0) -> $$0.defaultReturnValue(Long.MAX_VALUE));
    private final Queue<efo<T>> f = new PriorityQueue(a);
    private final Queue<eft<T>> g = new ArrayDeque<eft<T>>();
    private final List<eft<T>> h = new ArrayList<eft<T>>();
    private final Set<eft<?>> i = new ObjectOpenCustomHashSet(eft.c);
    private final BiConsumer<efo<T>, eft<T>> j = ($$0, $$1) -> {
        if ($$1.equals($$0.b())) {
            this.b((eft<T>)$$1);
        }
    };

    public efq(LongPredicate $$02, Supplier<ban> $$12) {
        this.b = $$02;
        this.c = $$12;
    }

    public void a(clt $$0, efo<T> $$1) {
        long $$2 = $$0.a();
        this.d.put($$2, $$1);
        eft<T> $$3 = $$1.b();
        if ($$3 != null) {
            this.e.put($$2, $$3.c());
        }
        $$1.a(this.j);
    }

    public void a(clt $$0) {
        long $$1 = $$0.a();
        efo $$2 = (efo)this.d.remove($$1);
        this.e.remove($$1);
        if ($$2 != null) {
            $$2.a(null);
        }
    }

    @Override
    public void a(eft<T> $$0) {
        long $$1 = clt.a($$0.b());
        efo $$2 = (efo)this.d.get($$1);
        if ($$2 == null) {
            ac.b(new IllegalStateException("Trying to schedule tick in not loaded position " + $$0.b()));
            return;
        }
        $$2.a($$0);
    }

    public void a(long $$0, int $$1, BiConsumer<gu, T> $$2) {
        ban $$3 = this.c.get();
        $$3.a("collect");
        this.a($$0, $$1, $$3);
        $$3.b("run");
        $$3.a("ticksToRun", this.g.size());
        this.a($$2);
        $$3.b("cleanup");
        this.c();
        $$3.c();
    }

    private void a(long $$0, int $$1, ban $$2) {
        this.a($$0);
        $$2.a("containersToTick", this.f.size());
        this.a($$0, $$1);
        this.b();
    }

    private void a(long $$0) {
        ObjectIterator $$1 = Long2LongMaps.fastIterator((Long2LongMap)this.e);
        while ($$1.hasNext()) {
            Long2LongMap.Entry $$2 = (Long2LongMap.Entry)$$1.next();
            long $$3 = $$2.getLongKey();
            long $$4 = $$2.getLongValue();
            if ($$4 > $$0) continue;
            efo $$5 = (efo)this.d.get($$3);
            if ($$5 == null) {
                $$1.remove();
                continue;
            }
            eft $$6 = $$5.b();
            if ($$6 == null) {
                $$1.remove();
                continue;
            }
            if ($$6.c() > $$0) {
                $$2.setValue($$6.c());
                continue;
            }
            if (!this.b.test($$3)) continue;
            $$1.remove();
            this.f.add($$5);
        }
    }

    private void a(long $$0, int $$1) {
        efo<T> $$2;
        while (this.a($$1) && ($$2 = this.f.poll()) != null) {
            eft<T> $$3 = $$2.c();
            this.c($$3);
            this.a(this.f, $$2, $$0, $$1);
            eft<T> $$4 = $$2.b();
            if ($$4 == null) continue;
            if ($$4.c() <= $$0 && this.a($$1)) {
                this.f.add($$2);
                continue;
            }
            this.b($$4);
        }
    }

    private void b() {
        for (efo efo2 : this.f) {
            this.b(efo2.b());
        }
    }

    private void b(eft<T> $$0) {
        this.e.put(clt.a($$0.b()), $$0.c());
    }

    private void a(Queue<efo<T>> $$0, efo<T> $$1, long $$2, int $$3) {
        eft<T> $$6;
        eft<T> $$5;
        if (!this.a($$3)) {
            return;
        }
        efo<T> $$4 = $$0.peek();
        eft<T> eft2 = $$5 = $$4 != null ? $$4.b() : null;
        while (this.a($$3) && ($$6 = $$1.b()) != null && $$6.c() <= $$2 && ($$5 == null || eft.b.compare($$6, $$5) <= 0)) {
            $$1.c();
            this.c($$6);
        }
    }

    private void c(eft<T> $$0) {
        this.g.add($$0);
    }

    private boolean a(int $$0) {
        return this.g.size() < $$0;
    }

    private void a(BiConsumer<gu, T> $$0) {
        while (!this.g.isEmpty()) {
            eft<T> $$1 = this.g.poll();
            if (!this.i.isEmpty()) {
                this.i.remove($$1);
            }
            this.h.add($$1);
            $$0.accept($$1.b(), (gu)$$1.a());
        }
    }

    private void c() {
        this.g.clear();
        this.f.clear();
        this.h.clear();
        this.i.clear();
    }

    @Override
    public boolean a(gu $$0, T $$1) {
        efo $$2 = (efo)this.d.get(clt.a($$0));
        return $$2 != null && $$2.a($$0, $$1);
    }

    @Override
    public boolean b(gu $$0, T $$1) {
        this.d();
        return this.i.contains(eft.a($$1, $$0));
    }

    private void d() {
        if (this.i.isEmpty() && !this.g.isEmpty()) {
            this.i.addAll(this.g);
        }
    }

    private void a(drs $$0, a<T> $$1) {
        int $$2 = hx.a((double)$$0.g());
        int $$3 = hx.a((double)$$0.i());
        int $$4 = hx.a((double)$$0.j());
        int $$5 = hx.a((double)$$0.l());
        for (int $$6 = $$2; $$6 <= $$4; ++$$6) {
            for (int $$7 = $$3; $$7 <= $$5; ++$$7) {
                long $$8 = clt.c($$6, $$7);
                efo $$9 = (efo)this.d.get($$8);
                if ($$9 == null) continue;
                $$1.accept($$8, $$9);
            }
        }
    }

    public void a(drs $$0) {
        Predicate<eft> $$12 = $$1 -> $$0.b($$1.b());
        this.a($$0, (long $$1, efo<T> $$2) -> {
            eft $$3 = $$2.b();
            $$2.a($$12);
            eft $$4 = $$2.b();
            if ($$4 != $$3) {
                if ($$4 != null) {
                    this.b($$4);
                } else {
                    this.e.remove($$1);
                }
            }
        });
        this.h.removeIf($$12);
        this.g.removeIf($$12);
    }

    public void a(drs $$0, hz $$1) {
        this.a(this, $$0, $$1);
    }

    public void a(efq<T> $$0, drs $$12, hz $$22) {
        ArrayList $$32 = new ArrayList();
        Predicate<eft> $$4 = $$1 -> $$12.b($$1.b());
        $$0.h.stream().filter($$4).forEach($$32::add);
        $$0.g.stream().filter($$4).forEach($$32::add);
        $$0.a($$12, (long $$2, efo<T> $$3) -> $$3.d().filter($$4).forEach($$32::add));
        LongSummaryStatistics $$5 = $$32.stream().mapToLong(eft::e).summaryStatistics();
        long $$6 = $$5.getMin();
        long $$7 = $$5.getMax();
        $$32.forEach($$3 -> this.a(new eft($$3.a(), $$3.b().a($$22), $$3.c(), $$3.d(), $$3.e() - $$6 + $$7 + 1L)));
    }

    @Override
    public int a() {
        return this.d.values().stream().mapToInt(efv::a).sum();
    }

    @FunctionalInterface
    static interface a<T> {
        public void accept(long var1, efo<T> var3);
    }
}

