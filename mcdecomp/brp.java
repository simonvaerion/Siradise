/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class brp
extends Record {
    private final acq l;
    public static final acp<brp> a = brp.a("tabby");
    public static final acp<brp> b = brp.a("black");
    public static final acp<brp> c = brp.a("red");
    public static final acp<brp> d = brp.a("siamese");
    public static final acp<brp> e = brp.a("british_shorthair");
    public static final acp<brp> f = brp.a("calico");
    public static final acp<brp> g = brp.a("persian");
    public static final acp<brp> h = brp.a("ragdoll");
    public static final acp<brp> i = brp.a("white");
    public static final acp<brp> j = brp.a("jellie");
    public static final acp<brp> k = brp.a("all_black");

    public brp(acq $$0) {
        this.l = $$0;
    }

    private static acp<brp> a(String $$0) {
        return acp.a(jc.j, new acq($$0));
    }

    public static brp a(hr<brp> $$0) {
        brp.a($$0, a, "textures/entity/cat/tabby.png");
        brp.a($$0, b, "textures/entity/cat/black.png");
        brp.a($$0, c, "textures/entity/cat/red.png");
        brp.a($$0, d, "textures/entity/cat/siamese.png");
        brp.a($$0, e, "textures/entity/cat/british_shorthair.png");
        brp.a($$0, f, "textures/entity/cat/calico.png");
        brp.a($$0, g, "textures/entity/cat/persian.png");
        brp.a($$0, h, "textures/entity/cat/ragdoll.png");
        brp.a($$0, i, "textures/entity/cat/white.png");
        brp.a($$0, j, "textures/entity/cat/jellie.png");
        return brp.a($$0, k, "textures/entity/cat/all_black.png");
    }

    private static brp a(hr<brp> $$0, acp<brp> $$1, String $$2) {
        return hr.a($$0, $$1, new brp(new acq($$2)));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{brp.class, "texture", "l"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{brp.class, "texture", "l"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{brp.class, "texture", "l"}, this, $$0);
    }

    public acq a() {
        return this.l;
    }
}

