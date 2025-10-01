/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class biy {
    private static final int a = 1;

    public static bhs<bfz> a(float $$0) {
        return bld.a($$1 -> $$1.group($$1.a(bpb.n), $$1.c(bpb.m), $$1.b(bpb.s)).apply((Applicative)$$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
            if ($$6.bM()) {
                return false;
            }
            bfj $$8 = (bfj)$$1.b($$4);
            if ($$8.a((bfj)$$6, 1.0)) {
                $$6.k($$8);
            } else {
                $$2.a(new bic($$8, true));
                $$3.a(new bpe(new bic($$8, false), $$0, 1));
            }
            return true;
        }));
    }
}

