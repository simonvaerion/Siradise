/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

@FunctionalInterface
public interface m {
    public boolean test(char var1);

    default public m and(m $$0) {
        Objects.requireNonNull($$0);
        return $$1 -> this.test($$1) && $$0.test($$1);
    }

    default public m negate() {
        return $$0 -> !this.test($$0);
    }

    default public m or(m $$0) {
        Objects.requireNonNull($$0);
        return $$1 -> this.test($$1) || $$0.test($$1);
    }
}

