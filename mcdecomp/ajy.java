/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;

public interface ajy<T>
extends ajx<T> {
    public JsonObject a(T var1);

    public static <T> ajy<T> a(final String $$0, final Codec<T> $$1) {
        return new ajy<T>(){

            @Override
            public String a() {
                return $$0;
            }

            @Override
            public T a(JsonObject $$02) {
                return $$1.parse((DynamicOps)JsonOps.INSTANCE, (Object)$$02).getOrThrow(false, $$0 -> {});
            }

            @Override
            public JsonObject a(T $$02) {
                return ((JsonElement)$$1.encodeStart((DynamicOps)JsonOps.INSTANCE, $$02).getOrThrow(false, $$0 -> {})).getAsJsonObject();
            }
        };
    }
}

