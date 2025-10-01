/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;

public class ejg
extends ekf {
    private static final Logger b = LogUtils.getLogger();
    public List<ejf> a;

    public static ejg a(String $$0) {
        JsonParser $$1 = new JsonParser();
        ejg $$2 = new ejg();
        $$2.a = Lists.newArrayList();
        try {
            JsonElement $$3 = $$1.parse($$0).getAsJsonObject().get("backups");
            if ($$3.isJsonArray()) {
                Iterator $$4 = $$3.getAsJsonArray().iterator();
                while ($$4.hasNext()) {
                    $$2.a.add(ejf.a((JsonElement)$$4.next()));
                }
            }
        }
        catch (Exception $$5) {
            b.error("Could not parse BackupList: {}", (Object)$$5.getMessage());
        }
        return $$2;
    }
}

