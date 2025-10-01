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

public class bk
extends cv<a> {
    static final acq a = new acq("enter_block");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$12, be $$2) {
        cpn $$3 = bk.a($$0);
        cz $$4 = cz.a($$0.get("state"));
        if ($$3 != null) {
            $$4.a($$3.l(), (String $$1) -> {
                throw new JsonSyntaxException("Block " + $$3 + " has no property " + $$1);
            });
        }
        return new a($$12, $$3, $$4);
    }

    @Nullable
    private static cpn a(JsonObject $$0) {
        if ($$0.has("block")) {
            acq $$1 = new acq(aor.i($$0, "block"));
            return (cpn)jb.f.b($$1).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + $$1 + "'"));
        }
        return null;
    }

    public void a(aig $$0, dcb $$12) {
        this.a($$0, (T $$1) -> $$1.a($$12));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        @Nullable
        private final cpn a;
        private final cz b;

        public a(ba $$0, @Nullable cpn $$1, cz $$2) {
            super(a, $$0);
            this.a = $$1;
            this.b = $$2;
        }

        public static a a(cpn $$0) {
            return new a(ba.a, $$0, cz.a);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            if (this.a != null) {
                $$1.addProperty("block", jb.f.b(this.a).toString());
            }
            $$1.add("state", this.b.a());
            return $$1;
        }

        public boolean a(dcb $$0) {
            if (this.a != null && !$$0.a(this.a)) {
                return false;
            }
            return this.b.a($$0);
        }
    }
}

