/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.Optional;

public class cid {
    public static final acp<cic> a = cid.a("quartz");
    public static final acp<cic> b = cid.a("iron");
    public static final acp<cic> c = cid.a("netherite");
    public static final acp<cic> d = cid.a("redstone");
    public static final acp<cic> e = cid.a("copper");
    public static final acp<cic> f = cid.a("gold");
    public static final acp<cic> g = cid.a("emerald");
    public static final acp<cic> h = cid.a("diamond");
    public static final acp<cic> i = cid.a("lapis");
    public static final acp<cic> j = cid.a("amethyst");

    public static void a(nm<cic> $$0) {
        cid.a($$0, a, cgc.nN, ts.a.a(14931140), 0.1f);
        cid.a($$0, b, cgc.nQ, ts.a.a(0xECECEC), 0.2f, Map.of(cdl.c, "iron_darker"));
        cid.a($$0, c, cgc.nV, ts.a.a(6445145), 0.3f, Map.of(cdl.g, "netherite_darker"));
        cid.a($$0, d, cgc.ll, ts.a.a(9901575), 0.4f);
        cid.a($$0, e, cgc.nS, ts.a.a(11823181), 0.5f);
        cid.a($$0, f, cgc.nU, ts.a.a(14594349), 0.6f, Map.of(cdl.d, "gold_darker"));
        cid.a($$0, g, cgc.nL, ts.a.a(1155126), 0.7f);
        cid.a($$0, h, cgc.nK, ts.a.a(7269586), 0.8f, Map.of(cdl.e, "diamond_darker"));
        cid.a($$0, i, cgc.nM, ts.a.a(4288151), 0.9f);
        cid.a($$0, j, cgc.nO, ts.a.a(10116294), 1.0f);
    }

    public static Optional<he.c<cic>> a(hs $$0, cfz $$12) {
        return $$0.d(jc.aD).h().filter($$1 -> $$12.a(((cic)$$1.a()).b())).findFirst();
    }

    private static void a(nm<cic> $$0, acp<cic> $$1, cfu $$2, ts $$3, float $$4) {
        cid.a($$0, $$1, $$2, $$3, $$4, Map.of());
    }

    private static void a(nm<cic> $$0, acp<cic> $$1, cfu $$2, ts $$3, float $$4, Map<cdl, String> $$5) {
        cic $$6 = cic.a($$1.a().a(), $$2, $$4, sw.c(ac.a("trim_material", $$1.a())).c($$3), $$5);
        $$0.a($$1, $$6);
    }

    private static acp<cic> a(String $$0) {
        return acp.a(jc.aD, new acq($$0));
    }
}

