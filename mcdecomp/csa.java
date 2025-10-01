/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class csa
extends cog<dah>
implements cwo {
    public static final dcv b = ctg.aC;
    public static final dcs c = dcr.C;
    protected static final efb d = cpn.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
    private static final sw e = sw.c("container.enderchest");

    protected csa(dca.d $$0) {
        super($$0, () -> czp.d);
        this.k((dcb)((dcb)((dcb)this.C.b()).a(b, ha.c)).a(c, false));
    }

    @Override
    public crq.c<? extends czu> a(dcb $$0, cmm $$1, gu $$2, boolean $$3) {
        return crq.b::b;
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return d;
    }

    @Override
    public cvs b_(dcb $$0) {
        return cvs.b;
    }

    @Override
    public dcb a(cih $$0) {
        dxe $$1 = $$0.q().b_($$0.a());
        return (dcb)((dcb)this.n().a(b, $$0.g().g())).a(c, $$1.a() == dxf.c);
    }

    @Override
    public bdx a(dcb $$0, cmm $$12, gu $$22, byo $$32, bdw $$4, eee $$5) {
        cco $$6 = $$32.ga();
        czn $$7 = $$12.c_($$22);
        if ($$6 == null || !($$7 instanceof dah)) {
            return bdx.a($$12.B);
        }
        gu $$8 = $$22.c();
        if ($$12.a_($$8).g($$12, $$8)) {
            return bdx.a($$12.B);
        }
        if ($$12.B) {
            return bdx.a;
        }
        dah $$9 = (dah)$$7;
        $$6.a($$9);
        $$32.a(new bef(($$1, $$2, $$3) -> cbm.a($$1, $$2, $$6), e));
        $$32.a(amr.aj);
        bxf.a($$32, true);
        return bdx.b;
    }

    @Override
    public czn a(gu $$0, dcb $$1) {
        return new dah($$0, $$1);
    }

    @Override
    @Nullable
    public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
        return $$0.B ? csa.a($$2, czp.d, dah::a) : null;
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
        for (int $$4 = 0; $$4 < 3; ++$$4) {
            int $$5 = $$3.a(2) * 2 - 1;
            int $$6 = $$3.a(2) * 2 - 1;
            double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
            double $$8 = (float)$$2.v() + $$3.i();
            double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
            double $$10 = $$3.i() * (float)$$5;
            double $$11 = ((double)$$3.i() - 0.5) * 0.125;
            double $$12 = $$3.i() * (float)$$6;
            $$1.a(iv.X, $$7, $$8, $$9, $$10, $$11, $$12);
        }
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        return (dcb)$$0.a(b, $$1.a($$0.c(b)));
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        return $$0.a($$1.a($$0.c(b)));
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(b, c);
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(c).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(c).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        return false;
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        czn $$4 = $$1.c_($$2);
        if ($$4 instanceof dah) {
            ((dah)$$4).c();
        }
    }
}

