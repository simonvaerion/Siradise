/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Date;
import java.util.UUID;
import java.util.function.Function;
import javax.annotation.Nullable;

public class emb {
    public static <T> T a(String $$0, JsonObject $$1, Function<JsonObject, T> $$2) {
        JsonElement $$3 = $$1.get($$0);
        if ($$3 == null || $$3.isJsonNull()) {
            throw new IllegalStateException("Missing required property: " + $$0);
        }
        if (!$$3.isJsonObject()) {
            throw new IllegalStateException("Required property " + $$0 + " was not a JsonObject as espected");
        }
        return $$2.apply($$3.getAsJsonObject());
    }

    public static String a(String $$0, JsonObject $$1) {
        String $$2 = emb.a($$0, $$1, null);
        if ($$2 == null) {
            throw new IllegalStateException("Missing required property: " + $$0);
        }
        return $$2;
    }

    @Nullable
    public static String a(String $$0, JsonObject $$1, @Nullable String $$2) {
        JsonElement $$3 = $$1.get($$0);
        if ($$3 != null) {
            return $$3.isJsonNull() ? $$2 : $$3.getAsString();
        }
        return $$2;
    }

    @Nullable
    public static UUID a(String $$0, JsonObject $$1, @Nullable UUID $$2) {
        String $$3 = emb.a($$0, $$1, null);
        if ($$3 == null) {
            return $$2;
        }
        return UUID.fromString($$3);
    }

    public static int a(String $$0, JsonObject $$1, int $$2) {
        JsonElement $$3 = $$1.get($$0);
        if ($$3 != null) {
            return $$3.isJsonNull() ? $$2 : $$3.getAsInt();
        }
        return $$2;
    }

    public static long a(String $$0, JsonObject $$1, long $$2) {
        JsonElement $$3 = $$1.get($$0);
        if ($$3 != null) {
            return $$3.isJsonNull() ? $$2 : $$3.getAsLong();
        }
        return $$2;
    }

    public static boolean a(String $$0, JsonObject $$1, boolean $$2) {
        JsonElement $$3 = $$1.get($$0);
        if ($$3 != null) {
            return $$3.isJsonNull() ? $$2 : $$3.getAsBoolean();
        }
        return $$2;
    }

    public static Date b(String $$0, JsonObject $$1) {
        JsonElement $$2 = $$1.get($$0);
        if ($$2 != null) {
            return new Date(Long.parseLong($$2.getAsString()));
        }
        return new Date();
    }
}

