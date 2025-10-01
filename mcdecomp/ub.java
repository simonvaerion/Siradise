/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class ub
extends Record
implements sx {
    private final String b;

    public ub(String $$0) {
        this.b = $$0;
    }

    @Override
    public <T> Optional<T> a(ta.a<T> $$0) {
        return $$0.accept(this.b);
    }

    @Override
    public <T> Optional<T> a(ta.b<T> $$0, ts $$1) {
        return $$0.accept($$1, this.b);
    }

    @Override
    public String toString() {
        return "literal{" + this.b + "}";
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ub.class, "text", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ub.class, "text", "b"}, this, $$0);
    }

    public String a() {
        return this.b;
    }
}

