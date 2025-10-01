/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record zj(tm.a a) implements uo<zb>
{
    public zj(sf $$0) {
        this(tm.a.a($$0));
    }

    @Override
    public void a(sf $$0) {
        tm.a.a($$0, this.a);
    }

    @Override
    public void a(zb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{zj.class, "chatSession", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zj.class, "chatSession", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zj.class, "chatSession", "a"}, this, $$0);
    }
}

