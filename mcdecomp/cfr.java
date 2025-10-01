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

public final class cfr
extends Record {
    private final he<amg> b;
    private final int c;
    private final float d;
    public static final Codec<cfr> a = RecordCodecBuilder.create($$0 -> $$0.group((App)amg.b.fieldOf("sound_event").forGetter(cfr::a), (App)aoi.j.fieldOf("use_duration").forGetter(cfr::b), (App)aoi.k.fieldOf("range").forGetter(cfr::c)).apply((Applicative)$$0, cfr::new));

    public cfr(he<amg> $$0, int $$1, float $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cfr.class, "soundEvent;useDuration;range", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cfr.class, "soundEvent;useDuration;range", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cfr.class, "soundEvent;useDuration;range", "b", "c", "d"}, this, $$0);
    }

    public he<amg> a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public float c() {
        return this.d;
    }
}

