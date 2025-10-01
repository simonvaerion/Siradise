/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;
import java.util.Collection;

public class bu
extends cv<a> {
    static final acq a = new acq("fishing_rod_hooked");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        bz $$3 = bz.a($$0.get("rod"));
        ba $$4 = bo.a($$0, "entity", $$2);
        bz $$5 = bz.a($$0.get("item"));
        return new a($$1, $$3, $$4, $$5);
    }

    public void a(aig $$0, cfz $$1, bzc $$2, Collection<cfz> $$32) {
        dzk $$4 = bo.b($$0, $$2.o() != null ? $$2.o() : $$2);
        this.a($$0, (T $$3) -> $$3.a($$1, $$4, $$32));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final bz a;
        private final ba b;
        private final bz c;

        public a(ba $$0, bz $$1, ba $$2, bz $$3) {
            super(a, $$0);
            this.a = $$1;
            this.b = $$2;
            this.c = $$3;
        }

        public static a a(bz $$0, bo $$1, bz $$2) {
            return new a(ba.a, $$0, bo.a($$1), $$2);
        }

        public boolean a(cfz $$0, dzk $$1, Collection<cfz> $$2) {
            if (!this.a.a($$0)) {
                return false;
            }
            if (!this.b.a($$1)) {
                return false;
            }
            if (this.c != bz.a) {
                bvh $$5;
                boolean $$3 = false;
                bfj $$4 = $$1.c(ebw.a);
                if ($$4 instanceof bvh && this.c.a(($$5 = (bvh)$$4).j())) {
                    $$3 = true;
                }
                for (cfz $$6 : $$2) {
                    if (!this.c.a($$6)) continue;
                    $$3 = true;
                    break;
                }
                if (!$$3) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("rod", this.a.a());
            $$1.add("entity", this.b.a($$0));
            $$1.add("item", this.c.a());
            return $$1;
        }
    }
}

