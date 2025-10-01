/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class cn
extends cv<a> {
    static final acq a = new acq("player_hurt_entity");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        bc $$3 = bc.a($$0.get("damage"));
        ba $$4 = bo.a($$0, "entity", $$2);
        return new a($$1, $$3, $$4);
    }

    public void a(aig $$0, bfj $$1, ben $$2, float $$3, float $$4, boolean $$5) {
        dzk $$62 = bo.b($$0, $$1);
        this.a($$0, (T $$6) -> $$6.a($$0, $$62, $$2, $$3, $$4, $$5));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final bc a;
        private final ba b;

        public a(ba $$0, bc $$1, ba $$2) {
            super(a, $$0);
            this.a = $$1;
            this.b = $$2;
        }

        public static a c() {
            return new a(ba.a, bc.a, ba.a);
        }

        public static a a(bc $$0) {
            return new a(ba.a, $$0, ba.a);
        }

        public static a a(bc.a $$0) {
            return new a(ba.a, $$0.b(), ba.a);
        }

        public static a a(bo $$0) {
            return new a(ba.a, bc.a, bo.a($$0));
        }

        public static a a(bc $$0, bo $$1) {
            return new a(ba.a, $$0, bo.a($$1));
        }

        public static a a(bc.a $$0, bo $$1) {
            return new a(ba.a, $$0.b(), bo.a($$1));
        }

        public boolean a(aig $$0, dzk $$1, ben $$2, float $$3, float $$4, boolean $$5) {
            if (!this.a.a($$0, $$2, $$3, $$4, $$5)) {
                return false;
            }
            return this.b.a($$1);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("damage", this.a.a());
            $$1.add("entity", this.b.a($$0));
            return $$1;
        }
    }
}

