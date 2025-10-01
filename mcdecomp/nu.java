/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;

public class nu {
    private static final acp<dvr> M = nu.a("empty");
    public static final acp<dvr> a = nu.a("zombie_plains");
    public static final acp<dvr> b = nu.a("zombie_savanna");
    public static final acp<dvr> c = nu.a("zombie_snowy");
    public static final acp<dvr> d = nu.a("zombie_taiga");
    public static final acp<dvr> e = nu.a("zombie_desert");
    public static final acp<dvr> f = nu.a("mossify_10_percent");
    public static final acp<dvr> g = nu.a("mossify_20_percent");
    public static final acp<dvr> h = nu.a("mossify_70_percent");
    public static final acp<dvr> i = nu.a("street_plains");
    public static final acp<dvr> j = nu.a("street_savanna");
    public static final acp<dvr> k = nu.a("street_snowy_or_taiga");
    public static final acp<dvr> l = nu.a("farm_plains");
    public static final acp<dvr> m = nu.a("farm_savanna");
    public static final acp<dvr> n = nu.a("farm_snowy");
    public static final acp<dvr> o = nu.a("farm_taiga");
    public static final acp<dvr> p = nu.a("farm_desert");
    public static final acp<dvr> q = nu.a("outpost_rot");
    public static final acp<dvr> r = nu.a("bottom_rampart");
    public static final acp<dvr> s = nu.a("treasure_rooms");
    public static final acp<dvr> t = nu.a("housing");
    public static final acp<dvr> u = nu.a("side_wall_degradation");
    public static final acp<dvr> v = nu.a("stable_degradation");
    public static final acp<dvr> w = nu.a("bastion_generic_degradation");
    public static final acp<dvr> x = nu.a("rampart_degradation");
    public static final acp<dvr> y = nu.a("entrance_replacement");
    public static final acp<dvr> z = nu.a("bridge");
    public static final acp<dvr> A = nu.a("roof");
    public static final acp<dvr> B = nu.a("high_wall");
    public static final acp<dvr> C = nu.a("high_rampart");
    public static final acp<dvr> D = nu.a("fossil_rot");
    public static final acp<dvr> E = nu.a("fossil_coal");
    public static final acp<dvr> F = nu.a("fossil_diamonds");
    public static final acp<dvr> G = nu.a("ancient_city_start_degradation");
    public static final acp<dvr> H = nu.a("ancient_city_generic_degradation");
    public static final acp<dvr> I = nu.a("ancient_city_walls_degradation");
    public static final acp<dvr> J = nu.a("trail_ruins_houses_archaeology");
    public static final acp<dvr> K = nu.a("trail_ruins_roads_archaeology");
    public static final acp<dvr> L = nu.a("trail_ruins_tower_top_archaeology");

    private static acp<dvr> a(String $$0) {
        return acp.a(jc.aA, new acq($$0));
    }

    private static void a(nm<dvr> $$0, acp<dvr> $$1, List<dvq> $$2) {
        $$0.a($$1, new dvr($$2));
    }

    public static void a(nm<dvr> $$0) {
        hf<cpn> $$1 = $$0.a(jc.e);
        dvi $$2 = new dvi(new dvk(cpo.pr, 0.01f), dur.b, cpo.pC.n());
        dvi $$3 = new dvi(new dvk(cpo.pC, 0.5f), dur.b, cpo.pr.n());
        nu.a($$0, M, (List<dvq>)ImmutableList.of());
        nu.a($$0, a, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.m, 0.8f), dur.b, cpo.cn.n()), (Object)new dvi(new dvv(amw.p), dur.b, cpo.a.n()), (Object)new dvi(new duw(cpo.cp), dur.b, cpo.a.n()), (Object)new dvi(new duw(cpo.cq), dur.b, cpo.a.n()), (Object)new dvi(new dvk(cpo.m, 0.07f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.cn, 0.07f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.hj, 0.07f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.U, 0.05f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.n, 0.1f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.cu, 0.1f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.al, 0.02f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.eZ, 0.5f), dur.b, cpo.bs.n()), (Object[])new dvi[]{new dvi(new duy((dcb)((dcb)cpo.eZ.n().a(ctl.a, true)).a(ctl.c, true)), dur.b, (dcb)((dcb)cpo.hL.n().a(ctl.a, true)).a(ctl.c, true)), new dvi(new duy((dcb)((dcb)cpo.eZ.n().a(ctl.b, true)).a(ctl.d, true)), dur.b, (dcb)((dcb)cpo.hL.n().a(ctl.b, true)).a(ctl.d, true)), new dvi(new dvk(cpo.cB, 0.3f), dur.b, cpo.gt.n()), new dvi(new dvk(cpo.cB, 0.2f), dur.b, cpo.gu.n()), new dvi(new dvk(cpo.cB, 0.1f), dur.b, cpo.kD.n())}))));
        nu.a($$0, b, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvv(amw.p), dur.b, cpo.a.n()), (Object)new dvi(new duw(cpo.cp), dur.b, cpo.a.n()), (Object)new dvi(new duw(cpo.cq), dur.b, cpo.a.n()), (Object)new dvi(new dvk(cpo.r, 0.2f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.hP, 0.2f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.Y, 0.05f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.as, 0.05f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.hk, 0.05f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.hn, 0.05f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.hx, 0.05f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.eZ, 0.5f), dur.b, cpo.bs.n()), (Object)new dvi(new duy((dcb)((dcb)cpo.eZ.n().a(ctl.a, true)).a(ctl.c, true)), dur.b, (dcb)((dcb)cpo.hL.n().a(ctl.a, true)).a(ctl.c, true)), (Object[])new dvi[]{new dvi(new duy((dcb)((dcb)cpo.eZ.n().a(ctl.b, true)).a(ctl.d, true)), dur.b, (dcb)((dcb)cpo.hL.n().a(ctl.b, true)).a(ctl.d, true)), new dvi(new dvk(cpo.cB, 0.1f), dur.b, cpo.fe.n())}))));
        nu.a($$0, c, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvv(amw.p), dur.b, cpo.a.n()), (Object)new dvi(new duw(cpo.cp), dur.b, cpo.a.n()), (Object)new dvi(new duw(cpo.cq), dur.b, cpo.a.n()), (Object)new dvi(new duw(cpo.oe), dur.b, cpo.a.n()), (Object)new dvi(new dvk(cpo.o, 0.2f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.ju, 0.4f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.af, 0.05f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.ax, 0.05f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.eZ, 0.5f), dur.b, cpo.bs.n()), (Object)new dvi(new duy((dcb)((dcb)cpo.eZ.n().a(ctl.a, true)).a(ctl.c, true)), dur.b, (dcb)((dcb)cpo.hL.n().a(ctl.a, true)).a(ctl.c, true)), (Object)new dvi(new duy((dcb)((dcb)cpo.eZ.n().a(ctl.b, true)).a(ctl.d, true)), dur.b, (dcb)((dcb)cpo.hL.n().a(ctl.b, true)).a(ctl.d, true)), (Object)new dvi(new dvk(cpo.cB, 0.1f), dur.b, cpo.gt.n()), (Object[])new dvi[]{new dvi(new dvk(cpo.cB, 0.8f), dur.b, cpo.gu.n())}))));
        nu.a($$0, d, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.m, 0.8f), dur.b, cpo.cn.n()), (Object)new dvi(new dvv(amw.p), dur.b, cpo.a.n()), (Object)new dvi(new duw(cpo.cp), dur.b, cpo.a.n()), (Object)new dvi(new duw(cpo.cq), dur.b, cpo.a.n()), (Object)new dvi(new duw(cpo.og), dur.b, (dcb)cpo.og.n().a(cqa.b, false)), (Object)new dvi(new dvk(cpo.m, 0.08f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.V, 0.08f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.eZ, 0.5f), dur.b, cpo.bs.n()), (Object)new dvi(new duy((dcb)((dcb)cpo.eZ.n().a(ctl.a, true)).a(ctl.c, true)), dur.b, (dcb)((dcb)cpo.hL.n().a(ctl.a, true)).a(ctl.c, true)), (Object)new dvi(new duy((dcb)((dcb)cpo.eZ.n().a(ctl.b, true)).a(ctl.d, true)), dur.b, (dcb)((dcb)cpo.hL.n().a(ctl.b, true)).a(ctl.d, true)), (Object)new dvi(new dvk(cpo.cB, 0.3f), dur.b, cpo.fd.n()), (Object)new dvi(new dvk(cpo.cB, 0.2f), dur.b, cpo.gu.n()), (Object[])new dvi[0]))));
        nu.a($$0, e, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvv(amw.p), dur.b, cpo.a.n()), (Object)new dvi(new duw(cpo.cp), dur.b, cpo.a.n()), (Object)new dvi(new duw(cpo.cq), dur.b, cpo.a.n()), (Object)new dvi(new dvk(cpo.jS, 0.08f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.aX, 0.1f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.iA, 0.08f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.nl, 0.08f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.ny, 0.08f), dur.b, cpo.bs.n()), (Object)new dvi(new dvk(cpo.cB, 0.2f), dur.b, cpo.kD.n()), (Object)new dvi(new dvk(cpo.cB, 0.1f), dur.b, cpo.fe.n())))));
        nu.a($$0, f, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.m, 0.1f), dur.b, cpo.cn.n())))));
        nu.a($$0, g, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.m, 0.2f), dur.b, cpo.cn.n())))));
        nu.a($$0, h, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.m, 0.7f), dur.b, cpo.cn.n())))));
        nu.a($$0, i, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new duw(cpo.kE), new duw(cpo.G), cpo.n.n()), (Object)new dvi(new dvk(cpo.kE, 0.1f), dur.b, cpo.i.n()), (Object)new dvi(new duw(cpo.i), new duw(cpo.G), cpo.G.n()), (Object)new dvi(new duw(cpo.j), new duw(cpo.G), cpo.G.n())))));
        nu.a($$0, j, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new duw(cpo.kE), new duw(cpo.G), cpo.r.n()), (Object)new dvi(new dvk(cpo.kE, 0.2f), dur.b, cpo.i.n()), (Object)new dvi(new duw(cpo.i), new duw(cpo.G), cpo.G.n()), (Object)new dvi(new duw(cpo.j), new duw(cpo.G), cpo.G.n())))));
        nu.a($$0, k, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new duw(cpo.kE), new duw(cpo.G), cpo.o.n()), (Object)new dvi(new duw(cpo.kE), new duw(cpo.dO), cpo.o.n()), (Object)new dvi(new dvk(cpo.kE, 0.2f), dur.b, cpo.i.n()), (Object)new dvi(new duw(cpo.i), new duw(cpo.G), cpo.G.n()), (Object)new dvi(new duw(cpo.j), new duw(cpo.G), cpo.G.n())))));
        nu.a($$0, l, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.cB, 0.3f), dur.b, cpo.gt.n()), (Object)new dvi(new dvk(cpo.cB, 0.2f), dur.b, cpo.gu.n()), (Object)new dvi(new dvk(cpo.cB, 0.1f), dur.b, cpo.kD.n())))));
        nu.a($$0, m, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.cB, 0.1f), dur.b, cpo.fe.n())))));
        nu.a($$0, n, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.cB, 0.1f), dur.b, cpo.gt.n()), (Object)new dvi(new dvk(cpo.cB, 0.8f), dur.b, cpo.gu.n())))));
        nu.a($$0, o, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.cB, 0.3f), dur.b, cpo.fd.n()), (Object)new dvi(new dvk(cpo.cB, 0.2f), dur.b, cpo.gu.n())))));
        nu.a($$0, p, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.cB, 0.2f), dur.b, cpo.kD.n()), (Object)new dvi(new dvk(cpo.cB, 0.1f), dur.b, cpo.fe.n())))));
        nu.a($$0, q, (List<dvq>)ImmutableList.of((Object)new dux(0.05f)));
        nu.a($$0, r, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.kJ, 0.75f), dur.b, cpo.px.n()), (Object)new dvi(new dvk(cpo.px, 0.15f), dur.b, cpo.pw.n()), (Object)$$3, (Object)$$2))));
        nu.a($$0, s, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.pw, 0.35f), dur.b, cpo.px.n()), (Object)new dvi(new dvk(cpo.py, 0.1f), dur.b, cpo.px.n()), (Object)$$3, (Object)$$2))));
        nu.a($$0, t, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.pw, 0.3f), dur.b, cpo.px.n()), (Object)new dvi(new dvk(cpo.pr, 1.0E-4f), dur.b, cpo.a.n()), (Object)$$3, (Object)$$2))));
        nu.a($$0, u, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.py, 0.5f), dur.b, cpo.a.n()), (Object)new dvi(new dvk(cpo.ch, 0.1f), dur.b, cpo.px.n()), (Object)$$3, (Object)$$2))));
        nu.a($$0, v, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.pw, 0.1f), dur.b, cpo.px.n()), (Object)new dvi(new dvk(cpo.pr, 1.0E-4f), dur.b, cpo.a.n()), (Object)$$3, (Object)$$2))));
        nu.a($$0, w, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.pw, 0.3f), dur.b, cpo.px.n()), (Object)new dvi(new dvk(cpo.pr, 1.0E-4f), dur.b, cpo.a.n()), (Object)new dvi(new dvk(cpo.ch, 0.3f), dur.b, cpo.px.n()), (Object)$$3, (Object)$$2))));
        nu.a($$0, x, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.pw, 0.4f), dur.b, cpo.px.n()), (Object)new dvi(new dvk(cpo.pr, 0.01f), dur.b, cpo.px.n()), (Object)new dvi(new dvk(cpo.pw, 1.0E-4f), dur.b, cpo.a.n()), (Object)new dvi(new dvk(cpo.pr, 1.0E-4f), dur.b, cpo.a.n()), (Object)new dvi(new dvk(cpo.ch, 0.3f), dur.b, cpo.px.n()), (Object)$$3, (Object)$$2))));
        nu.a($$0, y, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.py, 0.5f), dur.b, cpo.a.n()), (Object)new dvi(new dvk(cpo.ch, 0.6f), dur.b, cpo.px.n()), (Object)$$3, (Object)$$2))));
        nu.a($$0, z, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.pw, 0.3f), dur.b, cpo.px.n()), (Object)new dvi(new dvk(cpo.pr, 1.0E-4f), dur.b, cpo.a.n())))));
        nu.a($$0, A, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.pw, 0.3f), dur.b, cpo.px.n()), (Object)new dvi(new dvk(cpo.pw, 0.15f), dur.b, cpo.a.n()), (Object)new dvi(new dvk(cpo.pw, 0.3f), dur.b, cpo.pr.n())))));
        nu.a($$0, B, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.pw, 0.01f), dur.b, cpo.a.n()), (Object)new dvi(new dvk(cpo.pw, 0.5f), dur.b, cpo.px.n()), (Object)new dvi(new dvk(cpo.pw, 0.3f), dur.b, cpo.pr.n()), (Object)$$3))));
        nu.a($$0, C, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.ch, 0.3f), dur.b, cpo.px.n()), (Object)new dvi(dur.b, dur.b, new dus(0.0f, 0.05f, 0, 100, ha.a.b), cpo.a.n()), (Object)$$3))));
        nu.a($$0, D, (List<dvq>)ImmutableList.of((Object)new dux(0.9f), (Object)new dvj(amw.bF)));
        nu.a($$0, E, (List<dvq>)ImmutableList.of((Object)new dux(0.1f), (Object)new dvj(amw.bF)));
        nu.a($$0, F, (List<dvq>)ImmutableList.of((Object)new dux(0.1f), (Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new duw(cpo.R), dur.b, cpo.cy.n()))), (Object)new dvj(amw.bF)));
        nu.a($$0, G, (List<dvq>)ImmutableList.of((Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.rV, 0.3f), dur.b, cpo.sa.n()), (Object)new dvi(new dvk(cpo.rR, 0.3f), dur.b, cpo.sb.n()), (Object)new dvi(new dvk(cpo.of, 0.05f), dur.b, cpo.a.n()))), (Object)new dvj(amw.bF)));
        nu.a($$0, H, (List<dvq>)ImmutableList.of((Object)new dux($$1.b(amw.bL), 0.95f), (Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.rV, 0.3f), dur.b, cpo.sa.n()), (Object)new dvi(new dvk(cpo.rR, 0.3f), dur.b, cpo.sb.n()), (Object)new dvi(new dvk(cpo.of, 0.05f), dur.b, cpo.a.n()))), (Object)new dvj(amw.bF)));
        nu.a($$0, I, (List<dvq>)ImmutableList.of((Object)new dux($$1.b(amw.bL), 0.95f), (Object)new dvm((List<? extends dvi>)ImmutableList.of((Object)new dvi(new dvk(cpo.rV, 0.3f), dur.b, cpo.sa.n()), (Object)new dvi(new dvk(cpo.rR, 0.3f), dur.b, cpo.sb.n()), (Object)new dvi(new dvk(cpo.rT, 0.3f), dur.b, cpo.a.n()), (Object)new dvi(new dvk(cpo.of, 0.05f), dur.b, cpo.a.n()))), (Object)new dvj(amw.bF)));
        nu.a($$0, J, List.of(new dvm(List.of(new dvi(new dvk(cpo.L, 0.2f), dur.b, cpo.j.n()), new dvi(new dvk(cpo.L, 0.1f), dur.b, cpo.k.n()), new dvi(new dvk(cpo.eN, 0.1f), dur.b, cpo.eM.n()))), nu.a(dzg.aE, 6), nu.a(dzg.aF, 3)));
        nu.a($$0, K, List.of(new dvm(List.of(new dvi(new dvk(cpo.L, 0.2f), dur.b, cpo.j.n()), new dvi(new dvk(cpo.L, 0.1f), dur.b, cpo.k.n()), new dvi(new dvk(cpo.eN, 0.1f), dur.b, cpo.eM.n()))), nu.a(dzg.aE, 2)));
        nu.a($$0, L, List.of(nu.a(dzg.aE, 2)));
    }

    private static duz a(acq $$0, int $$1) {
        return new duz(new dvm(List.of(new dvi(new dvv(amw.cj), dur.b, dvf.b, cpo.M.n(), new dvx($$0)))), bcz.a($$1));
    }
}

