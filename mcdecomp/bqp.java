/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class bqp {
    @Nullable
    public static eei a(bgi $$0, int $$1, int $$2, int $$3, eei $$4, double $$5) {
        eei $$6 = $$4.a($$0.dn(), $$0.dp(), $$0.dt());
        boolean $$7 = bqr.a($$0, $$1);
        return bqu.a($$0, () -> {
            gu $$7 = bqo.a($$0, $$1, $$2, $$3, $$4.c, $$4.e, $$5, $$7);
            if ($$7 == null || bqr.a($$0, $$7)) {
                return null;
            }
            return $$7;
        });
    }
}

