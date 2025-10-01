/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record esy(int a, int b) {
    public static esy a(esw $$0, int $$1, int $$2) {
        return switch ($$0) {
            default -> throw new IncompatibleClassChangeError();
            case esw.a -> new esy($$1, $$2);
            case esw.b -> new esy($$2, $$1);
        };
    }

    public esy a(esx $$0) {
        return switch ($$0) {
            default -> throw new IncompatibleClassChangeError();
            case esx.b -> new esy(this.a, this.b + 1);
            case esx.a -> new esy(this.a, this.b - 1);
            case esx.c -> new esy(this.a - 1, this.b);
            case esx.d -> new esy(this.a + 1, this.b);
        };
    }

    public int a(esw $$0) {
        return switch ($$0) {
            default -> throw new IncompatibleClassChangeError();
            case esw.a -> this.a;
            case esw.b -> this.b;
        };
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{esy.class, "x;y", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{esy.class, "x;y", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{esy.class, "x;y", "a", "b"}, this, $$0);
    }
}

