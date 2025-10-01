/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;

public class bku {
    private static final int a = 10;
    private static final int b = 7;

    public static bjb<bgi> a(float $$0) {
        return bku.a($$0, 10, 7);
    }

    public static bjb<bgi> a(float $$0, int $$1, int $$2) {
        return bld.a($$32 -> $$32.group($$32.c(bpb.m)).apply((Applicative)$$32, $$3 -> ($$4, $$5, $$6) -> {
            eei $$122;
            gu $$7 = $$5.di();
            if ($$4.b($$7)) {
                eei $$8 = bqt.a($$5, $$1, $$2);
            } else {
                hx $$9 = hx.a($$7);
                hx $$10 = bht.a($$4, $$9, 2);
                if ($$10 != $$9) {
                    eei $$11 = bqq.a($$5, $$1, $$2, eei.c($$10.q()), 1.5707963705062866);
                } else {
                    $$122 = bqt.a($$5, $$1, $$2);
                }
            }
            $$3.a(Optional.ofNullable($$122).map($$1 -> new bpe((eei)$$1, $$0, 0)));
            return true;
        }));
    }
}

