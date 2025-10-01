/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.gson.JsonObject
 */
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonObject;
import java.util.Set;

public class az
extends cv<a> {
    static final acq a = new acq("consume_item");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        return new a($$1, bz.a($$0.get("item")));
    }

    public void a(aig $$0, cfz $$12) {
        this.a($$0, (T $$1) -> $$1.a($$12));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final bz a;

        public a(ba $$0, bz $$1) {
            super(a, $$0);
            this.a = $$1;
        }

        public static a c() {
            return new a(ba.a, bz.a);
        }

        public static a a(bz $$0) {
            return new a(ba.a, $$0);
        }

        public static a a(cml $$0) {
            return new a(ba.a, new bz(null, (Set<cfu>)ImmutableSet.of((Object)$$0.k()), cj.d.e, cj.d.e, bj.b, bj.b, null, cl.a));
        }

        public boolean a(cfz $$0) {
            return this.a.a($$0);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("item", this.a.a());
            return $$1;
        }
    }
}

