/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class ctc
extends cpn
implements cwo {
    private static final dcs b = dcr.C;
    protected static final efb a = cpn.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

    protected ctc(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)this.C.b()).a(b, false));
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{b});
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(b).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        dcb $$1 = super.a($$0);
        if ($$1 != null) {
            dxe $$2 = $$0.q().b_($$0.a());
            return (dcb)$$1.a(b, $$2.a() == dxf.c);
        }
        return null;
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        gu $$3 = $$2.c();
        dcb $$4 = $$1.a_($$3);
        return $$4.d($$1, $$3, ha.a);
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return a;
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$1 == ha.b && !this.a($$0, $$3, $$4)) {
            return cpo.a.n();
        }
        if ($$0.c(b).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }
}

