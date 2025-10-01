/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;

public abstract class alb
extends alc<Map<acq, JsonElement>> {
    private static final Logger a = LogUtils.getLogger();
    private final Gson b;
    private final String c;

    public alb(Gson $$0, String $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    protected Map<acq, JsonElement> a(akx $$0, ban $$1) {
        HashMap<acq, JsonElement> $$2 = new HashMap<acq, JsonElement>();
        alb.a($$0, this.c, this.b, $$2);
        return $$2;
    }

    public static void a(akx $$0, String $$1, Gson $$2, Map<acq, JsonElement> $$3) {
        acj $$4 = acj.a($$1);
        for (Map.Entry<acq, akv> $$5 : $$4.a($$0).entrySet()) {
            acq $$6 = $$5.getKey();
            acq $$7 = $$4.b($$6);
            try {
                BufferedReader $$8 = $$5.getValue().e();
                try {
                    JsonElement $$9 = aor.a($$2, (Reader)$$8, JsonElement.class);
                    JsonElement $$10 = $$3.put($$7, $$9);
                    if ($$10 == null) continue;
                    throw new IllegalStateException("Duplicate data file ignored with ID " + $$7);
                }
                finally {
                    if ($$8 == null) continue;
                    ((Reader)$$8).close();
                }
            }
            catch (JsonParseException | IOException | IllegalArgumentException $$11) {
                a.error("Couldn't parse data file {} from {}", new Object[]{$$7, $$6, $$11});
            }
        }
    }

    @Override
    protected /* synthetic */ Object b(akx akx2, ban ban2) {
        return this.a(akx2, ban2);
    }
}

