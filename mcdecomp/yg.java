/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record yg(int a) implements uo<ur>
{
    public yg(sf $$0) {
        this($$0.m());
    }

    @Override
    public void a(sf $$0) {
        $$0.d(this.a);
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{yg.class, "simulationDistance", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{yg.class, "simulationDistance", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{yg.class, "simulationDistance", "a"}, this, $$0);
    }
}

