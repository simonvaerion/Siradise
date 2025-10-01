/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import javax.annotation.Nullable;

public final class bes
extends Record {
    private final String i;
    public static final bes a = new bes("generic");
    public static final bes b = new bes("ladder");
    public static final bes c = new bes("vines");
    public static final bes d = new bes("weeping_vines");
    public static final bes e = new bes("twisting_vines");
    public static final bes f = new bes("scaffolding");
    public static final bes g = new bes("other_climbable");
    public static final bes h = new bes("water");

    public bes(String $$0) {
        this.i = $$0;
    }

    public static bes a(dcb $$0) {
        if ($$0.a(cpo.cO) || $$0.a(amw.P)) {
            return b;
        }
        if ($$0.a(cpo.ff)) {
            return c;
        }
        if ($$0.a(cpo.oz) || $$0.a(cpo.oA)) {
            return d;
        }
        if ($$0.a(cpo.oB) || $$0.a(cpo.oC)) {
            return e;
        }
        if ($$0.a(cpo.nS)) {
            return f;
        }
        return g;
    }

    @Nullable
    public static bes a(bfz $$0) {
        Optional<gu> $$1 = $$0.eD();
        if ($$1.isPresent()) {
            dcb $$2 = $$0.dI().a_($$1.get());
            return bes.a($$2);
        }
        if ($$0.aV()) {
            return h;
        }
        return null;
    }

    public String a() {
        return "death.fell.accident." + this.i;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bes.class, "id", "i"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bes.class, "id", "i"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bes.class, "id", "i"}, this, $$0);
    }

    public String b() {
        return this.i;
    }
}

