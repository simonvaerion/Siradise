/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class blj<E extends bxs>
extends bhr<E> {
    public blj(int $$0) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.o, (Object)((Object)bpc.b), bpb.m, (Object)((Object)bpc.b)), $$0);
    }

    @Override
    protected boolean a(aif $$0, E $$1, long $$2) {
        return ((bfj)$$1).dE() == null;
    }

    @Override
    protected boolean a(aif $$0, E $$1) {
        return ((bfj)$$1).ay() || ((bfj)$$1).aV() || ((bfj)$$1).bi();
    }

    @Override
    protected void b(aif $$0, E $$1, long $$2) {
        if (((bfj)$$1).ay()) {
            ((bfj)$$1).b(bgl.o);
            ((bfj)$$1).a(amh.zu, 5.0f, 1.0f);
        } else {
            ((bfj)$$1).a(amh.zp, 5.0f, 1.0f);
            this.c($$0, $$1, $$2);
        }
    }

    @Override
    protected void c(aif $$0, E $$1, long $$2) {
        if (((bfj)$$1).dE() == null) {
            ((bfz)$$1).a(bfj.c.b);
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

