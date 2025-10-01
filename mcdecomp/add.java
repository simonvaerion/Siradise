/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class add
implements akr {
    private static final Logger a = LogUtils.getLogger();
    private static final acj b = new acj("functions", ".mcfunction");
    private volatile Map<acq, dn> c = ImmutableMap.of();
    private final anm<dn> d = new anm<dn>(this::a, "tags/functions");
    private volatile Map<acq, Collection<dn>> e = Map.of();
    private final int f;
    private final CommandDispatcher<ds> g;

    public Optional<dn> a(acq $$0) {
        return Optional.ofNullable(this.c.get($$0));
    }

    public Map<acq, dn> a() {
        return this.c;
    }

    public Collection<dn> b(acq $$0) {
        return this.e.getOrDefault($$0, List.of());
    }

    public Iterable<acq> b() {
        return this.e.keySet();
    }

    public add(int $$0, CommandDispatcher<ds> $$1) {
        this.f = $$0;
        this.g = $$1;
    }

    @Override
    public CompletableFuture<Void> a(akr.a $$02, akx $$1, ban $$2, ban $$3, Executor $$4, Executor $$5) {
        CompletableFuture<Map> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
        CompletionStage $$7 = CompletableFuture.supplyAsync(() -> b.a($$1), $$4).thenCompose($$12 -> {
            HashMap $$22 = Maps.newHashMap();
            ds $$3 = new ds(dr.a, eei.b, eeh.a, null, this.f, "", sv.a, null, null);
            for (Map.Entry $$4 : $$12.entrySet()) {
                acq $$5 = (acq)$$4.getKey();
                acq $$6 = b.b($$5);
                $$22.put($$6, CompletableFuture.supplyAsync(() -> {
                    List<String> $$3 = add.a((akv)$$4.getValue());
                    return dn.a($$6, this.g, $$3, $$3);
                }, $$4));
            }
            CompletableFuture[] $$7 = $$22.values().toArray(new CompletableFuture[0]);
            return CompletableFuture.allOf($$7).handle(($$1, $$2) -> $$22);
        });
        return ((CompletableFuture)((CompletableFuture)$$6.thenCombine($$7, Pair::of)).thenCompose($$02::a)).thenAcceptAsync($$0 -> {
            Map $$12 = (Map)$$0.getSecond();
            ImmutableMap.Builder $$2 = ImmutableMap.builder();
            $$12.forEach(($$1, $$22) -> ((CompletableFuture)$$22.handle(($$2, $$3) -> {
                if ($$3 != null) {
                    a.error("Failed to load function {}", $$1, $$3);
                } else {
                    $$2.put($$1, $$2);
                }
                return null;
            })).join());
            this.c = $$2.build();
            this.e = this.d.a((Map)$$0.getFirst());
        }, $$5);
    }

    private static List<String> a(akv $$0) {
        List<String> list;
        block8: {
            BufferedReader $$1 = $$0.e();
            try {
                list = $$1.lines().toList();
                if ($$1 == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if ($$1 != null) {
                        try {
                            $$1.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException $$2) {
                    throw new CompletionException($$2);
                }
            }
            $$1.close();
        }
        return list;
    }
}

