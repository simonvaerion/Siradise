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

public final class dmp
extends Record
implements dms {
    private final dpb b;
    private final dir c;
    private final bdc d;
    private final int e;
    public static final Codec<dmp> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dpb.a.fieldOf("state_provider").forGetter(dmp::a), (App)dir.b.fieldOf("target").forGetter(dmp::b), (App)bdc.b(0, 8).fieldOf("radius").forGetter(dmp::c), (App)Codec.intRange((int)0, (int)4).fieldOf("half_height").forGetter(dmp::d)).apply((Applicative)$$0, dmp::new));

    public dmp(dpb $$0, dir $$1, bdc $$2, int $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dmp.class, "stateProvider;target;radius;halfHeight", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dmp.class, "stateProvider;target;radius;halfHeight", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dmp.class, "stateProvider;target;radius;halfHeight", "b", "c", "d", "e"}, this, $$0);
    }

    public dpb a() {
        return this.b;
    }

    public dir b() {
        return this.c;
    }

    public bdc c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }
}

