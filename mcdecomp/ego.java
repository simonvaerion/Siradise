/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  it.unimi.dsi.fastutil.ints.IntSets
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import javax.annotation.Nullable;

public class ego
implements egm {
    private final Int2ObjectMap<egl.a> a;

    public ego(Map<Integer, Float> $$02) {
        this.a = new Int2ObjectOpenHashMap($$02.size());
        $$02.forEach(($$0, $$1) -> this.a.put($$0.intValue(), () -> $$1.floatValue()));
    }

    @Override
    @Nullable
    public egl a(int $$0) {
        return (egl)this.a.get($$0);
    }

    @Override
    public IntSet a() {
        return IntSets.unmodifiable((IntSet)this.a.keySet());
    }

    public record a(Map<Integer, Float> c) implements erx
    {
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.unboundedMap(aoi.v, (Codec)Codec.FLOAT).fieldOf("advances").forGetter(a::c)).apply((Applicative)$$0, a::new));

        @Override
        public ery a() {
            return ery.c;
        }

        @Override
        public Either<erx.a, erx.b> b() {
            erx.a $$02 = $$0 -> new ego(this.c);
            return Either.left((Object)$$02);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "advances", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "advances", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "advances", "c"}, this, $$0);
        }
    }
}

