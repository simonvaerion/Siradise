/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class cu
extends cv<a> {
    static final acq a = new acq("shot_crossbow");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        bz $$3 = bz.a($$0.get("item"));
        return new a($$1, $$3);
    }

    public void a(aig $$0, cfz $$12) {
        this.a($$0, (T $$1) -> $$1.a($$12));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final bz a;

        public a(ba $$0, bz $$1) {
            super(a, $$0);
            this.a = $$1;
        }

        public static a a(bz $$0) {
            return new a(ba.a, $$0);
        }

        public static a a(cml $$0) {
            return new a(ba.a, bz.a.a().a($$0).b());
        }

        public boolean a(cfz $$0) {
            return this.a.a($$0);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("item", this.a.a());
            return $$1;
        }
    }
}

