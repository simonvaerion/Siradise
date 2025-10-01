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

public class dvl
extends dvn {
    public static final Codec<dvl> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dcb.b.fieldOf("block_state").forGetter($$0 -> $$0.b), (App)Codec.FLOAT.fieldOf("probability").forGetter($$0 -> Float.valueOf($$0.d))).apply((Applicative)$$02, dvl::new));
    private final dcb b;
    private final float d;

    public dvl(dcb $$0, float $$1) {
        this.b = $$0;
        this.d = $$1;
    }

    @Override
    public boolean a(dcb $$0, apf $$1) {
        return $$0 == this.b && $$1.i() < this.d;
    }

    @Override
    protected dvo<?> a() {
        return dvo.f;
    }
}

