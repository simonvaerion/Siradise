/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class blk<E extends bxs>
extends bhr<E> {
    public blk(int $$0) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.aB, (Object)((Object)bpc.a), bpb.m, (Object)((Object)bpc.b), bpb.n, (Object)((Object)bpc.c)), $$0);
    }

    @Override
    protected boolean a(aif $$0, E $$1, long $$2) {
        return true;
    }

    @Override
    protected void b(aif $$0, E $$1, long $$2) {
        ((bfj)$$1).b(bgl.n);
        ((bfj)$$1).a(amh.zv, 5.0f, 1.0f);
    }

    @Override
    protected void c(aif $$0, E $$1, long $$2) {
        if (((bfj)$$1).c(bgl.n)) {
            ((bfj)$$1).b(bgl.a);
        }
    }

    @Override
    protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
        this.c(aif2, (bxs)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.b(aif2, (E)((bxs)bfz2), l2);
    }
}

