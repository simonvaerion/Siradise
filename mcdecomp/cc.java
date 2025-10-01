/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class cc
extends cv<a> {
    final acq a;

    public cc(acq $$0) {
        this.a = $$0;
    }

    @Override
    public acq a() {
        return this.a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        return new a(this.a, $$1, bo.a($$0, "entity", $$2), bd.a($$0.get("killing_blow")));
    }

    public void a(aig $$0, bfj $$1, ben $$2) {
        dzk $$32 = bo.b($$0, $$1);
        this.a($$0, (T $$3) -> $$3.a($$0, $$32, $$2));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final ba a;
        private final bd b;

        public a(acq $$0, ba $$1, ba $$2, bd $$3) {
            super($$0, $$1);
            this.a = $$2;
            this.b = $$3;
        }

        public static a a(bo $$0) {
            return new a(ai.b.a, ba.a, bo.a($$0), bd.a);
        }

        public static a a(bo.a $$0) {
            return new a(ai.b.a, ba.a, bo.a($$0.b()), bd.a);
        }

        public static a c() {
            return new a(ai.b.a, ba.a, ba.a, bd.a);
        }

        public static a a(bo $$0, bd $$1) {
            return new a(ai.b.a, ba.a, bo.a($$0), $$1);
        }

        public static a a(bo.a $$0, bd $$1) {
            return new a(ai.b.a, ba.a, bo.a($$0.b()), $$1);
        }

        public static a a(bo $$0, bd.a $$1) {
            return new a(ai.b.a, ba.a, bo.a($$0), $$1.b());
        }

        public static a a(bo.a $$0, bd.a $$1) {
            return new a(ai.b.a, ba.a, bo.a($$0.b()), $$1.b());
        }

        public static a d() {
            return new a(ai.W.a, ba.a, ba.a, bd.a);
        }

        public static a b(bo $$0) {
            return new a(ai.c.a, ba.a, bo.a($$0), bd.a);
        }

        public static a b(bo.a $$0) {
            return new a(ai.c.a, ba.a, bo.a($$0.b()), bd.a);
        }

        public static a e() {
            return new a(ai.c.a, ba.a, ba.a, bd.a);
        }

        public static a b(bo $$0, bd $$1) {
            return new a(ai.c.a, ba.a, bo.a($$0), $$1);
        }

        public static a b(bo.a $$0, bd $$1) {
            return new a(ai.c.a, ba.a, bo.a($$0.b()), $$1);
        }

        public static a b(bo $$0, bd.a $$1) {
            return new a(ai.c.a, ba.a, bo.a($$0), $$1.b());
        }

        public static a b(bo.a $$0, bd.a $$1) {
            return new a(ai.c.a, ba.a, bo.a($$0.b()), $$1.b());
        }

        public boolean a(aig $$0, dzk $$1, ben $$2) {
            if (!this.b.a($$0, $$2)) {
                return false;
            }
            return this.a.a($$1);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("entity", this.a.a($$0));
            $$1.add("killing_blow", this.b.a());
            return $$1;
        }
    }
}

