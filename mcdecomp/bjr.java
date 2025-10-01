/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  org.apache.commons.lang3.mutable.MutableInt
 */
import com.mojang.datafixers.kinds.Applicative;
import org.apache.commons.lang3.mutable.MutableInt;

public class bjr {
    private static final int a = 300;

    public static bhs<bfz> a(int $$0, int $$1) {
        int $$2 = $$0 * 20;
        MutableInt $$32 = new MutableInt(0);
        return bld.a($$3 -> $$3.group($$3.b(bpb.C), $$3.b(bpb.D)).apply((Applicative)$$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
            boolean $$10;
            long $$9 = (Long)$$3.b($$5);
            boolean bl2 = $$10 = $$9 + 300L <= $$8;
            if ($$32.getValue() > $$2 || $$10) {
                $$5.b();
                $$4.b();
                $$7.dK().a($$6.W(), $$6.V());
                $$32.setValue(0);
                return true;
            }
            gu $$11 = ((hd)$$3.b($$4)).b();
            if ($$11.a($$7.di(), (double)$$1)) {
                $$32.increment();
            }
            return true;
        }));
    }
}

