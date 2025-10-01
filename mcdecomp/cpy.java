/*
 * Decompiled with CFR 0.152.
 */
public class cpy
extends cpn {
    public static final int a = 6;
    public static final ddb b = dcr.ay;
    public static final int c = cpy.b(0);
    protected static final float d = 1.0f;
    protected static final float e = 2.0f;
    protected static final efb[] f = new efb[]{cpn.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0), cpn.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0), cpn.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0), cpn.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0), cpn.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0), cpn.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0), cpn.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)};

    protected cpy(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)this.C.b()).a(b, 0));
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return f[$$0.c(b)];
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        cpn $$8;
        cfz $$6 = $$3.b($$4);
        cfu $$7 = $$6.d();
        if ($$6.a(ane.ai) && $$0.c(b) == 0 && ($$8 = cpn.a($$7)) instanceof cqb) {
            if (!$$3.f()) {
                $$6.h(1);
            }
            $$1.a(null, $$2, amh.cK, ami.e, 1.0f, 1.0f);
            $$1.b($$2, cqc.a($$8));
            $$1.a((bfj)$$3, dgl.c, $$2);
            $$3.b(amr.c.b($$7));
            return bdx.a;
        }
        if ($$1.B) {
            if (cpy.a((cmn)$$1, $$2, $$0, $$3).a()) {
                return bdx.a;
            }
            if ($$6.b()) {
                return bdx.b;
            }
        }
        return cpy.a((cmn)$$1, $$2, $$0, $$3);
    }

    protected static bdx a(cmn $$0, gu $$1, dcb $$2, byo $$3) {
        if (!$$3.t(false)) {
            return bdx.d;
        }
        $$3.a(amr.U);
        $$3.fX().a(2, 0.1f);
        int $$4 = $$2.c(b);
        $$0.a((bfj)$$3, dgl.m, $$1);
        if ($$4 < 6) {
            $$0.a($$1, (dcb)$$2.a(b, $$4 + 1), 3);
        } else {
            $$0.a($$1, false);
            $$0.a((bfj)$$3, dgl.f, $$1);
        }
        return bdx.a;
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$1 == ha.a && !$$0.a($$3, $$4)) {
            return cpo.a.n();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        return $$1.a_($$2.d()).e();
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(new dde[]{b});
    }

    @Override
    public int a(dcb $$0, cmm $$1, gu $$2) {
        return cpy.b($$0.c(b));
    }

    public static int b(int $$0) {
        return (7 - $$0) * 2;
    }

    @Override
    public boolean d_(dcb $$0) {
        return true;
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        return false;
    }
}

