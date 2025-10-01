/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dkw
extends djr {
    public dkw(Codec<dmu> $$0) {
        super($$0);
    }

    @Override
    protected void a(cmn $$0, apf $$1, gu $$2, int $$3, gu.a $$4, dmu $$5) {
        int $$6 = $$5.d;
        for (int $$7 = -$$6; $$7 <= $$6; ++$$7) {
            for (int $$8 = -$$6; $$8 <= $$6; ++$$8) {
                boolean $$14;
                boolean $$9 = $$7 == -$$6;
                boolean $$10 = $$7 == $$6;
                boolean $$11 = $$8 == -$$6;
                boolean $$12 = $$8 == $$6;
                boolean $$13 = $$9 || $$10;
                boolean bl2 = $$14 = $$11 || $$12;
                if ($$13 && $$14) continue;
                $$4.a($$2, $$7, $$3, $$8);
                if ($$0.a_($$4).i($$0, $$4)) continue;
                boolean $$15 = $$9 || $$14 && $$7 == 1 - $$6;
                boolean $$16 = $$10 || $$14 && $$7 == $$6 - 1;
                boolean $$17 = $$11 || $$13 && $$8 == 1 - $$6;
                boolean $$18 = $$12 || $$13 && $$8 == $$6 - 1;
                dcb $$19 = $$5.b.a($$1, $$2);
                if ($$19.b(cth.d) && $$19.b(cth.b) && $$19.b(cth.a) && $$19.b(cth.c)) {
                    $$19 = (dcb)((dcb)((dcb)((dcb)$$19.a(cth.d, $$15)).a(cth.b, $$16)).a(cth.a, $$17)).a(cth.c, $$18);
                }
                this.a($$0, $$4, $$19);
            }
        }
    }

    @Override
    protected int a(int $$0, int $$1, int $$2, int $$3) {
        return $$3 <= 3 ? 0 : $$2;
    }
}

