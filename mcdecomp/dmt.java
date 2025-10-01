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

public class dmt
implements dms {
    public static final Codec<Double> a = Codec.doubleRange((double)0.0, (double)1.0);
    public static final Codec<dmt> b = RecordCodecBuilder.create($$02 -> $$02.group((App)dhh.i.fieldOf("blocks").forGetter($$0 -> $$0.c), (App)dhj.a.fieldOf("layers").forGetter($$0 -> $$0.d), (App)dhi.a.fieldOf("crack").forGetter($$0 -> $$0.e), (App)a.fieldOf("use_potential_placements_chance").orElse((Object)0.35).forGetter($$0 -> $$0.f), (App)a.fieldOf("use_alternate_layer0_chance").orElse((Object)0.0).forGetter($$0 -> $$0.g), (App)Codec.BOOL.fieldOf("placements_require_layer0_alternate").orElse((Object)true).forGetter($$0 -> $$0.h), (App)bdc.b(1, 20).fieldOf("outer_wall_distance").orElse((Object)bdi.a(4, 5)).forGetter($$0 -> $$0.i), (App)bdc.b(1, 20).fieldOf("distribution_points").orElse((Object)bdi.a(3, 4)).forGetter($$0 -> $$0.j), (App)bdc.b(0, 10).fieldOf("point_offset").orElse((Object)bdi.a(1, 2)).forGetter($$0 -> $$0.k), (App)Codec.INT.fieldOf("min_gen_offset").orElse((Object)-16).forGetter($$0 -> $$0.l), (App)Codec.INT.fieldOf("max_gen_offset").orElse((Object)16).forGetter($$0 -> $$0.n), (App)a.fieldOf("noise_multiplier").orElse((Object)0.05).forGetter($$0 -> $$0.o), (App)Codec.INT.fieldOf("invalid_blocks_threshold").forGetter($$0 -> $$0.p)).apply((Applicative)$$02, dmt::new));
    public final dhh c;
    public final dhj d;
    public final dhi e;
    public final double f;
    public final double g;
    public final boolean h;
    public final bdc i;
    public final bdc j;
    public final bdc k;
    public final int l;
    public final int n;
    public final double o;
    public final int p;

    public dmt(dhh $$0, dhj $$1, dhi $$2, double $$3, double $$4, boolean $$5, bdc $$6, bdc $$7, bdc $$8, int $$9, int $$10, double $$11, int $$12) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
        this.i = $$6;
        this.j = $$7;
        this.k = $$8;
        this.l = $$9;
        this.n = $$10;
        this.o = $$11;
        this.p = $$12;
    }
}

