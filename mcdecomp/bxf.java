/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bxf {
    public static final int a = 8;
    public static final int b = 4;
    public static final cfu c = cgc.nU;
    private static final int e = 16;
    private static final int f = 600;
    private static final int g = 120;
    private static final int h = 9;
    private static final int i = 200;
    private static final int j = 200;
    private static final int k = 300;
    protected static final bdi d = apw.a(30, 120);
    private static final int l = 100;
    private static final int m = 400;
    private static final int n = 8;
    private static final bdi o = apw.a(10, 40);
    private static final bdi p = apw.a(10, 30);
    private static final bdi q = apw.a(5, 20);
    private static final int r = 20;
    private static final int s = 200;
    private static final int t = 12;
    private static final int u = 8;
    private static final int v = 14;
    private static final int w = 8;
    private static final int x = 5;
    private static final float y = 0.75f;
    private static final int z = 6;
    private static final bdi A = apw.a(5, 7);
    private static final bdi B = apw.a(5, 7);
    private static final float C = 0.1f;
    private static final float D = 1.0f;
    private static final float E = 1.0f;
    private static final float F = 0.8f;
    private static final float G = 1.0f;
    private static final float H = 1.0f;
    private static final float I = 0.6f;
    private static final float J = 0.6f;

    protected static bha<?> a(bxe $$0, bha<bxe> $$1) {
        bxf.a($$1);
        bxf.b($$1);
        bxf.d($$1);
        bxf.b($$0, $$1);
        bxf.c($$1);
        bxf.e($$1);
        bxf.f($$1);
        $$1.a((Set<bzz>)ImmutableSet.of((Object)bzz.a));
        $$1.b(bzz.b);
        $$1.f();
        return $$1;
    }

    protected static void a(bxe $$0, apf $$1) {
        int $$2 = d.a($$1);
        $$0.dK().a(bpb.ag, true, $$2);
    }

    private static void a(bha<bxe> $$0) {
        $$0.a(bzz.a, 0, (ImmutableList<bhs<bxe>>)ImmutableList.of((Object)new biw(45, 90), (Object)new bja(), bip.a(), bxf.e(), bxf.f(), bxo.a(), bxk.a(120), bkd.a(300, bxf::a), bkg.a()));
    }

    private static void b(bha<bxe> $$0) {
        $$0.a(bzz.b, 10, (ImmutableList<bhs<bxe>>)ImmutableList.of(bjp.a(bxf::b, 14.0f), bkc.a(bxd::fZ, bxf::i), bld.a(bxe::q, bxl.a()), bxf.d(), bxf.g(), bxf.b(), bxf.c(), bjs.a(bfn.bt, 4)));
    }

    private static void b(bxe $$0, bha<bxe> $$12) {
        $$12.a(bzz.k, 10, (ImmutableList<bhs<bxe>>)ImmutableList.of(bkf.a((bfz $$1) -> !bxf.b($$0, $$1)), bld.a(bxf::c, bhp.a(5, 0.75f)), bjv.a(1.0f), bix.a(20), new bhz(), bxj.a(), bid.a(bxf::h, bpb.o)), bpb.o);
    }

    private static void c(bha<bxe> $$02) {
        $$02.a(bzz.l, 10, (ImmutableList<bhs<bxe>>)ImmutableList.of(bxf.d(), bjp.a(bxf::b, 14.0f), bkc.a(bxd::fZ, bxf::i), bld.a((E $$0) -> !$$0.gg(), bik.a(bpb.ah, 2, 1.0f)), bld.a(bxe::gg, bik.a(bpb.ah, 4, 0.6f)), new bjn(ImmutableList.of((Object)Pair.of(bjp.a(bfn.aw, 8.0f), (Object)1), (Object)Pair.of(bji.a(0.6f, 2, 1), (Object)1), (Object)Pair.of((Object)new bib(10, 20), (Object)1)))), bpb.ah);
    }

    private static void d(bha<bxe> $$0) {
        $$0.a(bzz.m, 10, (ImmutableList<bhs<bxe>>)ImmutableList.of(bil.a(bxf::v, 1.0f, true, 9), bxm.a(9), bxn.a(200, 200)), bpb.ac);
    }

    private static void e(bha<bxe> $$0) {
        $$0.a(bzz.n, 10, (ImmutableList<bhs<bxe>>)ImmutableList.of(bju.b(bpb.z, 1.0f, 12, true), bxf.b(), bxf.c(), bid.a(bxf::l, bpb.z)), bpb.z);
    }

    private static void f(bha<bxe> $$02) {
        $$02.a(bzz.o, 10, (ImmutableList<bhs<bxe>>)ImmutableList.of(biy.a(0.8f), bjp.a(bxf::b, 8.0f), bld.a(bld.a(bfj::bM), bkm.a(ImmutableList.builder().addAll(bxf.a()).add((Object)Pair.of(bld.a((E $$0) -> true), (Object)1)).build())), bia.a(8, bxf::a)), bpb.s);
    }

    private static ImmutableList<Pair<bjb<bfz>, Integer>> a() {
        return ImmutableList.of((Object)Pair.of(bjp.a(bfn.bt, 8.0f), (Object)1), (Object)Pair.of(bjp.a(bfn.aw, 8.0f), (Object)1), (Object)Pair.of(bjp.a(8.0f), (Object)1));
    }

    private static bjn<bfz> b() {
        return new bjn<bfz>((List<Pair<bhs<bfz>, Integer>>)ImmutableList.builder().addAll(bxf.a()).add((Object)Pair.of((Object)new bib(30, 60), (Object)1)).build());
    }

    private static bjn<bxe> c() {
        return new bjn<bxe>((List<Pair<bhs<bxe>, Integer>>)ImmutableList.of((Object)Pair.of(bji.a(0.6f), (Object)2), (Object)Pair.of(bio.a(bfn.aw, 8, bpb.q, 0.6f, 2), (Object)2), (Object)Pair.of(bld.a(bxf::f, bjx.a(0.6f, 3)), (Object)2), (Object)Pair.of((Object)new bib(30, 60), (Object)1)));
    }

    private static bhs<bgi> d() {
        return bju.a(bpb.av, 1.0f, 8, false);
    }

    private static bhs<bxe> e() {
        return bhw.a(bxe::h_, bpb.L, bpb.z, B);
    }

    private static bhs<bxe> f() {
        return bhw.a(bxf::h, bpb.aq, bpb.z, A);
    }

    protected static void a(bxe $$0) {
        bha<bxe> $$1 = $$0.dK();
        bzz $$2 = $$1.g().orElse(null);
        $$1.a((List<bzz>)ImmutableList.of((Object)bzz.m, (Object)bzz.k, (Object)bzz.n, (Object)bzz.l, (Object)bzz.o, (Object)bzz.b));
        bzz $$3 = $$1.g().orElse(null);
        if ($$2 != $$3) {
            bxf.c($$0).ifPresent($$0::b);
        }
        $$0.v($$1.a(bpb.o));
        if (!$$1.a(bpb.s) && bxf.f($$0)) {
            $$0.Y();
        }
        if (!$$1.a(bpb.ah)) {
            $$1.b(bpb.ai);
        }
        $$0.x($$1.a(bpb.ai));
    }

    private static boolean f(bxe $$0) {
        if (!$$0.h_()) {
            return false;
        }
        bfj $$1 = $$0.cW();
        return $$1 instanceof bxe && ((bxe)$$1).h_() || $$1 instanceof bwy && ((bwy)$$1).h_();
    }

    protected static void a(bxe $$0, bvh $$1) {
        boolean $$4;
        cfz $$3;
        bxf.k($$0);
        if ($$1.j().a(cgc.rt)) {
            $$0.a((bfj)$$1, $$1.j().L());
            cfz $$2 = $$1.j();
            $$1.ai();
        } else {
            $$0.a((bfj)$$1, 1);
            $$3 = bxf.a($$1);
        }
        if (bxf.a($$3)) {
            $$0.dK().b(bpb.ad);
            bxf.c($$0, $$3);
            bxf.d((bfz)$$0);
            return;
        }
        if (bxf.c($$3) && !bxf.q($$0)) {
            bxf.o($$0);
            return;
        }
        boolean bl2 = $$4 = !$$0.i($$3).equals(cfz.b);
        if ($$4) {
            return;
        }
        bxf.d($$0, $$3);
    }

    private static void c(bxe $$0, cfz $$1) {
        if (bxf.u($$0)) {
            $$0.b($$0.b(bdw.b));
        }
        $$0.o($$1);
    }

    private static cfz a(bvh $$0) {
        cfz $$1 = $$0.j();
        cfz $$2 = $$1.a(1);
        if ($$1.b()) {
            $$0.ai();
        } else {
            $$0.a($$1);
        }
        return $$2;
    }

    protected static void a(bxe $$0, boolean $$1) {
        cfz $$2 = $$0.b(bdw.b);
        $$0.a(bdw.b, cfz.b);
        if ($$0.fZ()) {
            boolean $$3 = bxf.b($$2);
            if ($$1 && $$3) {
                bxf.a($$0, bxf.g($$0));
            } else if (!$$3) {
                boolean $$4;
                boolean bl2 = $$4 = !$$0.i($$2).b();
                if (!$$4) {
                    bxf.d($$0, $$2);
                }
            }
        } else {
            boolean $$5;
            boolean bl3 = $$5 = !$$0.i($$2).b();
            if (!$$5) {
                cfz $$6 = $$0.eO();
                if (bxf.a($$6)) {
                    bxf.d($$0, $$6);
                } else {
                    bxf.a($$0, Collections.singletonList($$6));
                }
                $$0.n($$2);
            }
        }
    }

    protected static void b(bxe $$0) {
        if (bxf.r($$0) && !$$0.eP().b()) {
            $$0.b($$0.eP());
            $$0.a(bdw.b, cfz.b);
        }
    }

    private static void d(bxe $$0, cfz $$1) {
        cfz $$2 = $$0.l($$1);
        bxf.b($$0, Collections.singletonList($$2));
    }

    private static void a(bxe $$0, List<cfz> $$1) {
        Optional<byo> $$2 = $$0.dK().c(bpb.k);
        if ($$2.isPresent()) {
            bxf.a($$0, $$2.get(), $$1);
        } else {
            bxf.b($$0, $$1);
        }
    }

    private static void b(bxe $$0, List<cfz> $$1) {
        bxf.a($$0, $$1, bxf.p($$0));
    }

    private static void a(bxe $$0, byo $$1, List<cfz> $$2) {
        bxf.a($$0, $$2, $$1.dg());
    }

    private static void a(bxe $$0, List<cfz> $$1, eei $$2) {
        if (!$$1.isEmpty()) {
            $$0.a(bdw.b);
            for (cfz $$3 : $$1) {
                bht.a((bfz)$$0, $$3, $$2.b(0.0, 1.0, 0.0));
            }
        }
    }

    private static List<cfz> g(bxe $$0) {
        dzs $$1 = $$0.dI().n().aH().getLootTable(dzg.aB);
        ObjectArrayList<cfz> $$2 = $$1.a(new dzq.a((aif)$$0.dI()).a(ebw.a, $$0).a(ebv.i));
        return $$2;
    }

    private static boolean a(bfz $$0, bfz $$1) {
        if ($$1.ae() != bfn.W) {
            return false;
        }
        return apf.a($$0.dI().V()).i() < 0.1f;
    }

    protected static boolean a(bxe $$0, cfz $$1) {
        if ($$0.h_() && $$1.a(ane.V)) {
            return false;
        }
        if ($$1.a(ane.T)) {
            return false;
        }
        if (bxf.t($$0) && $$0.dK().a(bpb.o)) {
            return false;
        }
        if (bxf.b($$1)) {
            return bxf.v($$0);
        }
        boolean $$2 = $$0.m($$1);
        if ($$1.a(cgc.rt)) {
            return $$2;
        }
        if (bxf.c($$1)) {
            return !bxf.q($$0) && $$2;
        }
        if (bxf.a($$1)) {
            return bxf.v($$0) && $$2;
        }
        return $$0.p($$1);
    }

    protected static boolean a(cfz $$0) {
        return $$0.a(ane.U);
    }

    private static boolean a(bxe $$0, bfj $$1) {
        if ($$1 instanceof bgb) {
            bgb $$2 = (bgb)$$1;
            return !$$2.h_() || !$$2.bs() || bxf.g((bfz)$$0) || bxf.g($$2) || $$2 instanceof bxe && $$2.cW() == null;
        }
        return false;
    }

    private static boolean b(bxe $$0, bfz $$12) {
        return bxf.i($$0).filter($$1 -> $$1 == $$12).isPresent();
    }

    private static boolean h(bxe $$0) {
        bha<bxe> $$1 = $$0.dK();
        if ($$1.a(bpb.aq)) {
            bfz $$2 = $$1.c(bpb.aq).get();
            return $$0.a((bfj)$$2, 6.0);
        }
        return false;
    }

    private static Optional<? extends bfz> i(bxe $$0) {
        Optional<byo> $$3;
        bha<bxe> $$1 = $$0.dK();
        if (bxf.h($$0)) {
            return Optional.empty();
        }
        Optional<bfz> $$2 = bht.a((bfz)$$0, bpb.aa);
        if ($$2.isPresent() && bqf.d($$0, $$2.get())) {
            return $$2;
        }
        if ($$1.a(bpb.ab) && ($$3 = $$1.c(bpb.l)).isPresent()) {
            return $$3;
        }
        Optional<bgb> $$4 = $$1.c(bpb.L);
        if ($$4.isPresent()) {
            return $$4;
        }
        Optional<byo> $$5 = $$1.c(bpb.al);
        if ($$5.isPresent() && bqf.c($$0, $$5.get())) {
            return $$5;
        }
        return Optional.empty();
    }

    public static void a(byo $$0, boolean $$12) {
        List<bxe> $$22 = $$0.dI().a(bxe.class, $$0.cE().g(16.0));
        $$22.stream().filter(bxf::d).filter($$2 -> !$$12 || bht.b($$2, (bfz)$$0)).forEach($$1 -> {
            if ($$1.dI().X().b(cmi.K)) {
                bxf.d((bxd)$$1, (bfz)$$0);
            } else {
                bxf.c((bxd)$$1, (bfz)$$0);
            }
        });
    }

    public static bdx a(bxe $$0, byo $$1, bdw $$2) {
        cfz $$3 = $$1.b($$2);
        if (bxf.b($$0, $$3)) {
            cfz $$4 = $$3.a(1);
            bxf.c($$0, $$4);
            bxf.d((bfz)$$0);
            bxf.k($$0);
            return bdx.b;
        }
        return bdx.d;
    }

    protected static boolean b(bxe $$0, cfz $$1) {
        return !bxf.t($$0) && !bxf.r($$0) && $$0.fZ() && bxf.b($$1);
    }

    protected static void a(bxe $$0, bfz $$1) {
        if ($$1 instanceof bxe) {
            return;
        }
        if (bxf.u($$0)) {
            bxf.a($$0, false);
        }
        bha<bxe> $$22 = $$0.dK();
        $$22.b(bpb.ah);
        $$22.b(bpb.ai);
        $$22.b(bpb.ac);
        if ($$1 instanceof byo) {
            $$22.a(bpb.af, true, 400L);
        }
        bxf.e($$0).ifPresent($$2 -> {
            if ($$2.ae() != $$1.ae()) {
                $$22.b(bpb.z);
            }
        });
        if ($$0.h_()) {
            $$22.a(bpb.z, $$1, 100L);
            if (bqf.d($$0, $$1)) {
                bxf.b((bxd)$$0, $$1);
            }
            return;
        }
        if ($$1.ae() == bfn.W && bxf.n($$0)) {
            bxf.e($$0, $$1);
            bxf.c($$0, $$1);
            return;
        }
        bxf.a((bxd)$$0, $$1);
    }

    protected static void a(bxd $$0, bfz $$1) {
        if ($$0.dK().c(bzz.n)) {
            return;
        }
        if (!bqf.d($$0, $$1)) {
            return;
        }
        if (bht.a((bfz)$$0, $$1, 4.0)) {
            return;
        }
        if ($$1.ae() == bfn.bt && $$0.dI().X().b(cmi.K)) {
            bxf.d($$0, $$1);
            bxf.a($$0);
        } else {
            bxf.c($$0, $$1);
            bxf.b($$0, $$1);
        }
    }

    public static Optional<amg> c(bxe $$0) {
        return $$0.dK().g().map($$1 -> bxf.a($$0, $$1));
    }

    private static amg a(bxe $$0, bzz $$1) {
        if ($$1 == bzz.k) {
            return amh.rV;
        }
        if ($$0.fY()) {
            return amh.sa;
        }
        if ($$1 == bzz.n && bxf.j($$0)) {
            return amh.sa;
        }
        if ($$1 == bzz.m) {
            return amh.rT;
        }
        if ($$1 == bzz.l) {
            return amh.rW;
        }
        if (bxf.e((bfz)$$0)) {
            return amh.rY;
        }
        if (bxf.s($$0)) {
            return amh.sa;
        }
        return amh.rU;
    }

    private static boolean j(bxe $$0) {
        bha<bxe> $$1 = $$0.dK();
        if (!$$1.a(bpb.z)) {
            return false;
        }
        return $$1.c(bpb.z).get().a((bfj)$$0, 12.0);
    }

    protected static List<bxd> d(bxe $$0) {
        return $$0.dK().c(bpb.an).orElse((List<bxd>)ImmutableList.of());
    }

    private static List<bxd> e(bxd $$0) {
        return $$0.dK().c(bpb.am).orElse((List<bxd>)ImmutableList.of());
    }

    public static boolean a(bfz $$0) {
        Iterable<cfz> $$1 = $$0.bJ();
        for (cfz $$2 : $$1) {
            cfu $$3 = $$2.d();
            if (!($$3 instanceof cdj) || ((cdj)$$3).d() != cdl.d) continue;
            return true;
        }
        return false;
    }

    private static void k(bxe $$0) {
        $$0.dK().b(bpb.m);
        $$0.J().n();
    }

    private static bhs<bfz> g() {
        bjq.a $$0 = new bjq.a(o);
        return bhw.a($$1 -> $$1.h_() && $$0.a($$1.dI().z), bpb.ak, bpb.s, p);
    }

    protected static void b(bxd $$0, bfz $$12) {
        bxf.e($$0).forEach($$1 -> {
            if (!($$12.ae() != bfn.W || $$1.q() && ((bwy)$$12).ge())) {
                return;
            }
            bxf.e($$1, $$12);
        });
    }

    protected static void a(bxd $$02) {
        bxf.e($$02).forEach($$0 -> bxf.b($$0).ifPresent($$1 -> bxf.c($$0, (bfz)$$1)));
    }

    protected static void c(bxd $$0, bfz $$1) {
        if (!bqf.d($$0, $$1)) {
            return;
        }
        $$0.dK().b(bpb.E);
        $$0.dK().a(bpb.aa, $$1.ct(), 600L);
        if ($$1.ae() == bfn.W && $$0.q()) {
            bxf.c($$0);
        }
        if ($$1.ae() == bfn.bt && $$0.dI().X().b(cmi.K)) {
            $$0.dK().a(bpb.ab, true, 600L);
        }
    }

    private static void d(bxd $$0, bfz $$1) {
        Optional<byo> $$2 = bxf.b($$0);
        if ($$2.isPresent()) {
            bxf.c($$0, (bfz)$$2.get());
        } else {
            bxf.c($$0, $$1);
        }
    }

    private static void e(bxd $$0, bfz $$1) {
        Optional<bfz> $$2 = bxf.f($$0);
        bfz $$3 = bht.a((bfz)$$0, $$2, $$1);
        if ($$2.isPresent() && $$2.get() == $$3) {
            return;
        }
        bxf.c($$0, $$3);
    }

    private static Optional<bfz> f(bxd $$0) {
        return bht.a((bfz)$$0, bpb.aa);
    }

    public static Optional<bfz> e(bxe $$0) {
        if ($$0.dK().a(bpb.z)) {
            return $$0.dK().c(bpb.z);
        }
        return Optional.empty();
    }

    public static Optional<byo> b(bxd $$0) {
        if ($$0.dK().a(bpb.l)) {
            return $$0.dK().c(bpb.l);
        }
        return Optional.empty();
    }

    private static void c(bxe $$02, bfz $$12) {
        bxf.d($$02).stream().filter($$0 -> $$0 instanceof bxe).forEach($$1 -> bxf.d((bxe)$$1, $$12));
    }

    private static void d(bxe $$0, bfz $$1) {
        bha<bxe> $$2 = $$0.dK();
        bfz $$3 = $$1;
        $$3 = bht.a((bfz)$$0, $$2.c(bpb.z), $$3);
        $$3 = bht.a((bfz)$$0, $$2.c(bpb.o), $$3);
        bxf.e($$0, $$3);
    }

    private static boolean l(bxe $$0) {
        bha<bxe> $$1 = $$0.dK();
        if (!$$1.a(bpb.z)) {
            return true;
        }
        bfz $$2 = $$1.c(bpb.z).get();
        bfn<?> $$3 = $$2.ae();
        if ($$3 == bfn.W) {
            return bxf.m($$0);
        }
        if (bxf.a($$3)) {
            return !$$1.b(bpb.aq, $$2);
        }
        return false;
    }

    private static boolean m(bxe $$0) {
        return !bxf.n($$0);
    }

    private static boolean n(bxe $$0) {
        int $$1 = $$0.dK().c(bpb.ar).orElse(0) + 1;
        int $$2 = $$0.dK().c(bpb.as).orElse(0);
        return $$2 > $$1;
    }

    private static void e(bxe $$0, bfz $$1) {
        $$0.dK().b(bpb.aa);
        $$0.dK().b(bpb.o);
        $$0.dK().b(bpb.m);
        $$0.dK().a(bpb.z, $$1, q.a($$0.dI().z));
        bxf.c((bxd)$$0);
    }

    protected static void c(bxd $$0) {
        $$0.dK().a(bpb.ag, true, d.a($$0.dI().z));
    }

    private static void o(bxe $$0) {
        $$0.dK().a(bpb.au, true, 200L);
    }

    private static eei p(bxe $$0) {
        eei $$1 = bqt.a($$0, 4, 2);
        return $$1 == null ? $$0.dg() : $$1;
    }

    private static boolean q(bxe $$0) {
        return $$0.dK().a(bpb.au);
    }

    protected static boolean d(bxd $$0) {
        return $$0.dK().c(bzz.b);
    }

    private static boolean c(bfz $$0) {
        return $$0.b(cgc.uZ);
    }

    private static void d(bfz $$0) {
        $$0.dK().a(bpb.ac, true, 120L);
    }

    private static boolean r(bxe $$0) {
        return $$0.dK().a(bpb.ac);
    }

    private static boolean b(cfz $$0) {
        return $$0.a(c);
    }

    private static boolean c(cfz $$0) {
        return $$0.a(ane.W);
    }

    private static boolean s(bxe $$0) {
        return $$0.dK().a(bpb.av);
    }

    private static boolean e(bfz $$0) {
        return $$0.dK().a(bpb.at);
    }

    private static boolean f(bfz $$0) {
        return !bxf.e($$0);
    }

    public static boolean b(bfz $$0) {
        return $$0.ae() == bfn.bt && $$0.b(bxf::a);
    }

    private static boolean t(bxe $$0) {
        return $$0.dK().a(bpb.af);
    }

    private static boolean g(bfz $$0) {
        return $$0.dK().a(bpb.x);
    }

    private static boolean u(bxe $$0) {
        return !$$0.eP().b();
    }

    private static boolean v(bxe $$0) {
        return $$0.eP().b() || !bxf.a($$0.eP());
    }

    public static boolean a(bfn<?> $$0) {
        return $$0 == bfn.bs || $$0 == bfn.bo;
    }
}

