/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;

public class ejp {
    private static final Logger a = LogUtils.getLogger();
    private static final String b = "notificationUuid";
    private static final String c = "dismissable";
    private static final String d = "seen";
    private static final String e = "type";
    private static final String f = "visitUrl";
    final UUID g;
    final boolean h;
    final boolean i;
    final String j;

    ejp(UUID $$0, boolean $$1, boolean $$2, String $$3) {
        this.g = $$0;
        this.h = $$1;
        this.i = $$2;
        this.j = $$3;
    }

    public boolean a() {
        return this.i;
    }

    public boolean b() {
        return this.h;
    }

    public UUID c() {
        return this.g;
    }

    public static List<ejp> a(String $$0) {
        ArrayList<ejp> $$1 = new ArrayList<ejp>();
        try {
            JsonArray $$2 = JsonParser.parseString((String)$$0).getAsJsonObject().get("notifications").getAsJsonArray();
            for (JsonElement $$3 : $$2) {
                $$1.add(ejp.a($$3.getAsJsonObject()));
            }
        }
        catch (Exception $$4) {
            a.error("Could not parse list of RealmsNotifications", (Throwable)$$4);
        }
        return $$1;
    }

    private static ejp a(JsonObject $$0) {
        UUID $$1 = emb.a(b, $$0, null);
        if ($$1 == null) {
            throw new IllegalStateException("Missing required property notificationUuid");
        }
        boolean $$2 = emb.a(c, $$0, true);
        boolean $$3 = emb.a(d, $$0, false);
        String $$4 = emb.a(e, $$0);
        ejp $$5 = new ejp($$1, $$2, $$3, $$4);
        if (f.equals($$4)) {
            return ejp$a.a($$5, $$0);
        }
        return $$5;
    }

    public static class a
    extends ejp {
        private static final String a = "url";
        private static final String b = "buttonText";
        private static final String c = "message";
        private final String d;
        private final ejw e;
        private final ejw f;

        private a(ejp $$0, String $$1, ejw $$2, ejw $$3) {
            super($$0.g, $$0.h, $$0.i, $$0.j);
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
        }

        public static a a(ejp $$0, JsonObject $$1) {
            String $$2 = emb.a(a, $$1);
            ejw $$3 = emb.a(b, $$1, ejw::a);
            ejw $$4 = emb.a(c, $$1, ejw::a);
            return new a($$0, $$2, $$3, $$4);
        }

        public sw d() {
            return this.f.a(sw.c("mco.notification.visitUrl.message.default"));
        }

        public epi a(euq $$0) {
            sw $$1 = this.e.a(sw.c("mco.notification.visitUrl.buttonText.default"));
            return epi.a($$1, etj.b(this.d, $$0, true)).a();
        }
    }
}

