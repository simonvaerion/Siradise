/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  org.slf4j.Logger
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.io.BufferedReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class fwx
implements akr,
AutoCloseable {
    private static final Logger a = LogUtils.getLogger();
    private static final Map<acq, acq> b = Map.of(fkj.c, new acq("banner_patterns"), fkj.b, new acq("beds"), fkj.f, new acq("chests"), fkj.d, new acq("shield_patterns"), fkj.e, new acq("signs"), fkj.a, new acq("shulker_boxes"), fkj.g, new acq("armor_trims"), fkj.h, new acq("decorated_pot"), fuu.e, new acq("blocks"));
    private Map<acq, fwr> c;
    private final fwq d;
    private final fkn e;
    private final eoo f;
    private int g;
    private fwr h;
    private Object2IntMap<dcb> i;

    public fwx(fuw $$0, eoo $$1, int $$2) {
        this.f = $$1;
        this.g = $$2;
        this.e = new fkn(this);
        this.d = new fwq(b, $$0);
    }

    public fwr a(fwy $$0) {
        return this.c.getOrDefault($$0, this.h);
    }

    public fwr a() {
        return this.h;
    }

    public fkn b() {
        return this.e;
    }

    @Override
    public final CompletableFuture<Void> a(akr.a $$02, akx $$12, ban $$22, ban $$3, Executor $$4, Executor $$5) {
        $$22.a();
        CompletableFuture<Map<acq, fkw>> $$6 = fwx.a($$12, $$4);
        CompletableFuture<Map<acq, List<fww.c>>> $$7 = fwx.b($$12, $$4);
        CompletionStage $$8 = $$6.thenCombineAsync($$7, ($$1, $$2) -> new fww(this.f, $$22, (Map<acq, fkw>)$$1, (Map<acq, List<fww.c>>)$$2), $$4);
        Map<acq, CompletableFuture<fwq.b>> $$9 = this.d.a($$12, this.g, $$4);
        return ((CompletableFuture)((CompletableFuture)((CompletableFuture)CompletableFuture.allOf((CompletableFuture[])Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new)).thenApplyAsync(arg_0 -> this.a($$22, $$9, (CompletableFuture)$$8, arg_0), $$4)).thenCompose($$0 -> $$0.e.thenApply($$1 -> $$0))).thenCompose($$02::a)).thenAcceptAsync($$1 -> this.a((a)$$1, $$3), $$5);
    }

    private static CompletableFuture<Map<acq, fkw>> a(akx $$0, Executor $$12) {
        return CompletableFuture.supplyAsync(() -> fww.p.a($$0), $$12).thenCompose($$1 -> {
            ArrayList<CompletableFuture<Pair>> $$2 = new ArrayList<CompletableFuture<Pair>>($$1.size());
            for (Map.Entry $$3 : $$1.entrySet()) {
                $$2.add(CompletableFuture.supplyAsync(() -> {
                    Pair pair;
                    block8: {
                        Object $$1 = ((akv)$$3.getValue()).e();
                        try {
                            pair = Pair.of((Object)((acq)$$3.getKey()), (Object)fkw.a($$1));
                            if ($$1 == null) break block8;
                        }
                        catch (Throwable throwable) {
                            try {
                                if ($$1 != null) {
                                    try {
                                        ((Reader)$$1).close();
                                    }
                                    catch (Throwable throwable2) {
                                        throwable.addSuppressed(throwable2);
                                    }
                                }
                                throw throwable;
                            }
                            catch (Exception $$2) {
                                a.error("Failed to load model {}", $$3.getKey(), (Object)$$2);
                                return null;
                            }
                        }
                        ((Reader)$$1).close();
                    }
                    return pair;
                }, $$12));
            }
            return ((CompletableFuture)((Object)ac.b($$2))).thenApply($$0 -> $$0.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
        });
    }

    private static CompletableFuture<Map<acq, List<fww.c>>> b(akx $$0, Executor $$12) {
        return CompletableFuture.supplyAsync(() -> fww.o.b($$0), $$12).thenCompose($$1 -> {
            ArrayList<CompletableFuture<Pair>> $$2 = new ArrayList<CompletableFuture<Pair>>($$1.size());
            for (Map.Entry $$3 : $$1.entrySet()) {
                $$2.add(CompletableFuture.supplyAsync(() -> {
                    Object $$1 = (List)$$3.getValue();
                    ArrayList<fww.c> $$2 = new ArrayList<fww.c>($$1.size());
                    for (akv $$3 : $$1) {
                        try {
                            BufferedReader $$4 = $$3.e();
                            try {
                                JsonObject $$5 = aor.a($$4);
                                $$2.add(new fww.c($$3.b(), (JsonElement)$$5));
                            }
                            finally {
                                if ($$4 == null) continue;
                                ((Reader)$$4).close();
                            }
                        }
                        catch (Exception $$6) {
                            a.error("Failed to load blockstate {} from pack {}", new Object[]{$$3.getKey(), $$3.b(), $$6});
                        }
                    }
                    return Pair.of((Object)((acq)$$3.getKey()), $$2);
                }, $$12));
            }
            return ((CompletableFuture)((Object)ac.b($$2))).thenApply($$0 -> $$0.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
        });
    }

    private a a(ban $$0, Map<acq, fwq.b> $$12, fww $$2) {
        $$0.a("load");
        $$0.b("baking");
        HashMultimap $$32 = HashMultimap.create();
        $$2.a((arg_0, arg_1) -> fwx.a($$12, (Multimap)$$32, arg_0, arg_1));
        $$32.asMap().forEach(($$02, $$1) -> a.warn("Missing textures in model {}:\n{}", $$02, (Object)$$1.stream().sorted(fwu.a).map($$0 -> "    " + $$0.a() + ":" + $$0.b()).collect(Collectors.joining("\n"))));
        $$0.b("dispatch");
        Map<acq, fwr> $$4 = $$2.a();
        fwr $$5 = $$4.get(fww.n);
        IdentityHashMap<dcb, fwr> $$6 = new IdentityHashMap<dcb, fwr>();
        for (cpn $$7 : jb.f) {
            $$7.l().a().forEach($$3 -> {
                acq $$4 = $$3.b().q().g().a();
                fwr $$5 = $$4.getOrDefault(fkn.a($$4, $$3), $$5);
                $$6.put((dcb)$$3, $$5);
            });
        }
        CompletableFuture<Void> $$8 = CompletableFuture.allOf((CompletableFuture[])$$12.values().stream().map(fwq.b::b).toArray(CompletableFuture[]::new));
        $$0.c();
        $$0.b();
        return new a($$2, $$5, $$6, $$12, $$8);
    }

    private void a(a $$0, ban $$1) {
        $$1.a();
        $$1.a("upload");
        $$0.d.values().forEach(fwq.b::c);
        fww $$2 = $$0.a;
        this.c = $$2.a();
        this.i = $$2.b();
        this.h = $$0.b;
        $$1.b("cache");
        this.e.a($$0.c);
        $$1.c();
        $$1.b();
    }

    public boolean a(dcb $$0, dcb $$1) {
        int $$3;
        if ($$0 == $$1) {
            return false;
        }
        int $$2 = this.i.getInt((Object)$$0);
        if ($$2 != -1 && $$2 == ($$3 = this.i.getInt((Object)$$1))) {
            dxe $$5;
            dxe $$4 = $$0.u();
            return $$4 != ($$5 = $$1.u());
        }
        return true;
    }

    public fuu a(acq $$0) {
        return this.d.a($$0);
    }

    @Override
    public void close() {
        this.d.close();
    }

    public void a(int $$0) {
        this.g = $$0;
    }

    private static /* synthetic */ fuv a(Map $$0, Multimap $$1, acq $$2, fwu $$3) {
        fwq.b $$4 = (fwq.b)$$0.get($$3.a());
        fuv $$5 = $$4.a($$3.b());
        if ($$5 != null) {
            return $$5;
        }
        $$1.put((Object)$$2, (Object)$$3);
        return $$4.a();
    }

    private /* synthetic */ a a(ban $$02, Map $$1, CompletableFuture $$2, Void $$3) {
        return this.a($$02, $$1.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, $$0 -> (fwq.b)((CompletableFuture)$$0.getValue()).join())), (fww)$$2.join());
    }

    static final class a
    extends Record {
        final fww a;
        final fwr b;
        final Map<dcb, fwr> c;
        final Map<acq, fwq.b> d;
        final CompletableFuture<Void> e;

        a(fww $$0, fwr $$1, Map<dcb, fwr> $$2, Map<acq, fwq.b> $$3, CompletableFuture<Void> $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "modelBakery;missingModel;modelCache;atlasPreparations;readyForUpload", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "modelBakery;missingModel;modelCache;atlasPreparations;readyForUpload", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "modelBakery;missingModel;modelCache;atlasPreparations;readyForUpload", "a", "b", "c", "d", "e"}, this, $$0);
        }

        public fww a() {
            return this.a;
        }

        public fwr b() {
            return this.b;
        }

        public Map<dcb, fwr> c() {
            return this.c;
        }

        public Map<acq, fwq.b> d() {
            return this.d;
        }

        public CompletableFuture<Void> e() {
            return this.e;
        }
    }
}

