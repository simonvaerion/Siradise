/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;

public final class edd
implements edf {
    final float a;

    edd(float $$0) {
        this.a = $$0;
    }

    @Override
    public ede b() {
        return edg.a;
    }

    @Override
    public float b(dzk $$0) {
        return this.a;
    }

    public static edd a(float $$0) {
        return new edd($$0);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        return Float.compare(((edd)$$0).a, this.a) == 0;
    }

    public int hashCode() {
        return this.a != 0.0f ? Float.floatToIntBits(this.a) : 0;
    }

    public static class a
    implements dzi.b<edd> {
        @Override
        public JsonElement a(edd $$0, JsonSerializationContext $$1) {
            return new JsonPrimitive((Number)Float.valueOf($$0.a));
        }

        public edd b(JsonElement $$0, JsonDeserializationContext $$1) {
            return new edd(aor.e($$0, "value"));
        }

        @Override
        public /* synthetic */ Object a(JsonElement jsonElement, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonElement, jsonDeserializationContext);
        }
    }

    public static class b
    implements dzt<edd> {
        @Override
        public void a(JsonObject $$0, edd $$1, JsonSerializationContext $$2) {
            $$0.addProperty("value", (Number)Float.valueOf($$1.a));
        }

        public edd b(JsonObject $$0, JsonDeserializationContext $$1) {
            float $$2 = aor.m($$0, "value");
            return new edd($$2);
        }

        @Override
        public /* synthetic */ Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonObject, jsonDeserializationContext);
        }
    }
}

