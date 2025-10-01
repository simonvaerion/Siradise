/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Stream;

public final class dkb<FC extends dms, F extends dko<FC>>
extends Record {
    private final F d;
    private final FC e;
    public static final Codec<dkb<?, ?>> a = jb.R.q().dispatch($$0 -> $$0.d, dko::a);
    public static final Codec<he<dkb<?, ?>>> b = acm.a(jc.as, a);
    public static final Codec<hi<dkb<?, ?>>> c = ht.a(jc.as, a);

    public dkb(F $$0, FC $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public boolean a(cng $$0, ddy $$1, apf $$2, gu $$3) {
        return ((dko)this.d).a(this.e, $$0, $$1, $$2, $$3);
    }

    public Stream<dkb<?, ?>> a() {
        return Stream.concat(Stream.of(this), this.e.e());
    }

    @Override
    public String toString() {
        return "Configured: " + this.d + ": " + this.e;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dkb.class, "feature;config", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dkb.class, "feature;config", "d", "e"}, this, $$0);
    }

    public F b() {
        return this.d;
    }

    public FC c() {
        return this.e;
    }
}

