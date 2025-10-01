/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class df
extends cv<a> {
    static final acq a = new acq("used_ender_eye");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        cj.c $$3 = cj.c.a($$0.get("distance"));
        return new a($$1, $$3);
    }

    public void a(aig $$0, gu $$12) {
        double $$2 = $$0.dn() - (double)$$12.u();
        double $$3 = $$0.dt() - (double)$$12.w();
        double $$4 = $$2 * $$2 + $$3 * $$3;
        this.a($$0, (T $$1) -> $$1.a($$4));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final cj.c a;

        public a(ba $$0, cj.c $$1) {
            super(a, $$0);
            this.a = $$1;
        }

        public boolean a(double $$0) {
            return this.a.e($$0);
        }
    }
}

