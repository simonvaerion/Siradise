/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class blb
extends bhr<byb> {
    private static final int c = 300;
    private static final double d = 1.73;
    private long e;

    public blb() {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.c, (Object)((Object)bpc.a), bpb.n, (Object)((Object)bpc.c)));
    }

    protected boolean b(aif $$0, byb $$1) {
        if ($$0.V() - this.e < 300L) {
            return false;
        }
        if ($$0.z.a(2) != 0) {
            return false;
        }
        this.e = $$0.V();
        hd $$2 = $$1.dK().c(bpb.c).get();
        return $$2.a() == $$0.ac() && $$2.b().a($$1.dg(), 1.73);
    }

    protected void a(aif $$0, byb $$12, long $$2) {
        bha<byb> $$3 = $$12.dK();
        $$3.a(bpb.I, Long.valueOf($$2));
        $$3.c(bpb.c).ifPresent($$1 -> $$3.a(bpb.n, new bhu($$1.b())));
        $$12.gn();
        this.a($$0, $$12);
        if ($$12.gm()) {
            $$12.gl();
        }
    }

    protected void a(aif $$0, byb $$1) {
    }

    protected boolean b(aif $$0, byb $$1, long $$2) {
        Optional<hd> $$3 = $$1.dK().c(bpb.c);
        if (!$$3.isPresent()) {
            return false;
        }
        hd $$4 = $$3.get();
        return $$4.a() == $$0.ac() && $$4.b().a($$1.dg(), 1.73);
    }

    @Override
    protected /* synthetic */ boolean a(aif aif2, bfz bfz2) {
        return this.b(aif2, (byb)bfz2);
    }

    @Override
    protected /* synthetic */ boolean a(aif aif2, bfz bfz2, long l2) {
        return this.b(aif2, (byb)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.a(aif2, (byb)bfz2, l2);
    }
}

