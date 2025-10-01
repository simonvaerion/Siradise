/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public interface dri<P extends drh> {
    public static final dri<dqt> a = dri.a("block_predicate_filter", dqt.a);
    public static final dri<drk> b = dri.a("rarity_filter", drk.a);
    public static final dri<drm> c = dri.a("surface_relative_threshold_filter", drm.a);
    public static final dri<drn> d = dri.a("surface_water_depth_filter", drn.a);
    public static final dri<dqs> e = dri.a("biome", dqs.a);
    public static final dri<dqx> f = dri.a("count", dqx.a);
    public static final dri<drc> g = dri.a("noise_based_count", drc.a);
    public static final dri<drd> h = dri.a("noise_threshold_count", drd.a);
    public static final dri<dqw> i = dri.a("count_on_every_layer", dqw.a);
    public static final dri<dqy> j = dri.a("environment_scan", dqy.a);
    public static final dri<dra> k = dri.a("heightmap", dra.a);
    public static final dri<dqz> l = dri.a("height_range", dqz.a);
    public static final dri<drb> m = dri.a("in_square", drb.a);
    public static final dri<drj> n = dri.a("random_offset", drj.a);
    public static final dri<dqu> o = dri.a("carving_mask", dqu.a);

    public Codec<P> codec();

    private static <P extends drh> dri<P> a(String $$0, Codec<P> $$1) {
        return hr.a(jb.V, $$0, () -> $$1);
    }
}

