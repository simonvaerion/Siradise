/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  javax.annotation.Nullable
 */
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;

public class ejh {
    private final Gson a = new Gson();

    public String a(ejz $$0) {
        return this.a.toJson((Object)$$0);
    }

    public String a(JsonElement $$0) {
        return this.a.toJson($$0);
    }

    @Nullable
    public <T extends ejz> T a(String $$0, Class<T> $$1) {
        return (T)((ejz)this.a.fromJson($$0, $$1));
    }
}

