/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record zg(int a) implements uo<zb>
{
    public zg(sf $$0) {
        this($$0.m());
    }

    @Override
    public void a(sf $$0) {
        $$0.d(this.a);
    }

    @Override
    public void a(zb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{zg.class, "offset", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zg.class, "offset", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zg.class, "offset", "a"}, this, $$0);
    }
}

