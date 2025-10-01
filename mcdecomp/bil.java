/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Predicate;

public class bil {
    public static bhs<bfz> a(float $$02, boolean $$1, int $$2) {
        return bil.a($$0 -> true, $$02, $$1, $$2);
    }

    public static <E extends bfz> bhs<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
        return bld.a((bld.b<E> $$42) -> {
            bld $$52 = $$2 ? $$42.a(bpb.m) : $$42.c(bpb.m);
            return $$42.group($$42.a(bpb.n), $$52, $$42.b(bpb.K), $$42.a(bpb.aO)).apply((Applicative)$$42, ($$4, $$5, $$6, $$7) -> ($$8, $$9, $$10) -> {
                bvh $$11 = (bvh)$$42.b($$6);
                if ($$42.a($$7).isEmpty() && $$0.test($$9) && $$11.a((bfj)$$9, (double)$$3) && $$9.dI().w_().a($$11.di())) {
                    bpe $$12 = new bpe(new bic($$11, false), $$1, 0);
                    $$4.a(new bic($$11, true));
                    $$5.a($$12);
                    return true;
                }
                return false;
            });
        });
    }
}

