/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public record bbp<T extends bbo>(T a, T b, @Nullable T c, int d, Map<Integer, Double> e, Duration f) {
    public static <T extends bbo> bbp<T> a(List<T> $$02) {
        if ($$02.isEmpty()) {
            throw new IllegalArgumentException("No values");
        }
        List<bbo> $$1 = $$02.stream().sorted(Comparator.comparing(bbo::a)).toList();
        Duration $$2 = $$1.stream().map(bbo::a).reduce(Duration::plus).orElse(Duration.ZERO);
        bbo $$3 = $$1.get(0);
        bbo $$4 = $$1.get($$1.size() - 1);
        bbo $$5 = $$1.size() > 1 ? $$1.get($$1.size() - 2) : null;
        int $$6 = $$1.size();
        Map<Integer, Double> $$7 = bau.a($$1.stream().mapToLong($$0 -> $$0.a().toNanos()).toArray());
        return new bbp<bbo>($$3, $$4, $$5, $$6, $$7, $$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bbp.class, "fastest;slowest;secondSlowest;count;percentilesNanos;totalDuration", "a", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bbp.class, "fastest;slowest;secondSlowest;count;percentilesNanos;totalDuration", "a", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bbp.class, "fastest;slowest;secondSlowest;count;percentilesNanos;totalDuration", "a", "b", "c", "d", "e", "f"}, this, $$0);
    }
}

