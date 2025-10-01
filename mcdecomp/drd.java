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

public class drd
extends drl {
    public static final Codec<drd> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.DOUBLE.fieldOf("noise_level").forGetter($$0 -> $$0.c), (App)Codec.INT.fieldOf("below_noise").forGetter($$0 -> $$0.d), (App)Codec.INT.fieldOf("above_noise").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, drd::new));
    private final double c;
    private final int d;
    private final int e;

    private drd(double $$0, int $$1, int $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public static drd a(double $$0, int $$1, int $$2) {
        return new drd($$0, $$1, $$2);
    }

    @Override
    protected int a(apf $$0, gu $$1) {
        double $$2 = cnk.e.a((double)$$1.u() / 200.0, (double)$$1.w() / 200.0, false);
        return $$2 < this.c ? this.d : this.e;
    }

    @Override
    public dri<?> b() {
        return dri.h;
    }
}

