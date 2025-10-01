/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class btb {
    private static final float a = 2.0f;
    private static final float b = 1.0f;
    private static final float c = 1.0f;
    private static final float d = 1.0f;
    private static final float e = 0.75f;
    private static final bdi f = bdi.a(100, 140);
    private static final int g = 2;
    private static final int h = 4;
    private static final float i = 1.5f;
    private static final float j = 1.25f;

    protected static void a(bta $$0, apf $$1) {
        $$0.dK().a(bpb.R, Integer.valueOf(f.a($$1)));
    }

    protected static bha<?> a(bha<bta> $$0) {
        btb.b($$0);
        btb.c($$0);
        btb.d($$0);
        btb.e($$0);
        btb.g($$0);
        btb.f($$0);
        $$0.a((Set<bzz>)ImmutableSet.of((Object)bzz.a));
        $$0.b(bzz.b);
        $$0.f();
        return $$0;
    }

    private static void b(bha<bta> $$0) {
        $$0.a(bzz.a, 0, (ImmutableList<bhs<bta>>)ImmutableList.of((Object)new bhm(2.0f), (Object)new biw(45, 90), (Object)new bja(), (Object)new bhx(bpb.O), (Object)new bhx(bpb.R)));
    }

    private static void c(bha<bta> $$02) {
        $$02.a(bzz.b, (ImmutableList<Pair<Integer, bhs<bta>>>)ImmutableList.of((Object)Pair.of((Object)0, bjq.a(bfn.bt, 6.0f, bdi.a(30, 60))), (Object)Pair.of((Object)0, (Object)new bhl(bfn.O, 1.0f)), (Object)Pair.of((Object)1, (Object)new bie($$0 -> Float.valueOf(1.25f))), (Object)Pair.of((Object)2, bkc.a(btb::b, (E $$0) -> $$0.dK().c(bpb.B))), (Object)Pair.of((Object)3, bkn.a(6, 1.0f)), (Object)Pair.of((Object)4, new bjn((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.m, (Object)((Object)bpc.b)), ImmutableList.of((Object)Pair.of(bji.a(1.0f), (Object)1), (Object)Pair.of(bjx.a(1.0f, 3), (Object)1), (Object)Pair.of((Object)new bhy(), (Object)3), (Object)Pair.of(bld.a(bfj::ay), (Object)2))))), (Set<Pair<bpb<?>, bpc>>)ImmutableSet.of((Object)Pair.of(bpb.S, (Object)((Object)bpc.b)), (Object)Pair.of(bpb.W, (Object)((Object)bpc.b))));
    }

    private static void d(bha<bta> $$02) {
        $$02.a(bzz.t, (ImmutableList<Pair<Integer, bhs<bta>>>)ImmutableList.of((Object)Pair.of((Object)0, bjq.a(bfn.bt, 6.0f, bdi.a(30, 60))), (Object)Pair.of((Object)1, (Object)new bie($$0 -> Float.valueOf(1.25f))), (Object)Pair.of((Object)2, bkc.a(btb::b, (E $$0) -> $$0.dK().c(bpb.B))), (Object)Pair.of((Object)3, bkn.a(8, 1.5f)), (Object)Pair.of((Object)5, new bif((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.m, (Object)((Object)bpc.b)), (Set<bpb<?>>)ImmutableSet.of(), bif.a.a, bif.b.b, ImmutableList.of((Object)Pair.of(bji.c(0.75f), (Object)1), (Object)Pair.of(bji.a(1.0f, true), (Object)1), (Object)Pair.of(bjx.a(1.0f, 3), (Object)1), (Object)Pair.of(bld.a(bfj::aY), (Object)5))))), (Set<Pair<bpb<?>, bpc>>)ImmutableSet.of((Object)Pair.of(bpb.S, (Object)((Object)bpc.b)), (Object)Pair.of(bpb.W, (Object)((Object)bpc.a))));
    }

    private static void e(bha<bta> $$02) {
        $$02.a(bzz.u, (ImmutableList<Pair<Integer, bhs<bta>>>)ImmutableList.of((Object)Pair.of((Object)0, bjq.a(bfn.bt, 6.0f, bdi.a(30, 60))), (Object)Pair.of((Object)1, bkc.a(btb::b, (E $$0) -> $$0.dK().c(bpb.B))), (Object)Pair.of((Object)2, bko.a(8, 1.0f)), (Object)Pair.of((Object)3, bkq.a(cpo.sm)), (Object)Pair.of((Object)4, new bjn(ImmutableList.of((Object)Pair.of(bji.a(1.0f), (Object)2), (Object)Pair.of(bjx.a(1.0f, 3), (Object)1), (Object)Pair.of((Object)new bhy(), (Object)2), (Object)Pair.of(bld.a(bfj::ay), (Object)1))))), (Set<Pair<bpb<?>, bpc>>)ImmutableSet.of((Object)Pair.of(bpb.S, (Object)((Object)bpc.b)), (Object)Pair.of(bpb.X, (Object)((Object)bpc.a))));
    }

    private static void f(bha<bta> $$02) {
        $$02.a(bzz.q, (ImmutableList<Pair<Integer, bhs<bta>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new bis(f, amh.iK)), (Object)Pair.of((Object)1, new bit<bta>(f, 2, 4, 1.5f, $$0 -> amh.iJ, amw.bI, 0.5f, btb::a))), (Set<Pair<bpb<?>, bpc>>)ImmutableSet.of((Object)Pair.of(bpb.N, (Object)((Object)bpc.b)), (Object)Pair.of(bpb.r, (Object)((Object)bpc.b)), (Object)Pair.of(bpb.R, (Object)((Object)bpc.b)), (Object)Pair.of(bpb.W, (Object)((Object)bpc.b))));
    }

    private static void g(bha<bta> $$0) {
        $$0.a(bzz.s, 0, (ImmutableList<bhs<bta>>)ImmutableList.of(bkf.a(), (Object)new btc(amh.iL, amh.iG)), bpb.o);
    }

    private static <E extends bgb> boolean a(E $$0, gu $$1) {
        cmm $$2 = $$0.dI();
        gu $$3 = $$1.d();
        if (!($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c())) {
            return false;
        }
        dcb $$4 = $$2.a_($$1);
        dcb $$5 = $$2.a_($$3);
        if ($$4.a(amw.bI) || $$5.a(amw.bI)) {
            return true;
        }
        dxp $$6 = dxy.a((cls)$$2, $$1.j());
        dxp $$7 = dxy.a((cls)$$2, $$3.j());
        if ($$6 == dxp.e || $$4.i() && $$7 == dxp.e) {
            return true;
        }
        return biu.a($$0, $$1);
    }

    private static boolean b(bta $$0) {
        return !bht.a($$0);
    }

    public static void a(bta $$0) {
        $$0.dK().a((List<bzz>)ImmutableList.of((Object)bzz.s, (Object)bzz.u, (Object)bzz.q, (Object)bzz.t, (Object)bzz.b));
    }

    public static ciz a() {
        return bta.bT;
    }
}

