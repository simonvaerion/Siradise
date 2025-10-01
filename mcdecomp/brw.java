/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class brw
extends Record {
    private final acq d;
    public static final brw a = brw.a("temperate", "textures/entity/frog/temperate_frog.png");
    public static final brw b = brw.a("warm", "textures/entity/frog/warm_frog.png");
    public static final brw c = brw.a("cold", "textures/entity/frog/cold_frog.png");

    public brw(acq $$0) {
        this.d = $$0;
    }

    private static brw a(String $$0, String $$1) {
        return hr.a(jb.ak, $$0, new brw(new acq($$1)));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{brw.class, "texture", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{brw.class, "texture", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{brw.class, "texture", "d"}, this, $$0);
    }

    public acq a() {
        return this.d;
    }
}

