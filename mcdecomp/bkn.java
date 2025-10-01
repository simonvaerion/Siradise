/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  org.apache.commons.lang3.mutable.MutableLong
 */
import com.mojang.datafixers.kinds.Applicative;
import org.apache.commons.lang3.mutable.MutableLong;

public class bkn {
    private static final int a = 60;

    public static bhs<bgi> a(int $$0, float $$1) {
        MutableLong $$2 = new MutableLong(0L);
        return bld.a($$32 -> $$32.group($$32.c(bpb.o), $$32.c(bpb.m), $$32.a(bpb.n)).apply((Applicative)$$32, ($$3, $$4, $$52) -> ($$5, $$6, $$7) -> {
            if (!$$5.b_($$6.di()).a(anb.a)) {
                return false;
            }
            if ($$7 < $$2.getValue()) {
                $$2.setValue($$7 + 60L);
                return true;
            }
            gu $$8 = $$6.di();
            gu.a $$9 = new gu.a();
            een $$10 = een.a($$6);
            for (gu $$11 : gu.a($$8, $$0, $$0, $$0)) {
                if ($$11.u() == $$8.u() && $$11.w() == $$8.w()) continue;
                dcb $$12 = $$5.a_($$11);
                dcb $$13 = $$5.a_($$9.a((hz)$$11, ha.a));
                if ($$12.a(cpo.G) || !$$5.b_($$11).c() || !$$12.b((cls)$$5, $$11, $$10).b() || !$$13.d($$5, $$9, ha.b)) continue;
                gu $$14 = $$11.i();
                $$52.a(new bhu($$14));
                $$4.a(new bpe(new bhu($$14), $$1, 1));
                break;
            }
            $$2.setValue($$7 + 60L);
            return true;
        }));
    }
}

