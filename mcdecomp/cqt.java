/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class cqt
extends ctg
implements cpp {
    public static final int a = 2;
    public static final ddb b = dcr.ar;
    protected static final int c = 4;
    protected static final int d = 5;
    protected static final int e = 2;
    protected static final int f = 6;
    protected static final int g = 7;
    protected static final int h = 3;
    protected static final int i = 8;
    protected static final int j = 9;
    protected static final int k = 4;
    protected static final efb[] l = new efb[]{cpn.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), cpn.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), cpn.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)};
    protected static final efb[] m = new efb[]{cpn.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), cpn.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), cpn.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)};
    protected static final efb[] n = new efb[]{cpn.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), cpn.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), cpn.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)};
    protected static final efb[] D = new efb[]{cpn.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), cpn.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), cpn.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)};

    public cqt(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)this.C.b()).a(aC, ha.c)).a(b, 0));
    }

    @Override
    public boolean e_(dcb $$0) {
        return $$0.c(b) < 2;
    }

    @Override
    public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
        int $$4;
        if ($$1.z.a(5) == 0 && ($$4 = $$0.c(b).intValue()) < 2) {
            $$1.a($$2, (dcb)$$0.a(b, $$4 + 1), 2);
        }
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        dcb $$3 = $$1.a_($$2.a($$0.c(aC)));
        return $$3.a(amw.z);
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        int $$4 = $$0.c(b);
        switch ($$0.c(aC)) {
            case d: {
                return D[$$4];
            }
            default: {
                return n[$$4];
            }
            case e: {
                return m[$$4];
            }
            case f: 
        }
        return l[$$4];
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        dcb $$1 = this.n();
        cmm $$2 = $$0.q();
        gu $$3 = $$0.a();
        for (ha $$4 : $$0.f()) {
            if (!$$4.o().d() || !($$1 = (dcb)$$1.a(aC, $$4)).a((cmp)$$2, $$3)) continue;
            return $$1;
        }
        return null;
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$1 == $$0.c(aC) && !$$0.a($$3, $$4)) {
            return cpo.a.n();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
        return $$2.c(b) < 2;
    }

    @Override
    public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
        return true;
    }

    @Override
    public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
        $$0.a($$2, (dcb)$$3.a(b, $$3.c(b) + 1), 2);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(aC, b);
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        return false;
    }
}

