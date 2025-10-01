/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.OptionalDynamic
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dfg<R>
implements AutoCloseable {
    private static final Logger a = LogUtils.getLogger();
    private static final String b = "Sections";
    private final dfb d;
    private final Long2ObjectMap<Optional<R>> e = new Long2ObjectOpenHashMap();
    private final LongLinkedOpenHashSet f = new LongLinkedOpenHashSet();
    private final Function<Runnable, Codec<R>> g;
    private final Function<Runnable, R> h;
    private final DataFixer i;
    private final aqc j;
    private final hs k;
    protected final cmo c;

    public dfg(Path $$0, Function<Runnable, Codec<R>> $$1, Function<Runnable, R> $$2, DataFixer $$3, aqc $$4, boolean $$5, hs $$6, cmo $$7) {
        this.g = $$1;
        this.h = $$2;
        this.i = $$3;
        this.j = $$4;
        this.k = $$6;
        this.c = $$7;
        this.d = new dfb($$0, $$5, $$0.getFileName().toString());
    }

    protected void a(BooleanSupplier $$0) {
        while (this.a() && $$0.getAsBoolean()) {
            clt $$1 = hx.a(this.f.firstLong()).r();
            this.d($$1);
        }
    }

    public boolean a() {
        return !this.f.isEmpty();
    }

    @Nullable
    protected Optional<R> c(long $$0) {
        return (Optional)this.e.get($$0);
    }

    protected Optional<R> d(long $$0) {
        if (this.e($$0)) {
            return Optional.empty();
        }
        Optional<R> $$1 = this.c($$0);
        if ($$1 != null) {
            return $$1;
        }
        this.b(hx.a($$0).r());
        $$1 = this.c($$0);
        if ($$1 == null) {
            throw ac.b(new IllegalStateException());
        }
        return $$1;
    }

    protected boolean e(long $$0) {
        int $$1 = hx.c(hx.c($$0));
        return this.c.d($$1);
    }

    protected R f(long $$0) {
        if (this.e($$0)) {
            throw ac.b(new IllegalArgumentException("sectionPos out of bounds"));
        }
        Optional<R> $$1 = this.d($$0);
        if ($$1.isPresent()) {
            return $$1.get();
        }
        R $$2 = this.h.apply(() -> this.a($$0));
        this.e.put($$0, Optional.of($$2));
        return $$2;
    }

    private void b(clt $$0) {
        Optional<qr> $$1 = this.c($$0).join();
        aco<rk> $$2 = aco.a(rc.a, this.k);
        this.a($$0, $$2, $$1.orElse(null));
    }

    private CompletableFuture<Optional<qr>> c(clt $$0) {
        return this.d.a($$0).exceptionally($$1 -> {
            if ($$1 instanceof IOException) {
                IOException $$2 = (IOException)$$1;
                a.error("Error reading chunk {} data from disk", (Object)$$0, (Object)$$2);
                return Optional.empty();
            }
            throw new CompletionException((Throwable)$$1);
        });
    }

    private <T> void a(clt $$0, DynamicOps<T> $$12, @Nullable T $$22) {
        if ($$22 == null) {
            for (int $$3 = this.c.al(); $$3 < this.c.am(); ++$$3) {
                this.e.put(dfg.a($$0, $$3), Optional.empty());
            }
        } else {
            int $$6;
            Dynamic $$4 = new Dynamic($$12, $$22);
            int $$5 = dfg.a($$4);
            boolean $$7 = $$5 != ($$6 = aa.b().d().c());
            Dynamic $$8 = this.j.a(this.i, $$4, $$5, $$6);
            OptionalDynamic $$9 = $$8.get(b);
            for (int $$10 = this.c.al(); $$10 < this.c.am(); ++$$10) {
                long $$11 = dfg.a($$0, $$10);
                Optional $$122 = $$9.get(Integer.toString($$10)).result().flatMap($$1 -> this.g.apply(() -> this.a($$11)).parse($$1).resultOrPartial(arg_0 -> ((Logger)a).error(arg_0)));
                this.e.put($$11, $$122);
                $$122.ifPresent($$2 -> {
                    this.b($$11);
                    if ($$7) {
                        this.a($$11);
                    }
                });
            }
        }
    }

    private void d(clt $$0) {
        aco<rk> $$1 = aco.a(rc.a, this.k);
        Dynamic<rk> $$2 = this.a($$0, $$1);
        rk $$3 = (rk)$$2.getValue();
        if ($$3 instanceof qr) {
            this.d.a($$0, (qr)$$3);
        } else {
            a.error("Expected compound tag, got {}", (Object)$$3);
        }
    }

    private <T> Dynamic<T> a(clt $$0, DynamicOps<T> $$1) {
        HashMap $$2 = Maps.newHashMap();
        for (int $$32 = this.c.al(); $$32 < this.c.am(); ++$$32) {
            long $$4 = dfg.a($$0, $$32);
            this.f.remove($$4);
            Optional $$5 = (Optional)this.e.get($$4);
            if ($$5 == null || !$$5.isPresent()) continue;
            DataResult $$6 = this.g.apply(() -> this.a($$4)).encodeStart($$1, $$5.get());
            String $$7 = Integer.toString($$32);
            $$6.resultOrPartial(arg_0 -> ((Logger)a).error(arg_0)).ifPresent($$3 -> $$2.put($$1.createString($$7), $$3));
        }
        return new Dynamic($$1, $$1.createMap((Map)ImmutableMap.of((Object)$$1.createString(b), (Object)$$1.createMap((Map)$$2), (Object)$$1.createString("DataVersion"), (Object)$$1.createInt(aa.b().d().c()))));
    }

    private static long a(clt $$0, int $$1) {
        return hx.b($$0.e, $$1, $$0.f);
    }

    protected void b(long $$0) {
    }

    protected void a(long $$0) {
        Optional $$1 = (Optional)this.e.get($$0);
        if ($$1 == null || !$$1.isPresent()) {
            a.warn("No data for position: {}", (Object)hx.a($$0));
            return;
        }
        this.f.add($$0);
    }

    private static int a(Dynamic<?> $$0) {
        return $$0.get("DataVersion").asInt(1945);
    }

    public void a(clt $$0) {
        if (this.a()) {
            for (int $$1 = this.c.al(); $$1 < this.c.am(); ++$$1) {
                long $$2 = dfg.a($$0, $$1);
                if (!this.f.contains($$2)) continue;
                this.d($$0);
                return;
            }
        }
    }

    @Override
    public void close() throws IOException {
        this.d.close();
    }
}

