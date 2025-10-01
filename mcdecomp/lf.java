/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Streams
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Streams;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class lf {
    private final Optional<acq> a;
    private final Set<li> b;
    private final Optional<String> c;

    public lf(Optional<acq> $$0, Optional<String> $$1, li ... $$2) {
        this.a = $$0;
        this.c = $$1;
        this.b = ImmutableSet.copyOf((Object[])$$2);
    }

    public acq a(cpn $$0, lh $$1, BiConsumer<acq, Supplier<JsonElement>> $$2) {
        return this.a(le.a($$0, this.c.orElse("")), $$1, $$2);
    }

    public acq a(cpn $$0, String $$1, lh $$2, BiConsumer<acq, Supplier<JsonElement>> $$3) {
        return this.a(le.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
    }

    public acq b(cpn $$0, String $$1, lh $$2, BiConsumer<acq, Supplier<JsonElement>> $$3) {
        return this.a(le.a($$0, $$1), $$2, $$3);
    }

    public acq a(acq $$0, lh $$1, BiConsumer<acq, Supplier<JsonElement>> $$2) {
        return this.a($$0, $$1, $$2, this::a);
    }

    public acq a(acq $$0, lh $$1, BiConsumer<acq, Supplier<JsonElement>> $$2, a $$3) {
        Map<li, acq> $$4 = this.a($$1);
        $$2.accept($$0, () -> $$3.create($$0, $$4));
        return $$0;
    }

    public JsonObject a(acq $$0, Map<li, acq> $$12) {
        JsonObject $$22 = new JsonObject();
        this.a.ifPresent($$1 -> $$22.addProperty("parent", $$1.toString()));
        if (!$$12.isEmpty()) {
            JsonObject $$3 = new JsonObject();
            $$12.forEach(($$1, $$2) -> $$3.addProperty($$1.a(), $$2.toString()));
            $$22.add("textures", (JsonElement)$$3);
        }
        return $$22;
    }

    private Map<li, acq> a(lh $$0) {
        return (Map)Streams.concat((Stream[])new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
    }

    public static interface a {
        public JsonObject create(acq var1, Map<li, acq> var2);
    }
}

