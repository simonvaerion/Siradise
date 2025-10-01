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

public class bke {
    public static bhs<bfz> a(Function<bfz, Optional<bje>> $$0, Predicate<bfz> $$1, int $$2, int $$3, float $$4) {
        return bld.a($$52 -> $$52.group($$52.a(bpb.n), $$52.a(bpb.m)).apply((Applicative)$$52, ($$5, $$6) -> ($$7, $$8, $$9) -> {
            Optional $$10 = (Optional)$$0.apply($$8);
            if ($$10.isEmpty() || !$$1.test($$8)) {
                return false;
            }
            bje $$11 = (bje)$$10.get();
            if ($$8.dg().a((ho)$$11.a(), (double)$$3)) {
                return false;
            }
            bje $$12 = (bje)$$10.get();
            $$5.a($$12);
            $$6.a(new bpe($$12, $$4, $$2));
            return true;
        }));
    }
}

