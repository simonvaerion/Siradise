/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;

public record edz(Path a, Path b) {
    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{edz.class, "link;target", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{edz.class, "link;target", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{edz.class, "link;target", "a", "b"}, this, $$0);
    }
}

