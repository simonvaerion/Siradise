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

public class dvk
extends dvn {
    public static final Codec<dvk> a = RecordCodecBuilder.create($$02 -> $$02.group((App)jb.f.q().fieldOf("block").forGetter($$0 -> $$0.b), (App)Codec.FLOAT.fieldOf("probability").forGetter($$0 -> Float.valueOf($$0.d))).apply((Applicative)$$02, dvk::new));
    private final cpn b;
    private final float d;

    public dvk(cpn $$0, float $$1) {
        this.b = $$0;
        this.d = $$1;
    }

    @Override
    public boolean a(dcb $$0, apf $$1) {
        return $$0.a(this.b) && $$1.i() < this.d;
    }

    @Override
    protected dvo<?> a() {
        return dvo.e;
    }
}

