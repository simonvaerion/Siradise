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

public class ebj
extends eay {
    final edf a;
    final boolean b;

    ebj(eck[] $$0, edf $$1, boolean $$2) {
        super($$0);
        this.a = $$1;
        this.b = $$2;
    }

    @Override
    public eba b() {
        return ebb.b;
    }

    @Override
    public Set<ebt<?>> a() {
        return this.a.a();
    }

    @Override
    public cfz a(cfz $$0, dzk $$1) {
        int $$2 = this.b ? $$0.L() : 0;
        $$0.f(apa.a($$2 + this.a.a($$1), 0, $$0.g()));
        return $$0;
    }

    public static eay.a<?> a(edf $$0) {
        return ebj.a((eck[] $$1) -> new ebj((eck[])$$1, $$0, false));
    }

    public static eay.a<?> a(edf $$0, boolean $$1) {
        return ebj.a((eck[] $$2) -> new ebj((eck[])$$2, $$0, $$1));
    }

    public static class a
    extends eay.c<ebj> {
        @Override
        public void a(JsonObject $$0, ebj $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            $$0.add("count", $$2.serialize((Object)$$1.a));
            $$0.addProperty("add", Boolean.valueOf($$1.b));
        }

        public ebj a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            edf $$3 = aor.a($$0, "count", $$1, edf.class);
            boolean $$4 = aor.a($$0, "add", false);
            return new ebj($$2, $$3, $$4);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

