/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Predicate;

public class bhw {
    public static <E extends bfz, T> bhs<E> a(Predicate<E> $$0, bpb<? extends T> $$1, bpb<T> $$2, bdi $$3) {
        return bld.a($$42 -> $$42.group($$42.b($$1), $$42.c($$2)).apply((Applicative)$$42, ($$3, $$4) -> ($$5, $$6, $$7) -> {
            if (!$$0.test($$6)) {
                return false;
            }
            $$4.a($$42.b($$3), $$3.a($$5.z));
            return true;
        }));
    }
}

