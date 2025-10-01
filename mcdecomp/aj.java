/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class aj {
    @Nullable
    private final am a;

    public aj(am $$0) {
        this.a = $$0;
    }

    public aj() {
        this.a = null;
    }

    public void a(sf $$0) {
    }

    public static aj a(JsonObject $$0, be $$1) {
        acq $$2 = new acq(aor.i($$0, "trigger"));
        al $$3 = ai.a($$2);
        if ($$3 == null) {
            throw new JsonSyntaxException("Invalid criterion trigger: " + $$2);
        }
        Object $$4 = $$3.a(aor.a($$0, "conditions", new JsonObject()), $$1);
        return new aj((am)$$4);
    }

    public static aj b(sf $$0) {
        return new aj();
    }

    public static Map<String, aj> b(JsonObject $$0, be $$1) {
        HashMap $$2 = Maps.newHashMap();
        for (Map.Entry $$3 : $$0.entrySet()) {
            $$2.put((String)$$3.getKey(), aj.a(aor.m((JsonElement)$$3.getValue(), "criterion"), $$1));
        }
        return $$2;
    }

    public static Map<String, aj> c(sf $$0) {
        return $$0.a(sf::s, aj::b);
    }

    public static void a(Map<String, aj> $$02, sf $$12) {
        $$12.a($$02, sf::a, ($$0, $$1) -> $$1.a((sf)((Object)$$0)));
    }

    @Nullable
    public am a() {
        return this.a;
    }

    public JsonElement b() {
        if (this.a == null) {
            throw new JsonSyntaxException("Missing trigger");
        }
        JsonObject $$0 = new JsonObject();
        $$0.addProperty("trigger", this.a.a().toString());
        JsonObject $$1 = this.a.a(ct.a);
        if ($$1.size() != 0) {
            $$0.add("conditions", (JsonElement)$$1);
        }
        return $$0;
    }
}

