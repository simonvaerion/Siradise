/*
 * Decompiled with CFR 0.152.
 */
public abstract class cpd
extends cpn
implements cwo {
    protected static final efb a = cpn.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
    protected static final efb b = cpn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
    public static final dcs c = dcr.C;
    private final boolean d;

    public static boolean a(cmm $$0, gu $$1) {
        return cpd.g($$0.a_($$1));
    }

    public static boolean g(dcb $$0) {
        return $$0.a(amw.N) && $$0.b() instanceof cpd;
    }

    protected cpd(boolean $$0, dca.d $$1) {
        super($$1);
        this.d = $$0;
    }

    public boolean a() {
        return this.d;
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        ddf $$4;
        ddf ddf2 = $$4 = $$0.a(this) ? $$0.c(this.b()) : null;
        if ($$4 != null && $$4.b()) {
            return b;
        }
        return a;
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        return cpd.c($$1, $$2.d());
    }

    @Override
    public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$3.a($$0.b())) {
            return;
        }
        this.a($$0, $$1, $$2, $$4);
    }

    protected dcb a(dcb $$0, cmm $$1, gu $$2, boolean $$3) {
        $$0 = this.a($$1, $$2, $$0, true);
        if (this.d) {
            $$1.a($$0, $$2, this, $$2, $$3);
        }
        return $$0;
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
        if ($$1.B || !$$1.a_($$2).a(this)) {
            return;
        }
        ddf $$6 = $$0.c(this.b());
        if (cpd.a($$2, $$1, $$6)) {
            cpd.c($$0, $$1, $$2);
            $$1.a($$2, $$5);
        } else {
            this.a($$0, $$1, $$2, $$3);
        }
    }

    private static boolean a(gu $$0, cmm $$1, ddf $$2) {
        if (!cpd.c($$1, $$0.d())) {
            return true;
        }
        switch ($$2) {
            case c: {
                return !cpd.c($$1, $$0.h());
            }
            case d: {
                return !cpd.c($$1, $$0.g());
            }
            case e: {
                return !cpd.c($$1, $$0.e());
            }
            case f: {
                return !cpd.c($$1, $$0.f());
            }
        }
        return false;
    }

    protected void a(dcb $$0, cmm $$1, gu $$2, cpn $$3) {
    }

    protected dcb a(cmm $$0, gu $$1, dcb $$2, boolean $$3) {
        if ($$0.B) {
            return $$2;
        }
        ddf $$4 = $$2.c(this.b());
        return new cvm($$0, $$1, $$2).a($$0.B($$1), $$3, $$4).c();
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$4) {
            return;
        }
        super.a($$0, $$1, $$2, $$3, $$4);
        if ($$0.c(this.b()).b()) {
            $$1.a($$2.c(), this);
        }
        if (this.d) {
            $$1.a($$2, this);
            $$1.a($$2.d(), this);
        }
    }

    @Override
    public dcb a(cih $$0) {
        dxe $$1 = $$0.q().b_($$0.a());
        boolean $$2 = $$1.a() == dxf.c;
        dcb $$3 = super.n();
        ha $$4 = $$0.g();
        boolean $$5 = $$4 == ha.f || $$4 == ha.e;
        return (dcb)((dcb)$$3.a(this.b(), $$5 ? ddf.b : ddf.a)).a(c, $$2);
    }

    public abstract dde<ddf> b();

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(c).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(c).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }
}

