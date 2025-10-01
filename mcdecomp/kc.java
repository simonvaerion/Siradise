/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class kc
implements ji {
    private static final Logger d = LogUtils.getLogger();
    private final jk.a e;
    private final Set<acq> f;
    private final List<a> g;

    public kc(jk $$0, Set<acq> $$1, List<a> $$2) {
        this.e = $$0.a(jk.b.a, "loot_tables");
        this.g = $$2;
        this.f = $$1;
    }

    @Override
    public CompletableFuture<?> a(jg $$02) {
        final HashMap $$12 = Maps.newHashMap();
        Object2ObjectOpenHashMap $$22 = new Object2ObjectOpenHashMap();
        this.g.forEach(arg_0 -> kc.a((Map)$$22, $$12, arg_0));
        dzv $$3 = new dzv(ebv.m, new dzo(){

            @Override
            @Nullable
            public <T> T getElement(dzm<T> $$0) {
                if ($$0.a() == dzp.c) {
                    return (T)$$12.get($$0.b());
                }
                return null;
            }
        });
        Sets.SetView $$4 = Sets.difference(this.f, $$12.keySet());
        for (acq $$5 : $$4) {
            $$3.a("Missing built-in table: " + $$5);
        }
        $$12.forEach(($$1, $$2) -> $$2.a($$3.a($$2.a()).a("{" + $$1 + "}", new dzm<dzs>(dzp.c, (acq)$$1))));
        Multimap<String, String> $$6 = $$3.a();
        if (!$$6.isEmpty()) {
            $$6.forEach(($$0, $$1) -> d.warn("Found validation problem in {}: {}", $$0, $$1));
            throw new IllegalStateException("Failed to validate loot tables, see logs");
        }
        return CompletableFuture.allOf((CompletableFuture[])$$12.entrySet().stream().map($$1 -> {
            acq $$2 = (acq)$$1.getKey();
            dzs $$3 = (dzs)$$1.getValue();
            Path $$4 = this.e.a($$2);
            return ji.a($$02, dzp.c.a().toJsonTree((Object)$$3), $$4);
        }).toArray(CompletableFuture[]::new));
    }

    @Override
    public final String a() {
        return "Loot Tables";
    }

    private static /* synthetic */ void a(Map $$0, Map $$1, a $$2) {
        $$2.a().get().generate(($$3, $$4) -> {
            acq $$5 = $$0.put(bec.a($$3), $$3);
            if ($$5 != null) {
                ac.a("Loot table random sequence seed collision on " + $$5 + " and " + $$3);
            }
            $$4.a((acq)$$3);
            if ($$1.put($$3, $$4.a($$2.b).b()) != null) {
                throw new IllegalStateException("Duplicate loot table " + $$3);
            }
        });
    }

    public static final class a
    extends Record {
        private final Supplier<kd> a;
        final ebu b;

        public a(Supplier<kd> $$0, ebu $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "provider;paramSet", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "provider;paramSet", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "provider;paramSet", "a", "b"}, this, $$0);
        }

        public Supplier<kd> a() {
            return this.a;
        }

        public ebu b() {
            return this.b;
        }
    }
}

