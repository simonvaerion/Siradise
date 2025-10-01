/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cuf
extends cwb
implements cwo {
    public static final ddb a = dcr.at;
    public static final int b = 4;
    private static final efb[] g = new efb[]{cpn.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0), cpn.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0), cpn.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0), cpn.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0), cpn.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)};
    private static final dcs h = dcr.C;
    public static final dcs c = dcr.j;
    private static final float i = 0.85f;

    public cuf(dca.d $$0) {
        super(new dbo(0.85f), $$0);
        this.k((dcb)((dcb)((dcb)((dcb)((dcb)this.C.b()).a(d, 0)).a(a, 0)).a(h, false)).a(c, false));
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{d}).a(new dde[]{a}).a(new dde[]{h}).a(new dde[]{c});
    }

    @Override
    protected boolean d(dcb $$0, cls $$1, gu $$2) {
        return super.d($$0, $$1, $$2) || $$0.a(cpo.dR);
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        dxe $$1 = $$0.q().b_($$0.a());
        boolean $$2 = $$1.a() == dxf.c;
        return (dcb)((dcb)super.a($$0).a(h, $$2)).a(a, 4);
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        efb $$6;
        eei $$4 = $$0.n($$1, $$2);
        if (!$$0.c(c).booleanValue()) {
            efb $$5 = g[4];
        } else {
            $$6 = g[$$0.c(a)];
        }
        return $$6.a($$4.c, $$4.d, $$4.e);
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        if (cuf.h($$0)) {
            return $$1.a_($$2.c()).a(cpo.aL);
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(h).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        if ($$1 == ha.b && !$$0.a($$3, $$4)) {
            return cpo.a.n();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(h).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if (!cuf.h($$0)) {
            if ($$3.a(7) == 0) {
                this.a($$1, $$2, $$0, $$3);
            }
            return;
        }
        if (!cuf.n($$0)) {
            $$1.a($$2, (dcb)$$0.a(a), 2);
        }
    }

    @Override
    public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
        return !cuf.h($$2) || !cuf.n($$2);
    }

    @Override
    public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
        return cuf.h($$3) ? !cuf.n($$3) : super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
        if (cuf.h($$3) && !cuf.n($$3)) {
            $$0.a($$2, (dcb)$$3.a(a), 2);
        } else {
            super.a($$0, $$1, $$2, $$3);
        }
    }

    private static boolean h(dcb $$0) {
        return $$0.c(c);
    }

    private static boolean n(dcb $$0) {
        return $$0.c(a) == 4;
    }

    public static dcb b() {
        return cuf.b(0);
    }

    public static dcb b(int $$0) {
        return (dcb)((dcb)cpo.E.n().a(c, true)).a(a, $$0);
    }
}

