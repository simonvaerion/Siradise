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

public class eax
extends eay {
    final dzj a;

    eax(eck[] $$0, dzj $$1) {
        super($$0);
        this.a = $$1;
    }

    @Override
    public eba b() {
        return ebb.p;
    }

    @Override
    public Set<ebt<?>> a() {
        return this.a.a();
    }

    @Override
    public cfz a(cfz $$0, dzk $$1) {
        int $$2 = this.a.a($$1, $$0.L());
        $$0.f($$2);
        return $$0;
    }

    public static eay.a<?> a(dzj $$0) {
        return eax.a((eck[] $$1) -> new eax((eck[])$$1, $$0));
    }

    public static class a
    extends eay.c<eax> {
        @Override
        public void a(JsonObject $$0, eax $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            $$0.add("limit", $$2.serialize((Object)$$1.a));
        }

        public eax a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            dzj $$3 = aor.a($$0, "limit", $$1, dzj.class);
            return new eax($$2, $$3);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

