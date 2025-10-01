/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.Validate
 */
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class det<T>
implements deo<T> {
    private final hj<T> a;
    @Nullable
    private T b;
    private final dep<T> c;

    public det(hj<T> $$0, dep<T> $$1, List<T> $$2) {
        this.a = $$0;
        this.c = $$1;
        if ($$2.size() > 0) {
            Validate.isTrue(($$2.size() <= 1 ? 1 : 0) != 0, (String)"Can't initialize SingleValuePalette with %d values.", (long)$$2.size());
            this.b = $$2.get(0);
        }
    }

    public static <A> deo<A> a(int $$0, hj<A> $$1, dep<A> $$2, List<A> $$3) {
        return new det<A>($$1, $$2, $$3);
    }

    @Override
    public int a(T $$0) {
        if (this.b == null || this.b == $$0) {
            this.b = $$0;
            return 0;
        }
        return this.c.onResize(1, $$0);
    }

    @Override
    public boolean a(Predicate<T> $$0) {
        if (this.b == null) {
            throw new IllegalStateException("Use of an uninitialized palette");
        }
        return $$0.test(this.b);
    }

    @Override
    public T a(int $$0) {
        if (this.b == null || $$0 != 0) {
            throw new IllegalStateException("Missing Palette entry for id " + $$0 + ".");
        }
        return this.b;
    }

    @Override
    public void a(sf $$0) {
        this.b = this.a.b($$0.m());
    }

    @Override
    public void b(sf $$0) {
        if (this.b == null) {
            throw new IllegalStateException("Use of an uninitialized palette");
        }
        $$0.d(this.a.a(this.b));
    }

    @Override
    public int a() {
        if (this.b == null) {
            throw new IllegalStateException("Use of an uninitialized palette");
        }
        return sf.a(this.a.a(this.b));
    }

    @Override
    public int b() {
        return 1;
    }

    @Override
    public deo<T> c() {
        if (this.b == null) {
            throw new IllegalStateException("Use of an uninitialized palette");
        }
        return this;
    }
}

