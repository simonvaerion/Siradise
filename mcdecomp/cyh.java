/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cyh
extends cpn {
    public static final dcs a = cuz.e;
    public static final dcs b = cuz.a;
    public static final dcs c = cuz.b;
    public static final dcs d = cuz.c;
    public static final dcs e = cuz.d;
    public static final Map<ha, dcs> f = cuz.g.entrySet().stream().filter($$0 -> $$0.getKey() != ha.a).collect(ac.a());
    protected static final float g = 1.0f;
    private static final efb h = cpn.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
    private static final efb i = cpn.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
    private static final efb j = cpn.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    private static final efb k = cpn.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
    private static final efb l = cpn.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
    private final Map<dcb, efb> m;

    public cyh(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)((dcb)((dcb)((dcb)this.C.b()).a(a, false)).a(b, false)).a(c, false)).a(d, false)).a(e, false));
        this.m = ImmutableMap.copyOf(this.C.a().stream().collect(Collectors.toMap(Function.identity(), cyh::h)));
    }

    private static efb h(dcb $$0) {
        efb $$1 = eey.a();
        if ($$0.c(a).booleanValue()) {
            $$1 = h;
        }
        if ($$0.c(b).booleanValue()) {
            $$1 = eey.a($$1, k);
        }
        if ($$0.c(d).booleanValue()) {
            $$1 = eey.a($$1, l);
        }
        if ($$0.c(c).booleanValue()) {
            $$1 = eey.a($$1, j);
        }
        if ($$0.c(e).booleanValue()) {
            $$1 = eey.a($$1, i);
        }
        return $$1.b() ? eey.b() : $$1;
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return this.m.get($$0);
    }

    @Override
    public boolean c(dcb $$0, cls $$1, gu $$2) {
        return true;
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        return this.n(this.i($$0, $$1, $$2));
    }

    private boolean n(dcb $$0) {
        return this.o($$0) > 0;
    }

    private int o(dcb $$0) {
        int $$1 = 0;
        for (dcs $$2 : f.values()) {
            if (!$$0.c($$2).booleanValue()) continue;
            ++$$1;
        }
        return $$1;
    }

    private boolean b(cls $$0, gu $$1, ha $$2) {
        if ($$2 == ha.a) {
            return false;
        }
        gu $$3 = $$1.a($$2);
        if (cyh.a($$0, $$3, $$2)) {
            return true;
        }
        if ($$2.o() != ha.a.b) {
            dcs $$4 = f.get($$2);
            dcb $$5 = $$0.a_($$1.c());
            return $$5.a(this) && $$5.c($$4) != false;
        }
        return false;
    }

    public static boolean a(cls $$0, gu $$1, ha $$2) {
        return cul.a($$0, $$2, $$1, $$0.a_($$1));
    }

    private dcb i(dcb $$0, cls $$1, gu $$2) {
        gu $$3 = $$2.c();
        if ($$0.c(a).booleanValue()) {
            $$0 = (dcb)$$0.a(a, cyh.a($$1, $$3, ha.a));
        }
        dca.a $$4 = null;
        for (ha $$5 : ha.c.a) {
            dcs $$6 = cyh.a($$5);
            if (!$$0.c($$6).booleanValue()) continue;
            boolean $$7 = this.b($$1, $$2, $$5);
            if (!$$7) {
                if ($$4 == null) {
                    $$4 = $$1.a_($$3);
                }
                $$7 = $$4.a(this) && $$4.c($$6) != false;
            }
            $$0 = (dcb)$$0.a($$6, $$7);
        }
        return $$0;
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$1 == ha.a) {
            return super.a($$0, $$1, $$2, $$3, $$4, $$5);
        }
        dcb $$6 = this.i($$0, $$3, $$4);
        if (!this.n($$6)) {
            return cpo.a.n();
        }
        return $$6;
    }

    @Override
    public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
        dcb $$20;
        dcb $$19;
        gu $$17;
        dcb $$18;
        if (!$$1.X().b(cmi.T)) {
            return;
        }
        if ($$3.a(4) != 0) {
            return;
        }
        ha $$4 = ha.b($$3);
        gu $$5 = $$2.c();
        if ($$4.o().d() && !$$0.c(cyh.a($$4)).booleanValue()) {
            if (!this.a((cls)$$1, $$2)) {
                return;
            }
            gu $$6 = $$2.a($$4);
            dcb $$7 = $$1.a_($$6);
            if ($$7.i()) {
                ha $$8 = $$4.h();
                ha $$9 = $$4.i();
                boolean $$10 = $$0.c(cyh.a($$8));
                boolean $$11 = $$0.c(cyh.a($$9));
                gu $$12 = $$6.a($$8);
                gu $$13 = $$6.a($$9);
                if ($$10 && cyh.a((cls)$$1, $$12, $$8)) {
                    $$1.a($$6, (dcb)this.n().a(cyh.a($$8), true), 2);
                } else if ($$11 && cyh.a((cls)$$1, $$13, $$9)) {
                    $$1.a($$6, (dcb)this.n().a(cyh.a($$9), true), 2);
                } else {
                    ha $$14 = $$4.g();
                    if ($$10 && $$1.t($$12) && cyh.a((cls)$$1, $$2.a($$8), $$14)) {
                        $$1.a($$12, (dcb)this.n().a(cyh.a($$14), true), 2);
                    } else if ($$11 && $$1.t($$13) && cyh.a((cls)$$1, $$2.a($$9), $$14)) {
                        $$1.a($$13, (dcb)this.n().a(cyh.a($$14), true), 2);
                    } else if ((double)$$3.i() < 0.05 && cyh.a((cls)$$1, $$6.c(), ha.b)) {
                        $$1.a($$6, (dcb)this.n().a(a, true), 2);
                    }
                }
            } else if (cyh.a((cls)$$1, $$6, $$4)) {
                $$1.a($$2, (dcb)$$0.a(cyh.a($$4), true), 2);
            }
            return;
        }
        if ($$4 == ha.b && $$2.v() < $$1.aj() - 1) {
            if (this.b($$1, $$2, $$4)) {
                $$1.a($$2, (dcb)$$0.a(a, true), 2);
                return;
            }
            if ($$1.t($$5)) {
                if (!this.a((cls)$$1, $$2)) {
                    return;
                }
                dcb $$15 = $$0;
                for (ha $$16 : ha.c.a) {
                    if (!$$3.h() && cyh.a((cls)$$1, $$5.a($$16), $$16)) continue;
                    $$15 = (dcb)$$15.a(cyh.a($$16), false);
                }
                if (this.p($$15)) {
                    $$1.a($$5, $$15, 2);
                }
                return;
            }
        }
        if ($$2.v() > $$1.C_() && (($$18 = $$1.a_($$17 = $$2.d())).i() || $$18.a(this)) && ($$19 = $$18.i() ? this.n() : $$18) != ($$20 = this.a($$0, $$19, $$3)) && this.p($$20)) {
            $$1.a($$17, $$20, 2);
        }
    }

    private dcb a(dcb $$0, dcb $$1, apf $$2) {
        for (ha $$3 : ha.c.a) {
            dcs $$4;
            if (!$$2.h() || !$$0.c($$4 = cyh.a($$3)).booleanValue()) continue;
            $$1 = (dcb)$$1.a($$4, true);
        }
        return $$1;
    }

    private boolean p(dcb $$0) {
        return $$0.c(b) != false || $$0.c(c) != false || $$0.c(d) != false || $$0.c(e) != false;
    }

    private boolean a(cls $$0, gu $$1) {
        int $$2 = 4;
        Iterable<gu> $$3 = gu.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
        int $$4 = 5;
        for (gu $$5 : $$3) {
            if (!$$0.a_($$5).a(this) || --$$4 > 0) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean a(dcb $$0, cih $$1) {
        dcb $$2 = $$1.q().a_($$1.a());
        if ($$2.a(this)) {
            return this.o($$2) < f.size();
        }
        return super.a($$0, $$1);
    }

    @Override
    @Nullable
    public dcb a(cih $$0) {
        dcb $$1 = $$0.q().a_($$0.a());
        boolean $$2 = $$1.a(this);
        dcb $$3 = $$2 ? $$1 : this.n();
        for (ha $$4 : $$0.f()) {
            boolean $$6;
            if ($$4 == ha.a) continue;
            dcs $$5 = cyh.a($$4);
            boolean bl2 = $$6 = $$2 && $$1.c($$5) != false;
            if ($$6 || !this.b($$0.q(), $$0.a(), $$4)) continue;
            return (dcb)$$3.a($$5, true);
        }
        return $$2 ? $$3 : null;
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(a, b, c, d, e);
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        switch ($$1) {
            case c: {
                return (dcb)((dcb)((dcb)((dcb)$$0.a(b, $$0.c(d))).a(c, $$0.c(e))).a(d, $$0.c(b))).a(e, $$0.c(c));
            }
            case d: {
                return (dcb)((dcb)((dcb)((dcb)$$0.a(b, $$0.c(c))).a(c, $$0.c(d))).a(d, $$0.c(e))).a(e, $$0.c(b));
            }
            case b: {
                return (dcb)((dcb)((dcb)((dcb)$$0.a(b, $$0.c(e))).a(c, $$0.c(b))).a(d, $$0.c(c))).a(e, $$0.c(d));
            }
        }
        return $$0;
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        switch ($$1) {
            case b: {
                return (dcb)((dcb)$$0.a(b, $$0.c(d))).a(d, $$0.c(b));
            }
            case c: {
                return (dcb)((dcb)$$0.a(c, $$0.c(e))).a(e, $$0.c(c));
            }
        }
        return super.a($$0, $$1);
    }

    public static dcs a(ha $$0) {
        return f.get($$0);
    }
}

