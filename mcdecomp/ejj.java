/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Date;
import org.slf4j.Logger;

public class ejj
extends ekf {
    private static final Logger f = LogUtils.getLogger();
    public String a;
    public String b;
    public String c;
    public String d;
    public Date e;

    public static ejj a(JsonObject $$0) {
        ejj $$1 = new ejj();
        try {
            $$1.a = emb.a("invitationId", $$0, "");
            $$1.b = emb.a("worldName", $$0, "");
            $$1.c = emb.a("worldOwnerName", $$0, "");
            $$1.d = emb.a("worldOwnerUuid", $$0, "");
            $$1.e = emb.b("date", $$0);
        }
        catch (Exception $$2) {
            f.error("Could not parse PendingInvite: {}", (Object)$$2.getMessage());
        }
        return $$1;
    }
}

