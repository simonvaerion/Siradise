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

public class bwz {
    public static final int a = 8;
    public static final int b = 4;
    private static final bdi c = apw.a(5, 20);
    private static final int d = 200;
    private static final int e = 8;
    private static final int f = 15;
    private static final int g = 40;
    private static final int h = 15;
    private static final int i = 200;
    private static final bdi j = bdi.a(5, 16);
    private static final float k = 1.0f;
    private static final float l = 1.3f;
    private static final float m = 0.6f;
    private static final float n = 0.4f;
    private static final float o = 0.6f;

    protected static bha<?> a(bha<bwy> $$0) {
        bwz.b($$0);
        bwz.c($$0);
        bwz.d($$0);
        bwz.e($$0);
        $$0.a((Set<bzz>)ImmutableSet.of((Object)bzz.a));
        $$0.b(bzz.b);
        $$0.f();
        return $$0;
    }

    private static void b(bha<bwy> $$0) {
        $$0.a(bzz.a, 0, (ImmutableList<bhs<bwy>>)ImmutableList.of((Object)new biw(45, 90), (Object)new bja()));
    }

    private static void c(bha<bwy> $$0) {
        $$0.a(bzz.b, 10, (ImmutableList<bhs<bwy>>)ImmutableList.of(bhq.a(bpb.av, 200), (Object)new bhl(bfn.W, 0.6f), bju.a(bpb.av, 1.0f, 8, true), bkc.a(bwz::d), bld.a(bwy::r, bju.b(bpb.ap, 0.4f, 8, false)), bjq.a(8.0f, bdi.a(30, 60)), bho.a(j, 0.6f), bwz.a()));
    }

    private static void d(bha<bwy> $$0) {
        $$0.a(bzz.k, 10, (ImmutableList<bhs<bwy>>)ImmutableList.of(bhq.a(bpb.av, 200), (Object)new bhl(bfn.W, 0.6f), bjv.a(1.0f), bld.a(bwy::r, bix.a(40)), bld.a(bfe::h_, bix.a(15)), bkf.a(), bid.a(bwz::i, bpb.o)), bpb.o);
    }

    private static void e(bha<bwy> $$0) {
        $$0.a(bzz.n, 10, (ImmutableList<bhs<bwy>>)ImmutableList.of(bju.b(bpb.z, 1.3f, 15, false), bwz.a(), bjq.a(8.0f, bdi.a(30, 60)), bid.a(bwz::e, bpb.z)), bpb.z);
    }

    private static bjn<bwy> a() {
        return new bjn<bwy>((List<Pair<bhs<bwy>, Integer>>)ImmutableList.of((Object)Pair.of(bji.a(0.4f), (Object)2), (Object)Pair.of(bjx.a(0.4f, 3), (Object)2), (Object)Pair.of((Object)new bib(30, 60), (Object)1)));
    }

    protected static void a(bwy $$0) {
        bha<bwy> $$1 = $$0.dK();
        bzz $$2 = $$1.g().orElse(null);
        $$1.a((List<bzz>)ImmutableList.of((Object)bzz.k, (Object)bzz.n, (Object)bzz.b));
        bzz $$3 = $$1.g().orElse(null);
        if ($$2 != $$3) {
            bwz.b($$0).ifPresent($$0::b);
        }
        $$0.v($$1.a(bpb.o));
    }

    protected static void a(bwy $$0, bfz $$1) {
        if ($$0.h_()) {
            return;
        }
        if ($$1.ae() == bfn.aw && bwz.f($$0)) {
            bwz.e($$0, $$1);
            bwz.c($$0, $$1);
            return;
        }
        bwz.h($$0, $$1);
    }

    private static void c(bwy $$0, bfz $$12) {
        bwz.g($$0).forEach($$1 -> bwz.d($$1, $$12));
    }

    private static void d(bwy $$0, bfz $$1) {
        bfz $$2 = $$1;
        bha<bwy> $$3 = $$0.dK();
        $$2 = bht.a((bfz)$$0, $$3.c(bpb.z), $$2);
        $$2 = bht.a((bfz)$$0, $$3.c(bpb.o), $$2);
        bwz.e($$0, $$2);
    }

    private static void e(bwy $$0, bfz $$1) {
        $$0.dK().b(bpb.o);
        $$0.dK().b(bpb.m);
        $$0.dK().a(bpb.z, $$1, c.a($$0.dI().z));
    }

    private static Optional<? extends bfz> d(bwy $$0) {
        if (bwz.c($$0) || bwz.i($$0)) {
            return Optional.empty();
        }
        return $$0.dK().c(bpb.l);
    }

    static boolean a(bwy $$0, gu $$1) {
        Optional<gu> $$2 = $$0.dK().c(bpb.av);
        return $$2.isPresent() && $$2.get().a($$1, 8.0);
    }

    private static boolean e(bwy $$0) {
        return $$0.r() && !bwz.f($$0);
    }

    private static boolean f(bwy $$0) {
        int $$2;
        if ($$0.h_()) {
            return false;
        }
        int $$1 = $$0.dK().c(bpb.ar).orElse(0);
        return $$1 > ($$2 = $$0.dK().c(bpb.as).orElse(0) + 1);
    }

    protected static void b(bwy $$0, bfz $$1) {
        bha<bwy> $$2 = $$0.dK();
        $$2.b(bpb.aw);
        $$2.b(bpb.r);
        if ($$0.h_()) {
            bwz.d($$0, $$1);
            return;
        }
        bwz.f($$0, $$1);
    }

    private static void f(bwy $$0, bfz $$1) {
        if ($$0.dK().c(bzz.n) && $$1.ae() == bfn.aw) {
            return;
        }
        if ($$1.ae() == bfn.W) {
            return;
        }
        if (bht.a((bfz)$$0, $$1, 4.0)) {
            return;
        }
        if (!bqf.c($$0, $$1)) {
            return;
        }
        bwz.g($$0, $$1);
        bwz.h($$0, $$1);
    }

    private static void g(bwy $$0, bfz $$1) {
        bha<bwy> $$2 = $$0.dK();
        $$2.b(bpb.E);
        $$2.b(bpb.r);
        $$2.a(bpb.o, $$1, 200L);
    }

    private static void h(bwy $$0, bfz $$12) {
        bwz.g($$0).forEach($$1 -> bwz.i($$1, $$12));
    }

    private static void i(bwy $$0, bfz $$1) {
        if (bwz.c($$0)) {
            return;
        }
        Optional<bfz> $$2 = $$0.dK().c(bpb.o);
        bfz $$3 = bht.a((bfz)$$0, $$2, $$1);
        bwz.g($$0, $$3);
    }

    public static Optional<amg> b(bwy $$0) {
        return $$0.dK().g().map($$1 -> bwz.a($$0, $$1));
    }

    private static amg a(bwy $$0, bzz $$1) {
        if ($$1 == bzz.n || $$0.w()) {
            return amh.kS;
        }
        if ($$1 == bzz.k) {
            return amh.kN;
        }
        if (bwz.h($$0)) {
            return amh.kS;
        }
        return amh.kM;
    }

    private static List<bwy> g(bwy $$0) {
        return $$0.dK().c(bpb.ao).orElse((List<bwy>)ImmutableList.of());
    }

    private static boolean h(bwy $$0) {
        return $$0.dK().a(bpb.av);
    }

    private static boolean i(bwy $$0) {
        return $$0.dK().a(bpb.r);
    }

    protected static boolean c(bwy $$0) {
        return $$0.dK().a(bpb.aw);
    }
}

