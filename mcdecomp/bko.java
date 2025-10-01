/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  org.apache.commons.lang3.mutable.MutableLong
 */
import com.mojang.datafixers.kinds.Applicative;
import org.apache.commons.lang3.mutable.MutableLong;

public class bko {
    public static bhs<bgi> a(int $$0, float $$1) {
        MutableLong $$2 = new MutableLong(0L);
        return bld.a($$32 -> $$32.group($$32.c(bpb.o), $$32.c(bpb.m), $$32.a(bpb.n)).apply((Applicative)$$32, ($$3, $$4, $$52) -> ($$5, $$6, $$7) -> {
            if ($$5.b_($$6.di()).a(anb.a)) {
                return false;
            }
            if ($$7 < $$2.getValue()) {
                $$2.setValue($$7 + 40L);
                return true;
            }
            een $$8 = een.a($$6);
            gu $$9 = $$6.di();
            gu.a $$10 = new gu.a();
            block0: for (gu $$11 : gu.a($$9, $$0, $$0, $$0)) {
                if ($$11.u() == $$9.u() && $$11.w() == $$9.w() || !$$5.a_($$11).b((cls)$$5, $$11, $$8).b() || $$5.a_($$10.a((hz)$$11, ha.a)).b((cls)$$5, $$11, $$8).b()) continue;
                for (ha $$12 : ha.c.a) {
                    $$10.a((hz)$$11, $$12);
                    if (!$$5.a_($$10).i() || !$$5.a_($$10.c(ha.a)).a(cpo.G)) continue;
                    $$52.a(new bhu($$11));
                    $$4.a(new bpe(new bhu($$11), $$1, 0));
                    break block0;
                }
            }
            $$2.setValue($$7 + 40L);
            return true;
        }));
    }
}

