/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class cyj
extends cpn
implements cwo {
    public static final dcs a = dcr.J;
    public static final dcz<ddn> b = dcr.W;
    public static final dcz<ddn> c = dcr.X;
    public static final dcz<ddn> d = dcr.Y;
    public static final dcz<ddn> e = dcr.Z;
    public static final dcs f = dcr.C;
    private final Map<dcb, efb> g;
    private final Map<dcb, efb> h;
    private static final int i = 3;
    private static final int j = 14;
    private static final int k = 4;
    private static final int l = 1;
    private static final int m = 7;
    private static final int n = 9;
    private static final efb D = cpn.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
    private static final efb E = cpn.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
    private static final efb F = cpn.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
    private static final efb G = cpn.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
    private static final efb H = cpn.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

    public cyj(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)((dcb)((dcb)((dcb)((dcb)this.C.b()).a(a, true)).a(c, ddn.a)).a(b, ddn.a)).a(d, ddn.a)).a(e, ddn.a)).a(f, false));
        this.g = this.a(4.0f, 3.0f, 16.0f, 0.0f, 14.0f, 16.0f);
        this.h = this.a(4.0f, 3.0f, 24.0f, 0.0f, 24.0f, 24.0f);
    }

    private static efb a(efb $$0, ddn $$1, efb $$2, efb $$3) {
        if ($$1 == ddn.c) {
            return eey.a($$0, $$3);
        }
        if ($$1 == ddn.b) {
            return eey.a($$0, $$2);
        }
        return $$0;
    }

    private Map<dcb, efb> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        float $$6 = 8.0f - $$0;
        float $$7 = 8.0f + $$0;
        float $$8 = 8.0f - $$1;
        float $$9 = 8.0f + $$1;
        efb $$10 = cpn.a($$6, 0.0, $$6, $$7, $$2, $$7);
        efb $$11 = cpn.a($$8, $$3, 0.0, $$9, $$4, $$9);
        efb $$12 = cpn.a($$8, $$3, $$8, $$9, $$4, 16.0);
        efb $$13 = cpn.a(0.0, $$3, $$8, $$9, $$4, $$9);
        efb $$14 = cpn.a($$8, $$3, $$8, 16.0, $$4, $$9);
        efb $$15 = cpn.a($$8, $$3, 0.0, $$9, $$5, $$9);
        efb $$16 = cpn.a($$8, $$3, $$8, $$9, $$5, 16.0);
        efb $$17 = cpn.a(0.0, $$3, $$8, $$9, $$5, $$9);
        efb $$18 = cpn.a($$8, $$3, $$8, 16.0, $$5, $$9);
        ImmutableMap.Builder $$19 = ImmutableMap.builder();
        for (Boolean $$20 : a.a()) {
            for (ddn $$21 : b.a()) {
                for (ddn $$22 : c.a()) {
                    for (ddn $$23 : e.a()) {
                        for (ddn $$24 : d.a()) {
                            efb $$25 = eey.a();
                            $$25 = cyj.a($$25, $$21, $$14, $$18);
                            $$25 = cyj.a($$25, $$23, $$13, $$17);
                            $$25 = cyj.a($$25, $$22, $$11, $$15);
                            $$25 = cyj.a($$25, $$24, $$12, $$16);
                            if ($$20.booleanValue()) {
                                $$25 = eey.a($$25, $$10);
                            }
                            dcb $$26 = (dcb)((dcb)((dcb)((dcb)((dcb)this.n().a(a, $$20)).a(b, $$21)).a(e, $$23)).a(c, $$22)).a(d, $$24);
                            $$19.put((Object)((dcb)$$26.a(f, false)), (Object)$$25);
                            $$19.put((Object)((dcb)$$26.a(f, true)), (Object)$$25);
                        }
                    }
                }
            }
        }
        return $$19.build();
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return this.g.get($$0);
    }

    @Override
    public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
        return this.h.get($$0);
    }

    @Override
    public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
        return false;
    }

    private boolean a(dcb $$0, boolean $$1, ha $$2) {
        cpn $$3 = $$0.b();
        boolean $$4 = $$3 instanceof csi && csi.a($$0, $$2);
        return $$0.a(amw.L) || !cyj.j($$0) && $$1 || $$3 instanceof ctl || $$4;
    }

    @Override
    public dcb a(cih $$0) {
        cmm $$1 = $$0.q();
        gu $$2 = $$0.a();
        dxe $$3 = $$0.q().b_($$0.a());
        gu $$4 = $$2.e();
        gu $$5 = $$2.h();
        gu $$6 = $$2.f();
        gu $$7 = $$2.g();
        gu $$8 = $$2.c();
        dcb $$9 = $$1.a_($$4);
        dcb $$10 = $$1.a_($$5);
        dcb $$11 = $$1.a_($$6);
        dcb $$12 = $$1.a_($$7);
        dcb $$13 = $$1.a_($$8);
        boolean $$14 = this.a($$9, $$9.d($$1, $$4, ha.d), ha.d);
        boolean $$15 = this.a($$10, $$10.d($$1, $$5, ha.e), ha.e);
        boolean $$16 = this.a($$11, $$11.d($$1, $$6, ha.c), ha.c);
        boolean $$17 = this.a($$12, $$12.d($$1, $$7, ha.f), ha.f);
        dcb $$18 = (dcb)this.n().a(f, $$3.a() == dxf.c);
        return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$0.c(f).booleanValue()) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
        }
        if ($$1 == ha.a) {
            return super.a($$0, $$1, $$2, $$3, $$4, $$5);
        }
        if ($$1 == ha.b) {
            return this.a((cmp)$$3, $$0, $$5, $$2);
        }
        return this.a($$3, $$4, $$0, $$5, $$2, $$1);
    }

    private static boolean a(dcb $$0, dde<ddn> $$1) {
        return $$0.c($$1) != ddn.a;
    }

    private static boolean a(efb $$0, efb $$1) {
        return !eey.c($$1, $$0, eem.e);
    }

    private dcb a(cmp $$0, dcb $$1, gu $$2, dcb $$3) {
        boolean $$4 = cyj.a($$1, c);
        boolean $$5 = cyj.a($$1, b);
        boolean $$6 = cyj.a($$1, d);
        boolean $$7 = cyj.a($$1, e);
        return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    private dcb a(cmp $$0, gu $$1, dcb $$2, gu $$3, dcb $$4, ha $$5) {
        ha $$6 = $$5.g();
        boolean $$7 = $$5 == ha.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : cyj.a($$2, c);
        boolean $$8 = $$5 == ha.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : cyj.a($$2, b);
        boolean $$9 = $$5 == ha.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : cyj.a($$2, d);
        boolean $$10 = $$5 == ha.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : cyj.a($$2, e);
        gu $$11 = $$1.c();
        dcb $$12 = $$0.a_($$11);
        return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
    }

    private dcb a(cmp $$0, dcb $$1, gu $$2, dcb $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
        efb $$8 = $$3.k($$0, $$2).a(ha.a);
        dcb $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
        return (dcb)$$9.a(a, this.a($$9, $$3, $$8));
    }

    private boolean a(dcb $$0, dcb $$1, efb $$2) {
        boolean $$13;
        boolean $$12;
        boolean $$3;
        boolean bl2 = $$3 = $$1.b() instanceof cyj && $$1.c(a) != false;
        if ($$3) {
            return true;
        }
        ddn $$4 = $$0.c(c);
        ddn $$5 = $$0.c(d);
        ddn $$6 = $$0.c(b);
        ddn $$7 = $$0.c(e);
        boolean $$8 = $$5 == ddn.a;
        boolean $$9 = $$7 == ddn.a;
        boolean $$10 = $$6 == ddn.a;
        boolean $$11 = $$4 == ddn.a;
        boolean bl3 = $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
        if ($$12) {
            return true;
        }
        boolean bl4 = $$13 = $$4 == ddn.c && $$5 == ddn.c || $$6 == ddn.c && $$7 == ddn.c;
        if ($$13) {
            return false;
        }
        return $$1.a(amw.aM) || cyj.a($$2, D);
    }

    private dcb a(dcb $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, efb $$5) {
        return (dcb)((dcb)((dcb)((dcb)$$0.a(c, this.a($$1, $$5, E))).a(b, this.a($$2, $$5, H))).a(d, this.a($$3, $$5, F))).a(e, this.a($$4, $$5, G));
    }

    private ddn a(boolean $$0, efb $$1, efb $$2) {
        if ($$0) {
            if (cyj.a($$1, $$2)) {
                return ddn.c;
            }
            return ddn.b;
        }
        return ddn.a;
    }

    @Override
    public dxe c_(dcb $$0) {
        if ($$0.c(f).booleanValue()) {
            return dxf.c.a(false);
        }
        return super.c_($$0);
    }

    @Override
    public boolean c(dcb $$0, cls $$1, gu $$2) {
        return $$0.c(f) == false;
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(a, c, b, e, d, f);
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        switch ($$1) {
            case c: {
                return (dcb)((dcb)((dcb)((dcb)$$0.a(c, $$0.c(d))).a(b, $$0.c(e))).a(d, $$0.c(c))).a(e, $$0.c(b));
            }
            case d: {
                return (dcb)((dcb)((dcb)((dcb)$$0.a(c, $$0.c(b))).a(b, $$0.c(d))).a(d, $$0.c(e))).a(e, $$0.c(c));
            }
            case b: {
                return (dcb)((dcb)((dcb)((dcb)$$0.a(c, $$0.c(e))).a(b, $$0.c(c))).a(d, $$0.c(b))).a(e, $$0.c(d));
            }
        }
        return $$0;
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        switch ($$1) {
            case b: {
                return (dcb)((dcb)$$0.a(c, $$0.c(d))).a(d, $$0.c(c));
            }
            case c: {
                return (dcb)((dcb)$$0.a(b, $$0.c(e))).a(e, $$0.c(b));
            }
        }
        return super.a($$0, $$1);
    }
}

