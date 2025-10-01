/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class bqh
extends bqf<bgi> {
    public static final int a = 10;
    private static final bqm c = bqm.b().a(10.0).d();
    private final ciz d;

    public bqh(ciz $$0) {
        this.d = $$0;
    }

    @Override
    protected void a(aif $$0, bgi $$12) {
        bha<?> $$2 = $$12.dK();
        List $$3 = $$0.v().stream().filter(bfm.f).filter($$1 -> c.a($$12, (bfz)$$1)).filter($$1 -> $$12.a((bfj)$$1, 10.0)).filter(this::a).filter($$1 -> !$$12.u((bfj)$$1)).sorted(Comparator.comparingDouble($$12::f)).collect(Collectors.toList());
        if (!$$3.isEmpty()) {
            byo $$4 = (byo)$$3.get(0);
            $$2.a(bpb.N, $$4);
        } else {
            $$2.b(bpb.N);
        }
    }

    private boolean a(byo $$0) {
        return this.a($$0.eO()) || this.a($$0.eP());
    }

    private boolean a(cfz $$0) {
        return this.d.a($$0);
    }

    @Override
    public Set<bpb<?>> a() {
        return ImmutableSet.of(bpb.N);
    }
}

