/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.Multimap
 *  com.google.gson.JsonElement
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dzn
implements akr,
dzo {
    private static final Logger b = LogUtils.getLogger();
    public static final dzm<dzs> a = new dzm<dzs>(dzp.c, dzg.a);
    private Map<dzm<?>, ?> c = Map.of();
    private Multimap<dzp<?>, acq> d = ImmutableMultimap.of();

    @Override
    public final CompletableFuture<Void> a(akr.a $$0, akx $$12, ban $$2, ban $$32, Executor $$4, Executor $$5) {
        HashMap $$6 = new HashMap();
        CompletableFuture[] $$7 = (CompletableFuture[])dzp.c().map($$3 -> dzn.a($$3, $$12, $$4, $$6)).toArray(CompletableFuture[]::new);
        return ((CompletableFuture)CompletableFuture.allOf($$7).thenCompose($$0::a)).thenAcceptAsync($$1 -> this.a($$6), $$5);
    }

    private static <T> CompletableFuture<?> a(dzp<T> $$0, akx $$1, Executor $$2, Map<dzp<?>, Map<acq, ?>> $$3) {
        HashMap $$4 = new HashMap();
        $$3.put($$0, $$4);
        return CompletableFuture.runAsync(() -> {
            HashMap<acq, JsonElement> $$32 = new HashMap<acq, JsonElement>();
            alb.a($$1, $$0.b(), $$0.a(), $$32);
            $$32.forEach(($$22, $$3) -> $$0.a((acq)$$22, (JsonElement)$$3).ifPresent($$2 -> $$4.put($$22, $$2)));
        }, $$2);
    }

    private void a(Map<dzp<?>, Map<acq, ?>> $$02) {
        Object $$12 = $$02.get(dzp.c).remove(dzg.a);
        if ($$12 != null) {
            b.warn("Datapack tried to redefine {} loot table, ignoring", (Object)dzg.a);
        }
        ImmutableMap.Builder $$22 = ImmutableMap.builder();
        ImmutableMultimap.Builder $$3 = ImmutableMultimap.builder();
        $$02.forEach(($$2, $$32) -> $$32.forEach(($$3, $$4) -> {
            $$22.put(new dzm($$2, (acq)$$3), $$4);
            $$3.put($$2, $$3);
        }));
        $$22.put(a, (Object)dzs.a);
        ImmutableMap $$4 = $$22.build();
        dzv $$5 = new dzv(ebv.m, new dzo(){
            final /* synthetic */ Map a;
            {
                this.a = map;
            }

            @Override
            @Nullable
            public <T> T getElement(dzm<T> $$0) {
                return (T)this.a.get($$0);
            }
        });
        $$4.forEach(($$1, $$2) -> dzn.a($$5, $$1, $$2));
        $$5.a().forEach(($$0, $$1) -> b.warn("Found loot table element validation problem in {}: {}", $$0, $$1));
        this.c = $$4;
        this.d = $$3.build();
    }

    private static <T> void a(dzv $$0, dzm<T> $$1, Object $$2) {
        $$1.a().a($$0, $$1, $$2);
    }

    @Override
    @Nullable
    public <T> T getElement(dzm<T> $$0) {
        return (T)this.c.get($$0);
    }

    public Collection<acq> a(dzp<?> $$0) {
        return this.d.get($$0);
    }

    public static eck a(eck[] $$0) {
        return new a($$0);
    }

    public static eaz a(eaz[] $$0) {
        return new b($$0);
    }

    static class a
    implements eck {
        private final eck[] a;
        private final Predicate<dzk> b;

        a(eck[] $$0) {
            this.a = $$0;
            this.b = ecm.a($$0);
        }

        public final boolean a(dzk $$0) {
            return this.b.test($$0);
        }

        @Override
        public void a(dzv $$0) {
            eck.super.a($$0);
            for (int $$1 = 0; $$1 < this.a.length; ++$$1) {
                this.a[$$1].a($$0.b(".term[" + $$1 + "]"));
            }
        }

        @Override
        public ecl b() {
            throw new UnsupportedOperationException();
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((dzk)object);
        }
    }

    static class b
    implements eaz {
        protected final eaz[] a;
        private final BiFunction<cfz, dzk, cfz> b;

        public b(eaz[] $$0) {
            this.a = $$0;
            this.b = ebb.a($$0);
        }

        public cfz a(cfz $$0, dzk $$1) {
            return this.b.apply($$0, $$1);
        }

        @Override
        public void a(dzv $$0) {
            eaz.super.a($$0);
            for (int $$1 = 0; $$1 < this.a.length; ++$$1) {
                this.a[$$1].a($$0.b(".function[" + $$1 + "]"));
            }
        }

        @Override
        public eba b() {
            throw new UnsupportedOperationException();
        }

        @Override
        public /* synthetic */ Object apply(Object object, Object object2) {
            return this.a((cfz)object, (dzk)object2);
        }
    }
}

