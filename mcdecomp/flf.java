/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Objects;

public class flf
implements fwz {
    private final acq a;
    private final j b;
    private final boolean c;
    private final int d;

    public flf(acq $$0, j $$1, boolean $$2, int $$3) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    public acq a() {
        return this.a;
    }

    @Override
    public j b() {
        return this.b;
    }

    @Override
    public boolean c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public String toString() {
        return "Variant{modelLocation=" + this.a + ", rotation=" + this.b + ", uvLock=" + this.c + ", weight=" + this.d + "}";
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof flf) {
            flf $$1 = (flf)$$0;
            return this.a.equals($$1.a) && Objects.equals(this.b, $$1.b) && this.c == $$1.c && this.d == $$1.d;
        }
        return false;
    }

    public int hashCode() {
        int $$0 = this.a.hashCode();
        $$0 = 31 * $$0 + this.b.hashCode();
        $$0 = 31 * $$0 + Boolean.valueOf(this.c).hashCode();
        $$0 = 31 * $$0 + this.d;
        return $$0;
    }

    public static class a
    implements JsonDeserializer<flf> {
        @VisibleForTesting
        static final boolean a = false;
        @VisibleForTesting
        static final int b = 1;
        @VisibleForTesting
        static final int c = 0;
        @VisibleForTesting
        static final int d = 0;

        public flf a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            JsonObject $$3 = $$0.getAsJsonObject();
            acq $$4 = this.b($$3);
            fws $$5 = this.a($$3);
            boolean $$6 = this.d($$3);
            int $$7 = this.c($$3);
            return new flf($$4, $$5.b(), $$6, $$7);
        }

        private boolean d(JsonObject $$0) {
            return aor.a($$0, "uvlock", false);
        }

        protected fws a(JsonObject $$0) {
            int $$2;
            int $$1 = aor.a($$0, "x", 0);
            fws $$3 = fws.a($$1, $$2 = aor.a($$0, "y", 0));
            if ($$3 == null) {
                throw new JsonParseException("Invalid BlockModelRotation x: " + $$1 + ", y: " + $$2);
            }
            return $$3;
        }

        protected acq b(JsonObject $$0) {
            return new acq(aor.i($$0, "model"));
        }

        protected int c(JsonObject $$0) {
            int $$1 = aor.a($$0, "weight", 1);
            if ($$1 < 1) {
                throw new JsonParseException("Invalid weight " + $$1 + " found, expected integer >= 1");
            }
            return $$1;
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

