/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class bd {
    public static final bd a = bd$a.a().b();
    private final List<db<bep>> b;
    private final bo c;
    private final bo d;

    public bd(List<db<bep>> $$0, bo $$1, bo $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public boolean a(aig $$0, ben $$1) {
        return this.a($$0.x(), $$0.dg(), $$1);
    }

    public boolean a(aif $$0, eei $$1, ben $$2) {
        if (this == a) {
            return true;
        }
        for (db<bep> $$3 : this.b) {
            if ($$3.a($$2.k())) continue;
            return false;
        }
        if (!this.c.a($$0, $$1, $$2.c())) {
            return false;
        }
        return this.d.a($$0, $$1, $$2.d());
    }

    public static bd a(@Nullable JsonElement $$0) {
        List<db<bep>> $$5;
        if ($$0 == null || $$0.isJsonNull()) {
            return a;
        }
        JsonObject $$1 = aor.m($$0, "damage type");
        JsonArray $$2 = aor.a($$1, "tags", null);
        if ($$2 != null) {
            ArrayList<db<bep>> $$3 = new ArrayList<db<bep>>($$2.size());
            for (JsonElement $$4 : $$2) {
                $$3.add(db.a($$4, jc.p));
            }
        } else {
            $$5 = List.of();
        }
        bo $$6 = bo.a($$1.get("direct_entity"));
        bo $$7 = bo.a($$1.get("source_entity"));
        return new bd($$5, $$6, $$7);
    }

    public JsonElement a() {
        if (this == a) {
            return JsonNull.INSTANCE;
        }
        JsonObject $$0 = new JsonObject();
        if (!this.b.isEmpty()) {
            JsonArray $$1 = new JsonArray(this.b.size());
            for (int $$2 = 0; $$2 < this.b.size(); ++$$2) {
                $$1.add(this.b.get($$2).a());
            }
            $$0.add("tags", (JsonElement)$$1);
        }
        $$0.add("direct_entity", this.c.a());
        $$0.add("source_entity", this.d.a());
        return $$0;
    }

    public static class a {
        private final ImmutableList.Builder<db<bep>> a = ImmutableList.builder();
        private bo b = bo.a;
        private bo c = bo.a;

        public static a a() {
            return new a();
        }

        public a a(db<bep> $$0) {
            this.a.add($$0);
            return this;
        }

        public a a(bo $$0) {
            this.b = $$0;
            return this;
        }

        public a a(bo.a $$0) {
            this.b = $$0.b();
            return this;
        }

        public a b(bo $$0) {
            this.c = $$0;
            return this;
        }

        public a b(bo.a $$0) {
            this.c = $$0.b();
            return this;
        }

        public bd b() {
            return new bd((List<db<bep>>)this.a.build(), this.b, this.c);
        }
    }
}

