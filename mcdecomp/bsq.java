/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;

public class bsq {
    private static final float a = 1.0f;
    private static final float b = 2.25f;
    private static final float c = 1.75f;
    private static final float d = 2.5f;
    private static final int e = 4;
    private static final int f = 16;
    private static final int g = 6;
    private static final int h = 30;
    private static final int i = 60;
    private static final int j = 600;
    private static final int k = 32;
    private static final int l = 20;

    protected static bha<?> a(bha<bsp> $$0) {
        bsq.b($$0);
        bsq.c($$0);
        $$0.a((Set<bzz>)ImmutableSet.of((Object)bzz.a));
        $$0.b(bzz.b);
        $$0.f();
        return $$0;
    }

    private static void b(bha<bsp> $$0) {
        $$0.a(bzz.a, 0, (ImmutableList<bhs<bsp>>)ImmutableList.of((Object)new bkk(0.8f), (Object)new bhm(2.5f), (Object)new biw(45, 90), (Object)new bja(), (Object)new bhx(bpb.aN), (Object)new bhx(bpb.aO)));
    }

    private static void c(bha<bsp> $$02) {
        $$02.a(bzz.b, (ImmutableList<Pair<Integer, bhs<bsp>>>)ImmutableList.of((Object)Pair.of((Object)0, bil.a($$0 -> true, 1.75f, true, 32)), (Object)Pair.of((Object)1, new bih(bsq::b, 2.25f, 20)), (Object)Pair.of((Object)2, bke.a(bsq::b, Predicate.not(bsq::c), 4, 16, 2.25f)), (Object)Pair.of((Object)3, bjq.a(6.0f, bdi.a(30, 60))), (Object)Pair.of((Object)4, new bjn(ImmutableList.of((Object)Pair.of(bji.b(1.0f), (Object)2), (Object)Pair.of(bjx.a(1.0f, 3), (Object)2), (Object)Pair.of((Object)new bib(30, 60), (Object)1))))), (Set<Pair<bpb<?>, bpc>>)ImmutableSet.of());
    }

    public static void a(bsp $$0) {
        $$0.dK().a((List<bzz>)ImmutableList.of((Object)bzz.b));
    }

    public static void a(bfz $$0, gu $$1) {
        bha<?> $$2 = $$0.dK();
        hd $$3 = hd.a($$0.dI().ac(), $$1);
        Optional<hd> $$4 = $$2.c(bpb.aM);
        if ($$4.isEmpty()) {
            $$2.a(bpb.aM, $$3);
            $$2.a(bpb.aN, Integer.valueOf(600));
        } else if ($$4.get().equals($$3)) {
            $$2.a(bpb.aN, Integer.valueOf(600));
        }
    }

    private static Optional<bje> b(bfz $$0) {
        bha<?> $$1 = $$0.dK();
        Optional<hd> $$2 = $$1.c(bpb.aM);
        if ($$2.isPresent()) {
            hd $$3 = $$2.get();
            if (bsq.a($$0, $$1, $$3)) {
                return Optional.of(new bhu($$3.b().c()));
            }
            $$1.b(bpb.aM);
        }
        return bsq.d($$0);
    }

    private static boolean c(bfz $$0) {
        bha<bvh> $$1 = $$0.dK();
        return $$1.a(bpb.K);
    }

    private static boolean a(bfz $$0, bha<?> $$1, hd $$2) {
        Optional<Integer> $$3 = $$1.c(bpb.aN);
        cmm $$4 = $$0.dI();
        return $$4.ac() == $$2.a() && $$4.a_($$2.b()).a(cpo.aY) && $$3.isPresent();
    }

    private static Optional<bje> d(bfz $$02) {
        return bsq.a($$02).map($$0 -> new bic((bfj)$$0, true));
    }

    public static Optional<aig> a(bfz $$0) {
        cmm $$1 = $$0.dI();
        if (!$$1.r_() && $$1 instanceof aif) {
            aif $$2 = (aif)$$1;
            Optional<UUID> $$3 = $$0.dK().c(bpb.aL);
            if ($$3.isPresent()) {
                bfj $$4 = $$2.a($$3.get());
                if ($$4 instanceof aig) {
                    aig $$5 = (aig)$$4;
                    if (($$5.e.d() || $$5.e.e()) && $$5.a((bfj)$$0, 64.0)) {
                        return Optional.of($$5);
                    }
                }
                return Optional.empty();
            }
        }
        return Optional.empty();
    }
}

