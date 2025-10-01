/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cqf
extends cpn {
    private static final sw a = sw.c("container.cartography_table");

    protected cqf(dca.d $$0) {
        super($$0);
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        if ($$1.B) {
            return bdx.a;
        }
        $$3.a($$0.b($$1, $$2));
        $$3.a(amr.aw);
        return bdx.b;
    }

    @Override
    @Nullable
    public bea b(dcb $$0, cmm $$1, gu $$22) {
        return new bef(($$2, $$3, $$4) -> new cbl($$2, $$3, cbq.a($$1, $$22)), a);
    }
}

