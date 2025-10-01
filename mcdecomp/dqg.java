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

public class dqg
extends dqh {
    public static final dqg a = new dqg(die.a(0));
    public static final Codec<dqg> b = Codec.either(die.a, (Codec)RecordCodecBuilder.create($$02 -> $$02.group((App)die.a.fieldOf("value").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, dqg::new))).xmap($$02 -> (dqg)$$02.map(dqg::a, $$0 -> $$0), $$0 -> Either.left((Object)$$0.d));
    private final die d;

    public static dqg a(die $$0) {
        return new dqg($$0);
    }

    private dqg(die $$0) {
        this.d = $$0;
    }

    public die b() {
        return this.d;
    }

    @Override
    public int a(apf $$0, dih $$1) {
        return this.d.a($$1);
    }

    @Override
    public dqi<?> a() {
        return dqi.a;
    }

    public String toString() {
        return this.d.toString();
    }
}

