/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.datafixers.util.Pair
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.util.Pair;
import java.lang.reflect.Type;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dzi {
    public static <E, T extends dzu<E>> a<E, T> a(hr<T> $$0, String $$1, String $$2, Function<E, T> $$3) {
        return new a<E, T>($$0, $$1, $$2, $$3);
    }

    public static class a<E, T extends dzu<E>> {
        private final hr<T> a;
        private final String b;
        private final String c;
        private final Function<E, T> d;
        @Nullable
        private Pair<T, b<? extends E>> e;
        @Nullable
        private T f;

        a(hr<T> $$0, String $$1, String $$2, Function<E, T> $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public a<E, T> a(T $$0, b<? extends E> $$1) {
            this.e = Pair.of($$0, $$1);
            return this;
        }

        public a<E, T> a(T $$0) {
            this.f = $$0;
            return this;
        }

        public Object a() {
            return new c<E, T>(this.a, this.b, this.c, this.d, this.f, this.e);
        }
    }

    public static interface b<T> {
        public JsonElement a(T var1, JsonSerializationContext var2);

        public T a(JsonElement var1, JsonDeserializationContext var2);
    }

    static class c<E, T extends dzu<E>>
    implements JsonDeserializer<E>,
    JsonSerializer<E> {
        private final hr<T> a;
        private final String b;
        private final String c;
        private final Function<E, T> d;
        @Nullable
        private final T e;
        @Nullable
        private final Pair<T, b<? extends E>> f;

        c(hr<T> $$0, String $$1, String $$2, Function<E, T> $$3, @Nullable T $$4, @Nullable Pair<T, b<? extends E>> $$5) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
        }

        public E deserialize(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            if ($$0.isJsonObject()) {
                dzu $$7;
                JsonObject $$3 = aor.m($$0, this.b);
                String $$4 = aor.a($$3, this.c, "");
                if ($$4.isEmpty()) {
                    T $$5 = this.e;
                } else {
                    acq $$6 = new acq($$4);
                    $$7 = (dzu)this.a.a($$6);
                }
                if ($$7 == null) {
                    throw new JsonSyntaxException("Unknown type '" + $$4 + "'");
                }
                return (E)$$7.a().a($$3, $$2);
            }
            if (this.f == null) {
                throw new UnsupportedOperationException("Object " + $$0 + " can't be deserialized");
            }
            return (E)((b)this.f.getSecond()).a($$0, $$2);
        }

        public JsonElement serialize(E $$0, Type $$1, JsonSerializationContext $$2) {
            dzu $$3 = (dzu)this.d.apply($$0);
            if (this.f != null && this.f.getFirst() == $$3) {
                return ((b)this.f.getSecond()).a($$0, $$2);
            }
            if ($$3 == null) {
                throw new JsonSyntaxException("Unknown type: " + $$0);
            }
            JsonObject $$4 = new JsonObject();
            $$4.addProperty(this.c, this.a.b($$3).toString());
            $$3.a().a($$4, $$0, $$2);
            return $$4;
        }
    }
}

