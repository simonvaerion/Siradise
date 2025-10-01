/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public interface dzt<T> {
    public void a(JsonObject var1, T var2, JsonSerializationContext var3);

    public T a(JsonObject var1, JsonDeserializationContext var2);
}

