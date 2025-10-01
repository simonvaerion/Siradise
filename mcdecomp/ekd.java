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

public class ekd
extends ekf {
    private static final Logger d = LogUtils.getLogger();
    public long a;
    public int b;
    public a c = ekd$a.a;

    public static ekd a(String $$0) {
        ekd $$1 = new ekd();
        try {
            JsonParser $$2 = new JsonParser();
            JsonObject $$3 = $$2.parse($$0).getAsJsonObject();
            $$1.a = emb.a("startDate", $$3, 0L);
            $$1.b = emb.a("daysLeft", $$3, 0);
            $$1.c = ekd.b(emb.a("subscriptionType", $$3, ekd$a.a.name()));
        }
        catch (Exception $$4) {
            d.error("Could not parse Subscription: {}", (Object)$$4.getMessage());
        }
        return $$1;
    }

    private static a b(String $$0) {
        try {
            return ekd$a.valueOf($$0);
        }
        catch (Exception $$1) {
            return ekd$a.a;
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = ekd$a.a();
        }
    }
}

