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

public final class dnp
extends Record
implements dms {
    private final int b;
    private final int c;
    private final int d;
    public static final Codec<dnp> a = RecordCodecBuilder.create($$0 -> $$0.group((App)aoi.j.fieldOf("spread_width").forGetter(dnp::a), (App)aoi.j.fieldOf("spread_height").forGetter(dnp::b), (App)aoi.j.fieldOf("max_height").forGetter(dnp::c)).apply((Applicative)$$0, dnp::new));

    public dnp(int $$0, int $$1, int $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dnp.class, "spreadWidth;spreadHeight;maxHeight", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dnp.class, "spreadWidth;spreadHeight;maxHeight", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dnp.class, "spreadWidth;spreadHeight;maxHeight", "b", "c", "d"}, this, $$0);
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
}

