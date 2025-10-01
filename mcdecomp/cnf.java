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

public final class cnf
extends Record {
    private final cma d;
    private final caw e;
    public static final String a = "enabled_features";
    public static final Codec<cnf> b = RecordCodecBuilder.create($$0 -> $$0.group((App)cma.b.optionalFieldOf("DataPacks", (Object)cma.a).forGetter(cnf::a), (App)cay.d.optionalFieldOf(a, (Object)cay.f).forGetter(cnf::b)).apply((Applicative)$$0, cnf::new));
    public static final cnf c = new cnf(cma.a, cay.f);

    public cnf(cma $$0, caw $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public cnf a(caw $$0) {
        return new cnf(this.d, this.e.b($$0));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cnf.class, "dataPacks;enabledFeatures", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cnf.class, "dataPacks;enabledFeatures", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cnf.class, "dataPacks;enabledFeatures", "d", "e"}, this, $$0);
    }

    public cma a() {
        return this.d;
    }

    public caw b() {
        return this.e;
    }
}

