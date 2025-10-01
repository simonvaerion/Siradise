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
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;

public class ejv
extends ekf {
    private static final Logger b = LogUtils.getLogger();
    public List<eju> a;

    public static ejv a(String $$0) {
        ejv $$1 = new ejv();
        $$1.a = Lists.newArrayList();
        try {
            JsonParser $$2 = new JsonParser();
            JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
            if ($$3.get("lists").isJsonArray()) {
                JsonArray $$4 = $$3.get("lists").getAsJsonArray();
                Iterator $$5 = $$4.iterator();
                while ($$5.hasNext()) {
                    $$1.a.add(eju.a(((JsonElement)$$5.next()).getAsJsonObject()));
                }
            }
        }
        catch (Exception $$6) {
            b.error("Could not parse RealmsServerPlayerLists: {}", (Object)$$6.getMessage());
        }
        return $$1;
    }
}

