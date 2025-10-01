/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 */
import com.google.common.base.Suppliers;
import java.util.function.Supplier;

@Deprecated
public class aov<T> {
    private final Supplier<T> a = Suppliers.memoize($$0::get);

    public aov(Supplier<T> $$0) {
    }

    public T a() {
        return this.a.get();
    }
}

