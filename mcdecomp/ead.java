/*
 * Decompiled with CFR 0.152.
 */
public class ead {
    public static final eag a = ead.a("empty", new eaa.a());
    public static final eag b = ead.a("item", new eac.a());
    public static final eag c = ead.a("loot_table", new eai.a());
    public static final eag d = ead.a("dynamic", new dzz.a());
    public static final eag e = ead.a("tag", new eak.a());
    public static final eag f = ead.a("alternatives", dzy.a(dzw::new));
    public static final eag g = ead.a("sequence", dzy.a(eaj::new));
    public static final eag h = ead.a("group", dzy.a(eab::new));

    private static eag a(String $$0, dzt<? extends eaf> $$1) {
        return hr.a(jb.G, new acq($$0), new eag($$1));
    }

    public static Object a() {
        return dzi.a(jb.G, "entry", "type", eaf::a).a();
    }
}

