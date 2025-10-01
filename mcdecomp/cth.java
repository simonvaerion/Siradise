/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public class cth
extends cpn {
    public static final dcs a = cuz.a;
    public static final dcs b = cuz.b;
    public static final dcs c = cuz.c;
    public static final dcs d = cuz.d;
    public static final dcs e = cuz.e;
    public static final dcs f = cuz.f;
    private static final Map<ha, dcs> g = cuz.g;

    public cth(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)((dcb)((dcb)((dcb)((dcb)this.C.b()).a(a, true)).a(b, true)).a(c, true)).a(d, true)).a(e, true)).a(f, true));
    }

    @Override
    public dcb a(cih $$0) {
        cmm $$1 = $$0.q();
        gu $$2 = $$0.a();
        return (dcb)((dcb)((dcb)((dcb)((dcb)((dcb)this.n().a(f, !$$1.a_($$2.d()).a(this))).a(e, !$$1.a_($$2.c()).a(this))).a(a, !$$1.a_($$2.e()).a(this))).a(b, !$$1.a_($$2.h()).a(this))).a(c, !$$1.a_($$2.f()).a(this))).a(d, !$$1.a_($$2.g()).a(this));
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$2.a(this)) {
            return (dcb)$$0.a(g.get($$1), false);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        return (dcb)((dcb)((dcb)((dcb)((dcb)((dcb)$$0.a(g.get($$1.a(ha.c)), $$0.c(a))).a(g.get($$1.a(ha.d)), $$0.c(c))).a(g.get($$1.a(ha.f)), $$0.c(b))).a(g.get($$1.a(ha.e)), $$0.c(d))).a(g.get($$1.a(ha.b)), $$0.c(e))).a(g.get($$1.a(ha.a)), $$0.c(f));
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        return (dcb)((dcb)((dcb)((dcb)((dcb)((dcb)$$0.a(g.get($$1.b(ha.c)), $$0.c(a))).a(g.get($$1.b(ha.d)), $$0.c(c))).a(g.get($$1.b(ha.f)), $$0.c(b))).a(g.get($$1.b(ha.e)), $$0.c(d))).a(g.get($$1.b(ha.b)), $$0.c(e))).a(g.get($$1.b(ha.a)), $$0.c(f));
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(e, f, a, b, c, d);
    }
}

