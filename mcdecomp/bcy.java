/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class bcy
extends bda {
    public static final bcy a = new bcy(0.0f);
    public static final Codec<bcy> b = Codec.either((Codec)Codec.FLOAT, (Codec)RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.FLOAT.fieldOf("value").forGetter($$0 -> Float.valueOf($$0.d))).apply((Applicative)$$02, bcy::new))).xmap($$02 -> (bcy)$$02.map(bcy::a, $$0 -> $$0), $$0 -> Either.left((Object)Float.valueOf($$0.d)));
    private final float d;

    public static bcy a(float $$0) {
        if ($$0 == 0.0f) {
            return a;
        }
        return new bcy($$0);
    }

    private bcy(float $$0) {
        this.d = $$0;
    }

    public float d() {
        return this.d;
    }

    @Override
    public float a(apf $$0) {
        return this.d;
    }

    @Override
    public float a() {
        return this.d;
    }

    @Override
    public float b() {
        return this.d + 1.0f;
    }

    @Override
    public bdb<?> c() {
        return bdb.a;
    }

    public String toString() {
        return Float.toString(this.d);
    }
}

