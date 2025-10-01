/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  javax.annotation.Nullable
 *  org.joml.Vector3f
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fks {
    private static final boolean f = false;
    private static final float g = -16.0f;
    private static final float h = 32.0f;
    public final Vector3f a;
    public final Vector3f b;
    public final Map<ha, fkt> c;
    public final fku d;
    public final boolean e;

    public fks(Vector3f $$0, Vector3f $$1, Map<ha, fkt> $$2, @Nullable fku $$3, boolean $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.a();
    }

    private void a() {
        for (Map.Entry<ha, fkt> $$0 : this.c.entrySet()) {
            float[] $$1 = this.a($$0.getKey());
            $$0.getValue().e.a($$1);
        }
    }

    private float[] a(ha $$0) {
        switch ($$0) {
            case a: {
                return new float[]{this.a.x(), 16.0f - this.b.z(), this.b.x(), 16.0f - this.a.z()};
            }
            case b: {
                return new float[]{this.a.x(), this.a.z(), this.b.x(), this.b.z()};
            }
            default: {
                return new float[]{16.0f - this.b.x(), 16.0f - this.b.y(), 16.0f - this.a.x(), 16.0f - this.a.y()};
            }
            case d: {
                return new float[]{this.a.x(), 16.0f - this.b.y(), this.b.x(), 16.0f - this.a.y()};
            }
            case e: {
                return new float[]{this.a.z(), 16.0f - this.b.y(), this.b.z(), 16.0f - this.a.y()};
            }
            case f: 
        }
        return new float[]{16.0f - this.b.z(), 16.0f - this.b.y(), 16.0f - this.a.z(), 16.0f - this.a.y()};
    }

    protected static class a
    implements JsonDeserializer<fks> {
        private static final boolean a = true;

        protected a() {
        }

        public fks a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            JsonObject $$3 = $$0.getAsJsonObject();
            Vector3f $$4 = this.e($$3);
            Vector3f $$5 = this.d($$3);
            fku $$6 = this.a($$3);
            Map<ha, fkt> $$7 = this.a($$2, $$3);
            if ($$3.has("shade") && !aor.c($$3, "shade")) {
                throw new JsonParseException("Expected shade to be a Boolean");
            }
            boolean $$8 = aor.a($$3, "shade", true);
            return new fks($$4, $$5, $$7, $$6, $$8);
        }

        @Nullable
        private fku a(JsonObject $$0) {
            fku $$1 = null;
            if ($$0.has("rotation")) {
                JsonObject $$2 = aor.u($$0, "rotation");
                Vector3f $$3 = this.a($$2, "origin");
                $$3.mul(0.0625f);
                ha.a $$4 = this.c($$2);
                float $$5 = this.b($$2);
                boolean $$6 = aor.a($$2, "rescale", false);
                $$1 = new fku($$3, $$4, $$5, $$6);
            }
            return $$1;
        }

        private float b(JsonObject $$0) {
            float $$1 = aor.m($$0, "angle");
            if ($$1 != 0.0f && apa.e($$1) != 22.5f && apa.e($$1) != 45.0f) {
                throw new JsonParseException("Invalid rotation " + $$1 + " found, only -45/-22.5/0/22.5/45 allowed");
            }
            return $$1;
        }

        private ha.a c(JsonObject $$0) {
            String $$1 = aor.i($$0, "axis");
            ha.a $$2 = ha.a.a($$1.toLowerCase(Locale.ROOT));
            if ($$2 == null) {
                throw new JsonParseException("Invalid rotation axis: " + $$1);
            }
            return $$2;
        }

        private Map<ha, fkt> a(JsonDeserializationContext $$0, JsonObject $$1) {
            Map<ha, fkt> $$2 = this.b($$0, $$1);
            if ($$2.isEmpty()) {
                throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
            }
            return $$2;
        }

        private Map<ha, fkt> b(JsonDeserializationContext $$0, JsonObject $$1) {
            EnumMap $$2 = Maps.newEnumMap(ha.class);
            JsonObject $$3 = aor.u($$1, "faces");
            for (Map.Entry $$4 : $$3.entrySet()) {
                ha $$5 = this.a((String)$$4.getKey());
                $$2.put($$5, (fkt)$$0.deserialize((JsonElement)$$4.getValue(), fkt.class));
            }
            return $$2;
        }

        private ha a(String $$0) {
            ha $$1 = ha.a($$0);
            if ($$1 == null) {
                throw new JsonParseException("Unknown facing: " + $$0);
            }
            return $$1;
        }

        private Vector3f d(JsonObject $$0) {
            Vector3f $$1 = this.a($$0, "to");
            if ($$1.x() < -16.0f || $$1.y() < -16.0f || $$1.z() < -16.0f || $$1.x() > 32.0f || $$1.y() > 32.0f || $$1.z() > 32.0f) {
                throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + $$1);
            }
            return $$1;
        }

        private Vector3f e(JsonObject $$0) {
            Vector3f $$1 = this.a($$0, "from");
            if ($$1.x() < -16.0f || $$1.y() < -16.0f || $$1.z() < -16.0f || $$1.x() > 32.0f || $$1.y() > 32.0f || $$1.z() > 32.0f) {
                throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + $$1);
            }
            return $$1;
        }

        private Vector3f a(JsonObject $$0, String $$1) {
            JsonArray $$2 = aor.v($$0, $$1);
            if ($$2.size() != 3) {
                throw new JsonParseException("Expected 3 " + $$1 + " values, found: " + $$2.size());
            }
            float[] $$3 = new float[3];
            for (int $$4 = 0; $$4 < $$3.length; ++$$4) {
                $$3[$$4] = aor.e($$2.get($$4), $$1 + "[" + $$4 + "]");
            }
            return new Vector3f($$3[0], $$3[1], $$3[2]);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

