/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.apache.commons.lang3.Validate
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.Validate;

public class fxx
implements JsonDeserializer<fxw> {
    private static final bda a = bcy.a(1.0f);

    public fxw a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
        JsonObject $$3 = aor.m($$0, "entry");
        boolean $$4 = aor.a($$3, "replace", false);
        String $$5 = aor.a($$3, "subtitle", null);
        List<fxv> $$6 = this.a($$3);
        return new fxw($$6, $$4, $$5);
    }

    private List<fxv> a(JsonObject $$0) {
        ArrayList $$1 = Lists.newArrayList();
        if ($$0.has("sounds")) {
            JsonArray $$2 = aor.v($$0, "sounds");
            for (int $$3 = 0; $$3 < $$2.size(); ++$$3) {
                JsonElement $$4 = $$2.get($$3);
                if (aor.a($$4)) {
                    String $$5 = aor.a($$4, "sound");
                    $$1.add(new fxv($$5, a, a, 1, fxv.a.a, false, false, 16));
                    continue;
                }
                $$1.add(this.b(aor.m($$4, "sound")));
            }
        }
        return $$1;
    }

    private fxv b(JsonObject $$0) {
        String $$1 = aor.i($$0, "name");
        fxv.a $$2 = this.a($$0, fxv.a.a);
        float $$3 = aor.a($$0, "volume", 1.0f);
        Validate.isTrue(($$3 > 0.0f ? 1 : 0) != 0, (String)"Invalid volume", (Object[])new Object[0]);
        float $$4 = aor.a($$0, "pitch", 1.0f);
        Validate.isTrue(($$4 > 0.0f ? 1 : 0) != 0, (String)"Invalid pitch", (Object[])new Object[0]);
        int $$5 = aor.a($$0, "weight", 1);
        Validate.isTrue(($$5 > 0 ? 1 : 0) != 0, (String)"Invalid weight", (Object[])new Object[0]);
        boolean $$6 = aor.a($$0, "preload", false);
        boolean $$7 = aor.a($$0, "stream", false);
        int $$8 = aor.a($$0, "attenuation_distance", 16);
        return new fxv($$1, bcy.a($$3), bcy.a($$4), $$5, $$2, $$7, $$6, $$8);
    }

    private fxv.a a(JsonObject $$0, fxv.a $$1) {
        fxv.a $$2 = $$1;
        if ($$0.has("type")) {
            $$2 = fxv.a.a(aor.i($$0, "type"));
            Validate.notNull((Object)((Object)$$2), (String)"Invalid type", (Object[])new Object[0]);
        }
        return $$2;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}

