/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjd
extends alb {
    private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private static final Logger b = LogUtils.getLogger();
    private Map<cjf<?>, Map<acq, cjc<?>>> c = ImmutableMap.of();
    private Map<acq, cjc<?>> d = ImmutableMap.of();
    private boolean e;

    public cjd() {
        super(a, "recipes");
    }

    @Override
    protected void a(Map<acq, JsonElement> $$02, akx $$1, ban $$2) {
        this.e = false;
        HashMap $$3 = Maps.newHashMap();
        ImmutableMap.Builder $$4 = ImmutableMap.builder();
        for (Map.Entry<acq, JsonElement> $$5 : $$02.entrySet()) {
            acq $$6 = $$5.getKey();
            try {
                cjc<?> $$7 = cjd.a($$6, aor.m($$5.getValue(), "top element"));
                $$3.computeIfAbsent($$7.f(), $$0 -> ImmutableMap.builder()).put((Object)$$6, $$7);
                $$4.put((Object)$$6, $$7);
            }
            catch (JsonParseException | IllegalArgumentException $$8) {
                b.error("Parsing error loading recipe {}", (Object)$$6, (Object)$$8);
            }
        }
        this.c = (Map)$$3.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, $$0 -> ((ImmutableMap.Builder)$$0.getValue()).build()));
        this.d = $$4.build();
        b.info("Loaded {} recipes", (Object)$$3.size());
    }

    public boolean a() {
        return this.e;
    }

    public <C extends bdq, T extends cjc<C>> Optional<T> a(cjf<T> $$0, C $$1, cmm $$22) {
        return this.c($$0).values().stream().filter($$2 -> $$2.a($$1, $$22)).findFirst();
    }

    public <C extends bdq, T extends cjc<C>> Optional<Pair<acq, T>> a(cjf<T> $$02, C $$1, cmm $$22, @Nullable acq $$3) {
        cjc $$5;
        Map<acq, T> $$4 = this.c($$02);
        if ($$3 != null && ($$5 = (cjc)$$4.get($$3)) != null && $$5.a($$1, $$22)) {
            return Optional.of(Pair.of((Object)$$3, (Object)$$5));
        }
        return $$4.entrySet().stream().filter($$2 -> ((cjc)$$2.getValue()).a($$1, $$22)).findFirst().map($$0 -> Pair.of((Object)((acq)$$0.getKey()), (Object)((cjc)$$0.getValue())));
    }

    public <C extends bdq, T extends cjc<C>> List<T> a(cjf<T> $$0) {
        return List.copyOf(this.c($$0).values());
    }

    public <C extends bdq, T extends cjc<C>> List<T> b(cjf<T> $$0, C $$12, cmm $$22) {
        return this.c($$0).values().stream().filter($$2 -> $$2.a($$12, $$22)).sorted(Comparator.comparing($$1 -> $$1.a($$22.B_()).q())).collect(Collectors.toList());
    }

    private <C extends bdq, T extends cjc<C>> Map<acq, T> c(cjf<T> $$0) {
        return this.c.getOrDefault($$0, Collections.emptyMap());
    }

    public <C extends bdq, T extends cjc<C>> hn<cfz> c(cjf<T> $$0, C $$1, cmm $$2) {
        Optional<T> $$3 = this.a($$0, $$1, $$2);
        if ($$3.isPresent()) {
            return ((cjc)$$3.get()).a($$1);
        }
        hn<cfz> $$4 = hn.a($$1.b(), cfz.b);
        for (int $$5 = 0; $$5 < $$4.size(); ++$$5) {
            $$4.set($$5, $$1.a($$5));
        }
        return $$4;
    }

    public Optional<? extends cjc<?>> a(acq $$0) {
        return Optional.ofNullable(this.d.get($$0));
    }

    public Collection<cjc<?>> b() {
        return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
    }

    public Stream<acq> d() {
        return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
    }

    public static cjc<?> a(acq $$0, JsonObject $$1) {
        String $$2 = aor.i($$1, "type");
        return jb.u.b(new acq($$2)).orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + $$2 + "'")).a($$0, $$1);
    }

    public void a(Iterable<cjc<?>> $$0) {
        this.e = false;
        HashMap $$1 = Maps.newHashMap();
        ImmutableMap.Builder $$22 = ImmutableMap.builder();
        $$0.forEach($$2 -> {
            Map $$3 = $$1.computeIfAbsent($$2.f(), $$0 -> Maps.newHashMap());
            acq $$4 = $$2.e();
            cjc $$5 = $$3.put($$4, $$2);
            $$22.put((Object)$$4, $$2);
            if ($$5 != null) {
                throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
            }
        });
        this.c = ImmutableMap.copyOf((Map)$$1);
        this.d = $$22.build();
    }

    public static <C extends bdq, T extends cjc<C>> a<C, T> b(final cjf<T> $$0) {
        return new a<C, T>(){
            @Nullable
            private acq b;

            @Override
            public Optional<T> a(C $$02, cmm $$1) {
                cjd $$2 = $$1.q();
                Optional $$3 = $$2.a($$0, $$02, $$1, this.b);
                if ($$3.isPresent()) {
                    Pair $$4 = $$3.get();
                    this.b = (acq)$$4.getFirst();
                    return Optional.of((cjc)$$4.getSecond());
                }
                return Optional.empty();
            }
        };
    }

    public static interface a<C extends bdq, T extends cjc<C>> {
        public Optional<T> a(C var1, cmm var2);
    }
}

