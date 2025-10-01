/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class bdh
extends bda {
    public static final Codec<bdh> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.FLOAT.fieldOf("min_inclusive").forGetter($$0 -> Float.valueOf($$0.b)), (App)Codec.FLOAT.fieldOf("max_exclusive").forGetter($$0 -> Float.valueOf($$0.d))).apply((Applicative)$$02, bdh::new)).comapFlatMap($$0 -> {
        if ($$0.d <= $$0.b) {
            return DataResult.error(() -> "Max must be larger than min, min_inclusive: " + $$0.b + ", max_exclusive: " + $$0.d);
        }
        return DataResult.success((Object)$$0);
    }, Function.identity());
    private final float b;
    private final float d;

    private bdh(float $$0, float $$1) {
        this.b = $$0;
        this.d = $$1;
    }

    public static bdh b(float $$0, float $$1) {
        if ($$1 <= $$0) {
            throw new IllegalArgumentException("Max must exceed min");
        }
        return new bdh($$0, $$1);
    }

    @Override
    public float a(apf $$0) {
        return apa.b($$0, this.b, this.d);
    }

    @Override
    public float a() {
        return this.b;
    }

    @Override
    public float b() {
        return this.d;
    }

    @Override
    public bdb<?> c() {
        return bdb.b;
    }

    public String toString() {
        return "[" + this.b + "-" + this.d + "]";
    }
}

