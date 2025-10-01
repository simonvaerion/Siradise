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

public class drc
extends drl {
    public static final Codec<drc> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.INT.fieldOf("noise_to_count_ratio").forGetter($$0 -> $$0.c), (App)Codec.DOUBLE.fieldOf("noise_factor").forGetter($$0 -> $$0.d), (App)Codec.DOUBLE.fieldOf("noise_offset").orElse((Object)0.0).forGetter($$0 -> $$0.e)).apply((Applicative)$$02, drc::new));
    private final int c;
    private final double d;
    private final double e;

    private drc(int $$0, double $$1, double $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public static drc a(int $$0, double $$1, double $$2) {
        return new drc($$0, $$1, $$2);
    }

    @Override
    protected int a(apf $$0, gu $$1) {
        double $$2 = cnk.e.a((double)$$1.u() / this.d, (double)$$1.w() / this.d, false);
        return (int)Math.ceil(($$2 + this.e) * (double)this.c);
    }

    @Override
    public dri<?> b() {
        return dri.g;
    }
}

