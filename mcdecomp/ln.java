/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public abstract class ln {
    protected static cis a(lq $$0) {
        return switch ($$0) {
            case lq.a -> cis.a;
            case lq.e, lq.f -> cis.c;
            case lq.c -> cis.b;
            default -> cis.d;
        };
    }

    protected static abstract class a
    implements lo {
        private final cis a;

        protected a(cis $$0) {
            this.a = $$0;
        }

        @Override
        public void a(JsonObject $$0) {
            $$0.addProperty("category", this.a.c());
        }
    }
}

