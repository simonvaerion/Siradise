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

public class cnh {
    public static final Codec<cnh> a = RecordCodecBuilder.create($$02 -> $$02.group((App)amg.b.fieldOf("sound").forGetter($$0 -> $$0.b), (App)Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, cnh::new));
    private final he<amg> b;
    private final double c;

    public cnh(he<amg> $$0, double $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public he<amg> a() {
        return this.b;
    }

    public double b() {
        return this.c;
    }
}

