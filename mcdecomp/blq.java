/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class blq
extends bhr<bxs> {
    private static final int d = 15;
    private static final int e = 20;
    private static final double f = 0.5;
    private static final double g = 2.5;
    public static final int c = 40;
    private static final int h = apa.c(34.0);
    private static final int i = apa.f(60.0f);

    public blq() {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.o, (Object)((Object)bpc.a), bpb.aI, (Object)((Object)bpc.b), bpb.aJ, (Object)((Object)bpc.c), bpb.aK, (Object)((Object)bpc.c)), i);
    }

    @Override
    protected boolean a(aif $$0, bxs $$1) {
        return $$1.a((bfj)$$1.dK().c(bpb.o).get(), 15.0, 20.0);
    }

    @Override
    protected boolean a(aif $$0, bxs $$1, long $$2) {
        return true;
    }

    @Override
    protected void b(aif $$0, bxs $$1, long $$2) {
        $$1.dK().a(bpb.p, true, i);
        $$1.dK().a(bpb.aK, apz.a, h);
        $$0.a((bfj)$$1, (byte)62);
        $$1.a(amh.zG, 3.0f, 1.0f);
    }

    @Override
    protected void c(aif $$0, bxs $$12, long $$22) {
        $$12.dK().c(bpb.o).ifPresent($$1 -> $$12.E().a($$1.dg()));
        if ($$12.dK().a(bpb.aK) || $$12.dK().a(bpb.aJ)) {
            return;
        }
        $$12.dK().a(bpb.aJ, apz.a, i - h);
        $$12.dK().c(bpb.o).filter($$12::a).filter($$1 -> $$12.a((bfj)$$1, 15.0, 20.0)).ifPresent($$2 -> {
            eei $$3 = $$12.dg().b(0.0, 1.6f, 0.0);
            eei $$4 = $$2.bm().d($$3);
            eei $$5 = $$4.d();
            for (int $$6 = 1; $$6 < apa.a($$4.f()) + 7; ++$$6) {
                eei $$7 = $$3.e($$5.a((double)$$6));
                $$0.a(iv.y, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }
            $$12.a(amh.zF, 3.0f, 1.0f);
            $$2.a($$0.ag().e($$12), 10.0f);
            double $$8 = 0.5 * (1.0 - $$2.b(bhg.c));
            double $$9 = 2.5 * (1.0 - $$2.b(bhg.c));
            $$2.j($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
        });
    }

    @Override
    protected void d(aif $$0, bxs $$1, long $$2) {
        blq.a((bfz)$$1, 40);
    }

    public static void a(bfz $$0, int $$1) {
        $$0.dK().a(bpb.aI, apz.a, $$1);
    }

    @Override
    protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
        this.d(aif2, (bxs)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.b(aif2, (bxs)bfz2, l2);
    }
}

