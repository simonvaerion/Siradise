/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;

public class ejk
extends ekf {
    private static final Logger b = LogUtils.getLogger();
    public List<ejj> a = Lists.newArrayList();

    public static ejk a(String $$0) {
        ejk $$1 = new ejk();
        try {
            JsonParser $$2 = new JsonParser();
            JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
            if ($$3.get("invites").isJsonArray()) {
                Iterator $$4 = $$3.get("invites").getAsJsonArray().iterator();
                while ($$4.hasNext()) {
                    $$1.a.add(ejj.a(((JsonElement)$$4.next()).getAsJsonObject()));
                }
            }
        }
        catch (Exception $$5) {
            b.error("Could not parse PendingInvitesList: {}", (Object)$$5.getMessage());
        }
        return $$1;
    }
}

