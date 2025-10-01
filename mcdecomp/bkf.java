/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class bkf {
    private static final int a = 200;

    public static <E extends bgb> bhs<E> a(BiConsumer<E, bfz> $$02) {
        return bkf.a($$0 -> false, $$02, true);
    }

    public static <E extends bgb> bhs<E> a(Predicate<bfz> $$02) {
        return bkf.a($$02, ($$0, $$1) -> {}, true);
    }

    public static <E extends bgb> bhs<E> a() {
        return bkf.a($$0 -> false, ($$0, $$1) -> {}, true);
    }

    public static <E extends bgb> bhs<E> a(Predicate<bfz> $$0, BiConsumer<E, bfz> $$1, boolean $$2) {
        return bld.a((bld.b<E> $$3) -> $$3.group($$3.b(bpb.o), $$3.a(bpb.E)).apply((Applicative)$$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
            bfz $$9 = (bfz)$$3.b($$4);
            if (!$$7.c($$9) || $$2 && bkf.a($$7, $$3.a($$5)) || !$$9.bs() || $$9.dI() != $$7.dI() || $$0.test($$9)) {
                $$1.accept($$7, $$9);
                $$4.b();
                return true;
            }
            return true;
        }));
    }

    private static boolean a(bfz $$0, Optional<Long> $$1) {
        return $$1.isPresent() && $$0.dI().V() - $$1.get() > 200L;
    }
}

