/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;

public final class djn<WC extends dji>
extends Record {
    private final djp<WC> d;
    private final WC e;
    public static final Codec<djn<?>> a = jb.Q.q().dispatch($$0 -> $$0.d, djp::c);
    public static final Codec<he<djn<?>>> b = acm.a(jc.ar, a);
    public static final Codec<hi<djn<?>>> c = ht.a(jc.ar, a);

    public djn(djp<WC> $$0, WC $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public boolean a(apf $$0) {
        return this.d.a(this.e, $$0);
    }

    public boolean a(djk $$0, ddx $$1, Function<gu, he<cnk>> $$2, apf $$3, dgw $$4, clt $$5, ddw $$6) {
        if (aa.a($$1.f())) {
            return false;
        }
        return this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{djn.class, "worldCarver;config", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{djn.class, "worldCarver;config", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{djn.class, "worldCarver;config", "d", "e"}, this, $$0);
    }

    public djp<WC> a() {
        return this.d;
    }

    public WC b() {
        return this.e;
    }
}

