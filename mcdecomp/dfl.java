/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dfl
extends Record {
    private final he<dfk> e;
    private final ddy f;
    public static final Codec<dfl> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dfk.j.fieldOf("type").forGetter(dfl::a), (App)ddy.a.fieldOf("generator").forGetter(dfl::b)).apply((Applicative)$$0, $$0.stable(dfl::new)));
    public static final acp<dfl> b = acp.a(jc.aI, new acq("overworld"));
    public static final acp<dfl> c = acp.a(jc.aI, new acq("the_nether"));
    public static final acp<dfl> d = acp.a(jc.aI, new acq("the_end"));

    public dfl(he<dfk> $$0, ddy $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dfl.class, "type;generator", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dfl.class, "type;generator", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dfl.class, "type;generator", "e", "f"}, this, $$0);
    }

    public he<dfk> a() {
        return this.e;
    }

    public ddy b() {
        return this.f;
    }
}

