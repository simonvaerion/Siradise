/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class bi
extends cv<a> {
    static final acq a = new acq("enchanted_item");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        bz $$3 = bz.a($$0.get("item"));
        cj.d $$4 = cj.d.a($$0.get("levels"));
        return new a($$1, $$3, $$4);
    }

    public void a(aig $$0, cfz $$1, int $$22) {
        this.a($$0, (T $$2) -> $$2.a($$1, $$22));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final bz a;
        private final cj.d b;

        public a(ba $$0, bz $$1, cj.d $$2) {
            super(a, $$0);
            this.a = $$1;
            this.b = $$2;
        }

        public static a c() {
            return new a(ba.a, bz.a, cj.d.e);
        }

        public boolean a(cfz $$0, int $$1) {
            if (!this.a.a($$0)) {
                return false;
            }
            return this.b.d($$1);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("item", this.a.a());
            $$1.add("levels", this.b.d());
            return $$1;
        }
    }
}

