/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bie
extends bhr<bgi> {
    public static final int c = 100;
    public static final double d = 2.5;
    private final Function<bfz, Float> e;
    private final Function<bfz, Double> f;

    public bie(Function<bfz, Float> $$02) {
        this($$02, $$0 -> 2.5);
    }

    public bie(Function<bfz, Float> $$0, Function<bfz, Double> $$1) {
        super((Map)ac.a(() -> {
            ImmutableMap.Builder $$0 = ImmutableMap.builder();
            $$0.put(bpb.n, (Object)bpc.c);
            $$0.put(bpb.m, (Object)bpc.c);
            $$0.put(bpb.O, (Object)bpc.b);
            $$0.put(bpb.Q, (Object)bpc.c);
            $$0.put(bpb.N, (Object)bpc.a);
            $$0.put(bpb.r, (Object)bpc.b);
            $$0.put(bpb.Y, (Object)bpc.b);
            return $$0.build();
        }));
        this.e = $$0;
        this.f = $$1;
    }

    protected float a(bgi $$0) {
        return this.e.apply($$0).floatValue();
    }

    private Optional<byo> b(bgi $$0) {
        return $$0.dK().c(bpb.N);
    }

    @Override
    protected boolean a(long $$0) {
        return false;
    }

    @Override
    protected boolean a(aif $$0, bgi $$1, long $$2) {
        return this.b($$1).isPresent() && !$$1.dK().a(bpb.r) && !$$1.dK().a(bpb.Y);
    }

    @Override
    protected void b(aif $$0, bgi $$1, long $$2) {
        $$1.dK().a(bpb.Q, true);
    }

    @Override
    protected void c(aif $$0, bgi $$1, long $$2) {
        bha<?> $$3 = $$1.dK();
        $$3.a(bpb.O, Integer.valueOf(100));
        $$3.a(bpb.Q, false);
        $$3.b(bpb.m);
        $$3.b(bpb.n);
    }

    @Override
    protected void d(aif $$0, bgi $$1, long $$2) {
        byo $$3 = this.b($$1).get();
        bha<?> $$4 = $$1.dK();
        $$4.a(bpb.n, new bic($$3, true));
        double $$5 = this.f.apply($$1);
        if ($$1.f((bfj)$$3) < apa.k($$5)) {
            $$4.b(bpb.m);
        } else {
            $$4.a(bpb.m, new bpe(new bic($$3, false), this.a($$1), 2));
        }
    }

    @Override
    protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
        this.c(aif2, (bgi)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void c(aif aif2, bfz bfz2, long l2) {
        this.d(aif2, (bgi)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.b(aif2, (bgi)bfz2, l2);
    }
}

