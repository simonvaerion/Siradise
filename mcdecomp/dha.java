/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public abstract class dha {
    public static b a(int $$0, int $$1) {
        return new b($$0 - 1, $$1 + 1);
    }

    public static b b(int $$0, int $$1) {
        return new b($$0, $$1);
    }

    public static dha a(int $$0) {
        return new c($$0, false);
    }

    public static dha b(int $$0) {
        return new c($$0 + 1, false);
    }

    public static dha c(int $$0) {
        return new c($$0, true);
    }

    public static dha d(int $$0) {
        return new c($$0 - 1, true);
    }

    public static dha a() {
        return a.a;
    }

    public static dha a(OptionalInt $$0, OptionalInt $$1) {
        if ($$0.isPresent() && $$1.isPresent()) {
            return dha.b($$0.getAsInt(), $$1.getAsInt());
        }
        if ($$0.isPresent()) {
            return dha.c($$0.getAsInt());
        }
        if ($$1.isPresent()) {
            return dha.a($$1.getAsInt());
        }
        return dha.a();
    }

    public abstract OptionalInt b();

    public abstract OptionalInt c();

    public abstract OptionalInt d();

    public dha a(OptionalInt $$0) {
        return dha.a($$0, this.b());
    }

    public dha b(OptionalInt $$0) {
        return dha.a(this.c(), $$0);
    }

    public static Optional<dha> a(cms $$0, gu $$1, int $$2, Predicate<dcb> $$3, Predicate<dcb> $$4) {
        gu.a $$5 = $$1.j();
        if (!$$0.a($$1, $$3)) {
            return Optional.empty();
        }
        int $$6 = $$1.v();
        OptionalInt $$7 = dha.a($$0, $$2, $$3, $$4, $$5, $$6, ha.b);
        OptionalInt $$8 = dha.a($$0, $$2, $$3, $$4, $$5, $$6, ha.a);
        return Optional.of(dha.a($$8, $$7));
    }

    private static OptionalInt a(cms $$0, int $$1, Predicate<dcb> $$2, Predicate<dcb> $$3, gu.a $$4, int $$5, ha $$6) {
        $$4.q($$5);
        for (int $$7 = 1; $$7 < $$1 && $$0.a((gu)$$4, $$2); ++$$7) {
            $$4.c($$6);
        }
        return $$0.a((gu)$$4, $$3) ? OptionalInt.of($$4.v()) : OptionalInt.empty();
    }

    public static final class b
    extends dha {
        private final int a;
        private final int b;

        protected b(int $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
            if (this.g() < 0) {
                throw new IllegalArgumentException("Column of negative height: " + this);
            }
        }

        @Override
        public OptionalInt b() {
            return OptionalInt.of(this.b);
        }

        @Override
        public OptionalInt c() {
            return OptionalInt.of(this.a);
        }

        @Override
        public OptionalInt d() {
            return OptionalInt.of(this.g());
        }

        public int e() {
            return this.b;
        }

        public int f() {
            return this.a;
        }

        public int g() {
            return this.b - this.a - 1;
        }

        public String toString() {
            return "C(" + this.b + "-" + this.a + ")";
        }
    }

    public static final class c
    extends dha {
        private final int a;
        private final boolean b;

        public c(int $$0, boolean $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public OptionalInt b() {
            return this.b ? OptionalInt.empty() : OptionalInt.of(this.a);
        }

        @Override
        public OptionalInt c() {
            return this.b ? OptionalInt.of(this.a) : OptionalInt.empty();
        }

        @Override
        public OptionalInt d() {
            return OptionalInt.empty();
        }

        public String toString() {
            return this.b ? "C(" + this.a + "-)" : "C(-" + this.a + ")";
        }
    }

    public static final class a
    extends dha {
        static final a a = new a();

        private a() {
        }

        @Override
        public OptionalInt b() {
            return OptionalInt.empty();
        }

        @Override
        public OptionalInt c() {
            return OptionalInt.empty();
        }

        @Override
        public OptionalInt d() {
            return OptionalInt.empty();
        }

        public String toString() {
            return "C(-)";
        }
    }
}

