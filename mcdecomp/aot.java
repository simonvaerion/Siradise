/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class aot<T extends Comparable<T>>
extends Record {
    private final T b;
    private final T c;
    public static final Codec<aot<Integer>> a = aot.a(Codec.INT);

    public aot(T $$0, T $$1) {
        if ($$0.compareTo($$1) > 0) {
            throw new IllegalArgumentException("min_inclusive must be less than or equal to max_inclusive");
        }
        this.b = $$0;
        this.c = $$1;
    }

    public static <T extends Comparable<T>> Codec<aot<T>> a(Codec<T> $$0) {
        return aoi.a($$0, "min_inclusive", "max_inclusive", aot::a, aot::a, aot::b);
    }

    public static <T extends Comparable<T>> Codec<aot<T>> a(Codec<T> $$0, T $$1, T $$22) {
        return aoi.a(aot.a($$0), (T $$2) -> {
            if ($$2.a().compareTo($$1) < 0) {
                return DataResult.error(() -> "Range limit too low, expected at least " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]");
            }
            if ($$2.b().compareTo($$22) > 0) {
                return DataResult.error(() -> "Range limit too high, expected at most " + $$22 + " [" + $$2.a() + "-" + $$2.b() + "]");
            }
            return DataResult.success((Object)$$2);
        });
    }

    public static <T extends Comparable<T>> DataResult<aot<T>> a(T $$0, T $$1) {
        if ($$0.compareTo($$1) <= 0) {
            return DataResult.success(new aot<T>($$0, $$1));
        }
        return DataResult.error(() -> "min_inclusive must be less than or equal to max_inclusive");
    }

    public boolean a(T $$0) {
        return $$0.compareTo(this.b) >= 0 && $$0.compareTo(this.c) <= 0;
    }

    public boolean a(aot<T> $$0) {
        return $$0.a().compareTo(this.b) >= 0 && $$0.c.compareTo(this.c) <= 0;
    }

    @Override
    public String toString() {
        return "[" + this.b + ", " + this.c + "]";
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aot.class, "minInclusive;maxInclusive", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aot.class, "minInclusive;maxInclusive", "b", "c"}, this, $$0);
    }

    public T a() {
        return this.b;
    }

    public T b() {
        return this.c;
    }
}

