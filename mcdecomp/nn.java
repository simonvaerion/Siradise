/*
 * Decompiled with CFR 0.152.
 */
public class nn {
    public static final acp<djn<?>> a = nn.a("cave");
    public static final acp<djn<?>> b = nn.a("cave_extra_underground");
    public static final acp<djn<?>> c = nn.a("canyon");
    public static final acp<djn<?>> d = nn.a("nether_cave");

    private static acp<djn<?>> a(String $$0) {
        return acp.a(jc.ar, new acq($$0));
    }

    public static void a(nm<djn<?>> $$0) {
        hf<cpn> $$1 = $$0.a(jc.e);
        $$0.a(a, djp.a.a(new djl(0.15f, dqk.a(die.b(8), die.a(180)), bdh.b(0.1f, 0.9f), die.b(8), djj.a(false, cpo.oS.n()), $$1.b(amw.bg), bdh.b(0.7f, 1.4f), bdh.b(0.8f, 1.3f), bdh.b(-1.0f, -0.4f))));
        $$0.a(b, djp.a.a(new djl(0.07f, dqk.a(die.b(8), die.a(47)), bdh.b(0.1f, 0.9f), die.b(8), djj.a(false, cpo.gv.n()), $$1.b(amw.bg), bdh.b(0.7f, 1.4f), bdh.b(0.8f, 1.3f), bdh.b(-1.0f, -0.4f))));
        $$0.a(c, djp.c.a(new djg(0.01f, dqk.a(die.a(10), die.a(67)), bcy.a(3.0f), die.b(8), djj.a(false, cpo.oT.n()), $$1.b(amw.bg), bdh.b(-0.125f, 0.125f), new djg.a(bdh.b(0.75f, 1.0f), bdg.a(0.0f, 6.0f, 2.0f), 3, bdh.b(0.75f, 1.0f), 1.0f, 0.0f))));
        $$0.a(d, djp.b.a(new djl(0.2f, dqk.a(die.a(0), die.c(1)), bcy.a(0.5f), die.b(10), $$1.b(amw.bh), bcy.a(1.0f), bcy.a(1.0f), bcy.a(-0.7f))));
    }
}

