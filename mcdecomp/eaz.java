/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eaz
extends dzl,
BiFunction<cfz, dzk, cfz> {
    public eba b();

    public static Consumer<cfz> a(BiFunction<cfz, dzk, cfz> $$0, Consumer<cfz> $$1, dzk $$2) {
        return $$3 -> $$1.accept((cfz)$$0.apply((cfz)$$3, $$2));
    }

    public static interface a {
        public eaz b();
    }
}

