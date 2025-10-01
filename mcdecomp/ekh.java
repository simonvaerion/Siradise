/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ekh
extends ekf {
    private static final Logger j = LogUtils.getLogger();
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    @Nullable
    public String f;
    public String g = "";
    public String h = "";
    public a i = ekh$a.a;

    public static ekh a(JsonObject $$0) {
        ekh $$1 = new ekh();
        try {
            $$1.a = emb.a("id", $$0, "");
            $$1.b = emb.a("name", $$0, "");
            $$1.c = emb.a("version", $$0, "");
            $$1.d = emb.a("author", $$0, "");
            $$1.e = emb.a("link", $$0, "");
            $$1.f = emb.a("image", $$0, null);
            $$1.g = emb.a("trailer", $$0, "");
            $$1.h = emb.a("recommendedPlayers", $$0, "");
            $$1.i = ekh$a.valueOf(emb.a("type", $$0, ekh$a.a.name()));
        }
        catch (Exception $$2) {
            j.error("Could not parse WorldTemplate: {}", (Object)$$2.getMessage());
        }
        return $$1;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e};
        }

        static {
            f = ekh$a.a();
        }
    }
}

