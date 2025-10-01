/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cye
extends cpn {
    public static final int a = 2;
    public static final int b = 1;
    public static final int c = 4;
    private static final efb f = cpn.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
    private static final efb g = cpn.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
    public static final ddb d = dcr.aE;
    public static final ddb e = dcr.aD;

    public cye(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)this.C.b()).a(d, 0)).a(e, 1));
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, bfj $$3) {
        if (!$$3.bQ()) {
            this.a($$0, $$2, $$1, $$3, 100);
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(cmm $$0, dcb $$1, gu $$2, bfj $$3, float $$4) {
        if (!($$3 instanceof bwv)) {
            this.a($$0, $$1, $$2, $$3, 3);
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    private void a(cmm $$0, dcb $$1, gu $$2, bfj $$3, int $$4) {
        if (!this.a($$0, $$3)) {
            return;
        }
        if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(cpo.mf)) {
            this.a($$0, $$2, $$1);
        }
    }

    private void a(cmm $$0, gu $$1, dcb $$2) {
        $$0.a(null, $$1, amh.yf, ami.e, 0.7f, 0.9f + $$0.z.i() * 0.2f);
        int $$3 = $$2.c(e);
        if ($$3 <= 1) {
            $$0.b($$1, false);
        } else {
            $$0.a($$1, (dcb)$$2.a(e, $$3 - 1), 2);
            $$0.a(dgl.f, $$1, dgl.a.a($$2));
            $$0.c(2001, $$1, cpn.i($$2));
        }
    }

    @Override
    public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if (this.a($$1) && cye.a($$1, $$2)) {
            int $$4 = $$0.c(d);
            if ($$4 < 2) {
                $$1.a(null, $$2, amh.yg, ami.e, 0.7f, 0.9f + $$3.i() * 0.2f);
                $$1.a($$2, (dcb)$$0.a(d, $$4 + 1), 2);
            } else {
                $$1.a(null, $$2, amh.yh, ami.e, 0.7f, 0.9f + $$3.i() * 0.2f);
                $$1.a($$2, false);
                for (int $$5 = 0; $$5 < $$0.c(e); ++$$5) {
                    $$1.c(2001, $$2, cpn.i($$0));
                    bsm $$6 = bfn.bd.a($$1);
                    if ($$6 == null) continue;
                    $$6.c_(-24000);
                    $$6.i($$2);
                    $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, $$2.v(), (double)$$2.w() + 0.3, 0.0f, 0.0f);
                    $$1.b($$6);
                }
            }
        }
    }

    public static boolean a(cls $$0, gu $$1) {
        return cye.b($$0, $$1.d());
    }

    public static boolean b(cls $$0, gu $$1) {
        return $$0.a_($$1).a(amw.H);
    }

    @Override
    public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if (cye.a($$1, $$2) && !$$1.B) {
            $$1.c(2005, $$2, 0);
        }
    }

    private boolean a(cmm $$0) {
        float $$1 = $$0.f(1.0f);
        if ((double)$$1 < 0.69 && (double)$$1 > 0.65) {
            return true;
        }
        return $$0.z.a(500) == 0;
    }

    @Override
    public void a(cmm $$0, byo $$1, gu $$2, dcb $$3, @Nullable czn $$4, cfz $$5) {
        super.a($$0, $$1, $$2, $$3, $$4, $$5);
        this.a($$0, $$2, $$3);
    }

    @Override
    public boolean a(dcb $$0, cih $$1) {
        if (!$$1.h() && $$1.n().a(this.k()) && $$0.c(e) < 4) {
            return true;
        }
        return super.a($$0, $$1);
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        dcb $$1 = $$0.q().a_($$0.a());
        if ($$1.a(this)) {
            return (dcb)$$1.a(e, Math.min(4, $$1.c(e) + 1));
        }
        return super.a($$0);
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        if ($$0.c(e) > 1) {
            return g;
        }
        return f;
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(d, e);
    }

    private boolean a(cmm $$0, bfj $$1) {
        if ($$1 instanceof bsm || $$1 instanceof brg) {
            return false;
        }
        if ($$1 instanceof bfz) {
            return $$1 instanceof byo || $$0.X().b(cmi.c);
        }
        return false;
    }
}

