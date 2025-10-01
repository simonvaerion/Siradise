/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Streams
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Streams;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class fll {
    private final flh a;
    private final fle b;

    public fll(flh $$0, fle $$1) {
        if ($$0 == null) {
            throw new IllegalArgumentException("Missing condition for selector");
        }
        if ($$1 == null) {
            throw new IllegalArgumentException("Missing variant for selector");
        }
        this.a = $$0;
        this.b = $$1;
    }

    public fle a() {
        return this.b;
    }

    public Predicate<dcb> a(dcc<cpn, dcb> $$0) {
        return this.a.getPredicate($$0);
    }

    public boolean equals(Object $$0) {
        return this == $$0;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public static class a
    implements JsonDeserializer<fll> {
        public fll a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            JsonObject $$3 = $$0.getAsJsonObject();
            return new fll(this.b($$3), (fle)$$2.deserialize($$3.get("apply"), fle.class));
        }

        private flh b(JsonObject $$0) {
            if ($$0.has("when")) {
                return fll$a.a(aor.u($$0, "when"));
            }
            return flh.b;
        }

        @VisibleForTesting
        static flh a(JsonObject $$02) {
            Set $$1 = $$02.entrySet();
            if ($$1.isEmpty()) {
                throw new JsonParseException("No elements found in selector");
            }
            if ($$1.size() == 1) {
                if ($$02.has("OR")) {
                    List $$2 = Streams.stream((Iterable)aor.v($$02, "OR")).map($$0 -> fll$a.a($$0.getAsJsonObject())).collect(Collectors.toList());
                    return new flk($$2);
                }
                if ($$02.has("AND")) {
                    List $$3 = Streams.stream((Iterable)aor.v($$02, "AND")).map($$0 -> fll$a.a($$0.getAsJsonObject())).collect(Collectors.toList());
                    return new flg($$3);
                }
                return fll$a.a((Map.Entry)$$1.iterator().next());
            }
            return new flg($$1.stream().map(a::a).collect(Collectors.toList()));
        }

        private static flh a(Map.Entry<String, JsonElement> $$0) {
            return new fli($$0.getKey(), $$0.getValue().getAsString());
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

