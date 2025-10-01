/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Function;

public class bho {
    public static bjb<bfe> a(bdi $$0, float $$12) {
        return bho.a($$0, (bfz $$1) -> Float.valueOf($$12));
    }

    public static bjb<bfe> a(bdi $$0, Function<bfz, Float> $$1) {
        return bld.a($$2 -> $$2.group($$2.b(bpb.J), $$2.a(bpb.n), $$2.c(bpb.m)).apply((Applicative)$$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
            if (!$$7.h_()) {
                return false;
            }
            bfe $$9 = (bfe)$$2.b($$3);
            if ($$7.a((bfj)$$9, (double)($$0.b() + 1)) && !$$7.a((bfj)$$9, (double)$$0.a())) {
                bpe $$10 = new bpe(new bic($$9, false), ((Float)$$1.apply($$7)).floatValue(), $$0.a() - 1);
                $$4.a(new bic($$9, true));
                $$5.a($$10);
                return true;
            }
            return false;
        }));
    }
}

