/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.logging.LogUtils;
import java.util.Set;
import org.slf4j.Logger;

public class ebk
extends eay {
    private static final Logger a = LogUtils.getLogger();
    final edf b;
    final boolean c;

    ebk(eck[] $$0, edf $$1, boolean $$2) {
        super($$0);
        this.b = $$1;
        this.c = $$2;
    }

    @Override
    public eba b() {
        return ebb.i;
    }

    @Override
    public Set<ebt<?>> a() {
        return this.b.a();
    }

    @Override
    public cfz a(cfz $$0, dzk $$1) {
        if ($$0.i()) {
            int $$2 = $$0.l();
            float $$3 = this.c ? 1.0f - (float)$$0.k() / (float)$$2 : 0.0f;
            float $$4 = 1.0f - apa.a(this.b.b($$1) + $$3, 0.0f, 1.0f);
            $$0.b(apa.d($$4 * (float)$$2));
        } else {
            a.warn("Couldn't set damage of loot item {}", (Object)$$0);
        }
        return $$0;
    }

    public static eay.a<?> a(edf $$0) {
        return ebk.a((eck[] $$1) -> new ebk((eck[])$$1, $$0, false));
    }

    public static eay.a<?> a(edf $$0, boolean $$1) {
        return ebk.a((eck[] $$2) -> new ebk((eck[])$$2, $$0, $$1));
    }

    public static class a
    extends eay.c<ebk> {
        @Override
        public void a(JsonObject $$0, ebk $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            $$0.add("damage", $$2.serialize((Object)$$1.b));
            $$0.addProperty("add", Boolean.valueOf($$1.c));
        }

        public ebk a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            edf $$3 = aor.a($$0, "damage", $$1, edf.class);
            boolean $$4 = aor.a($$0, "add", false);
            return new ebk($$2, $$3, $$4);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

