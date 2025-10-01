/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class bii {
    public static bhs<byb> a(float $$0, int $$1) {
        return bld.a($$22 -> $$22.group($$22.c(bpb.m)).apply((Applicative)$$22, $$2 -> ($$3, $$4, $$5) -> {
            if ($$3.b($$4.di())) {
                return false;
            }
            bqz $$6 = $$3.w();
            int $$7 = $$6.a(hx.a($$4.di()));
            eei $$8 = null;
            for (int $$9 = 0; $$9 < 5; ++$$9) {
                eei $$10 = bqt.a((bgi)$$4, 15, 7, $$1 -> -$$6.a(hx.a($$1)));
                if ($$10 == null) continue;
                int $$11 = $$6.a(hx.a(gu.a($$10)));
                if ($$11 < $$7) {
                    $$8 = $$10;
                    break;
                }
                if ($$11 != $$7) continue;
                $$8 = $$10;
            }
            if ($$8 != null) {
                $$2.a(new bpe($$8, $$0, $$1));
            }
            return true;
        }));
    }
}

