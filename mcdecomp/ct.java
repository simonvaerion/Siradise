/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 */
import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class ct {
    public static final ct a = new ct();
    private final Gson b = dzh.a().create();

    public final JsonElement a(eck[] $$0) {
        return this.b.toJsonTree((Object)$$0);
    }
}

