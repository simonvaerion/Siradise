/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.net.Proxy;
import javax.annotation.Nullable;

public class eja {
    @Nullable
    private static Proxy a;

    @Nullable
    public static Proxy a() {
        return a;
    }

    public static void a(Proxy $$0) {
        if (a == null) {
            a = $$0;
        }
    }
}

