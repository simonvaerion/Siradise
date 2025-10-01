/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import javax.annotation.Nullable;

public class bt
implements bp {
    public static final bt b = new bt(false);
    private static final String c = "in_open_water";
    private final boolean d;

    private bt(boolean $$0) {
        this.d = $$0;
    }

    public static bt a(boolean $$0) {
        return new bt($$0);
    }

    public static bt a(JsonObject $$0) {
        JsonElement $$1 = $$0.get(c);
        if ($$1 != null) {
            return new bt(aor.c($$1, c));
        }
        return b;
    }

    @Override
    public JsonObject a() {
        if (this == b) {
            return new JsonObject();
        }
        JsonObject $$0 = new JsonObject();
        $$0.add(c, (JsonElement)new JsonPrimitive(Boolean.valueOf(this.d)));
        return $$0;
    }

    @Override
    public bp.a c() {
        return bp.b.c;
    }

    @Override
    public boolean a(bfj $$0, aif $$1, @Nullable eei $$2) {
        if (this == b) {
            return true;
        }
        if (!($$0 instanceof bzc)) {
            return false;
        }
        bzc $$3 = (bzc)$$0;
        return this.d == $$3.j();
    }
}

