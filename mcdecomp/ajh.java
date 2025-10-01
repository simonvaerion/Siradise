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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ajh
implements ajl {
    private static final Logger a = LogUtils.getLogger();
    private final String d;
    private final boolean e;

    protected ajh(String $$0, boolean $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    @Nullable
    public <T> T a(ajx<T> $$0) throws IOException {
        akp<InputStream> $$1 = this.a("pack.mcmeta");
        if ($$1 == null) {
            return null;
        }
        try (InputStream $$2 = $$1.get();){
            T t2 = ajh.a($$0, $$2);
            return t2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public static <T> T a(ajx<T> $$0, InputStream $$1) {
        void $$6;
        try (BufferedReader $$2 = new BufferedReader(new InputStreamReader($$1, StandardCharsets.UTF_8));){
            JsonObject $$3 = aor.a($$2);
        }
        catch (Exception $$5) {
            a.error("Couldn't load {} metadata", (Object)$$0.a(), (Object)$$5);
            return null;
        }
        if (!$$6.has($$0.a())) {
            return null;
        }
        try {
            return $$0.a(aor.u((JsonObject)$$6, $$0.a()));
        }
        catch (Exception $$7) {
            a.error("Couldn't load {} metadata", (Object)$$0.a(), (Object)$$7);
            return null;
        }
    }

    @Override
    public String a() {
        return this.d;
    }

    @Override
    public boolean b() {
        return this.e;
    }
}

