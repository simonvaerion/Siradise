/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bjn<E extends bfz>
extends bif<E> {
    public bjn(List<Pair<? extends bhs<? super E>, Integer>> $$0) {
        this((Map<bpb<?>, bpc>)ImmutableMap.of(), (List<Pair<bhs<E>, Integer>>)$$0);
    }

    public bjn(Map<bpb<?>, bpc> $$0, List<Pair<? extends bhs<? super E>, Integer>> $$1) {
        super($$0, (Set<bpb<?>>)ImmutableSet.of(), bif.a.b, bif.b.a, $$1);
    }
}

