/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class byf {
    private static final int c = 12;
    private static final int d = 16;
    private static final int e = 3;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 5;
    private static final int i = 10;
    private static final int j = 10;
    private static final int k = 20;
    private static final int l = 15;
    private static final int m = 30;
    private static final int n = 30;
    private static final float o = 0.05f;
    private static final float p = 0.2f;
    public static final Map<bye, Int2ObjectMap<f[]>> a = ac.a(Maps.newHashMap(), $$0 -> {
        $$0.put(bye.g, byf.a((ImmutableMap<Integer, f[]>)ImmutableMap.of((Object)1, (Object)new f[]{new b(cgc.oI, 20, 16, 2), new b(cgc.tm, 26, 16, 2), new b(cgc.tl, 22, 16, 2), new b(cgc.uq, 15, 16, 2), new h(cgc.oJ, 1, 6, 16, 1)}, (Object)2, (Object)new f[]{new b(cpo.dV, 6, 12, 10), new h(cgc.tz, 1, 4, 5), new h(cgc.nF, 1, 4, 16, 5)}, (Object)3, (Object)new f[]{new h(cgc.re, 3, 18, 10), new b(cpo.fa, 4, 12, 20)}, (Object)4, (Object)new f[]{new h(cpo.eh, 1, 1, 12, 15), new i(bfc.p, 100, 15), new i(bfc.h, 160, 15), new i(bfc.r, 140, 15), new i(bfc.o, 120, 15), new i(bfc.s, 280, 15), new i(bfc.w, 7, 15)}, (Object)5, (Object)new f[]{new h(cgc.tq, 3, 3, 30), new h(cgc.rE, 4, 3, 30)})));
        $$0.put(bye.h, byf.a((ImmutableMap<Integer, f[]>)ImmutableMap.of((Object)1, (Object)new f[]{new b(cgc.oE, 20, 16, 2), new b(cgc.nI, 10, 16, 2), new g(cgc.ql, 6, cgc.qp, 6, 16, 1), new h(cgc.pT, 3, 1, 16, 1)}, (Object)2, (Object)new f[]{new b(cgc.ql, 15, 16, 10), new g(cgc.qm, 6, cgc.qq, 6, 16, 5), new h(cgc.vx, 2, 1, 5)}, (Object)3, (Object)new f[]{new b(cgc.qm, 13, 16, 20), new e(cgc.qh, 3, 3, 10, 0.2f)}, (Object)4, (Object)new f[]{new b(cgc.qn, 6, 12, 30)}, (Object)5, (Object)new f[]{new b(cgc.qo, 4, 12, 30), new c(1, 12, 30, (Map<byg, cfu>)ImmutableMap.builder().put((Object)byg.c, (Object)cgc.ni).put((Object)byg.g, (Object)cgc.nk).put((Object)byg.e, (Object)cgc.nk).put((Object)byg.a, (Object)cgc.no).put((Object)byg.b, (Object)cgc.no).put((Object)byg.d, (Object)cgc.nq).put((Object)byg.f, (Object)cgc.nu).build())})));
        $$0.put(bye.n, byf.a((ImmutableMap<Integer, f[]>)ImmutableMap.of((Object)1, (Object)new f[]{new b(cpo.bA, 18, 16, 2), new b(cpo.bM, 18, 16, 2), new b(cpo.bP, 18, 16, 2), new b(cpo.bH, 18, 16, 2), new h(cgc.rg, 2, 1, 1)}, (Object)2, (Object)new f[]{new b(cgc.qu, 12, 16, 10), new b(cgc.qB, 12, 16, 10), new b(cgc.qJ, 12, 16, 10), new b(cgc.qx, 12, 16, 10), new b(cgc.qz, 12, 16, 10), new h(cpo.bA, 1, 1, 16, 5), new h(cpo.bB, 1, 1, 16, 5), new h(cpo.bC, 1, 1, 16, 5), new h(cpo.bD, 1, 1, 16, 5), new h(cpo.bE, 1, 1, 16, 5), new h(cpo.bF, 1, 1, 16, 5), new h(cpo.bG, 1, 1, 16, 5), new h(cpo.bH, 1, 1, 16, 5), new h(cpo.bI, 1, 1, 16, 5), new h(cpo.bJ, 1, 1, 16, 5), new h(cpo.bK, 1, 1, 16, 5), new h(cpo.bL, 1, 1, 16, 5), new h(cpo.bM, 1, 1, 16, 5), new h(cpo.bN, 1, 1, 16, 5), new h(cpo.bO, 1, 1, 16, 5), new h(cpo.bP, 1, 1, 16, 5), new h(cpo.ik, 1, 4, 16, 5), new h(cpo.il, 1, 4, 16, 5), new h(cpo.im, 1, 4, 16, 5), new h(cpo.in, 1, 4, 16, 5), new h(cpo.io, 1, 4, 16, 5), new h(cpo.ip, 1, 4, 16, 5), new h(cpo.iq, 1, 4, 16, 5), new h(cpo.ir, 1, 4, 16, 5), new h(cpo.is, 1, 4, 16, 5), new h(cpo.it, 1, 4, 16, 5), new h(cpo.iu, 1, 4, 16, 5), new h(cpo.iv, 1, 4, 16, 5), new h(cpo.iw, 1, 4, 16, 5), new h(cpo.ix, 1, 4, 16, 5), new h(cpo.iy, 1, 4, 16, 5), new h(cpo.iz, 1, 4, 16, 5)}, (Object)3, (Object)new f[]{new b(cgc.qy, 12, 16, 20), new b(cgc.qC, 12, 16, 20), new b(cgc.qv, 12, 16, 20), new b(cgc.qI, 12, 16, 20), new b(cgc.qA, 12, 16, 20), new h(cpo.aZ, 3, 1, 12, 10), new h(cpo.bd, 3, 1, 12, 10), new h(cpo.bn, 3, 1, 12, 10), new h(cpo.bo, 3, 1, 12, 10), new h(cpo.bk, 3, 1, 12, 10), new h(cpo.bl, 3, 1, 12, 10), new h(cpo.bi, 3, 1, 12, 10), new h(cpo.bg, 3, 1, 12, 10), new h(cpo.bm, 3, 1, 12, 10), new h(cpo.bc, 3, 1, 12, 10), new h(cpo.bh, 3, 1, 12, 10), new h(cpo.be, 3, 1, 12, 10), new h(cpo.bb, 3, 1, 12, 10), new h(cpo.ba, 3, 1, 12, 10), new h(cpo.bf, 3, 1, 12, 10), new h(cpo.bj, 3, 1, 12, 10)}, (Object)4, (Object)new f[]{new b(cgc.qG, 12, 16, 30), new b(cgc.qE, 12, 16, 30), new b(cgc.qF, 12, 16, 30), new b(cgc.qH, 12, 16, 30), new b(cgc.qw, 12, 16, 30), new b(cgc.qD, 12, 16, 30), new h(cgc.tV, 3, 1, 12, 15), new h(cgc.ug, 3, 1, 12, 15), new h(cgc.tY, 3, 1, 12, 15), new h(cgc.uj, 3, 1, 12, 15), new h(cgc.ub, 3, 1, 12, 15), new h(cgc.ui, 3, 1, 12, 15), new h(cgc.ua, 3, 1, 12, 15), new h(cgc.uc, 3, 1, 12, 15), new h(cgc.uk, 3, 1, 12, 15), new h(cgc.uf, 3, 1, 12, 15), new h(cgc.tX, 3, 1, 12, 15), new h(cgc.ue, 3, 1, 12, 15), new h(cgc.uh, 3, 1, 12, 15), new h(cgc.tZ, 3, 1, 12, 15), new h(cgc.tW, 3, 1, 12, 15), new h(cgc.ud, 3, 1, 12, 15)}, (Object)5, (Object)new f[]{new h(cgc.pl, 2, 3, 30)})));
        $$0.put(bye.i, byf.a((ImmutableMap<Integer, f[]>)ImmutableMap.of((Object)1, (Object)new f[]{new b(cgc.oB, 32, 16, 2), new h(cgc.nH, 1, 16, 1), new g(cpo.L, 10, cgc.pi, 10, 12, 1)}, (Object)2, (Object)new f[]{new b(cgc.pi, 26, 12, 10), new h(cgc.nG, 2, 1, 5)}, (Object)3, (Object)new f[]{new b(cgc.oE, 14, 16, 20), new h(cgc.uZ, 3, 1, 10)}, (Object)4, (Object)new f[]{new b(cgc.oF, 24, 16, 30), new e(cgc.nG, 2, 3, 15)}, (Object)5, (Object)new f[]{new b(cgc.lF, 8, 12, 30), new e(cgc.uZ, 3, 3, 15), new j(cgc.nH, 5, cgc.uw, 5, 2, 12, 30)})));
        $$0.put(bye.k, byf.a((ImmutableMap<Integer, f[]>)ImmutableMap.builder().put((Object)1, (Object)new f[]{new b(cgc.qa, 24, 16, 2), new d(1), new h(cpo.cl, 9, 1, 12, 1)}).put((Object)2, (Object)new f[]{new b(cgc.qb, 4, 12, 10), new d(5), new h(cgc.vt, 1, 1, 5)}).put((Object)3, (Object)new f[]{new b(cgc.qr, 5, 12, 20), new d(10), new h(cgc.ck, 1, 4, 10)}).put((Object)4, (Object)new f[]{new b(cgc.tg, 2, 12, 30), new d(15), new h(cgc.qi, 5, 1, 15), new h(cgc.qe, 4, 1, 15)}).put((Object)5, (Object)new f[]{new h(cgc.tR, 20, 1, 30)}).build()));
        $$0.put(bye.e, byf.a((ImmutableMap<Integer, f[]>)ImmutableMap.of((Object)1, (Object)new f[]{new b(cgc.qa, 24, 16, 2), new h(cgc.tp, 7, 1, 1)}, (Object)2, (Object)new f[]{new b(cgc.fx, 11, 16, 10), new k(13, anh.d, "filled_map.monument", dyl.a.j, 12, 5)}, (Object)3, (Object)new f[]{new b(cgc.qe, 1, 12, 20), new k(14, anh.c, "filled_map.mansion", dyl.a.i, 12, 10)}, (Object)4, (Object)new f[]{new h(cgc.ti, 7, 1, 15), new h(cgc.tV, 3, 1, 15), new h(cgc.ug, 3, 1, 15), new h(cgc.tY, 3, 1, 15), new h(cgc.uj, 3, 1, 15), new h(cgc.ub, 3, 1, 15), new h(cgc.ui, 3, 1, 15), new h(cgc.ua, 3, 1, 15), new h(cgc.uc, 3, 1, 15), new h(cgc.uk, 3, 1, 15), new h(cgc.uf, 3, 1, 15), new h(cgc.tX, 3, 1, 15), new h(cgc.ue, 3, 1, 15), new h(cgc.uh, 3, 1, 15), new h(cgc.tZ, 3, 1, 15), new h(cgc.tW, 3, 1, 15), new h(cgc.ud, 3, 1, 15)}, (Object)5, (Object)new f[]{new h(cgc.vg, 8, 1, 30)})));
        $$0.put(bye.f, byf.a((ImmutableMap<Integer, f[]>)ImmutableMap.of((Object)1, (Object)new f[]{new b(cgc.rp, 32, 16, 2), new h(cgc.ll, 1, 2, 1)}, (Object)2, (Object)new f[]{new b(cgc.nU, 3, 12, 10), new h(cgc.nM, 1, 1, 5)}, (Object)3, (Object)new f[]{new b(cgc.tJ, 2, 12, 20), new h(cpo.ed, 4, 1, 12, 10)}, (Object)4, (Object)new f[]{new b(cgc.nD, 4, 12, 30), new b(cgc.rw, 9, 12, 30), new h(cgc.rq, 5, 1, 15)}, (Object)5, (Object)new f[]{new b(cgc.ru, 22, 12, 30), new h(cgc.te, 3, 1, 30)})));
        $$0.put(bye.c, byf.a((ImmutableMap<Integer, f[]>)ImmutableMap.of((Object)1, (Object)new f[]{new b(cgc.nI, 15, 16, 2), new h(new cfz(cgc.oU), 7, 1, 12, 1, 0.2f), new h(new cfz(cgc.oV), 4, 1, 12, 1, 0.2f), new h(new cfz(cgc.oS), 5, 1, 12, 1, 0.2f), new h(new cfz(cgc.oT), 9, 1, 12, 1, 0.2f)}, (Object)2, (Object)new f[]{new b(cgc.nQ, 4, 12, 10), new h(new cfz(cgc.vs), 36, 1, 12, 5, 0.2f), new h(new cfz(cgc.oR), 1, 1, 12, 5, 0.2f), new h(new cfz(cgc.oQ), 3, 1, 12, 5, 0.2f)}, (Object)3, (Object)new f[]{new b(cgc.pM, 1, 12, 20), new b(cgc.nK, 1, 12, 20), new h(new cfz(cgc.oO), 1, 1, 12, 10, 0.2f), new h(new cfz(cgc.oP), 4, 1, 12, 10, 0.2f), new h(new cfz(cgc.uy), 5, 1, 12, 10, 0.2f)}, (Object)4, (Object)new f[]{new e(cgc.oY, 14, 3, 15, 0.2f), new e(cgc.oZ, 8, 3, 15, 0.2f)}, (Object)5, (Object)new f[]{new e(cgc.oW, 8, 3, 30, 0.2f), new e(cgc.oX, 16, 3, 30, 0.2f)})));
        $$0.put(bye.p, byf.a((ImmutableMap<Integer, f[]>)ImmutableMap.of((Object)1, (Object)new f[]{new b(cgc.nI, 15, 16, 2), new h(new cfz(cgc.op), 3, 1, 12, 1, 0.2f), new e(cgc.om, 2, 3, 1)}, (Object)2, (Object)new f[]{new b(cgc.nQ, 4, 12, 10), new h(new cfz(cgc.vs), 36, 1, 12, 5, 0.2f)}, (Object)3, (Object)new f[]{new b(cgc.pi, 24, 12, 20)}, (Object)4, (Object)new f[]{new b(cgc.nK, 1, 12, 30), new e(cgc.ou, 12, 3, 15, 0.2f)}, (Object)5, (Object)new f[]{new e(cgc.or, 8, 3, 30, 0.2f)})));
        $$0.put(bye.o, byf.a((ImmutableMap<Integer, f[]>)ImmutableMap.of((Object)1, (Object)new f[]{new b(cgc.nI, 15, 16, 2), new h(new cfz(cgc.of), 1, 1, 12, 1, 0.2f), new h(new cfz(cgc.od), 1, 1, 12, 1, 0.2f), new h(new cfz(cgc.oe), 1, 1, 12, 1, 0.2f), new h(new cfz(cgc.og), 1, 1, 12, 1, 0.2f)}, (Object)2, (Object)new f[]{new b(cgc.nQ, 4, 12, 10), new h(new cfz(cgc.vs), 36, 1, 12, 5, 0.2f)}, (Object)3, (Object)new f[]{new b(cgc.pi, 30, 12, 20), new e(cgc.op, 1, 3, 10, 0.2f), new e(cgc.on, 2, 3, 10, 0.2f), new e(cgc.oo, 3, 3, 10, 0.2f), new h(new cfz(cgc.ov), 4, 1, 3, 10, 0.2f)}, (Object)4, (Object)new f[]{new b(cgc.nK, 1, 12, 30), new e(cgc.ou, 12, 3, 15, 0.2f), new e(cgc.os, 5, 3, 15, 0.2f)}, (Object)5, (Object)new f[]{new e(cgc.ot, 13, 3, 30, 0.2f)})));
        $$0.put(bye.d, byf.a((ImmutableMap<Integer, f[]>)ImmutableMap.of((Object)1, (Object)new f[]{new b(cgc.rn, 14, 16, 2), new b(cgc.pj, 7, 16, 2), new b(cgc.tG, 4, 16, 2), new h(cgc.tI, 1, 1, 1)}, (Object)2, (Object)new f[]{new b(cgc.nI, 15, 16, 2), new h(cgc.pk, 1, 5, 16, 5), new h(cgc.ro, 1, 8, 16, 5)}, (Object)3, (Object)new f[]{new b(cgc.tT, 7, 16, 20), new b(cgc.rl, 10, 16, 20)}, (Object)4, (Object)new f[]{new b(cgc.pZ, 10, 12, 30)}, (Object)5, (Object)new f[]{new b(cgc.vv, 10, 12, 30)})));
        $$0.put(bye.j, byf.a((ImmutableMap<Integer, f[]>)ImmutableMap.of((Object)1, (Object)new f[]{new b(cgc.pP, 6, 16, 2), new a(cgc.oM, 3), new a(cgc.oL, 7)}, (Object)2, (Object)new f[]{new b(cgc.pi, 26, 12, 10), new a(cgc.oK, 5, 12, 5), new a(cgc.oN, 4, 12, 5)}, (Object)3, (Object)new f[]{new b(cgc.tK, 9, 12, 20), new a(cgc.oL, 7)}, (Object)4, (Object)new f[]{new b(cgc.nD, 4, 12, 30), new a(cgc.tP, 6, 12, 15)}, (Object)5, (Object)new f[]{new h(new cfz(cgc.mZ), 6, 1, 12, 30, 0.2f), new a(cgc.oK, 5, 12, 30)})));
        $$0.put(bye.l, byf.a((ImmutableMap<Integer, f[]>)ImmutableMap.of((Object)1, (Object)new f[]{new b(cgc.pY, 10, 16, 2), new h(cgc.pX, 1, 10, 16, 1)}, (Object)2, (Object)new f[]{new b(cpo.b, 20, 16, 10), new h(cpo.eL, 1, 4, 16, 5)}, (Object)3, (Object)new f[]{new b(cpo.c, 16, 16, 20), new b(cpo.g, 16, 16, 20), new b(cpo.e, 16, 16, 20), new h(cpo.rt, 1, 4, 16, 10), new h(cpo.h, 1, 4, 16, 10), new h(cpo.f, 1, 4, 16, 10), new h(cpo.d, 1, 4, 16, 10)}, (Object)4, (Object)new f[]{new b(cgc.nN, 12, 12, 30), new h(cpo.hk, 1, 1, 12, 15), new h(cpo.hj, 1, 1, 12, 15), new h(cpo.hu, 1, 1, 12, 15), new h(cpo.hm, 1, 1, 12, 15), new h(cpo.hq, 1, 1, 12, 15), new h(cpo.hr, 1, 1, 12, 15), new h(cpo.hy, 1, 1, 12, 15), new h(cpo.hx, 1, 1, 12, 15), new h(cpo.hp, 1, 1, 12, 15), new h(cpo.hl, 1, 1, 12, 15), new h(cpo.ho, 1, 1, 12, 15), new h(cpo.hw, 1, 1, 12, 15), new h(cpo.hs, 1, 1, 12, 15), new h(cpo.ht, 1, 1, 12, 15), new h(cpo.hn, 1, 1, 12, 15), new h(cpo.hv, 1, 1, 12, 15), new h(cpo.lh, 1, 1, 12, 15), new h(cpo.lg, 1, 1, 12, 15), new h(cpo.lr, 1, 1, 12, 15), new h(cpo.lj, 1, 1, 12, 15), new h(cpo.ln, 1, 1, 12, 15), new h(cpo.lo, 1, 1, 12, 15), new h(cpo.lv, 1, 1, 12, 15), new h(cpo.lu, 1, 1, 12, 15), new h(cpo.lm, 1, 1, 12, 15), new h(cpo.li, 1, 1, 12, 15), new h(cpo.ll, 1, 1, 12, 15), new h(cpo.lt, 1, 1, 12, 15), new h(cpo.lp, 1, 1, 12, 15), new h(cpo.lq, 1, 1, 12, 15), new h(cpo.lk, 1, 1, 12, 15), new h(cpo.ls, 1, 1, 12, 15)}, (Object)5, (Object)new f[]{new h(cpo.hf, 1, 1, 12, 30), new h(cpo.hd, 1, 1, 12, 30)})));
    });
    public static final Int2ObjectMap<f[]> b = byf.a((ImmutableMap<Integer, f[]>)ImmutableMap.of((Object)1, (Object)new f[]{new h(cgc.cx, 2, 1, 5, 1), new h(cgc.qc, 4, 1, 5, 1), new h(cgc.eY, 2, 1, 5, 1), new h(cgc.uX, 5, 1, 5, 1), new h(cgc.cs, 1, 1, 12, 1), new h(cgc.dn, 1, 1, 8, 1), new h(cgc.eO, 1, 1, 4, 1), new h(cgc.do, 3, 1, 12, 1), new h(cgc.eA, 3, 1, 8, 1), new h(cgc.cO, 1, 1, 12, 1), new h(cgc.cP, 1, 1, 12, 1), new h(cgc.cQ, 1, 1, 8, 1), new h(cgc.cR, 1, 1, 12, 1), new h(cgc.cS, 1, 1, 12, 1), new h(cgc.cT, 1, 1, 12, 1), new h(cgc.cU, 1, 1, 12, 1), new h(cgc.cV, 1, 1, 12, 1), new h(cgc.cW, 1, 1, 12, 1), new h(cgc.cX, 1, 1, 12, 1), new h(cgc.cY, 1, 1, 12, 1), new h(cgc.cZ, 1, 1, 7, 1), new h(cgc.oH, 1, 1, 12, 1), new h(cgc.ur, 1, 1, 12, 1), new h(cgc.rj, 1, 1, 12, 1), new h(cgc.rk, 1, 1, 12, 1), new h(cgc.N, 5, 1, 8, 1), new h(cgc.L, 5, 1, 8, 1), new h(cgc.P, 5, 1, 8, 1), new h(cgc.M, 5, 1, 8, 1), new h(cgc.J, 5, 1, 8, 1), new h(cgc.K, 5, 1, 8, 1), new h(cgc.O, 5, 1, 8, 1), new h(cgc.Q, 5, 1, 8, 1), new h(cgc.qI, 1, 3, 12, 1), new h(cgc.qu, 1, 3, 12, 1), new h(cgc.qF, 1, 3, 12, 1), new h(cgc.qA, 1, 3, 12, 1), new h(cgc.qJ, 1, 3, 12, 1), new h(cgc.qH, 1, 3, 12, 1), new h(cgc.qC, 1, 3, 12, 1), new h(cgc.qw, 1, 3, 12, 1), new h(cgc.qy, 1, 3, 12, 1), new h(cgc.qB, 1, 3, 12, 1), new h(cgc.qE, 1, 3, 12, 1), new h(cgc.qx, 1, 3, 12, 1), new h(cgc.qz, 1, 3, 12, 1), new h(cgc.qv, 1, 3, 12, 1), new h(cgc.qG, 1, 3, 12, 1), new h(cgc.qD, 1, 3, 12, 1), new h(cgc.kb, 3, 1, 8, 1), new h(cgc.kc, 3, 1, 8, 1), new h(cgc.kd, 3, 1, 8, 1), new h(cgc.ke, 3, 1, 8, 1), new h(cgc.ka, 3, 1, 8, 1), new h(cgc.fz, 1, 1, 12, 1), new h(cgc.de, 1, 1, 12, 1), new h(cgc.df, 1, 1, 12, 1), new h(cgc.fF, 1, 2, 5, 1), new h(cgc.du, 1, 2, 5, 1), new h(cgc.S, 1, 8, 8, 1), new h(cgc.V, 1, 4, 6, 1), new h(cgc.wp, 1, 2, 5, 1), new h(cgc.s, 1, 2, 5, 1), new h(cgc.dr, 1, 2, 5, 1)}, (Object)2, (Object)new f[]{new h(cgc.pU, 5, 1, 4, 1), new h(cgc.pR, 5, 1, 4, 1), new h(cgc.hz, 3, 1, 6, 1), new h(cgc.kz, 6, 1, 6, 1), new h(cgc.oG, 1, 1, 8, 1), new h(cgc.r, 3, 3, 6, 1)}));

    private static Int2ObjectMap<f[]> a(ImmutableMap<Integer, f[]> $$0) {
        return new Int2ObjectOpenHashMap($$0);
    }

    public static interface f {
        @Nullable
        public clk a(bfj var1, apf var2);
    }

    static class b
    implements f {
        private final cfu a;
        private final int b;
        private final int c;
        private final int d;
        private final float e;

        public b(cml $$0, int $$1, int $$2, int $$3) {
            this.a = $$0.k();
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = 0.05f;
        }

        @Override
        public clk a(bfj $$0, apf $$1) {
            cfz $$2 = new cfz(this.a, this.b);
            return new clk($$2, new cfz(cgc.nL), this.c, this.d, this.e);
        }
    }

    static class h
    implements f {
        private final cfz a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final float f;

        public h(cpn $$0, int $$1, int $$2, int $$3, int $$4) {
            this(new cfz($$0), $$1, $$2, $$3, $$4);
        }

        public h(cfu $$0, int $$1, int $$2, int $$3) {
            this(new cfz($$0), $$1, $$2, 12, $$3);
        }

        public h(cfu $$0, int $$1, int $$2, int $$3, int $$4) {
            this(new cfz($$0), $$1, $$2, $$3, $$4);
        }

        public h(cfz $$0, int $$1, int $$2, int $$3, int $$4) {
            this($$0, $$1, $$2, $$3, $$4, 0.05f);
        }

        public h(cfz $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
        }

        @Override
        public clk a(bfj $$0, apf $$1) {
            return new clk(new cfz(cgc.nL, this.b), new cfz(this.a.d(), this.c), this.d, this.e, this.f);
        }
    }

    static class i
    implements f {
        final bey a;
        final int b;
        final int c;
        private final float d;

        public i(bey $$0, int $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = 0.05f;
        }

        @Override
        @Nullable
        public clk a(bfj $$0, apf $$1) {
            cfz $$2 = new cfz(cgc.va, 1);
            chj.a($$2, this.a, this.b);
            return new clk(new cfz(cgc.nL, 1), $$2, 12, this.c, this.d);
        }
    }

    static class g
    implements f {
        private final cfz a;
        private final int b;
        private final int c;
        private final cfz d;
        private final int e;
        private final int f;
        private final int g;
        private final float h;

        public g(cml $$0, int $$1, cfu $$2, int $$3, int $$4, int $$5) {
            this($$0, $$1, 1, $$2, $$3, $$4, $$5);
        }

        public g(cml $$0, int $$1, int $$2, cfu $$3, int $$4, int $$5, int $$6) {
            this.a = new cfz($$0);
            this.b = $$1;
            this.c = $$2;
            this.d = new cfz($$3);
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
            this.h = 0.05f;
        }

        @Override
        @Nullable
        public clk a(bfj $$0, apf $$1) {
            return new clk(new cfz(cgc.nL, this.c), new cfz(this.a.d(), this.b), new cfz(this.d.d(), this.e), this.f, this.g, this.h);
        }
    }

    static class e
    implements f {
        private final cfz a;
        private final int b;
        private final int c;
        private final int d;
        private final float e;

        public e(cfu $$0, int $$1, int $$2, int $$3) {
            this($$0, $$1, $$2, $$3, 0.05f);
        }

        public e(cfu $$0, int $$1, int $$2, int $$3, float $$4) {
            this.a = new cfz($$0);
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        @Override
        public clk a(bfj $$0, apf $$1) {
            int $$2 = 5 + $$1.a(15);
            cfz $$3 = cki.a($$1, new cfz(this.a.d()), $$2, false);
            int $$4 = Math.min(this.b + $$2, 64);
            cfz $$5 = new cfz(cgc.nL, $$4);
            return new clk($$5, $$3, this.c, this.d, this.e);
        }
    }

    static class c
    implements f {
        private final Map<byg, cfu> a;
        private final int b;
        private final int c;
        private final int d;

        public c(int $$02, int $$12, int $$2, Map<byg, cfu> $$3) {
            jb.z.s().filter($$1 -> !$$3.containsKey($$1)).findAny().ifPresent($$0 -> {
                throw new IllegalStateException("Missing trade for villager type: " + jb.z.b((byg)$$0));
            });
            this.a = $$3;
            this.b = $$02;
            this.c = $$12;
            this.d = $$2;
        }

        @Override
        @Nullable
        public clk a(bfj $$0, apf $$1) {
            if ($$0 instanceof byd) {
                cfz $$2 = new cfz(this.a.get(((byd)((Object)$$0)).gj().a()), this.b);
                return new clk($$2, new cfz(cgc.nL), this.c, this.d, 0.05f);
            }
            return null;
        }
    }

    static class j
    implements f {
        private final cfz a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final cfu f;
        private final int g;
        private final float h;

        public j(cfu $$0, int $$1, cfu $$2, int $$3, int $$4, int $$5, int $$6) {
            this.a = new cfz($$2);
            this.c = $$4;
            this.d = $$5;
            this.e = $$6;
            this.f = $$0;
            this.g = $$1;
            this.b = $$3;
            this.h = 0.05f;
        }

        @Override
        public clk a(bfj $$02, apf $$1) {
            cfz $$2 = new cfz(cgc.nL, this.c);
            List $$3 = jb.j.s().filter($$0 -> !$$0.a().isEmpty() && chx.a($$0)).collect(Collectors.toList());
            chw $$4 = (chw)$$3.get($$1.a($$3.size()));
            cfz $$5 = chy.a(new cfz(this.a.d(), this.b), $$4);
            return new clk($$2, new cfz(this.f, this.g), $$5, this.d, this.e, this.h);
        }
    }

    static class d
    implements f {
        private final int a;

        public d(int $$0) {
            this.a = $$0;
        }

        @Override
        public clk a(bfj $$0, apf $$1) {
            List $$2 = jb.g.s().filter(ckg::h).collect(Collectors.toList());
            ckg $$3 = (ckg)$$2.get($$1.a($$2.size()));
            int $$4 = apa.a($$1, $$3.e(), $$3.a());
            cfz $$5 = cev.a(new ckj($$3, $$4));
            int $$6 = 2 + $$1.a(5 + $$4 * 10) + 3 * $$4;
            if ($$3.b()) {
                $$6 *= 2;
            }
            if ($$6 > 64) {
                $$6 = 64;
            }
            return new clk(new cfz(cgc.nL, $$6), new cfz(cgc.qb), $$5, 12, this.a, 0.2f);
        }
    }

    static class k
    implements f {
        private final int a;
        private final anl<dsa> b;
        private final String c;
        private final dyl.a d;
        private final int e;
        private final int f;

        public k(int $$0, anl<dsa> $$1, String $$2, dyl.a $$3, int $$4, int $$5) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
        }

        @Override
        @Nullable
        public clk a(bfj $$0, apf $$1) {
            if (!($$0.dI() instanceof aif)) {
                return null;
            }
            aif $$2 = (aif)$$0.dI();
            gu $$3 = $$2.a(this.b, $$0.di(), 100, true);
            if ($$3 != null) {
                cfz $$4 = cgg.a($$2, $$3.u(), $$3.w(), (byte)2, true, true);
                cgg.a($$2, $$4);
                dyo.a($$4, $$3, "+", this.d);
                $$4.a(sw.c(this.c));
                return new clk(new cfz(cgc.nL, this.a), new cfz(cgc.qe), $$4, this.e, this.f, 0.2f);
            }
            return null;
        }
    }

    static class a
    implements f {
        private final cfu a;
        private final int b;
        private final int c;
        private final int d;

        public a(cfu $$0, int $$1) {
            this($$0, $$1, 12, 1);
        }

        public a(cfu $$0, int $$1, int $$2, int $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public clk a(bfj $$0, apf $$1) {
            cfz $$2 = new cfz(cgc.nL, this.b);
            cfz $$3 = new cfz(this.a);
            if (this.a instanceof cep) {
                ArrayList $$4 = Lists.newArrayList();
                $$4.add(byf$a.a($$1));
                if ($$1.i() > 0.7f) {
                    $$4.add(byf$a.a($$1));
                }
                if ($$1.i() > 0.8f) {
                    $$4.add(byf$a.a($$1));
                }
                $$3 = cer.a($$3, $$4);
            }
            return new clk($$2, $$3, this.c, this.d, 0.2f);
        }

        private static ceo a(apf $$0) {
            return ceo.a(cen.a($$0.a(16)));
        }
    }
}

