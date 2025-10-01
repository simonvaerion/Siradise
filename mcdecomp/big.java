/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class big
extends bhr<byb> {
    private static final int c = 5;
    private static final int d = 600;
    private static final int e = 6600;
    private static final int f = 20;
    private static final Map<bye, acq> g = ac.a(Maps.newHashMap(), $$0 -> {
        $$0.put(bye.c, dzg.an);
        $$0.put(bye.d, dzg.ao);
        $$0.put(bye.e, dzg.ap);
        $$0.put(bye.f, dzg.aq);
        $$0.put(bye.g, dzg.ar);
        $$0.put(bye.h, dzg.as);
        $$0.put(bye.i, dzg.at);
        $$0.put(bye.j, dzg.au);
        $$0.put(bye.k, dzg.av);
        $$0.put(bye.l, dzg.aw);
        $$0.put(bye.n, dzg.ax);
        $$0.put(bye.o, dzg.ay);
        $$0.put(bye.p, dzg.az);
    });
    private static final float h = 0.5f;
    private int i = 600;
    private boolean j;
    private long k;

    public big(int $$0) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.m, (Object)((Object)bpc.c), bpb.n, (Object)((Object)bpc.c), bpb.q, (Object)((Object)bpc.c), bpb.k, (Object)((Object)bpc.a)), $$0);
    }

    @Override
    protected boolean a(aif $$0, byb $$1) {
        if (!this.b($$1)) {
            return false;
        }
        if (this.i > 0) {
            --this.i;
            return false;
        }
        return true;
    }

    protected void a(aif $$0, byb $$1, long $$2) {
        this.j = false;
        this.k = $$2;
        byo $$3 = this.c($$1).get();
        $$1.dK().a(bpb.q, $$3);
        bht.a((bfz)$$1, (bfz)$$3);
    }

    protected boolean b(aif $$0, byb $$1, long $$2) {
        return this.b($$1) && !this.j;
    }

    @Override
    protected void c(aif $$0, byb $$1, long $$2) {
        byo $$3 = this.c($$1).get();
        bht.a((bfz)$$1, (bfz)$$3);
        if (this.a($$1, $$3)) {
            if ($$2 - this.k > 20L) {
                this.a($$1, (bfz)$$3);
                this.j = true;
            }
        } else {
            bht.a((bfz)$$1, $$3, 0.5f, 5);
        }
    }

    @Override
    protected void d(aif $$0, byb $$1, long $$2) {
        this.i = big.a($$0);
        $$1.dK().b(bpb.q);
        $$1.dK().b(bpb.m);
        $$1.dK().b(bpb.n);
    }

    private void a(byb $$0, bfz $$1) {
        List<cfz> $$2 = this.a($$0);
        for (cfz $$3 : $$2) {
            bht.a((bfz)$$0, $$3, $$1.dg());
        }
    }

    private List<cfz> a(byb $$0) {
        if ($$0.h_()) {
            return ImmutableList.of((Object)new cfz(cgc.cP));
        }
        bye $$1 = $$0.gj().b();
        if (g.containsKey($$1)) {
            dzs $$2 = $$0.dI().n().aH().getLootTable(g.get($$1));
            dzq $$3 = new dzq.a((aif)$$0.dI()).a(ebw.f, $$0.dg()).a(ebw.a, $$0).a(ebv.h);
            return $$2.a($$3);
        }
        return ImmutableList.of((Object)new cfz(cgc.oH));
    }

    private boolean b(byb $$0) {
        return this.c($$0).isPresent();
    }

    private Optional<byo> c(byb $$0) {
        return $$0.dK().c(bpb.k).filter(this::a);
    }

    @Override
    private boolean a(byo $$0) {
        return $$0.a(bfc.F);
    }

    private boolean a(byb $$0, byo $$1) {
        gu $$2 = $$1.di();
        gu $$3 = $$0.di();
        return $$3.a($$2, 5.0);
    }

    private static int a(aif $$0) {
        return 600 + $$0.z.a(6001);
    }

    @Override
    protected /* synthetic */ boolean a(aif aif2, bfz bfz2, long l2) {
        return this.b(aif2, (byb)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
        this.d(aif2, (byb)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.a(aif2, (byb)bfz2, l2);
    }
}

