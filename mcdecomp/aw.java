/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class aw
extends cv<a> {
    static final acq a = new acq("changed_dimension");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        acp<cmm> $$3 = $$0.has("from") ? acp.a(jc.aH, new acq(aor.i($$0, "from"))) : null;
        acp<cmm> $$4 = $$0.has("to") ? acp.a(jc.aH, new acq(aor.i($$0, "to"))) : null;
        return new a($$1, $$3, $$4);
    }

    public void a(aig $$0, acp<cmm> $$1, acp<cmm> $$22) {
        this.a($$0, (T $$2) -> $$2.b($$1, $$22));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        @Nullable
        private final acp<cmm> a;
        @Nullable
        private final acp<cmm> b;

        public a(ba $$0, @Nullable acp<cmm> $$1, @Nullable acp<cmm> $$2) {
            super(a, $$0);
            this.a = $$1;
            this.b = $$2;
        }

        public static a c() {
            return new a(ba.a, null, null);
        }

        public static a a(acp<cmm> $$0, acp<cmm> $$1) {
            return new a(ba.a, $$0, $$1);
        }

        public static a a(acp<cmm> $$0) {
            return new a(ba.a, null, $$0);
        }

        public static a b(acp<cmm> $$0) {
            return new a(ba.a, $$0, null);
        }

        public boolean b(acp<cmm> $$0, acp<cmm> $$1) {
            if (this.a != null && this.a != $$0) {
                return false;
            }
            return this.b == null || this.b == $$1;
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            if (this.a != null) {
                $$1.addProperty("from", this.a.a().toString());
            }
            if (this.b != null) {
                $$1.addProperty("to", this.b.a().toString());
            }
            return $$1;
        }
    }
}

