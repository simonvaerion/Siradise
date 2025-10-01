/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  org.apache.commons.lang3.mutable.MutableLong
 */
import com.mojang.datafixers.kinds.Applicative;
import org.apache.commons.lang3.mutable.MutableLong;

public class bki {
    public static bhs<bgi> a(bpb<hd> $$0, float $$1, int $$2, int $$3) {
        MutableLong $$4 = new MutableLong(0L);
        return bld.a($$52 -> $$52.group($$52.a(bpb.m), $$52.b($$0)).apply((Applicative)$$52, ($$5, $$6) -> ($$7, $$8, $$9) -> {
            hd $$10 = (hd)$$52.b($$6);
            if ($$7.ac() != $$10.a() || !$$10.b().a($$8.dg(), (double)$$3)) {
                return false;
            }
            if ($$9 <= $$4.getValue()) {
                return true;
            }
            $$5.a(new bpe($$10.b(), $$1, $$2));
            $$4.setValue($$9 + 80L);
            return true;
        }));
    }
}

