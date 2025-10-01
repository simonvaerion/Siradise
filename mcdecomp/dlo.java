/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 */
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dlo
extends dko<dnh> {
    public dlo(Codec<dnh> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dnh> $$0) {
        dnh $$1 = $$0.f();
        cng $$2 = $$0.b();
        apf $$3 = $$0.d();
        cpn $$4 = $$1.b.b();
        gu $$5 = dlo.a($$2, $$0.e().j().a(ha.a.b, $$2.C_() + 1, $$2.aj() - 1), $$4);
        if ($$5 == null) {
            return false;
        }
        int $$6 = $$1.a().a($$3);
        int $$7 = $$1.a().a($$3);
        int $$8 = $$1.a().a($$3);
        int $$9 = Math.max($$6, Math.max($$7, $$8));
        boolean $$10 = false;
        for (gu $$11 : gu.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) break;
            dcb $$12 = $$2.a_($$11);
            if (!$$12.a($$4)) continue;
            this.a($$2, $$11, $$1.c);
            $$10 = true;
        }
        return $$10;
    }

    @Nullable
    private static gu a(cmn $$0, gu.a $$1, cpn $$2) {
        while ($$1.v() > $$0.C_() + 1) {
            dcb $$3 = $$0.a_($$1);
            if ($$3.a($$2)) {
                return $$1;
            }
            $$1.c(ha.a);
        }
        return null;
    }
}

