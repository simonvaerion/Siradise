/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Stream;

public record uf(acq a) implements tx
{
    @Override
    public Stream<qr> getData(ds $$0) {
        qr $$1 = $$0.l().aG().a(this.a);
        return Stream.of($$1);
    }

    @Override
    public String toString() {
        return "storage=" + this.a;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{uf.class, "id", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{uf.class, "id", "a"}, this, $$0);
    }
}

