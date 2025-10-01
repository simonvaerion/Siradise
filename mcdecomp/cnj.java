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

public class cnj {
    public static final Codec<cnj> a = RecordCodecBuilder.create($$02 -> $$02.group((App)iv.aR.fieldOf("options").forGetter($$0 -> $$0.b), (App)Codec.FLOAT.fieldOf("probability").forGetter($$0 -> Float.valueOf($$0.c))).apply((Applicative)$$02, cnj::new));
    private final it b;
    private final float c;

    public cnj(it $$0, float $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public it a() {
        return this.b;
    }

    public boolean a(apf $$0) {
        return $$0.i() <= this.c;
    }
}

