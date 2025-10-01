/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class bij
extends bhr<byb> {
    private static final int d = 1200;
    final float c;

    public bij(float $$0) {
        super((Map<bpb<?>, bpc>)ImmutableMap.of(bpb.d, (Object)((Object)bpc.a)), 1200);
        this.c = $$0;
    }

    @Override
    protected boolean a(aif $$02, byb $$1) {
        return $$1.dK().g().map($$0 -> $$0 == bzz.b || $$0 == bzz.c || $$0 == bzz.d).orElse(true);
    }

    @Override
    protected boolean a(aif $$0, byb $$1, long $$2) {
        return $$1.dK().a(bpb.d);
    }

    @Override
    protected void b(aif $$0, byb $$1, long $$2) {
        bht.a((bfz)$$1, $$1.dK().c(bpb.d).get().b(), this.c, 1);
    }

    @Override
    protected void c(aif $$0, byb $$12, long $$2) {
        Optional<hd> $$3 = $$12.dK().c(bpb.d);
        $$3.ifPresent($$1 -> {
            gu $$2 = $$1.b();
            aif $$3 = $$0.n().a($$1.a());
            if ($$3 == null) {
                return;
            }
            bqz $$4 = $$3.w();
            if ($$4.a($$2, (he<brc> $$0) -> true)) {
                $$4.b($$2);
            }
            za.c($$0, $$2);
        });
        $$12.dK().b(bpb.d);
    }

    @Override
    protected /* synthetic */ void b(aif aif2, bfz bfz2, long l2) {
        this.c(aif2, (byb)bfz2, l2);
    }

    @Override
    protected /* synthetic */ void c(aif aif2, bfz bfz2, long l2) {
        this.b(aif2, (byb)bfz2, l2);
    }
}

