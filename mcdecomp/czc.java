/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class czc
extends czh
implements beg,
ccr,
cda {
    protected static final int c = 0;
    protected static final int d = 1;
    protected static final int e = 2;
    public static final int f = 0;
    private static final int[] r = new int[]{0};
    private static final int[] s = new int[]{2, 1};
    private static final int[] t = new int[]{1};
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 4;
    public static final int k = 200;
    public static final int l = 2;
    protected hn<cfz> m = hn.a(3, cfz.b);
    int u;
    int v;
    int w;
    int x;
    protected final cbp n = new cbp(){

        @Override
        public int a(int $$0) {
            switch ($$0) {
                case 0: {
                    return czc.this.u;
                }
                case 1: {
                    return czc.this.v;
                }
                case 2: {
                    return czc.this.w;
                }
                case 3: {
                    return czc.this.x;
                }
            }
            return 0;
        }

        @Override
        public void a(int $$0, int $$1) {
            switch ($$0) {
                case 0: {
                    czc.this.u = $$1;
                    break;
                }
                case 1: {
                    czc.this.v = $$1;
                    break;
                }
                case 2: {
                    czc.this.w = $$1;
                    break;
                }
                case 3: {
                    czc.this.x = $$1;
                    break;
                }
            }
        }

        @Override
        public int a() {
            return 4;
        }
    };
    private final Object2IntOpenHashMap<acq> y = new Object2IntOpenHashMap();
    private final cjd.a<bdq, ? extends cil> z;

    protected czc(czp<?> $$0, gu $$1, dcb $$2, cjf<? extends cil> $$3) {
        super($$0, $$1, $$2);
        this.z = cjd.b($$3);
    }

    public static Map<cfu, Integer> f() {
        LinkedHashMap $$0 = Maps.newLinkedHashMap();
        czc.a((Map<cfu, Integer>)$$0, cgc.pM, 20000);
        czc.a((Map<cfu, Integer>)$$0, cpo.iB, 16000);
        czc.a((Map<cfu, Integer>)$$0, cgc.rr, 2400);
        czc.a((Map<cfu, Integer>)$$0, cgc.nI, 1600);
        czc.a((Map<cfu, Integer>)$$0, cgc.nJ, 1600);
        czc.a((Map<cfu, Integer>)$$0, ane.r, 300);
        czc.a((Map<cfu, Integer>)$$0, ane.C, 300);
        czc.a((Map<cfu, Integer>)$$0, ane.b, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.w, 300);
        czc.a((Map<cfu, Integer>)$$0, ane.i, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.hU, 300);
        czc.a((Map<cfu, Integer>)$$0, ane.j, 150);
        czc.a((Map<cfu, Integer>)$$0, cpo.jC, 150);
        czc.a((Map<cfu, Integer>)$$0, ane.n, 300);
        czc.a((Map<cfu, Integer>)$$0, ane.m, 300);
        czc.a((Map<cfu, Integer>)$$0, ane.k, 300);
        czc.a((Map<cfu, Integer>)$$0, ane.l, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.aY, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.cl, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.cm, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.oa, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.dT, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.cv, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.gV, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.cA, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.gZ, 300);
        czc.a((Map<cfu, Integer>)$$0, ane.E, 300);
        czc.a((Map<cfu, Integer>)$$0, cgc.nG, 300);
        czc.a((Map<cfu, Integer>)$$0, cgc.qh, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.cO, 300);
        czc.a((Map<cfu, Integer>)$$0, ane.ap, 200);
        czc.a((Map<cfu, Integer>)$$0, ane.aE, 800);
        czc.a((Map<cfu, Integer>)$$0, cgc.nY, 200);
        czc.a((Map<cfu, Integer>)$$0, cgc.nX, 200);
        czc.a((Map<cfu, Integer>)$$0, cgc.ob, 200);
        czc.a((Map<cfu, Integer>)$$0, cgc.oa, 200);
        czc.a((Map<cfu, Integer>)$$0, cgc.nZ, 200);
        czc.a((Map<cfu, Integer>)$$0, ane.h, 200);
        czc.a((Map<cfu, Integer>)$$0, ane.am, 1200);
        czc.a((Map<cfu, Integer>)$$0, ane.a, 100);
        czc.a((Map<cfu, Integer>)$$0, ane.d, 100);
        czc.a((Map<cfu, Integer>)$$0, cgc.oB, 100);
        czc.a((Map<cfu, Integer>)$$0, ane.p, 100);
        czc.a((Map<cfu, Integer>)$$0, cgc.oC, 100);
        czc.a((Map<cfu, Integer>)$$0, ane.g, 67);
        czc.a((Map<cfu, Integer>)$$0, cpo.me, 4001);
        czc.a((Map<cfu, Integer>)$$0, cgc.uZ, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.mZ, 50);
        czc.a((Map<cfu, Integer>)$$0, cpo.bv, 100);
        czc.a((Map<cfu, Integer>)$$0, cpo.nS, 50);
        czc.a((Map<cfu, Integer>)$$0, cpo.nT, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.nU, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.nX, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.nY, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.ob, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.pc, 300);
        czc.a((Map<cfu, Integer>)$$0, cpo.rx, 100);
        czc.a((Map<cfu, Integer>)$$0, cpo.ry, 100);
        czc.a((Map<cfu, Integer>)$$0, cpo.ac, 300);
        return $$0;
    }

    private static boolean b(cfu $$0) {
        return $$0.j().a(ane.ag);
    }

    private static void a(Map<cfu, Integer> $$0, anl<cfu> $$1, int $$2) {
        for (he<cfu> $$3 : jb.i.c($$1)) {
            if (czc.b($$3.a())) continue;
            $$0.put($$3.a(), $$2);
        }
    }

    private static void a(Map<cfu, Integer> $$0, cml $$1, int $$2) {
        cfu $$3 = $$1.k();
        if (czc.b($$3)) {
            if (aa.aS) {
                throw ac.b(new IllegalStateException("A developer tried to explicitly make fire resistant item " + $$3.m(null).getString() + " a furnace fuel. That will not work!"));
            }
            return;
        }
        $$0.put($$3, $$2);
    }

    private boolean i() {
        return this.u > 0;
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.m = hn.a(this.b(), cfz.b);
        bdr.b($$0, this.m);
        this.u = $$0.g("BurnTime");
        this.w = $$0.g("CookTime");
        this.x = $$0.g("CookTimeTotal");
        this.v = this.a(this.m.get(1));
        qr $$1 = $$0.p("RecipesUsed");
        for (String $$2 : $$1.e()) {
            this.y.put((Object)new acq($$2), $$1.h($$2));
        }
    }

    @Override
    protected void b(qr $$0) {
        super.b($$0);
        $$0.a("BurnTime", (short)this.u);
        $$0.a("CookTime", (short)this.w);
        $$0.a("CookTimeTotal", (short)this.x);
        bdr.a($$0, this.m);
        qr $$12 = new qr();
        this.y.forEach(($$1, $$2) -> $$12.a($$1.toString(), (int)$$2));
        $$0.a("RecipesUsed", $$12);
    }

    public static void a(cmm $$0, gu $$1, dcb $$2, czc $$3) {
        boolean $$8;
        boolean $$4 = $$3.i();
        boolean $$5 = false;
        if ($$3.i()) {
            --$$3.u;
        }
        cfz $$6 = $$3.m.get(1);
        boolean $$7 = !$$3.m.get(0).b();
        boolean bl2 = $$8 = !$$6.b();
        if ($$3.i() || $$8 && $$7) {
            cjc<?> $$10;
            if ($$7) {
                cjc $$9 = $$3.z.a($$3, $$0).orElse(null);
            } else {
                $$10 = null;
            }
            int $$11 = $$3.ac_();
            if (!$$3.i() && czc.a($$0.B_(), $$10, $$3.m, $$11)) {
                $$3.v = $$3.u = $$3.a($$6);
                if ($$3.i()) {
                    $$5 = true;
                    if ($$8) {
                        cfu $$12 = $$6.d();
                        $$6.h(1);
                        if ($$6.b()) {
                            cfu $$13 = $$12.s();
                            $$3.m.set(1, $$13 == null ? cfz.b : new cfz($$13));
                        }
                    }
                }
            }
            if ($$3.i() && czc.a($$0.B_(), $$10, $$3.m, $$11)) {
                ++$$3.w;
                if ($$3.w == $$3.x) {
                    $$3.w = 0;
                    $$3.x = czc.a($$0, $$3);
                    if (czc.b($$0.B_(), $$10, $$3.m, $$11)) {
                        $$3.a($$10);
                    }
                    $$5 = true;
                }
            } else {
                $$3.w = 0;
            }
        } else if (!$$3.i() && $$3.w > 0) {
            $$3.w = apa.a($$3.w - 2, 0, $$3.x);
        }
        if ($$4 != $$3.i()) {
            $$5 = true;
            $$2 = (dcb)$$2.a(coh.b, $$3.i());
            $$0.a($$1, $$2, 3);
        }
        if ($$5) {
            czc.a($$0, $$1, $$2);
        }
    }

    private static boolean a(hs $$0, @Nullable cjc<?> $$1, hn<cfz> $$2, int $$3) {
        if ($$2.get(0).b() || $$1 == null) {
            return false;
        }
        cfz $$4 = $$1.a($$0);
        if ($$4.b()) {
            return false;
        }
        cfz $$5 = $$2.get(2);
        if ($$5.b()) {
            return true;
        }
        if (!cfz.b($$5, $$4)) {
            return false;
        }
        if ($$5.L() < $$3 && $$5.L() < $$5.g()) {
            return true;
        }
        return $$5.L() < $$4.g();
    }

    private static boolean b(hs $$0, @Nullable cjc<?> $$1, hn<cfz> $$2, int $$3) {
        if ($$1 == null || !czc.a($$0, $$1, $$2, $$3)) {
            return false;
        }
        cfz $$4 = $$2.get(0);
        cfz $$5 = $$1.a($$0);
        cfz $$6 = $$2.get(2);
        if ($$6.b()) {
            $$2.set(2, $$5.p());
        } else if ($$6.a($$5.d())) {
            $$6.g(1);
        }
        if ($$4.a(cpo.aP.k()) && !$$2.get(1).b() && $$2.get(1).a(cgc.pK)) {
            $$2.set(1, new cfz(cgc.pL));
        }
        $$4.h(1);
        return true;
    }

    protected int a(cfz $$0) {
        if ($$0.b()) {
            return 0;
        }
        cfu $$1 = $$0.d();
        return czc.f().getOrDefault($$1, 0);
    }

    private static int a(cmm $$0, czc $$1) {
        return $$1.z.a($$1, $$0).map(cil::d).orElse(200);
    }

    public static boolean b(cfz $$0) {
        return czc.f().containsKey($$0.d());
    }

    @Override
    public int[] a(ha $$0) {
        if ($$0 == ha.a) {
            return s;
        }
        if ($$0 == ha.b) {
            return r;
        }
        return t;
    }

    @Override
    public boolean a(int $$0, cfz $$1, @Nullable ha $$2) {
        return this.b($$0, $$1);
    }

    @Override
    public boolean b(int $$0, cfz $$1, ha $$2) {
        if ($$2 == ha.a && $$0 == 1) {
            return $$1.a(cgc.pL) || $$1.a(cgc.pK);
        }
        return true;
    }

    @Override
    public int b() {
        return this.m.size();
    }

    @Override
    public boolean ab_() {
        for (cfz $$0 : this.m) {
            if ($$0.b()) continue;
            return false;
        }
        return true;
    }

    @Override
    public cfz a(int $$0) {
        return this.m.get($$0);
    }

    @Override
    public cfz a(int $$0, int $$1) {
        return bdr.a(this.m, $$0, $$1);
    }

    @Override
    public cfz b(int $$0) {
        return bdr.a(this.m, $$0);
    }

    @Override
    public void a(int $$0, cfz $$1) {
        cfz $$2 = this.m.get($$0);
        boolean $$3 = !$$1.b() && cfz.c($$2, $$1);
        this.m.set($$0, $$1);
        if ($$1.L() > this.ac_()) {
            $$1.f(this.ac_());
        }
        if ($$0 == 0 && !$$3) {
            this.x = czc.a(this.o, this);
            this.w = 0;
            this.e();
        }
    }

    @Override
    public boolean a(byo $$0) {
        return bdq.a(this, $$0);
    }

    @Override
    public boolean b(int $$0, cfz $$1) {
        if ($$0 == 2) {
            return false;
        }
        if ($$0 == 1) {
            cfz $$2 = this.m.get(1);
            return czc.b($$1) || $$1.a(cgc.pK) && !$$2.a(cgc.pK);
        }
        return true;
    }

    @Override
    public void a() {
        this.m.clear();
    }

    @Override
    public void a(@Nullable cjc<?> $$0) {
        if ($$0 != null) {
            acq $$1 = $$0.e();
            this.y.addTo((Object)$$1, 1);
        }
    }

    @Override
    @Nullable
    public cjc<?> d() {
        return null;
    }

    @Override
    public void a(byo $$0, List<cfz> $$1) {
    }

    public void a(aig $$0) {
        List<cjc<?>> $$1 = this.a($$0.x(), $$0.dg());
        $$0.a((Collection<cjc<?>>)$$1);
        for (cjc<?> $$2 : $$1) {
            if ($$2 == null) continue;
            $$0.a($$2, this.m);
        }
        this.y.clear();
    }

    public List<cjc<?>> a(aif $$0, eei $$1) {
        ArrayList $$2 = Lists.newArrayList();
        for (Object2IntMap.Entry $$3 : this.y.object2IntEntrySet()) {
            $$0.q().a((acq)$$3.getKey()).ifPresent($$4 -> {
                $$2.add($$4);
                czc.a($$0, $$1, $$3.getIntValue(), ((cil)$$4).b());
            });
        }
        return $$2;
    }

    private static void a(aif $$0, eei $$1, int $$2, float $$3) {
        int $$4 = apa.d((float)$$2 * $$3);
        float $$5 = apa.h((float)$$2 * $$3);
        if ($$5 != 0.0f && Math.random() < (double)$$5) {
            ++$$4;
        }
        bfp.a($$0, $$1, $$4);
    }

    @Override
    public void a(bys $$0) {
        for (cfz $$1 : this.m) {
            $$0.b($$1);
        }
    }
}

