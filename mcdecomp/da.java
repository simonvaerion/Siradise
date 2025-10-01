/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class da
extends cv<a> {
    static final acq a = new acq("summoned_entity");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        ba $$3 = bo.a($$0, "entity", $$2);
        return new a($$1, $$3);
    }

    public void a(aig $$0, bfj $$12) {
        dzk $$2 = bo.b($$0, $$12);
        this.a($$0, (T $$1) -> $$1.a($$2));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final ba a;

        public a(ba $$0, ba $$1) {
            super(a, $$0);
            this.a = $$1;
        }

        public static a a(bo.a $$0) {
            return new a(ba.a, bo.a($$0.b()));
        }

        public boolean a(dzk $$0) {
            return this.a.a($$0);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("entity", this.a.a($$0));
            return $$1;
        }
    }
}

