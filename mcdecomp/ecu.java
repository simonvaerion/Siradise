/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import javax.annotation.Nullable;

public class ecu
implements eck {
    @Nullable
    final Boolean a;
    @Nullable
    final Boolean b;

    ecu(@Nullable Boolean $$0, @Nullable Boolean $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public ecl b() {
        return ecm.o;
    }

    public boolean a(dzk $$0) {
        aif $$1 = $$0.d();
        if (this.a != null && this.a.booleanValue() != $$1.Z()) {
            return false;
        }
        return this.b == null || this.b.booleanValue() == $$1.Y();
    }

    public static a c() {
        return new a();
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((dzk)object);
    }

    public static class a
    implements eck.a {
        @Nullable
        private Boolean a;
        @Nullable
        private Boolean b;

        public a a(@Nullable Boolean $$0) {
            this.a = $$0;
            return this;
        }

        public a b(@Nullable Boolean $$0) {
            this.b = $$0;
            return this;
        }

        public ecu a() {
            return new ecu(this.a, this.b);
        }

        @Override
        public /* synthetic */ eck build() {
            return this.a();
        }
    }

    public static class b
    implements dzt<ecu> {
        @Override
        public void a(JsonObject $$0, ecu $$1, JsonSerializationContext $$2) {
            $$0.addProperty("raining", $$1.a);
            $$0.addProperty("thundering", $$1.b);
        }

        public ecu b(JsonObject $$0, JsonDeserializationContext $$1) {
            Boolean $$2 = $$0.has("raining") ? Boolean.valueOf(aor.k($$0, "raining")) : null;
            Boolean $$3 = $$0.has("thundering") ? Boolean.valueOf(aor.k($$0, "thundering")) : null;
            return new ecu($$2, $$3);
        }

        @Override
        public /* synthetic */ Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonObject, jsonDeserializationContext);
        }
    }
}

