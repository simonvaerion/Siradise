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
import java.util.List;

public final class ank
extends Record {
    private final List<anj> b;
    private final boolean c;
    public static final Codec<ank> a = RecordCodecBuilder.create($$0 -> $$0.group((App)anj.a.listOf().fieldOf("values").forGetter(ank::a), (App)Codec.BOOL.optionalFieldOf("replace", (Object)false).forGetter(ank::b)).apply((Applicative)$$0, ank::new));

    public ank(List<anj> $$0, boolean $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ank.class, "entries;replace", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ank.class, "entries;replace", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ank.class, "entries;replace", "b", "c"}, this, $$0);
    }

    public List<anj> a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }
}

