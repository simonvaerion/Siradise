/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class eap
extends eay {
    final a a;

    eap(eck[] $$0, a $$1) {
        super($$0);
        this.a = $$1;
    }

    @Override
    public eba b() {
        return ebb.n;
    }

    @Override
    public Set<ebt<?>> a() {
        return ImmutableSet.of(this.a.f);
    }

    @Override
    public cfz a(cfz $$0, dzk $$1) {
        beb $$3;
        Object $$2 = $$1.c(this.a.f);
        if ($$2 instanceof beb && ($$3 = (beb)$$2).aa()) {
            $$0.a($$3.H_());
        }
        return $$0;
    }

    public static eay.a<?> a(a $$0) {
        return eap.a((eck[] $$1) -> new eap((eck[])$$1, $$0));
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("this", ebw.a);
        public static final /* enum */ a b = new a("killer", ebw.d);
        public static final /* enum */ a c = new a("killer_player", ebw.b);
        public static final /* enum */ a d = new a("block_entity", ebw.h);
        public final String e;
        public final ebt<?> f;
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, ebt<?> $$1) {
            this.e = $$0;
            this.f = $$1;
        }

        public static a a(String $$0) {
            for (a $$1 : eap$a.values()) {
                if (!$$1.e.equals($$0)) continue;
                return $$1;
            }
            throw new IllegalArgumentException("Invalid name source " + $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            g = eap$a.a();
        }
    }

    public static class b
    extends eay.c<eap> {
        @Override
        public void a(JsonObject $$0, eap $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            $$0.addProperty("source", $$1.a.e);
        }

        public eap a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            a $$3 = eap$a.a(aor.i($$0, "source"));
            return new eap($$2, $$3);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

