/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.BiPredicate;

public class bia {
    public static <E extends bfz> bhs<E> a(int $$0, BiPredicate<E, bfj> $$1) {
        return bld.a($$2 -> $$2.group($$2.a(bpb.s)).apply((Applicative)$$2, $$3 -> ($$4, $$5, $$6) -> {
            bfj $$9;
            bfj $$7 = $$5.cW();
            bfj $$8 = $$2.a($$3).orElse(null);
            if ($$7 == null && $$8 == null) {
                return false;
            }
            bfj bfj2 = $$9 = $$7 == null ? $$8 : $$7;
            if (!bia.a($$5, $$9, $$0) || $$1.test($$5, $$9)) {
                $$5.Y();
                $$3.b();
                return true;
            }
            return false;
        }));
    }

    private static boolean a(bfz $$0, bfj $$1, int $$2) {
        return $$1.bs() && $$1.a((bfj)$$0, (double)$$2) && $$1.dI() == $$0.dI();
    }
}

