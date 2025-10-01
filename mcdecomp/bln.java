/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Function;

public class bln {
    public static <E extends bxs> bhs<E> a(Function<E, Optional<? extends bfz>> $$0) {
        return bld.a((bld.b<E> $$12) -> $$12.group($$12.c(bpb.ax), $$12.c(bpb.o), $$12.a(bpb.E)).apply((Applicative)$$12, ($$1, $$2, $$32) -> ($$3, $$4, $$5) -> {
            Optional $$6 = (Optional)$$0.apply($$4);
            if ($$6.filter($$4::a).isEmpty()) {
                return false;
            }
            $$1.a((bfz)$$6.get());
            $$32.b();
            return true;
        }));
    }
}

