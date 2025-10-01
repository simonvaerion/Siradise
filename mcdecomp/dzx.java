/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface dzx {
    public static final dzx a = ($$0, $$1) -> false;
    public static final dzx b = ($$0, $$1) -> true;

    public boolean expand(dzk var1, Consumer<eae> var2);

    default public dzx and(dzx $$0) {
        Objects.requireNonNull($$0);
        return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
    }

    default public dzx or(dzx $$0) {
        Objects.requireNonNull($$0);
        return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
    }
}

