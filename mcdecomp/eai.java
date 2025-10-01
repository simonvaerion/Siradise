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
import java.util.function.Consumer;

public class eai
extends eah {
    final acq i;

    eai(acq $$0, int $$1, int $$2, eck[] $$3, eaz[] $$4) {
        super($$1, $$2, $$3, $$4);
        this.i = $$0;
    }

    @Override
    public eag a() {
        return ead.c;
    }

    @Override
    public void a(Consumer<cfz> $$0, dzk $$1) {
        dzs $$2 = $$1.a().getLootTable(this.i);
        $$2.a($$1, $$0);
    }

    @Override
    public void a(dzv $$0) {
        dzm<dzs> $$1 = new dzm<dzs>(dzp.c, this.i);
        if ($$0.a($$1)) {
            $$0.a("Table " + this.i + " is recursively called");
            return;
        }
        super.a($$0);
        $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.i + "}", $$1)), () -> $$0.a("Unknown loot table called " + this.i));
    }

    public static eah.a<?> a(acq $$0) {
        return eai.a((int $$1, int $$2, eck[] $$3, eaz[] $$4) -> new eai($$0, $$1, $$2, $$3, $$4));
    }

    public static class a
    extends eah.e<eai> {
        @Override
        public void a(JsonObject $$0, eai $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            $$0.addProperty("name", $$1.i.toString());
        }

        protected eai a(JsonObject $$0, JsonDeserializationContext $$1, int $$2, int $$3, eck[] $$4, eaz[] $$5) {
            acq $$6 = new acq(aor.i($$0, "name"));
            return new eai($$6, $$2, $$3, $$4, $$5);
        }

        @Override
        protected /* synthetic */ eah b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, int n2, int n3, eck[] eckArray, eaz[] eazArray) {
            return this.a(jsonObject, jsonDeserializationContext, n2, n3, eckArray, eazArray);
        }
    }
}

