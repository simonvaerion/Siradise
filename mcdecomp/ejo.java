/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ejo
extends ekf {
    private static final Logger b = LogUtils.getLogger();
    public String a;

    public static ejo a(String $$0) {
        ejo $$1 = new ejo();
        try {
            JsonParser $$2 = new JsonParser();
            JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
            $$1.a = emb.a("newsLink", $$3, null);
        }
        catch (Exception $$4) {
            b.error("Could not parse RealmsNews: {}", (Object)$$4.getMessage());
        }
        return $$1;
    }
}

