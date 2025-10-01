/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cp
implements bp {
    public static final int b = 100;
    private final cj.d c;
    @Nullable
    private final cmj d;
    private final Map<amo<?>, cj.d> e;
    private final Object2BooleanMap<acq> f;
    private final Map<acq, c> g;
    private final bo h;

    private static c b(JsonElement $$0) {
        if ($$0.isJsonPrimitive()) {
            boolean $$1 = $$0.getAsBoolean();
            return new b($$1);
        }
        Object2BooleanOpenHashMap $$2 = new Object2BooleanOpenHashMap();
        JsonObject $$3 = aor.m($$0, "criterion data");
        $$3.entrySet().forEach(arg_0 -> cp.a((Object2BooleanMap)$$2, arg_0));
        return new a((Object2BooleanMap<String>)$$2);
    }

    cp(cj.d $$0, @Nullable cmj $$1, Map<amo<?>, cj.d> $$2, Object2BooleanMap<acq> $$3, Map<acq, c> $$4, bo $$5) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
    }

    @Override
    public boolean a(bfj $$02, aif $$1, @Nullable eei $$2) {
        if (!($$02 instanceof aig)) {
            return false;
        }
        aig $$3 = (aig)$$02;
        if (!this.c.d($$3.ce)) {
            return false;
        }
        if (this.d != null && this.d != $$3.e.b()) {
            return false;
        }
        amn $$4 = $$3.D();
        for (Map.Entry<amo<?>, cj.d> entry : this.e.entrySet()) {
            int $$6 = $$4.a(entry.getKey());
            if (entry.getValue().d($$6)) continue;
            return false;
        }
        amm $$7 = $$3.E();
        for (Object2BooleanMap.Entry $$8 : this.f.object2BooleanEntrySet()) {
            if ($$7.b((acq)$$8.getKey()) == $$8.getBooleanValue()) continue;
            return false;
        }
        if (!this.g.isEmpty()) {
            acy acy2 = $$3.M();
            adc $$10 = $$3.cI().az();
            for (Map.Entry<acq, c> $$11 : this.g.entrySet()) {
                ae $$12 = $$10.a($$11.getKey());
                if ($$12 != null && $$11.getValue().test(acy2.b($$12))) continue;
                return false;
            }
        }
        if (this.h != bo.a) {
            eei eei2 = $$3.bm();
            eei $$14 = $$3.f(1.0f);
            eei $$15 = eei2.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
            eef $$16 = bzh.a($$3.dI(), $$3, eei2, $$15, new eed(eei2, $$15).g(1.0), $$0 -> !$$0.G_(), 0.0f);
            if ($$16 == null || $$16.c() != eeg.a.c) {
                return false;
            }
            bfj $$17 = $$16.a();
            if (!this.h.a($$3, $$17) || !$$3.B($$17)) {
                return false;
            }
        }
        return true;
    }

    public static cp a(JsonObject $$0) {
        cj.d $$1 = cj.d.a($$0.get("level"));
        String $$2 = aor.a($$0, "gamemode", "");
        cmj $$3 = cmj.a($$2, null);
        HashMap $$4 = Maps.newHashMap();
        JsonArray $$5 = aor.a($$0, "stats", null);
        if ($$5 != null) {
            for (JsonElement $$6 : $$5) {
                JsonObject $$7 = aor.m($$6, "stats entry");
                acq $$8 = new acq(aor.i($$7, "type"));
                amq<?> $$9 = jb.y.a($$8);
                if ($$9 == null) {
                    throw new JsonParseException("Invalid stat type: " + $$8);
                }
                acq $$10 = new acq(aor.i($$7, "stat"));
                amo<?> $$11 = cp.a($$9, $$10);
                cj.d $$12 = cj.d.a($$7.get("value"));
                $$4.put($$11, $$12);
            }
        }
        Object2BooleanOpenHashMap $$13 = new Object2BooleanOpenHashMap();
        JsonObject $$14 = aor.a($$0, "recipes", new JsonObject());
        for (Map.Entry $$15 : $$14.entrySet()) {
            acq $$16 = new acq((String)$$15.getKey());
            boolean $$17 = aor.c((JsonElement)$$15.getValue(), "recipe present");
            $$13.put((Object)$$16, $$17);
        }
        HashMap $$18 = Maps.newHashMap();
        JsonObject $$19 = aor.a($$0, "advancements", new JsonObject());
        for (Map.Entry $$20 : $$19.entrySet()) {
            acq $$21 = new acq((String)$$20.getKey());
            c $$22 = cp.b((JsonElement)$$20.getValue());
            $$18.put($$21, $$22);
        }
        bo $$23 = bo.a($$0.get("looking_at"));
        return new cp($$1, $$3, $$4, (Object2BooleanMap<acq>)$$13, $$18, $$23);
    }

    private static <T> amo<T> a(amq<T> $$0, acq $$1) {
        hr<T> $$2 = $$0.a();
        T $$3 = $$2.a($$1);
        if ($$3 == null) {
            throw new JsonParseException("Unknown object " + $$1 + " for stat type " + jb.y.b($$0));
        }
        return $$0.b($$3);
    }

    private static <T> acq a(amo<T> $$0) {
        return $$0.a().a().b($$0.b());
    }

    @Override
    public JsonObject a() {
        JsonObject $$0 = new JsonObject();
        $$0.add("level", this.c.d());
        if (this.d != null) {
            $$0.addProperty("gamemode", this.d.b());
        }
        if (!this.e.isEmpty()) {
            JsonArray $$12 = new JsonArray();
            this.e.forEach(($$1, $$2) -> {
                JsonObject $$3 = new JsonObject();
                $$3.addProperty("type", jb.y.b($$1.a()).toString());
                $$3.addProperty("stat", cp.a($$1).toString());
                $$3.add("value", $$2.d());
                $$12.add((JsonElement)$$3);
            });
            $$0.add("stats", (JsonElement)$$12);
        }
        if (!this.f.isEmpty()) {
            JsonObject $$22 = new JsonObject();
            this.f.forEach(($$1, $$2) -> $$22.addProperty($$1.toString(), $$2));
            $$0.add("recipes", (JsonElement)$$22);
        }
        if (!this.g.isEmpty()) {
            JsonObject $$3 = new JsonObject();
            this.g.forEach(($$1, $$2) -> $$3.add($$1.toString(), $$2.a()));
            $$0.add("advancements", (JsonElement)$$3);
        }
        $$0.add("looking_at", this.h.a());
        return $$0;
    }

    @Override
    public bp.a c() {
        return bp.b.d;
    }

    private static /* synthetic */ void a(Object2BooleanMap $$0, Map.Entry $$1) {
        boolean $$2 = aor.c((JsonElement)$$1.getValue(), "criterion test");
        $$0.put((Object)((String)$$1.getKey()), $$2);
    }

    static class b
    implements c {
        private final boolean a;

        public b(boolean $$0) {
            this.a = $$0;
        }

        @Override
        public JsonElement a() {
            return new JsonPrimitive(Boolean.valueOf(this.a));
        }

        public boolean a(ag $$0) {
            return $$0.a() == this.a;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((ag)object);
        }
    }

    static class a
    implements c {
        private final Object2BooleanMap<String> a;

        public a(Object2BooleanMap<String> $$0) {
            this.a = $$0;
        }

        @Override
        public JsonElement a() {
            JsonObject $$0 = new JsonObject();
            this.a.forEach((arg_0, arg_1) -> ((JsonObject)$$0).addProperty(arg_0, arg_1));
            return $$0;
        }

        public boolean a(ag $$0) {
            for (Object2BooleanMap.Entry $$1 : this.a.object2BooleanEntrySet()) {
                ak $$2 = $$0.c((String)$$1.getKey());
                if ($$2 != null && $$2.a() == $$1.getBooleanValue()) continue;
                return false;
            }
            return true;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((ag)object);
        }
    }

    static interface c
    extends Predicate<ag> {
        public JsonElement a();
    }

    public static class d {
        private cj.d a = cj.d.e;
        @Nullable
        private cmj b;
        private final Map<amo<?>, cj.d> c = Maps.newHashMap();
        private final Object2BooleanMap<acq> d = new Object2BooleanOpenHashMap();
        private final Map<acq, c> e = Maps.newHashMap();
        private bo f = bo.a;

        public static d a() {
            return new d();
        }

        public d a(cj.d $$0) {
            this.a = $$0;
            return this;
        }

        public d a(amo<?> $$0, cj.d $$1) {
            this.c.put($$0, $$1);
            return this;
        }

        public d a(acq $$0, boolean $$1) {
            this.d.put((Object)$$0, $$1);
            return this;
        }

        public d a(cmj $$0) {
            this.b = $$0;
            return this;
        }

        public d a(bo $$0) {
            this.f = $$0;
            return this;
        }

        public d b(acq $$0, boolean $$1) {
            this.e.put($$0, new b($$1));
            return this;
        }

        public d a(acq $$0, Map<String, Boolean> $$1) {
            this.e.put($$0, new a((Object2BooleanMap<String>)new Object2BooleanOpenHashMap($$1)));
            return this;
        }

        public cp b() {
            return new cp(this.a, this.b, this.c, this.d, this.e, this.f);
        }
    }
}

