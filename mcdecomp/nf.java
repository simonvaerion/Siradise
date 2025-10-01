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

public class nf {
    public static void a(nm<dtj> $$0) {
        hf<dvr> $$1 = $$0.a(jc.aA);
        he.c<dvr> $$2 = $$1.b(nu.y);
        he.c<dvr> $$3 = $$1.b(nu.w);
        he.c<dvr> $$4 = $$1.b(nu.z);
        he.c<dvr> $$5 = $$1.b(nu.x);
        hf<dtj> $$6 = $$0.a(jc.aC);
        he.c<dtj> $$7 = $$6.b(nt.a);
        nt.a($$0, "bastion/bridge/starting_pieces", new dtj($$7, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.b("bastion/bridge/starting_pieces/entrance", $$2), (Object)1), (Object)Pair.of(dth.b("bastion/bridge/starting_pieces/entrance_face", $$3), (Object)1)), dtj.a.b));
        nt.a($$0, "bastion/bridge/bridge_pieces", new dtj($$7, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.b("bastion/bridge/bridge_pieces/bridge", $$4), (Object)1)), dtj.a.b));
        nt.a($$0, "bastion/bridge/legs", new dtj($$7, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.b("bastion/bridge/legs/leg_0", $$3), (Object)1), (Object)Pair.of(dth.b("bastion/bridge/legs/leg_1", $$3), (Object)1)), dtj.a.b));
        nt.a($$0, "bastion/bridge/walls", new dtj($$7, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.b("bastion/bridge/walls/wall_base_0", $$5), (Object)1), (Object)Pair.of(dth.b("bastion/bridge/walls/wall_base_1", $$5), (Object)1)), dtj.a.b));
        nt.a($$0, "bastion/bridge/ramparts", new dtj($$7, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.b("bastion/bridge/ramparts/rampart_0", $$5), (Object)1), (Object)Pair.of(dth.b("bastion/bridge/ramparts/rampart_1", $$5), (Object)1)), dtj.a.b));
        nt.a($$0, "bastion/bridge/rampart_plates", new dtj($$7, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.b("bastion/bridge/rampart_plates/plate_0", $$5), (Object)1)), dtj.a.b));
        nt.a($$0, "bastion/bridge/connectors", new dtj($$7, (List<Pair<Function<dtj.a, ? extends dth>, Integer>>)ImmutableList.of((Object)Pair.of(dth.b("bastion/bridge/connectors/back_bridge_top", $$3), (Object)1), (Object)Pair.of(dth.b("bastion/bridge/connectors/back_bridge_bottom", $$3), (Object)1)), dtj.a.b));
    }
}

