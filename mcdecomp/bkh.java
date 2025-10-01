/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  org.apache.commons.lang3.mutable.MutableLong
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableLong;

public class bkh {
    private static final int a = 180;
    private static final int b = 8;
    private static final int c = 6;

    public static bjb<bgi> a(bpb<hd> $$0, float $$1, int $$2) {
        MutableLong $$3 = new MutableLong(0L);
        return bld.a($$42 -> $$42.group($$42.a(bpb.m), $$42.b($$0)).apply((Applicative)$$42, ($$4, $$5) -> ($$6, $$7, $$8) -> {
            hd $$9 = (hd)$$42.b($$5);
            if ($$6.ac() != $$9.a() || !$$9.b().a($$7.dg(), (double)$$2)) {
                return false;
            }
            if ($$8 <= $$3.getValue()) {
                return true;
            }
            Optional<eei> $$10 = Optional.ofNullable(bqt.a($$7, 8, 6));
            $$4.a($$10.map($$1 -> new bpe((eei)$$1, $$1, 1)));
            $$3.setValue($$8 + 180L);
            return true;
        }));
    }
}

