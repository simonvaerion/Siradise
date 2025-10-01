/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class cd
extends cv<a> {
    static final acq a = new acq("levitation");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        bf $$3 = bf.a($$0.get("distance"));
        cj.d $$4 = cj.d.a($$0.get("duration"));
        return new a($$1, $$3, $$4);
    }

    public void a(aig $$0, eei $$1, int $$2) {
        this.a($$0, (T $$3) -> $$3.a($$0, $$1, $$2));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final bf a;
        private final cj.d b;

        public a(ba $$0, bf $$1, cj.d $$2) {
            super(a, $$0);
            this.a = $$1;
            this.b = $$2;
        }

        public static a a(bf $$0) {
            return new a(ba.a, $$0, cj.d.e);
        }

        public boolean a(aig $$0, eei $$1, int $$2) {
            if (!this.a.a($$1.c, $$1.d, $$1.e, $$0.dn(), $$0.dp(), $$0.dt())) {
                return false;
            }
            return this.b.d($$2);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("distance", this.a.a());
            $$1.add("duration", this.b.d());
            return $$1;
        }
    }
}

