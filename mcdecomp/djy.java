/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class djy
extends dko<dmz> {
    public djy(Codec<dmz> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dmz> $$0) {
        gu $$1 = $$0.e();
        cng $$2 = $$0.b();
        apf $$3 = $$0.d();
        if ($$1.v() > $$2.t_() - 1) {
            return false;
        }
        if (!$$2.a_($$1).a(cpo.G) && !$$2.a_($$1.d()).a(cpo.G)) {
            return false;
        }
        boolean $$4 = false;
        for (ha $$5 : ha.values()) {
            if ($$5 == ha.a || !$$2.a_($$1.a($$5)).a(cpo.iC)) continue;
            $$4 = true;
            break;
        }
        if (!$$4) {
            return false;
        }
        $$2.a($$1, cpo.mW.n(), 2);
        block1: for (int $$6 = 0; $$6 < 200; ++$$6) {
            gu $$9;
            dcb $$10;
            int $$7 = $$3.a(5) - $$3.a(6);
            int $$8 = 3;
            if ($$7 < 2) {
                $$8 += $$7 / 2;
            }
            if ($$8 < 1 || !($$10 = $$2.a_($$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8)))).i() && !$$10.a(cpo.G) && !$$10.a(cpo.iC) && !$$10.a(cpo.dO)) continue;
            for (ha $$11 : ha.values()) {
                dcb $$12 = $$2.a_($$9.a($$11));
                if (!$$12.a(cpo.mW)) continue;
                $$2.a($$9, cpo.mW.n(), 2);
                continue block1;
            }
        }
        return true;
    }
}

