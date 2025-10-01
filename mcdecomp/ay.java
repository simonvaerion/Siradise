/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class ay
extends cv<a> {
    static final acq a = new acq("construct_beacon");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        cj.d $$3 = cj.d.a($$0.get("level"));
        return new a($$1, $$3);
    }

    public void a(aig $$0, int $$12) {
        this.a($$0, (T $$1) -> $$1.a($$12));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final cj.d a;

        public a(ba $$0, cj.d $$1) {
            super(a, $$0);
            this.a = $$1;
        }

        public static a c() {
            return new a(ba.a, cj.d.e);
        }

        public static a a(cj.d $$0) {
            return new a(ba.a, $$0);
        }

        public boolean a(int $$0) {
            return this.a.d($$0);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("level", this.a.d());
            return $$1;
        }
    }
}

