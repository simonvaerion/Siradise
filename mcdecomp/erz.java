/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record erz(acq c) implements erx
{
    public static final MapCodec<erz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)acq.a.fieldOf("id").forGetter(erz::c)).apply((Applicative)$$0, erz::new));

    @Override
    public ery a() {
        return ery.e;
    }

    @Override
    public Either<erx.a, erx.b> b() {
        return Either.right((Object)new erx.b(this.c));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{erz.class, "id", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{erz.class, "id", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{erz.class, "id", "c"}, this, $$0);
    }
}

