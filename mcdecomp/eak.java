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

public class eak
extends eah {
    final anl<cfu> i;
    final boolean j;

    eak(anl<cfu> $$0, boolean $$1, int $$2, int $$3, eck[] $$4, eaz[] $$5) {
        super($$2, $$3, $$4, $$5);
        this.i = $$0;
        this.j = $$1;
    }

    @Override
    public eag a() {
        return ead.e;
    }

    @Override
    public void a(Consumer<cfz> $$0, dzk $$12) {
        jb.i.c(this.i).forEach($$1 -> $$0.accept(new cfz((he<cfu>)$$1)));
    }

    private boolean a(dzk $$0, Consumer<eae> $$1) {
        if (this.a($$0)) {
            for (final he<cfu> $$2 : jb.i.c(this.i)) {
                $$1.accept(new eah.c(){

                    @Override
                    public void a(Consumer<cfz> $$0, dzk $$1) {
                        $$0.accept(new cfz($$2));
                    }
                });
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean expand(dzk $$0, Consumer<eae> $$1) {
        if (this.j) {
            return this.a($$0, $$1);
        }
        return super.expand($$0, $$1);
    }

    public static eah.a<?> a(anl<cfu> $$0) {
        return eak.a((int $$1, int $$2, eck[] $$3, eaz[] $$4) -> new eak($$0, false, $$1, $$2, $$3, $$4));
    }

    public static eah.a<?> b(anl<cfu> $$0) {
        return eak.a((int $$1, int $$2, eck[] $$3, eaz[] $$4) -> new eak($$0, true, $$1, $$2, $$3, $$4));
    }

    public static class a
    extends eah.e<eak> {
        @Override
        public void a(JsonObject $$0, eak $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            $$0.addProperty("name", $$1.i.b().toString());
            $$0.addProperty("expand", Boolean.valueOf($$1.j));
        }

        protected eak a(JsonObject $$0, JsonDeserializationContext $$1, int $$2, int $$3, eck[] $$4, eaz[] $$5) {
            acq $$6 = new acq(aor.i($$0, "name"));
            anl<cfu> $$7 = anl.a(jc.D, $$6);
            boolean $$8 = aor.k($$0, "expand");
            return new eak($$7, $$8, $$2, $$3, $$4, $$5);
        }

        @Override
        protected /* synthetic */ eah b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, int n2, int n3, eck[] eckArray, eaz[] eazArray) {
            return this.a(jsonObject, jsonDeserializationContext, n2, n3, eckArray, eazArray);
        }
    }
}

