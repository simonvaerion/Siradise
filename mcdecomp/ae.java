/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.ArrayUtils
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class ae {
    @Nullable
    private final ae a;
    @Nullable
    private final an b;
    private final ah c;
    private final acq d;
    private final Map<String, aj> e;
    private final String[][] f;
    private final Set<ae> g = Sets.newLinkedHashSet();
    private final sw h;
    private final boolean i;

    public ae(acq $$0, @Nullable ae $$12, @Nullable an $$2, ah $$3, Map<String, aj> $$4, String[][] $$5, boolean $$6) {
        this.d = $$0;
        this.b = $$2;
        this.e = ImmutableMap.copyOf($$4);
        this.a = $$12;
        this.c = $$3;
        this.f = $$5;
        this.i = $$6;
        if ($$12 != null) {
            $$12.b(this);
        }
        if ($$2 == null) {
            this.h = sw.b($$0.toString());
        } else {
            sw $$7 = $$2.a();
            n $$8 = $$2.e().c();
            tj $$9 = sy.a($$7.e(), ts.a.a($$8)).f("\n").b($$2.b());
            tj $$10 = $$7.e().a($$1 -> $$1.a(new tb(tb.a.a, $$9)));
            this.h = sy.a($$10).a($$8);
        }
    }

    public a a() {
        return new a(this.a == null ? null : this.a.j(), this.b, this.c, this.e, this.f, this.i);
    }

    @Nullable
    public ae b() {
        return this.a;
    }

    public ae c() {
        return ae.a(this);
    }

    public static ae a(ae $$0) {
        ae $$1 = $$0;
        ae $$2;
        while (($$2 = $$1.b()) != null) {
            $$1 = $$2;
        }
        return $$1;
    }

    @Nullable
    public an d() {
        return this.b;
    }

    public boolean e() {
        return this.i;
    }

    public ah f() {
        return this.c;
    }

    public String toString() {
        return "SimpleAdvancement{id=" + this.j() + ", parent=" + (Comparable)(this.a == null ? "null" : this.a.j()) + ", display=" + this.b + ", rewards=" + this.c + ", criteria=" + this.e + ", requirements=" + Arrays.deepToString((Object[])this.f) + ", sendsTelemetryEvent=" + this.i + "}";
    }

    public Iterable<ae> g() {
        return this.g;
    }

    public Map<String, aj> h() {
        return this.e;
    }

    public int i() {
        return this.f.length;
    }

    public void b(ae $$0) {
        this.g.add($$0);
    }

    public acq j() {
        return this.d;
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof ae)) {
            return false;
        }
        ae $$1 = (ae)$$0;
        return this.d.equals($$1.d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String[][] k() {
        return this.f;
    }

    public sw l() {
        return this.h;
    }

    public static class a {
        @Nullable
        private acq a;
        @Nullable
        private ae b;
        @Nullable
        private an c;
        private ah d = ah.a;
        private Map<String, aj> e = Maps.newLinkedHashMap();
        @Nullable
        private String[][] f;
        private ap g = ap.a;
        private final boolean h;

        a(@Nullable acq $$0, @Nullable an $$1, ah $$2, Map<String, aj> $$3, String[][] $$4, boolean $$5) {
            this.a = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
            this.h = $$5;
        }

        private a(boolean $$0) {
            this.h = $$0;
        }

        public static a a() {
            return new a(true);
        }

        public static a b() {
            return new a(false);
        }

        public a a(ae $$0) {
            this.b = $$0;
            return this;
        }

        public a a(acq $$0) {
            this.a = $$0;
            return this;
        }

        public a a(cfz $$0, sw $$1, sw $$2, @Nullable acq $$3, ao $$4, boolean $$5, boolean $$6, boolean $$7) {
            return this.a(new an($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
        }

        public a a(cml $$0, sw $$1, sw $$2, @Nullable acq $$3, ao $$4, boolean $$5, boolean $$6, boolean $$7) {
            return this.a(new an(new cfz($$0.k()), $$1, $$2, $$3, $$4, $$5, $$6, $$7));
        }

        public a a(an $$0) {
            this.c = $$0;
            return this;
        }

        public a a(ah.a $$0) {
            return this.a($$0.a());
        }

        public a a(ah $$0) {
            this.d = $$0;
            return this;
        }

        public a a(String $$0, am $$1) {
            return this.a($$0, new aj($$1));
        }

        public a a(String $$0, aj $$1) {
            if (this.e.containsKey($$0)) {
                throw new IllegalArgumentException("Duplicate criterion " + $$0);
            }
            this.e.put($$0, $$1);
            return this;
        }

        public a a(ap $$0) {
            this.g = $$0;
            return this;
        }

        public a a(String[][] $$0) {
            this.f = $$0;
            return this;
        }

        public boolean a(Function<acq, ae> $$0) {
            if (this.a == null) {
                return true;
            }
            if (this.b == null) {
                this.b = $$0.apply(this.a);
            }
            return this.b != null;
        }

        public ae b(acq $$02) {
            if (!this.a((acq $$0) -> null)) {
                throw new IllegalStateException("Tried to build incomplete advancement!");
            }
            if (this.f == null) {
                this.f = this.g.createRequirements(this.e.keySet());
            }
            return new ae($$02, this.b, this.c, this.d, this.e, this.f, this.h);
        }

        public ae a(Consumer<ae> $$0, String $$1) {
            ae $$2 = this.b(new acq($$1));
            $$0.accept($$2);
            return $$2;
        }

        public JsonObject c() {
            if (this.f == null) {
                this.f = this.g.createRequirements(this.e.keySet());
            }
            JsonObject $$0 = new JsonObject();
            if (this.b != null) {
                $$0.addProperty("parent", this.b.j().toString());
            } else if (this.a != null) {
                $$0.addProperty("parent", this.a.toString());
            }
            if (this.c != null) {
                $$0.add("display", this.c.k());
            }
            $$0.add("rewards", this.d.b());
            JsonObject $$1 = new JsonObject();
            for (Map.Entry<String, aj> $$2 : this.e.entrySet()) {
                $$1.add($$2.getKey(), $$2.getValue().b());
            }
            $$0.add("criteria", (JsonElement)$$1);
            JsonArray $$3 = new JsonArray();
            for (String[] $$4 : this.f) {
                JsonArray $$5 = new JsonArray();
                for (String $$6 : $$4) {
                    $$5.add($$6);
                }
                $$3.add((JsonElement)$$5);
            }
            $$0.add("requirements", (JsonElement)$$3);
            $$0.addProperty("sends_telemetry_event", Boolean.valueOf(this.h));
            return $$0;
        }

        public void a(sf $$02) {
            if (this.f == null) {
                this.f = this.g.createRequirements(this.e.keySet());
            }
            $$02.a(this.a, sf::a);
            $$02.a(this.c, ($$0, $$1) -> $$1.a((sf)((Object)$$0)));
            aj.a(this.e, $$02);
            $$02.d(this.f.length);
            for (String[] $$12 : this.f) {
                $$02.d($$12.length);
                for (String $$2 : $$12) {
                    $$02.a($$2);
                }
            }
            $$02.writeBoolean(this.h);
        }

        public String toString() {
            return "Task Advancement{parentId=" + this.a + ", display=" + this.c + ", rewards=" + this.d + ", criteria=" + this.e + ", requirements=" + Arrays.deepToString((Object[])this.f) + ", sends_telemetry_event=" + this.h + "}";
        }

        public static a a(JsonObject $$0, be $$1) {
            acq $$2 = $$0.has("parent") ? new acq(aor.i($$0, "parent")) : null;
            an $$3 = $$0.has("display") ? an.a(aor.u($$0, "display")) : null;
            ah $$4 = $$0.has("rewards") ? ah.a(aor.u($$0, "rewards")) : ah.a;
            Map<String, aj> $$5 = aj.b(aor.u($$0, "criteria"), $$1);
            if ($$5.isEmpty()) {
                throw new JsonSyntaxException("Advancement criteria cannot be empty");
            }
            JsonArray $$6 = aor.a($$0, "requirements", new JsonArray());
            String[][] $$7 = new String[$$6.size()][];
            for (int $$8 = 0; $$8 < $$6.size(); ++$$8) {
                JsonArray $$9 = aor.n($$6.get($$8), "requirements[" + $$8 + "]");
                $$7[$$8] = new String[$$9.size()];
                for (int $$10 = 0; $$10 < $$9.size(); ++$$10) {
                    $$7[$$8][$$10] = aor.a($$9.get($$10), "requirements[" + $$8 + "][" + $$10 + "]");
                }
            }
            if ($$7.length == 0) {
                $$7 = new String[$$5.size()][];
                int $$11 = 0;
                for (String $$12 : $$5.keySet()) {
                    $$7[$$11++] = new String[]{$$12};
                }
            }
            for (String[] $$13 : $$7) {
                if ($$13.length == 0 && $$5.isEmpty()) {
                    throw new JsonSyntaxException("Requirement entry cannot be empty");
                }
                String[] stringArray = $$13;
                int n2 = stringArray.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    String $$14 = stringArray[i2];
                    if ($$5.containsKey($$14)) continue;
                    throw new JsonSyntaxException("Unknown required criterion '" + $$14 + "'");
                }
            }
            for (String $$15 : $$5.keySet()) {
                boolean $$16 = false;
                for (Object[] objectArray : $$7) {
                    if (!ArrayUtils.contains((Object[])objectArray, (Object)$$15)) continue;
                    $$16 = true;
                    break;
                }
                if ($$16) continue;
                throw new JsonSyntaxException("Criterion '" + $$15 + "' isn't a requirement for completion. This isn't supported behaviour, all criteria must be required.");
            }
            boolean $$18 = aor.a($$0, "sends_telemetry_event", false);
            return new a($$2, $$3, $$4, $$5, $$7, $$18);
        }

        public static a b(sf $$0) {
            acq $$1 = (acq)$$0.c(sf::t);
            an $$2 = (an)$$0.c(an::b);
            Map<String, aj> $$3 = aj.c($$0);
            String[][] $$4 = new String[$$0.m()][];
            for (int $$5 = 0; $$5 < $$4.length; ++$$5) {
                $$4[$$5] = new String[$$0.m()];
                for (int $$6 = 0; $$6 < $$4[$$5].length; ++$$6) {
                    $$4[$$5][$$6] = $$0.s();
                }
            }
            boolean $$7 = $$0.readBoolean();
            return new a($$1, $$2, ah.a, $$3, $$4, $$7);
        }

        public Map<String, aj> d() {
            return this.e;
        }
    }
}

