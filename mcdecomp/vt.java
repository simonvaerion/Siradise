/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record vt(sw a, ss.b b) implements uo<ur>
{
    private final ss.b b;

    public vt(sf $$0) {
        this($$0.l(), new ss.b($$0));
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.a);
        this.b.a($$0);
    }

    @Override
    public void a(ur $$0) {
        $$0.a(this);
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{vt.class, "message;chatType", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vt.class, "message;chatType", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vt.class, "message;chatType", "a", "b"}, this, $$0);
    }

    public ss.b c() {
        return this.b;
    }
}

