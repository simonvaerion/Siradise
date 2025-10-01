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
import java.util.Optional;
import java.util.Set;

public class bst {
    private static final bdi a = bdi.a(5, 16);
    private static final float b = 0.2f;
    private static final float c = 0.15f;
    private static final float d = 0.5f;
    private static final float e = 0.6f;
    private static final float f = 0.6f;

    protected static bha<?> a(bha<bss> $$0) {
        bst.d($$0);
        bst.e($$0);
        bst.c($$0);
        bst.b($$0);
        $$0.a((Set<bzz>)ImmutableSet.of((Object)bzz.a));
        $$0.b(bzz.b);
        $$0.f();
        return $$0;
    }

    private static void b(bha<bss> $$0) {
        $$0.a(bzz.p, (ImmutableList<Pair<Integer, bhs<bss>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new bsu()), (Object)Pair.of((Object)1, bid.a(bht::a, bpb.M))), (Set<Pair<bpb<?>, bpc>>)ImmutableSet.of((Object)Pair.of(bpb.M, (Object)((Object)bpc.a))), (Set<bpb<?>>)ImmutableSet.of(bpb.M));
    }

    private static void c(bha<bss> $$0) {
        $$0.a(bzz.k, 0, (ImmutableList<bhs<bss>>)ImmutableList.of(bkf.a(bss::a), bjv.a(bst::b), bix.a(20), bid.a(bht::a, bpb.o)), bpb.o);
    }

    private static void d(bha<bss> $$0) {
        $$0.a(bzz.a, 0, (ImmutableList<bhs<bss>>)ImmutableList.of((Object)new biw(45, 90), (Object)new bja(), bsv.a(), (Object)new bhx(bpb.O)));
    }

    private static void e(bha<bss> $$0) {
        $$0.a(bzz.b, (ImmutableList<Pair<Integer, bhs<bss>>>)ImmutableList.of((Object)Pair.of((Object)0, bjq.a(bfn.bt, 6.0f, bdi.a(30, 60))), (Object)Pair.of((Object)1, (Object)new bhl(bfn.f, 0.2f)), (Object)Pair.of((Object)2, new bjn(ImmutableList.of((Object)Pair.of((Object)new bie(bst::d), (Object)1), (Object)Pair.of(bho.a(a, bst::c), (Object)1)))), (Object)Pair.of((Object)3, bkc.a(bst::b)), (Object)Pair.of((Object)3, bkp.a(6, 0.15f)), (Object)Pair.of((Object)4, new bif((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.m, (Object)((Object)bpc.b)), (Set<bpb<?>>)ImmutableSet.of(), bif.a.a, bif.b.b, ImmutableList.of((Object)Pair.of(bji.c(0.5f), (Object)2), (Object)Pair.of(bji.a(0.15f, false), (Object)2), (Object)Pair.of(bjx.a(bst::a, bst::d, 3), (Object)3), (Object)Pair.of(bld.a(bfj::aY), (Object)5), (Object)Pair.of(bld.a(bfj::ay), (Object)5))))));
    }

    private static boolean a(bfz $$0) {
        cmm $$1 = $$0.dI();
        Optional<bje> $$2 = $$0.dK().c(bpb.n);
        if ($$2.isPresent()) {
            gu $$3 = $$2.get().b();
            return $$1.y($$3) == $$0.aY();
        }
        return false;
    }

    public static void a(bss $$0) {
        bha<bss> $$1 = $$0.dK();
        bzz $$2 = $$1.g().orElse(null);
        if ($$2 != bzz.p) {
            $$1.a((List<bzz>)ImmutableList.of((Object)bzz.p, (Object)bzz.k, (Object)bzz.b));
            if ($$2 == bzz.k && $$1.g().orElse(null) != bzz.k) {
                $$1.a(bpb.T, true, 2400L);
            }
        }
    }

    private static float b(bfz $$0) {
        return $$0.aY() ? 0.6f : 0.15f;
    }

    private static float c(bfz $$0) {
        return $$0.aY() ? 0.6f : 0.15f;
    }

    private static float d(bfz $$0) {
        return $$0.aY() ? 0.5f : 0.15f;
    }

    private static Optional<? extends bfz> b(bss $$0) {
        if (bht.a($$0)) {
            return Optional.empty();
        }
        return $$0.dK().c(bpb.B);
    }

    public static ciz a() {
        return ciz.a(ane.aA);
    }
}

