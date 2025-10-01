/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class bik {
    private static gu a(bgb $$0, gu $$1) {
        apf $$2 = $$0.dI().z;
        return $$1.b(bik.a($$2), 0, bik.a($$2));
    }

    private static int a(apf $$0) {
        return $$0.a(3) - 1;
    }

    public static <E extends bgb> bjb<E> a(bpb<gu> $$0, int $$1, float $$2) {
        return bld.a((bld.b<E> $$32) -> $$32.group($$32.b($$0), $$32.c(bpb.o), $$32.c(bpb.m), $$32.a(bpb.n)).apply((Applicative)$$32, ($$3, $$42, $$52, $$62) -> ($$4, $$5, $$6) -> {
            gu $$7 = (gu)$$32.b($$3);
            boolean $$8 = $$7.a($$5.di(), (double)$$1);
            if (!$$8) {
                bht.a($$5, bik.a($$5, $$7), $$2, $$1);
            }
            return true;
        }));
    }
}

