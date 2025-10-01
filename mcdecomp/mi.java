/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class mi
implements mh.a {
    private static final Logger a = LogUtils.getLogger();

    @Override
    public qr apply(String $$0, qr $$1) {
        if ($$0.startsWith("data/minecraft/structures/")) {
            return mi.a($$0, $$1);
        }
        return $$1;
    }

    public static qr a(String $$0, qr $$1) {
        dvt $$2 = new dvt();
        int $$3 = rd.b($$1, 500);
        int $$4 = 3437;
        if ($$3 < 3437) {
            a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3437, $$0});
        }
        qr $$5 = aqc.f.a(aqd.a(), $$1, $$3);
        $$2.a(jb.f.p(), $$5);
        return $$2.a(new qr());
    }
}

