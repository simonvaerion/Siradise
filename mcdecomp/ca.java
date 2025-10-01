/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Arrays;

public class ca
extends cv<a> {
    final acq a;

    public ca(acq $$0) {
        this.a = $$0;
    }

    @Override
    public acq a() {
        return this.a;
    }

    public a a(JsonObject $$0, ba $$1, be $$2) {
        ba $$3 = ba.a("location", $$2, $$0.get("location"), ebv.l);
        if ($$3 == null) {
            throw new JsonParseException("Failed to parse 'location' field");
        }
        return new a(this.a, $$1, $$3);
    }

    public void a(aig $$0, gu $$12, cfz $$2) {
        aif $$3 = $$0.x();
        dcb $$4 = $$3.a_($$12);
        dzq $$5 = new dzq.a($$3).a(ebw.f, $$12.b()).a(ebw.a, $$0).a(ebw.g, $$4).a(ebw.i, $$2).a(ebv.l);
        dzk $$6 = new dzk.a($$5).a(null);
        this.a($$0, (T $$1) -> $$1.a($$6));
    }

    @Override
    public /* synthetic */ ar b(JsonObject jsonObject, ba ba2, be be2) {
        return this.a(jsonObject, ba2, be2);
    }

    public static class a
    extends ar {
        private final ba a;

        public a(acq $$0, ba $$1, ba $$2) {
            super($$0, $$1);
            this.a = $$2;
        }

        public static a a(cpn $$0) {
            ba $$1 = ba.a(ecj.a($$0).build());
            return new a(ai.y.a, ba.a, $$1);
        }

        public static a a(eck.a ... $$0) {
            ba $$1 = ba.a((eck[])Arrays.stream($$0).map(eck.a::build).toArray(eck[]::new));
            return new a(ai.y.a, ba.a, $$1);
        }

        private static a a(ch.a $$0, bz.a $$1, acq $$2) {
            ba $$3 = ba.a(eci.a($$0).build(), ecr.a($$1).build());
            return new a($$2, ba.a, $$3);
        }

        public static a a(ch.a $$0, bz.a $$1) {
            return ca$a.a($$0, $$1, ai.M.a);
        }

        public static a b(ch.a $$0, bz.a $$1) {
            return ca$a.a($$0, $$1, ai.X.a);
        }

        public boolean a(dzk $$0) {
            return this.a.a($$0);
        }

        @Override
        public JsonObject a(ct $$0) {
            JsonObject $$1 = super.a($$0);
            $$1.add("location", this.a.a($$0));
            return $$1;
        }
    }
}

