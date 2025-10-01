/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class nr {
    public static final acp<dtj> a = nt.a("pillager_outpost/base_plates");

    public static void a(nm<dtj> $$0) {
        hf<dvr> $$1 = $$0.a(jc.aA);
        he.c<dvr> $$2 = $$1.b(nu.q);
        hf<dtj> $$3 = $$0.a(jc.aC);
        he.c<dtj> $$4 = $$3.b(nt.a);
        $$0.a(a, new dtj($$4, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.a("pillager_outpost/base_plate"), (Object)1)), dtj.a.b));
        nt.a($$0, "pillager_outpost/towers", new dtj($$4, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.a((List<Function<dtj.a, ? extends dth>>)ImmutableList.of(dth.a("pillager_outpost/watchtower"), dth.a("pillager_outpost/watchtower_overgrown", $$2))), (Object)1)), dtj.a.b));
        nt.a($$0, "pillager_outpost/feature_plates", new dtj($$4, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.a("pillager_outpost/feature_plate"), (Object)1)), dtj.a.a));
        nt.a($$0, "pillager_outpost/features", new dtj($$4, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.a("pillager_outpost/feature_cage1"), (Object)1), (Object)Pair.of(dth.a("pillager_outpost/feature_cage2"), (Object)1), (Object)Pair.of(dth.a("pillager_outpost/feature_cage_with_allays"), (Object)1), (Object)Pair.of(dth.a("pillager_outpost/feature_logs"), (Object)1), (Object)Pair.of(dth.a("pillager_outpost/feature_tent1"), (Object)1), (Object)Pair.of(dth.a("pillager_outpost/feature_tent2"), (Object)1), (Object)Pair.of(dth.a("pillager_outpost/feature_targets"), (Object)1), (Object)Pair.of(dth.g(), (Object)6)), dtj.a.b));
    }
}

