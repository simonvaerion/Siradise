/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class bb
extends cv<a> {
    static final acq a = new acq("cured_zombie_villager");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        ba $$3 = bo.a($$0, "zombie", $$2);
        ba $$4 = bo.a($$0, "villager", $$2);
        return new a($$1, $$3, $$4);
    }

    public void a(aig $$0, bwv $$1, byb $$22) {
        dzk $$3 = bo.b($$0, $$1);
        dzk $$4 = bo.b($$0, $$22);
        this.a($$0, (T $$2) -> $$2.a($$3, $$4));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final ba a;
        private final ba b;

        public a(ba $$0, ba $$1, ba $$2) {
            super(a, $$0);
            this.a = $$1;
            this.b = $$2;
        }

        public static a c() {
            return new a(ba.a, ba.a, ba.a);
        }

        public boolean a(dzk $$0, dzk $$1) {
            if (!this.a.a($$0)) {
                return false;
            }
            return this.b.a($$1);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("zombie", this.a.a($$0));
            $$1.add("villager", this.b.a($$0));
            return $$1;
        }
    }
}

