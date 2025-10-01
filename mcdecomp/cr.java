/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cr
extends cv<a> {
    static final acq a = new acq("recipe_crafted");

    @Override
    public acq a() {
        return a;
    }

    protected a a(JsonObject $$0, ba $$1, be $$2) {
        acq $$3 = new acq(aor.i($$0, "recipe_id"));
        bz[] $$4 = bz.b($$0.get("ingredients"));
        return new a($$1, $$3, List.of($$4));
    }

    public void a(aig $$0, acq $$1, List<cfz> $$22) {
        this.a($$0, (T $$2) -> $$2.b($$1, $$22));
    }

    @Override
    protected /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final acq a;
        private final List<bz> b;

        public a(ba $$0, acq $$1, List<bz> $$2) {
            super(a, $$0);
            this.a = $$1;
            this.b = $$2;
        }

        public static a a(acq $$0, List<bz> $$1) {
            return new a(ba.a, $$0, $$1);
        }

        public static a a(acq $$0) {
            return new a(ba.a, $$0, List.of());
        }

        boolean b(acq $$0, List<cfz> $$1) {
            if (!$$0.equals(this.a)) {
                return false;
            }
            ArrayList<cfz> $$2 = new ArrayList<cfz>($$1);
            for (bz $$3 : this.b) {
                boolean $$4 = false;
                Iterator $$5 = $$2.iterator();
                while ($$5.hasNext()) {
                    if (!$$3.a((cfz)$$5.next())) continue;
                    $$5.remove();
                    $$4 = true;
                    break;
                }
                if ($$4) continue;
                return false;
            }
            return true;
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.addProperty("recipe_id", this.a.toString());
            if (this.b.size() > 0) {
                JsonArray $$2 = new JsonArray();
                for (bz $$3 : this.b) {
                    $$2.add($$3.a());
                }
                $$1.add("ingredients", (JsonElement)$$2);
            }
            return $$1;
        }
    }
}

