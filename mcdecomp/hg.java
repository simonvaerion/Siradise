/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 */
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface hg<T>
extends hf<T> {
    public Stream<he.c<T>> b();

    default public Stream<acp<T>> c() {
        return this.b().map(he.c::g);
    }

    public Stream<hi.c<T>> d();

    default public Stream<anl<T>> e() {
        return this.d().map(hi.c::f);
    }

    default public hg<T> a(final Predicate<T> $$0) {
        return new a<T>(this){

            @Override
            public Optional<he.c<T>> a(acp<T> $$02) {
                return this.c.a($$02).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<he.c<T>> b() {
                return this.c.b().filter($$1 -> $$0.test($$1.a()));
            }
        };
    }

    public static interface b {
        public <T> Optional<c<T>> a(acp<? extends hr<? extends T>> var1);

        default public <T> c<T> b(acp<? extends hr<? extends T>> $$0) {
            return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
        }

        default public hf.a a() {
            return new hf.a(){

                @Override
                public <T> Optional<hf<T>> a(acp<? extends hr<? extends T>> $$02) {
                    return this.a($$02).map($$0 -> $$0);
                }
            };
        }

        public static b a(Stream<c<?>> $$02) {
            final Map<acp, c> $$1 = $$02.collect(Collectors.toUnmodifiableMap(c::f, $$0 -> $$0));
            return new b(){

                @Override
                public <T> Optional<c<T>> a(acp<? extends hr<? extends T>> $$0) {
                    return Optional.ofNullable((c)$$1.get($$0));
                }
            };
        }
    }

    public static class a<T>
    implements hg<T> {
        protected final hg<T> c;

        public a(hg<T> $$0) {
            this.c = $$0;
        }

        @Override
        public Optional<he.c<T>> a(acp<T> $$0) {
            return this.c.a($$0);
        }

        @Override
        public Stream<he.c<T>> b() {
            return this.c.b();
        }

        @Override
        public Optional<hi.c<T>> a(anl<T> $$0) {
            return this.c.a($$0);
        }

        @Override
        public Stream<hi.c<T>> d() {
            return this.c.d();
        }
    }

    public static interface c<T>
    extends hg<T>,
    hh<T> {
        public acp<? extends hr<? extends T>> f();

        public Lifecycle g();

        default public hg<T> a(caw $$0) {
            if (cat.bv.contains(this.f())) {
                return this.a((T $$1) -> ((cat)$$1).a($$0));
            }
            return this;
        }

        public static abstract class a<T>
        implements c<T> {
            protected abstract c<T> a();

            @Override
            public acp<? extends hr<? extends T>> f() {
                return this.a().f();
            }

            @Override
            public Lifecycle g() {
                return this.a().g();
            }

            @Override
            public Optional<he.c<T>> a(acp<T> $$0) {
                return this.a().a($$0);
            }

            @Override
            public Stream<he.c<T>> b() {
                return this.a().b();
            }

            @Override
            public Optional<hi.c<T>> a(anl<T> $$0) {
                return this.a().a($$0);
            }

            @Override
            public Stream<hi.c<T>> d() {
                return this.a().d();
            }
        }
    }
}

