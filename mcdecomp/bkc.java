/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bkc {
    public static <E extends bgb> bhs<E> a(Function<E, Optional<? extends bfz>> $$02) {
        return bkc.a($$0 -> true, $$02);
    }

    public static <E extends bgb> bhs<E> a(Predicate<E> $$0, Function<E, Optional<? extends bfz>> $$1) {
        return bld.a((bld.b<E> $$22) -> $$22.group($$22.c(bpb.o), $$22.a(bpb.E)).apply((Applicative)$$22, ($$2, $$3) -> ($$4, $$5, $$6) -> {
            if (!$$0.test($$5)) {
                return false;
            }
            Optional $$7 = (Optional)$$1.apply($$5);
            if ($$7.isEmpty()) {
                return false;
            }
            bfz $$8 = (bfz)$$7.get();
            if (!$$5.c($$8)) {
                return false;
            }
            $$2.a($$8);
            $$3.b();
            return true;
        }));
    }
}

