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

public class ni {
    public static final acp<dtj> a = nt.a("bastion/starts");

    public static void a(nm<dtj> $$0) {
        hf<dvr> $$1 = $$0.a(jc.aA);
        he.c<dvr> $$2 = $$1.b(nu.w);
        hf<dtj> $$3 = $$0.a(jc.aC);
        he.c<dtj> $$4 = $$3.b(nt.a);
        $$0.a(a, new dtj($$4, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.b("bastion/units/air_base", $$2), (Object)1), (Object)Pair.of(dth.b("bastion/hoglin_stable/air_base", $$2), (Object)1), (Object)Pair.of(dth.b("bastion/treasure/big_air_full", $$2), (Object)1), (Object)Pair.of(dth.b("bastion/bridge/starting_pieces/entrance_base", $$2), (Object)1)), dtj.a.b));
        nh.a($$0);
        ng.a($$0);
        nk.a($$0);
        nf.a($$0);
        nj.a($$0);
    }
}

