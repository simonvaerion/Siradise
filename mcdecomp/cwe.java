/*
 * Decompiled with CFR 0.152.
 */
public class cwe
extends crt
implements cwd {
    public cwe(dca.d $$0) {
        super($$0, bcz.a(1));
    }

    @Override
    public int a(cwi.a $$0, cmn $$1, gu $$2, apf $$3, cwi $$4, boolean $$5) {
        int $$6 = $$0.b();
        if ($$6 == 0 || $$3.a($$4.f()) != 0) {
            return $$6;
        }
        gu $$7 = $$0.a();
        boolean $$8 = $$7.a($$2, (double)$$4.e());
        if ($$8 || !cwe.a($$1, $$7)) {
            if ($$3.a($$4.g()) != 0) {
                return $$6;
            }
            return $$6 - ($$8 ? 1 : cwe.a($$4, $$7, $$2, $$6));
        }
        int $$9 = $$4.d();
        if ($$3.a($$9) < $$6) {
            gu $$10 = $$7.c();
            dcb $$11 = this.a($$1, $$10, $$3, $$4.h());
            $$1.a($$10, $$11, 3);
            $$1.a(null, $$7, $$11.w().e(), ami.e, 1.0f, 1.0f);
        }
        return Math.max(0, $$6 - $$9);
    }

    private static int a(cwi $$0, gu $$1, gu $$2, int $$3) {
        int $$4 = $$0.e();
        float $$5 = apa.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
        int $$6 = apa.h(24 - $$4);
        float $$7 = Math.min(1.0f, $$5 / (float)$$6);
        return Math.max(1, (int)((float)$$3 * $$7 * 0.5f));
    }

    private dcb a(cmn $$0, gu $$1, apf $$2, boolean $$3) {
        dcb $$5;
        if ($$2.a(11) == 0) {
            dcb $$4 = (dcb)cpo.qI.n().a(cwh.c, $$3);
        } else {
            $$5 = cpo.qD.n();
        }
        if ($$5.b(dcr.C) && !$$0.b_($$1).c()) {
            return (dcb)$$5.a(dcr.C, true);
        }
        return $$5;
    }

    private static boolean a(cmn $$0, gu $$1) {
        dcb $$2 = $$0.a_($$1.c());
        if (!($$2.i() || $$2.a(cpo.G) && $$2.u().b(dxf.c))) {
            return false;
        }
        int $$3 = 0;
        for (gu $$4 : gu.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dcb $$5 = $$0.a_($$4);
            if ($$5.a(cpo.qD) || $$5.a(cpo.qI)) {
                ++$$3;
            }
            if ($$3 <= 2) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean c() {
        return false;
    }
}

