/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;

public abstract class dnt {
    public static final Codec<dnt> a = jb.ab.q().dispatch(dnt::b, dnu::a);
    protected static final int b = 16;
    protected final OptionalInt c;

    protected static <S extends dnt> RecordCodecBuilder<S, OptionalInt> a() {
        return Codec.intRange((int)0, (int)80).optionalFieldOf("min_clipped_height").xmap($$0 -> $$0.map(OptionalInt::of).orElse(OptionalInt.empty()), $$0 -> $$0.isPresent() ? Optional.of($$0.getAsInt()) : Optional.empty()).forGetter($$0 -> $$0.c);
    }

    public dnt(OptionalInt $$0) {
        this.c = $$0;
    }

    protected abstract dnu<?> b();

    public abstract int a(int var1, int var2);

    public OptionalInt c() {
        return this.c;
    }
}

