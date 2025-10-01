/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  javax.annotation.Nullable
 */
import com.google.common.base.MoreObjects;
import javax.annotation.Nullable;

public class cyd
extends cpn {
    public static final dcv a = ctg.aC;
    public static final dcs b = dcr.w;
    public static final dcs c = dcr.a;
    protected static final int d = 1;
    protected static final int e = 42;
    private static final int k = 10;
    protected static final int f = 3;
    protected static final efb g = cpn.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
    protected static final efb h = cpn.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
    protected static final efb i = cpn.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
    protected static final efb j = cpn.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

    public cyd(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)((dcb)this.C.b()).a(a, ha.c)).a(b, false)).a(c, false));
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        switch ($$0.c(a)) {
            default: {
                return j;
            }
            case e: {
                return i;
            }
            case d: {
                return h;
            }
            case c: 
        }
        return g;
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        ha $$3 = $$0.c(a);
        gu $$4 = $$2.a($$3.g());
        dcb $$5 = $$1.a_($$4);
        return $$3.o().d() && $$5.d($$1, $$4, $$3);
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$1.g() == $$0.c(a) && !$$0.a($$3, $$4)) {
            return cpo.a.n();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        ha[] $$4;
        dcb $$1 = (dcb)((dcb)this.n().a(b, false)).a(c, false);
        cmm $$2 = $$0.q();
        gu $$3 = $$0.a();
        for (ha $$5 : $$4 = $$0.f()) {
            ha $$6;
            if (!$$5.o().d() || !($$1 = (dcb)$$1.a(a, $$6 = $$5.g())).a((cmp)$$2, $$3)) continue;
            return $$1;
        }
        return null;
    }

    @Override
    public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
        this.a($$0, $$1, $$2, false, false, -1, null);
    }

    public void a(cmm $$0, gu $$1, dcb $$2, boolean $$3, boolean $$4, int $$5, @Nullable dcb $$6) {
        ha $$7 = $$2.c(a);
        boolean $$8 = $$2.c(c);
        boolean $$9 = $$2.c(b);
        boolean $$10 = !$$3;
        boolean $$11 = false;
        int $$12 = 0;
        dcb[] $$13 = new dcb[42];
        for (int $$14 = 1; $$14 < 42; ++$$14) {
            gu $$15 = $$1.a($$7, $$14);
            dcb $$16 = $$0.a_($$15);
            if ($$16.a(cpo.fH)) {
                if ($$16.c(a) != $$7.g()) break;
                $$12 = $$14;
                break;
            }
            if ($$16.a(cpo.fI) || $$14 == $$5) {
                if ($$14 == $$5) {
                    $$16 = (dcb)MoreObjects.firstNonNull((Object)$$6, (Object)$$16);
                }
                boolean $$17 = $$16.c(cyc.c) == false;
                boolean $$18 = $$16.c(cyc.a);
                $$11 |= $$17 && $$18;
                $$13[$$14] = $$16;
                if ($$14 != $$5) continue;
                $$0.a($$1, (cpn)this, 10);
                $$10 &= $$17;
                continue;
            }
            $$13[$$14] = null;
            $$10 = false;
        }
        dcb $$19 = (dcb)((dcb)this.n().a(c, $$10)).a(b, $$11 &= ($$10 &= $$12 > 1));
        if ($$12 > 0) {
            gu $$20 = $$1.a($$7, $$12);
            ha $$21 = $$7.g();
            $$0.a($$20, (dcb)$$19.a(a, $$21), 3);
            this.a($$0, $$20, $$21);
            this.a($$0, $$20, $$10, $$11, $$8, $$9);
        }
        this.a($$0, $$1, $$10, $$11, $$8, $$9);
        if (!$$3) {
            $$0.a($$1, (dcb)$$19.a(a, $$7), 3);
            if ($$4) {
                this.a($$0, $$1, $$7);
            }
        }
        if ($$8 != $$10) {
            for (int $$22 = 1; $$22 < $$12; ++$$22) {
                gu $$23 = $$1.a($$7, $$22);
                dcb $$24 = $$13[$$22];
                if ($$24 == null) continue;
                $$0.a($$23, (dcb)$$24.a(c, $$10), 3);
                if ($$0.a_($$23).i()) continue;
            }
        }
    }

    @Override
    public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
        this.a($$1, $$2, $$0, false, true, -1, null);
    }

    private void a(cmm $$0, gu $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
        if ($$3 && !$$5) {
            $$0.a(null, $$1, amh.xR, ami.e, 0.4f, 0.6f);
            $$0.a(null, dgl.a, $$1);
        } else if (!$$3 && $$5) {
            $$0.a(null, $$1, amh.xQ, ami.e, 0.4f, 0.5f);
            $$0.a(null, dgl.e, $$1);
        } else if ($$2 && !$$4) {
            $$0.a(null, $$1, amh.xP, ami.e, 0.4f, 0.7f);
            $$0.a(null, dgl.b, $$1);
        } else if (!$$2 && $$4) {
            $$0.a(null, $$1, amh.xS, ami.e, 0.4f, 1.2f / ($$0.z.i() * 0.2f + 0.9f));
            $$0.a(null, dgl.g, $$1);
        }
    }

    private void a(cmm $$0, gu $$1, ha $$2) {
        $$0.a($$1, this);
        $$0.a($$1.a($$2.g()), this);
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$4 || $$0.a($$3.b())) {
            return;
        }
        boolean $$5 = $$0.c(c);
        boolean $$6 = $$0.c(b);
        if ($$5 || $$6) {
            this.a($$1, $$2, $$0, true, false, -1, null);
        }
        if ($$6) {
            $$1.a($$2, this);
            $$1.a($$2.a($$0.c(a).g()), this);
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
        return $$0.c(b) != false ? 15 : 0;
    }

    @Override
    public int b(dcb $$0, cls $$1, gu $$2, ha $$3) {
        if (!$$0.c(b).booleanValue()) {
            return 0;
        }
        if ($$0.c(a) == $$3) {
            return 15;
        }
        return 0;
    }

    @Override
    public boolean f_(dcb $$0) {
        return true;
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        return (dcb)$$0.a(a, $$1.a($$0.c(a)));
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        return $$0.a($$1.a($$0.c(a)));
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(a, b, c);
    }
}

