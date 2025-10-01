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

public class bc {
    public static final bc a = bc$a.a().b();
    private final cj.c b;
    private final cj.c c;
    private final bo d;
    @Nullable
    private final Boolean e;
    private final bd f;

    public bc() {
        this.b = cj.c.e;
        this.c = cj.c.e;
        this.d = bo.a;
        this.e = null;
        this.f = bd.a;
    }

    public bc(cj.c $$0, cj.c $$1, bo $$2, @Nullable Boolean $$3, bd $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    public boolean a(aig $$0, ben $$1, float $$2, float $$3, boolean $$4) {
        if (this == a) {
            return true;
        }
        if (!this.b.d($$2)) {
            return false;
        }
        if (!this.c.d($$3)) {
            return false;
        }
        if (!this.d.a($$0, $$1.d())) {
            return false;
        }
        if (this.e != null && this.e != $$4) {
            return false;
        }
        return this.f.a($$0, $$1);
    }

    public static bc a(@Nullable JsonElement $$0) {
        if ($$0 == null || $$0.isJsonNull()) {
            return a;
        }
        JsonObject $$1 = aor.m($$0, "damage");
        cj.c $$2 = cj.c.a($$1.get("dealt"));
        cj.c $$3 = cj.c.a($$1.get("taken"));
        Boolean $$4 = $$1.has("blocked") ? Boolean.valueOf(aor.k($$1, "blocked")) : null;
        bo $$5 = bo.a($$1.get("source_entity"));
        bd $$6 = bd.a($$1.get("type"));
        return new bc($$2, $$3, $$5, $$4, $$6);
    }

    public JsonElement a() {
        if (this == a) {
            return JsonNull.INSTANCE;
        }
        JsonObject $$0 = new JsonObject();
        $$0.add("dealt", this.b.d());
        $$0.add("taken", this.c.d());
        $$0.add("source_entity", this.d.a());
        $$0.add("type", this.f.a());
        if (this.e != null) {
            $$0.addProperty("blocked", this.e);
        }
        return $$0;
    }

    public static class a {
        private cj.c a = cj.c.e;
        private cj.c b = cj.c.e;
        private bo c = bo.a;
        @Nullable
        private Boolean d;
        private bd e = bd.a;

        public static a a() {
            return new a();
        }

        public a a(cj.c $$0) {
            this.a = $$0;
            return this;
        }

        public a b(cj.c $$0) {
            this.b = $$0;
            return this;
        }

        public a a(bo $$0) {
            this.c = $$0;
            return this;
        }

        public a a(Boolean $$0) {
            this.d = $$0;
            return this;
        }

        public a a(bd $$0) {
            this.e = $$0;
            return this;
        }

        public a a(bd.a $$0) {
            this.e = $$0.b();
            return this;
        }

        public bc b() {
            return new bc(this.a, this.b, this.c, this.d, this.e);
        }
    }
}

