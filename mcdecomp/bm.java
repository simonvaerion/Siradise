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

public class bm {
    public static final bm a = new a().b();
    @Nullable
    private final Boolean b;
    @Nullable
    private final Boolean c;
    @Nullable
    private final Boolean d;
    @Nullable
    private final Boolean e;
    @Nullable
    private final Boolean f;

    public bm(@Nullable Boolean $$0, @Nullable Boolean $$1, @Nullable Boolean $$2, @Nullable Boolean $$3, @Nullable Boolean $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    public boolean a(bfj $$0) {
        if (this.b != null && $$0.bL() != this.b.booleanValue()) {
            return false;
        }
        if (this.c != null && $$0.bU() != this.c.booleanValue()) {
            return false;
        }
        if (this.d != null && $$0.bV() != this.d.booleanValue()) {
            return false;
        }
        if (this.e != null && $$0.bW() != this.e.booleanValue()) {
            return false;
        }
        return this.f == null || !($$0 instanceof bfz) || ((bfz)$$0).h_() == this.f.booleanValue();
    }

    @Nullable
    private static Boolean a(JsonObject $$0, String $$1) {
        return $$0.has($$1) ? Boolean.valueOf(aor.k($$0, $$1)) : null;
    }

    public static bm a(@Nullable JsonElement $$0) {
        if ($$0 == null || $$0.isJsonNull()) {
            return a;
        }
        JsonObject $$1 = aor.m($$0, "entity flags");
        Boolean $$2 = bm.a($$1, "is_on_fire");
        Boolean $$3 = bm.a($$1, "is_sneaking");
        Boolean $$4 = bm.a($$1, "is_sprinting");
        Boolean $$5 = bm.a($$1, "is_swimming");
        Boolean $$6 = bm.a($$1, "is_baby");
        return new bm($$2, $$3, $$4, $$5, $$6);
    }

    private void a(JsonObject $$0, String $$1, @Nullable Boolean $$2) {
        if ($$2 != null) {
            $$0.addProperty($$1, $$2);
        }
    }

    public JsonElement a() {
        if (this == a) {
            return JsonNull.INSTANCE;
        }
        JsonObject $$0 = new JsonObject();
        this.a($$0, "is_on_fire", this.b);
        this.a($$0, "is_sneaking", this.c);
        this.a($$0, "is_sprinting", this.d);
        this.a($$0, "is_swimming", this.e);
        this.a($$0, "is_baby", this.f);
        return $$0;
    }

    public static class a {
        @Nullable
        private Boolean a;
        @Nullable
        private Boolean b;
        @Nullable
        private Boolean c;
        @Nullable
        private Boolean d;
        @Nullable
        private Boolean e;

        public static a a() {
            return new a();
        }

        public a a(@Nullable Boolean $$0) {
            this.a = $$0;
            return this;
        }

        public a b(@Nullable Boolean $$0) {
            this.b = $$0;
            return this;
        }

        public a c(@Nullable Boolean $$0) {
            this.c = $$0;
            return this;
        }

        public a d(@Nullable Boolean $$0) {
            this.d = $$0;
            return this;
        }

        public a e(@Nullable Boolean $$0) {
            this.e = $$0;
            return this;
        }

        public bm b() {
            return new bm(this.a, this.b, this.c, this.d, this.e);
        }
    }
}

