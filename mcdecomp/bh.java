/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class bh
extends cv<a> {
    static final acq a = new acq("effects_changed");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        ck $$3 = ck.a($$0.get("effects"));
        ba $$4 = bo.a($$0, "source", $$2);
        return new a($$1, $$3, $$4);
    }

    public void a(aig $$0, @Nullable bfj $$1) {
        dzk $$22 = $$1 != null ? bo.b($$0, $$1) : null;
        this.a($$0, (T $$2) -> $$2.a($$0, $$22));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final ck a;
        private final ba b;

        public a(ba $$0, ck $$1, ba $$2) {
            super(a, $$0);
            this.a = $$1;
            this.b = $$2;
        }

        public static a a(ck $$0) {
            return new a(ba.a, $$0, ba.a);
        }

        public static a a(bo $$0) {
            return new a(ba.a, ck.a, bo.a($$0));
        }

        public boolean a(aig $$0, @Nullable dzk $$1) {
            if (!this.a.a($$0)) {
                return false;
            }
            return this.b == ba.a || $$1 != null && this.b.a($$1);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("effects", this.a.b());
            $$1.add("source", this.b.a($$0));
            return $$1;
        }
    }
}

