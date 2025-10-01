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
import org.slf4j.Logger;

public class ecc
implements eck {
    private static final Logger a = LogUtils.getLogger();
    final acq b;

    ecc(acq $$0) {
        this.b = $$0;
    }

    @Override
    public ecl b() {
        return ecm.p;
    }

    @Override
    public void a(dzv $$0) {
        dzm<eck> $$1 = new dzm<eck>(dzp.a, this.b);
        if ($$0.a($$1)) {
            $$0.a("Condition " + this.b + " is recursively called");
            return;
        }
        eck.super.a($$0);
        $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.a("Unknown condition table called " + this.b));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(dzk $$0) {
        eck $$1 = $$0.a().getElement(dzp.a, this.b);
        if ($$1 == null) {
            a.warn("Tried using unknown condition table called {}", (Object)this.b);
            return false;
        }
        dzk.c<eck> $$2 = dzk.a($$1);
        if ($$0.b($$2)) {
            try {
                boolean bl2 = $$1.test($$0);
                return bl2;
            }
            finally {
                $$0.c($$2);
            }
        }
        a.warn("Detected infinite loop in loot tables");
        return false;
    }

    public static eck.a a(acq $$0) {
        return () -> new ecc($$0);
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((dzk)object);
    }

    public static class a
    implements dzt<ecc> {
        @Override
        public void a(JsonObject $$0, ecc $$1, JsonSerializationContext $$2) {
            $$0.addProperty("name", $$1.b.toString());
        }

        public ecc b(JsonObject $$0, JsonDeserializationContext $$1) {
            acq $$2 = new acq(aor.i($$0, "name"));
            return new ecc($$2);
        }

        @Override
        public /* synthetic */ Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return this.b(jsonObject, jsonDeserializationContext);
        }
    }
}

