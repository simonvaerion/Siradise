/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;

public class csv
extends cxe
implements cpp {
    public csv(dca.d $$0) {
        super($$0);
    }

    @Override
    public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
        return $$0.a_($$1.c()).i();
    }

    @Override
    public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
        return true;
    }

    @Override
    public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
        gu $$4 = $$2.c();
        dcb $$5 = cpo.bt.n();
        Optional<he.c<dre>> $$6 = $$0.B_().d(jc.ay).b(pd.n);
        block0: for (int $$7 = 0; $$7 < 128; ++$$7) {
            he $$13;
            gu $$8 = $$4;
            for (int $$9 = 0; $$9 < $$7 / 16; ++$$9) {
                if (!$$0.a_(($$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1)).d()).a(this) || $$0.a_($$8).r($$0, $$8)) continue block0;
            }
            dcb $$10 = $$0.a_($$8);
            if ($$10.a($$5.b()) && $$1.a(10) == 0) {
                ((cpp)((Object)$$5.b())).a($$0, $$1, $$8, $$10);
            }
            if (!$$10.i()) continue;
            if ($$1.a(8) == 0) {
                List<dkb<?, ?>> $$11 = $$0.s($$8).a().d().a();
                if ($$11.isEmpty()) continue;
                he<dre> $$12 = ((dnf)$$11.get(0).c()).d();
            } else {
                if (!$$6.isPresent()) continue;
                $$13 = $$6.get();
            }
            ((dre)$$13.a()).a($$0, $$0.k().g(), $$1, $$8);
        }
    }
}

