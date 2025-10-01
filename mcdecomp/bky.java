/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class bky
extends bhr<byb> {
    public bky() {
        super((Map<bpb<?>, bpc>)ImmutableMap.of());
    }

    @Override
    protected boolean a(aif $$0, byb $$1, long $$2) {
        return bky.c($$1) || bky.b($$1);
    }

    @Override
    protected void b(aif $$0, byb $$1, long $$2) {
        if (bky.c($$1) || bky.b($$1)) {
            bha<byb> $$3 = $$1.dK();
            if (!$$3.c(bzz.g)) {
                $$3.b(bpb.t);
                $$3.b(bpb.m);
                $$3.b(bpb.n);
                $$3.b(bpb.r);
                $$3.b(bpb.q);
            }
            $$3.a(bzz.g);
        }
    }

    @Override
    protected void c(aif $$0, byb $$1, long $$2) {
        if ($$2 % 100L == 0L) {
            $$1.a($$0, $$2, 3);
        }
    }

    public static boolean b(bfz $$0) {
        return $$0.dK().a(bpb.A);
    }

    public static boolean c(bfz $$0) {
        return $$0.dK().a(bpb.x);
    }

    @Override
    protected /* synthetic */ void d(aif aif2, bfz bfz2, long l2) {
        this.b(aif2, (byb)bfz2, l2);
    }
}

