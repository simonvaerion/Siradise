/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class brd {
    public static final acp<brc> a = brd.a("armorer");
    public static final acp<brc> b = brd.a("butcher");
    public static final acp<brc> c = brd.a("cartographer");
    public static final acp<brc> d = brd.a("cleric");
    public static final acp<brc> e = brd.a("farmer");
    public static final acp<brc> f = brd.a("fisherman");
    public static final acp<brc> g = brd.a("fletcher");
    public static final acp<brc> h = brd.a("leatherworker");
    public static final acp<brc> i = brd.a("librarian");
    public static final acp<brc> j = brd.a("mason");
    public static final acp<brc> k = brd.a("shepherd");
    public static final acp<brc> l = brd.a("toolsmith");
    public static final acp<brc> m = brd.a("weaponsmith");
    public static final acp<brc> n = brd.a("home");
    public static final acp<brc> o = brd.a("meeting");
    public static final acp<brc> p = brd.a("beehive");
    public static final acp<brc> q = brd.a("bee_nest");
    public static final acp<brc> r = brd.a("nether_portal");
    public static final acp<brc> s = brd.a("lodestone");
    public static final acp<brc> t = brd.a("lightning_rod");
    private static final Set<dcb> u = (Set)ImmutableList.of((Object)cpo.bn, (Object)cpo.bo, (Object)cpo.bk, (Object)cpo.bl, (Object)cpo.bi, (Object)cpo.bg, (Object)cpo.bm, (Object)cpo.bc, (Object)cpo.bh, (Object)cpo.be, (Object)cpo.bb, (Object)cpo.ba, (Object[])new cpn[]{cpo.bf, cpo.bj, cpo.aZ, cpo.bd}).stream().flatMap($$0 -> $$0.l().a().stream()).filter($$0 -> $$0.c(cpg.a) == dco.a).collect(ImmutableSet.toImmutableSet());
    private static final Set<dcb> v = (Set)ImmutableList.of((Object)cpo.ft, (Object)cpo.fv, (Object)cpo.fu, (Object)cpo.fw).stream().flatMap($$0 -> $$0.l().a().stream()).collect(ImmutableSet.toImmutableSet());
    private static final Map<dcb, he<brc>> w = Maps.newHashMap();

    private static Set<dcb> a(cpn $$0) {
        return ImmutableSet.copyOf($$0.l().a());
    }

    private static acp<brc> a(String $$0) {
        return acp.a(jc.S, new acq($$0));
    }

    private static brc a(hr<brc> $$0, acp<brc> $$1, Set<dcb> $$2, int $$3, int $$4) {
        brc $$5 = new brc($$2, $$3, $$4);
        hr.a($$0, $$1, $$5);
        brd.a($$0.f($$1), $$2);
        return $$5;
    }

    private static void a(he<brc> $$0, Set<dcb> $$12) {
        $$12.forEach($$1 -> {
            he<brc> $$2 = w.put((dcb)$$1, $$0);
            if ($$2 != null) {
                throw ac.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1)));
            }
        });
    }

    public static Optional<he<brc>> a(dcb $$0) {
        return Optional.ofNullable(w.get($$0));
    }

    public static boolean b(dcb $$0) {
        return w.containsKey($$0);
    }

    public static brc a(hr<brc> $$0) {
        brd.a($$0, a, brd.a(cpo.nW), 1, 1);
        brd.a($$0, b, brd.a(cpo.nV), 1, 1);
        brd.a($$0, c, brd.a(cpo.nX), 1, 1);
        brd.a($$0, d, brd.a(cpo.fs), 1, 1);
        brd.a($$0, e, brd.a(cpo.pc), 1, 1);
        brd.a($$0, f, brd.a(cpo.nU), 1, 1);
        brd.a($$0, g, brd.a(cpo.nY), 1, 1);
        brd.a($$0, h, v, 1, 1);
        brd.a($$0, i, brd.a(cpo.oa), 1, 1);
        brd.a($$0, j, brd.a(cpo.oc), 1, 1);
        brd.a($$0, k, brd.a(cpo.nT), 1, 1);
        brd.a($$0, l, brd.a(cpo.ob), 1, 1);
        brd.a($$0, m, brd.a(cpo.nZ), 1, 1);
        brd.a($$0, n, u, 1, 1);
        brd.a($$0, o, brd.a(cpo.od), 32, 6);
        brd.a($$0, p, brd.a(cpo.pf), 0, 1);
        brd.a($$0, q, brd.a(cpo.pe), 0, 1);
        brd.a($$0, r, brd.a(cpo.ee), 0, 1);
        brd.a($$0, s, brd.a(cpo.pq), 0, 1);
        return brd.a($$0, t, brd.a(cpo.rr), 0, 1);
    }
}

