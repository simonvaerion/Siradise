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

public class bcx
extends bdc {
    public static final Codec<bcx> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.FLOAT.fieldOf("mean").forGetter($$0 -> Float.valueOf($$0.b)), (App)Codec.FLOAT.fieldOf("deviation").forGetter($$0 -> Float.valueOf($$0.f)), (App)Codec.INT.fieldOf("min_inclusive").forGetter($$0 -> $$0.g), (App)Codec.INT.fieldOf("max_inclusive").forGetter($$0 -> $$0.h)).apply((Applicative)$$02, bcx::new)).comapFlatMap($$0 -> {
        if ($$0.h < $$0.g) {
            return DataResult.error(() -> "Max must be larger than min: [" + $$0.g + ", " + $$0.h + "]");
        }
        return DataResult.success((Object)$$0);
    }, Function.identity());
    private final float b;
    private final float f;
    private final int g;
    private final int h;

    public static bcx a(float $$0, float $$1, int $$2, int $$3) {
        return new bcx($$0, $$1, $$2, $$3);
    }

    private bcx(float $$0, float $$1, int $$2, int $$3) {
        this.b = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
    }

    @Override
    public int a(apf $$0) {
        return bcx.a($$0, this.b, this.f, this.g, this.h);
    }

    public static int a(apf $$0, float $$1, float $$2, float $$3, float $$4) {
        return (int)apa.a(apa.c($$0, $$1, $$2), $$3, $$4);
    }

    @Override
    public int a() {
        return this.g;
    }

    @Override
    public int b() {
        return this.h;
    }

    @Override
    public bdd<?> c() {
        return bdd.f;
    }

    public String toString() {
        return "normal(" + this.b + ", " + this.f + ") in [" + this.g + "-" + this.h + "]";
    }
}

