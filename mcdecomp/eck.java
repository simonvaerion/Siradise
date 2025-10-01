/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

public interface eck
extends dzl,
Predicate<dzk> {
    public ecl b();

    @FunctionalInterface
    public static interface a {
        public eck build();

        default public a invert() {
            return ech.a(this);
        }

        default public ebz.a or(a $$0) {
            return ebz.a(this, $$0);
        }

        default public eby.a and(a $$0) {
            return eby.a(this, $$0);
        }
    }
}

