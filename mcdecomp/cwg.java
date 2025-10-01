/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  javax.annotation.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class cwg
extends cpa
implements cwo {
    public static final int b = 30;
    public static final int c = 10;
    public static final dcz<ddi> d = dcr.bo;
    public static final ddb e = dcr.aT;
    public static final dcs f = dcr.C;
    protected static final efb g = cpn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
    private static final float[] a = ac.a(new float[16], (T $$0) -> {
        int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};
        for (int $$2 = 0; $$2 < 16; ++$$2) {
            $$0[$$2] = cuu.b($$1[$$2]);
        }
    });

    public cwg(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)((dcb)this.C.b()).a(d, ddi.a)).a(e, 0)).a(f, false));
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        gu $$1 = $$0.a();
        dxe $$2 = $$0.q().b_($$1);
        return (dcb)this.n().a(f, $$2.a() == dxf.c);
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(f).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if (cwg.h($$0) != ddi.b) {
            if (cwg.h($$0) == ddi.c) {
                $$1.a($$2, (dcb)$$0.a(d, ddi.a), 3);
                if (!$$0.c(f).booleanValue()) {
                    $$1.a(null, $$2, amh.uu, ami.e, 1.0f, $$1.z.i() * 0.2f + 0.8f);
                }
            }
            return;
        }
        cwg.a((cmm)$$1, $$2, $$0);
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, bfj $$3) {
        czn $$4;
        if (!$$0.r_() && cwg.n($$2) && $$3.ae() != bfn.bi && ($$4 = $$0.c_($$1)) instanceof das) {
            das $$5 = (das)$$4;
            if ($$0 instanceof aif) {
                aif $$6 = (aif)$$0;
                if ($$5.gc().a($$6, $$1, dgl.Q, dgl.a.a($$2))) {
                    $$5.g().b($$6, dgl.Q, dgl.a.a($$3), $$3.dg());
                }
            }
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$1.r_() || $$0.a($$3.b())) {
            return;
        }
        if ($$0.c(e) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, (dcb)$$0.a(e, 0), 18);
        }
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$0.a($$3.b())) {
            return;
        }
        if (cwg.h($$0) == ddi.b) {
            cwg.b($$1, $$2, $$0);
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(f).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    private static void b(cmm $$0, gu $$1, dcb $$2) {
        cpn $$3 = $$2.b();
        $$0.a($$1, $$3);
        $$0.a($$1.d(), $$3);
    }

    @Override
    @Nullable
    public czn a(gu $$0, dcb $$1) {
        return new das($$0, $$1);
    }

    @Override
    @Nullable
    public <T extends czn> czo<T> a(cmm $$02, dcb $$12, czp<T> $$22) {
        if (!$$02.B) {
            return cwg.a($$22, czp.I, (cmm $$0, gu $$1, dcb $$2, ? super E $$3) -> dgu.c.a($$0, $$3.gb(), $$3.gc()));
        }
        return null;
    }

    @Override
    public cvs b_(dcb $$0) {
        return cvs.c;
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return g;
    }

    @Override
    public boolean f_(dcb $$0) {
        return true;
    }

    @Override
    public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
        return $$0.c(e);
    }

    @Override
    public int b(dcb $$0, cls $$1, gu $$2, ha $$3) {
        if ($$3 == ha.b) {
            return $$0.b($$1, $$2, $$3);
        }
        return 0;
    }

    public static ddi h(dcb $$0) {
        return $$0.c(d);
    }

    public static boolean n(dcb $$0) {
        return cwg.h($$0) == ddi.a;
    }

    public static void a(cmm $$0, gu $$1, dcb $$2) {
        $$0.a($$1, (dcb)((dcb)$$2.a(d, ddi.c)).a(e, 0), 3);
        $$0.a($$1, $$2.b(), 10);
        cwg.b($$0, $$1, $$2);
    }

    @VisibleForTesting
    public int b() {
        return 30;
    }

    public void a(@Nullable bfj $$0, cmm $$1, gu $$2, dcb $$3, int $$4, int $$5) {
        $$1.a($$2, (dcb)((dcb)$$3.a(d, ddi.b)).a(e, $$4), 3);
        $$1.a($$2, $$3.b(), this.b());
        cwg.b($$1, $$2, $$3);
        cwg.a($$0, $$1, $$2, $$5);
        $$1.a($$0, dgl.M, $$2);
        if (!$$3.c(f).booleanValue()) {
            $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, amh.ut, ami.e, 1.0f, $$1.z.i() * 0.2f + 0.8f);
        }
    }

    public static void a(@Nullable bfj $$0, cmm $$1, gu $$2, int $$3) {
        for (ha $$4 : ha.values()) {
            gu $$5 = $$2.a($$4);
            dcb $$6 = $$1.a_($$5);
            if (!$$6.a(amw.bM)) continue;
            $$1.a(dgu.b($$3), $$5, dgl.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, amh.I, ami.e, 1.0f, $$7);
        }
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
        if (cwg.h($$0) != ddi.b) {
            return;
        }
        ha $$4 = ha.b($$3);
        if ($$4 == ha.b || $$4 == ha.a) {
            return;
        }
        double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
        double $$6 = (double)$$2.v() + 0.25;
        double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
        double $$8 = (double)$$3.i() * 0.04;
        $$1.a(io.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(d, e, f);
    }

    @Override
    public boolean d_(dcb $$0) {
        return true;
    }

    @Override
    public int a(dcb $$0, cmm $$1, gu $$2) {
        czn $$3 = $$1.c_($$2);
        if ($$3 instanceof das) {
            das $$4 = (das)$$3;
            return cwg.h($$0) == ddi.b ? $$4.f() : 0;
        }
        return 0;
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        return false;
    }

    @Override
    public boolean g_(dcb $$0) {
        return true;
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, cfz $$3, boolean $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        if ($$4) {
            this.a($$1, $$2, $$3, bcz.a(5));
        }
    }
}

