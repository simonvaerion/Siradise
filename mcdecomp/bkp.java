/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  org.apache.commons.lang3.mutable.MutableLong
 */
import com.mojang.datafixers.kinds.Applicative;
import org.apache.commons.lang3.mutable.MutableLong;

public class bkp {
    public static bhs<bgi> a(int $$0, float $$1) {
        MutableLong $$2 = new MutableLong(0L);
        return bld.a($$32 -> $$32.group($$32.c(bpb.o), $$32.c(bpb.m), $$32.a(bpb.n)).apply((Applicative)$$32, ($$3, $$4, $$52) -> ($$5, $$6, $$7) -> {
            if ($$5.b_($$6.di()).a(anb.a)) {
                return false;
            }
            if ($$7 < $$2.getValue()) {
                $$2.setValue($$7 + 20L + 2L);
                return true;
            }
            gu $$8 = null;
            gu $$9 = null;
            gu $$10 = $$6.di();
            Iterable<gu> $$11 = gu.a($$10, $$0, $$0, $$0);
            for (gu $$12 : $$11) {
                if ($$12.u() == $$10.u() && $$12.w() == $$10.w()) continue;
                dcb $$13 = $$6.dI().a_($$12.c());
                dcb $$14 = $$6.dI().a_($$12);
                if (!$$14.a(cpo.G)) continue;
                if ($$13.i()) {
                    $$8 = $$12.i();
                    break;
                }
                if ($$9 != null || $$12.a($$6.dg(), 1.5)) continue;
                $$9 = $$12.i();
            }
            if ($$8 == null) {
                $$8 = $$9;
            }
            if ($$8 != null) {
                $$52.a(new bhu($$8));
                $$4.a(new bpe(new bhu($$8), $$1, 0));
            }
            $$2.setValue($$7 + 40L);
            return true;
        }));
    }
}

