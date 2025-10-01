/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bpo
extends bqf<bfe> {
    @Override
    public Set<bpb<?>> a() {
        return ImmutableSet.of(bpb.J, bpb.h);
    }

    @Override
    protected void a(aif $$0, bfe $$12) {
        $$12.dK().c(bpb.h).ifPresent($$1 -> this.a($$12, (bpd)$$1));
    }

    private void a(bfe $$0, bpd $$12) {
        Optional<bfe> $$2 = $$12.a($$1 -> $$1.ae() == $$0.ae() && !$$1.h_()).map(bfe.class::cast);
        $$0.dK().a(bpb.J, $$2);
    }
}

