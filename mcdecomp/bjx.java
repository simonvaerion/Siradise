/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Function;
import java.util.function.Predicate;

public class bjx {
    public static bjb<bfz> a(float $$02, int $$12) {
        return bjx.a($$0 -> true, $$1 -> Float.valueOf($$02), $$12);
    }

    public static bjb<bfz> a(Predicate<bfz> $$0, Function<bfz, Float> $$1, int $$2) {
        return bld.a((bld.b<E> $$3) -> $$3.group($$3.c(bpb.m), $$3.b(bpb.n)).apply((Applicative)$$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
            if (!$$0.test($$7)) {
                return false;
            }
            $$4.a(new bpe((bje)$$3.b($$5), ((Float)$$1.apply($$7)).floatValue(), $$2));
            return true;
        }));
    }
}

