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

public final class dnf
extends Record
implements dms {
    private final int b;
    private final int c;
    private final int d;
    private final he<dre> e;
    public static final Codec<dnf> a = RecordCodecBuilder.create($$0 -> $$0.group((App)aoi.j.fieldOf("tries").orElse((Object)128).forGetter(dnf::a), (App)aoi.i.fieldOf("xz_spread").orElse((Object)7).forGetter(dnf::b), (App)aoi.i.fieldOf("y_spread").orElse((Object)3).forGetter(dnf::c), (App)dre.b.fieldOf("feature").forGetter(dnf::d)).apply((Applicative)$$0, dnf::new));

    public dnf(int $$0, int $$1, int $$2, he<dre> $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dnf.class, "tries;xzSpread;ySpread;feature", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dnf.class, "tries;xzSpread;ySpread;feature", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dnf.class, "tries;xzSpread;ySpread;feature", "b", "c", "d", "e"}, this, $$0);
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public he<dre> d() {
        return this.e;
    }
}

