/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.Validate
 */
import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class hn<E>
extends AbstractList<E> {
    private final List<E> a;
    @Nullable
    private final E b;

    public static <E> hn<E> a() {
        return new hn<Object>(Lists.newArrayList(), null);
    }

    public static <E> hn<E> a(int $$0) {
        return new hn<Object>(Lists.newArrayListWithCapacity((int)$$0), null);
    }

    public static <E> hn<E> a(int $$0, E $$1) {
        Validate.notNull($$1);
        Object[] $$2 = new Object[$$0];
        Arrays.fill($$2, $$1);
        return new hn<Object>(Arrays.asList($$2), $$1);
    }

    @SafeVarargs
    public static <E> hn<E> a(E $$0, E ... $$1) {
        return new hn<E>(Arrays.asList($$1), $$0);
    }

    protected hn(List<E> $$0, @Nullable E $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    @Nonnull
    public E get(int $$0) {
        return this.a.get($$0);
    }

    @Override
    public E set(int $$0, E $$1) {
        Validate.notNull($$1);
        return this.a.set($$0, $$1);
    }

    @Override
    public void add(int $$0, E $$1) {
        Validate.notNull($$1);
        this.a.add($$0, $$1);
    }

    @Override
    public E remove(int $$0) {
        return this.a.remove($$0);
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public void clear() {
        if (this.b == null) {
            super.clear();
        } else {
            for (int $$0 = 0; $$0 < this.size(); ++$$0) {
                this.set($$0, this.b);
            }
        }
    }
}

