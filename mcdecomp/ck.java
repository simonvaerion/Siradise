/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ck {
    public static final ck a = new ck(Collections.emptyMap());
    private final Map<bey, a> b;

    public ck(Map<bey, a> $$0) {
        this.b = $$0;
    }

    public static ck a() {
        return new ck(Maps.newLinkedHashMap());
    }

    public ck a(bey $$0) {
        this.b.put($$0, new a());
        return this;
    }

    public ck a(bey $$0, a $$1) {
        this.b.put($$0, $$1);
        return this;
    }

    public boolean a(bfj $$0) {
        if (this == a) {
            return true;
        }
        if ($$0 instanceof bfz) {
            return this.a(((bfz)$$0).ep());
        }
        return false;
    }

    public boolean a(bfz $$0) {
        if (this == a) {
            return true;
        }
        return this.a($$0.ep());
    }

    public boolean a(Map<bey, bfa> $$0) {
        if (this == a) {
            return true;
        }
        for (Map.Entry<bey, a> $$1 : this.b.entrySet()) {
            bfa $$2 = $$0.get($$1.getKey());
            if ($$1.getValue().a($$2)) continue;
            return false;
        }
        return true;
    }

    public static ck a(@Nullable JsonElement $$0) {
        if ($$0 == null || $$0.isJsonNull()) {
            return a;
        }
        JsonObject $$1 = aor.m($$0, "effects");
        LinkedHashMap $$2 = Maps.newLinkedHashMap();
        for (Map.Entry $$3 : $$1.entrySet()) {
            acq $$4 = new acq((String)$$3.getKey());
            bey $$5 = jb.e.b($$4).orElseThrow(() -> new JsonSyntaxException("Unknown effect '" + $$4 + "'"));
            a $$6 = ck$a.a(aor.m((JsonElement)$$3.getValue(), (String)$$3.getKey()));
            $$2.put($$5, $$6);
        }
        return new ck($$2);
    }

    public JsonElement b() {
        if (this == a) {
            return JsonNull.INSTANCE;
        }
        JsonObject $$0 = new JsonObject();
        for (Map.Entry<bey, a> $$1 : this.b.entrySet()) {
            $$0.add(jb.e.b($$1.getKey()).toString(), $$1.getValue().a());
        }
        return $$0;
    }

    public static class a {
        private final cj.d a;
        private final cj.d b;
        @Nullable
        private final Boolean c;
        @Nullable
        private final Boolean d;

        public a(cj.d $$0, cj.d $$1, @Nullable Boolean $$2, @Nullable Boolean $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public a() {
            this(cj.d.e, cj.d.e, null, null);
        }

        public boolean a(@Nullable bfa $$0) {
            if ($$0 == null) {
                return false;
            }
            if (!this.a.d($$0.e())) {
                return false;
            }
            if (!this.b.d($$0.d())) {
                return false;
            }
            if (this.c != null && this.c.booleanValue() != $$0.f()) {
                return false;
            }
            return this.d == null || this.d.booleanValue() == $$0.g();
        }

        public JsonElement a() {
            JsonObject $$0 = new JsonObject();
            $$0.add("amplifier", this.a.d());
            $$0.add("duration", this.b.d());
            $$0.addProperty("ambient", this.c);
            $$0.addProperty("visible", this.d);
            return $$0;
        }

        public static a a(JsonObject $$0) {
            cj.d $$1 = cj.d.a($$0.get("amplifier"));
            cj.d $$2 = cj.d.a($$0.get("duration"));
            Boolean $$3 = $$0.has("ambient") ? Boolean.valueOf(aor.k($$0, "ambient")) : null;
            Boolean $$4 = $$0.has("visible") ? Boolean.valueOf(aor.k($$0, "visible")) : null;
            return new a($$1, $$2, $$3, $$4);
        }
    }
}

