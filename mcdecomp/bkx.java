/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class bkx
extends bhr<byb> {
    private static final int c = 5;
    private static final float d = 0.5f;
    private long e;

    public bkx() {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.r, (Object)((Object)bpc.a), bpb.h, (Object)((Object)bpc.a)), 350, 350);
    }

    @Override
    protected boolean a(aif $$0, byb $$1) {
        return this.a($$1);
    }

    @Override
    protected boolean a(aif $$0, byb $$1, long $$2) {
        return $$2 <= this.e && this.a($$1);
    }

    @Override
    protected void b(aif $$0, byb $$1, long $$2) {
        bfe $$3 = $$1.dK().c(bpb.r).get();
        bht.a((bfz)$$1, (bfz)$$3, 0.5f);
        $$0.a((bfj)$$3, (byte)18);
        $$0.a((bfj)$$1, (byte)18);
        int $$4 = 275 + $$1.ec().a(50);
        this.e = $$2 + (long)$$4;
    }

    @Override
    protected void c(aif $$0, byb $$1, long $$2) {
        byb $$3 = (byb)$$1.dK().c(bpb.r).get();
        if ($$1.f((bfj)$$3) > 5.0) {
            return;
        }
        bht.a((bfz)$$1, (bfz)$$3, 0.5f);
        if ($$2 >= this.e) {
            $$1.gp();
            $$3.gp();
            this.a($$0, $$1, $$3);
        } else if ($$1.ec().a(35) == 0) {
            $$0.a((bfj)$$3, (byte)12);
            $$0.a((bfj)$$1, (byte)12);
        }
    }

    private void a(aif $$0, byb $$1, byb $$2) {
        Optional<gu> $$3 = this.b($$0, $$1);
        if (!$$3.isPresent()) {
            $$0.a((bfj)$$2, (byte)13);
            $$0.a((bfj)$$1, (byte)13);
        } else {
            Optional<byb> $$4 = this.b($$0, $$1, $$2);
            if ($$4.isPresent()) {
                this.a($$0, $$4.get(), $$3.get());
            } else {
                $$0.w().b($$3.get());
                za.c($$0, $$3.get());
            }
        }
    }

    @Override
    protected void d(aif $$0, byb $$1, long $$2) {
        $$1.dK().b(bpb.r);
    }

    @Override
    private boolean a(byb $$02) {
        bha<byb> $$1 = $$02.dK();
        Optional<bfe> $$2 = $$1.c(bpb.r).filter($$0 -> $$0.ae() == bfn.bf);
        if (!$$2.isPresent()) {
            return false;
        }
        return bht.a($$1, bpb.r, bfn.bf) && $$02.P_() && $$2.get().P_();
    }

    private Optional<gu> b(aif $$02, byb $$12) {
        return $$02.w().a($$0 -> $$0.a(brd.n), ($$1, $$2) -> this.a($$12, (gu)$$2, (he<brc>)$$1), $$12.di(), 48);
    }

    private boolean a(byb $$0, gu $$1, he<brc> $$2) {
        dxt $$3 = $$0.J().a($$1, $$2.a().c());
        return $$3 != null && $$3.j();
    }

    private Optional<byb> b(aif $$0, byb $$1, byb $$2) {
        byb $$3 = $$1.b($$0, $$2);
        if ($$3 == null) {
            return Optional.empty();
        }
        $$1.c_(6000);
        $$2.c_(6000);
        $$3.c_(-24000);
        $$3.b($$1.dn(), $$1.dp(), $$1.dt(), 0.0f, 0.0f);
        $$0.a_($$3);
        $$0.a((bfj)$$3, (byte)12);
        return Optional.of($$3);
    }

    private void a(aif $$0, byb $$1, gu $$2) {
        hd $$3 = hd.a($$0.ac(), $$2);
        $$1.dK().a(bpb.b, $$3);
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

