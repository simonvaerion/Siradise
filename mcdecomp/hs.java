/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Lifecycle
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface hs
extends hg.b {
    public static final Logger a = LogUtils.getLogger();
    public static final b b = new c(Map.of()).c();

    public <E> Optional<hr<E>> c(acp<? extends hr<? extends E>> var1);

    @Override
    default public <T> Optional<hg.c<T>> a(acp<? extends hr<? extends T>> $$0) {
        return this.c($$0).map(hr::p);
    }

    default public <E> hr<E> d(acp<? extends hr<? extends E>> $$0) {
        return this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
    }

    public Stream<d<?>> b();

    public static b a(final hr<? extends hr<?>> $$0) {
        return new b(){

            public <T> Optional<hr<T>> c(acp<? extends hr<? extends T>> $$02) {
                hr $$1 = $$0;
                return $$1.d($$02);
            }

            @Override
            public Stream<d<?>> b() {
                return $$0.g().stream().map(d::a);
            }

            @Override
            public b c() {
                return this;
            }
        };
    }

    default public b c() {
        class A
        extends c
        implements b {
            protected A(Stream<d<?>> $$1) {
                super($$1);
            }
        }
        return new A(this.b().map(d::c));
    }

    default public Lifecycle d() {
        return this.b().map($$0 -> $$0.b.d()).reduce(Lifecycle.stable(), Lifecycle::add);
    }

    public static final class d<T>
    extends Record {
        private final acp<? extends hr<T>> a;
        final hr<T> b;

        public d(acp<? extends hr<T>> $$0, hr<T> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        private static <T, R extends hr<? extends T>> d<T> a(Map.Entry<? extends acp<? extends hr<?>>, R> $$0) {
            return d.a($$0.getKey(), (hr)$$0.getValue());
        }

        private static <T> d<T> a(acp<? extends hr<?>> $$0, hr<?> $$1) {
            return new d($$0, $$1);
        }

        private d<T> c() {
            return new d<T>(this.a, this.b.l());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "key;value", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "key;value", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "key;value", "a", "b"}, this, $$0);
        }

        public acp<? extends hr<T>> a() {
            return this.a;
        }

        public hr<T> b() {
            return this.b;
        }
    }

    public static class c
    implements hs {
        private final Map<? extends acp<? extends hr<?>>, ? extends hr<?>> c;

        public c(List<? extends hr<?>> $$02) {
            this.c = $$02.stream().collect(Collectors.toUnmodifiableMap(hr::c, $$0 -> $$0));
        }

        public c(Map<? extends acp<? extends hr<?>>, ? extends hr<?>> $$0) {
            this.c = Map.copyOf($$0);
        }

        public c(Stream<d<?>> $$0) {
            this.c = (Map)$$0.collect(ImmutableMap.toImmutableMap(d::a, d::b));
        }

        @Override
        public <E> Optional<hr<E>> c(acp<? extends hr<? extends E>> $$02) {
            return Optional.ofNullable(this.c.get($$02)).map($$0 -> $$0);
        }

        @Override
        public Stream<d<?>> b() {
            return this.c.entrySet().stream().map(d::a);
        }
    }

    public static interface b
    extends hs {
    }
}

