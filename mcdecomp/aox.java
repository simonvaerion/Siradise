/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.TypeAdapter
 *  com.google.gson.TypeAdapterFactory
 *  com.google.gson.reflect.TypeToken
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonToken
 *  com.google.gson.stream.JsonWriter
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import javax.annotation.Nullable;

public class aox
implements TypeAdapterFactory {
    @Nullable
    public <T> TypeAdapter<T> create(Gson $$0, TypeToken<T> $$1) {
        Class $$2 = $$1.getRawType();
        if (!$$2.isEnum()) {
            return null;
        }
        final HashMap $$3 = Maps.newHashMap();
        for (Object $$4 : $$2.getEnumConstants()) {
            $$3.put(this.a($$4), $$4);
        }
        return new TypeAdapter<T>(){

            public void write(JsonWriter $$0, T $$1) throws IOException {
                if ($$1 == null) {
                    $$0.nullValue();
                } else {
                    $$0.value(aox.this.a($$1));
                }
            }

            @Nullable
            public T read(JsonReader $$0) throws IOException {
                if ($$0.peek() == JsonToken.NULL) {
                    $$0.nextNull();
                    return null;
                }
                return $$3.get($$0.nextString());
            }
        };
    }

    String a(Object $$0) {
        if ($$0 instanceof Enum) {
            return ((Enum)$$0).name().toLowerCase(Locale.ROOT);
        }
        return $$0.toString().toLowerCase(Locale.ROOT);
    }
}

