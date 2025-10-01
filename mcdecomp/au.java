/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class au
extends cv<a> {
    static final acq a = new acq("bred_animals");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        ba $$3 = bo.a($$0, "parent", $$2);
        ba $$4 = bo.a($$0, "partner", $$2);
        ba $$5 = bo.a($$0, "child", $$2);
        return new a($$1, $$3, $$4, $$5);
    }

    public void a(aig $$0, brl $$1, brl $$2, @Nullable bfe $$32) {
        dzk $$4 = bo.b($$0, $$1);
        dzk $$5 = bo.b($$0, $$2);
        dzk $$6 = $$32 != null ? bo.b($$0, $$32) : null;
        this.a($$0, (T $$3) -> $$3.a($$4, $$5, $$6));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final ba a;
        private final ba b;
        private final ba c;

        public a(ba $$0, ba $$1, ba $$2, ba $$3) {
            super(a, $$0);
            this.a = $$1;
            this.b = $$2;
            this.c = $$3;
        }

        public static a c() {
            return new a(ba.a, ba.a, ba.a, ba.a);
        }

        public static a a(bo.a $$0) {
            return new a(ba.a, ba.a, ba.a, bo.a($$0.b()));
        }

        public static a a(bo $$0, bo $$1, bo $$2) {
            return new a(ba.a, bo.a($$0), bo.a($$1), bo.a($$2));
        }

        public boolean a(dzk $$0, dzk $$1, @Nullable dzk $$2) {
            if (!(this.c == ba.a || $$2 != null && this.c.a($$2))) {
                return false;
            }
            return this.a.a($$0) && this.b.a($$1) || this.a.a($$1) && this.b.a($$0);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("parent", this.a.a($$0));
            $$1.add("partner", this.b.a($$0));
            $$1.add("child", this.c.a($$0));
            return $$1;
        }
    }
}

