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

public class dnn
implements dms {
    public static final Codec<dnn> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dxe.a.fieldOf("state").forGetter($$0 -> $$0.b), (App)Codec.BOOL.fieldOf("requires_block_below").orElse((Object)true).forGetter($$0 -> $$0.c), (App)Codec.INT.fieldOf("rock_count").orElse((Object)4).forGetter($$0 -> $$0.d), (App)Codec.INT.fieldOf("hole_count").orElse((Object)1).forGetter($$0 -> $$0.e), (App)ht.a(jc.e).fieldOf("valid_blocks").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, dnn::new));
    public final dxe b;
    public final boolean c;
    public final int d;
    public final int e;
    public final hi<cpn> f;

    public dnn(dxe $$0, boolean $$1, int $$2, int $$3, hi<cpn> $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }
}

