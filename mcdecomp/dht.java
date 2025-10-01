/*
 * Decompiled with CFR 0.152.
 */
public class dht {
    public static final acp<dwh.a> a = dht.a("temperature");
    public static final acp<dwh.a> b = dht.a("vegetation");
    public static final acp<dwh.a> c = dht.a("continentalness");
    public static final acp<dwh.a> d = dht.a("erosion");
    public static final acp<dwh.a> e = dht.a("temperature_large");
    public static final acp<dwh.a> f = dht.a("vegetation_large");
    public static final acp<dwh.a> g = dht.a("continentalness_large");
    public static final acp<dwh.a> h = dht.a("erosion_large");
    public static final acp<dwh.a> i = dht.a("ridge");
    public static final acp<dwh.a> j = dht.a("offset");
    public static final acp<dwh.a> k = dht.a("aquifer_barrier");
    public static final acp<dwh.a> l = dht.a("aquifer_fluid_level_floodedness");
    public static final acp<dwh.a> m = dht.a("aquifer_lava");
    public static final acp<dwh.a> n = dht.a("aquifer_fluid_level_spread");
    public static final acp<dwh.a> o = dht.a("pillar");
    public static final acp<dwh.a> p = dht.a("pillar_rareness");
    public static final acp<dwh.a> q = dht.a("pillar_thickness");
    public static final acp<dwh.a> r = dht.a("spaghetti_2d");
    public static final acp<dwh.a> s = dht.a("spaghetti_2d_elevation");
    public static final acp<dwh.a> t = dht.a("spaghetti_2d_modulator");
    public static final acp<dwh.a> u = dht.a("spaghetti_2d_thickness");
    public static final acp<dwh.a> v = dht.a("spaghetti_3d_1");
    public static final acp<dwh.a> w = dht.a("spaghetti_3d_2");
    public static final acp<dwh.a> x = dht.a("spaghetti_3d_rarity");
    public static final acp<dwh.a> y = dht.a("spaghetti_3d_thickness");
    public static final acp<dwh.a> z = dht.a("spaghetti_roughness");
    public static final acp<dwh.a> A = dht.a("spaghetti_roughness_modulator");
    public static final acp<dwh.a> B = dht.a("cave_entrance");
    public static final acp<dwh.a> C = dht.a("cave_layer");
    public static final acp<dwh.a> D = dht.a("cave_cheese");
    public static final acp<dwh.a> E = dht.a("ore_veininess");
    public static final acp<dwh.a> F = dht.a("ore_vein_a");
    public static final acp<dwh.a> G = dht.a("ore_vein_b");
    public static final acp<dwh.a> H = dht.a("ore_gap");
    public static final acp<dwh.a> I = dht.a("noodle");
    public static final acp<dwh.a> J = dht.a("noodle_thickness");
    public static final acp<dwh.a> K = dht.a("noodle_ridge_a");
    public static final acp<dwh.a> L = dht.a("noodle_ridge_b");
    public static final acp<dwh.a> M = dht.a("jagged");
    public static final acp<dwh.a> N = dht.a("surface");
    public static final acp<dwh.a> O = dht.a("surface_secondary");
    public static final acp<dwh.a> P = dht.a("clay_bands_offset");
    public static final acp<dwh.a> Q = dht.a("badlands_pillar");
    public static final acp<dwh.a> R = dht.a("badlands_pillar_roof");
    public static final acp<dwh.a> S = dht.a("badlands_surface");
    public static final acp<dwh.a> T = dht.a("iceberg_pillar");
    public static final acp<dwh.a> U = dht.a("iceberg_pillar_roof");
    public static final acp<dwh.a> V = dht.a("iceberg_surface");
    public static final acp<dwh.a> W = dht.a("surface_swamp");
    public static final acp<dwh.a> X = dht.a("calcite");
    public static final acp<dwh.a> Y = dht.a("gravel");
    public static final acp<dwh.a> Z = dht.a("powder_snow");
    public static final acp<dwh.a> aa = dht.a("packed_ice");
    public static final acp<dwh.a> ab = dht.a("ice");
    public static final acp<dwh.a> ac = dht.a("soul_sand_layer");
    public static final acp<dwh.a> ad = dht.a("gravel_layer");
    public static final acp<dwh.a> ae = dht.a("patch");
    public static final acp<dwh.a> af = dht.a("netherrack");
    public static final acp<dwh.a> ag = dht.a("nether_wart");
    public static final acp<dwh.a> ah = dht.a("nether_state_selector");

    private static acp<dwh.a> a(String $$0) {
        return acp.a(jc.ax, new acq($$0));
    }

    public static dwh a(hf<dwh.a> $$0, dhx $$1, acp<dwh.a> $$2) {
        he.c<dwh.a> $$3 = $$0.b($$2);
        return dwh.b($$1.a($$3.e().orElseThrow().a()), (dwh.a)$$3.a());
    }
}

