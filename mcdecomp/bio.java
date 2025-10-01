/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Predicate;

public class bio {
    public static <T extends bfz> bhs<bfz> a(bfn<? extends T> $$02, int $$1, bpb<T> $$2, float $$3, int $$4) {
        return bio.a($$02, $$1, (E $$0) -> true, $$0 -> true, $$2, $$3, $$4);
    }

    public static <E extends bfz, T extends bfz> bhs<E> a(bfn<? extends T> $$0, int $$1, Predicate<E> $$22, Predicate<T> $$3, bpb<T> $$4, float $$5, int $$6) {
        int $$7 = $$1 * $$1;
        Predicate<bfz> $$8 = $$2 -> $$0.equals($$2.ae()) && $$3.test($$2);
        return bld.a((bld.b<E> $$62) -> $$62.group($$62.a($$4), $$62.a(bpb.n), $$62.c(bpb.m), $$62.b(bpb.h)).apply((Applicative)$$62, ($$6, $$7, $$8, $$9) -> ($$10, $$11, $$12) -> {
            bpd $$13 = (bpd)$$62.b($$9);
            if ($$22.test($$11) && $$13.d($$8)) {
                Optional<bfz> $$14 = $$13.a($$3 -> $$3.f($$11) <= (double)$$7 && $$8.test((bfz)$$3));
                $$14.ifPresent($$5 -> {
                    $$6.a($$5);
                    $$7.a(new bic((bfj)$$5, true));
                    $$8.a(new bpe(new bic((bfj)$$5, false), $$5, $$6));
                });
                return true;
            }
            return false;
        }));
    }
}

