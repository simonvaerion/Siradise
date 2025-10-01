/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public class bqg<U extends bqf<?>> {
    public static final bqg<bpq> a = bqg.a("dummy", bpq::new);
    public static final bqg<bpx> b = bqg.a("nearest_items", bpx::new);
    public static final bqg<bpy<bfz>> c = bqg.a("nearest_living_entities", bpy::new);
    public static final bqg<bqc> d = bqg.a("nearest_players", bqc::new);
    public static final bqg<bpw> e = bqg.a("nearest_bed", bpw::new);
    public static final bqg<bpu> f = bqg.a("hurt_by", bpu::new);
    public static final bqg<bqj> g = bqg.a("villager_hostiles", bqj::new);
    public static final bqg<bqi> h = bqg.a("villager_babies", bqi::new);
    public static final bqg<bqd> i = bqg.a("secondary_pois", bqd::new);
    public static final bqg<bps> j = bqg.a("golem_detected", bps::new);
    public static final bqg<bqb> k = bqg.a("piglin_specific_sensor", bqb::new);
    public static final bqg<bqa> l = bqg.a("piglin_brute_specific_sensor", bqa::new);
    public static final bqg<bpt> m = bqg.a("hoglin_specific_sensor", bpt::new);
    public static final bqg<bpo> n = bqg.a("nearest_adult", bpo::new);
    public static final bqg<bpp> o = bqg.a("axolotl_attackables", bpp::new);
    public static final bqg<bqh> p = bqg.a("axolotl_temptations", () -> new bqh(bst.a()));
    public static final bqg<bqh> q = bqg.a("goat_temptations", () -> new bqh(bth.a()));
    public static final bqg<bqh> r = bqg.a("frog_temptations", () -> new bqh(btb.a()));
    public static final bqg<bqh> s = bqg.a("camel_temptations", () -> new bqh(bsy.b()));
    public static final bqg<bpr> t = bqg.a("frog_attackables", bpr::new);
    public static final bqg<bpv> u = bqg.a("is_in_water", bpv::new);
    public static final bqg<bqk> v = bqg.a("warden_entity_sensor", bqk::new);
    public static final bqg<bqh> w = bqg.a("sniffer_temptations", () -> new bqh(bty.a()));
    private final Supplier<U> x;

    private bqg(Supplier<U> $$0) {
        this.x = $$0;
    }

    public U a() {
        return (U)((bqf)this.x.get());
    }

    private static <U extends bqf<?>> bqg<U> a(String $$0, Supplier<U> $$1) {
        return hr.a(jb.D, new acq($$0), new bqg<U>($$1));
    }
}

