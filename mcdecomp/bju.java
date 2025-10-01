/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Function;

public class bju {
    public static bhs<bgi> a(bpb<gu> $$0, float $$1, int $$2, boolean $$3) {
        return bju.a($$0, $$1, $$2, $$3, eei::c);
    }

    public static bjb<bgi> b(bpb<? extends bfj> $$0, float $$1, int $$2, boolean $$3) {
        return bju.a($$0, $$1, $$2, $$3, bfj::dg);
    }

    private static <T> bjb<bgi> a(bpb<T> $$0, float $$1, int $$2, boolean $$3, Function<T, eei> $$4) {
        return bld.a($$52 -> $$52.group($$52.a(bpb.m), $$52.b($$0)).apply((Applicative)$$52, ($$5, $$6) -> ($$7, $$8, $$9) -> {
            eei $$14;
            eei $$13;
            eei $$12;
            Optional $$10 = $$52.a($$5);
            if ($$10.isPresent() && !$$3) {
                return false;
            }
            eei $$11 = $$8.dg();
            if (!$$11.a((ho)($$12 = (eei)$$4.apply($$52.b($$6))), (double)$$2)) {
                return false;
            }
            if ($$10.isPresent() && ((bpe)$$10.get()).b() == $$1 && ($$13 = ((bpe)$$10.get()).a().a().d($$11)).b($$14 = $$12.d($$11)) < 0.0) {
                return false;
            }
            for (int $$15 = 0; $$15 < 10; ++$$15) {
                eei $$16 = bqt.b($$8, 16, 7, $$12);
                if ($$16 == null) continue;
                $$5.a(new bpe($$16, $$1, 0));
                break;
            }
            return true;
        }));
    }
}

