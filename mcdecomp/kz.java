/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class kz
implements Supplier<JsonElement> {
    private final Map<lb<?>, lb.a> a = Maps.newLinkedHashMap();

    public <T> kz a(lb<T> $$0, T $$1) {
        lb.a $$2 = this.a.put($$0, $$0.a($$1));
        if ($$2 != null) {
            throw new IllegalStateException("Replacing value of " + $$2 + " with " + $$1);
        }
        return this;
    }

    public static kz a() {
        return new kz();
    }

    public static kz a(kz $$0, kz $$1) {
        kz $$2 = new kz();
        $$2.a.putAll($$0.a);
        $$2.a.putAll($$1.a);
        return $$2;
    }

    public JsonElement b() {
        JsonObject $$0 = new JsonObject();
        this.a.values().forEach($$1 -> $$1.a($$0));
        return $$0;
    }

    public static JsonElement a(List<kz> $$0) {
        if ($$0.size() == 1) {
            return $$0.get(0).b();
        }
        JsonArray $$12 = new JsonArray();
        $$0.forEach($$1 -> $$12.add($$1.b()));
        return $$12;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.b();
    }
}

