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
import java.util.Set;

public class ech
implements eck {
    final eck a;

    ech(eck $$0) {
        this.a = $$0;
    }

    @Override
    public ecl b() {
        return ecm.a;
    }

    public final boolean a(dzk $$0) {
        return !this.a.test($$0);
    }

    @Override
    public Set<ebt<?>> a() {
        return this.a.a();
    }

    @Override
    public void a(dzv $$0) {
        eck.super.a($$0);
        this.a.a($$0);
    }

    public static eck.a a(eck.a $$0) {
        ech $$1 = new ech($$0.build());
        return () -> $$1;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((dzk)object);
    }

    public static class a
    implements dzt<ech> {
        @Override
        public void a(JsonObject $$0, ech $$1, JsonSerializationContext $$2) {
            $$0.add("term", $$2.serialize((Object)$$1.a));
        }

        public ech b(JsonObject $$0, JsonDeserializationContext $$1) {
            eck $$2 = aor.a($$0, "term", $$1, eck.class);
            return new ech($$2);
        }

        @Override
        public /* synthetic */ Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonObject, jsonDeserializationContext);
        }
    }
}

