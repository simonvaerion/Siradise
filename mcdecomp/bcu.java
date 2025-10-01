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

public class bcu
extends bdc {
    public static final Codec<bcu> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.INT.fieldOf("min_inclusive").forGetter($$0 -> $$0.b), (App)Codec.INT.fieldOf("max_inclusive").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, bcu::new)).comapFlatMap($$0 -> {
        if ($$0.f < $$0.b) {
            return DataResult.error(() -> "Max must be at least min, min_inclusive: " + $$0.b + ", max_inclusive: " + $$0.f);
        }
        return DataResult.success((Object)$$0);
    }, Function.identity());
    private final int b;
    private final int f;

    private bcu(int $$0, int $$1) {
        this.b = $$0;
        this.f = $$1;
    }

    public static bcu a(int $$0, int $$1) {
        return new bcu($$0, $$1);
    }

    @Override
    public int a(apf $$0) {
        return this.b + $$0.a($$0.a(this.f - this.b + 1) + 1);
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public int b() {
        return this.f;
    }

    @Override
    public bdd<?> c() {
        return bdd.c;
    }

    public String toString() {
        return "[" + this.b + "-" + this.f + "]";
    }
}

