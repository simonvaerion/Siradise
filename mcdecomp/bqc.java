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
import java.util.stream.Collectors;

public class bqc
extends bqf<bfz> {
    @Override
    public Set<bpb<?>> a() {
        return ImmutableSet.of(bpb.j, bpb.k, bpb.l);
    }

    @Override
    protected void a(aif $$0, bfz $$12) {
        List $$2 = $$0.v().stream().filter(bfm.f).filter($$1 -> $$12.a((bfj)$$1, 16.0)).sorted(Comparator.comparingDouble($$12::f)).collect(Collectors.toList());
        bha<?> $$3 = $$12.dK();
        $$3.a(bpb.j, $$2);
        List $$4 = $$2.stream().filter($$1 -> bqc.b($$12, $$1)).collect(Collectors.toList());
        $$3.a(bpb.k, $$4.isEmpty() ? null : (byo)$$4.get(0));
        Optional<byo> $$5 = $$4.stream().filter($$1 -> bqc.c($$12, $$1)).findFirst();
        $$3.a(bpb.l, $$5);
    }
}

