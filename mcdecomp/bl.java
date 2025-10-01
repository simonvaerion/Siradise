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

public class bl {
    public static final bl a = new bl(bz.a, bz.a, bz.a, bz.a, bz.a, bz.a);
    public static final bl b = new bl(bz.a.a().a(cgc.tV).a(bzv.s().v()).b(), bz.a, bz.a, bz.a, bz.a, bz.a);
    private final bz c;
    private final bz d;
    private final bz e;
    private final bz f;
    private final bz g;
    private final bz h;

    public bl(bz $$0, bz $$1, bz $$2, bz $$3, bz $$4, bz $$5) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
    }

    public boolean a(@Nullable bfj $$0) {
        if (this == a) {
            return true;
        }
        if (!($$0 instanceof bfz)) {
            return false;
        }
        bfz $$1 = (bfz)$$0;
        if (!this.c.a($$1.c(bfo.f))) {
            return false;
        }
        if (!this.d.a($$1.c(bfo.e))) {
            return false;
        }
        if (!this.e.a($$1.c(bfo.d))) {
            return false;
        }
        if (!this.f.a($$1.c(bfo.c))) {
            return false;
        }
        if (!this.g.a($$1.c(bfo.a))) {
            return false;
        }
        return this.h.a($$1.c(bfo.b));
    }

    public static bl a(@Nullable JsonElement $$0) {
        if ($$0 == null || $$0.isJsonNull()) {
            return a;
        }
        JsonObject $$1 = aor.m($$0, "equipment");
        bz $$2 = bz.a($$1.get("head"));
        bz $$3 = bz.a($$1.get("chest"));
        bz $$4 = bz.a($$1.get("legs"));
        bz $$5 = bz.a($$1.get("feet"));
        bz $$6 = bz.a($$1.get("mainhand"));
        bz $$7 = bz.a($$1.get("offhand"));
        return new bl($$2, $$3, $$4, $$5, $$6, $$7);
    }

    public JsonElement a() {
        if (this == a) {
            return JsonNull.INSTANCE;
        }
        JsonObject $$0 = new JsonObject();
        $$0.add("head", this.c.a());
        $$0.add("chest", this.d.a());
        $$0.add("legs", this.e.a());
        $$0.add("feet", this.f.a());
        $$0.add("mainhand", this.g.a());
        $$0.add("offhand", this.h.a());
        return $$0;
    }

    public static class a {
        private bz a = bz.a;
        private bz b = bz.a;
        private bz c = bz.a;
        private bz d = bz.a;
        private bz e = bz.a;
        private bz f = bz.a;

        public static a a() {
            return new a();
        }

        public a a(bz $$0) {
            this.a = $$0;
            return this;
        }

        public a b(bz $$0) {
            this.b = $$0;
            return this;
        }

        public a c(bz $$0) {
            this.c = $$0;
            return this;
        }

        public a d(bz $$0) {
            this.d = $$0;
            return this;
        }

        public a e(bz $$0) {
            this.e = $$0;
            return this;
        }

        public a f(bz $$0) {
            this.f = $$0;
            return this;
        }

        public bl b() {
            return new bl(this.a, this.b, this.c, this.d, this.e, this.f);
        }
    }
}

