/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class coy
extends cpn
implements cwo {
    public static final dcs c = dcr.C;
    private static final efb a = cpn.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

    protected coy(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)this.C.b()).a(c, true));
    }

    protected void a(dcb $$0, cmn $$1, gu $$2) {
        if (!coy.e($$0, $$1, $$2)) {
            $$1.a($$2, this, 60 + $$1.y_().a(40));
        }
    }

    protected static boolean e(dcb $$0, cls $$1, gu $$2) {
        if ($$0.c(c).booleanValue()) {
            return true;
        }
        for (ha $$3 : ha.values()) {
            if (!$$1.b_($$2.a($$3)).a(anb.a)) continue;
            return true;
        }
        return false;
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        dxe $$1 = $$0.q().b_($$0.a());
        return (dcb)this.n().a(c, $$1.a(anb.a) && $$1.e() == 8);
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return a;
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(c).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        if ($$1 == ha.a && !this.a($$0, (cmp)$$3, $$4)) {
            return cpo.a.n();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        gu $$3 = $$2.d();
        return $$1.a_($$3).d($$1, $$3, ha.b);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{c});
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(c).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }
}

