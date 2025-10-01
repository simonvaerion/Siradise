/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class ce {
    public static final ce a = new ce(cj.d.e);
    private final cj.d b;

    ce(cj.d $$0) {
        this.b = $$0;
    }

    public boolean a(aif $$0, gu $$1) {
        if (this == a) {
            return true;
        }
        if (!$$0.o($$1)) {
            return false;
        }
        return this.b.d($$0.z($$1));
    }

    public JsonElement a() {
        if (this == a) {
            return JsonNull.INSTANCE;
        }
        JsonObject $$0 = new JsonObject();
        $$0.add("light", this.b.d());
        return $$0;
    }

    public static ce a(@Nullable JsonElement $$0) {
        if ($$0 == null || $$0.isJsonNull()) {
            return a;
        }
        JsonObject $$1 = aor.m($$0, "light");
        cj.d $$2 = cj.d.a($$1.get("light"));
        return new ce($$2);
    }

    public static class a {
        private cj.d a = cj.d.e;

        public static a a() {
            return new a();
        }

        public a a(cj.d $$0) {
            this.a = $$0;
            return this;
        }

        public ce b() {
            return new ce(this.a);
        }
    }
}

