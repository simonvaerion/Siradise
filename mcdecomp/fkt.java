/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class fkt {
    public static final int a = -1;
    public final ha b;
    public final int c;
    public final String d;
    public final fkv e;

    public fkt(@Nullable ha $$0, int $$1, String $$2, fkv $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    protected static class a
    implements JsonDeserializer<fkt> {
        private static final int a = -1;

        protected a() {
        }

        public fkt a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            JsonObject $$3 = $$0.getAsJsonObject();
            ha $$4 = this.c($$3);
            int $$5 = this.a($$3);
            String $$6 = this.b($$3);
            fkv $$7 = (fkv)$$2.deserialize((JsonElement)$$3, fkv.class);
            return new fkt($$4, $$5, $$6, $$7);
        }

        protected int a(JsonObject $$0) {
            return aor.a($$0, "tintindex", -1);
        }

        private String b(JsonObject $$0) {
            return aor.i($$0, "texture");
        }

        @Nullable
        private ha c(JsonObject $$0) {
            String $$1 = aor.a($$0, "cullface", "");
            return ha.a($$1);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

