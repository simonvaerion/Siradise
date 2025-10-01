/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class de
extends cv<a> {
    static final acq a = new acq("villager_trade");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        ba $$3 = bo.a($$0, "villager", $$2);
        bz $$4 = bz.a($$0.get("item"));
        return new a($$1, $$3, $$4);
    }

    public void a(aig $$0, bxw $$1, cfz $$22) {
        dzk $$3 = bo.b($$0, $$1);
        this.a($$0, (T $$2) -> $$2.a($$3, $$22));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final ba a;
        private final bz b;

        public a(ba $$0, ba $$1, bz $$2) {
            super(a, $$0);
            this.a = $$1;
            this.b = $$2;
        }

        public static a c() {
            return new a(ba.a, ba.a, bz.a);
        }

        public static a a(bo.a $$0) {
            return new a(bo.a($$0.b()), ba.a, bz.a);
        }

        public boolean a(dzk $$0, cfz $$1) {
            if (!this.a.a($$0)) {
                return false;
            }
            return this.b.a($$1);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("item", this.b.a());
            $$1.add("villager", this.a.a($$0));
            return $$1;
        }
    }
}

