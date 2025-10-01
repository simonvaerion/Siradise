/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class eas
extends eay {
    final edf a;
    final boolean b;

    eas(eck[] $$0, edf $$1, boolean $$2) {
        super($$0);
        this.a = $$1;
        this.b = $$2;
    }

    @Override
    public eba b() {
        return ebb.c;
    }

    @Override
    public Set<ebt<?>> a() {
        return this.a.a();
    }

    @Override
    public cfz a(cfz $$0, dzk $$1) {
        apf $$2 = $$1.b();
        return cki.a($$2, $$0, this.a.a($$1), this.b);
    }

    public static a a(edf $$0) {
        return new a($$0);
    }

    public static class a
    extends eay.a<a> {
        private final edf a;
        private boolean b;

        public a(edf $$0) {
            this.a = $$0;
        }

        protected a a() {
            return this;
        }

        public a e() {
            this.b = true;
            return this;
        }

        @Override
        public eaz b() {
            return new eas(this.g(), this.a, this.b);
        }

        @Override
        protected /* synthetic */ eay.a c() {
            return this.a();
        }
    }

    public static class b
    extends eay.c<eas> {
        @Override
        public void a(JsonObject $$0, eas $$1, JsonSerializationContext $$2) {
            super.a($$0, $$1, $$2);
            $$0.add("levels", $$2.serialize((Object)$$1.a));
            $$0.addProperty("treasure", Boolean.valueOf($$1.b));
        }

        public eas a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
            edf $$3 = aor.a($$0, "levels", $$1, edf.class);
            boolean $$4 = aor.a($$0, "treasure", false);
            return new eas($$2, $$3, $$4);
        }

        @Override
        public /* synthetic */ eay b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, eck[] eckArray) {
            return this.a(jsonObject, jsonDeserializationContext, eckArray);
        }
    }
}

