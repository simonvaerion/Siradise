/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;

public class av
extends cv<a> {
    static final acq a = new acq("brewed_potion");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        chw $$3 = null;
        if ($$0.has("potion")) {
            acq $$4 = new acq(aor.i($$0, "potion"));
            $$3 = (chw)jb.j.b($$4).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + $$4 + "'"));
        }
        return new a($$1, $$3);
    }

    public void a(aig $$0, chw $$12) {
        this.a($$0, (T $$1) -> $$1.a($$12));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        @Nullable
        private final chw a;

        public a(ba $$0, @Nullable chw $$1) {
            super(a, $$0);
            this.a = $$1;
        }

        public static a c() {
            return new a(ba.a, null);
        }

        public boolean a(chw $$0) {
            return this.a == null || this.a == $$0;
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            if (this.a != null) {
                $$1.addProperty("potion", jb.j.b(this.a).toString());
            }
            return $$1;
        }
    }
}

