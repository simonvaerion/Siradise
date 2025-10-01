/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;

public class ejf
extends ekf {
    private static final Logger f = LogUtils.getLogger();
    public String a;
    public Date b;
    public long c;
    private boolean g;
    public Map<String, String> d = Maps.newHashMap();
    public Map<String, String> e = Maps.newHashMap();

    public static ejf a(JsonElement $$0) {
        JsonObject $$1 = $$0.getAsJsonObject();
        ejf $$2 = new ejf();
        try {
            $$2.a = emb.a("backupId", $$1, "");
            $$2.b = emb.b("lastModifiedDate", $$1);
            $$2.c = emb.a("size", $$1, 0L);
            if ($$1.has("metadata")) {
                JsonObject $$3 = $$1.getAsJsonObject("metadata");
                Set $$4 = $$3.entrySet();
                for (Map.Entry $$5 : $$4) {
                    if (((JsonElement)$$5.getValue()).isJsonNull()) continue;
                    $$2.d.put((String)$$5.getKey(), ((JsonElement)$$5.getValue()).getAsString());
                }
            }
        }
        catch (Exception $$6) {
            f.error("Could not parse Backup: {}", (Object)$$6.getMessage());
        }
        return $$2;
    }

    public boolean a() {
        return this.g;
    }

    public void a(boolean $$0) {
        this.g = $$0;
    }
}

