/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class blp<E extends bxs>
extends bhr<E> {
    private static final double c = 6.0;
    private static final double d = 20.0;

    public blp(int $$0) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.aA, (Object)((Object)bpc.a), bpb.o, (Object)((Object)bpc.b), bpb.m, (Object)((Object)bpc.b), bpb.n, (Object)((Object)bpc.c), bpb.B, (Object)((Object)bpc.c), bpb.ay, (Object)((Object)bpc.c), bpb.aF, (Object)((Object)bpc.c)), $$0);
    }

    @Override
    protected boolean a(aif $$0, E $$1, long $$2) {
        return true;
    }

    @Override
    protected void b(aif $$0, E $$1, long $$2) {
        ((bfj)$$1).a(amh.zE, 5.0f, 1.0f);
    }

    @Override
    protected void c(aif $$0, E $$12, long $$2) {
        if (((bfj)$$12).c(bgl.m)) {
            ((bfj)$$12).b(bgl.a);
        }
        ((bxs)$$12).dK().b(bpb.aA);
        ((bxs)$$12).dK().c(bpb.B).filter(arg_0 -> $$12.a(arg_0)).ifPresent($$1 -> {
            if ($$12.a((bfj)$$1, 6.0, 20.0)) {
                $$12.c((bfj)$$1);
            }
            if (!$$12.dK().a(bpb.ay)) {
                bxt.a($$12, $$1.di());
            }
        });
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

