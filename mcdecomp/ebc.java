/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class ebc
extends eay {
    public static final int a = 0;
    final edf b;
    final int c;

    ebc(eck[] $$0, edf $$1, int $$2) {
        super($$0);
        this.b = $$1;
        this.c = $$2;
    }

    @Override
    public eba b() {
        return ebb.h;
    }

    @Override
    public Set<ebt<?>> a() {
        return Sets.union((Set)ImmutableSet.of(ebw.d), this.b.a());
    }

    boolean c() {
        return this.c > 0;
    }

    @Override
    public cfz a(cfz $$0, dzk $$1) {
        bfj $$2 = $$1.c(ebw.d);
        if ($$2 instanceof bfz) {
            int $$3 = cki.h((bfz)$$2);
            if ($$3 == 0) {
                return $$0;
            }
            float $$4 = (float)$$3 * this.b.b($$1);
            $$0.g(Math.round($$4));
            if (this.c() && $$0.L() > this.c) {
                $$0.f(this.c);
            }
        }
        return $$0;
    }

    public static a a(edf $$0) {
        return new a($$0);
    }

    public static class a
    extends eay.a<a> {
        private final edf a;
        private int b = 0;

        public a(edf $$0) {
            this.a = $$0;
        }

        protected a a() {
            return this;
        }

        public a a(int $$0) {
            this.b = $$0;
            return this;
        }

        @Override
        public eaz b() {
            return new ebc(this.g(), this.a, this.b);
        }

        @Override
        protected /* synthetic */ eay.a c() {
            return this.a();
        }
    }

    public static class b
    extends eay.c<ebc> {
        @Override
        public void a(JsonObject $$0, ebc $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            $$0.add("count", $$2.serialize((Object)$$1.b));
            if ($$1.c()) {
                $$0.add("limit", $$2.serialize((Object)$$1.c));
            }
        }

        public ebc a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            int $$3 = aor.a($$0, "limit", 0);
            return new ebc($$2, aor.a($$0, "count", $$1, edf.class), $$3);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

