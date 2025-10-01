/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Streams
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  javax.annotation.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Streams;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bxr {
    @VisibleForTesting
    protected static final int a = 2;
    @VisibleForTesting
    protected static final int b = 150;
    private static final int f = 1;
    private int g = apa.b(apf.a(), 0, 2);
    int h;
    private static final Codec<Pair<UUID, Integer>> i = RecordCodecBuilder.create($$0 -> $$0.group((App)hy.a.fieldOf("uuid").forGetter(Pair::getFirst), (App)aoi.i.fieldOf("anger").forGetter(Pair::getSecond)).apply((Applicative)$$0, Pair::of));
    private final Predicate<bfj> j;
    @VisibleForTesting
    protected final ArrayList<bfj> c;
    private final a k;
    @VisibleForTesting
    protected final Object2IntMap<bfj> d;
    @VisibleForTesting
    protected final Object2IntMap<UUID> e;

    public static Codec<bxr> a(Predicate<bfj> $$0) {
        return RecordCodecBuilder.create($$12 -> $$12.group((App)i.listOf().fieldOf("suspects").orElse(Collections.emptyList()).forGetter(bxr::b)).apply((Applicative)$$12, $$1 -> new bxr($$0, (List<Pair<UUID, Integer>>)$$1)));
    }

    public bxr(Predicate<bfj> $$02, List<Pair<UUID, Integer>> $$1) {
        this.j = $$02;
        this.c = new ArrayList();
        this.k = new a(this);
        this.d = new Object2IntOpenHashMap();
        this.e = new Object2IntOpenHashMap($$1.size());
        $$1.forEach($$0 -> this.e.put((Object)((UUID)$$0.getFirst()), (Integer)$$0.getSecond()));
    }

    private List<Pair<UUID, Integer>> b() {
        return Streams.concat((Stream[])new Stream[]{this.c.stream().map($$0 -> Pair.of((Object)$$0.ct(), (Object)this.d.getInt($$0))), this.e.object2IntEntrySet().stream().map($$0 -> Pair.of((Object)((UUID)$$0.getKey()), (Object)$$0.getIntValue()))}).collect(Collectors.toList());
    }

    public void a(aif $$0, Predicate<bfj> $$1) {
        --this.g;
        if (this.g <= 0) {
            this.a($$0);
            this.g = 2;
        }
        ObjectIterator $$2 = this.e.object2IntEntrySet().iterator();
        while ($$2.hasNext()) {
            Object2IntMap.Entry $$3 = (Object2IntMap.Entry)$$2.next();
            int $$4 = $$3.getIntValue();
            if ($$4 <= 1) {
                $$2.remove();
                continue;
            }
            $$3.setValue($$4 - 1);
        }
        ObjectIterator $$5 = this.d.object2IntEntrySet().iterator();
        while ($$5.hasNext()) {
            Object2IntMap.Entry $$6 = (Object2IntMap.Entry)$$5.next();
            int $$7 = $$6.getIntValue();
            bfj $$8 = (bfj)$$6.getKey();
            bfj.c $$9 = $$8.dE();
            if ($$7 <= 1 || !$$1.test($$8) || $$9 != null) {
                this.c.remove($$8);
                $$5.remove();
                if ($$7 <= 1 || $$9 == null) continue;
                switch ($$9) {
                    case e: 
                    case c: 
                    case d: {
                        this.e.put((Object)$$8.ct(), $$7 - 1);
                    }
                }
                continue;
            }
            $$6.setValue($$7 - 1);
        }
        this.c();
    }

    private void c() {
        this.h = 0;
        this.c.sort(this.k);
        if (this.c.size() == 1) {
            this.h = this.d.getInt((Object)this.c.get(0));
        }
    }

    private void a(aif $$0) {
        ObjectIterator $$1 = this.e.object2IntEntrySet().iterator();
        while ($$1.hasNext()) {
            Object2IntMap.Entry $$2 = (Object2IntMap.Entry)$$1.next();
            int $$3 = $$2.getIntValue();
            bfj $$4 = $$0.a((UUID)$$2.getKey());
            if ($$4 == null) continue;
            this.d.put((Object)$$4, $$3);
            this.c.add($$4);
            $$1.remove();
        }
    }

    public int a(bfj $$0, int $$12) {
        boolean $$22 = !this.d.containsKey((Object)$$0);
        int $$3 = this.d.computeInt((Object)$$0, ($$1, $$2) -> Math.min(150, ($$2 == null ? 0 : $$2) + $$12));
        if ($$22) {
            int $$4 = this.e.removeInt((Object)$$0.ct());
            this.d.put((Object)$$0, $$3 += $$4);
            this.c.add($$0);
        }
        this.c();
        return $$3;
    }

    public void a(bfj $$0) {
        this.d.removeInt((Object)$$0);
        this.c.remove($$0);
        this.c();
    }

    @Nullable
    private bfj d() {
        return this.c.stream().filter(this.j).findFirst().orElse(null);
    }

    public int b(@Nullable bfj $$0) {
        return $$0 == null ? this.h : this.d.getInt((Object)$$0);
    }

    public Optional<bfz> a() {
        return Optional.ofNullable(this.d()).filter($$0 -> $$0 instanceof bfz).map($$0 -> (bfz)$$0);
    }

    @VisibleForTesting
    protected record a(bxr a) implements Comparator<bfj>
    {
        public int a(bfj $$0, bfj $$1) {
            boolean $$5;
            if ($$0.equals($$1)) {
                return 0;
            }
            int $$2 = this.a.d.getOrDefault((Object)$$0, 0);
            int $$3 = this.a.d.getOrDefault((Object)$$1, 0);
            this.a.h = Math.max(this.a.h, Math.max($$2, $$3));
            boolean $$4 = bxq.a($$2).d();
            if ($$4 != ($$5 = bxq.a($$3).d())) {
                return $$4 ? -1 : 1;
            }
            boolean $$6 = $$0 instanceof byo;
            boolean $$7 = $$1 instanceof byo;
            if ($$6 != $$7) {
                return $$6 ? -1 : 1;
            }
            return Integer.compare($$3, $$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "angerManagement", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "angerManagement", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "angerManagement", "a"}, this, $$0);
        }

        @Override
        public /* synthetic */ int compare(Object object, Object object2) {
            return this.a((bfj)object, (bfj)object2);
        }
    }
}

