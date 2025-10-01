/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class bn
extends cv<a> {
    static final acq a = new acq("entity_hurt_player");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        bc $$3 = bc.a($$0.get("damage"));
        return new a($$1, $$3);
    }

    public void a(aig $$0, ben $$1, float $$2, float $$3, boolean $$4) {
        this.a($$0, (T $$5) -> $$5.a($$0, $$1, $$2, $$3, $$4));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final bc a;

        public a(ba $$0, bc $$1) {
            super(a, $$0);
            this.a = $$1;
        }

        public static a c() {
            return new a(ba.a, bc.a);
        }

        public static a a(bc $$0) {
            return new a(ba.a, $$0);
        }

        public static a a(bc.a $$0) {
            return new a(ba.a, $$0.b());
        }

        public boolean a(aig $$0, ben $$1, float $$2, float $$3, boolean $$4) {
            return this.a.a($$0, $$1, $$2, $$3, $$4);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("damage", this.a.a());
            return $$1;
        }
    }
}

