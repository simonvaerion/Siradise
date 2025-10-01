/*
 * Decompiled with CFR 0.152.
 */
public class aok {

    public static class a {
        public static int a(int $$0) {
            return $$0 >>> 24;
        }

        public static int b(int $$0) {
            return $$0 & 0xFF;
        }

        public static int c(int $$0) {
            return $$0 >> 8 & 0xFF;
        }

        public static int d(int $$0) {
            return $$0 >> 16 & 0xFF;
        }

        public static int e(int $$0) {
            return $$0 & 0xFFFFFF;
        }

        public static int f(int $$0) {
            return $$0 | 0xFF000000;
        }

        public static int a(int $$0, int $$1, int $$2, int $$3) {
            return $$0 << 24 | $$1 << 16 | $$2 << 8 | $$3;
        }

        public static int a(int $$0, int $$1) {
            return $$0 << 24 | $$1 & 0xFFFFFF;
        }
    }

    public static class b {
        public static int a(int $$0) {
            return $$0 >>> 24;
        }

        public static int b(int $$0) {
            return $$0 >> 16 & 0xFF;
        }

        public static int c(int $$0) {
            return $$0 >> 8 & 0xFF;
        }

        public static int d(int $$0) {
            return $$0 & 0xFF;
        }

        public static int a(int $$0, int $$1, int $$2, int $$3) {
            return $$0 << 24 | $$1 << 16 | $$2 << 8 | $$3;
        }

        public static int a(int $$0, int $$1) {
            return b.a(b.a($$0) * b.a($$1) / 255, b.b($$0) * b.b($$1) / 255, b.c($$0) * b.c($$1) / 255, b.d($$0) * b.d($$1) / 255);
        }

        public static int a(float $$0, int $$1, int $$2) {
            int $$3 = apa.a($$0, b.a($$1), b.a($$2));
            int $$4 = apa.a($$0, b.b($$1), b.b($$2));
            int $$5 = apa.a($$0, b.c($$1), b.c($$2));
            int $$6 = apa.a($$0, b.d($$1), b.d($$2));
            return b.a($$3, $$4, $$5, $$6);
        }
    }
}

