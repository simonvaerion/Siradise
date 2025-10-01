/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class ecf
implements eck {
    final Map<String, dzj> a;
    final dzk.b b;

    ecf(Map<String, dzj> $$0, dzk.b $$1) {
        this.a = ImmutableMap.copyOf($$0);
        this.b = $$1;
    }

    @Override
    public ecl b() {
        return ecm.h;
    }

    @Override
    public Set<ebt<?>> a() {
        return (Set)Stream.concat(Stream.of(this.b.a()), this.a.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
    }

    public boolean a(dzk $$0) {
        bfj $$1 = $$0.c(this.b.a());
        if ($$1 == null) {
            return false;
        }
        efg $$2 = $$1.dI().I();
        for (Map.Entry<String, dzj> $$3 : this.a.entrySet()) {
            if (this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) continue;
            return false;
        }
        return true;
    }

    protected boolean a(dzk $$0, bfj $$1, efg $$2, String $$3, dzj $$4) {
        efd $$5 = $$2.d($$3);
        if ($$5 == null) {
            return false;
        }
        String $$6 = $$1.cv();
        if (!$$2.b($$6, $$5)) {
            return false;
        }
        return $$4.b($$0, $$2.c($$6, $$5).b());
    }

    public static a a(dzk.b $$0) {
        return new a($$0);
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((dzk)object);
    }

    public static class a
    implements eck.a {
        private final Map<String, dzj> a = Maps.newHashMap();
        private final dzk.b b;

        public a(dzk.b $$0) {
            this.b = $$0;
        }

        public a a(String $$0, dzj $$1) {
            this.a.put($$0, $$1);
            return this;
        }

        @Override
        public eck build() {
            return new ecf(this.a, this.b);
        }
    }

    public static class b
    implements dzt<ecf> {
        @Override
        public void a(JsonObject $$0, ecf $$1, JsonSerializationContext $$2) {
            JsonObject $$3 = new JsonObject();
            for (Map.Entry<String, dzj> $$4 : $$1.a.entrySet()) {
                $$3.add($$4.getKey(), $$2.serialize((Object)$$4.getValue()));
            }
            $$0.add("scores", (JsonElement)$$3);
            $$0.add("entity", $$2.serialize((Object)$$1.b));
        }

        public ecf b(JsonObject $$0, JsonDeserializationContext $$1) {
            Set $$2 = aor.u($$0, "scores").entrySet();
            LinkedHashMap $$3 = Maps.newLinkedHashMap();
            for (Map.Entry $$4 : $$2) {
                $$3.put((String)$$4.getKey(), aor.a((JsonElement)$$4.getValue(), "score", $$1, dzj.class));
            }
            return new ecf($$3, aor.a($$0, "entity", $$1, dzk.b.class));
        }

        @Override
        public /* synthetic */ Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonObject, jsonDeserializationContext);
        }
    }
}

