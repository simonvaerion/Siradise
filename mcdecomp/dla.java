/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dla
extends dko<dmz> {
    public dla(Codec<dmz> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dmz> $$0) {
        gu $$1 = $$0.e();
        apf $$2 = $$0.d();
        cng $$3 = $$0.b();
        while ($$3.t($$1) && $$1.v() > $$3.C_() + 2) {
            $$1 = $$1.d();
        }
        if (!$$3.a_($$1).a(cpo.dP)) {
            return false;
        }
        $$1 = $$1.b($$2.a(4));
        int $$4 = $$2.a(4) + 7;
        int $$5 = $$4 / 4 + $$2.a(2);
        if ($$5 > 1 && $$2.a(60) == 0) {
            $$1 = $$1.b(10 + $$2.a(30));
        }
        for (int $$6 = 0; $$6 < $$4; ++$$6) {
            float $$7 = (1.0f - (float)$$6 / (float)$$4) * (float)$$5;
            int $$8 = apa.f($$7);
            for (int $$9 = -$$8; $$9 <= $$8; ++$$9) {
                float $$10 = (float)apa.a($$9) - 0.25f;
                for (int $$11 = -$$8; $$11 <= $$8; ++$$11) {
                    float $$12 = (float)apa.a($$11) - 0.25f;
                    if (($$9 != 0 || $$11 != 0) && $$10 * $$10 + $$12 * $$12 > $$7 * $$7 || ($$9 == -$$8 || $$9 == $$8 || $$11 == -$$8 || $$11 == $$8) && $$2.i() > 0.75f) continue;
                    dcb $$13 = $$3.a_($$1.b($$9, $$6, $$11));
                    if ($$13.i() || dla.b($$13) || $$13.a(cpo.dP) || $$13.a(cpo.dO)) {
                        this.a($$3, $$1.b($$9, $$6, $$11), cpo.iC.n());
                    }
                    if ($$6 == 0 || $$8 <= 1 || !($$13 = $$3.a_($$1.b($$9, -$$6, $$11))).i() && !dla.b($$13) && !$$13.a(cpo.dP) && !$$13.a(cpo.dO)) continue;
                    this.a($$3, $$1.b($$9, -$$6, $$11), cpo.iC.n());
                }
            }
        }
        int $$14 = $$5 - 1;
        if ($$14 < 0) {
            $$14 = 0;
        } else if ($$14 > 1) {
            $$14 = 1;
        }
        for (int $$15 = -$$14; $$15 <= $$14; ++$$15) {
            for (int $$16 = -$$14; $$16 <= $$14; ++$$16) {
                dcb $$19;
                gu $$17 = $$1.b($$15, -1, $$16);
                int $$18 = 50;
                if (Math.abs($$15) == 1 && Math.abs($$16) == 1) {
                    $$18 = $$2.a(5);
                }
                while ($$17.v() > 50 && (($$19 = $$3.a_($$17)).i() || dla.b($$19) || $$19.a(cpo.dP) || $$19.a(cpo.dO) || $$19.a(cpo.iC))) {
                    this.a($$3, $$17, cpo.iC.n());
                    $$17 = $$17.d();
                    if (--$$18 > 0) continue;
                    $$17 = $$17.c($$2.a(5) + 1);
                    $$18 = $$2.a(5);
                }
            }
        }
        return true;
    }
}

