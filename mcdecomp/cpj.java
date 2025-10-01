/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cpj
extends cpa {
    public static final dcv a = ctg.aC;
    public static final dcz<dcp> b = dcr.V;
    public static final dcs c = dcr.w;
    private static final efb e = cpn.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
    private static final efb f = cpn.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
    private static final efb g = cpn.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
    private static final efb h = cpn.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
    private static final efb i = eey.a(h, g);
    private static final efb j = eey.a(i, cpn.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
    private static final efb k = eey.a(i, cpn.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
    private static final efb l = eey.a(i, cpn.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
    private static final efb m = eey.a(i, cpn.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
    private static final efb n = eey.a(i, cpn.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
    private static final efb D = eey.a(i, cpn.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
    private static final efb E = eey.a(i, cpn.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
    public static final int d = 1;

    public cpj(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)((dcb)this.C.b()).a(a, ha.c)).a(b, dcp.a)).a(c, false));
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
        boolean $$6 = $$1.B($$2);
        if ($$6 != $$0.c(c)) {
            if ($$6) {
                this.a($$1, $$2, (ha)null);
            }
            $$1.a($$2, (dcb)$$0.a(c, $$6), 3);
        }
    }

    @Override
    public void a(cmm $$0, dcb $$1, eee $$2, bzg $$3) {
        bfj $$4 = $$3.v();
        byo $$5 = $$4 instanceof byo ? (byo)$$4 : null;
        this.a($$0, $$1, $$2, $$5, true);
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        return this.a($$1, $$0, $$5, $$3, true) ? bdx.a($$1.B) : bdx.d;
    }

    public boolean a(cmm $$0, dcb $$1, eee $$2, @Nullable byo $$3, boolean $$4) {
        boolean $$7;
        ha $$5 = $$2.b();
        gu $$6 = $$2.a();
        boolean bl2 = $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
        if ($$7) {
            boolean $$8 = this.a($$3, $$0, $$6, $$5);
            if ($$8 && $$3 != null) {
                $$3.a(amr.az);
            }
            return true;
        }
        return false;
    }

    private boolean a(dcb $$0, ha $$1, double $$2) {
        if ($$1.o() == ha.a.b || $$2 > (double)0.8124f) {
            return false;
        }
        ha $$3 = $$0.c(a);
        dcp $$4 = $$0.c(b);
        switch ($$4) {
            case a: {
                return $$3.o() == $$1.o();
            }
            case c: 
            case d: {
                return $$3.o() != $$1.o();
            }
            case b: {
                return true;
            }
        }
        return false;
    }

    public boolean a(cmm $$0, gu $$1, @Nullable ha $$2) {
        return this.a(null, $$0, $$1, $$2);
    }

    public boolean a(@Nullable bfj $$0, cmm $$1, gu $$2, @Nullable ha $$3) {
        czn $$4 = $$1.c_($$2);
        if (!$$1.B && $$4 instanceof czl) {
            if ($$3 == null) {
                $$3 = $$1.a_($$2).c(a);
            }
            ((czl)$$4).a($$3);
            $$1.a(null, $$2, amh.bK, ami.e, 2.0f, 1.0f);
            $$1.a($$0, dgl.c, $$2);
            return true;
        }
        return false;
    }

    private efb h(dcb $$0) {
        ha $$1 = $$0.c(a);
        dcp $$2 = $$0.c(b);
        if ($$2 == dcp.a) {
            if ($$1 == ha.c || $$1 == ha.d) {
                return e;
            }
            return f;
        }
        if ($$2 == dcp.b) {
            return E;
        }
        if ($$2 == dcp.d) {
            if ($$1 == ha.c || $$1 == ha.d) {
                return j;
            }
            return k;
        }
        if ($$1 == ha.c) {
            return n;
        }
        if ($$1 == ha.d) {
            return D;
        }
        if ($$1 == ha.f) {
            return m;
        }
        return l;
    }

    @Override
    public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
        return this.h($$0);
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return this.h($$0);
    }

    @Override
    public cvs b_(dcb $$0) {
        return cvs.c;
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        ha $$1 = $$0.k();
        gu $$2 = $$0.a();
        cmm $$3 = $$0.q();
        ha.a $$4 = $$1.o();
        if ($$4 == ha.a.b) {
            dcb $$5 = (dcb)((dcb)this.n().a(b, $$1 == ha.a ? dcp.b : dcp.a)).a(a, $$0.g());
            if ($$5.a((cmp)$$0.q(), $$2)) {
                return $$5;
            }
        } else {
            boolean $$6 = $$4 == ha.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ha.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ha.e) || $$4 == ha.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ha.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ha.c);
            dcb $$7 = (dcb)((dcb)this.n().a(a, $$1.g())).a(b, $$6 ? dcp.d : dcp.c);
            if ($$7.a((cmp)$$0.q(), $$0.a())) {
                return $$7;
            }
            boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ha.b);
            if (($$7 = (dcb)$$7.a(b, $$8 ? dcp.a : dcp.b)).a((cmp)$$0.q(), $$0.a())) {
                return $$7;
            }
        }
        return null;
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        dcp $$6 = $$0.c(b);
        ha $$7 = cpj.n($$0).g();
        if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dcp.d) {
            return cpo.a.n();
        }
        if ($$1.o() == $$0.c(a).o()) {
            if ($$6 == dcp.d && !$$2.d($$3, $$5, $$1)) {
                return (dcb)((dcb)$$0.a(b, dcp.c)).a(a, $$1.g());
            }
            if ($$6 == dcp.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(a))) {
                return (dcb)$$0.a(b, dcp.d);
            }
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        ha $$3 = cpj.n($$0).g();
        if ($$3 == ha.b) {
            return cpn.a($$1, $$2.c(), ha.a);
        }
        return csd.b($$1, $$2, $$3);
    }

    private static ha n(dcb $$0) {
        switch ($$0.c(b)) {
            case b: {
                return ha.a;
            }
            case a: {
                return ha.b;
            }
        }
        return $$0.c(a).g();
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(a, b, c);
    }

    @Override
    @Nullable
    public czn a(gu $$0, dcb $$1) {
        return new czl($$0, $$1);
    }

    @Override
    @Nullable
    public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
        return cpj.a($$2, czp.E, $$0.B ? czl::a : czl::b);
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        return false;
    }
}

