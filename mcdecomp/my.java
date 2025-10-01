/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonElement
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public abstract class my<T>
implements ji {
    private static final Logger d = LogUtils.getLogger();
    protected final jk.a e;
    private final CompletableFuture<hg.b> g;
    private final CompletableFuture<Void> h = new CompletableFuture();
    private final CompletableFuture<c<T>> i;
    protected final acp<? extends hr<T>> f;
    private final Map<acq, ani> j = Maps.newLinkedHashMap();

    protected my(jk $$0, acp<? extends hr<T>> $$1, CompletableFuture<hg.b> $$2) {
        this($$0, $$1, $$2, CompletableFuture.completedFuture(c.empty()));
    }

    protected my(jk $$0, acp<? extends hr<T>> $$1, CompletableFuture<hg.b> $$2, CompletableFuture<c<T>> $$3) {
        this.e = $$0.a(jk.b.a, ann.a($$1));
        this.f = $$1;
        this.i = $$3;
        this.g = $$2;
    }

    @Override
    public final String a() {
        return "Tags for " + this.f.a();
    }

    protected abstract void a(hg.b var1);

    @Override
    public CompletableFuture<?> a(jg $$02) {
        final class A<T>
        extends Record {
            final hg.b a;
            final c<T> b;

            A(hg.b $$0, c<T> $$1) {
                this.a = $$0;
                this.b = $$1;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "contents;parent", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "contents;parent", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "contents;parent", "a", "b"}, this, $$0);
            }

            public hg.b a() {
                return this.a;
            }

            public c<T> b() {
                return this.b;
            }
        }
        return ((CompletableFuture)((CompletableFuture)this.b().thenApply($$0 -> {
            this.h.complete(null);
            return $$0;
        })).thenCombineAsync(this.i, ($$0, $$1) -> new A((hg.b)$$0, $$1))).thenCompose($$12 -> {
            hg.c $$2 = $$12.a.b(this.f);
            Predicate<acq> $$32 = $$1 -> $$2.a(acp.a(this.f, $$1)).isPresent();
            Predicate<acq> $$4 = $$1 -> this.j.containsKey($$1) || $$0.b.contains(anl.a(this.f, $$1));
            return CompletableFuture.allOf((CompletableFuture[])this.j.entrySet().stream().map($$3 -> {
                acq $$4 = (acq)$$3.getKey();
                ani $$5 = (ani)$$3.getValue();
                List<anj> $$6 = $$5.b();
                List<anj> $$7 = $$6.stream().filter($$2 -> !$$2.a($$32, $$4)).toList();
                if (!$$7.isEmpty()) {
                    throw new IllegalArgumentException(String.format(Locale.ROOT, "Couldn't define tag %s as it is missing following references: %s", $$4, $$7.stream().map(Objects::toString).collect(Collectors.joining(","))));
                }
                JsonElement $$8 = (JsonElement)ank.a.encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)new ank($$6, false)).getOrThrow(false, arg_0 -> ((Logger)d).error(arg_0));
                Path $$9 = this.e.a($$4);
                return ji.a($$02, $$8, $$9);
            }).toArray(CompletableFuture[]::new));
        });
    }

    protected b<T> b(anl<T> $$0) {
        ani $$1 = this.c($$0);
        return new b($$1);
    }

    protected ani c(anl<T> $$02) {
        return this.j.computeIfAbsent($$02.b(), $$0 -> ani.a());
    }

    public CompletableFuture<c<T>> c() {
        return this.h.thenApply($$02 -> $$0 -> Optional.ofNullable(this.j.get($$0.b())));
    }

    protected CompletableFuture<hg.b> b() {
        return this.g.thenApply($$0 -> {
            this.j.clear();
            this.a((hg.b)$$0);
            return $$0;
        });
    }

    @FunctionalInterface
    public static interface c<T>
    extends Function<anl<T>, Optional<ani>> {
        public static <T> c<T> empty() {
            return $$0 -> Optional.empty();
        }

        default public boolean contains(anl<T> $$0) {
            return ((Optional)this.apply($$0)).isPresent();
        }
    }

    protected static class b<T> {
        private final ani a;

        protected b(ani $$0) {
            this.a = $$0;
        }

        public final b<T> a(acp<T> $$0) {
            this.a.a($$0.a());
            return this;
        }

        @SafeVarargs
        public final b<T> a(acp<T> ... $$0) {
            for (acp<T> $$1 : $$0) {
                this.a.a($$1.a());
            }
            return this;
        }

        public b<T> a(acq $$0) {
            this.a.b($$0);
            return this;
        }

        public b<T> b(anl<T> $$0) {
            this.a.c($$0.b());
            return this;
        }

        public b<T> b(acq $$0) {
            this.a.d($$0);
            return this;
        }
    }
}

