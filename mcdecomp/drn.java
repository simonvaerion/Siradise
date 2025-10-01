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

public class drn
extends drg {
    public static final Codec<drn> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.INT.fieldOf("max_water_depth").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, drn::new));
    private final int c;

    private drn(int $$0) {
        this.c = $$0;
    }

    public static drn a(int $$0) {
        return new drn($$0);
    }

    @Override
    protected boolean a(drf $$0, apf $$1, gu $$2) {
        int $$3 = $$0.a(dhk.a.d, $$2.u(), $$2.w());
        int $$4 = $$0.a(dhk.a.b, $$2.u(), $$2.w());
        return $$4 - $$3 <= this.c;
    }

    @Override
    public dri<?> b() {
        return dri.d;
    }
}

