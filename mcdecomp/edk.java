/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class edk
implements edn {
    final dzk.b a;

    edk(dzk.b $$0) {
        this.a = $$0;
    }

    public static edn a(dzk.b $$0) {
        return new edk($$0);
    }

    @Override
    public edm a() {
        return edo.b;
    }

    @Override
    @Nullable
    public String a(dzk $$0) {
        bfj $$1 = $$0.c(this.a.a());
        return $$1 != null ? $$1.cv() : null;
    }

    @Override
    public Set<ebt<?>> b() {
        return ImmutableSet.of(this.a.a());
    }

    public static class a
    implements dzi.b<edk> {
        @Override
        public JsonElement a(edk $$0, JsonSerializationContext $$1) {
            return $$1.serialize((Object)$$0.a);
        }

        public edk b(JsonElement $$0, JsonDeserializationContext $$1) {
            dzk.b $$2 = (dzk.b)((Object)$$1.deserialize($$0, dzk.b.class));
            return new edk($$2);
        }

        @Override
        public /* synthetic */ Object a(JsonElement jsonElement, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonElement, jsonDeserializationContext);
        }
    }

    public static class b
    implements dzt<edk> {
        @Override
        public void a(JsonObject $$0, edk $$1, JsonSerializationContext $$2) {
            $$0.addProperty("target", $$1.a.name());
        }

        public edk b(JsonObject $$0, JsonDeserializationContext $$1) {
            dzk.b $$2 = aor.a($$0, "target", $$1, dzk.b.class);
            return new edk($$2);
        }

        @Override
        public /* synthetic */ Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonObject, jsonDeserializationContext);
        }
    }
}

