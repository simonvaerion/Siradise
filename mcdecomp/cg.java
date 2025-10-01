/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;
import java.util.List;
import java.util.stream.Collectors;

public class cg
extends cv<a> {
    static final acq a = new acq("lightning_strike");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        ba $$3 = bo.a($$0, "lightning", $$2);
        ba $$4 = bo.a($$0, "bystander", $$2);
        return new a($$1, $$3, $$4);
    }

    public void a(aig $$0, bfy $$12, List<bfj> $$22) {
        List $$3 = $$22.stream().map($$1 -> bo.b($$0, $$1)).collect(Collectors.toList());
        dzk $$4 = bo.b($$0, $$12);
        this.a($$0, (T $$2) -> $$2.a($$4, $$3));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final ba a;
        private final ba b;

        public a(ba $$0, ba $$1, ba $$2) {
            super(a, $$0);
            this.a = $$1;
            this.b = $$2;
        }

        public static a a(bo $$0, bo $$1) {
            return new a(ba.a, bo.a($$0), bo.a($$1));
        }

        public boolean a(dzk $$0, List<dzk> $$1) {
            if (!this.a.a($$0)) {
                return false;
            }
            if (this.b != ba.a) {
                if ($$1.stream().noneMatch(this.b::a)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("lightning", this.a.a($$0));
            $$1.add("bystander", this.b.a($$0));
            return $$1;
        }
    }
}

