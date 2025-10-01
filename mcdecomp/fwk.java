/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;

public final class fwk
extends Record {
    private final Map<String, fwa> d;
    public static final Codec<String> a = aoi.b(1, 16);
    public static final Codec<fwk> b = Codec.unboundedMap(a, fwa.a).xmap(fwk::new, fwk::a);
    public static final ajy<fwk> c = ajy.a("language", b);

    public fwk(Map<String, fwa> $$0) {
        this.d = $$0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fwk.class, "languages", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fwk.class, "languages", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fwk.class, "languages", "d"}, this, $$0);
    }

    public Map<String, fwa> a() {
        return this.d;
    }
}

