/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public class eiq {
    public static ein a() {
        throw new IllegalArgumentException();
    }

    public static ein a(ein $$0) {
        return $$0;
    }

    public static ein a(ein $$0, ein $$1) {
        return new a($$0, $$1);
    }

    public static ein a(ein ... $$0) {
        return new b($$0);
    }

    static class a
    implements ein {
        private final ein a;
        private final ein b;

        public a(ein $$0, ein $$1) {
            if ($$0 == $$1) {
                throw new IllegalArgumentException("Duplicate delegates");
            }
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public ein a(double $$0, double $$1, double $$2) {
            this.a.a($$0, $$1, $$2);
            this.b.a($$0, $$1, $$2);
            return this;
        }

        @Override
        public ein a(int $$0, int $$1, int $$2, int $$3) {
            this.a.a($$0, $$1, $$2, $$3);
            this.b.a($$0, $$1, $$2, $$3);
            return this;
        }

        @Override
        public ein a(float $$0, float $$1) {
            this.a.a($$0, $$1);
            this.b.a($$0, $$1);
            return this;
        }

        @Override
        public ein a(int $$0, int $$1) {
            this.a.a($$0, $$1);
            this.b.a($$0, $$1);
            return this;
        }

        @Override
        public ein b(int $$0, int $$1) {
            this.a.b($$0, $$1);
            this.b.b($$0, $$1);
            return this;
        }

        @Override
        public ein a(float $$0, float $$1, float $$2) {
            this.a.a($$0, $$1, $$2);
            this.b.a($$0, $$1, $$2);
            return this;
        }

        @Override
        public void a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, int $$9, int $$10, float $$11, float $$12, float $$13) {
            this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, $$13);
            this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, $$13);
        }

        @Override
        public void e() {
            this.a.e();
            this.b.e();
        }

        @Override
        public void b(int $$0, int $$1, int $$2, int $$3) {
            this.a.b($$0, $$1, $$2, $$3);
            this.b.b($$0, $$1, $$2, $$3);
        }

        @Override
        public void k() {
            this.a.k();
            this.b.k();
        }
    }

    static class b
    implements ein {
        private final ein[] a;

        public b(ein[] $$0) {
            for (int $$1 = 0; $$1 < $$0.length; ++$$1) {
                for (int $$2 = $$1 + 1; $$2 < $$0.length; ++$$2) {
                    if ($$0[$$1] != $$0[$$2]) continue;
                    throw new IllegalArgumentException("Duplicate delegates");
                }
            }
            this.a = $$0;
        }

        private void a(Consumer<ein> $$0) {
            for (ein $$1 : this.a) {
                $$0.accept($$1);
            }
        }

        @Override
        public ein a(double $$0, double $$1, double $$2) {
            this.a($$3 -> $$3.a($$0, $$1, $$2));
            return this;
        }

        @Override
        public ein a(int $$0, int $$1, int $$2, int $$3) {
            this.a($$4 -> $$4.a($$0, $$1, $$2, $$3));
            return this;
        }

        @Override
        public ein a(float $$0, float $$1) {
            this.a($$2 -> $$2.a($$0, $$1));
            return this;
        }

        @Override
        public ein a(int $$0, int $$1) {
            this.a($$2 -> $$2.a($$0, $$1));
            return this;
        }

        @Override
        public ein b(int $$0, int $$1) {
            this.a($$2 -> $$2.b($$0, $$1));
            return this;
        }

        @Override
        public ein a(float $$0, float $$1, float $$2) {
            this.a($$3 -> $$3.a($$0, $$1, $$2));
            return this;
        }

        @Override
        public void a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, int $$9, int $$10, float $$11, float $$12, float $$13) {
            this.a($$14 -> $$14.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, $$13));
        }

        @Override
        public void e() {
            this.a(ein::e);
        }

        @Override
        public void b(int $$0, int $$1, int $$2, int $$3) {
            this.a($$4 -> $$4.b($$0, $$1, $$2, $$3));
        }

        @Override
        public void k() {
            this.a(ein::k);
        }
    }
}

