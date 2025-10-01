/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dji
extends dnc {
    public static final MapCodec<dji> d = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").forGetter($$0 -> Float.valueOf($$0.l)), (App)dqh.c.fieldOf("y").forGetter($$0 -> $$0.e), (App)bda.c.fieldOf("yScale").forGetter($$0 -> $$0.f), (App)die.a.fieldOf("lava_level").forGetter($$0 -> $$0.g), (App)djj.b.optionalFieldOf("debug_settings", (Object)djj.a).forGetter($$0 -> $$0.h), (App)ht.a(jc.e).fieldOf("replaceable").forGetter($$0 -> $$0.i)).apply((Applicative)$$02, dji::new));
    public final dqh e;
    public final bda f;
    public final die g;
    public final djj h;
    public final hi<cpn> i;

    public dji(float $$0, dqh $$1, bda $$2, die $$3, djj $$4, hi<cpn> $$5) {
        super($$0);
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
    }
}

