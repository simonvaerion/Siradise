/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class aka
implements ajy<ajz> {
    public ajz b(JsonObject $$0) {
        tj $$1 = sw.a.a($$0.get("description"));
        if ($$1 == null) {
            throw new JsonParseException("Invalid/missing description!");
        }
        int $$2 = aor.o($$0, "pack_format");
        return new ajz($$1, $$2);
    }

    @Override
    public JsonObject a(ajz $$0) {
        JsonObject $$1 = new JsonObject();
        $$1.add("description", sw.a.c($$0.a()));
        $$1.addProperty("pack_format", (Number)$$0.b());
        return $$1;
    }

    @Override
    public String a() {
        return "pack";
    }

    @Override
    public /* synthetic */ Object a(JsonObject jsonObject) {
        return this.b(jsonObject);
    }
}

