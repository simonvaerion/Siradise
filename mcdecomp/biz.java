/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import javax.annotation.Nullable;

public class biz {
    public static bjb<bfz> a(float $$0) {
        return bld.a($$12 -> $$12.group($$12.c(bpb.m)).apply((Applicative)$$12, $$1 -> ($$22, $$3, $$4) -> {
            if ($$22.g($$3.di())) {
                return false;
            }
            Optional<eei> $$5 = Optional.ofNullable(biz.a($$22, $$3));
            $$5.ifPresent($$2 -> $$1.a(new bpe((eei)$$2, $$0, 0)));
            return true;
        }));
    }

    @Nullable
    private static eei a(aif $$0, bfz $$1) {
        apf $$2 = $$1.ec();
        gu $$3 = $$1.di();
        for (int $$4 = 0; $$4 < 10; ++$$4) {
            gu $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
            if (!biz.a($$0, $$1, $$5)) continue;
            return eei.c($$5);
        }
        return null;
    }

    public static boolean a(aif $$0, bfz $$1, gu $$2) {
        return $$0.g($$2) && (double)$$0.a(dhk.a.e, $$2).v() <= $$1.dp();
    }
}

