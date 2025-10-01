/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Lifecycle
 *  org.apache.commons.lang3.Validate
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class jb {
    private static final Logger aq = LogUtils.getLogger();
    private static final Map<acq, Supplier<?>> ar = Maps.newLinkedHashMap();
    public static final acq a = new acq("root");
    private static final ia<ia<?>> as = new hm(acp.a(a), Lifecycle.stable());
    public static final gz<dgl> b = jb.b(jc.z, "step", $$0 -> dgl.Q);
    public static final hr<amg> c = jb.a(jc.ad, (hr<T> $$0) -> amh.ma);
    public static final gz<dxd> d = jb.b(jc.w, "empty", $$0 -> dxf.a);
    public static final hr<bey> e = jb.a(jc.O, (hr<T> $$0) -> bfc.z);
    public static final gz<cpn> f = jb.b(jc.e, "air", $$0 -> cpo.a);
    public static final hr<ckg> g = jb.a(jc.r, (hr<T> $$0) -> ckk.x);
    public static final gz<bfn<?>> h = jb.b(jc.s, "pig", $$0 -> bfn.av);
    public static final gz<cfu> i = jb.b(jc.D, "air", $$0 -> cgc.a);
    public static final gz<chw> j = jb.a(jc.V, "empty", (hr<T> $$0) -> chz.b);
    public static final hr<iu<?>> k = jb.a(jc.Q, (hr<T> $$0) -> iv.c);
    public static final hr<czp<?>> l = jb.a(jc.f, (hr<T> $$0) -> czp.a);
    public static final gz<bvd> m = jb.a(jc.P, "kebab", bve::a);
    public static final hr<acq> n = jb.a(jc.o, (hr<T> $$0) -> amr.E);
    public static final gz<dec> o = jb.a(jc.l, "empty", (hr<T> $$0) -> dec.c);
    public static final hr<dvo<?>> p = jb.a(jc.Z, (hr<T> $$0) -> dvo.a);
    public static final hr<dwc<?>> q = jb.a(jc.aa, (hr<T> $$0) -> dwc.b);
    public static final hr<dvh<?>> r = jb.a(jc.U, (hr<T> $$0) -> dvh.a);
    public static final hr<cck<?>> s = jb.a(jc.N, (hr<T> $$0) -> cck.h);
    public static final hr<cjf<?>> t = jb.a(jc.X, (hr<T> $$0) -> cjf.a);
    public static final hr<cje<?>> u = jb.a(jc.W, (hr<T> $$0) -> cje.b);
    public static final hr<bhb> v = jb.a(jc.b, (hr<T> $$0) -> bhg.k);
    public static final hr<dgq<?>> w = jb.a(jc.T, (hr<T> $$0) -> dgq.a);
    public static final hr<gg<?, ?>> x = jb.a(jc.m, gh::a);
    public static final hr<amq<?>> y = jb.a(jc.ae, (hr<T> $$0) -> amr.c);
    public static final gz<byg> z = jb.a(jc.an, "plains", (hr<T> $$0) -> byg.c);
    public static final gz<bye> A = jb.a(jc.am, "none", (hr<T> $$0) -> bye.b);
    public static final hr<brc> B = jb.a(jc.S, brd::a);
    public static final gz<bpb<?>> C = jb.a(jc.M, "dummy", (hr<T> $$0) -> bpb.a);
    public static final gz<bqg<?>> D = jb.a(jc.ac, "dummy", (hr<T> $$0) -> bqg.a);
    public static final hr<cab> E = jb.a(jc.ab, (hr<T> $$0) -> cab.c);
    public static final hr<bzz> F = jb.a(jc.a, (hr<T> $$0) -> bzz.b);
    public static final hr<eag> G = jb.a(jc.I, (hr<T> $$0) -> ead.a);
    public static final hr<eba> H = jb.a(jc.F, (hr<T> $$0) -> ebb.b);
    public static final hr<ecl> I = jb.a(jc.E, (hr<T> $$0) -> ecm.a);
    public static final hr<ede> J = jb.a(jc.H, (hr<T> $$0) -> edg.a);
    public static final hr<ecx> K = jb.a(jc.G, (hr<T> $$0) -> ecz.b);
    public static final hr<edm> L = jb.a(jc.J, (hr<T> $$0) -> edo.b);
    public static final hr<bdb<?>> M = jb.a(jc.v, (hr<T> $$0) -> bdb.a);
    public static final hr<bdd<?>> N = jb.a(jc.C, (hr<T> $$0) -> bdd.a);
    public static final hr<dqi<?>> O = jb.a(jc.A, (hr<T> $$0) -> dqi.a);
    public static final hr<dis<?>> P = jb.a(jc.g, (hr<T> $$0) -> dis.k);
    public static final hr<djp<?>> Q = jb.a(jc.i, (hr<T> $$0) -> djp.a);
    public static final hr<dko<?>> R = jb.a(jc.t, (hr<T> $$0) -> dko.I);
    public static final hr<dsy<?>> S = jb.a(jc.ag, (hr<T> $$0) -> dsy.a);
    public static final hr<dsr> T = jb.a(jc.af, (hr<T> $$0) -> dsr.c);
    public static final hr<dsj<?>> U = jb.a(jc.aj, (hr<T> $$0) -> dsj.f);
    public static final hr<dri<?>> V = jb.a(jc.R, (hr<T> $$0) -> dri.f);
    public static final hr<dou<?>> W = jb.a(jc.h, (hr<T> $$0) -> dou.a);
    public static final hr<dof<?>> X = jb.a(jc.x, (hr<T> $$0) -> dof.a);
    public static final hr<dpx<?>> Y = jb.a(jc.al, (hr<T> $$0) -> dpx.a);
    public static final hr<dor<?>> Z = jb.a(jc.Y, (hr<T> $$0) -> dor.a);
    public static final hr<dpl<?>> aa = jb.a(jc.ak, (hr<T> $$0) -> dpl.b);
    public static final hr<dnu<?>> ab = jb.a(jc.u, (hr<T> $$0) -> dnu.a);
    public static final hr<Codec<? extends cno>> ac = jb.a(jc.d, Lifecycle.stable(), cnp::a);
    public static final hr<Codec<? extends ddy>> ad = jb.a(jc.k, Lifecycle.stable(), dea::a);
    public static final hr<Codec<? extends dib.f>> ae = jb.a(jc.K, dib.f::a);
    public static final hr<Codec<? extends dib.o>> af = jb.a(jc.L, dib.o::a);
    public static final hr<Codec<? extends dhd>> ag = jb.a(jc.q, dhe::a);
    public static final hr<dvs<?>> ah = jb.a(jc.ai, (hr<T> $$0) -> dvs.e);
    public static final hr<dti<?>> ai = jb.a(jc.ah, (hr<T> $$0) -> dti.d);
    public static final hr<brp> aj = jb.a(jc.j, brp::a);
    public static final hr<brw> ak = jb.a(jc.y, (hr<T> $$0) -> brw.a);
    public static final hr<cze> al = jb.a(jc.c, czf::a);
    public static final hr<cfr> am = jb.a(jc.B, cft::a);
    public static final hr<String> an = jb.a(jc.ao, dad::a);
    public static final hr<cef> ao = jb.a(jc.n, ceg::a);
    public static final hr<? extends hr<?>> ap = as;

    private static <T> hr<T> a(acp<? extends hr<T>> $$0, a<T> $$1) {
        return jb.a($$0, Lifecycle.stable(), $$1);
    }

    private static <T> gz<T> a(acp<? extends hr<T>> $$0, String $$1, a<T> $$2) {
        return jb.a($$0, $$1, Lifecycle.stable(), $$2);
    }

    private static <T> gz<T> b(acp<? extends hr<T>> $$0, String $$1, a<T> $$2) {
        return jb.b($$0, $$1, Lifecycle.stable(), $$2);
    }

    private static <T> hr<T> a(acp<? extends hr<T>> $$0, Lifecycle $$1, a<T> $$2) {
        return jb.a($$0, new hm($$0, $$1, false), $$2, $$1);
    }

    private static <T> gz<T> a(acp<? extends hr<T>> $$0, String $$1, Lifecycle $$2, a<T> $$3) {
        return jb.a($$0, new gy($$1, $$0, $$2, false), $$3, $$2);
    }

    private static <T> gz<T> b(acp<? extends hr<T>> $$0, String $$1, Lifecycle $$2, a<T> $$3) {
        return jb.a($$0, new gy($$1, $$0, $$2, true), $$3, $$2);
    }

    private static <T, R extends ia<T>> R a(acp<? extends hr<T>> $$0, R $$1, a<T> $$2, Lifecycle $$3) {
        acq $$4 = $$0.a();
        ar.put($$4, () -> $$2.run($$1));
        as.a($$0, $$1, $$3);
        return $$1;
    }

    public static void a() {
        jb.b();
        jb.c();
        jb.a(ap);
    }

    private static void b() {
        ar.forEach(($$0, $$1) -> {
            if ($$1.get() == null) {
                aq.error("Unable to bootstrap registry '{}'", $$0);
            }
        });
    }

    private static void c() {
        ap.l();
        for (hr hr2 : ap) {
            hr2.l();
        }
    }

    private static <T extends hr<?>> void a(hr<T> $$0) {
        $$0.forEach($$1 -> {
            if ($$1.e().isEmpty()) {
                ac.a("Registry '" + $$0.b($$1) + "' was empty after loading");
            }
            if ($$1 instanceof gz) {
                acq $$2 = ((gz)$$1).a();
                Validate.notNull($$1.a($$2), (String)("Missing default of DefaultedMappedRegistry: " + $$2), (Object[])new Object[0]);
            }
        });
    }

    @FunctionalInterface
    static interface a<T> {
        public T run(hr<T> var1);
    }
}

