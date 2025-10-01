/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  org.apache.commons.lang3.mutable.MutableLong
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.List;
import org.apache.commons.lang3.mutable.MutableLong;

public class bkj {
    public static bhs<byb> a(bpb<List<hd>> $$0, float $$1, int $$2, int $$3, bpb<hd> $$4) {
        MutableLong $$5 = new MutableLong(0L);
        return bld.a($$62 -> $$62.group($$62.a(bpb.m), $$62.b($$0), $$62.b($$4)).apply((Applicative)$$62, ($$5, $$6, $$7) -> ($$8, $$9, $$10) -> {
            List $$11 = (List)$$62.b($$6);
            hd $$12 = (hd)$$62.b($$7);
            if ($$11.isEmpty()) {
                return false;
            }
            hd $$13 = (hd)$$11.get($$8.y_().a($$11.size()));
            if ($$13 == null || $$8.ac() != $$13.a() || !$$12.b().a($$9.dg(), (double)$$3)) {
                return false;
            }
            if ($$10 > $$5.getValue()) {
                $$5.a(new bpe($$13.b(), $$1, $$2));
                $$5.setValue($$10 + 100L);
            }
            return true;
        }));
    }
}

