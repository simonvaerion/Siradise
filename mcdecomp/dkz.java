/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dkz
extends djr {
    public dkz(Codec<dmu> $$0) {
        super($$0);
    }

    @Override
    protected void a(cmn $$0, apf $$1, gu $$2, int $$3, gu.a $$4, dmu $$5) {
        for (int $$6 = $$3 - 3; $$6 <= $$3; ++$$6) {
            int $$7 = $$6 < $$3 ? $$5.d : $$5.d - 1;
            int $$8 = $$5.d - 2;
            for (int $$9 = -$$7; $$9 <= $$7; ++$$9) {
                for (int $$10 = -$$7; $$10 <= $$7; ++$$10) {
                    boolean $$16;
                    boolean $$11 = $$9 == -$$7;
                    boolean $$12 = $$9 == $$7;
                    boolean $$13 = $$10 == -$$7;
                    boolean $$14 = $$10 == $$7;
                    boolean $$15 = $$11 || $$12;
                    boolean bl2 = $$16 = $$13 || $$14;
                    if ($$6 < $$3 && $$15 == $$16) continue;
                    $$4.a($$2, $$9, $$6, $$10);
                    if ($$0.a_($$4).i($$0, $$4)) continue;
                    dcb $$17 = $$5.b.a($$1, $$2);
                    if ($$17.b(cth.d) && $$17.b(cth.b) && $$17.b(cth.a) && $$17.b(cth.c) && $$17.b(cth.e)) {
                        $$17 = (dcb)((dcb)((dcb)((dcb)((dcb)$$17.a(cth.e, $$6 >= $$3 - 1)).a(cth.d, $$9 < -$$8)).a(cth.b, $$9 > $$8)).a(cth.a, $$10 < -$$8)).a(cth.c, $$10 > $$8);
                    }
                    this.a($$0, $$4, $$17);
                }
            }
        }
    }

    @Override
    protected int a(int $$0, int $$1, int $$2, int $$3) {
        int $$4 = 0;
        if ($$3 < $$1 && $$3 >= $$1 - 3) {
            $$4 = $$2;
        } else if ($$3 == $$1) {
            $$4 = $$2;
        }
        return $$4;
    }
}

