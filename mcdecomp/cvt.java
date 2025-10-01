/*
 * Decompiled with CFR 0.152.
 */
public class cvt
extends crl {
    public static final dcs a = dcr.s;
    public static final ddb d = dcr.aA;

    protected cvt(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)((dcb)((dcb)this.C.b()).a(aC, ha.c)).a(d, 1)).a(a, false)).a(c, false));
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        if (!$$3.fO().e) {
            return bdx.d;
        }
        $$1.a($$2, (dcb)$$0.a(d), 3);
        return bdx.a($$1.B);
    }

    @Override
    protected int g(dcb $$0) {
        return $$0.c(d) * 2;
    }

    @Override
    public dcb a(cih $$0) {
        dcb $$1 = super.a($$0);
        return (dcb)$$1.a(a, this.a((cmp)$$0.q(), $$0.a(), $$1));
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if (!$$3.r_() && $$1.o() != $$0.c(aC).o()) {
            return (dcb)$$0.a(a, this.a((cmp)$$3, $$4, $$0));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public boolean a(cmp $$0, gu $$1, dcb $$2) {
        return this.a((cnc)$$0, $$1, $$2) > 0;
    }

    @Override
    protected boolean a() {
        return true;
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
        if (!$$0.c(c).booleanValue()) {
            return;
        }
        ha $$4 = $$0.c(aC);
        double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
        double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
        double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
        float $$8 = -5.0f;
        if ($$3.h()) {
            $$8 = $$0.c(d) * 2 - 1;
        }
        double $$9 = ($$8 /= 16.0f) * (float)$$4.j();
        double $$10 = $$8 * (float)$$4.l();
        $$1.a(ip.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(aC, d, a, c);
    }
}

