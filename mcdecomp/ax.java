/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ax
extends cv<a> {
    static final acq a = new acq("channeled_lightning");

    @Override
    public acq a() {
        return a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        ba[] $$3 = bo.b($$0, "victims", $$2);
        return new a($$1, $$3);
    }

    @Override
    public void a(aig $$0, Collection<? extends bfj> $$12) {
        List $$2 = $$12.stream().map($$1 -> bo.b($$0, $$1)).collect(Collectors.toList());
        this.a($$0, (T $$1) -> $$1.a($$2));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final ba[] a;

        public a(ba $$0, ba[] $$1) {
            super(a, $$0);
            this.a = $$1;
        }

        public static a a(bo ... $$0) {
            return new a(ba.a, (ba[])Stream.of($$0).map(bo::a).toArray(ba[]::new));
        }

        public boolean a(Collection<? extends dzk> $$0) {
            for (ba $$1 : this.a) {
                boolean $$2 = false;
                for (dzk dzk2 : $$0) {
                    if (!$$1.a(dzk2)) continue;
                    $$2 = true;
                    break;
                }
                if ($$2) continue;
                return false;
            }
            return true;
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("victims", ba.a(this.a, $$0));
            return $$1;
        }
    }
}

