/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record vr(th.a a) implements uo<ur>
{
    public vr(sf $$0) {
        this(th.a.a($$0));
    }

    @Override
    public void a(sf $$0) {
        th.a.a($$0, this.a);
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{vr.class, "messageSignature", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vr.class, "messageSignature", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vr.class, "messageSignature", "a"}, this, $$0);
    }
}

