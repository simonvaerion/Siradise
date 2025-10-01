/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class bkb {
    private static final float a = 0.3f;

    public static bjb<bfz> a() {
        return bld.a((bld.b<E> $$0) -> $$0.group($$0.a(bpb.m), $$0.a(bpb.n), $$0.b(bpb.e), $$0.b(bpb.h), $$0.c(bpb.q)).apply((Applicative)$$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
            hd $$9 = (hd)$$0.b($$3);
            bpd $$10 = (bpd)$$0.b($$4);
            if ($$6.y_().a(100) == 0 && $$6.ac() == $$9.a() && $$9.b().a($$7.dg(), 4.0) && $$10.d($$0 -> bfn.bf.equals($$0.ae()))) {
                $$10.a($$1 -> bfn.bf.equals($$1.ae()) && $$1.f($$7) <= 32.0).ifPresent($$3 -> {
                    $$5.a($$3);
                    $$2.a(new bic((bfj)$$3, true));
                    $$1.a(new bpe(new bic((bfj)$$3, false), 0.3f, 1));
                });
                return true;
            }
            return false;
        }));
    }
}

