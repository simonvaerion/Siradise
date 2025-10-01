/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;

public class dzj {
    @Nullable
    final edf a;
    @Nullable
    final edf b;
    private final b c;
    private final a d;

    public Set<ebt<?>> a() {
        ImmutableSet.Builder $$0 = ImmutableSet.builder();
        if (this.a != null) {
            $$0.addAll(this.a.a());
        }
        if (this.b != null) {
            $$0.addAll(this.b.a());
        }
        return $$0.build();
    }

    dzj(@Nullable edf $$02, @Nullable edf $$12) {
        this.a = $$02;
        this.b = $$12;
        if ($$02 == null) {
            if ($$12 == null) {
                this.c = ($$0, $$1) -> $$1;
                this.d = ($$0, $$1) -> true;
            } else {
                this.c = ($$1, $$2) -> Math.min($$12.a($$1), $$2);
                this.d = ($$1, $$2) -> $$2 <= $$12.a($$1);
            }
        } else if ($$12 == null) {
            this.c = ($$1, $$2) -> Math.max($$02.a($$1), $$2);
            this.d = ($$1, $$2) -> $$2 >= $$02.a($$1);
        } else {
            this.c = ($$2, $$3) -> apa.a($$3, $$02.a($$2), $$12.a($$2));
            this.d = ($$2, $$3) -> $$3 >= $$02.a($$2) && $$3 <= $$12.a($$2);
        }
    }

    public static dzj a(int $$0) {
        edd $$1 = edd.a($$0);
        return new dzj($$1, $$1);
    }

    public static dzj a(int $$0, int $$1) {
        return new dzj(edd.a($$0), edd.a($$1));
    }

    public static dzj b(int $$0) {
        return new dzj(edd.a($$0), null);
    }

    public static dzj c(int $$0) {
        return new dzj(null, edd.a($$0));
    }

    public int a(dzk $$0, int $$1) {
        return this.c.apply($$0, $$1);
    }

    public boolean b(dzk $$0, int $$1) {
        return this.d.test($$0, $$1);
    }

    @FunctionalInterface
    static interface b {
        public int apply(dzk var1, int var2);
    }

    @FunctionalInterface
    static interface a {
        public boolean test(dzk var1, int var2);
    }

    public static class c
    implements JsonDeserializer<dzj>,
    JsonSerializer<dzj> {
        public dzj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) {
            if ($$0.isJsonPrimitive()) {
                return dzj.a($$0.getAsInt());
            }
            JsonObject $$3 = aor.m($$0, "value");
            edf $$4 = $$3.has("min") ? aor.a($$3, "min", $$2, edf.class) : null;
            edf $$5 = $$3.has("max") ? aor.a($$3, "max", $$2, edf.class) : null;
            return new dzj($$4, $$5);
        }

        public JsonElement a(dzj $$0, Type $$1, JsonSerializationContext $$2) {
            JsonObject $$3 = new JsonObject();
            if (Objects.equals($$0.b, $$0.a)) {
                return $$2.serialize((Object)$$0.a);
            }
            if ($$0.b != null) {
                $$3.add("max", $$2.serialize((Object)$$0.b));
            }
            if ($$0.a != null) {
                $$3.add("min", $$2.serialize((Object)$$0.a));
            }
            return $$3;
        }

        public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
            return this.a((dzj)object, type, jsonSerializationContext);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

