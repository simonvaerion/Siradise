/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record yo(sw a, boolean b) implements uo<ur>
{
    private final boolean b;

    public yo(sf $$0) {
        this($$0.l(), $$0.readBoolean());
    }

    @Override
    public void a(sf $$0) {
        $$0.a(this.a);
        $$0.writeBoolean(this.b);
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
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{yo.class, "content;overlay", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{yo.class, "content;overlay", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{yo.class, "content;overlay", "a", "b"}, this, $$0);
    }

    public boolean c() {
        return this.b;
    }
}

