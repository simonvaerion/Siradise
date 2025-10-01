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

public class bcz
extends bdc {
    public static final bcz a = new bcz(0);
    public static final Codec<bcz> b = Codec.either((Codec)Codec.INT, (Codec)RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.INT.fieldOf("value").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, bcz::new))).xmap($$02 -> (bcz)$$02.map(bcz::a, $$0 -> $$0), $$0 -> Either.left((Object)$$0.f));
    private final int f;

    public static bcz a(int $$0) {
        if ($$0 == 0) {
            return a;
        }
        return new bcz($$0);
    }

    private bcz(int $$0) {
        this.f = $$0;
    }

    public int d() {
        return this.f;
    }

    @Override
    public int a(apf $$0) {
        return this.f;
    }

    @Override
    public int a() {
        return this.f;
    }

    @Override
    public int b() {
        return this.f;
    }

    @Override
    public bdd<?> c() {
        return bdd.a;
    }

    public String toString() {
        return Integer.toString(this.f);
    }
}

