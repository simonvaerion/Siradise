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

public class bcw
extends bda {
    public static final Codec<bcw> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.FLOAT.fieldOf("mean").forGetter($$0 -> Float.valueOf($$0.b)), (App)Codec.FLOAT.fieldOf("deviation").forGetter($$0 -> Float.valueOf($$0.d)), (App)Codec.FLOAT.fieldOf("min").forGetter($$0 -> Float.valueOf($$0.e)), (App)Codec.FLOAT.fieldOf("max").forGetter($$0 -> Float.valueOf($$0.f))).apply((Applicative)$$02, bcw::new)).comapFlatMap($$0 -> {
        if ($$0.f < $$0.e) {
            return DataResult.error(() -> "Max must be larger than min: [" + $$0.e + ", " + $$0.f + "]");
        }
        return DataResult.success((Object)$$0);
    }, Function.identity());
    private final float b;
    private final float d;
    private final float e;
    private final float f;

    public static bcw a(float $$0, float $$1, float $$2, float $$3) {
        return new bcw($$0, $$1, $$2, $$3);
    }

    private bcw(float $$0, float $$1, float $$2, float $$3) {
        this.b = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    @Override
    public float a(apf $$0) {
        return bcw.a($$0, this.b, this.d, this.e, this.f);
    }

    public static float a(apf $$0, float $$1, float $$2, float $$3, float $$4) {
        return apa.a(apa.c($$0, $$1, $$2), $$3, $$4);
    }

    @Override
    public float a() {
        return this.e;
    }

    @Override
    public float b() {
        return this.f;
    }

    @Override
    public bdb<?> c() {
        return bdb.c;
    }

    public String toString() {
        return "normal(" + this.b + ", " + this.d + ") in [" + this.e + "-" + this.f + "]";
    }
}

