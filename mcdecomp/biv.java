/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class biv
extends bhr<byb> {
    private final float c;

    public biv(float $$0) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.m, (Object)((Object)bpc.c), bpb.n, (Object)((Object)bpc.c)), Integer.MAX_VALUE);
        this.c = $$0;
    }

    @Override
    protected boolean a(aif $$0, byb $$1) {
        byo $$2 = $$1.fY();
        return $$1.bs() && $$2 != null && !$$1.aV() && !$$1.S && $$1.f((bfj)$$2) <= 16.0 && $$2.bR != null;
    }

    @Override
    protected boolean a(aif $$0, byb $$1, long $$2) {
        return this.a($$0, $$1);
    }

    @Override
    protected void b(aif $$0, byb $$1, long $$2) {
        this.a($$1);
    }

    @Override
    protected void c(aif $$0, byb $$1, long $$2) {
        bha<byb> $$3 = $$1.dK();
        $$3.b(bpb.m);
        $$3.b(bpb.n);
    }

    @Override
    protected void d(aif $$0, byb $$1, long $$2) {
        this.a($$1);
    }

    @Override
    protected boolean a(long $$0) {
        return false;
    }

    private void a(byb $$0) {
        bha<byb> $$1 = $$0.dK();
        $$1.a(bpb.m, new bpe(new bic($$0.fY(), false), this.c, 2));
        $$1.a(bpb.n, new bic($$0.fY(), true));
    }

    @Override
    protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
        this.c(aif2, (byb)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void c(aif aif2, bfz bfz2, long l2) {
        this.d(aif2, (byb)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.b(aif2, (byb)bfz2, l2);
    }
}

