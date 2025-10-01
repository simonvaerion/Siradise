/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class bkl
extends bhr<byb> {
    private static final int c = 5;
    private static final float d = 0.5f;
    private Set<cfu> e = ImmutableSet.of();

    public bkl() {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.q, (Object)((Object)bpc.a), bpb.h, (Object)((Object)bpc.a)));
    }

    @Override
    protected boolean a(aif $$0, byb $$1) {
        return bht.a($$1.dK(), bpb.q, bfn.bf);
    }

    @Override
    protected boolean a(aif $$0, byb $$1, long $$2) {
        return this.a($$0, $$1);
    }

    @Override
    protected void b(aif $$0, byb $$1, long $$2) {
        byb $$3 = (byb)$$1.dK().c(bpb.q).get();
        bht.a((bfz)$$1, (bfz)$$3, 0.5f);
        this.e = bkl.a($$1, $$3);
    }

    @Override
    protected void c(aif $$0, byb $$1, long $$2) {
        byb $$3 = (byb)$$1.dK().c(bpb.q).get();
        if ($$1.f((bfj)$$3) > 5.0) {
            return;
        }
        bht.a((bfz)$$1, (bfz)$$3, 0.5f);
        $$1.a($$0, $$3, $$2);
        if ($$1.gq() && ($$1.gj().b() == bye.g || $$3.gr())) {
            bkl.a($$1, byb.bW.keySet(), $$3);
        }
        if ($$3.gj().b() == bye.g && $$1.w().a_(cgc.oI) > cgc.oI.l() / 2) {
            bkl.a($$1, (Set<cfu>)ImmutableSet.of((Object)cgc.oI), $$3);
        }
        if (!this.e.isEmpty() && $$1.w().a(this.e)) {
            bkl.a($$1, this.e, $$3);
        }
    }

    @Override
    protected void d(aif $$0, byb $$1, long $$2) {
        $$1.dK().b(bpb.q);
    }

    private static Set<cfu> a(byb $$0, byb $$12) {
        ImmutableSet<cfu> $$2 = $$12.gj().b().d();
        ImmutableSet<cfu> $$3 = $$0.gj().b().d();
        return $$2.stream().filter($$1 -> !$$3.contains($$1)).collect(Collectors.toSet());
    }

    private static void a(byb $$0, Set<cfu> $$1, bfz $$2) {
        bee $$3 = $$0.w();
        cfz $$4 = cfz.b;
        for (int $$5 = 0; $$5 < $$3.b(); ++$$5) {
            int $$9;
            cfu $$7;
            cfz $$6 = $$3.a($$5);
            if ($$6.b() || !$$1.contains($$7 = $$6.d())) continue;
            if ($$6.L() > $$6.g() / 2) {
                int $$8 = $$6.L() / 2;
            } else {
                if ($$6.L() <= 24) continue;
                $$9 = $$6.L() - 24;
            }
            $$6.h($$9);
            $$4 = new cfz($$7, $$9);
            break;
        }
        if (!$$4.b()) {
            bht.a((bfz)$$0, $$4, $$2.dg());
        }
    }

    @Override
    protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
        this.d(aif2, (byb)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.b(aif2, (byb)bfz2, l2);
    }
}

