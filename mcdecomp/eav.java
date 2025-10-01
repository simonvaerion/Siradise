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

public class eav
extends eay {
    private static final Logger a = LogUtils.getLogger();
    final acq b;

    eav(eck[] $$0, acq $$1) {
        super($$0);
        this.b = $$1;
    }

    @Override
    public eba b() {
        return ebb.A;
    }

    @Override
    public void a(dzv $$0) {
        dzm<eaz> $$1 = new dzm<eaz>(dzp.b, this.b);
        if ($$0.a($$1)) {
            $$0.a("Function " + this.b + " is recursively called");
            return;
        }
        super.a($$0);
        $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.a("Unknown function table called " + this.b));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected cfz a(cfz $$0, dzk $$1) {
        eaz $$2 = $$1.a().getElement(dzp.b, this.b);
        if ($$2 == null) {
            a.warn("Unknown function: {}", (Object)this.b);
            return $$0;
        }
        dzk.c<eaz> $$3 = dzk.a($$2);
        if ($$1.b($$3)) {
            try {
                cfz cfz2 = (cfz)$$2.apply($$0, $$1);
                return cfz2;
            }
            finally {
                $$1.c($$3);
            }
        }
        a.warn("Detected infinite loop in loot tables");
        return $$0;
    }

    public static eay.a<?> a(acq $$0) {
        return eav.a((eck[] $$1) -> new eav((eck[])$$1, $$0));
    }

    public static class a
    extends eay.c<eav> {
        @Override
        public void a(JsonObject $$0, eav $$1, JsonSerializationContext $$2) {
            $$0.addProperty("name", $$1.b.toString());
        }

        public eav a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            acq $$3 = new acq(aor.i($$0, "name"));
            return new eav($$2, $$3);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

