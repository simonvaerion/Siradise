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
import java.util.List;

public class doy
extends dow {
    public static final Codec<doy> b = RecordCodecBuilder.create($$02 -> doy.a($$02).and($$02.group((App)Codec.floatRange((float)-1.0f, (float)1.0f).fieldOf("threshold").forGetter($$0 -> Float.valueOf($$0.g)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("high_chance").forGetter($$0 -> Float.valueOf($$0.h)), (App)dcb.b.fieldOf("default_state").forGetter($$0 -> $$0.i), (App)Codec.list(dcb.b).fieldOf("low_states").forGetter($$0 -> $$0.j), (App)Codec.list(dcb.b).fieldOf("high_states").forGetter($$0 -> $$0.k))).apply((Applicative)$$02, doy::new));
    private final float g;
    private final float h;
    private final dcb i;
    private final List<dcb> j;
    private final List<dcb> k;

    public doy(long $$0, dwh.a $$1, float $$2, float $$3, float $$4, dcb $$5, List<dcb> $$6, List<dcb> $$7) {
        super($$0, $$1, $$2);
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
        this.j = $$6;
        this.k = $$7;
    }

    @Override
    protected dou<?> a() {
        return dou.c;
    }

    @Override
    public dcb a(apf $$0, gu $$1) {
        double $$2 = this.a($$1, this.e);
        if ($$2 < (double)this.g) {
            return ac.a(this.j, $$0);
        }
        if ($$0.i() < this.h) {
            return ac.a(this.k, $$0);
        }
        return this.i;
    }
}

