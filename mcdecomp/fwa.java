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

public record fwa(String b, String c, boolean d) {
    public static final Codec<fwa> a = RecordCodecBuilder.create($$0 -> $$0.group((App)aoi.u.fieldOf("region").forGetter(fwa::b), (App)aoi.u.fieldOf("name").forGetter(fwa::c), (App)Codec.BOOL.optionalFieldOf("bidirectional", (Object)false).forGetter(fwa::d)).apply((Applicative)$$0, fwa::new));

    public sw a() {
        return sw.b(this.c + " (" + this.b + ")");
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fwa.class, "region;name;bidirectional", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fwa.class, "region;name;bidirectional", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fwa.class, "region;name;bidirectional", "b", "c", "d"}, this, $$0);
    }
}

