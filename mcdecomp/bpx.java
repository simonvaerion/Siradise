/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bpx
extends bqf<bgb> {
    private static final long c = 32L;
    private static final long d = 16L;
    public static final int a = 32;

    @Override
    public Set<bpb<?>> a() {
        return ImmutableSet.of(bpb.K);
    }

    @Override
    protected void a(aif $$02, bgb $$12) {
        bha<?> $$2 = $$12.dK();
        List<bvh> $$3 = $$02.a(bvh.class, $$12.cE().c(32.0, 16.0, 32.0), $$0 -> true);
        $$3.sort(Comparator.comparingDouble($$12::f));
        Optional<bvh> $$4 = $$3.stream().filter($$1 -> $$12.k($$1.j())).filter($$1 -> $$1.a((bfj)$$12, 32.0)).filter($$12::B).findFirst();
        $$2.a(bpb.K, $$4);
    }
}

