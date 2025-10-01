/*
 * Decompiled with CFR 0.152.
 */
public class cqs
extends cuz {
    protected cqs(dca.d $$0) {
        super(0.3125f, $$0);
        this.k((dcb)((dcb)((dcb)((dcb)((dcb)((dcb)((dcb)this.C.b()).a(a, false)).a(b, false)).a(c, false)).a(d, false)).a(e, false)).a(f, false));
    }

    @Override
    public dcb a(cih $$0) {
        return this.a((cls)$$0.q(), $$0.a());
    }

    public dcb a(cls $$0, gu $$1) {
        dcb $$2 = $$0.a_($$1.d());
        dcb $$3 = $$0.a_($$1.c());
        dcb $$4 = $$0.a_($$1.e());
        dcb $$5 = $$0.a_($$1.h());
        dcb $$6 = $$0.a_($$1.f());
        dcb $$7 = $$0.a_($$1.g());
        return (dcb)((dcb)((dcb)((dcb)((dcb)((dcb)this.n().a(f, $$2.a(this) || $$2.a(cpo.kv) || $$2.a(cpo.fz))).a(e, $$3.a(this) || $$3.a(cpo.kv))).a(a, $$4.a(this) || $$4.a(cpo.kv))).a(b, $$5.a(this) || $$5.a(cpo.kv))).a(c, $$6.a(this) || $$6.a(cpo.kv))).a(d, $$7.a(this) || $$7.a(cpo.kv));
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if (!$$0.a($$3, $$4)) {
            $$3.a($$4, this, 1);
            return super.a($$0, $$1, $$2, $$3, $$4, $$5);
        }
        boolean $$6 = $$2.a(this) || $$2.a(cpo.kv) || $$1 == ha.a && $$2.a(cpo.fz);
        return (dcb)$$0.a((dde)g.get($$1), $$6);
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if (!$$0.a((cmp)$$1, $$2)) {
            $$1.b($$2, true);
        }
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        dcb $$3 = $$1.a_($$2.d());
        boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();
        for (ha $$5 : ha.c.a) {
            gu $$6 = $$2.a($$5);
            dcb $$7 = $$1.a_($$6);
            if (!$$7.a(this)) continue;
            if ($$4) {
                return false;
            }
            dcb $$8 = $$1.a_($$6.d());
            if (!$$8.a(this) && !$$8.a(cpo.fz)) continue;
            return true;
        }
        return $$3.a(this) || $$3.a(cpo.fz);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(a, b, c, d, e, f);
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        return false;
    }
}

