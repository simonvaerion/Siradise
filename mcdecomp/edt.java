/*
 * Decompiled with CFR 0.152.
 */
@FunctionalInterface
public interface edt<T> {
    public void handle(T var1, edv<T> var2, long var3);

    public static abstract class a<T, C extends edt<T>> {
        private final acq a;
        private final Class<?> b;

        public a(acq $$0, Class<?> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public acq a() {
            return this.a;
        }

        public Class<?> b() {
            return this.b;
        }

        public abstract void a(qr var1, C var2);

        public abstract C b(qr var1);
    }
}

