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

public class edh
implements edf {
    final edn a;
    final String b;
    final float c;

    edh(edn $$0, String $$1, float $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    @Override
    public ede b() {
        return edg.d;
    }

    @Override
    public Set<ebt<?>> a() {
        return this.a.b();
    }

    public static edh a(dzk.b $$0, String $$1) {
        return edh.a($$0, $$1, 1.0f);
    }

    public static edh a(dzk.b $$0, String $$1, float $$2) {
        return new edh(edk.a($$0), $$1, $$2);
    }

    @Override
    public float b(dzk $$0) {
        String $$1 = this.a.a($$0);
        if ($$1 == null) {
            return 0.0f;
        }
        adg $$2 = $$0.d().f();
        efd $$3 = $$2.d(this.b);
        if ($$3 == null) {
            return 0.0f;
        }
        if (!$$2.b($$1, $$3)) {
            return 0.0f;
        }
        return (float)$$2.c($$1, $$3).b() * this.c;
    }

    public static class a
    implements dzt<edh> {
        public edh b(JsonObject $$0, JsonDeserializationContext $$1) {
            String $$2 = aor.i($$0, "score");
            float $$3 = aor.a($$0, "scale", 1.0f);
            edn $$4 = aor.a($$0, "target", $$1, edn.class);
            return new edh($$4, $$2, $$3);
        }

        @Override
        public void a(JsonObject $$0, edh $$1, JsonSerializationContext $$2) {
            $$0.addProperty("score", $$1.b);
            $$0.add("target", $$2.serialize((Object)$$1.a));
            $$0.addProperty("scale", (Number)Float.valueOf($$1.c));
        }

        @Override
        public /* synthetic */ Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonObject, jsonDeserializationContext);
        }
    }
}

