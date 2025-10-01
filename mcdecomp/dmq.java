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

public class dmq
implements dms {
    public static final Codec<dmq> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.intRange((int)1, (int)512).fieldOf("floor_to_ceiling_search_range").forGetter($$0 -> $$0.b), (App)bdc.b(1, 128).fieldOf("height").forGetter($$0 -> $$0.c), (App)bdc.b(1, 128).fieldOf("radius").forGetter($$0 -> $$0.d), (App)Codec.intRange((int)0, (int)64).fieldOf("max_stalagmite_stalactite_height_diff").forGetter($$0 -> $$0.e), (App)Codec.intRange((int)1, (int)64).fieldOf("height_deviation").forGetter($$0 -> $$0.f), (App)bdc.b(0, 128).fieldOf("dripstone_block_layer_thickness").forGetter($$0 -> $$0.g), (App)bda.a(0.0f, 2.0f).fieldOf("density").forGetter($$0 -> $$0.h), (App)bda.a(0.0f, 2.0f).fieldOf("wetness").forGetter($$0 -> $$0.i), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("chance_of_dripstone_column_at_max_distance_from_center").forGetter($$0 -> Float.valueOf($$0.j)), (App)Codec.intRange((int)1, (int)64).fieldOf("max_distance_from_edge_affecting_chance_of_dripstone_column").forGetter($$0 -> $$0.k), (App)Codec.intRange((int)1, (int)64).fieldOf("max_distance_from_center_affecting_height_bias").forGetter($$0 -> $$0.l)).apply((Applicative)$$02, dmq::new));
    public final int b;
    public final bdc c;
    public final bdc d;
    public final int e;
    public final int f;
    public final bdc g;
    public final bda h;
    public final bda i;
    public final float j;
    public final int k;
    public final int l;

    public dmq(int $$0, bdc $$1, bdc $$2, int $$3, int $$4, bdc $$5, bda $$6, bda $$7, float $$8, int $$9, int $$10) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
        this.j = $$8;
        this.k = $$9;
        this.l = $$10;
    }
}

