/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class crr
extends cpv {
    public static final dcz<dcx> a = dcr.ae;

    public crr(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)this.C.b()).a(a, dcx.b));
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        dcx $$6 = $$0.c(a);
        if (!($$1.o() != ha.a.b || $$6 == dcx.b != ($$1 == ha.b) || $$2.a(this) && $$2.c(a) != $$6)) {
            return cpo.a.n();
        }
        if ($$6 == dcx.b && $$1 == ha.a && !$$0.a($$3, $$4)) {
            return cpo.a.n();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        gu $$1 = $$0.a();
        cmm $$2 = $$0.q();
        if ($$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0)) {
            return super.a($$0);
        }
        return null;
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
        gu $$5 = $$1.c();
        $$0.a($$5, crr.a((cmp)$$0, $$5, (dcb)this.n().a(a, dcx.a)), 3);
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        if ($$0.c(a) == dcx.a) {
            dcb $$3 = $$1.a_($$2.d());
            return $$3.a(this) && $$3.c(a) == dcx.b;
        }
        return super.a($$0, $$1, $$2);
    }

    public static void a(cmn $$0, dcb $$1, gu $$2, int $$3) {
        gu $$4 = $$2.c();
        $$0.a($$2, crr.a((cmp)$$0, $$2, (dcb)$$1.a(a, dcx.b)), $$3);
        $$0.a($$4, crr.a((cmp)$$0, $$4, (dcb)$$1.a(a, dcx.a)), $$3);
    }

    public static dcb a(cmp $$0, gu $$1, dcb $$2) {
        if ($$2.b(dcr.C)) {
            return (dcb)$$2.a(dcr.C, $$0.y($$1));
        }
        return $$2;
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, byo $$3) {
        if (!$$0.B) {
            if ($$3.f()) {
                crr.b($$0, $$1, $$2, $$3);
            } else {
                crr.a($$2, $$0, $$1, null, (bfj)$$3, $$3.eO());
            }
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(cmm $$0, byo $$1, gu $$2, dcb $$3, @Nullable czn $$4, cfz $$5) {
        super.a($$0, $$1, $$2, cpo.a.n(), $$4, $$5);
    }

    protected static void b(cmm $$0, gu $$1, dcb $$2, byo $$3) {
        gu $$5;
        dcb $$6;
        dcx $$4 = $$2.c(a);
        if ($$4 == dcx.a && ($$6 = $$0.a_($$5 = $$1.d())).a($$2.b()) && $$6.c(a) == dcx.b) {
            dcb $$7 = $$6.u().b(dxf.c) ? cpo.G.n() : cpo.a.n();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, cpn.i($$6));
        }
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{a});
    }

    @Override
    public long a(dcb $$0, gu $$1) {
        return apa.b($$1.u(), $$1.c($$0.c(a) == dcx.b ? 0 : 1).v(), $$1.w());
    }
}

