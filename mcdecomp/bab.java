/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  com.google.gson.stream.JsonReader
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import javax.annotation.Nullable;

public interface bab<T>
extends Closeable {
    public static <T> bab<T> a(final Codec<T> $$0, Reader $$1) {
        final JsonReader $$2 = new JsonReader($$1);
        $$2.setLenient(true);
        return new bab<T>(){

            @Override
            @Nullable
            public T a() throws IOException {
                try {
                    if (!$$2.hasNext()) {
                        return null;
                    }
                    JsonElement $$02 = JsonParser.parseReader((JsonReader)$$2);
                    return ac.a($$0.parse((DynamicOps)JsonOps.INSTANCE, (Object)$$02), IOException::new);
                }
                catch (JsonParseException $$1) {
                    throw new IOException($$1);
                }
                catch (EOFException $$22) {
                    return null;
                }
            }

            @Override
            public void close() throws IOException {
                $$2.close();
            }
        };
    }

    @Nullable
    public T a() throws IOException;
}

