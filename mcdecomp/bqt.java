/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class bqt {
    @Nullable
    public static eei a(bgi $$0, int $$1, int $$2) {
        return bqt.a($$0, $$1, $$2, $$0::h);
    }

    @Nullable
    public static eei a(bgi $$0, int $$1, int $$2, ToDoubleFunction<gu> $$3) {
        boolean $$4 = bqr.a($$0, $$1);
        return bqu.a(() -> {
            gu $$4 = bqu.a($$0.ec(), $$1, $$2);
            gu $$5 = bqt.a($$0, $$1, $$4, $$4);
            if ($$5 == null) {
                return null;
            }
            return bqt.a($$0, $$5);
        }, $$3);
    }

    @Nullable
    public static eei a(bgi $$0, int $$1, int $$2, eei $$3) {
        eei $$4 = $$3.a($$0.dn(), $$0.dp(), $$0.dt());
        boolean $$5 = bqr.a($$0, $$1);
        return bqt.a($$0, $$1, $$2, $$4, $$5);
    }

    @Nullable
    public static eei b(bgi $$0, int $$1, int $$2, eei $$3) {
        eei $$4 = $$0.dg().d($$3);
        boolean $$5 = bqr.a($$0, $$1);
        return bqt.a($$0, $$1, $$2, $$4, $$5);
    }

    @Nullable
    private static eei a(bgi $$0, int $$1, int $$2, eei $$3, boolean $$4) {
        return bqu.a($$0, () -> {
            gu $$5 = bqu.a($$0.ec(), $$1, $$2, 0, $$3.c, $$3.e, 1.5707963705062866);
            if ($$5 == null) {
                return null;
            }
            gu $$6 = bqt.a($$0, $$1, $$4, $$5);
            if ($$6 == null) {
                return null;
            }
            return bqt.a($$0, $$6);
        });
    }

    @Nullable
    public static gu a(bgi $$0, gu $$12) {
        if (bqr.a($$0, $$12 = bqu.a($$12, $$0.dI().aj(), $$1 -> bqr.c($$0, $$1))) || bqr.b($$0, $$12)) {
            return null;
        }
        return $$12;
    }

    @Nullable
    public static gu a(bgi $$0, int $$1, boolean $$2, gu $$3) {
        gu $$4 = bqu.a($$0, $$1, $$0.ec(), $$3);
        if (bqr.a($$4, $$0) || bqr.a($$2, $$0, $$4) || bqr.a($$0.J(), $$4)) {
            return null;
        }
        return $$4;
    }
}

