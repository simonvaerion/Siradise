/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public interface al<T extends am> {
    public acq a();

    public void a(acy var1, a<T> var2);

    public void b(acy var1, a<T> var2);

    public void a(acy var1);

    public T a(JsonObject var1, be var2);

    public static class a<T extends am> {
        private final T a;
        private final ae b;
        private final String c;

        public a(T $$0, ae $$1, String $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public T a() {
            return this.a;
        }

        public void a(acy $$0) {
            $$0.a(this.b, this.c);
        }

        public boolean equals(Object $$0) {
            if (this == $$0) {
                return true;
            }
            if ($$0 == null || this.getClass() != $$0.getClass()) {
                return false;
            }
            a $$1 = (a)$$0;
            if (!this.a.equals($$1.a)) {
                return false;
            }
            if (!this.b.equals($$1.b)) {
                return false;
            }
            return this.c.equals($$1.c);
        }

        public int hashCode() {
            int $$0 = this.a.hashCode();
            $$0 = 31 * $$0 + this.b.hashCode();
            $$0 = 31 * $$0 + this.c.hashCode();
            return $$0;
        }
    }
}

