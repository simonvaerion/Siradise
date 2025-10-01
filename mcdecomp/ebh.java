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
 *  com.google.gson.JsonSyntaxException
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ebh
extends eay {
    final Map<ckg, edf> a;
    final boolean b;

    ebh(eck[] $$0, Map<ckg, edf> $$1, boolean $$2) {
        super($$0);
        this.a = ImmutableMap.copyOf($$1);
        this.b = $$2;
    }

    @Override
    public eba b() {
        return ebb.e;
    }

    @Override
    public Set<ebt<?>> a() {
        return (Set)this.a.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
    }

    @Override
    public cfz a(cfz $$0, dzk $$12) {
        Object2IntOpenHashMap $$22 = new Object2IntOpenHashMap();
        this.a.forEach((arg_0, arg_1) -> ebh.a((Object2IntMap)$$22, $$12, arg_0, arg_1));
        if ($$0.d() == cgc.qb) {
            cfz $$3 = new cfz(cgc.tC);
            $$22.forEach(($$1, $$2) -> cev.a($$3, new ckj((ckg)$$1, (int)$$2)));
            return $$3;
        }
        Map<ckg, Integer> $$4 = cki.a($$0);
        if (this.b) {
            $$22.forEach(($$1, $$2) -> ebh.a($$4, $$1, Math.max($$4.getOrDefault($$1, 0) + $$2, 0)));
        } else {
            $$22.forEach(($$1, $$2) -> ebh.a($$4, $$1, Math.max($$2, 0)));
        }
        cki.a($$4, $$0);
        return $$0;
    }

    private static void a(Map<ckg, Integer> $$0, ckg $$1, int $$2) {
        if ($$2 == 0) {
            $$0.remove($$1);
        } else {
            $$0.put($$1, $$2);
        }
    }

    private static /* synthetic */ void a(Object2IntMap $$0, dzk $$1, ckg $$2, edf $$3) {
        $$0.put((Object)$$2, $$3.a($$1));
    }

    public static class b
    extends eay.c<ebh> {
        @Override
        public void a(JsonObject $$0, ebh $$1, JsonSerializationContext $$22) {
            super.a($$0, $$1, $$22);
            JsonObject $$32 = new JsonObject();
            $$1.a.forEach(($$2, $$3) -> {
                acq $$4 = jb.g.b((ckg)$$2);
                if ($$4 == null) {
                    throw new IllegalArgumentException("Don't know how to serialize enchantment " + $$2);
                }
                $$32.add($$4.toString(), $$22.serialize($$3));
            });
            $$0.add("enchantments", (JsonElement)$$32);
            $$0.addProperty("add", Boolean.valueOf($$1.b));
        }

        public ebh a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            HashMap $$3 = Maps.newHashMap();
            if ($$0.has("enchantments")) {
                JsonObject $$4 = aor.u($$0, "enchantments");
                for (Map.Entry $$5 : $$4.entrySet()) {
                    String $$6 = (String)$$5.getKey();
                    JsonElement $$7 = (JsonElement)$$5.getValue();
                    ckg $$8 = jb.g.b(new acq($$6)).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + $$6 + "'"));
                    edf $$9 = (edf)$$1.deserialize($$7, edf.class);
                    $$3.put($$8, $$9);
                }
            }
            boolean $$10 = aor.a($$0, "add", false);
            return new ebh($$2, $$3, $$10);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }

    public static class a
    extends eay.a<a> {
        private final Map<ckg, edf> a = Maps.newHashMap();
        private final boolean b;

        public a() {
            this(false);
        }

        public a(boolean $$0) {
            this.b = $$0;
        }

        protected a a() {
            return this;
        }

        public a a(ckg $$0, edf $$1) {
            this.a.put($$0, $$1);
            return this;
        }

        @Override
        public eaz b() {
            return new ebh(this.g(), this.a, this.b);
        }

        @Override
        protected /* synthetic */ eay.a c() {
            return this.a();
        }
    }
}

