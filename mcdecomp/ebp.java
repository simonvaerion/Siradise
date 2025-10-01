/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSyntaxException
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ebp
extends eay {
    final Map<bey, edf> a;

    ebp(eck[] $$0, Map<bey, edf> $$1) {
        super($$0);
        this.a = ImmutableMap.copyOf($$1);
    }

    @Override
    public eba b() {
        return ebb.m;
    }

    @Override
    public Set<ebt<?>> a() {
        return (Set)this.a.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
    }

    @Override
    public cfz a(cfz $$0, dzk $$1) {
        if (!$$0.a(cgc.va) || this.a.isEmpty()) {
            return $$0;
        }
        apf $$2 = $$1.b();
        int $$3 = $$2.a(this.a.size());
        Map.Entry $$4 = (Map.Entry)Iterables.get(this.a.entrySet(), (int)$$3);
        bey $$5 = (bey)$$4.getKey();
        int $$6 = ((edf)$$4.getValue()).a($$1);
        if (!$$5.a()) {
            $$6 *= 20;
        }
        chj.a($$0, $$5, $$6);
        return $$0;
    }

    public static a c() {
        return new a();
    }

    public static class a
    extends eay.a<a> {
        private final Map<bey, edf> a = Maps.newLinkedHashMap();

        protected a a() {
            return this;
        }

        public a a(bey $$0, edf $$1) {
            this.a.put($$0, $$1);
            return this;
        }

        @Override
        public eaz b() {
            return new ebp(this.g(), this.a);
        }

        @Override
        protected /* synthetic */ eay.a c() {
            return this.a();
        }
    }

    public static class b
    extends eay.c<ebp> {
        @Override
        public void a(JsonObject $$0, ebp $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            if (!$$1.a.isEmpty()) {
                JsonArray $$3 = new JsonArray();
                for (bey $$4 : $$1.a.keySet()) {
                    JsonObject $$5 = new JsonObject();
                    acq $$6 = jb.e.b($$4);
                    if ($$6 == null) {
                        throw new IllegalArgumentException("Don't know how to serialize mob effect " + $$4);
                    }
                    $$5.add("type", (JsonElement)new JsonPrimitive($$6.toString()));
                    $$5.add("duration", $$2.serialize((Object)$$1.a.get($$4)));
                    $$3.add((JsonElement)$$5);
                }
                $$0.add("effects", (JsonElement)$$3);
            }
        }

        public ebp a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            LinkedHashMap $$3 = Maps.newLinkedHashMap();
            if ($$0.has("effects")) {
                JsonArray $$4 = aor.v($$0, "effects");
                for (JsonElement $$5 : $$4) {
                    String $$6 = aor.i($$5.getAsJsonObject(), "type");
                    bey $$7 = jb.e.b(new acq($$6)).orElseThrow(() -> new JsonSyntaxException("Unknown mob effect '" + $$6 + "'"));
                    edf $$8 = aor.a($$5.getAsJsonObject(), "duration", $$1, edf.class);
                    $$3.put($$7, $$8);
                }
            }
            return new ebp($$2, $$3);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

