/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;

public class eju
extends ekf {
    private static final Logger c = LogUtils.getLogger();
    private static final JsonParser d = new JsonParser();
    public long a;
    public List<String> b;

    public static eju a(JsonObject $$0) {
        eju $$1 = new eju();
        try {
            JsonElement $$3;
            $$1.a = emb.a("serverId", $$0, -1L);
            String $$2 = emb.a("playerList", $$0, null);
            $$1.b = $$2 != null ? (($$3 = d.parse($$2)).isJsonArray() ? eju.a($$3.getAsJsonArray()) : Lists.newArrayList()) : Lists.newArrayList();
        }
        catch (Exception $$4) {
            c.error("Could not parse RealmsServerPlayerList: {}", (Object)$$4.getMessage());
        }
        return $$1;
    }

    private static List<String> a(JsonArray $$0) {
        ArrayList $$1 = Lists.newArrayList();
        for (JsonElement $$2 : $$0) {
            try {
                $$1.add($$2.getAsString());
            }
            catch (Exception exception) {}
        }
        return $$1;
    }
}

