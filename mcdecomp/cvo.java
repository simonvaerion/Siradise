/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Map;
import javax.annotation.Nullable;

public class cvo
extends cpn {
    public static final dcz<ddg> a = dcr.ab;
    public static final dcz<ddg> b = dcr.aa;
    public static final dcz<ddg> c = dcr.ac;
    public static final dcz<ddg> d = dcr.ad;
    public static final ddb e = dcr.aT;
    public static final Map<ha, dcz<ddg>> f = Maps.newEnumMap((Map)ImmutableMap.of((Object)ha.c, a, (Object)ha.f, b, (Object)ha.d, c, (Object)ha.e, d));
    protected static final int g = 1;
    protected static final int h = 3;
    protected static final int i = 13;
    protected static final int j = 3;
    protected static final int k = 13;
    private static final efb l = cpn.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
    private static final Map<ha, efb> m = Maps.newEnumMap((Map)ImmutableMap.of((Object)ha.c, (Object)cpn.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0), (Object)ha.d, (Object)cpn.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0), (Object)ha.f, (Object)cpn.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0), (Object)ha.e, (Object)cpn.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)));
    private static final Map<ha, efb> n = Maps.newEnumMap((Map)ImmutableMap.of((Object)ha.c, (Object)eey.a(m.get(ha.c), cpn.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)), (Object)ha.d, (Object)eey.a(m.get(ha.d), cpn.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)), (Object)ha.f, (Object)eey.a(m.get(ha.f), cpn.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)), (Object)ha.e, (Object)eey.a(m.get(ha.e), cpn.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))));
    private static final Map<dcb, efb> D = Maps.newHashMap();
    private static final eei[] E = ac.a(new eei[16], (T $$0) -> {
        for (int $$1 = 0; $$1 <= 15; ++$$1) {
            float $$2;
            float $$3 = $$2 * 0.6f + (($$2 = (float)$$1 / 15.0f) > 0.0f ? 0.4f : 0.3f);
            float $$4 = apa.a($$2 * $$2 * 0.7f - 0.5f, 0.0f, 1.0f);
            float $$5 = apa.a($$2 * $$2 * 0.6f - 0.7f, 0.0f, 1.0f);
            $$0[$$1] = new eei($$3, $$4, $$5);
        }
    });
    private static final float F = 0.2f;
    private final dcb G;
    private boolean H = true;

    public cvo(dca.d $$0) {
        super($$0);
        this.k((dcb)((dcb)((dcb)((dcb)((dcb)((dcb)this.C.b()).a(a, ddg.c)).a(b, ddg.c)).a(c, ddg.c)).a(d, ddg.c)).a(e, 0));
        this.G = (dcb)((dcb)((dcb)((dcb)this.n().a(a, ddg.b)).a(b, ddg.b)).a(c, ddg.b)).a(d, ddg.b);
        for (dcb $$1 : this.l().a()) {
            if ($$1.c(e) != 0) continue;
            D.put($$1, this.n($$1));
        }
    }

    private efb n(dcb $$0) {
        efb $$1 = l;
        for (ha $$2 : ha.c.a) {
            ddg $$3 = (ddg)$$0.c(f.get($$2));
            if ($$3 == ddg.b) {
                $$1 = eey.a($$1, m.get($$2));
                continue;
            }
            if ($$3 != ddg.a) continue;
            $$1 = eey.a($$1, n.get($$2));
        }
        return $$1;
    }

    @Override
    public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
        return D.get($$0.a(e, 0));
    }

    @Override
    public dcb a(cih $$0) {
        return this.a((cls)$$0.q(), this.G, $$0.a());
    }

    private dcb a(cls $$0, dcb $$1, gu $$2) {
        boolean $$9;
        boolean $$3 = cvo.p($$1);
        $$1 = this.b($$0, (dcb)this.n().a(e, $$1.c(e)), $$2);
        if ($$3 && cvo.p($$1)) {
            return $$1;
        }
        boolean $$4 = $$1.c(a).a();
        boolean $$5 = $$1.c(c).a();
        boolean $$6 = $$1.c(b).a();
        boolean $$7 = $$1.c(d).a();
        boolean $$8 = !$$4 && !$$5;
        boolean bl2 = $$9 = !$$6 && !$$7;
        if (!$$7 && $$8) {
            $$1 = (dcb)$$1.a(d, ddg.b);
        }
        if (!$$6 && $$8) {
            $$1 = (dcb)$$1.a(b, ddg.b);
        }
        if (!$$4 && $$9) {
            $$1 = (dcb)$$1.a(a, ddg.b);
        }
        if (!$$5 && $$9) {
            $$1 = (dcb)$$1.a(c, ddg.b);
        }
        return $$1;
    }

    private dcb b(cls $$0, dcb $$1, gu $$2) {
        boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);
        for (ha $$4 : ha.c.a) {
            if (((ddg)$$1.c(f.get($$4))).a()) continue;
            ddg $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = (dcb)$$1.a(f.get($$4), $$5);
        }
        return $$1;
    }

    @Override
    public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
        if ($$1 == ha.a) {
            return $$0;
        }
        if ($$1 == ha.b) {
            return this.a((cls)$$3, $$0, $$4);
        }
        ddg $$6 = this.a((cls)$$3, $$4, $$1);
        if ($$6.a() == ((ddg)$$0.c(f.get($$1))).a() && !cvo.o($$0)) {
            return (dcb)$$0.a(f.get($$1), $$6);
        }
        return this.a((cls)$$3, (dcb)((dcb)this.G.a(e, $$0.c(e))).a(f.get($$1), $$6), $$4);
    }

    private static boolean o(dcb $$0) {
        return $$0.c(a).a() && $$0.c(c).a() && $$0.c(b).a() && $$0.c(d).a();
    }

    private static boolean p(dcb $$0) {
        return !$$0.c(a).a() && !$$0.c(c).a() && !$$0.c(b).a() && !$$0.c(d).a();
    }

    @Override
    public void a(dcb $$0, cmn $$1, gu $$2, int $$3, int $$4) {
        gu.a $$5 = new gu.a();
        for (ha $$6 : ha.c.a) {
            ddg $$7 = (ddg)$$0.c(f.get($$6));
            if ($$7 == ddg.c || $$1.a_($$5.a((hz)$$2, $$6)).a(this)) continue;
            $$5.c(ha.a);
            dcb $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
                gu $$9 = $$5.a($$6.g());
                $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }
            $$5.a((hz)$$2, $$6).c(ha.b);
            dcb $$10 = $$1.a_($$5);
            if (!$$10.a(this)) continue;
            gu $$11 = $$5.a($$6.g());
            $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
        }
    }

    private ddg a(cls $$0, gu $$1, ha $$2) {
        return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
    }

    private ddg a(cls $$0, gu $$1, ha $$2, boolean $$3) {
        gu $$4 = $$1.a($$2);
        dcb $$5 = $$0.a_($$4);
        if ($$3) {
            boolean $$6;
            boolean bl2 = $$6 = $$5.b() instanceof cya || this.b($$0, $$4, $$5);
            if ($$6 && cvo.h($$0.a_($$4.c()))) {
                if ($$5.d($$0, $$4, $$2.g())) {
                    return ddg.a;
                }
                return ddg.b;
            }
        }
        if (cvo.a($$5, $$2) || !$$5.g($$0, $$4) && cvo.h($$0.a_($$4.d()))) {
            return ddg.b;
        }
        return ddg.c;
    }

    @Override
    public boolean a(dcb $$0, cmp $$1, gu $$2) {
        gu $$3 = $$2.d();
        dcb $$4 = $$1.a_($$3);
        return this.b((cls)$$1, $$3, $$4);
    }

    private boolean b(cls $$0, gu $$1, dcb $$2) {
        return $$2.d($$0, $$1, ha.b) || $$2.a(cpo.hc);
    }

    private void a(cmm $$0, gu $$1, dcb $$2) {
        int $$3 = this.a($$0, $$1);
        if ($$2.c(e) != $$3) {
            if ($$0.a_($$1) == $$2) {
                $$0.a($$1, (dcb)$$2.a(e, $$3), 2);
            }
            HashSet $$4 = Sets.newHashSet();
            $$4.add($$1);
            for (ha $$5 : ha.values()) {
                $$4.add($$1.a($$5));
            }
            for (gu $$6 : $$4) {
                $$0.a($$6, this);
            }
        }
    }

    private int a(cmm $$0, gu $$1) {
        this.H = false;
        int $$2 = $$0.C($$1);
        this.H = true;
        int $$3 = 0;
        if ($$2 < 15) {
            for (ha $$4 : ha.c.a) {
                gu $$5 = $$1.a($$4);
                dcb $$6 = $$0.a_($$5);
                $$3 = Math.max($$3, this.q($$6));
                gu $$7 = $$1.c();
                if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
                    $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
                    continue;
                }
                if ($$6.g($$0, $$5)) continue;
                $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
        }
        return Math.max($$2, $$3 - 1);
    }

    private int q(dcb $$0) {
        return $$0.a(this) ? $$0.c(e) : 0;
    }

    private void b(cmm $$0, gu $$1) {
        if (!$$0.a_($$1).a(this)) {
            return;
        }
        $$0.a($$1, this);
        for (ha $$2 : ha.values()) {
            $$0.a($$1.a($$2), this);
        }
    }

    @Override
    public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$3.a($$0.b()) || $$1.B) {
            return;
        }
        this.a($$1, $$2, $$0);
        for (ha $$5 : ha.c.b) {
            $$1.a($$2.a($$5), this);
        }
        this.c($$1, $$2);
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
        if ($$4 || $$0.a($$3.b())) {
            return;
        }
        super.a($$0, $$1, $$2, $$3, $$4);
        if ($$1.B) {
            return;
        }
        for (ha $$5 : ha.values()) {
            $$1.a($$2.a($$5), this);
        }
        this.a($$1, $$2, $$0);
        this.c($$1, $$2);
    }

    private void c(cmm $$0, gu $$1) {
        for (ha $$2 : ha.c.a) {
            this.b($$0, $$1.a($$2));
        }
        for (ha $$3 : ha.c.a) {
            gu $$4 = $$1.a($$3);
            if ($$0.a_($$4).g($$0, $$4)) {
                this.b($$0, $$4.c());
                continue;
            }
            this.b($$0, $$4.d());
        }
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
        if ($$1.B) {
            return;
        }
        if ($$0.a((cmp)$$1, $$2)) {
            this.a($$1, $$2, $$0);
        } else {
            cvo.c($$0, $$1, $$2);
            $$1.a($$2, false);
        }
    }

    @Override
    public int b(dcb $$0, cls $$1, gu $$2, ha $$3) {
        if (!this.H) {
            return 0;
        }
        return $$0.b($$1, $$2, $$3);
    }

    @Override
    public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
        if (!this.H || $$3 == ha.a) {
            return 0;
        }
        int $$4 = $$0.c(e);
        if ($$4 == 0) {
            return 0;
        }
        if ($$3 == ha.b || ((ddg)this.a($$1, $$0, $$2).c(f.get($$3.g()))).a()) {
            return $$4;
        }
        return 0;
    }

    protected static boolean h(dcb $$0) {
        return cvo.a($$0, null);
    }

    protected static boolean a(dcb $$0, @Nullable ha $$1) {
        if ($$0.a(cpo.cw)) {
            return true;
        }
        if ($$0.a(cpo.ei)) {
            ha $$2 = $$0.c(cvt.aC);
            return $$2 == $$1 || $$2.g() == $$1;
        }
        if ($$0.a(cpo.kO)) {
            return $$1 == $$0.c(cuw.a);
        }
        return $$0.m() && $$1 != null;
    }

    @Override
    public boolean f_(dcb $$0) {
        return this.H;
    }

    public static int b(int $$0) {
        eei $$1 = E[$$0];
        return apa.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
    }

    private void a(cmm $$0, apf $$1, gu $$2, eei $$3, ha $$4, ha $$5, float $$6, float $$7) {
        float $$8 = $$7 - $$6;
        if ($$1.i() >= 0.2f * $$8) {
            return;
        }
        float $$9 = 0.4375f;
        float $$10 = $$6 + $$8 * $$1.i();
        double $$11 = 0.5 + (double)(0.4375f * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
        double $$12 = 0.5 + (double)(0.4375f * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
        double $$13 = 0.5 + (double)(0.4375f * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
        $$0.a(new ip($$3.j(), 1.0f), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
    }

    @Override
    public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
        int $$4 = $$0.c(e);
        if ($$4 == 0) {
            return;
        }
        block4: for (ha $$5 : ha.c.a) {
            ddg $$6 = (ddg)$$0.c(f.get($$5));
            switch ($$6) {
                case a: {
                    this.a($$1, $$3, $$2, E[$$4], $$5, ha.b, -0.5f, 0.5f);
                }
                case b: {
                    this.a($$1, $$3, $$2, E[$$4], ha.a, $$5, 0.0f, 0.5f);
                    continue block4;
                }
            }
            this.a($$1, $$3, $$2, E[$$4], ha.a, $$5, 0.0f, 0.3f);
        }
    }

    @Override
    public dcb a(dcb $$0, cvz $$1) {
        switch ($$1) {
            case c: {
                return (dcb)((dcb)((dcb)((dcb)$$0.a(a, $$0.c(c))).a(b, $$0.c(d))).a(c, $$0.c(a))).a(d, $$0.c(b));
            }
            case d: {
                return (dcb)((dcb)((dcb)((dcb)$$0.a(a, $$0.c(b))).a(b, $$0.c(c))).a(c, $$0.c(d))).a(d, $$0.c(a));
            }
            case b: {
                return (dcb)((dcb)((dcb)((dcb)$$0.a(a, $$0.c(d))).a(b, $$0.c(a))).a(c, $$0.c(b))).a(d, $$0.c(c));
            }
        }
        return $$0;
    }

    @Override
    public dcb a(dcb $$0, cui $$1) {
        switch ($$1) {
            case b: {
                return (dcb)((dcb)$$0.a(a, $$0.c(c))).a(c, $$0.c(a));
            }
            case c: {
                return (dcb)((dcb)$$0.a(b, $$0.c(d))).a(d, $$0.c(b));
            }
        }
        return super.a($$0, $$1);
    }

    @Override
    protected void a(dcc.a<cpn, dcb> $$0) {
        $$0.a(a, b, c, d, e);
    }

    @Override
    public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
        if (!$$3.fO().e) {
            return bdx.d;
        }
        if (cvo.o($$0) || cvo.p($$0)) {
            dcb $$6 = cvo.o($$0) ? this.n() : this.G;
            $$6 = (dcb)$$6.a(e, $$0.c(e));
            if (($$6 = this.a((cls)$$1, $$6, $$2)) != $$0) {
                $$1.a($$2, $$6, 3);
                this.a($$1, $$2, $$0, $$6);
                return bdx.a;
            }
        }
        return bdx.d;
    }

    private void a(cmm $$0, gu $$1, dcb $$2, dcb $$3) {
        for (ha $$4 : ha.c.a) {
            gu $$5 = $$1.a($$4);
            if (((ddg)$$2.c(f.get($$4))).a() == ((ddg)$$3.c(f.get($$4))).a() || !$$0.a_($$5).g($$0, $$5)) continue;
            $$0.a($$5, $$3.b(), $$4.g());
        }
    }
}

