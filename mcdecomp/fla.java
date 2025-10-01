/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class fla {
    private final acq a;
    private final List<b> b;

    public fla(acq $$0, List<b> $$1) {
        this.a = $$0;
        this.b = ImmutableList.copyOf($$1);
    }

    public acq a() {
        return this.a;
    }

    public Stream<b> b() {
        return this.b.stream();
    }

    public static class b {
        private final acq a;
        private final float b;

        public b(acq $$0, float $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public acq a() {
            return this.a;
        }

        public float b() {
            return this.b;
        }
    }

    protected static class a
    implements JsonDeserializer<fla> {
        protected a() {
        }

        public fla a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            JsonObject $$3 = $$0.getAsJsonObject();
            acq $$4 = new acq(aor.i($$3, "model"));
            List<b> $$5 = this.a($$3);
            return new fla($$4, $$5);
        }

        protected List<b> a(JsonObject $$02) {
            LinkedHashMap $$1 = Maps.newLinkedHashMap();
            JsonObject $$2 = aor.u($$02, "predicate");
            for (Map.Entry $$3 : $$2.entrySet()) {
                $$1.put(new acq((String)$$3.getKey()), Float.valueOf(aor.e((JsonElement)$$3.getValue(), (String)$$3.getKey())));
            }
            return (List)$$1.entrySet().stream().map($$0 -> new b((acq)$$0.getKey(), ((Float)$$0.getValue()).floatValue())).collect(ImmutableList.toImmutableList());
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

