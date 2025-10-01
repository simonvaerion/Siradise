/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import java.util.Map;
import java.util.Set;

public class eam
extends eay {
    static final Map<acq, c> a = Maps.newHashMap();
    final ckg b;
    final b c;

    eam(eck[] $$0, ckg $$1, b $$2) {
        super($$0);
        this.b = $$1;
        this.c = $$2;
    }

    @Override
    public eba b() {
        return ebb.q;
    }

    @Override
    public Set<ebt<?>> a() {
        return ImmutableSet.of(ebw.i);
    }

    @Override
    public cfz a(cfz $$0, dzk $$1) {
        cfz $$2 = $$1.c(ebw.i);
        if ($$2 != null) {
            int $$3 = cki.a(this.b, $$2);
            int $$4 = this.c.a($$1.b(), $$0.L(), $$3);
            $$0.f($$4);
        }
        return $$0;
    }

    public static eay.a<?> a(ckg $$0, float $$1, int $$2) {
        return eam.a((eck[] $$3) -> new eam((eck[])$$3, $$0, new a($$2, $$1)));
    }

    public static eay.a<?> a(ckg $$0) {
        return eam.a((eck[] $$1) -> new eam((eck[])$$1, $$0, new d()));
    }

    public static eay.a<?> b(ckg $$0) {
        return eam.a((eck[] $$1) -> new eam((eck[])$$1, $$0, new f(1)));
    }

    public static eay.a<?> a(ckg $$0, int $$1) {
        return eam.a((eck[] $$2) -> new eam((eck[])$$2, $$0, new f($$1)));
    }

    static {
        a.put(eam$a.a, a::a);
        a.put(d.a, d::a);
        a.put(f.a, f::a);
    }

    static interface b {
        public int a(apf var1, int var2, int var3);

        public void a(JsonObject var1, JsonSerializationContext var2);

        public acq a();
    }

    static final class f
    implements b {
        public static final acq a = new acq("uniform_bonus_count");
        private final int b;

        public f(int $$0) {
            this.b = $$0;
        }

        @Override
        public int a(apf $$0, int $$1, int $$2) {
            return $$1 + $$0.a(this.b * $$2 + 1);
        }

        @Override
        public void a(JsonObject $$0, JsonSerializationContext $$1) {
            $$0.addProperty("bonusMultiplier", (Number)this.b);
        }

        public static b a(JsonObject $$0, JsonDeserializationContext $$1) {
            int $$2 = aor.o($$0, "bonusMultiplier");
            return new f($$2);
        }

        @Override
        public acq a() {
            return a;
        }
    }

    static final class d
    implements b {
        public static final acq a = new acq("ore_drops");

        d() {
        }

        @Override
        public int a(apf $$0, int $$1, int $$2) {
            if ($$2 > 0) {
                int $$3 = $$0.a($$2 + 2) - 1;
                if ($$3 < 0) {
                    $$3 = 0;
                }
                return $$1 * ($$3 + 1);
            }
            return $$1;
        }

        @Override
        public void a(JsonObject $$0, JsonSerializationContext $$1) {
        }

        public static b a(JsonObject $$0, JsonDeserializationContext $$1) {
            return new d();
        }

        @Override
        public acq a() {
            return a;
        }
    }

    static final class a
    implements b {
        public static final acq a = new acq("binomial_with_bonus_count");
        private final int b;
        private final float c;

        public a(int $$0, float $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public int a(apf $$0, int $$1, int $$2) {
            for (int $$3 = 0; $$3 < $$2 + this.b; ++$$3) {
                if (!($$0.i() < this.c)) continue;
                ++$$1;
            }
            return $$1;
        }

        @Override
        public void a(JsonObject $$0, JsonSerializationContext $$1) {
            $$0.addProperty("extra", (Number)this.b);
            $$0.addProperty("probability", (Number)Float.valueOf(this.c));
        }

        public static b a(JsonObject $$0, JsonDeserializationContext $$1) {
            int $$2 = aor.o($$0, "extra");
            float $$3 = aor.m($$0, "probability");
            return new a($$2, $$3);
        }

        @Override
        public acq a() {
            return a;
        }
    }

    static interface c {
        public b deserialize(JsonObject var1, JsonDeserializationContext var2);
    }

    public static class e
    extends eay.c<eam> {
        @Override
        public void a(JsonObject $$0, eam $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            $$0.addProperty("enchantment", jb.g.b($$1.b).toString());
            $$0.addProperty("formula", $$1.c.a().toString());
            JsonObject $$3 = new JsonObject();
            $$1.c.a($$3, $$2);
            if ($$3.size() > 0) {
                $$0.add("parameters", (JsonElement)$$3);
            }
        }

        public eam a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            b $$8;
            acq $$3 = new acq(aor.i($$0, "enchantment"));
            ckg $$4 = jb.g.b($$3).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + $$3));
            acq $$5 = new acq(aor.i($$0, "formula"));
            c $$6 = a.get($$5);
            if ($$6 == null) {
                throw new JsonParseException("Invalid formula id: " + $$5);
            }
            if ($$0.has("parameters")) {
                b $$7 = $$6.deserialize(aor.u($$0, "parameters"), $$1);
            } else {
                $$8 = $$6.deserialize(new JsonObject(), $$1);
            }
            return new eam($$2, $$4, $$8);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

