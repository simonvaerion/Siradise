/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public interface cje<T extends cjc<?>> {
    public static final cje<cjh> a = cje.a("crafting_shaped", new cjh.a());
    public static final cje<cji> b = cje.a("crafting_shapeless", new cji.a());
    public static final cje<cim> c = cje.a("crafting_special_armordye", new cjm<cim>(cim::new));
    public static final cje<cip> d = cje.a("crafting_special_bookcloning", new cjm<cip>(cip::new));
    public static final cje<cja> e = cje.a("crafting_special_mapcloning", new cjm<cja>(cja::new));
    public static final cje<cjb> f = cje.a("crafting_special_mapextending", new cjm<cjb>(cjb::new));
    public static final cje<ciw> g = cje.a("crafting_special_firework_rocket", new cjm<ciw>(ciw::new));
    public static final cje<ciy> h = cje.a("crafting_special_firework_star", new cjm<ciy>(ciy::new));
    public static final cje<cix> i = cje.a("crafting_special_firework_star_fade", new cjm<cix>(cix::new));
    public static final cje<cjv> j = cje.a("crafting_special_tippedarrow", new cjm<cjv>(cjv::new));
    public static final cje<cin> k = cje.a("crafting_special_bannerduplicate", new cjm<cin>(cin::new));
    public static final cje<cjj> l = cje.a("crafting_special_shielddecoration", new cjm<cjj>(cjj::new));
    public static final cje<cjk> m = cje.a("crafting_special_shulkerboxcoloring", new cjm<cjk>(cjk::new));
    public static final cje<cju> n = cje.a("crafting_special_suspiciousstew", new cjm<cju>(cju::new));
    public static final cje<cjg> o = cje.a("crafting_special_repairitem", new cjm<cjg>(cjg::new));
    public static final cje<cjo> p = cje.a("smelting", new cjl<cjo>(cjo::new, 200));
    public static final cje<cio> q = cje.a("blasting", new cjl<cio>(cio::new, 100));
    public static final cje<cjs> r = cje.a("smoking", new cjl<cjs>(cjs::new, 100));
    public static final cje<ciq> s = cje.a("campfire_cooking", new cjl<ciq>(ciq::new, 100));
    public static final cje<cjt> t = cje.a("stonecutting", new cjn.a<cjt>(cjt::new));
    public static final cje<cjq> u = cje.a("smithing_transform", new cjq.a());
    public static final cje<cjr> v = cje.a("smithing_trim", new cjr.a());
    public static final cje<civ> w = cje.a("crafting_decorated_pot", new cjm<civ>(civ::new));

    public T a(acq var1, JsonObject var2);

    public T a(acq var1, sf var2);

    public void a(sf var1, T var2);

    public static <S extends cje<T>, T extends cjc<?>> S a(String $$0, S $$1) {
        return (S)hr.a(jb.u, $$0, $$1);
    }
}

