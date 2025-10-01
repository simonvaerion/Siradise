/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.List;

public class ekc
extends ekf {
    public long a;
    public List<ekb> b = Lists.newArrayList();

    public static ekc a(String $$0) {
        ekc $$1 = new ekc();
        JsonParser $$2 = new JsonParser();
        try {
            JsonElement $$3 = $$2.parse($$0);
            JsonObject $$4 = $$3.getAsJsonObject();
            $$1.a = emb.a("periodInMillis", $$4, -1L);
            JsonElement $$5 = $$4.get("playerActivityDto");
            if ($$5 != null && $$5.isJsonArray()) {
                JsonArray $$6 = $$5.getAsJsonArray();
                for (JsonElement $$7 : $$6) {
                    ekb $$8 = ekb.a($$7.getAsJsonObject());
                    $$1.b.add($$8);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return $$1;
    }
}

