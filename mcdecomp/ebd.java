/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class ebd
extends eay {
    final List<b> a;

    ebd(eck[] $$0, List<b> $$1) {
        super($$0);
        this.a = ImmutableList.copyOf($$1);
    }

    @Override
    public eba b() {
        return ebb.j;
    }

    @Override
    public Set<ebt<?>> a() {
        return (Set)this.a.stream().flatMap($$0 -> $$0.d.a().stream()).collect(ImmutableSet.toImmutableSet());
    }

    @Override
    public cfz a(cfz $$0, dzk $$1) {
        apf $$2 = $$1.b();
        for (b $$3 : this.a) {
            UUID $$4 = $$3.e;
            if ($$4 == null) {
                $$4 = UUID.randomUUID();
            }
            bfo $$5 = ac.a($$3.f, $$2);
            $$0.a($$3.b, new bhe($$4, $$3.a, (double)$$3.d.b($$1), $$3.c), $$5);
        }
        return $$0;
    }

    public static c a(String $$0, bhb $$1, bhe.a $$2, edf $$3) {
        return new c($$0, $$1, $$2, $$3);
    }

    public static a c() {
        return new a();
    }

    static class b {
        final String a;
        final bhb b;
        final bhe.a c;
        final edf d;
        @Nullable
        final UUID e;
        final bfo[] f;

        b(String $$0, bhb $$1, bhe.a $$2, edf $$3, bfo[] $$4, @Nullable UUID $$5) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$5;
            this.f = $$4;
        }

        public JsonObject a(JsonSerializationContext $$0) {
            JsonObject $$1 = new JsonObject();
            $$1.addProperty("name", this.a);
            $$1.addProperty("attribute", jb.v.b(this.b).toString());
            $$1.addProperty("operation", ebd$b.a(this.c));
            $$1.add("amount", $$0.serialize((Object)this.d));
            if (this.e != null) {
                $$1.addProperty("id", this.e.toString());
            }
            if (this.f.length == 1) {
                $$1.addProperty("slot", this.f[0].d());
            } else {
                JsonArray $$2 = new JsonArray();
                for (bfo $$3 : this.f) {
                    $$2.add((JsonElement)new JsonPrimitive($$3.d()));
                }
                $$1.add("slot", (JsonElement)$$2);
            }
            return $$1;
        }

        /*
         * WARNING - void declaration
         */
        public static b a(JsonObject $$0, JsonDeserializationContext $$1) {
            void $$13;
            String $$2 = aor.i($$0, "name");
            acq $$3 = new acq(aor.i($$0, "attribute"));
            bhb $$4 = jb.v.a($$3);
            if ($$4 == null) {
                throw new JsonSyntaxException("Unknown attribute: " + $$3);
            }
            bhe.a $$5 = ebd$b.a(aor.i($$0, "operation"));
            edf $$6 = aor.a($$0, "amount", $$1, edf.class);
            UUID $$7 = null;
            if (aor.a($$0, "slot")) {
                bfo[] $$8 = new bfo[]{bfo.a(aor.i($$0, "slot"))};
            } else if (aor.d($$0, "slot")) {
                JsonArray $$9 = aor.v($$0, "slot");
                bfo[] $$10 = new bfo[$$9.size()];
                int $$11 = 0;
                for (JsonElement $$12 : $$9) {
                    $$10[$$11++] = bfo.a(aor.a($$12, "slot"));
                }
                if ($$10.length == 0) {
                    throw new JsonSyntaxException("Invalid attribute modifier slot; must contain at least one entry.");
                }
            } else {
                throw new JsonSyntaxException("Invalid or missing attribute modifier slot; must be either string or array of strings.");
            }
            if ($$0.has("id")) {
                String $$14 = aor.i($$0, "id");
                try {
                    $$7 = UUID.fromString($$14);
                }
                catch (IllegalArgumentException $$15) {
                    throw new JsonSyntaxException("Invalid attribute modifier id '" + $$14 + "' (must be UUID format, with dashes)");
                }
            }
            return new b($$2, $$4, $$5, $$6, (bfo[])$$13, $$7);
        }

        private static String a(bhe.a $$0) {
            switch ($$0) {
                case a: {
                    return "addition";
                }
                case b: {
                    return "multiply_base";
                }
                case c: {
                    return "multiply_total";
                }
            }
            throw new IllegalArgumentException("Unknown operation " + $$0);
        }

        private static bhe.a a(String $$0) {
            switch ($$0) {
                case "addition": {
                    return bhe.a.a;
                }
                case "multiply_base": {
                    return bhe.a.b;
                }
                case "multiply_total": {
                    return bhe.a.c;
                }
            }
            throw new JsonSyntaxException("Unknown attribute modifier operation " + $$0);
        }
    }

    public static class c {
        private final String a;
        private final bhb b;
        private final bhe.a c;
        private final edf d;
        @Nullable
        private UUID e;
        private final Set<bfo> f = EnumSet.noneOf(bfo.class);

        public c(String $$0, bhb $$1, bhe.a $$2, edf $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public c a(bfo $$0) {
            this.f.add($$0);
            return this;
        }

        public c a(UUID $$0) {
            this.e = $$0;
            return this;
        }

        public b a() {
            return new b(this.a, this.b, this.c, this.d, this.f.toArray(new bfo[0]), this.e);
        }
    }

    public static class a
    extends eay.a<a> {
        private final List<b> a = Lists.newArrayList();

        protected a a() {
            return this;
        }

        public a a(c $$0) {
            this.a.add($$0.a());
            return this;
        }

        @Override
        public eaz b() {
            return new ebd(this.g(), this.a);
        }

        @Override
        protected /* synthetic */ eay.a c() {
            return this.a();
        }
    }

    public static class d
    extends eay.c<ebd> {
        @Override
        public void a(JsonObject $$0, ebd $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            JsonArray $$3 = new JsonArray();
            for (b $$4 : $$1.a) {
                $$3.add((JsonElement)$$4.a($$2));
            }
            $$0.add("modifiers", (JsonElement)$$3);
        }

        public ebd a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            JsonArray $$3 = aor.v($$0, "modifiers");
            ArrayList $$4 = Lists.newArrayListWithExpectedSize((int)$$3.size());
            for (JsonElement $$5 : $$3) {
                $$4.add(b.a(aor.m($$5, "modifier"), $$1));
            }
            if ($$4.isEmpty()) {
                throw new JsonSyntaxException("Invalid attribute modifiers array; cannot be empty");
            }
            return new ebd($$2, $$4);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

