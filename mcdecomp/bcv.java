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

public class bcv
extends bdc {
    public static final Codec<bcv> a = RecordCodecBuilder.create($$02 -> $$02.group((App)bdc.c.fieldOf("source").forGetter($$0 -> $$0.b), (App)Codec.INT.fieldOf("min_inclusive").forGetter($$0 -> $$0.f), (App)Codec.INT.fieldOf("max_inclusive").forGetter($$0 -> $$0.g)).apply((Applicative)$$02, bcv::new)).comapFlatMap($$0 -> {
        if ($$0.g < $$0.f) {
            return DataResult.error(() -> "Max must be at least min, min_inclusive: " + $$0.f + ", max_inclusive: " + $$0.g);
        }
        return DataResult.success((Object)$$0);
    }, Function.identity());
    private final bdc b;
    private final int f;
    private final int g;

    public static bcv a(bdc $$0, int $$1, int $$2) {
        return new bcv($$0, $$1, $$2);
    }

    public bcv(bdc $$0, int $$1, int $$2) {
        this.b = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    @Override
    public int a(apf $$0) {
        return apa.a(this.b.a($$0), this.f, this.g);
    }

    @Override
    public int a() {
        return Math.max(this.f, this.b.a());
    }

    @Override
    public int b() {
        return Math.min(this.g, this.b.b());
    }

    @Override
    public bdd<?> c() {
        return bdd.d;
    }
}

