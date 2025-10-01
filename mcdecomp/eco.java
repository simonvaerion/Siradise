/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class eco
implements eck {
    static final eco a = new eco();

    private eco() {
    }

    @Override
    public ecl b() {
        return ecm.g;
    }

    @Override
    public Set<ebt<?>> a() {
        return ImmutableSet.of(ebw.b);
    }

    public boolean a(dzk $$0) {
        return $$0.a(ebw.b);
    }

    public static eck.a c() {
        return () -> a;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((dzk)object);
    }

    public static class a
    implements dzt<eco> {
        @Override
        public void a(JsonObject $$0, eco $$1, JsonSerializationContext $$2) {
        }

        public eco b(JsonObject $$0, JsonDeserializationContext $$1) {
            return a;
        }

        @Override
        public /* synthetic */ Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonObject, jsonDeserializationContext);
        }
    }
}

