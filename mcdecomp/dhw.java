/*
 * Decompiled with CFR 0.152.
 */
public class dhw
implements clz {
    private int a;

    @Override
    public int a(aif $$0, boolean $$1, boolean $$2) {
        if (!$$1) {
            return 0;
        }
        if (!$$0.X().b(cmi.A)) {
            return 0;
        }
        apf $$3 = $$0.z;
        --this.a;
        if (this.a > 0) {
            return 0;
        }
        this.a += (60 + $$3.a(60)) * 20;
        if ($$0.v_() < 5 && $$0.x_().g()) {
            return 0;
        }
        int $$4 = 0;
        for (aig $$5 : $$0.v()) {
            dxe $$13;
            dcb $$12;
            gu $$11;
            bdv $$7;
            if ($$5.G_()) continue;
            gu $$6 = $$5.di();
            if ($$0.x_().g() && ($$6.v() < $$0.t_() || !$$0.g($$6)) || !($$7 = $$0.d_($$6)).a($$3.i() * 3.0f)) continue;
            amn $$8 = $$5.D();
            int $$9 = apa.a($$8.a(amr.i.b(amr.n)), 1, Integer.MAX_VALUE);
            int $$10 = 24000;
            if ($$3.a($$9) < 72000 || !cmx.a($$0, $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21)), $$12 = $$0.a_($$11), $$13 = $$0.b_($$11), bfn.au)) continue;
            bgt $$14 = null;
            int $$15 = 1 + $$3.a($$7.a().a() + 1);
            for (int $$16 = 0; $$16 < $$15; ++$$16) {
                bwe $$17 = bfn.au.a($$0);
                if ($$17 == null) continue;
                $$17.a($$11, 0.0f, 0.0f);
                $$14 = $$17.a($$0, $$7, bgd.a, $$14, null);
                $$0.a_($$17);
                ++$$4;
            }
        }
        return $$4;
    }
}

