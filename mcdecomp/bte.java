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

public class bte {
    private static final float a = 2.0f;
    private static final float b = 0.5f;
    private static final float c = 1.25f;

    protected static bha<?> a(bha<btd> $$0) {
        bte.b($$0);
        bte.c($$0);
        $$0.a((Set<bzz>)ImmutableSet.of((Object)bzz.a));
        $$0.b(bzz.b);
        $$0.f();
        return $$0;
    }

    private static void b(bha<btd> $$0) {
        $$0.a(bzz.a, 0, (ImmutableList<bhs<btd>>)ImmutableList.of((Object)new bhm(2.0f), (Object)new biw(45, 90), (Object)new bja(), (Object)new bhx(bpb.O)));
    }

    private static void c(bha<btd> $$02) {
        $$02.a(bzz.b, (ImmutableList<Pair<Integer, bhs<btd>>>)ImmutableList.of((Object)Pair.of((Object)0, bjq.a(bfn.bt, 6.0f, bdi.a(30, 60))), (Object)Pair.of((Object)1, (Object)new bie($$0 -> Float.valueOf(1.25f))), (Object)Pair.of((Object)2, new bif((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.m, (Object)((Object)bpc.b)), (Set<bpb<?>>)ImmutableSet.of(), bif.a.a, bif.b.b, ImmutableList.of((Object)Pair.of(bji.c(0.5f), (Object)2), (Object)Pair.of(bjx.a(0.5f, 3), (Object)3), (Object)Pair.of(bld.a(bfj::aY), (Object)5))))));
    }

    public static void a(btd $$0) {
        $$0.dK().a((List<bzz>)ImmutableList.of((Object)bzz.b));
    }
}

