/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class cif {
    public static final acp<cie> a = cif.a("sentry");
    public static final acp<cie> b = cif.a("dune");
    public static final acp<cie> c = cif.a("coast");
    public static final acp<cie> d = cif.a("wild");
    public static final acp<cie> e = cif.a("ward");
    public static final acp<cie> f = cif.a("eye");
    public static final acp<cie> g = cif.a("vex");
    public static final acp<cie> h = cif.a("tide");
    public static final acp<cie> i = cif.a("snout");
    public static final acp<cie> j = cif.a("rib");
    public static final acp<cie> k = cif.a("spire");
    public static final acp<cie> l = cif.a("wayfinder");
    public static final acp<cie> m = cif.a("shaper");
    public static final acp<cie> n = cif.a("silence");
    public static final acp<cie> o = cif.a("raiser");
    public static final acp<cie> p = cif.a("host");

    public static void a(nm<cie> $$0) {
        cif.a($$0, cgc.wx, a);
        cif.a($$0, cgc.wy, b);
        cif.a($$0, cgc.wz, c);
        cif.a($$0, cgc.wA, d);
        cif.a($$0, cgc.wB, e);
        cif.a($$0, cgc.wC, f);
        cif.a($$0, cgc.wD, g);
        cif.a($$0, cgc.wE, h);
        cif.a($$0, cgc.wF, i);
        cif.a($$0, cgc.wG, j);
        cif.a($$0, cgc.wH, k);
        cif.a($$0, cgc.wI, l);
        cif.a($$0, cgc.wJ, m);
        cif.a($$0, cgc.wK, n);
        cif.a($$0, cgc.wL, o);
        cif.a($$0, cgc.wM, p);
    }

    public static Optional<he.c<cie>> a(hs $$0, cfz $$12) {
        return $$0.d(jc.aE).h().filter($$1 -> $$12.a(((cie)$$1.a()).b())).findFirst();
    }

    private static void a(nm<cie> $$0, cfu $$1, acp<cie> $$2) {
        cie $$3 = new cie($$2.a(), jb.i.d($$1), sw.c(ac.a("trim_pattern", $$2.a())));
        $$0.a($$2, $$3);
    }

    private static acp<cie> a(String $$0) {
        return acp.a(jc.aE, new acq($$0));
    }
}

