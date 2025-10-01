/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  javax.annotation.Nullable
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bji {
    private static final int a = 10;
    private static final int b = 7;
    private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

    public static bjb<bgi> a(float $$0) {
        return bji.a($$0, true);
    }

    public static bjb<bgi> a(float $$02, boolean $$1) {
        return bji.a($$02, $$0 -> bqt.a($$0, 10, 7), $$1 ? $$0 -> true : $$0 -> !$$0.aY());
    }

    public static bhs<bgi> a(float $$02, int $$1, int $$22) {
        return bji.a($$02, $$2 -> bqt.a($$2, $$1, $$22), (bgi $$0) -> true);
    }

    public static bhs<bgi> b(float $$02) {
        return bji.a($$02, $$0 -> bji.a($$0, 10, 7), (bgi $$0) -> true);
    }

    public static bhs<bgi> c(float $$0) {
        return bji.a($$0, bji::a, bfj::aY);
    }

    private static bjb<bgi> a(float $$0, Function<bgi, eei> $$1, Predicate<bgi> $$2) {
        return bld.a((bld.b<E> $$32) -> $$32.group($$32.c(bpb.m)).apply((Applicative)$$32, $$3 -> ($$4, $$5, $$6) -> {
            if (!$$2.test((bgi)$$5)) {
                return false;
            }
            Optional<eei> $$7 = Optional.ofNullable((eei)$$1.apply((bgi)$$5));
            $$3.a($$7.map($$1 -> new bpe((eei)$$1, $$0, 0)));
            return true;
        }));
    }

    @Nullable
    private static eei a(bgi $$0) {
        eei $$1 = null;
        eei $$2 = null;
        for (int[] $$3 : c) {
            $$2 = $$1 == null ? bht.a($$0, $$3[0], $$3[1]) : $$0.dg().e($$0.dg().a($$1).d().d($$3[0], $$3[1], $$3[0]));
            if ($$2 == null || $$0.dI().b_(gu.a($$2)).c()) {
                return $$1;
            }
            $$1 = $$2;
        }
        return $$2;
    }

    @Nullable
    private static eei a(bgi $$0, int $$1, int $$2) {
        eei $$3 = $$0.f(0.0f);
        return bqo.a($$0, $$1, $$2, -2, $$3.c, $$3.e, 1.5707963705062866);
    }
}

