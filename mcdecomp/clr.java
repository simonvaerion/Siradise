/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record clr(gu a, cpn b, int c, int d) {
    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{clr.class, "pos;block;paramA;paramB", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{clr.class, "pos;block;paramA;paramB", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{clr.class, "pos;block;paramA;paramB", "a", "b", "c", "d"}, this, $$0);
    }
}

