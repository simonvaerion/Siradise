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
import java.util.Set;

public class bth {
    public static final int a = 20;
    public static final int b = 7;
    private static final bdi i = bdi.a(5, 16);
    private static final float j = 1.0f;
    private static final float k = 1.0f;
    private static final float l = 1.25f;
    private static final float m = 1.25f;
    private static final float n = 2.0f;
    private static final float o = 1.25f;
    private static final bdi p = bdi.a(600, 1200);
    public static final int c = 5;
    public static final int d = 5;
    public static final float e = 1.5f;
    private static final bdi q = bdi.a(600, 6000);
    private static final bdi r = bdi.a(100, 300);
    private static final bqm s = bqm.a().a($$0 -> !$$0.ae().equals(bfn.U) && $$0.dI().w_().a($$0.cE()));
    private static final float t = 3.0f;
    public static final int f = 4;
    public static final float g = 2.5f;
    public static final float h = 1.0f;

    protected static void a(btg $$0, apf $$1) {
        $$0.dK().a(bpb.R, Integer.valueOf(p.a($$1)));
        $$0.dK().a(bpb.U, Integer.valueOf(q.a($$1)));
    }

    protected static bha<?> a(bha<btg> $$0) {
        bth.b($$0);
        bth.c($$0);
        bth.d($$0);
        bth.e($$0);
        $$0.a((Set<bzz>)ImmutableSet.of((Object)bzz.a));
        $$0.b(bzz.b);
        $$0.f();
        return $$0;
    }

    private static void b(bha<btg> $$0) {
        $$0.a(bzz.a, 0, (ImmutableList<bhs<btg>>)ImmutableList.of((Object)new bkk(0.8f), (Object)new bhm(2.0f), (Object)new biw(45, 90), (Object)new bja(), (Object)new bhx(bpb.O), (Object)new bhx(bpb.R), (Object)new bhx(bpb.U)));
    }

    private static void c(bha<btg> $$02) {
        $$02.a(bzz.b, (ImmutableList<Pair<Integer, bhs<btg>>>)ImmutableList.of((Object)Pair.of((Object)0, bjq.a(bfn.bt, 6.0f, bdi.a(30, 60))), (Object)Pair.of((Object)0, (Object)new bhl(bfn.U, 1.0f)), (Object)Pair.of((Object)1, (Object)new bie($$0 -> Float.valueOf(1.25f))), (Object)Pair.of((Object)2, bho.a(i, 1.25f)), (Object)Pair.of((Object)3, new bjn(ImmutableList.of((Object)Pair.of(bji.a(1.0f), (Object)2), (Object)Pair.of(bjx.a(1.0f, 3), (Object)2), (Object)Pair.of((Object)new bib(30, 60), (Object)1))))), (Set<Pair<bpb<?>, bpc>>)ImmutableSet.of((Object)Pair.of(bpb.V, (Object)((Object)bpc.b)), (Object)Pair.of(bpb.S, (Object)((Object)bpc.b))));
    }

    private static void d(bha<btg> $$02) {
        $$02.a(bzz.q, (ImmutableList<Pair<Integer, bhs<btg>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new bis(p, amh.jW)), (Object)Pair.of((Object)1, new biu<btg>(p, 5, 5, 1.5f, $$0 -> $$0.gi() ? amh.jR : amh.jH))), (Set<Pair<bpb<?>, bpc>>)ImmutableSet.of((Object)Pair.of(bpb.N, (Object)((Object)bpc.b)), (Object)Pair.of(bpb.r, (Object)((Object)bpc.b)), (Object)Pair.of(bpb.m, (Object)((Object)bpc.b)), (Object)Pair.of(bpb.R, (Object)((Object)bpc.b))));
    }

    private static void e(bha<btg> $$02) {
        $$02.a(bzz.r, (ImmutableList<Pair<Integer, bhs<btg>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new bjg($$0 -> $$0.gi() ? r : q, s, 3.0f, $$0 -> $$0.h_() ? 1.0 : 2.5, $$0 -> $$0.gi() ? amh.jU : amh.jK, $$0 -> $$0.gi() ? amh.jV : amh.jL)), (Object)Pair.of((Object)1, new bjf<btg>($$0 -> $$0.gi() ? r.a() : q.a(), 4, 7, 1.25f, s, 20, $$0 -> $$0.gi() ? amh.jT : amh.jJ))), (Set<Pair<bpb<?>, bpc>>)ImmutableSet.of((Object)Pair.of(bpb.N, (Object)((Object)bpc.b)), (Object)Pair.of(bpb.r, (Object)((Object)bpc.b)), (Object)Pair.of(bpb.U, (Object)((Object)bpc.b))));
    }

    public static void a(btg $$0) {
        $$0.dK().a((List<bzz>)ImmutableList.of((Object)bzz.r, (Object)bzz.q, (Object)bzz.b));
    }

    public static ciz a() {
        return ciz.a(cgc.oI);
    }
}

