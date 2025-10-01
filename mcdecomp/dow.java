/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P3
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class dow
extends dot {
    protected final long c;
    protected final dwh.a d;
    protected final float e;
    protected final dwh f;

    protected static <P extends dow> Products.P3<RecordCodecBuilder.Mu<P>, Long, dwh.a, Float> a(RecordCodecBuilder.Instance<P> $$02) {
        return $$02.group((App)Codec.LONG.fieldOf("seed").forGetter($$0 -> $$0.c), (App)dwh.a.a.fieldOf("noise").forGetter($$0 -> $$0.d), (App)aoi.k.fieldOf("scale").forGetter($$0 -> Float.valueOf($$0.e)));
    }

    protected dow(long $$0, dwh.a $$1, float $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = dwh.b(new dij(new dhl($$0)), $$1);
    }

    protected double a(gu $$0, double $$1) {
        return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
    }
}

