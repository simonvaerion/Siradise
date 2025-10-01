/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class ctq
extends cpn
implements cwo {
    public static final dcv a = ctg.aC;
    public static final dcs b = dcr.C;
    protected static final float c = 3.0f;
    protected static final efb d = cpn.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
    protected static final efb e = cpn.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    protected static final efb f = cpn.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
    protected static final efb g = cpn.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

    protected ctq(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)this.C.b()).a(a, ha.c)).a(b, false));
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        switch ($$0.c(a)) {
            case c: {
                return g;
            }
            case d: {
                return f;
            }
            case e: {
                return e;
            }
        }
        return d;
    }

    private boolean a(cls $$0, gu $$1, ha $$2) {
        dcb $$3 = $$0.a_($$1);
        return $$3.d($$0, $$1, $$2);
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        ha $$3 = $$0.c(a);
        return this.a((cls)$$1, $$2.a($$3.g()), $$3);
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$1.g() == $$0.c(a) && !$$0.a($$3, $$4)) {
            return cpo.a.n();
        }
        if ($$0.c(b).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        dcb $$1;
        if (!$$0.c() && ($$1 = $$0.q().a_($$0.a().a($$0.k().g()))).a(this) && $$1.c(a) == $$0.k()) {
            return null;
        }
        dcb $$2 = this.n();
        cmm $$3 = $$0.q();
        gu $$4 = $$0.a();
        dxe $$5 = $$0.q().b_($$0.a());
        for (ha $$6 : $$0.f()) {
            if (!$$6.o().d() || !($$2 = (dcb)$$2.a(a, $$6.g())).a((cmp)$$3, $$4)) continue;
            return (dcb)$$2.a(b, $$5.a() == dxf.c);
        }
        return null;
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        return (dcb)$$0.a(a, $$1.a($$0.c(a)));
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        return $$0.a($$1.a($$0.c(a)));
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(a, b);
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(b).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }
}

