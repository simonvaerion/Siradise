/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record erp(fkf a, fkf b, fkf c) {
    public static erp a(acq $$0) {
        return new erp(fkf.s($$0), fkf.w($$0), fkf.u($$0));
    }

    public static erp b(acq $$0) {
        return new erp(fkf.r($$0), fkf.v($$0), fkf.t($$0));
    }

    public fkf a(eov.a $$0) {
        return switch ($$0) {
            default -> throw new IncompatibleClassChangeError();
            case eov.a.a -> this.a;
            case eov.a.b -> this.b;
            case eov.a.c -> this.c;
        };
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{erp.class, "normal;seeThrough;polygonOffset", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{erp.class, "normal;seeThrough;polygonOffset", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{erp.class, "normal;seeThrough;polygonOffset", "a", "b", "c"}, this, $$0);
    }
}

