/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.HashSet;
import java.util.Set;

public class eao
extends eay {
    final cpn a;
    final Set<dde<?>> b;

    eao(eck[] $$0, cpn $$1, Set<dde<?>> $$2) {
        super($$0);
        this.a = $$1;
        this.b = $$2;
    }

    @Override
    public eba b() {
        return ebb.w;
    }

    @Override
    public Set<ebt<?>> a() {
        return ImmutableSet.of(ebw.g);
    }

    @Override
    protected cfz a(cfz $$0, dzk $$1) {
        dcb $$22 = $$1.c(ebw.g);
        if ($$22 != null) {
            qr $$5;
            qr $$3 = $$0.w();
            if ($$3.b("BlockStateTag", 10)) {
                qr $$4 = $$3.p("BlockStateTag");
            } else {
                $$5 = new qr();
                $$3.a("BlockStateTag", $$5);
            }
            this.b.stream().filter($$22::b).forEach($$2 -> $$5.a($$2.f(), eao.a($$22, $$2)));
        }
        return $$0;
    }

    public static a a(cpn $$0) {
        return new a($$0);
    }

    private static <T extends Comparable<T>> String a(dcb $$0, dde<T> $$1) {
        T $$2 = $$0.c($$1);
        return $$1.a($$2);
    }

    public static class a
    extends eay.a<a> {
        private final cpn a;
        private final Set<dde<?>> b = Sets.newHashSet();

        a(cpn $$0) {
            this.a = $$0;
        }

        public a a(dde<?> $$0) {
            if (!this.a.l().d().contains($$0)) {
                throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
            }
            this.b.add($$0);
            return this;
        }

        protected a a() {
            return this;
        }

        @Override
        public eaz b() {
            return new eao(this.g(), this.a, this.b);
        }

        @Override
        protected /* synthetic */ eay.a c() {
            return this.a();
        }
    }

    public static class b
    extends eay.c<eao> {
        @Override
        public void a(JsonObject $$0, eao $$12, JsonSerializationContext $$2) {
            super.a($$0, $$12, $$2);
            $$0.addProperty("block", jb.f.b($$12.a).toString());
            JsonArray $$3 = new JsonArray();
            $$12.b.forEach($$1 -> $$3.add($$1.f()));
            $$0.add("properties", (JsonElement)$$3);
        }

        public eao a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$22) {
            acq $$3 = new acq(aor.i($$0, "block"));
            cpn $$4 = (cpn)jb.f.b($$3).orElseThrow(() -> new IllegalArgumentException("Can't find block " + $$3));
            dcc<cpn, dcb> $$5 = $$4.l();
            HashSet $$6 = Sets.newHashSet();
            JsonArray $$7 = aor.a($$0, "properties", null);
            if ($$7 != null) {
                $$7.forEach($$2 -> $$6.add($$5.a(aor.a($$2, "property"))));
            }
            return new eao($$22, $$4, $$6);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

