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

public class cni {
    public static final Codec<cni> a = RecordCodecBuilder.create($$02 -> $$02.group((App)amg.b.fieldOf("sound").forGetter($$0 -> $$0.c), (App)Codec.INT.fieldOf("tick_delay").forGetter($$0 -> $$0.d), (App)Codec.INT.fieldOf("block_search_extent").forGetter($$0 -> $$0.e), (App)Codec.DOUBLE.fieldOf("offset").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, cni::new));
    public static final cni b = new cni(amh.h, 6000, 8, 2.0);
    private final he<amg> c;
    private final int d;
    private final int e;
    private final double f;

    public cni(he<amg> $$0, int $$1, int $$2, double $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    public he<amg> a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public double d() {
        return this.f;
    }
}

