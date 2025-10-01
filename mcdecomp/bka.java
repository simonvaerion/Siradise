/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bka
extends bhr<bfz> {
    public static final int c = 100;
    private long d;

    public bka() {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.b, (Object)((Object)bpc.a), bpb.H, (Object)((Object)bpc.c)));
    }

    @Override
    protected boolean a(aif $$0, bfz $$1) {
        long $$5;
        if ($$1.bM()) {
            return false;
        }
        bha<?> $$2 = $$1.dK();
        hd $$3 = $$2.c(bpb.b).get();
        if ($$0.ac() != $$3.a()) {
            return false;
        }
        Optional<Long> $$4 = $$2.c(bpb.H);
        if ($$4.isPresent() && ($$5 = $$0.V() - $$4.get()) > 0L && $$5 < 100L) {
            return false;
        }
        dcb $$6 = $$0.a_($$3.b());
        return $$3.b().a($$1.dg(), 2.0) && $$6.a(amw.R) && $$6.c(cpg.b) == false;
    }

    @Override
    protected boolean a(aif $$0, bfz $$1, long $$2) {
        Optional<hd> $$3 = $$1.dK().c(bpb.b);
        if (!$$3.isPresent()) {
            return false;
        }
        gu $$4 = $$3.get().b();
        return $$1.dK().c(bzz.e) && $$1.dp() > (double)$$4.v() + 0.4 && $$4.a($$1.dg(), 1.14);
    }

    @Override
    protected void d(aif $$0, bfz $$1, long $$2) {
        if ($$2 > this.d) {
            bha<Collection<Object>> $$3 = $$1.dK();
            if ($$3.a(bpb.v)) {
                Optional<List<bfz>> $$6;
                Set<hd> $$4 = $$3.c(bpb.v).get();
                if ($$3.a(bpb.g)) {
                    Optional<List<bfz>> $$5 = $$3.c(bpb.g);
                } else {
                    $$6 = Optional.empty();
                }
                bip.a($$0, $$1, null, null, $$4, $$6);
            }
            $$1.b($$1.dK().c(bpb.b).get().b());
        }
    }

    @Override
    protected boolean a(long $$0) {
        return false;
    }

    @Override
    protected void b(aif $$0, bfz $$1, long $$2) {
        if ($$1.fy()) {
            $$1.fz();
            this.d = $$2 + 40L;
        }
    }
}

