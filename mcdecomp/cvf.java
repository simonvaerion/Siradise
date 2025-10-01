/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class cvf
extends cpn
implements cpt {
    private static final float a = 0.083333336f;
    private static final float b = 0.9f;
    private static final float c = 1.5f;
    private static final float d = 2.5f;
    private static final efb e = eey.a(0.0, 0.0, 0.0, 1.0, 0.9f, 1.0);
    private static final double f = 4.0;
    private static final double g = 7.0;

    public cvf(dca.d $$0) {
        super($$0);
    }

    @Override
    public boolean a(dcb $$0, dcb $$1, ha $$2) {
        if ($$1.a(this)) {
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public efb f(dcb $$0, cls $$1, gu $$2) {
        return eey.a();
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
        if (!($$3 instanceof bfz) || $$3.dj().a(this)) {
            $$3.a($$0, new eei(0.9f, 1.5, 0.9f));
            if ($$1.B) {
                boolean $$5;
                apf $$4 = $$1.y_();
                boolean bl2 = $$5 = $$3.ab != $$3.dn() || $$3.ad != $$3.dt();
                if ($$5 && $$4.h()) {
                    $$1.a(iv.aE, $$3.dn(), (double)($$2.v() + 1), $$3.dt(), (double)(apa.b($$4, -1.0f, 1.0f) * 0.083333336f), (double)0.05f, apa.b($$4, -1.0f, 1.0f) * 0.083333336f);
                }
            }
        }
        $$3.o(true);
        if (!$$1.B) {
            if ($$3.bL() && ($$1.X().b(cmi.c) || $$3 instanceof byo) && $$3.a($$1, $$2)) {
                $$1.b($$2, false);
            }
            $$3.a_(false);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(cmm $$0, dcb $$1, gu $$2, bfj $$3, float $$4) {
        void $$6;
        if ((double)$$4 < 4.0 || !($$3 instanceof bfz)) {
            return;
        }
        bfz $$5 = (bfz)$$3;
        bfz.a $$7 = $$6.eC();
        amg $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
        $$3.a($$8, 1.0f, 1.0f);
    }

    @Override
    public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
        ees $$4;
        bfj $$5;
        if ($$3 instanceof ees && ($$5 = ($$4 = (ees)$$3).c()) != null) {
            if ($$5.aa > 2.5f) {
                return e;
            }
            boolean $$6 = $$5 instanceof bvg;
            if ($$6 || cvf.a($$5) && $$3.a(eey.b(), $$2, false) && !$$3.b()) {
                return super.c($$0, $$1, $$2, $$3);
            }
        }
        return eey.a();
    }

    @Override
    public efb b(dcb $$0, cls $$1, gu $$2, een $$3) {
        return eey.a();
    }

    public static boolean a(bfj $$0) {
        if ($$0.ae().a(amz.f)) {
            return true;
        }
        if ($$0 instanceof bfz) {
            return ((bfz)$$0).c(bfo.c).a(cgc.oN);
        }
        return false;
    }

    @Override
    public cfz c(cmn $$0, gu $$1, dcb $$2) {
        $$0.a($$1, cpo.a.n(), 11);
        if (!$$0.r_()) {
            $$0.c(2001, $$1, cpn.i($$2));
        }
        return new cfz(cgc.pN);
    }

    @Override
    public Optional<amg> am_() {
        return Optional.of(amh.cF);
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        return true;
    }
}

