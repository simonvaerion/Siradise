/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dke
extends dkd {
    public dke(Codec<dmz> $$0) {
        super($$0);
    }

    @Override
    protected boolean a(cmn $$0, apf $$1, gu $$2, dcb $$3) {
        int $$4 = $$1.a(3) + 3;
        int $$5 = $$1.a(3) + 3;
        int $$6 = $$1.a(3) + 3;
        int $$7 = $$1.a(3) + 1;
        gu.a $$8 = $$2.j();
        for (int $$9 = 0; $$9 <= $$5; ++$$9) {
            for (int $$10 = 0; $$10 <= $$4; ++$$10) {
                for (int $$11 = 0; $$11 <= $$6; ++$$11) {
                    $$8.d($$9 + $$2.u(), $$10 + $$2.v(), $$11 + $$2.w());
                    $$8.c(ha.a, $$7);
                    if (($$9 != 0 && $$9 != $$5 || $$10 != 0 && $$10 != $$4) && ($$11 != 0 && $$11 != $$6 || $$10 != 0 && $$10 != $$4) && ($$9 != 0 && $$9 != $$5 || $$11 != 0 && $$11 != $$6) && ($$9 == 0 || $$9 == $$5 || $$10 == 0 || $$10 == $$4 || $$11 == 0 || $$11 == $$6) && !($$1.i() < 0.1f) && this.b($$0, $$1, $$8, $$3)) continue;
                }
            }
        }
        return true;
    }
}

