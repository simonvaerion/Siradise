/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class djv
extends dko<dml> {
    public djv(Codec<dml> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dml> $$0) {
        dcb $$5;
        gu $$1 = $$0.e();
        cng $$2 = $$0.b();
        apf $$3 = $$0.d();
        dml $$4 = $$0.f();
        while ($$1.v() > $$2.C_() + 3 && ($$2.t($$1.d()) || !djv.b($$5 = $$2.a_($$1.d())) && !djv.a($$5))) {
            $$1 = $$1.d();
        }
        if ($$1.v() <= $$2.C_() + 3) {
            return false;
        }
        for (int $$6 = 0; $$6 < 3; ++$$6) {
            int $$7 = $$3.a(2);
            int $$8 = $$3.a(2);
            int $$9 = $$3.a(2);
            float $$10 = (float)($$7 + $$8 + $$9) * 0.333f + 0.5f;
            for (gu $$11 : gu.a($$1.b(-$$7, -$$8, -$$9), $$1.b($$7, $$8, $$9))) {
                if (!($$11.j($$1) <= (double)($$10 * $$10))) continue;
                $$2.a($$11, $$4.b, 3);
            }
            $$1 = $$1.b(-1 + $$3.a(2), -$$3.a(2), -1 + $$3.a(2));
        }
        return true;
    }
}

