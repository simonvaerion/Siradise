/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.function.Predicate;

public class def<T>
implements deo<T> {
    private final hj<T> a;

    public def(hj<T> $$0) {
        this.a = $$0;
    }

    public static <A> deo<A> a(int $$0, hj<A> $$1, dep<A> $$2, List<A> $$3) {
        return new def<A>($$1);
    }

    @Override
    public int a(T $$0) {
        int $$1 = this.a.a($$0);
        return $$1 == -1 ? 0 : $$1;
    }

    @Override
    public boolean a(Predicate<T> $$0) {
        return true;
    }

    @Override
    public T a(int $$0) {
        T $$1 = this.a.a($$0);
        if ($$1 == null) {
            throw new den($$0);
        }
        return $$1;
    }

    @Override
    public void a(sf $$0) {
    }

    @Override
    public void b(sf $$0) {
    }

    @Override
    public int a() {
        return sf.a(0);
    }

    @Override
    public int b() {
        return this.a.b();
    }

    @Override
    public deo<T> c() {
        return this;
    }
}

