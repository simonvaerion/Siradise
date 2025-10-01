/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class ejw {
    private static final String a = "translationKey";
    private static final String b = "args";
    private final String c;
    @Nullable
    private final Object[] d;

    private ejw(String $$0, @Nullable Object[] $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public sw a(sw $$0) {
        if (!fvz.a(this.c)) {
            return $$0;
        }
        if (this.d == null) {
            return sw.c(this.c);
        }
        return sw.a(this.c, this.d);
    }

    public static ejw a(JsonObject $$0) {
        String[] $$5;
        String $$1 = emb.a(a, $$0);
        JsonElement $$2 = $$0.get(b);
        if ($$2 == null || $$2.isJsonNull()) {
            Object $$3 = null;
        } else {
            JsonArray $$4 = $$2.getAsJsonArray();
            $$5 = new String[$$4.size()];
            for (int $$6 = 0; $$6 < $$4.size(); ++$$6) {
                $$5[$$6] = $$4.get($$6).getAsString();
            }
        }
        return new ejw($$1, $$5);
    }
}

