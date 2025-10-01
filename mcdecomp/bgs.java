/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

public interface bgs {
    public static final bgs b = new bgs(){

        @Override
        public cfz a() {
            return cfz.b;
        }

        @Override
        public boolean a(cfz $$0) {
            return false;
        }
    };

    public static bgs a(final bdq $$0, final int $$1, final Predicate<cfz> $$2) {
        return new bgs(){

            @Override
            public cfz a() {
                return $$0.a($$1);
            }

            @Override
            public boolean a(cfz $$02) {
                if (!$$2.test($$02)) {
                    return false;
                }
                $$0.a($$1, $$02);
                return true;
            }
        };
    }

    public static bgs a(bdq $$02, int $$1) {
        return bgs.a($$02, $$1, (cfz $$0) -> true);
    }

    public static bgs a(final bfz $$0, final bfo $$1, final Predicate<cfz> $$2) {
        return new bgs(){

            @Override
            public cfz a() {
                return $$0.c($$1);
            }

            @Override
            public boolean a(cfz $$02) {
                if (!$$2.test($$02)) {
                    return false;
                }
                $$0.a($$1, $$02);
                return true;
            }
        };
    }

    public static bgs a(bfz $$02, bfo $$1) {
        return bgs.a($$02, $$1, (cfz $$0) -> true);
    }

    public cfz a();

    public boolean a(cfz var1);
}

