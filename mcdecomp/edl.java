/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class edl
implements edn {
    final String a;

    edl(String $$0) {
        this.a = $$0;
    }

    public static edn a(String $$0) {
        return new edl($$0);
    }

    @Override
    public edm a() {
        return edo.a;
    }

    public String c() {
        return this.a;
    }

    @Override
    @Nullable
    public String a(dzk $$0) {
        return this.a;
    }

    @Override
    public Set<ebt<?>> b() {
        return ImmutableSet.of();
    }

    public static class a
    implements dzt<edl> {
        @Override
        public void a(JsonObject $$0, edl $$1, JsonSerializationContext $$2) {
            $$0.addProperty("name", $$1.a);
        }

        public edl b(JsonObject $$0, JsonDeserializationContext $$1) {
            String $$2 = aor.i($$0, "name");
            return new edl($$2);
        }

        @Override
        public /* synthetic */ Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonObject, jsonDeserializationContext);
        }
    }
}

