/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Predicate;

public class bjp {
    public static bhs<bfz> a(bgc $$0, float $$12) {
        return bjp.a((bfz $$1) -> $$0.equals($$1.ae().f()), $$12);
    }

    public static bjb<bfz> a(bfn<?> $$0, float $$12) {
        return bjp.a((bfz $$1) -> $$0.equals($$1.ae()), $$12);
    }

    public static bjb<bfz> a(float $$02) {
        return bjp.a((bfz $$0) -> true, $$02);
    }

    public static bjb<bfz> a(Predicate<bfz> $$0, float $$1) {
        float $$22 = $$1 * $$1;
        return bld.a((bld.b<E> $$2) -> $$2.group($$2.c(bpb.n), $$2.b(bpb.h)).apply((Applicative)$$2, ($$3, $$4) -> ($$5, $$6, $$7) -> {
            Optional<bfz> $$8 = ((bpd)$$2.b($$4)).a($$0.and($$2 -> $$2.f($$6) <= (double)$$22 && !$$6.u((bfj)$$2)));
            if ($$8.isEmpty()) {
                return false;
            }
            $$3.a(new bic($$8.get(), true));
            return true;
        }));
    }
}

