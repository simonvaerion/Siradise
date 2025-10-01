/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class co
extends cv<a> {
    static final acq a = new acq("player_interacted_with_entity");

    @Override
    public acq a() {
        return a;
    }

    protected a a(JsonObject $$0, ba $$1, be $$2) {
        bz $$3 = bz.a($$0.get("item"));
        ba $$4 = bo.a($$0, "entity", $$2);
        return new a($$1, $$3, $$4);
    }

    public void a(aig $$0, cfz $$1, bfj $$22) {
        dzk $$3 = bo.b($$0, $$22);
        this.a($$0, (T $$2) -> $$2.a($$1, $$3));
    }

    @Override
    protected /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final bz a;
        private final ba b;

        public a(ba $$0, bz $$1, ba $$2) {
            super(a, $$0);
            this.a = $$1;
            this.b = $$2;
        }

        public static a a(ba $$0, bz.a $$1, ba $$2) {
            return new a($$0, $$1.b(), $$2);
        }

        public static a a(bz.a $$0, ba $$1) {
            return co$a.a(ba.a, $$0, $$1);
        }

        public boolean a(cfz $$0, dzk $$1) {
            if (!this.a.a($$0)) {
                return false;
            }
            return this.b.a($$1);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("item", this.a.a());
            $$1.add("entity", this.b.a($$0));
            return $$1;
        }
    }
}

