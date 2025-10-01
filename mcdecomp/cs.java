/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class cs
extends cv<a> {
    static final acq a = new acq("recipe_unlocked");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        acq $$3 = new acq(aor.i($$0, "recipe"));
        return new a($$1, $$3);
    }

    @Override
    public void a(aig $$0, cjc<?> $$12) {
        ((cv)this).a($$0, (T $$1) -> $$1.a($$12));
    }

    public static a a(acq $$0) {
        return new a(ba.a, $$0);
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final acq a;

        public a(ba $$0, acq $$1) {
            super(a, $$0);
            this.a = $$1;
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.addProperty("recipe", this.a.toString());
            return $$1;
        }

        public boolean a(cjc<?> $$0) {
            return this.a.equals($$0.e());
        }
    }
}

