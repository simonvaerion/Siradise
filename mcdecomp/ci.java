/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class ci
extends cv<a> {
    static final acq a = new acq("player_generates_container_loot");

    @Override
    public acq a() {
        return a;
    }

    protected a a(JsonObject $$0, ba $$1, be $$2) {
        acq $$3 = new acq(aor.i($$0, "loot_table"));
        return new a($$1, $$3);
    }

    public void a(aig $$0, acq $$12) {
        this.a($$0, (T $$1) -> $$1.b($$12));
    }

    @Override
    protected /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final acq a;

        public a(ba $$0, acq $$1) {
            super(a, $$0);
            this.a = $$1;
        }

        public static a a(acq $$0) {
            return new a(ba.a, $$0);
        }

        public boolean b(acq $$0) {
            return this.a.equals($$0);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.addProperty("loot_table", this.a.toString());
            return $$1;
        }
    }
}

