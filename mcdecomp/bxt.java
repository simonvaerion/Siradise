/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bxt {
    private static final float d = 0.5f;
    private static final float e = 0.7f;
    private static final float f = 1.2f;
    private static final int g = 18;
    private static final int h = apa.f(100.0f);
    public static final int a = apa.f(133.59999f);
    public static final int b = apa.f(84.0f);
    private static final int i = apa.f(83.2f);
    public static final int c = 1200;
    private static final int j = 100;
    private static final List<bqg<? extends bqf<? super bxs>>> k = List.of(bqg.d, bqg.v);
    private static final List<bpb<?>> l = List.of(bpb.g, bpb.h, bpb.k, bpb.l, bpb.L, bpb.n, bpb.m, bpb.E, bpb.t, bpb.o, bpb.p, bpb.B, bpb.ax, bpb.ay, bpb.az, bpb.aA, bpb.aB, bpb.aC, bpb.aD, bpb.aE, bpb.aF, bpb.aG, bpb.aH, bpb.aI, bpb.aJ, bpb.aK);
    private static final bhs<bxs> m = bld.a((bld.b<E> $$0) -> $$0.group($$0.a(bpb.aD)).apply((Applicative)$$0, $$1 -> ($$2, $$3, $$4) -> {
        if ($$0.a($$1).isPresent()) {
            $$1.a(apz.a, 1200L);
        }
        return true;
    }));

    public static void a(bxs $$0) {
        $$0.dK().a((List<bzz>)ImmutableList.of((Object)bzz.y, (Object)bzz.z, (Object)bzz.x, (Object)bzz.k, (Object)bzz.w, (Object)bzz.v, (Object)bzz.b));
    }

    protected static bha<?> a(bxs $$0, Dynamic<?> $$1) {
        bha.b $$2 = bha.a(l, k);
        bha<bxs> $$3 = $$2.a($$1);
        bxt.a($$3);
        bxt.b($$3);
        bxt.c($$3);
        bxt.d($$3);
        bxt.g($$3);
        bxt.a($$0, $$3);
        bxt.e($$3);
        bxt.f($$3);
        $$3.a((Set<bzz>)ImmutableSet.of((Object)bzz.a));
        $$3.b(bzz.b);
        $$3.f();
        return $$3;
    }

    private static void a(bha<bxs> $$0) {
        $$0.a(bzz.a, 0, (ImmutableList<bhs<bxs>>)ImmutableList.of((Object)new bkk(0.8f), blo.a(), (Object)new biw(45, 90), (Object)new bja()));
    }

    private static void b(bha<bxs> $$0) {
        $$0.a(bzz.y, 5, (ImmutableList<bhs<bxs>>)ImmutableList.of(new blk(a)), bpb.aB);
    }

    private static void c(bha<bxs> $$0) {
        $$0.a(bzz.z, (ImmutableList<Pair<Integer, bhs<bxs>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new bll()), (Object)Pair.of((Object)1, new blj(h))), (Set<Pair<bpb<?>, bpc>>)ImmutableSet.of((Object)Pair.of(bpb.ax, (Object)((Object)bpc.b)), (Object)Pair.of(bpb.aD, (Object)((Object)bpc.b))));
    }

    private static void d(bha<bxs> $$0) {
        $$0.a(bzz.b, 10, (ImmutableList<bhs<bxs>>)ImmutableList.of(bln.a(bxs::fY), blr.a(), new bjn((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.aA, (Object)((Object)bpc.b)), ImmutableList.of((Object)Pair.of(bji.a(0.5f), (Object)2), (Object)Pair.of((Object)new bib(30, 60), (Object)1)))));
    }

    private static void e(bha<bxs> $$0) {
        $$0.a(bzz.w, 5, (ImmutableList<bhs<bxs>>)ImmutableList.of(bln.a(bxs::fY), bik.a(bpb.ay, 2, 0.7f)), bpb.ay);
    }

    private static void f(bha<bxs> $$0) {
        $$0.a(bzz.v, 5, (ImmutableList<bhs<bxs>>)ImmutableList.of(bln.a(bxs::fY), new blp(i)), bpb.aA);
    }

    private static void g(bha<bxs> $$0) {
        $$0.a(bzz.x, 10, (ImmutableList<bhs<bxs>>)ImmutableList.of((Object)new blm()), bpb.ax);
    }

    private static void a(bxs $$0, bha<bxs> $$12) {
        $$12.a(bzz.k, 10, (ImmutableList<bhs<bxs>>)ImmutableList.of(m, bkf.a($$1 -> !$$0.w().d() || !$$0.a((bfj)$$1), bxt::b, false), bjp.a((bfz $$1) -> bxt.a($$0, $$1), (float)$$0.b(bhg.b)), bjv.a(1.2f), (Object)new blq(), bix.a(18)), bpb.o);
    }

    private static boolean a(bxs $$0, bfz $$12) {
        return $$0.dK().c(bpb.o).filter($$1 -> $$1 == $$12).isPresent();
    }

    private static void b(bxs $$0, bfz $$1) {
        if (!$$0.a((bfj)$$1)) {
            $$0.b((bfj)$$1);
        }
        bxt.a((bfz)$$0);
    }

    public static void a(bfz $$0) {
        if ($$0.dK().a(bpb.aD)) {
            $$0.dK().a(bpb.aD, apz.a, 1200L);
        }
    }

    public static void a(bxs $$0, gu $$1) {
        if (!$$0.dI().w_().a($$1) || $$0.fY().isPresent() || $$0.dK().c(bpb.o).isPresent()) {
            return;
        }
        bxt.a((bfz)$$0);
        $$0.dK().a(bpb.aF, apz.a, 100L);
        $$0.dK().a(bpb.n, new bhu($$1), 100L);
        $$0.dK().a(bpb.ay, $$1, 100L);
        $$0.dK().b(bpb.m);
    }
}

