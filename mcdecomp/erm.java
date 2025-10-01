/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.io.BufferedReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class erm
implements akr,
AutoCloseable {
    static final Logger b = LogUtils.getLogger();
    private static final String c = "fonts.json";
    public static final acq a = new acq("minecraft", "missing");
    private static final acj d = acj.a("font");
    private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private final ern f;
    private final List<egm> g = new ArrayList<egm>();
    private final Map<acq, ern> h = new HashMap<acq, ern>();
    private final fuw i;
    private Map<acq, acq> j = ImmutableMap.of();

    public erm(fuw $$02) {
        this.i = $$02;
        this.f = ac.a(new ern($$02, a), (T $$0) -> $$0.a(Lists.newArrayList((Object[])new egm[]{new erk()})));
    }

    @Override
    public CompletableFuture<Void> a(akr.a $$0, akx $$12, ban $$2, ban $$3, Executor $$4, Executor $$5) {
        $$2.a();
        $$2.b();
        return ((CompletableFuture)this.a($$12, $$4).thenCompose($$0::a)).thenAcceptAsync($$1 -> this.a((d)$$1, $$3), $$5);
    }

    private CompletableFuture<d> a(akx $$0, Executor $$12) {
        ArrayList<CompletableFuture<e>> $$2 = new ArrayList<CompletableFuture<e>>();
        for (Map.Entry<acq, List<akv>> $$3 : d.b($$0).entrySet()) {
            acq $$4 = d.b($$3.getKey());
            $$2.add(CompletableFuture.supplyAsync(() -> {
                List<Pair<a, erx>> $$42 = erm.a((List<akv>)((List)$$3.getValue()), $$4);
                e $$5 = new e($$4);
                for (Pair<a, erx> $$6 : $$42) {
                    a $$7 = (a)$$6.getFirst();
                    ((erx)$$6.getSecond()).b().ifLeft($$4 -> {
                        CompletableFuture<Optional<egm>> $$5 = this.a($$7, (erx.a)$$4, $$0, $$12);
                        $$5.a($$7, $$5);
                    }).ifRight($$2 -> $$5.a($$7, (erx.b)$$2));
                }
                return $$5;
            }, $$12));
        }
        return ((CompletableFuture)((Object)ac.b($$2))).thenCompose($$1 -> {
            List $$2 = $$1.stream().flatMap(e::d).collect(Collectors.toCollection(ArrayList::new));
            erk $$32 = new erk();
            $$2.add(CompletableFuture.completedFuture(Optional.of($$32)));
            return ((CompletableFuture)((Object)ac.b($$2))).thenCompose($$3 -> {
                Map<acq, List<egm>> $$4 = this.a((List<e>)$$1);
                CompletableFuture[] $$5 = (CompletableFuture[])$$4.values().stream().map($$2 -> CompletableFuture.runAsync(() -> this.a((List<egm>)$$2, $$32), $$12)).toArray(CompletableFuture[]::new);
                return CompletableFuture.allOf($$5).thenApply($$2 -> {
                    List<egm> $$3 = $$3.stream().flatMap(Optional::stream).toList();
                    return new d($$4, $$3);
                });
            });
        });
    }

    private CompletableFuture<Optional<egm>> a(a $$0, erx.a $$1, akx $$2, Executor $$3) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return Optional.of($$1.load($$2));
            }
            catch (Exception $$3) {
                b.warn("Failed to load builder {}, rejecting", (Object)$$0, (Object)$$3);
                return Optional.empty();
            }
        }, $$3);
    }

    private Map<acq, List<egm>> a(List<e> $$0) {
        HashMap<acq, List<egm>> $$12 = new HashMap<acq, List<egm>>();
        aof<acq, e> $$2 = new aof<acq, e>();
        $$0.forEach($$1 -> $$2.a($$1.a, (e)$$1));
        $$2.a((K $$1, V $$22) -> $$22.a($$12::get).ifPresent($$2 -> $$12.put((acq)$$1, (List<egm>)$$2)));
        return $$12;
    }

    private void a(List<egm> $$0, egm $$12) {
        $$0.add(0, $$12);
        IntOpenHashSet $$2 = new IntOpenHashSet();
        for (egm $$3 : $$0) {
            $$2.addAll((IntCollection)$$3.a());
        }
        $$2.forEach($$1 -> {
            egm $$2;
            if ($$1 == 32) {
                return;
            }
            Iterator iterator = Lists.reverse((List)$$0).iterator();
            while (iterator.hasNext() && ($$2 = (egm)iterator.next()).a($$1) == null) {
            }
        });
    }

    private void a(d $$02, ban $$12) {
        $$12.a();
        $$12.a("closing");
        this.h.values().forEach(ern::close);
        this.h.clear();
        this.g.forEach(egm::close);
        this.g.clear();
        $$12.b("reloading");
        $$02.a().forEach(($$0, $$1) -> {
            ern $$2 = new ern(this.i, (acq)$$0);
            $$2.a(Lists.reverse((List)$$1));
            this.h.put((acq)$$0, $$2);
        });
        this.g.addAll($$02.b);
        $$12.c();
        $$12.b();
        if (!this.h.containsKey(this.a(enn.b))) {
            throw new IllegalStateException("Default font failed to load");
        }
    }

    private static List<Pair<a, erx>> a(List<akv> $$0, acq $$1) {
        ArrayList<Pair<a, erx>> $$2 = new ArrayList<Pair<a, erx>>();
        for (akv $$3 : $$0) {
            try {
                BufferedReader $$4 = $$3.e();
                try {
                    JsonElement $$5 = (JsonElement)e.fromJson((Reader)$$4, JsonElement.class);
                    c $$6 = (c)ac.a(erm$c.a.parse((DynamicOps)JsonOps.INSTANCE, (Object)$$5), JsonParseException::new);
                    List<erx> $$7 = $$6.b;
                    for (int $$8 = $$7.size() - 1; $$8 >= 0; --$$8) {
                        a $$9 = new a($$1, $$3.b(), $$8);
                        $$2.add((Pair<a, erx>)Pair.of((Object)$$9, (Object)$$7.get($$8)));
                    }
                }
                finally {
                    if ($$4 == null) continue;
                    ((Reader)$$4).close();
                }
            }
            catch (Exception $$10) {
                b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, c, $$3.b(), $$10});
            }
        }
        return $$2;
    }

    public void a(Map<acq, acq> $$0) {
        this.j = $$0;
    }

    private acq a(acq $$0) {
        return this.j.getOrDefault($$0, $$0);
    }

    public eov a() {
        return new eov($$0 -> this.h.getOrDefault(this.a((acq)$$0), this.f), false);
    }

    public eov b() {
        return new eov($$0 -> this.h.getOrDefault(this.a((acq)$$0), this.f), true);
    }

    @Override
    public void close() {
        this.h.values().forEach(ern::close);
        this.g.forEach(egm::close);
        this.f.close();
    }

    record a(acq a, String b, int c) {
        @Override
        public String toString() {
            return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "fontId;pack;index", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "fontId;pack;index", "a", "b", "c"}, this, $$0);
        }
    }

    static final class d
    extends Record {
        private final Map<acq, List<egm>> a;
        final List<egm> b;

        d(Map<acq, List<egm>> $$0, List<egm> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "providers;allProviders", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "providers;allProviders", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "providers;allProviders", "a", "b"}, this, $$0);
        }

        public Map<acq, List<egm>> a() {
            return this.a;
        }

        public List<egm> b() {
            return this.b;
        }
    }

    static final class c
    extends Record {
        final List<erx> b;
        public static final Codec<c> a = RecordCodecBuilder.create($$0 -> $$0.group((App)erx.b.listOf().fieldOf("providers").forGetter(c::a)).apply((Applicative)$$0, c::new));

        private c(List<erx> $$0) {
            this.b = $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "providers", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "providers", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "providers", "b"}, this, $$0);
        }

        public List<erx> a() {
            return this.b;
        }
    }

    static final class e
    extends Record
    implements aof.a<acq> {
        final acq a;
        private final List<b> b;
        private final Set<acq> c;

        public e(acq $$0) {
            this($$0, new ArrayList<b>(), new HashSet<acq>());
        }

        private e(acq $$0, List<b> $$1, Set<acq> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public void a(a $$0, erx.b $$1) {
            this.b.add(new b($$0, (Either<CompletableFuture<Optional<egm>>, acq>)Either.right((Object)$$1.a())));
            this.c.add($$1.a());
        }

        public void a(a $$0, CompletableFuture<Optional<egm>> $$1) {
            this.b.add(new b($$0, (Either<CompletableFuture<Optional<egm>>, acq>)Either.left($$1)));
        }

        private Stream<CompletableFuture<Optional<egm>>> d() {
            return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
        }

        public Optional<List<egm>> a(Function<acq, List<egm>> $$0) {
            ArrayList $$1 = new ArrayList();
            for (b $$2 : this.b) {
                Optional<List<egm>> $$3 = $$2.a($$0);
                if ($$3.isPresent()) {
                    $$1.addAll($$3.get());
                    continue;
                }
                return Optional.empty();
            }
            return Optional.of($$1);
        }

        @Override
        public void a(Consumer<acq> $$0) {
            this.c.forEach($$0);
        }

        @Override
        public void b(Consumer<acq> $$0) {
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "fontId;builders;dependencies", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "fontId;builders;dependencies", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "fontId;builders;dependencies", "a", "b", "c"}, this, $$0);
        }

        public acq a() {
            return this.a;
        }

        public List<b> b() {
            return this.b;
        }

        public Set<acq> c() {
            return this.c;
        }
    }

    static final class b
    extends Record {
        private final a a;
        final Either<CompletableFuture<Optional<egm>>, acq> b;

        b(a $$0, Either<CompletableFuture<Optional<egm>>, acq> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public Optional<List<egm>> a(Function<acq, List<egm>> $$02) {
            return (Optional)this.b.map($$0 -> ((Optional)$$0.join()).map(List::of), $$1 -> {
                List $$2 = (List)$$02.apply((acq)$$1);
                if ($$2 == null) {
                    b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, (Object)this.a);
                    return Optional.empty();
                }
                return Optional.of($$2);
            });
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "id;result", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "id;result", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "id;result", "a", "b"}, this, $$0);
        }

        public a a() {
            return this.a;
        }

        public Either<CompletableFuture<Optional<egm>>, acq> b() {
            return this.b;
        }
    }
}

