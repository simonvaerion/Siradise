/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public class cwc
extends cpn
implements cwo {
    private static final int e = 1;
    private static final efb f;
    private static final efb g;
    private static final efb h;
    private static final efb i;
    public static final int a = 7;
    public static final ddb b;
    public static final dcs c;
    public static final dcs d;

    protected cwc(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)((dcb)this.C.b()).a(b, 7)).a(c, false)).a(d, false));
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(b, c, d);
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        if (!$$3.a($$0.b().k())) {
            return $$0.c(d) != false ? g : f;
        }
        return eey.b();
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2) {
        return eey.b();
    }

    @Override
    public boolean a(dcb $$0, cih $$1) {
        return $$1.n().a(this.k());
    }

    @Override
    public dcb a(cih $$0) {
        gu $$1 = $$0.a();
        cmm $$2 = $$0.q();
        int $$3 = cwc.a($$2, $$1);
        return (dcb)((dcb)((dcb)this.n().a(c, $$2.b_($$1).a() == dxf.c)).a(b, $$3)).a(d, this.a((cls)$$2, $$1, $$3));
    }

    @Override
    public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if (!$$1.B) {
            $$1.a($$2, (cpn)this, 1);
        }
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(c).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        if (!$$3.r_()) {
            $$3.a($$4, this, 1);
        }
        return $$0;
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        int $$4 = cwc.a($$1, $$2);
        dcb $$5 = (dcb)((dcb)$$0.a(b, $$4)).a(d, this.a((cls)$$1, $$2, $$4));
        if ($$5.c(b) == 7) {
            if ($$0.c(b) == 7) {
                bvg.a($$1, $$2, $$5);
            } else {
                $$1.b($$2, true);
            }
        } else if ($$0 != $$5) {
            $$1.a($$2, $$5, 3);
        }
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        return cwc.a($$1, $$2) < 7;
    }

    @Override
    public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
        if (!$$3.a(eey.b(), $$2, true) || $$3.b()) {
            if ($$0.c(b) != 0 && $$0.c(d).booleanValue() && $$3.a(i, $$2, true)) {
                return h;
            }
            return eey.a();
        }
        return f;
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(c).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    private boolean a(cls $$0, gu $$1, int $$2) {
        return $$2 > 0 && !$$0.a_($$1.d()).a(this);
    }

    public static int a(cls $$0, gu $$1) {
        ha $$5;
        dcb $$6;
        gu.a $$2 = $$1.j().c(ha.a);
        dcb $$3 = $$0.a_($$2);
        int $$4 = 7;
        if ($$3.a(cpo.nS)) {
            $$4 = $$3.c(b);
        } else if ($$3.d($$0, $$2, ha.b)) {
            return 0;
        }
        Iterator<ha> iterator = ha.c.a.iterator();
        while (iterator.hasNext() && (!($$6 = $$0.a_($$2.a((hz)$$1, $$5 = iterator.next()))).a(cpo.nS) || ($$4 = Math.min($$4, $$6.c(b) + 1)) != 1)) {
        }
        return $$4;
    }

    static {
        h = cpn.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
        i = eey.b().a(0.0, -1.0, 0.0);
        b = dcr.aW;
        c = dcr.C;
        d = dcr.b;
        efb $$0 = cpn.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
        efb $$1 = cpn.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
        efb $$2 = cpn.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
        efb $$3 = cpn.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
        efb $$4 = cpn.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
        f = eey.a($$0, $$1, $$2, $$3, $$4);
        efb $$5 = cpn.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
        efb $$6 = cpn.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
        efb $$7 = cpn.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
        efb $$8 = cpn.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
        g = eey.a(h, f, $$6, $$5, $$8, $$7);
    }
}

