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

public class dmw
implements dms {
    public static final Codec<dmw> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.intRange((int)0, (int)dfk.c).fieldOf("height").forGetter($$0 -> $$0.b), (App)dcb.b.fieldOf("state").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, dmw::new));
    public final int b;
    public final dcb c;

    public dmw(int $$0, dcb $$1) {
        this.b = $$0;
        this.c = $$1;
    }
}

