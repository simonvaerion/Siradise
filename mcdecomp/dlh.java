/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dlh
extends dko<dmy> {
    public dlh(Codec<dmy> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dmy> $$0) {
        cng $$1 = $$0.b();
        gu $$2 = $$0.e();
        dcb $$3 = $$1.a_($$2.d());
        dmy $$4 = $$0.f();
        apf $$5 = $$0.d();
        if (!$$3.a(amw.aJ)) {
            return false;
        }
        int $$6 = $$2.v();
        if ($$6 < $$1.C_() + 1 || $$6 + 1 >= $$1.aj()) {
            return false;
        }
        int $$7 = 0;
        for (int $$8 = 0; $$8 < $$4.d * $$4.d; ++$$8) {
            gu $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
            dcb $$10 = $$4.b.a($$5, $$9);
            if (!$$1.t($$9) || $$9.v() <= $$1.C_() || !$$10.a($$1, $$9)) continue;
            $$1.a($$9, $$10, 2);
            ++$$7;
        }
        return $$7 > 0;
    }
}

