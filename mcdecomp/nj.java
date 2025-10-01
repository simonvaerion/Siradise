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

public class nj {
    public static void a(nm<dtj> $$0) {
        hf<dtj> $$1 = $$0.a(jc.aC);
        he.c<dtj> $$2 = $$1.b(nt.a);
        nt.a($$0, "bastion/mobs/piglin", new dtj($$2, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.b("bastion/mobs/melee_piglin"), (Object)1), (Object)Pair.of(dth.b("bastion/mobs/sword_piglin"), (Object)4), (Object)Pair.of(dth.b("bastion/mobs/crossbow_piglin"), (Object)4), (Object)Pair.of(dth.b("bastion/mobs/empty"), (Object)1)), dtj.a.b));
        nt.a($$0, "bastion/mobs/hoglin", new dtj($$2, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.b("bastion/mobs/hoglin"), (Object)2), (Object)Pair.of(dth.b("bastion/mobs/empty"), (Object)1)), dtj.a.b));
        nt.a($$0, "bastion/blocks/gold", new dtj($$2, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.b("bastion/blocks/air"), (Object)3), (Object)Pair.of(dth.b("bastion/blocks/gold"), (Object)1)), dtj.a.b));
        nt.a($$0, "bastion/mobs/piglin_melee", new dtj($$2, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.b("bastion/mobs/melee_piglin_always"), (Object)1), (Object)Pair.of(dth.b("bastion/mobs/melee_piglin"), (Object)5), (Object)Pair.of(dth.b("bastion/mobs/sword_piglin"), (Object)1)), dtj.a.b));
    }
}

