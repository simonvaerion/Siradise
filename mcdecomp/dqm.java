/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqm
extends dqh {
    public static final Codec<dqm> a = RecordCodecBuilder.create($$02 -> $$02.group((App)bch.b(dqh.c).fieldOf("distribution").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, dqm::new));
    private final bch<dqh> b;

    public dqm(bch<dqh> $$0) {
        this.b = $$0;
    }

    @Override
    public int a(apf $$0, dih $$1) {
        return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
    }

    @Override
    public dqi<?> a() {
        return dqi.f;
    }
}

