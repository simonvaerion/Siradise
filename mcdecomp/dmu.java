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

public class dmu
implements dms {
    public static final Codec<dmu> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dot.a.fieldOf("cap_provider").forGetter($$0 -> $$0.b), (App)dot.a.fieldOf("stem_provider").forGetter($$0 -> $$0.c), (App)Codec.INT.fieldOf("foliage_radius").orElse((Object)2).forGetter($$0 -> $$0.d)).apply((Applicative)$$02, dmu::new));
    public final dot b;
    public final dot c;
    public final int d;

    public dmu(dot $$0, dot $$1, int $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }
}

