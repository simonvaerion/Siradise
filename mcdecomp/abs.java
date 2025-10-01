/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record abs(abt a) implements uo<abq>
{
    public abs(sf $$0) {
        this($$0.a(abt.a));
    }

    @Override
    public void a(sf $$0) {
        $$0.a(abt.a, this.a);
    }

    @Override
    public void a(abq $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{abs.class, "status", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{abs.class, "status", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{abs.class, "status", "a"}, this, $$0);
    }
}

