/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class fkv {
    public float[] a;
    public final int b;

    public fkv(@Nullable float[] $$0, int $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public float a(int $$0) {
        if (this.a == null) {
            throw new NullPointerException("uvs");
        }
        int $$1 = this.d($$0);
        return this.a[$$1 == 0 || $$1 == 1 ? 0 : 2];
    }

    public float b(int $$0) {
        if (this.a == null) {
            throw new NullPointerException("uvs");
        }
        int $$1 = this.d($$0);
        return this.a[$$1 == 0 || $$1 == 3 ? 1 : 3];
    }

    private int d(int $$0) {
        return ($$0 + this.b / 90) % 4;
    }

    public int c(int $$0) {
        return ($$0 + 4 - this.b / 90) % 4;
    }

    public void a(float[] $$0) {
        if (this.a == null) {
            this.a = $$0;
        }
    }

    protected static class a
    implements JsonDeserializer<fkv> {
        private static final int a = 0;

        protected a() {
        }

        public fkv a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            JsonObject $$3 = $$0.getAsJsonObject();
            float[] $$4 = this.b($$3);
            int $$5 = this.a($$3);
            return new fkv($$4, $$5);
        }

        protected int a(JsonObject $$0) {
            int $$1 = aor.a($$0, "rotation", 0);
            if ($$1 < 0 || $$1 % 90 != 0 || $$1 / 90 > 3) {
                throw new JsonParseException("Invalid rotation " + $$1 + " found, only 0/90/180/270 allowed");
            }
            return $$1;
        }

        @Nullable
        private float[] b(JsonObject $$0) {
            if (!$$0.has("uv")) {
                return null;
            }
            JsonArray $$1 = aor.v($$0, "uv");
            if ($$1.size() != 4) {
                throw new JsonParseException("Expected 4 uv values, found: " + $$1.size());
            }
            float[] $$2 = new float[4];
            for (int $$3 = 0; $$3 < $$2.length; ++$$3) {
                $$2[$$3] = aor.e($$1.get($$3), "uv[" + $$3 + "]");
            }
            return $$2;
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

