/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Lifecycle
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.serialization.Lifecycle;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class hu {
    private final List<g<?>> a = new ArrayList();

    static <T> hf<T> a(final hg.c<T> $$0) {
        return new c<T>($$0){

            @Override
            public Optional<he.c<T>> a(acp<T> $$02) {
                return $$0.a($$02);
            }
        };
    }

    public <T> hu a(acp<? extends hr<T>> $$0, Lifecycle $$1, e<T> $$2) {
        this.a.add(new g<T>($$0, $$1, $$2));
        return this;
    }

    public <T> hu a(acp<? extends hr<T>> $$0, e<T> $$1) {
        return this.a($$0, Lifecycle.stable(), $$1);
    }

    private a b(hs $$0) {
        a $$12 = hu$a.a($$0, this.a.stream().map(g::a));
        this.a.forEach($$1 -> $$1.b($$12));
        return $$12;
    }

    public hg.b a(hs $$02) {
        a $$12 = this.b($$02);
        Stream<hg.c> $$2 = $$02.b().map($$0 -> $$0.b().p());
        Stream<hg.c> $$3 = this.a.stream().map($$1 -> $$1.a($$12).a());
        hg.b $$4 = hg.b.a(Stream.concat($$2, $$3.peek($$12::a)));
        $$12.b();
        $$12.c();
        return $$4;
    }

    public hg.b a(hs $$02, hg.b $$12) {
        a $$2 = this.b($$02);
        HashMap $$3 = new HashMap();
        $$2.d().forEach($$1 -> $$3.put($$1.a, $$1));
        this.a.stream().map($$1 -> $$1.a($$2)).forEach($$1 -> $$3.put($$1.a, $$1));
        Stream<hg.c> $$4 = $$02.b().map($$0 -> $$0.b().p());
        hg.b $$5 = hg.b.a(Stream.concat($$4, $$3.values().stream().map(f::a).peek($$2::a)));
        $$2.a($$12);
        $$2.b();
        $$2.c();
        return $$5;
    }

    record g<T>(acp<? extends hr<T>> a, Lifecycle b, e<T> c) {
        void b(a $$0) {
            this.c.run($$0.a());
        }

        public f<T> a(a $$0) {
            HashMap $$1 = new HashMap();
            Iterator<Map.Entry<acp<?>, d<?>>> $$2 = $$0.d.entrySet().iterator();
            while ($$2.hasNext()) {
                Map.Entry<acp<?>, d<?>> $$3 = $$2.next();
                acp<?> $$4 = $$3.getKey();
                if (!$$4.b(this.a)) continue;
                acp<?> $$5 = $$4;
                d<?> $$6 = $$3.getValue();
                he.c<Object> $$7 = $$0.b.a.remove($$4);
                $$1.put($$5, new i($$6, Optional.ofNullable($$7)));
                $$2.remove();
            }
            return new f(this.a, this.b, $$1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{g.class, "key;lifecycle;bootstrap", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{g.class, "key;lifecycle;bootstrap", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{g.class, "key;lifecycle;bootstrap", "a", "b", "c"}, this, $$0);
        }
    }

    @FunctionalInterface
    public static interface e<T> {
        public void run(nm<T> var1);
    }

    static final class a
    extends Record {
        private final b a;
        final h b;
        final Map<acq, hf<?>> c;
        final Map<acp<?>, d<?>> d;
        final List<RuntimeException> e;

        private a(b $$0, h $$1, Map<acq, hf<?>> $$2, Map<acp<?>, d<?>> $$3, List<RuntimeException> $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        public static a a(hs $$0, Stream<acp<? extends hr<?>>> $$12) {
            b $$22 = new b();
            ArrayList<RuntimeException> $$3 = new ArrayList<RuntimeException>();
            h $$4 = new h($$22);
            ImmutableMap.Builder $$5 = ImmutableMap.builder();
            $$0.b().forEach($$1 -> $$5.put((Object)$$1.a().a(), hu.a($$1.b().p())));
            $$12.forEach($$2 -> $$5.put((Object)$$2.a(), (Object)$$4));
            return new a($$22, $$4, (Map<acq, hf<?>>)$$5.build(), new HashMap(), (List<RuntimeException>)$$3);
        }

        public <T> nm<T> a() {
            return new nm<T>(){

                @Override
                public he.c<T> a(acp<T> $$0, T $$1, Lifecycle $$2) {
                    d $$3 = d.put($$0, new d($$1, $$2));
                    if ($$3 != null) {
                        e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
                    }
                    return b.c($$0);
                }

                @Override
                public <S> hf<S> a(acp<? extends hr<? extends S>> $$0) {
                    return c.getOrDefault($$0.a(), b);
                }
            };
        }

        public void b() {
            for (acp<Object> $$02 : this.b.a.keySet()) {
                this.e.add(new IllegalStateException("Unreferenced key: " + $$02));
            }
            this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
        }

        public void c() {
            if (!this.e.isEmpty()) {
                IllegalStateException $$0 = new IllegalStateException("Errors during registry creation");
                for (RuntimeException $$1 : this.e) {
                    $$0.addSuppressed($$1);
                }
                throw $$0;
            }
        }

        public void a(hh<?> $$0) {
            this.a.b($$0);
        }

        public void a(hg.b $$0) {
            HashMap<acq, Optional> $$12 = new HashMap<acq, Optional>();
            Iterator<Map.Entry<acp<Object>, he.c<Object>>> $$22 = this.b.a.entrySet().iterator();
            while ($$22.hasNext()) {
                Map.Entry<acp<Object>, he.c<Object>> $$3 = $$22.next();
                acp<Object> $$4 = $$3.getKey();
                he.c<Object> $$5 = $$3.getValue();
                $$12.computeIfAbsent($$4.b(), $$1 -> $$0.a(acp.a($$1))).flatMap($$1 -> $$1.a($$4)).ifPresent($$2 -> {
                    $$5.b($$2.a());
                    $$22.remove();
                });
            }
        }

        public Stream<f<?>> d() {
            return this.b.a.keySet().stream().map(acp::b).distinct().map($$0 -> new f(acp.a($$0), Lifecycle.stable(), Map.of()));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "owner;lookup;registries;registeredValues;errors", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "owner;lookup;registries;registeredValues;errors", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "owner;lookup;registries;registeredValues;errors", "a", "b", "c", "d", "e"}, this, $$0);
        }

        public b e() {
            return this.a;
        }

        public h f() {
            return this.b;
        }

        public Map<acq, hf<?>> g() {
            return this.c;
        }

        public Map<acp<?>, d<?>> h() {
            return this.d;
        }

        public List<RuntimeException> i() {
            return this.e;
        }
    }

    static final class f<T>
    extends Record {
        final acp<? extends hr<? extends T>> a;
        final Lifecycle b;
        final Map<acp<T>, i<T>> c;

        f(acp<? extends hr<? extends T>> $$0, Lifecycle $$1, Map<acp<T>, i<T>> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public hg.c<T> a() {
            return new hg.c<T>(){
                private final Map<acp<T>, he.c<T>> b;
                {
                    this.b = c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, $$0 -> {
                        i $$1 = (i)$$0.getValue();
                        he.c $$2 = $$1.b().orElseGet(() -> he.c.a(this, (acp)$$0.getKey()));
                        $$2.b($$1.a().a());
                        return $$2;
                    }));
                }

                @Override
                public acp<? extends hr<? extends T>> f() {
                    return a;
                }

                @Override
                public Lifecycle g() {
                    return b;
                }

                @Override
                public Optional<he.c<T>> a(acp<T> $$0) {
                    return Optional.ofNullable(this.b.get($$0));
                }

                @Override
                public Stream<he.c<T>> b() {
                    return this.b.values().stream();
                }

                @Override
                public Optional<hi.c<T>> a(anl<T> $$0) {
                    return Optional.empty();
                }

                @Override
                public Stream<hi.c<T>> d() {
                    return Stream.empty();
                }
            };
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "key;lifecycle;values", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "key;lifecycle;values", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "key;lifecycle;values", "a", "b", "c"}, this, $$0);
        }

        public acp<? extends hr<? extends T>> b() {
            return this.a;
        }

        public Lifecycle c() {
            return this.b;
        }

        public Map<acp<T>, i<T>> d() {
            return this.c;
        }
    }

    record i<T>(d<T> a, Optional<he.c<T>> b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{i.class, "value;holder", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{i.class, "value;holder", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{i.class, "value;holder", "a", "b"}, this, $$0);
        }
    }

    static final class d<T>
    extends Record {
        final T a;
        private final Lifecycle b;

        d(T $$0, Lifecycle $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "value;lifecycle", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "value;lifecycle", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "value;lifecycle", "a", "b"}, this, $$0);
        }

        public T a() {
            return this.a;
        }

        public Lifecycle b() {
            return this.b;
        }
    }

    static class h
    extends c<Object> {
        final Map<acp<Object>, he.c<Object>> a = new HashMap<acp<Object>, he.c<Object>>();

        public h(hh<Object> $$0) {
            super($$0);
        }

        @Override
        public Optional<he.c<Object>> a(acp<Object> $$0) {
            return Optional.of(this.c($$0));
        }

        <T> he.c<T> c(acp<T> $$02) {
            return this.a.computeIfAbsent($$02, $$0 -> he.c.a(this.b, $$0));
        }
    }

    static class b
    implements hh<Object> {
        private final Set<hh<?>> a = Sets.newIdentityHashSet();

        b() {
        }

        @Override
        public boolean a(hh<Object> $$0) {
            return this.a.contains($$0);
        }

        public void b(hh<?> $$0) {
            this.a.add($$0);
        }
    }

    static abstract class c<T>
    implements hf<T> {
        protected final hh<T> b;

        protected c(hh<T> $$0) {
            this.b = $$0;
        }

        @Override
        public Optional<hi.c<T>> a(anl<T> $$0) {
            return Optional.of(hi.a(this.b, $$0));
        }
    }
}

