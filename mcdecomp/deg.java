/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class deg<T>
implements deo<T> {
    private final hj<T> a;
    private final any<T> b;
    private final dep<T> c;
    private final int d;

    public deg(hj<T> $$0, int $$1, dep<T> $$2, List<T> $$3) {
        this($$0, $$1, $$2);
        $$3.forEach(this.b::c);
    }

    public deg(hj<T> $$0, int $$1, dep<T> $$2) {
        this($$0, $$1, $$2, any.c(1 << $$1));
    }

    private deg(hj<T> $$0, int $$1, dep<T> $$2, any<T> $$3) {
        this.a = $$0;
        this.d = $$1;
        this.c = $$2;
        this.b = $$3;
    }

    public static <A> deo<A> a(int $$0, hj<A> $$1, dep<A> $$2, List<A> $$3) {
        return new deg<A>($$1, $$0, $$2, $$3);
    }

    @Override
    public int a(T $$0) {
        int $$1 = this.b.a($$0);
        if ($$1 == -1 && ($$1 = this.b.c($$0)) >= 1 << this.d) {
            $$1 = this.c.onResize(this.d + 1, $$0);
        }
        return $$1;
    }

    @Override
    public boolean a(Predicate<T> $$0) {
        for (int $$1 = 0; $$1 < this.b(); ++$$1) {
            if (!$$0.test(this.b.a($$1))) continue;
            return true;
        }
        return false;
    }

    @Override
    public T a(int $$0) {
        T $$1 = this.b.a($$0);
        if ($$1 == null) {
            throw new den($$0);
        }
        return $$1;
    }

    @Override
    public void a(sf $$0) {
        this.b.a();
        int $$1 = $$0.m();
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            this.b.c(this.a.b($$0.m()));
        }
    }

    @Override
    public void b(sf $$0) {
        int $$1 = this.b();
        $$0.d($$1);
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            $$0.d(this.a.a(this.b.a($$2)));
        }
    }

    @Override
    public int a() {
        int $$0 = sf.a(this.b());
        for (int $$1 = 0; $$1 < this.b(); ++$$1) {
            $$0 += sf.a(this.a.a(this.b.a($$1)));
        }
        return $$0;
    }

    public List<T> d() {
        ArrayList $$0 = new ArrayList();
        this.b.iterator().forEachRemaining($$0::add);
        return $$0;
    }

    @Override
    public int b() {
        return this.b.b();
    }

    @Override
    public deo<T> c() {
        return new deg<T>(this.a, this.d, this.c, this.b.c());
    }
}

