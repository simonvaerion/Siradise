/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Lifecycle
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.Validate
 *  org.slf4j.Logger
 */
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class hm<T>
implements ia<T> {
    private static final Logger b = LogUtils.getLogger();
    final acp<? extends hr<T>> c;
    private final ObjectList<he.c<T>> d = new ObjectArrayList(256);
    private final Object2IntMap<T> e = (Object2IntMap)ac.a(new Object2IntOpenCustomHashMap(ac.k()), (T $$0) -> $$0.defaultReturnValue(-1));
    private final Map<acq, he.c<T>> f = new HashMap<acq, he.c<T>>();
    private final Map<acp<T>, he.c<T>> g = new HashMap<acp<T>, he.c<T>>();
    private final Map<T, he.c<T>> h = new IdentityHashMap<T, he.c<T>>();
    private final Map<T, Lifecycle> i = new IdentityHashMap<T, Lifecycle>();
    private Lifecycle j;
    private volatile Map<anl<T>, hi.c<T>> k = new IdentityHashMap<anl<T>, hi.c<T>>();
    private boolean l;
    @Nullable
    private Map<T, he.c<T>> m;
    @Nullable
    private List<he.c<T>> n;
    private int o;
    private final hg.c<T> p = new hg.c<T>(){

        @Override
        public acp<? extends hr<? extends T>> f() {
            return hm.this.c;
        }

        @Override
        public Lifecycle g() {
            return hm.this.d();
        }

        @Override
        public Optional<he.c<T>> a(acp<T> $$0) {
            return hm.this.b($$0);
        }

        @Override
        public Stream<he.c<T>> b() {
            return hm.this.h();
        }

        @Override
        public Optional<hi.c<T>> a(anl<T> $$0) {
            return hm.this.b($$0);
        }

        @Override
        public Stream<hi.c<T>> d() {
            return hm.this.i().map(Pair::getSecond);
        }
    };

    public hm(acp<? extends hr<T>> $$0, Lifecycle $$1) {
        this($$0, $$1, false);
    }

    public hm(acp<? extends hr<T>> $$02, Lifecycle $$1, boolean $$2) {
        acs.a(() -> "registry " + $$02);
        this.c = $$02;
        this.j = $$1;
        if ($$2) {
            this.m = new IdentityHashMap<T, he.c<T>>();
        }
    }

    @Override
    public acp<? extends hr<T>> c() {
        return this.c;
    }

    public String toString() {
        return "Registry[" + this.c + " (" + this.j + ")]";
    }

    private List<he.c<T>> a() {
        if (this.n == null) {
            this.n = this.d.stream().filter(Objects::nonNull).toList();
        }
        return this.n;
    }

    private void v() {
        if (this.l) {
            throw new IllegalStateException("Registry is already frozen");
        }
    }

    private void g(acp<T> $$0) {
        if (this.l) {
            throw new IllegalStateException("Registry is already frozen (trying to add key " + $$0 + ")");
        }
    }

    public he.c<T> a(int $$02, acp<T> $$1, T $$2, Lifecycle $$3) {
        he.c $$5;
        this.g($$1);
        Validate.notNull($$1);
        Validate.notNull($$2);
        if (this.f.containsKey($$1.a())) {
            ac.b(new IllegalStateException("Adding duplicate key '" + $$1 + "' to registry"));
        }
        if (this.h.containsKey($$2)) {
            ac.b(new IllegalStateException("Adding duplicate value '" + $$2 + "' to registry"));
        }
        if (this.m != null) {
            he.c<acp<T>> $$4 = this.m.remove($$2);
            if ($$4 == null) {
                throw new AssertionError((Object)("Missing intrusive holder for " + $$1 + ":" + $$2));
            }
            $$4.b($$1);
        } else {
            $$5 = this.g.computeIfAbsent($$1, $$0 -> he.c.a(this.o(), $$0));
        }
        this.g.put($$1, $$5);
        this.f.put($$1.a(), $$5);
        this.h.put($$2, $$5);
        this.d.size(Math.max(this.d.size(), $$02 + 1));
        this.d.set($$02, (Object)$$5);
        this.e.put($$2, $$02);
        if (this.o <= $$02) {
            this.o = $$02 + 1;
        }
        this.i.put($$2, $$3);
        this.j = this.j.add($$3);
        this.n = null;
        return $$5;
    }

    @Override
    public he.c<T> a(acp<T> $$0, T $$1, Lifecycle $$2) {
        return this.a(this.o, $$0, $$1, $$2);
    }

    @Override
    @Nullable
    public acq b(T $$0) {
        he.c<T> $$1 = this.h.get($$0);
        return $$1 != null ? $$1.g().a() : null;
    }

    @Override
    public Optional<acp<T>> c(T $$0) {
        return Optional.ofNullable(this.h.get($$0)).map(he.c::g);
    }

    @Override
    public int a(@Nullable T $$0) {
        return this.e.getInt($$0);
    }

    @Override
    @Nullable
    public T a(@Nullable acp<T> $$0) {
        return hm.a(this.g.get($$0));
    }

    @Override
    @Nullable
    public T a(int $$0) {
        if ($$0 < 0 || $$0 >= this.d.size()) {
            return null;
        }
        return hm.a((he.c)this.d.get($$0));
    }

    @Override
    public Optional<he.c<T>> c(int $$0) {
        if ($$0 < 0 || $$0 >= this.d.size()) {
            return Optional.empty();
        }
        return Optional.ofNullable((he.c)this.d.get($$0));
    }

    @Override
    public Optional<he.c<T>> b(acp<T> $$0) {
        return Optional.ofNullable(this.g.get($$0));
    }

    @Override
    public he<T> d(T $$0) {
        he.c<T> $$1 = this.h.get($$0);
        return $$1 != null ? $$1 : he.a($$0);
    }

    he.c<T> h(acp<T> $$02) {
        return this.g.computeIfAbsent($$02, $$0 -> {
            if (this.m != null) {
                throw new IllegalStateException("This registry can't create new holders without value");
            }
            this.g((acp<T>)$$0);
            return he.c.a(this.o(), $$0);
        });
    }

    @Override
    public int b() {
        return this.g.size();
    }

    @Override
    public Lifecycle e(T $$0) {
        return this.i.get($$0);
    }

    @Override
    public Lifecycle d() {
        return this.j;
    }

    @Override
    public Iterator<T> iterator() {
        return Iterators.transform(this.a().iterator(), he::a);
    }

    @Override
    @Nullable
    public T a(@Nullable acq $$0) {
        he.c<T> $$1 = this.f.get($$0);
        return hm.a($$1);
    }

    @Nullable
    private static <T> T a(@Nullable he.c<T> $$0) {
        return $$0 != null ? (T)$$0.a() : null;
    }

    @Override
    public Set<acq> e() {
        return Collections.unmodifiableSet(this.f.keySet());
    }

    @Override
    public Set<acp<T>> f() {
        return Collections.unmodifiableSet(this.g.keySet());
    }

    @Override
    public Set<Map.Entry<acp<T>, T>> g() {
        return Collections.unmodifiableSet(Maps.transformValues(this.g, he::a).entrySet());
    }

    @Override
    public Stream<he.c<T>> h() {
        return this.a().stream();
    }

    @Override
    public Stream<Pair<anl<T>, hi.c<T>>> i() {
        return this.k.entrySet().stream().map($$0 -> Pair.of((Object)((anl)$$0.getKey()), (Object)((hi.c)$$0.getValue())));
    }

    @Override
    public hi.c<T> a(anl<T> $$0) {
        hi.c<T> $$1 = this.k.get($$0);
        if ($$1 == null) {
            $$1 = this.d($$0);
            IdentityHashMap<anl<T>, hi.c<T>> $$2 = new IdentityHashMap<anl<T>, hi.c<T>>(this.k);
            $$2.put($$0, $$1);
            this.k = $$2;
        }
        return $$1;
    }

    @Override
    private hi.c<T> d(anl<T> $$0) {
        return new hi.c<T>(this.o(), $$0);
    }

    @Override
    public Stream<anl<T>> j() {
        return this.k.keySet().stream();
    }

    @Override
    public boolean k() {
        return this.g.isEmpty();
    }

    @Override
    public Optional<he.c<T>> a(apf $$0) {
        return ac.b(this.a(), $$0);
    }

    @Override
    public boolean c(acq $$0) {
        return this.f.containsKey($$0);
    }

    @Override
    public boolean c(acp<T> $$0) {
        return this.g.containsKey($$0);
    }

    @Override
    public hr<T> l() {
        if (this.l) {
            return this;
        }
        this.l = true;
        this.h.forEach((? super K $$0, ? super V $$1) -> $$1.b($$0));
        List<acq> $$02 = this.g.entrySet().stream().filter($$0 -> !((he.c)$$0.getValue()).b()).map($$0 -> ((acp)$$0.getKey()).a()).sorted().toList();
        if (!$$02.isEmpty()) {
            throw new IllegalStateException("Unbound values in registry " + this.c() + ": " + $$02);
        }
        if (this.m != null) {
            if (!this.m.isEmpty()) {
                throw new IllegalStateException("Some intrusive holders were not registered: " + this.m.values());
            }
            this.m = null;
        }
        return this;
    }

    @Override
    public he.c<T> f(T $$02) {
        if (this.m == null) {
            throw new IllegalStateException("This registry can't create intrusive holders");
        }
        this.v();
        return this.m.computeIfAbsent($$02, $$0 -> he.c.a(this.p(), $$0));
    }

    @Override
    public Optional<hi.c<T>> b(anl<T> $$0) {
        return Optional.ofNullable(this.k.get($$0));
    }

    @Override
    public void a(Map<anl<T>, List<he<T>>> $$02) {
        IdentityHashMap<he.c, List> $$12 = new IdentityHashMap<he.c, List>();
        this.g.values().forEach($$1 -> $$12.put((he.c)$$1, new ArrayList()));
        $$02.forEach((? super K $$1, ? super V $$2) -> {
            for (he $$3 : $$2) {
                if (!$$3.a(this.p())) {
                    throw new IllegalStateException("Can't create named set " + $$1 + " containing value " + $$3 + " from outside registry " + this);
                }
                if ($$3 instanceof he.c) {
                    he.c $$4 = (he.c)$$3;
                    ((List)$$12.get($$4)).add($$1);
                    continue;
                }
                throw new IllegalStateException("Found direct holder " + $$3 + " value in tag " + $$1);
            }
        });
        Sets.SetView $$22 = Sets.difference(this.k.keySet(), $$02.keySet());
        if (!$$22.isEmpty()) {
            b.warn("Not all defined tags for registry {} are present in data pack: {}", this.c(), (Object)$$22.stream().map($$0 -> $$0.b().toString()).sorted().collect(Collectors.joining(", ")));
        }
        IdentityHashMap<anl<T>, hi.c<T>> $$3 = new IdentityHashMap<anl<T>, hi.c<T>>(this.k);
        $$02.forEach((? super K $$1, ? super V $$2) -> $$3.computeIfAbsent((anl<T>)$$1, this::d).b($$2));
        $$12.forEach(he.c::a);
        this.k = $$3;
    }

    @Override
    public void m() {
        this.k.values().forEach($$0 -> $$0.b(List.of()));
        this.g.values().forEach($$0 -> $$0.a(Set.of()));
    }

    @Override
    public hf<T> n() {
        this.v();
        return new hf<T>(){

            @Override
            public Optional<he.c<T>> a(acp<T> $$0) {
                return Optional.of(this.b($$0));
            }

            @Override
            public he.c<T> b(acp<T> $$0) {
                return hm.this.h($$0);
            }

            @Override
            public Optional<hi.c<T>> a(anl<T> $$0) {
                return Optional.of(this.b($$0));
            }

            @Override
            public hi.c<T> b(anl<T> $$0) {
                return hm.this.a($$0);
            }
        };
    }

    @Override
    public hh<T> o() {
        return this.p;
    }

    @Override
    public hg.c<T> p() {
        return this.p;
    }

    @Override
    public /* synthetic */ he b(int n2, acp acp2, Object object, Lifecycle lifecycle) {
        return this.a(n2, acp2, object, lifecycle);
    }
}

