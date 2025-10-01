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
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class flc {
    public static final flc a = new flc(new Vector3f(), new Vector3f(), new Vector3f(1.0f, 1.0f, 1.0f));
    public final Vector3f b;
    public final Vector3f c;
    public final Vector3f d;

    public flc(Vector3f $$0, Vector3f $$1, Vector3f $$2) {
        this.b = new Vector3f((Vector3fc)$$0);
        this.c = new Vector3f((Vector3fc)$$1);
        this.d = new Vector3f((Vector3fc)$$2);
    }

    public void a(boolean $$0, eij $$1) {
        if (this == a) {
            return;
        }
        float $$2 = this.b.x();
        float $$3 = this.b.y();
        float $$4 = this.b.z();
        if ($$0) {
            $$3 = -$$3;
            $$4 = -$$4;
        }
        int $$5 = $$0 ? -1 : 1;
        $$1.a((float)$$5 * this.c.x(), this.c.y(), this.c.z());
        $$1.a(new Quaternionf().rotationXYZ($$2 * ((float)Math.PI / 180), $$3 * ((float)Math.PI / 180), $$4 * ((float)Math.PI / 180)));
        $$1.b(this.d.x(), this.d.y(), this.d.z());
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (this.getClass() == $$0.getClass()) {
            flc $$1 = (flc)$$0;
            return this.b.equals((Object)$$1.b) && this.d.equals((Object)$$1.d) && this.c.equals((Object)$$1.c);
        }
        return false;
    }

    public int hashCode() {
        int $$0 = this.b.hashCode();
        $$0 = 31 * $$0 + this.c.hashCode();
        $$0 = 31 * $$0 + this.d.hashCode();
        return $$0;
    }

    protected static class a
    implements JsonDeserializer<flc> {
        private static final Vector3f c = new Vector3f(0.0f, 0.0f, 0.0f);
        private static final Vector3f d = new Vector3f(0.0f, 0.0f, 0.0f);
        private static final Vector3f e = new Vector3f(1.0f, 1.0f, 1.0f);
        public static final float a = 5.0f;
        public static final float b = 4.0f;

        protected a() {
        }

        public flc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            JsonObject $$3 = $$0.getAsJsonObject();
            Vector3f $$4 = this.a($$3, "rotation", c);
            Vector3f $$5 = this.a($$3, "translation", d);
            $$5.mul(0.0625f);
            $$5.set(apa.a($$5.x, -5.0f, 5.0f), apa.a($$5.y, -5.0f, 5.0f), apa.a($$5.z, -5.0f, 5.0f));
            Vector3f $$6 = this.a($$3, "scale", e);
            $$6.set(apa.a($$6.x, -4.0f, 4.0f), apa.a($$6.y, -4.0f, 4.0f), apa.a($$6.z, -4.0f, 4.0f));
            return new flc($$4, $$5, $$6);
        }

        private Vector3f a(JsonObject $$0, String $$1, Vector3f $$2) {
            if (!$$0.has($$1)) {
                return $$2;
            }
            JsonArray $$3 = aor.v($$0, $$1);
            if ($$3.size() != 3) {
                throw new JsonParseException("Expected 3 " + $$1 + " values, found: " + $$3.size());
            }
            float[] $$4 = new float[3];
            for (int $$5 = 0; $$5 < $$4.length; ++$$5) {
                $$4[$$5] = aor.e($$3.get($$5), $$1 + "[" + $$5 + "]");
            }
            return new Vector3f($$4[0], $$4[1], $$4[2]);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

