/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class dls
extends dko<dnj> {
    public dls(Codec<dnj> $$0) {
        super($$0);
    }

    @Override
    public boolean a(dkq<dnj> $$0) {
        gu $$2;
        cng $$1 = $$0.b();
        if (!this.a((cmn)$$1, $$2 = $$0.e())) {
            return false;
        }
        dnj $$3 = $$0.f();
        apf $$4 = $$0.d();
        cwi $$5 = cwi.b();
        int $$6 = $$3.f() + $$3.d();
        for (int $$7 = 0; $$7 < $$6; ++$$7) {
            for (int $$8 = 0; $$8 < $$3.a(); ++$$8) {
                $$5.a($$2, $$3.b());
            }
            boolean $$9 = $$7 < $$3.f();
            for (int $$10 = 0; $$10 < $$3.c(); ++$$10) {
                $$5.a($$1, $$2, $$4, $$9);
            }
            $$5.j();
        }
        gu $$11 = $$2.d();
        if ($$4.i() <= $$3.h() && $$1.a_($$11).r($$1, $$11)) {
            $$1.a($$2, cpo.qH.n(), 3);
        }
        int $$12 = $$3.g().a($$4);
        for (int $$13 = 0; $$13 < $$12; ++$$13) {
            gu $$14 = $$2.b($$4.a(5) - 2, 0, $$4.a(5) - 2);
            if (!$$1.a_($$14).i() || !$$1.a_($$14.d()).d($$1, $$14.d(), ha.b)) continue;
            $$1.a($$14, (dcb)cpo.qI.n().a(cwh.c, true), 3);
        }
        return true;
    }

    private boolean a(cmn $$0, gu $$12) {
        block5: {
            block4: {
                dcb $$2 = $$0.a_($$12);
                if ($$2.b() instanceof cwd) {
                    return true;
                }
                if ($$2.i()) break block4;
                if (!$$2.a(cpo.G) || !$$2.u().b()) break block5;
            }
            return ha.a().map($$12::a).anyMatch($$1 -> $$0.a_((gu)$$1).r($$0, (gu)$$1));
        }
        return false;
    }
}

