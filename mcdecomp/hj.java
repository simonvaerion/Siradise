/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public interface hj<T>
extends Iterable<T> {
    public static final int a = -1;

    public int a(T var1);

    @Nullable
    public T a(int var1);

    default public T b(int $$0) {
        T $$1 = this.a($$0);
        if ($$1 == null) {
            throw new IllegalArgumentException("No value with id " + $$0);
        }
        return $$1;
    }

    public int b();
}

