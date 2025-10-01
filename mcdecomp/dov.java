/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public class dov
extends dox {
    public static final Codec<dov> b = RecordCodecBuilder.create($$02 -> $$02.group((App)aot.a(Codec.INT, 1, 64).fieldOf("variety").forGetter($$0 -> $$0.i), (App)dwh.a.a.fieldOf("slow_noise").forGetter($$0 -> $$0.j), (App)aoi.k.fieldOf("slow_scale").forGetter($$0 -> Float.valueOf($$0.k))).and(dov.b($$02)).apply((Applicative)$$02, dov::new));
    private final aot<Integer> i;
    private final dwh.a j;
    private final float k;
    private final dwh l;

    public dov(aot<Integer> $$0, dwh.a $$1, float $$2, long $$3, dwh.a $$4, float $$5, List<dcb> $$6) {
        super($$3, $$4, $$5, $$6);
        this.i = $$0;
        this.j = $$1;
        this.k = $$2;
        this.l = dwh.b(new dij(new dhl($$3)), $$1);
    }

    @Override
    protected dou<?> a() {
        return dou.e;
    }

    @Override
    public dcb a(apf $$0, gu $$1) {
        double $$2 = this.a($$1);
        int $$3 = (int)apa.a($$2, -1.0, 1.0, (double)this.i.a().intValue(), (double)(this.i.b() + 1));
        ArrayList $$4 = Lists.newArrayListWithCapacity((int)$$3);
        for (int $$5 = 0; $$5 < $$3; ++$$5) {
            $$4.add(this.a(this.h, this.a($$1.b($$5 * 54545, 0, $$5 * 34234))));
        }
        return this.a($$4, $$1, this.e);
    }

    protected double a(gu $$0) {
        return this.l.a((float)$$0.u() * this.k, (float)$$0.v() * this.k, (float)$$0.w() * this.k);
    }
}

