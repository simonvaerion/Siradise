/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;

@FunctionalInterface
public interface apv {
    public long get(TimeUnit var1);

    public static interface a
    extends apv,
    LongSupplier {
        @Override
        default public long get(TimeUnit $$0) {
            return $$0.convert(this.getAsLong(), TimeUnit.NANOSECONDS);
        }
    }
}

