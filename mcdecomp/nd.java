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

public class nd {
    public static final acp<dtj> a = nt.a("ancient_city/city_center");

    public static void a(nm<dtj> $$0) {
        hf<dvr> $$1 = $$0.a(jc.aA);
        he.c<dvr> $$2 = $$1.b(nu.G);
        hf<dtj> $$3 = $$0.a(jc.aC);
        he.c<dtj> $$4 = $$3.b(nt.a);
        $$0.a(a, new dtj($$4, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.b("ancient_city/city_center/city_center_1", $$2), (Object)1), (Object)Pair.of(dth.b("ancient_city/city_center/city_center_2", $$2), (Object)1), (Object)Pair.of(dth.b("ancient_city/city_center/city_center_3", $$2), (Object)1)), dtj.a.b));
        ne.a($$0);
    }
}

