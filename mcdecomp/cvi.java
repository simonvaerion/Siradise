/*
 * Decompiled with CFR 0.152.
 */
public class cvi
extends cpd {
    public static final dcz<ddf> d = dcr.ah;
    public static final dcs e = dcr.w;

    protected cvi(dca.d $$0) {
        super(true, $$0);
        this.k((dcb)((dcb)((dcb)((dcb)this.C.b()).a(d, ddf.a)).a(e, false)).a(c, false));
    }

    protected boolean a(cmm $$0, gu $$1, dcb $$2, boolean $$3, int $$4) {
        if ($$4 >= 8) {
            return false;
        }
        int $$5 = $$1.u();
        int $$6 = $$1.v();
        int $$7 = $$1.w();
        boolean $$8 = true;
        ddf $$9 = $$2.c(d);
        switch ($$9) {
            case a: {
                if ($$3) {
                    ++$$7;
                    break;
                }
                --$$7;
                break;
            }
            case b: {
                if ($$3) {
                    --$$5;
                    break;
                }
                ++$$5;
                break;
            }
            case c: {
                if ($$3) {
                    --$$5;
                } else {
                    ++$$5;
                    ++$$6;
                    $$8 = false;
                }
                $$9 = ddf.b;
                break;
            }
            case d: {
                if ($$3) {
                    --$$5;
                    ++$$6;
                    $$8 = false;
                } else {
                    ++$$5;
                }
                $$9 = ddf.b;
                break;
            }
            case e: {
                if ($$3) {
                    ++$$7;
                } else {
                    --$$7;
                    ++$$6;
                    $$8 = false;
                }
                $$9 = ddf.a;
                break;
            }
            case f: {
                if ($$3) {
                    ++$$7;
                    ++$$6;
                    $$8 = false;
                } else {
                    --$$7;
                }
                $$9 = ddf.a;
            }
        }
        if (this.a($$0, new gu($$5, $$6, $$7), $$3, $$4, $$9)) {
            return true;
        }
        return $$8 && this.a($$0, new gu($$5, $$6 - 1, $$7), $$3, $$4, $$9);
    }

    protected boolean a(cmm $$0, gu $$1, boolean $$2, int $$3, ddf $$4) {
        dcb $$5 = $$0.a_($$1);
        if (!$$5.a(this)) {
            return false;
        }
        ddf $$6 = $$5.c(d);
        if ($$4 == ddf.b && ($$6 == ddf.a || $$6 == ddf.e || $$6 == ddf.f)) {
            return false;
        }
        if ($$4 == ddf.a && ($$6 == ddf.b || $$6 == ddf.c || $$6 == ddf.d)) {
            return false;
        }
        if ($$5.c(e).booleanValue()) {
            if ($$0.B($$1)) {
                return true;
            }
            return this.a($$0, $$1, $$5, $$2, $$3 + 1);
        }
        return false;
    }

    @Override
    protected void a(dcb $$0, cmm $$1, gu $$2, cpn $$3) {
        boolean $$5;
        boolean $$4 = $$0.c(e);
        boolean bl2 = $$5 = $$1.B($$2) || this.a($$1, $$2, $$0, true, 0) || this.a($$1, $$2, $$0, false, 0);
        if ($$5 != $$4) {
            $$1.a($$2, (dcb)$$0.a(e, $$5), 3);
            $$1.a($$2.d(), this);
            if ($$0.c(d).b()) {
                $$1.a($$2.c(), this);
            }
        }
    }

    @Override
    public dde<ddf> b() {
        return d;
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        switch ($$1) {
            case c: {
                switch ($$0.c(d)) {
                    case c: {
                        return (dcb)$$0.a(d, ddf.d);
                    }
                    case d: {
                        return (dcb)$$0.a(d, ddf.c);
                    }
                    case e: {
                        return (dcb)$$0.a(d, ddf.f);
                    }
                    case f: {
                        return (dcb)$$0.a(d, ddf.e);
                    }
                    case g: {
                        return (dcb)$$0.a(d, ddf.i);
                    }
                    case h: {
                        return (dcb)$$0.a(d, ddf.j);
                    }
                    case i: {
                        return (dcb)$$0.a(d, ddf.g);
                    }
                    case j: {
                        return (dcb)$$0.a(d, ddf.h);
                    }
                }
            }
            case d: {
                switch ($$0.c(d)) {
                    case a: {
                        return (dcb)$$0.a(d, ddf.b);
                    }
                    case b: {
                        return (dcb)$$0.a(d, ddf.a);
                    }
                    case c: {
                        return (dcb)$$0.a(d, ddf.e);
                    }
                    case d: {
                        return (dcb)$$0.a(d, ddf.f);
                    }
                    case e: {
                        return (dcb)$$0.a(d, ddf.d);
                    }
                    case f: {
                        return (dcb)$$0.a(d, ddf.c);
                    }
                    case g: {
                        return (dcb)$$0.a(d, ddf.j);
                    }
                    case h: {
                        return (dcb)$$0.a(d, ddf.g);
                    }
                    case i: {
                        return (dcb)$$0.a(d, ddf.h);
                    }
                    case j: {
                        return (dcb)$$0.a(d, ddf.i);
                    }
                }
            }
            case b: {
                switch ($$0.c(d)) {
                    case a: {
                        return (dcb)$$0.a(d, ddf.b);
                    }
                    case b: {
                        return (dcb)$$0.a(d, ddf.a);
                    }
                    case c: {
                        return (dcb)$$0.a(d, ddf.f);
                    }
                    case d: {
                        return (dcb)$$0.a(d, ddf.e);
                    }
                    case e: {
                        return (dcb)$$0.a(d, ddf.c);
                    }
                    case f: {
                        return (dcb)$$0.a(d, ddf.d);
                    }
                    case g: {
                        return (dcb)$$0.a(d, ddf.h);
                    }
                    case h: {
                        return (dcb)$$0.a(d, ddf.i);
                    }
                    case i: {
                        return (dcb)$$0.a(d, ddf.j);
                    }
                    case j: {
                        return (dcb)$$0.a(d, ddf.g);
                    }
                }
            }
        }
        return $$0;
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        ddf $$2 = $$0.c(d);
        switch ($$1) {
            case b: {
                switch ($$2) {
                    case e: {
                        return (dcb)$$0.a(d, ddf.f);
                    }
                    case f: {
                        return (dcb)$$0.a(d, ddf.e);
                    }
                    case g: {
                        return (dcb)$$0.a(d, ddf.j);
                    }
                    case h: {
                        return (dcb)$$0.a(d, ddf.i);
                    }
                    case i: {
                        return (dcb)$$0.a(d, ddf.h);
                    }
                    case j: {
                        return (dcb)$$0.a(d, ddf.g);
                    }
                }
                break;
            }
            case c: {
                switch ($$2) {
                    case c: {
                        return (dcb)$$0.a(d, ddf.d);
                    }
                    case d: {
                        return (dcb)$$0.a(d, ddf.c);
                    }
                    case g: {
                        return (dcb)$$0.a(d, ddf.h);
                    }
                    case h: {
                        return (dcb)$$0.a(d, ddf.g);
                    }
                    case i: {
                        return (dcb)$$0.a(d, ddf.j);
                    }
                    case j: {
                        return (dcb)$$0.a(d, ddf.i);
                    }
                }
                break;
            }
        }
        return super.a($$0, $$1);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(d, e, c);
    }
}

