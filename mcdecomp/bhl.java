/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class bhl
extends bhr<brl> {
    private static final int c = 3;
    private static final int d = 60;
    private static final int e = 110;
    private final bfn<? extends brl> f;
    private final float g;
    private long h;

    public bhl(bfn<? extends brl> $$0, float $$1) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.h, (Object)((Object)bpc.a), bpb.r, (Object)((Object)bpc.b), bpb.m, (Object)((Object)bpc.c), bpb.n, (Object)((Object)bpc.c)), 110);
        this.f = $$0;
        this.g = $$1;
    }

    @Override
    protected boolean a(aif $$0, brl $$1) {
        return $$1.gc() && this.c($$1).isPresent();
    }

    protected void a(aif $$0, brl $$1, long $$2) {
        brl $$3 = this.c($$1).get();
        $$1.dK().a(bpb.r, $$3);
        $$3.dK().a(bpb.r, $$1);
        bht.a((bfz)$$1, (bfz)$$3, this.g);
        int $$4 = 60 + $$1.ec().a(50);
        this.h = $$2 + (long)$$4;
    }

    protected boolean b(aif $$0, brl $$1, long $$2) {
        if (!this.b($$1)) {
            return false;
        }
        brl $$3 = this.a($$1);
        return $$3.bs() && $$1.a($$3) && bht.a($$1.dK(), (bfz)$$3) && $$2 <= this.h;
    }

    @Override
    protected void c(aif $$0, brl $$1, long $$2) {
        brl $$3 = this.a($$1);
        bht.a((bfz)$$1, (bfz)$$3, this.g);
        if (!$$1.a((bfj)$$3, 3.0)) {
            return;
        }
        if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dK().b(bpb.r);
            $$3.dK().b(bpb.r);
        }
    }

    @Override
    protected void d(aif $$0, brl $$1, long $$2) {
        $$1.dK().b(bpb.r);
        $$1.dK().b(bpb.m);
        $$1.dK().b(bpb.n);
        this.h = 0L;
    }

    private brl a(brl $$0) {
        return (brl)$$0.dK().c(bpb.r).get();
    }

    private boolean b(brl $$0) {
        bha<bfe> $$1 = $$0.dK();
        return $$1.a(bpb.r) && $$1.c(bpb.r).get().ae() == this.f;
    }

    private Optional<? extends brl> c(brl $$0) {
        return $$0.dK().c(bpb.h).get().a((bfz $$1) -> {
            brl $$2;
            return $$1.ae() == this.f && $$1 instanceof brl && $$0.a($$2 = (brl)$$1);
        }).map(brl.class::cast);
    }

    @Override
    protected /* synthetic */ boolean a(aif aif2, bfz bfz2, long l2) {
        return this.b(aif2, (brl)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
        this.d(aif2, (brl)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.a(aif2, (brl)bfz2, l2);
    }
}

