/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bih<E extends bfz>
extends bhr<E> {
    private static final int c = 3;
    private static final int d = 60;
    private final Function<bfz, Optional<bje>> e;
    private final float f;

    public bih(Function<bfz, Optional<bje>> $$0, float $$1, int $$2) {
        super(Map.of(bpb.n, bpc.c, bpb.m, bpc.c, bpb.aO, bpc.c), $$2);
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    protected boolean a(aif $$0, E $$1) {
        return this.b($$1);
    }

    @Override
    protected boolean a(aif $$0, E $$1, long $$2) {
        return this.b($$1);
    }

    @Override
    protected void d(aif $$0, E $$12, long $$2) {
        this.e.apply((bfz)$$12).ifPresent($$1 -> bht.a($$12, $$1, this.f, 3));
    }

    @Override
    protected void c(aif $$0, E $$1, long $$22) {
        cfz $$6;
        Optional<bje> $$3 = this.e.apply((bfz)$$1);
        if ($$3.isEmpty()) {
            return;
        }
        bje $$4 = $$3.get();
        double $$5 = $$4.a().f(((bfj)$$1).bm());
        if ($$5 < 3.0 && !($$6 = ((bxz)$$1).w().a(0, 1)).b()) {
            bih.a($$1, $$6, bih.a($$4));
            if ($$1 instanceof bsp) {
                bsp $$7 = (bsp)$$1;
                bsq.a((bfz)$$7).ifPresent($$2 -> this.a($$4, $$6, (aig)$$2));
            }
            ((bfz)$$1).dK().a(bpb.aO, Integer.valueOf(60));
        }
    }

    private void a(bje $$0, cfz $$1, aig $$2) {
        gu $$3 = $$0.b().d();
        ai.X.a($$2, $$3, $$1);
    }

    private boolean b(E $$0) {
        if (((bxz)$$0).w().ab_()) {
            return false;
        }
        Optional<bje> $$1 = this.e.apply((bfz)$$0);
        return $$1.isPresent();
    }

    private static eei a(bje $$0) {
        return $$0.a().b(0.0, 1.0, 0.0);
    }

    public static void a(bfz $$0, cfz $$1, eei $$2) {
        eei $$3 = new eei(0.2f, 0.3f, 0.2f);
        bht.a($$0, $$1, $$2, $$3, 0.2f);
        cmm $$4 = $$0.dI();
        if ($$4.V() % 7L == 0L && $$4.z.j() < 0.9) {
            float $$5 = ac.a(bsp.d, $$4.y_()).floatValue();
            $$4.a(null, $$0, amh.g, ami.g, 1.0f, $$5);
        }
    }
}

