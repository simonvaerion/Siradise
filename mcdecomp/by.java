/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class by
extends cv<a> {
    static final acq a = new acq("item_durability_changed");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        bz $$3 = bz.a($$0.get("item"));
        cj.d $$4 = cj.d.a($$0.get("durability"));
        cj.d $$5 = cj.d.a($$0.get("delta"));
        return new a($$1, $$3, $$4, $$5);
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
        private final cj.d c;

        public a(ba $$0, bz $$1, cj.d $$2, cj.d $$3) {
            super(a, $$0);
            this.a = $$1;
            this.b = $$2;
            this.c = $$3;
        }

        public static a a(bz $$0, cj.d $$1) {
            return by$a.a(ba.a, $$0, $$1);
        }

        public static a a(ba $$0, bz $$1, cj.d $$2) {
            return new a($$0, $$1, $$2, cj.d.e);
        }

        public boolean a(cfz $$0, int $$1) {
            if (!this.a.a($$0)) {
                return false;
            }
            if (!this.b.d($$0.l() - $$1)) {
                return false;
            }
            return this.c.d($$0.k() - $$1);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("item", this.a.a());
            $$1.add("durability", this.b.d());
            $$1.add("delta", this.c.d());
            return $$1;
        }
    }
}

