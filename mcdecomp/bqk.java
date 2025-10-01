/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Iterables
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bqk
extends bpy<bxs> {
    @Override
    public Set<bpb<?>> a() {
        return ImmutableSet.copyOf((Iterable)Iterables.concat(super.a(), List.of(bpb.B)));
    }

    @Override
    protected void a(aif $$02, bxs $$12) {
        super.a($$02, $$12);
        bqk.a($$12, (bfz $$0) -> $$0.ae() == bfn.bt).or(() -> bqk.a($$12, (bfz $$0) -> $$0.ae() != bfn.bt)).ifPresentOrElse($$1 -> $$12.dK().a(bpb.B, $$1), () -> $$12.dK().b(bpb.B));
    }

    private static Optional<bfz> a(bxs $$0, Predicate<bfz> $$1) {
        return $$0.dK().c(bpb.g).stream().flatMap(Collection::stream).filter($$0::a).filter($$1).findFirst();
    }

    @Override
    protected int b() {
        return 24;
    }

    @Override
    protected int c() {
        return 24;
    }
}

