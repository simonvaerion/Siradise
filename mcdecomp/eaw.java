/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.function.Function;

public interface eaw<T extends eaw<T>> {
    public T b(eaz.a var1);

    default public <E> T a(Iterable<E> $$0, Function<E, eaz.a> $$1) {
        T $$2 = this.c();
        for (E $$3 : $$0) {
            $$2 = $$2.b($$1.apply($$3));
        }
        return $$2;
    }

    default public <E> T a(E[] $$0, Function<E, eaz.a> $$1) {
        return this.a(Arrays.asList($$0), $$1);
    }

    public T c();
}

