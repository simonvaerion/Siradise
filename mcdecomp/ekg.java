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

public class ekg
extends ekf {
    private static final Logger d = LogUtils.getLogger();
    public String a;
    public String b;
    public String c;

    public static ekg a(String $$0) {
        JsonParser $$1 = new JsonParser();
        JsonObject $$2 = $$1.parse($$0).getAsJsonObject();
        ekg $$3 = new ekg();
        try {
            $$3.a = emb.a("downloadLink", $$2, "");
            $$3.b = emb.a("resourcePackUrl", $$2, "");
            $$3.c = emb.a("resourcePackHash", $$2, "");
        }
        catch (Exception $$4) {
            d.error("Could not parse WorldDownload: {}", (Object)$$4.getMessage());
        }
        return $$3;
    }
}

