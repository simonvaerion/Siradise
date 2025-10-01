/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cwh
extends cpa
implements cwo {
    public static final dcs a = dcr.F;
    public static final dcs b = dcr.C;
    public static final dcs c = dcr.G;
    protected static final efb d = cpn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
    public static final double e = d.c(ha.a.b);

    public cwh(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)((dcb)this.C.b()).a(a, false)).a(b, false)).a(c, false));
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{a});
        $$0.a(new dde[]{b});
        $$0.a(new dde[]{c});
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$22, bfj $$3) {
        if ($$0 instanceof aif) {
            aif $$4 = (aif)$$0;
            aig $$5 = dat.a($$3);
            if ($$5 != null) {
                $$4.a($$1, czp.L).ifPresent($$2 -> $$2.a($$4, $$5));
            }
        }
        super.a($$0, $$1, $$22, $$3);
    }

    @Override
    public void a(dcb $$0, cmm $$12, gu $$2, dcb $$3, boolean $$4) {
        if ($$12 instanceof aif) {
            aif $$5 = (aif)$$12;
            if ($$0.c(a).booleanValue() && !$$0.a($$3.b())) {
                $$5.a($$2, czp.L).ifPresent($$1 -> $$1.a($$5));
            }
        }
        super.a($$0, $$12, $$2, $$3, $$4);
    }

    @Override
    public void a(dcb $$0, aif $$12, gu $$2, apf $$3) {
        if ($$0.c(a).booleanValue()) {
            $$12.a($$2, (dcb)$$0.a(a, false), 3);
            $$12.a($$2, czp.L).ifPresent($$1 -> $$1.a($$12));
        }
    }

    @Override
    public cvs b_(dcb $$0) {
        return cvs.c;
    }

    @Override
    public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
        return d;
    }

    @Override
    public efb f(dcb $$0, cls $$1, gu $$2) {
        return d;
    }

    @Override
    public boolean g_(dcb $$0) {
        return true;
    }

    @Override
    @Nullable
    public czn a(gu $$0, dcb $$1) {
        return new dat($$0, $$1);
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(b).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        return (dcb)this.n().a(b, $$0.q().b_($$0.a()).a() == dxf.c);
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(b).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, cfz $$3, boolean $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        if ($$4) {
            this.a($$1, $$2, $$3, bcz.a(5));
        }
    }

    @Override
    @Nullable
    public <T extends czn> czo<T> a(cmm $$02, dcb $$12, czp<T> $$22) {
        if (!$$02.B) {
            return cpa.a($$22, czp.L, (cmm $$0, gu $$1, dcb $$2, ? super E $$3) -> dgu.c.a($$0, $$3.gb(), $$3.gc()));
        }
        return null;
    }
}

