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

public final class ant
extends Record {
    private final int d;
    private final int e;
    public static final Codec<Integer> a = aoi.a(0, 15);
    public static final Codec<ant> b = RecordCodecBuilder.create($$0 -> $$0.group((App)a.fieldOf("block").forGetter(ant::b), (App)a.fieldOf("sky").forGetter(ant::c)).apply((Applicative)$$0, ant::new));
    public static ant c = new ant(15, 15);

    public ant(int $$0, int $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public int a() {
        return this.d << 4 | this.e << 20;
    }

    public static ant a(int $$0) {
        int $$1 = $$0 >> 4 & 0xFFFF;
        int $$2 = $$0 >> 20 & 0xFFFF;
        return new ant($$1, $$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ant.class, "block;sky", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ant.class, "block;sky", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ant.class, "block;sky", "d", "e"}, this, $$0);
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }
}

