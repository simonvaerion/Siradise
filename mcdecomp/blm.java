/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class blm
extends bhr<bxs> {
    private static final int c = 25;
    private static final int d = 20;

    public blm() {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.ax, (Object)((Object)bpc.a), bpb.o, (Object)((Object)bpc.b), bpb.aE, (Object)((Object)bpc.c), bpb.aC, (Object)((Object)bpc.c)), bxt.b);
    }

    protected void a(aif $$0, bxs $$1, long $$2) {
        bha<bxs> $$3 = $$1.dK();
        $$3.a(bpb.aC, apz.a, 25L);
        $$3.b(bpb.m);
        bfz $$4 = $$1.dK().c(bpb.ax).get();
        bht.a((bfz)$$1, $$4);
        $$1.b(bgl.l);
        $$1.a((bfj)$$4, 20, false);
    }

    protected boolean b(aif $$0, bxs $$1, long $$2) {
        return true;
    }

    @Override
    protected void c(aif $$0, bxs $$1, long $$2) {
        if ($$1.dK().a(bpb.aC) || $$1.dK().a(bpb.aE)) {
            return;
        }
        $$1.dK().a(bpb.aE, apz.a, bxt.b - 25);
        $$1.a(amh.zD, 3.0f, 1.0f);
    }

    @Override
    protected void d(aif $$0, bxs $$1, long $$2) {
        if ($$1.c(bgl.l)) {
            $$1.b(bgl.a);
        }
        $$1.dK().c(bpb.ax).ifPresent($$1::l);
        $$1.dK().b(bpb.ax);
    }

    @Override
    protected /* synthetic */ boolean a(aif aif2, bfz bfz2, long l2) {
        return this.b(aif2, (bxs)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
        this.d(aif2, (bxs)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.a(aif2, (bxs)bfz2, l2);
    }
}

