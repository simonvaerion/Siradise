/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractList;

public abstract class qq<T extends rk>
extends AbstractList<T>
implements rk {
    public abstract T d(int var1, T var2);

    public abstract void c(int var1, T var2);

    public abstract T c(int var1);

    public abstract boolean a(int var1, rk var2);

    public abstract boolean b(int var1, rk var2);

    public abstract byte f();

    @Override
    public /* synthetic */ Object remove(int n2) {
        return this.c(n2);
    }

    @Override
    public /* synthetic */ void add(int n2, Object object) {
        this.c(n2, (rk)object);
    }

    @Override
    public /* synthetic */ Object set(int n2, Object object) {
        return this.d(n2, (rk)object);
    }
}

