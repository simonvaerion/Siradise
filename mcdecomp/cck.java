/*
 * Decompiled with CFR 0.152.
 */
public class cck<T extends cbf>
implements cat {
    public static final cck<cbm> a = cck.a("generic_9x1", cbm::a);
    public static final cck<cbm> b = cck.a("generic_9x2", cbm::b);
    public static final cck<cbm> c = cck.a("generic_9x3", cbm::c);
    public static final cck<cbm> d = cck.a("generic_9x4", cbm::d);
    public static final cck<cbm> e = cck.a("generic_9x5", cbm::e);
    public static final cck<cbm> f = cck.a("generic_9x6", cbm::f);
    public static final cck<cbw> g = cck.a("generic_3x3", cbw::new);
    public static final cck<cbh> h = cck.a("anvil", cbh::new);
    public static final cck<cbi> i = cck.a("beacon", cbi::new);
    public static final cck<cbj> j = cck.a("blast_furnace", cbj::new);
    public static final cck<cbk> k = cck.a("brewing_stand", cbk::new);
    public static final cck<cbu> l = cck.a("crafting", cbu::new);
    public static final cck<cbx> m = cck.a("enchantment", cbx::new);
    public static final cck<cbz> n = cck.a("furnace", cbz::new);
    public static final cck<ccb> o = cck.a("grindstone", ccb::new);
    public static final cck<ccc> p = cck.a("hopper", ccc::new);
    public static final cck<cch> q = cck.a("lectern", ($$0, $$1) -> new cch($$0));
    public static final cck<cci> r = cck.a("loom", cci::new);
    public static final cck<ccm> s = cck.a("merchant", ccm::new);
    public static final cck<ccu> t = cck.a("shulker_box", ccu::new);
    public static final cck<ccy> u = cck.a("smithing", ccy::new);
    public static final cck<ccz> v = cck.a("smoker", ccz::new);
    public static final cck<cbl> w = cck.a("cartography_table", cbl::new);
    public static final cck<cdb> x = cck.a("stonecutter", cdb::new);
    private final caw y;
    private final a<T> z;

    private static <T extends cbf> cck<T> a(String $$0, a<T> $$1) {
        return hr.a(jb.s, $$0, new cck<T>($$1, cay.e));
    }

    private static <T extends cbf> cck<T> a(String $$0, a<T> $$1, cau ... $$2) {
        return hr.a(jb.s, $$0, new cck<T>($$1, cay.c.a($$2)));
    }

    private cck(a<T> $$0, caw $$1) {
        this.z = $$0;
        this.y = $$1;
    }

    public T a(int $$0, byn $$1) {
        return this.z.create($$0, $$1);
    }

    @Override
    public caw m() {
        return this.y;
    }

    static interface a<T extends cbf> {
        public T create(int var1, byn var2);
    }
}

