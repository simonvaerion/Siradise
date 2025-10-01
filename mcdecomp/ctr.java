/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class ctr
extends cpn
implements cwo {
    public static final dcs a = dcr.j;
    public static final dcs b = dcr.C;
    protected static final efb c = eey.a(cpn.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), cpn.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
    protected static final efb d = eey.a(cpn.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), cpn.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

    public ctr(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)this.C.b()).a(a, false)).a(b, false));
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        dxe $$1 = $$0.q().b_($$0.a());
        for (ha $$2 : $$0.f()) {
            dcb $$3;
            if ($$2.o() != ha.a.b || !($$3 = (dcb)this.n().a(a, $$2 == ha.b)).a((cmp)$$0.q(), $$0.a())) continue;
            return (dcb)$$3.a(b, $$1.a() == dxf.c);
        }
        return null;
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return $$0.c(a) != false ? d : c;
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(a, b);
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        ha $$3 = ctr.h($$0).g();
        return cpn.a($$1, $$2.a($$3), $$3.g());
    }

    protected static ha h(dcb $$0) {
        return $$0.c(a) != false ? ha.a : ha.b;
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(b).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        if (ctr.h($$0).g() == $$1 && !$$0.a($$3, $$4)) {
            return cpo.a.n();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(b).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        return false;
    }
}

