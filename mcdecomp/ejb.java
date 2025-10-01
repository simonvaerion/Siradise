/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Strings;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ejb {
    private static final Logger a = LogUtils.getLogger();
    private final String b;
    private final int c;

    private ejb(String $$0, int $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Nullable
    public static ejb a(String $$0) {
        if (Strings.isNullOrEmpty((String)$$0)) {
            return null;
        }
        try {
            JsonObject $$1 = JsonParser.parseString((String)$$0).getAsJsonObject();
            String $$2 = emb.a("errorMsg", $$1, "");
            int $$3 = emb.a("errorCode", $$1, -1);
            return new ejb($$2, $$3);
        }
        catch (Exception $$4) {
            a.error("Could not parse RealmsError: {}", (Object)$$4.getMessage());
            a.error("The error was: {}", (Object)$$0);
            return null;
        }
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }
}

