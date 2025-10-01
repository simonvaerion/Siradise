/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bpz
extends bqf<bfz> {
    protected abstract boolean a(bfz var1, bfz var2);

    protected abstract bpb<bfz> b();

    @Override
    public Set<bpb<?>> a() {
        return ImmutableSet.of(this.b());
    }

    @Override
    protected void a(aif $$0, bfz $$1) {
        $$1.dK().a(this.b(), this.b($$1));
    }

    private Optional<bfz> b(bfz $$0) {
        return this.a($$0).flatMap($$12 -> $$12.a((bfz $$1) -> this.a($$0, (bfz)$$1)));
    }

    protected Optional<bpd> a(bfz $$0) {
        return $$0.dK().c(bpb.h);
    }
}

