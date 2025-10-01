/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public interface ecd<T extends ecd<T>> {
    public T b(eck.a var1);

    default public <E> T a_(Iterable<E> $$0, Function<E, eck.a> $$1) {
        T $$2 = this.d();
        for (E $$3 : $$0) {
            $$2 = $$2.b($$1.apply($$3));
        }
        return $$2;
    }

    public T d();
}

