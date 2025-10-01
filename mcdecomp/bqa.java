/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bqa
extends bqf<bfz> {
    @Override
    public Set<bpb<?>> a() {
        return ImmutableSet.of(bpb.h, bpb.L, bpb.am);
    }

    @Override
    protected void a(aif $$02, bfz $$1) {
        bha<?> $$2 = $$1.dK();
        ArrayList $$3 = Lists.newArrayList();
        bpd $$4 = $$2.c(bpb.h).orElse(bpd.a());
        Optional<bgb> $$5 = $$4.a($$0 -> $$0 instanceof bwt || $$0 instanceof buv).map(bgb.class::cast);
        List<bfz> $$6 = $$2.c(bpb.g).orElse((List<bfz>)ImmutableList.of());
        for (bfz $$7 : $$6) {
            if (!($$7 instanceof bxd) || !((bxd)$$7).fZ()) continue;
            $$3.add((bxd)$$7);
        }
        $$2.a(bpb.L, $$5);
        $$2.a(bpb.am, $$3);
    }
}

