/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public class dem<T>
implements deo<T> {
    private final hj<T> a;
    private final T[] b;
    private final dep<T> c;
    private final int d;
    private int e;

    private dem(hj<T> $$0, int $$1, dep<T> $$2, List<T> $$3) {
        this.a = $$0;
        this.b = new Object[1 << $$1];
        this.d = $$1;
        this.c = $$2;
        Validate.isTrue(($$3.size() <= this.b.length ? 1 : 0) != 0, (String)"Can't initialize LinearPalette of size %d with %d entries", (Object[])new Object[]{this.b.length, $$3.size()});
        for (int $$4 = 0; $$4 < $$3.size(); ++$$4) {
            this.b[$$4] = $$3.get($$4);
        }
        this.e = $$3.size();
    }

    private dem(hj<T> $$0, T[] $$1, dep<T> $$2, int $$3, int $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
    }

    public static <A> deo<A> a(int $$0, hj<A> $$1, dep<A> $$2, List<A> $$3) {
        return new dem<A>($$1, $$0, $$2, $$3);
    }

    @Override
    public int a(T $$0) {
        int $$2;
        for (int $$1 = 0; $$1 < this.e; ++$$1) {
            if (this.b[$$1] != $$0) continue;
            return $$1;
        }
        if (($$2 = this.e++) < this.b.length) {
            this.b[$$2] = $$0;
            return $$2;
        }
        return this.c.onResize(this.d + 1, $$0);
    }

    @Override
    public boolean a(Predicate<T> $$0) {
        for (int $$1 = 0; $$1 < this.e; ++$$1) {
            if (!$$0.test(this.b[$$1])) continue;
            return true;
        }
        return false;
    }

    @Override
    public T a(int $$0) {
        if ($$0 >= 0 && $$0 < this.e) {
            return this.b[$$0];
        }
        throw new den($$0);
    }

    @Override
    public void a(sf $$0) {
        this.e = $$0.m();
        for (int $$1 = 0; $$1 < this.e; ++$$1) {
            this.b[$$1] = this.a.b($$0.m());
        }
    }

    @Override
    public void b(sf $$0) {
        $$0.d(this.e);
        for (int $$1 = 0; $$1 < this.e; ++$$1) {
            $$0.d(this.a.a(this.b[$$1]));
        }
    }

    @Override
    public int a() {
        int $$0 = sf.a(this.b());
        for (int $$1 = 0; $$1 < this.b(); ++$$1) {
            $$0 += sf.a(this.a.a(this.b[$$1]));
        }
        return $$0;
    }

    @Override
    public int b() {
        return this.e;
    }

    @Override
    public deo<T> c() {
        return new dem<Object>(this.a, (Object[])this.b.clone(), this.c, this.d, this.e);
    }
}

