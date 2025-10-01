/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cwq
extends cpn
implements cwo {
    public static final dcz<ddj> a = dcr.bh;
    public static final dcs b = dcr.C;
    protected static final efb c = cpn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
    protected static final efb d = cpn.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

    public cwq(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)this.n().a(a, ddj.b)).a(b, false));
    }

    @Override
    public boolean g_(dcb $$0) {
        return $$0.c(a) != ddj.c;
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(a, b);
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        ddj $$4 = $$0.c(a);
        switch ($$4) {
            case c: {
                return eey.b();
            }
            case a: {
                return d;
            }
        }
        return c;
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        gu $$1 = $$0.a();
        dcb $$2 = $$0.q().a_($$1);
        if ($$2.a(this)) {
            return (dcb)((dcb)$$2.a(a, ddj.c)).a(b, false);
        }
        dxe $$3 = $$0.q().b_($$1);
        dcb $$4 = (dcb)((dcb)this.n().a(a, ddj.b)).a(b, $$3.a() == dxf.c);
        ha $$5 = $$0.k();
        if ($$5 == ha.a || $$5 != ha.b && $$0.l().d - (double)$$1.v() > 0.5) {
            return (dcb)$$4.a(a, ddj.a);
        }
        return $$4;
    }

    @Override
    public boolean a(dcb $$0, cih $$1) {
        cfz $$2 = $$1.n();
        ddj $$3 = $$0.c(a);
        if ($$3 == ddj.c || !$$2.a(this.k())) {
            return false;
        }
        if ($$1.c()) {
            boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
            ha $$5 = $$1.k();
            if ($$3 == ddj.b) {
                return $$5 == ha.b || $$4 && $$5.o().d();
            }
            return $$5 == ha.a || !$$4 && $$5.o().d();
        }
        return true;
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(b).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    public boolean a(cmn $$0, gu $$1, dcb $$2, dxe $$3) {
        if ($$2.c(a) != ddj.c) {
            return cwo.super.a($$0, $$1, $$2, $$3);
        }
        return false;
    }

    @Override
    public boolean a(cls $$0, gu $$1, dcb $$2, dxd $$3) {
        if ($$2.c(a) != ddj.c) {
            return cwo.super.a($$0, $$1, $$2, $$3);
        }
        return false;
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(b).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        switch ($$3) {
            case a: {
                return false;
            }
            case b: {
                return $$1.b_($$2).a(anb.a);
            }
            case c: {
                return false;
            }
        }
        return false;
    }
}

