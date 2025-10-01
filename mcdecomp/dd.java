/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class dd
extends cv<a> {
    static final acq a = new acq("target_hit");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        cj.d $$3 = cj.d.a($$0.get("signal_strength"));
        ba $$4 = bo.a($$0, "projectile", $$2);
        return new a($$1, $$3, $$4);
    }

    public void a(aig $$0, bfj $$1, eei $$2, int $$32) {
        dzk $$4 = bo.b($$0, $$1);
        this.a($$0, (T $$3) -> $$3.a($$4, $$2, $$32));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final cj.d a;
        private final ba b;

        public a(ba $$0, cj.d $$1, ba $$2) {
            super(a, $$0);
            this.a = $$1;
            this.b = $$2;
        }

        public static a a(cj.d $$0, ba $$1) {
            return new a(ba.a, $$0, $$1);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("signal_strength", this.a.d());
            $$1.add("projectile", this.b.a($$0));
            return $$1;
        }

        public boolean a(dzk $$0, eei $$1, int $$2) {
            if (!this.a.d($$2)) {
                return false;
            }
            return this.b.a($$0);
        }
    }
}

