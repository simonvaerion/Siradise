/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class bha<E extends bfz> {
    static final Logger a = LogUtils.getLogger();
    private final Supplier<Codec<bha<E>>> b;
    private static final int c = 20;
    private final Map<bpb<?>, Optional<? extends bpa<?>>> d = Maps.newHashMap();
    private final Map<bqg<? extends bqf<? super E>>, bqf<? super E>> e = Maps.newLinkedHashMap();
    private final Map<Integer, Map<bzz, Set<bhs<? super E>>>> f = Maps.newTreeMap();
    private cab g = cab.c;
    private final Map<bzz, Set<Pair<bpb<?>, bpc>>> h = Maps.newHashMap();
    private final Map<bzz, Set<bpb<?>>> i = Maps.newHashMap();
    private Set<bzz> j = Sets.newHashSet();
    private final Set<bzz> k = Sets.newHashSet();
    private bzz l = bzz.b;
    private long m = -9999L;

    public static <E extends bfz> b<E> a(Collection<? extends bpb<?>> $$0, Collection<? extends bqg<? extends bqf<? super E>>> $$1) {
        return new b($$0, $$1);
    }

    public static <E extends bfz> Codec<bha<E>> b(final Collection<? extends bpb<?>> $$0, final Collection<? extends bqg<? extends bqf<? super E>>> $$1) {
        final MutableObject $$2 = new MutableObject();
        $$2.setValue((Object)new MapCodec<bha<E>>(){

            public <T> Stream<T> keys(DynamicOps<T> $$02) {
                return $$0.stream().flatMap($$0 -> $$0.a().map($$1 -> jb.C.b((bpb<?>)$$0)).stream()).map($$1 -> $$02.createString($$1.toString()));
            }

            public <T> DataResult<bha<E>> decode(DynamicOps<T> $$02, MapLike<T> $$12) {
                MutableObject $$22 = new MutableObject((Object)DataResult.success((Object)ImmutableList.builder()));
                $$12.entries().forEach($$22 -> {
                    DataResult $$3 = jb.C.q().parse($$02, $$22.getFirst());
                    DataResult $$4 = $$3.flatMap($$2 -> this.a((bpb)$$2, $$02, (Object)$$22.getSecond()));
                    $$22.setValue((Object)((DataResult)$$22.getValue()).apply2(ImmutableList.Builder::add, $$4));
                });
                ImmutableList $$3 = ((DataResult)$$22.getValue()).resultOrPartial(arg_0 -> ((Logger)a).error(arg_0)).map(ImmutableList.Builder::build).orElseGet(ImmutableList::of);
                return DataResult.success(new bha($$0, $$1, $$3, () -> ((MutableObject)$$2).getValue()));
            }

            private <T, U> DataResult<a<U>> a(bpb<U> $$02, DynamicOps<T> $$12, T $$22) {
                return $$02.a().map(DataResult::success).orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$02)).flatMap($$2 -> $$2.parse($$12, $$22)).map($$1 -> new a($$02, Optional.of($$1)));
            }

            public <T> RecordBuilder<T> a(bha<E> $$02, DynamicOps<T> $$12, RecordBuilder<T> $$22) {
                $$02.j().forEach($$2 -> $$2.a($$12, $$22));
                return $$22;
            }

            public /* synthetic */ RecordBuilder encode(Object object, DynamicOps dynamicOps, RecordBuilder recordBuilder) {
                return this.a((bha)object, dynamicOps, recordBuilder);
            }
        }.fieldOf("memories").codec());
        return (Codec)$$2.getValue();
    }

    public bha(Collection<? extends bpb<?>> $$0, Collection<? extends bqg<? extends bqf<? super E>>> $$1, ImmutableList<a<?>> $$2, Supplier<Codec<bha<E>>> $$3) {
        this.b = $$3;
        for (bpb<?> bpb2 : $$0) {
            this.d.put(bpb2, Optional.empty());
        }
        for (bqg bqg2 : $$1) {
            this.e.put(bqg2, (bqf<E>)bqg2.a());
        }
        for (bqf bqf2 : this.e.values()) {
            for (bpb<?> $$7 : bqf2.a()) {
                this.d.put($$7, Optional.empty());
            }
        }
        for (a a2 : $$2) {
            a2.a(this);
        }
    }

    public <T> DataResult<T> a(DynamicOps<T> $$0) {
        return this.b.get().encodeStart($$0, (Object)this);
    }

    Stream<a<?>> j() {
        return this.d.entrySet().stream().map($$0 -> bha$a.a((bpb)$$0.getKey(), (Optional)$$0.getValue()));
    }

    public boolean a(bpb<?> $$0) {
        return this.a($$0, bpc.a);
    }

    public void a() {
        this.d.keySet().forEach($$0 -> this.d.put((bpb<?>)$$0, Optional.empty()));
    }

    public <U> void b(bpb<U> $$0) {
        this.a($$0, Optional.empty());
    }

    public <U> void a(bpb<U> $$0, @Nullable U $$1) {
        this.a($$0, Optional.ofNullable($$1));
    }

    public <U> void a(bpb<U> $$0, U $$1, long $$2) {
        this.b($$0, Optional.of(bpa.a($$1, $$2)));
    }

    public <U> void a(bpb<U> $$0, Optional<? extends U> $$1) {
        this.b($$0, $$1.map(bpa::a));
    }

    <U> void b(bpb<U> $$0, Optional<? extends bpa<?>> $$1) {
        if (this.d.containsKey($$0)) {
            if ($$1.isPresent() && this.a($$1.get().c())) {
                this.b($$0);
            } else {
                this.d.put($$0, $$1);
            }
        }
    }

    public <U> Optional<U> c(bpb<U> $$0) {
        Optional<bpa<?>> $$1 = this.d.get($$0);
        if ($$1 == null) {
            throw new IllegalStateException("Unregistered memory fetched: " + $$0);
        }
        return $$1.map(bpa::c);
    }

    @Nullable
    public <U> Optional<U> d(bpb<U> $$0) {
        Optional<bpa<?>> $$1 = this.d.get($$0);
        if ($$1 == null) {
            return null;
        }
        return $$1.map(bpa::c);
    }

    public <U> long e(bpb<U> $$0) {
        Optional<bpa<?>> $$1 = this.d.get($$0);
        return $$1.map(bpa::b).orElse(0L);
    }

    @Deprecated
    @aqa
    public Map<bpb<?>, Optional<? extends bpa<?>>> b() {
        return this.d;
    }

    public <U> boolean b(bpb<U> $$0, U $$12) {
        if (!this.a($$0)) {
            return false;
        }
        return this.c($$0).filter($$1 -> $$1.equals($$12)).isPresent();
    }

    public boolean a(bpb<?> $$0, bpc $$1) {
        Optional<bpa<?>> $$2 = this.d.get($$0);
        if ($$2 == null) {
            return false;
        }
        return $$1 == bpc.c || $$1 == bpc.a && $$2.isPresent() || $$1 == bpc.b && !$$2.isPresent();
    }

    public cab c() {
        return this.g;
    }

    public void a(cab $$0) {
        this.g = $$0;
    }

    public void a(Set<bzz> $$0) {
        this.j = $$0;
    }

    @Deprecated
    @aqa
    public Set<bzz> d() {
        return this.k;
    }

    @Deprecated
    @aqa
    public List<bhs<? super E>> e() {
        ObjectArrayList $$0 = new ObjectArrayList();
        for (Map<bzz, Set<bhs<E>>> $$1 : this.f.values()) {
            for (Set<bhs<E>> $$2 : $$1.values()) {
                for (bhs<E> $$3 : $$2) {
                    if ($$3.a() != bhr.a.b) continue;
                    $$0.add($$3);
                }
            }
        }
        return $$0;
    }

    public void f() {
        this.d(this.l);
    }

    public Optional<bzz> g() {
        for (bzz $$0 : this.k) {
            if (this.j.contains($$0)) continue;
            return Optional.of($$0);
        }
        return Optional.empty();
    }

    public void a(bzz $$0) {
        if (this.f($$0)) {
            this.d($$0);
        } else {
            this.f();
        }
    }

    private void d(bzz $$0) {
        if (this.c($$0)) {
            return;
        }
        this.e($$0);
        this.k.clear();
        this.k.addAll(this.j);
        this.k.add($$0);
    }

    private void e(bzz $$0) {
        for (bzz $$1 : this.k) {
            Set<bpb<?>> $$2;
            if ($$1 == $$0 || ($$2 = this.i.get($$1)) == null) continue;
            for (bpb<?> $$3 : $$2) {
                this.b($$3);
            }
        }
    }

    public void a(long $$0, long $$1) {
        if ($$1 - this.m > 20L) {
            this.m = $$1;
            bzz $$2 = this.c().a((int)($$0 % 24000L));
            if (!this.k.contains($$2)) {
                this.a($$2);
            }
        }
    }

    public void a(List<bzz> $$0) {
        for (bzz $$1 : $$0) {
            if (!this.f($$1)) continue;
            this.d($$1);
            break;
        }
    }

    public void b(bzz $$0) {
        this.l = $$0;
    }

    public void a(bzz $$0, int $$1, ImmutableList<? extends bhs<? super E>> $$2) {
        this.a($$0, this.a($$1, $$2));
    }

    public void a(bzz $$0, int $$1, ImmutableList<? extends bhs<? super E>> $$2, bpb<?> $$3) {
        ImmutableSet $$4 = ImmutableSet.of((Object)Pair.of($$3, (Object)((Object)bpc.a)));
        ImmutableSet $$5 = ImmutableSet.of($$3);
        this.a($$0, (ImmutableList<? extends Pair<Integer, ? extends bhs<? super E>>>)this.a($$1, $$2), (Set<Pair<bpb<?>, bpc>>)$$4, (Set<bpb<?>>)$$5);
    }

    public void a(bzz $$0, ImmutableList<? extends Pair<Integer, ? extends bhs<? super E>>> $$1) {
        this.a($$0, $$1, (Set<Pair<bpb<?>, bpc>>)ImmutableSet.of(), Sets.newHashSet());
    }

    public void a(bzz $$0, ImmutableList<? extends Pair<Integer, ? extends bhs<? super E>>> $$1, Set<Pair<bpb<?>, bpc>> $$2) {
        this.a($$0, $$1, $$2, Sets.newHashSet());
    }

    public void a(bzz $$02, ImmutableList<? extends Pair<Integer, ? extends bhs<? super E>>> $$1, Set<Pair<bpb<?>, bpc>> $$2, Set<bpb<?>> $$3) {
        this.h.put($$02, $$2);
        if (!$$3.isEmpty()) {
            this.i.put($$02, $$3);
        }
        for (Pair $$4 : $$1) {
            this.f.computeIfAbsent((Integer)$$4.getFirst(), $$0 -> Maps.newHashMap()).computeIfAbsent($$02, $$0 -> Sets.newLinkedHashSet()).add((bhs)$$4.getSecond());
        }
    }

    @VisibleForTesting
    public void h() {
        this.f.clear();
    }

    public boolean c(bzz $$0) {
        return this.k.contains($$0);
    }

    public bha<E> i() {
        bha<E> $$0 = new bha<E>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);
        for (Map.Entry<bpb<?>, Optional<bpa<?>>> $$1 : this.d.entrySet()) {
            bpb<?> $$2 = $$1.getKey();
            if (!$$1.getValue().isPresent()) continue;
            $$0.d.put($$2, $$1.getValue());
        }
        return $$0;
    }

    public void a(aif $$0, E $$1) {
        this.k();
        this.c($$0, $$1);
        this.d($$0, $$1);
        this.e($$0, $$1);
    }

    private void c(aif $$0, E $$1) {
        for (bqf<E> $$2 : this.e.values()) {
            $$2.b($$0, $$1);
        }
    }

    private void k() {
        for (Map.Entry<bpb<?>, Optional<bpa<?>>> $$0 : this.d.entrySet()) {
            if (!$$0.getValue().isPresent()) continue;
            bpa<?> $$1 = $$0.getValue().get();
            if ($$1.d()) {
                this.b($$0.getKey());
            }
            $$1.a();
        }
    }

    public void b(aif $$0, E $$1) {
        long $$2 = ((bfj)$$1).dI().V();
        for (bhs<E> $$3 : this.e()) {
            $$3.g($$0, $$1, $$2);
        }
    }

    private void d(aif $$0, E $$1) {
        long $$2 = $$0.V();
        for (Map<bzz, Set<bhs<E>>> $$3 : this.f.values()) {
            for (Map.Entry<bzz, Set<bhs<E>>> $$4 : $$3.entrySet()) {
                bzz $$5 = $$4.getKey();
                if (!this.k.contains($$5)) continue;
                Set<bhs<E>> $$6 = $$4.getValue();
                for (bhs<E> $$7 : $$6) {
                    if ($$7.a() != bhr.a.a) continue;
                    $$7.e($$0, $$1, $$2);
                }
            }
        }
    }

    private void e(aif $$0, E $$1) {
        long $$2 = $$0.V();
        for (bhs<E> $$3 : this.e()) {
            $$3.f($$0, $$1, $$2);
        }
    }

    private boolean f(bzz $$0) {
        if (!this.h.containsKey($$0)) {
            return false;
        }
        for (Pair<bpb<?>, bpc> $$1 : this.h.get($$0)) {
            bpc $$3;
            bpb $$2 = (bpb)$$1.getFirst();
            if (this.a($$2, $$3 = (bpc)((Object)$$1.getSecond()))) continue;
            return false;
        }
        return true;
    }

    private boolean a(Object $$0) {
        return $$0 instanceof Collection && ((Collection)$$0).isEmpty();
    }

    ImmutableList<? extends Pair<Integer, ? extends bhs<? super E>>> a(int $$0, ImmutableList<? extends bhs<? super E>> $$1) {
        int $$2 = $$0;
        ImmutableList.Builder $$3 = ImmutableList.builder();
        for (bhs $$4 : $$1) {
            $$3.add((Object)Pair.of((Object)$$2++, (Object)$$4));
        }
        return $$3.build();
    }

    public static final class b<E extends bfz> {
        private final Collection<? extends bpb<?>> a;
        private final Collection<? extends bqg<? extends bqf<? super E>>> b;
        private final Codec<bha<E>> c;

        b(Collection<? extends bpb<?>> $$0, Collection<? extends bqg<? extends bqf<? super E>>> $$1) {
            this.a = $$0;
            this.b = $$1;
            this.c = bha.b($$0, $$1);
        }

        public bha<E> a(Dynamic<?> $$0) {
            return this.c.parse($$0).resultOrPartial(arg_0 -> ((Logger)a).error(arg_0)).orElseGet(() -> new bha(this.a, this.b, ImmutableList.of(), () -> this.c));
        }
    }

    static final class a<U> {
        private final bpb<U> a;
        private final Optional<? extends bpa<U>> b;

        static <U> a<U> a(bpb<U> $$0, Optional<? extends bpa<?>> $$1) {
            return new a<U>($$0, $$1);
        }

        a(bpb<U> $$0, Optional<? extends bpa<U>> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        void a(bha<?> $$0) {
            $$0.b(this.a, this.b);
        }

        public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
            this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(jb.C.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
        }
    }
}

