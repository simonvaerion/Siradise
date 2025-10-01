/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record tf(th a, boolean b) {
    private final th a;
    private final boolean b;

    public tf a() {
        return this.b ? new tf(this.a, false) : this;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{tf.class, "signature;pending", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{tf.class, "signature;pending", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{tf.class, "signature;pending", "a", "b"}, this, $$0);
    }

    public th b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }
}

