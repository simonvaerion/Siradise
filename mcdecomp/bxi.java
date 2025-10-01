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

public class bxi {
    private static final int a = 600;
    private static final int b = 20;
    private static final double c = 0.0125;
    private static final int d = 8;
    private static final int e = 8;
    private static final double f = 12.0;
    private static final float g = 0.6f;
    private static final int h = 2;
    private static final int i = 100;
    private static final int j = 5;

    protected static bha<?> a(bxh $$0, bha<bxh> $$1) {
        bxi.b($$0, $$1);
        bxi.c($$0, $$1);
        bxi.d($$0, $$1);
        $$1.a((Set<bzz>)ImmutableSet.of((Object)bzz.a));
        $$1.b(bzz.b);
        $$1.f();
        return $$1;
    }

    protected static void a(bxh $$0) {
        hd $$1 = hd.a($$0.dI().ac(), $$0.di());
        $$0.dK().a(bpb.b, $$1);
    }

    private static void b(bxh $$0, bha<bxh> $$1) {
        $$1.a(bzz.a, 0, (ImmutableList<bhs<bxh>>)ImmutableList.of((Object)new biw(45, 90), (Object)new bja(), bip.a(), bkg.a()));
    }

    private static void c(bxh $$0, bha<bxh> $$1) {
        $$1.a(bzz.b, 10, (ImmutableList<bhs<bxh>>)ImmutableList.of(bkc.a(bxi::a), bxi.a(), bxi.b(), bjs.a(bfn.bt, 4)));
    }

    private static void d(bxh $$0, bha<bxh> $$12) {
        $$12.a(bzz.k, 10, (ImmutableList<bhs<bxh>>)ImmutableList.of(bkf.a((bfz $$1) -> !bxi.a((bxd)$$0, $$1)), bjv.a(1.0f), bix.a(20)), bpb.o);
    }

    private static bjn<bxh> a() {
        return new bjn<bxh>((List<Pair<bhs<bxh>, Integer>>)ImmutableList.of((Object)Pair.of(bjp.a(bfn.bt, 8.0f), (Object)1), (Object)Pair.of(bjp.a(bfn.aw, 8.0f), (Object)1), (Object)Pair.of(bjp.a(bfn.ax, 8.0f), (Object)1), (Object)Pair.of(bjp.a(8.0f), (Object)1), (Object)Pair.of((Object)new bib(30, 60), (Object)1)));
    }

    private static bjn<bxh> b() {
        return new bjn<bxh>((List<Pair<bhs<bxh>, Integer>>)ImmutableList.of((Object)Pair.of(bji.a(0.6f), (Object)2), (Object)Pair.of(bio.a(bfn.aw, 8, bpb.q, 0.6f, 2), (Object)2), (Object)Pair.of(bio.a(bfn.ax, 8, bpb.q, 0.6f, 2), (Object)2), (Object)Pair.of(bki.a(bpb.b, 0.6f, 2, 100), (Object)2), (Object)Pair.of(bkh.a(bpb.b, 0.6f, 5), (Object)2), (Object)Pair.of((Object)new bib(30, 60), (Object)1)));
    }

    protected static void b(bxh $$0) {
        bha<bxh> $$1 = $$0.dK();
        bzz $$2 = $$1.g().orElse(null);
        $$1.a((List<bzz>)ImmutableList.of((Object)bzz.k, (Object)bzz.b));
        bzz $$3 = $$1.g().orElse(null);
        if ($$2 != $$3) {
            bxi.d($$0);
        }
        $$0.v($$1.a(bpb.o));
    }

    private static boolean a(bxd $$0, bfz $$12) {
        return bxi.a($$0).filter($$1 -> $$1 == $$12).isPresent();
    }

    private static Optional<? extends bfz> a(bxd $$0) {
        Optional<bfz> $$1 = bht.a((bfz)$$0, bpb.aa);
        if ($$1.isPresent() && bqf.d($$0, $$1.get())) {
            return $$1;
        }
        Optional<? extends bfz> $$2 = bxi.a($$0, bpb.l);
        if ($$2.isPresent()) {
            return $$2;
        }
        return $$0.dK().c(bpb.L);
    }

    private static Optional<? extends bfz> a(bxd $$0, bpb<? extends bfz> $$12) {
        return $$0.dK().c($$12).filter($$1 -> $$1.a((bfj)$$0, 12.0));
    }

    protected static void a(bxh $$0, bfz $$1) {
        if ($$1 instanceof bxd) {
            return;
        }
        bxf.a((bxd)$$0, $$1);
    }

    protected static void b(bxh $$0, bfz $$1) {
        $$0.dK().b(bpb.E);
        $$0.dK().a(bpb.aa, $$1.ct(), 600L);
    }

    protected static void c(bxh $$0) {
        if ((double)$$0.dI().z.i() < 0.0125) {
            bxi.d($$0);
        }
    }

    private static void d(bxh $$0) {
        $$0.dK().g().ifPresent($$1 -> {
            if ($$1 == bzz.k) {
                $$0.gf();
            }
        });
    }
}

