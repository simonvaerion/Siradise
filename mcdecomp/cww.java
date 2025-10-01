/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cww
extends cpn {
    public static final int a = 8;
    public static final ddb b = dcr.aF;
    protected static final efb[] c = new efb[]{eey.a(), cpn.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0), cpn.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0), cpn.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0), cpn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0), cpn.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0), cpn.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0), cpn.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0), cpn.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)};
    public static final int d = 5;

    protected cww(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)this.C.b()).a(b, 1));
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        switch ($$3) {
            case a: {
                return $$0.c(b) < 5;
            }
            case b: {
                return false;
            }
            case c: {
                return false;
            }
        }
        return false;
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return c[$$0.c(b)];
    }

    @Override
    public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
        return c[$$0.c(b) - 1];
    }

    @Override
    public efb b_(dcb $$0, cls $$1, gu $$2) {
        return c[$$0.c(b)];
    }

    @Override
    public efb b(dcb $$0, cls $$1, gu $$2, een $$3) {
        return c[$$0.c(b)];
    }

    @Override
    public boolean g_(dcb $$0) {
        return true;
    }

    @Override
    public float b(dcb $$0, cls $$1, gu $$2) {
        return $$0.c(b) == 8 ? 0.2f : 1.0f;
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        dcb $$3 = $$1.a_($$2.d());
        if ($$3.a(amw.ce)) {
            return false;
        }
        if ($$3.a(amw.cf)) {
            return true;
        }
        return cpn.a($$3.k($$1, $$2.d()), ha.b) || $$3.a(this) && $$3.c(b) == 8;
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if (!$$0.a($$3, $$4)) {
            return cpo.a.n();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
        if ($$1.a(cmv.b, $$2) > 11) {
            cww.c($$0, $$1, $$2);
            $$1.a($$2, false);
        }
    }

    @Override
    public boolean a(dcb $$0, cih $$1) {
        int $$2 = $$0.c(b);
        if ($$1.n().a(this.k()) && $$2 < 8) {
            if ($$1.c()) {
                return $$1.k() == ha.b;
            }
            return true;
        }
        return $$2 == 1;
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        dcb $$1 = $$0.q().a_($$0.a());
        if ($$1.a(this)) {
            int $$2 = $$1.c(b);
            return (dcb)$$1.a(b, Math.min(8, $$2 + 1));
        }
        return super.a($$0);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{b});
    }
}

