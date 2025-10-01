/*
 * Decompiled with CFR 0.152.
 */
public class ctl
extends crf {
    protected ctl(dca.d $$0) {
        super(1.0f, 1.0f, 16.0f, 16.0f, 16.0f, $$0);
        this.k((dcb)((dcb)((dcb)((dcb)((dcb)((dcb)this.C.b()).a(a, false)).a(b, false)).a(c, false)).a(d, false)).a(e, false));
    }

    @Override
    public dcb a(cih $$0) {
        cmm $$1 = $$0.q();
        gu $$2 = $$0.a();
        dxe $$3 = $$0.q().b_($$0.a());
        gu $$4 = $$2.e();
        gu $$5 = $$2.f();
        gu $$6 = $$2.g();
        gu $$7 = $$2.h();
        dcb $$8 = $$1.a_($$4);
        dcb $$9 = $$1.a_($$5);
        dcb $$10 = $$1.a_($$6);
        dcb $$11 = $$1.a_($$7);
        return (dcb)((dcb)((dcb)((dcb)((dcb)this.n().a(a, this.a($$8, $$8.d($$1, $$4, ha.d)))).a(c, this.a($$9, $$9.d($$1, $$5, ha.c)))).a(d, this.a($$10, $$10.d($$1, $$6, ha.f)))).a(b, this.a($$11, $$11.d($$1, $$7, ha.e)))).a(e, $$3.a() == dxf.c);
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(e).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        if ($$1.o().d()) {
            return (dcb)$$0.a((dde)f.get($$1), this.a($$2, $$2.d($$3, $$5, $$1.g())));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public efb b(dcb $$0, cls $$1, gu $$2, een $$3) {
        return eey.a();
    }

    @Override
    public boolean a(dcb $$0, dcb $$1, ha $$2) {
        if ($$1.a(this)) {
            if (!$$2.o().d()) {
                return true;
            }
            if (((Boolean)$$0.c((dde)f.get($$2))).booleanValue() && ((Boolean)$$1.c((dde)f.get($$2.g()))).booleanValue()) {
                return true;
            }
        }
        return super.a($$0, $$1, $$2);
    }

    public final boolean a(dcb $$0, boolean $$1) {
        return !ctl.j($$0) && $$1 || $$0.b() instanceof ctl || $$0.a(amw.L);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(a, b, d, c, e);
    }
}

