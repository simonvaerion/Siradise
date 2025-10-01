/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bsb
extends bsi
implements bgy<b>,
bru {
    private static final aby<Integer> ca = acb.a(bsb.class, aca.b);
    private static final Predicate<bgb> cb = new Predicate<bgb>(){

        public boolean a(@Nullable bgb $$0) {
            return $$0 != null && ce.containsKey($$0.ae());
        }

        @Override
        public /* synthetic */ boolean test(@Nullable Object object) {
            return this.a((bgb)object);
        }
    };
    private static final cfu cc = cgc.re;
    private static final Set<cfu> cd = Sets.newHashSet((Object[])new cfu[]{cgc.oH, cgc.rk, cgc.rj, cgc.ur, cgc.uo, cgc.up});
    static final Map<bfn<?>, amg> ce = ac.a(Maps.newHashMap(), (T $$0) -> {
        $$0.put(bfn.i, amh.ra);
        $$0.put(bfn.n, amh.rw);
        $$0.put(bfn.u, amh.rb);
        $$0.put(bfn.y, amh.rc);
        $$0.put(bfn.A, amh.rd);
        $$0.put(bfn.C, amh.re);
        $$0.put(bfn.F, amh.rf);
        $$0.put(bfn.G, amh.rg);
        $$0.put(bfn.Q, amh.rh);
        $$0.put(bfn.V, amh.ri);
        $$0.put(bfn.W, amh.rj);
        $$0.put(bfn.Z, amh.rk);
        $$0.put(bfn.aa, amh.rl);
        $$0.put(bfn.al, amh.rm);
        $$0.put(bfn.au, amh.rn);
        $$0.put(bfn.aw, amh.ro);
        $$0.put(bfn.ax, amh.rp);
        $$0.put(bfn.ay, amh.rq);
        $$0.put(bfn.aD, amh.rr);
        $$0.put(bfn.aG, amh.rs);
        $$0.put(bfn.aI, amh.rt);
        $$0.put(bfn.aJ, amh.ru);
        $$0.put(bfn.aL, amh.rv);
        $$0.put(bfn.aS, amh.rw);
        $$0.put(bfn.aU, amh.rx);
        $$0.put(bfn.be, amh.ry);
        $$0.put(bfn.bg, amh.rz);
        $$0.put(bfn.bi, amh.rA);
        $$0.put(bfn.bj, amh.rB);
        $$0.put(bfn.bk, amh.rC);
        $$0.put(bfn.bl, amh.rD);
        $$0.put(bfn.bo, amh.rE);
        $$0.put(bfn.bp, amh.rF);
        $$0.put(bfn.br, amh.rG);
    });
    public float bW;
    public float bX;
    public float bY;
    public float bZ;
    private float cf = 1.0f;
    private float cg = 1.0f;
    private boolean ch;
    @Nullable
    private gu ci;

    public bsb(bfn<? extends bsb> $$0, cmm $$1) {
        super((bfn<? extends bsi>)$$0, $$1);
        this.bL = new blv(this, 10, false);
        this.a(dxp.n, -1.0f);
        this.a(dxp.o, -1.0f);
        this.a(dxp.x, -1.0f);
    }

    @Override
    @Nullable
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        this.a(ac.a(bsb$b.values(), $$0.y_()));
        if ($$3 == null) {
            $$3 = new bfe.a(false);
        }
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public boolean h_() {
        return false;
    }

    @Override
    protected void x() {
        this.bO.a(0, new bno(this, 1.25));
        this.bO.a(0, new bmp(this));
        this.bO.a(1, new bnd(this, byo.class, 8.0f));
        this.bO.a(2, new boa(this));
        this.bO.a(2, new bmt(this, 1.0, 5.0f, 1.0f, true));
        this.bO.a(2, new a(this, 1.0));
        this.bO.a(3, new bna(this));
        this.bO.a(3, new bms(this, 1.0, 3.0f, 7.0f));
    }

    public static bhf.a ge() {
        return bgb.y().a(bhg.a, 6.0).a(bhg.e, 0.4f).a(bhg.d, 0.2f);
    }

    @Override
    protected bpj b(cmm $$0) {
        bph $$1 = new bph(this, $$0);
        $$1.b(false);
        $$1.a(true);
        $$1.c(true);
        return $$1;
    }

    @Override
    protected float b(bgl $$0, bfk $$1) {
        return $$1.b * 0.6f;
    }

    @Override
    public void b_() {
        if (this.ci == null || !this.ci.a(this.dg(), 3.46) || !this.dI().a_(this.ci).a(cpo.dT)) {
            this.ch = false;
            this.ci = null;
        }
        if (this.dI().z.a(400) == 0) {
            bsb.a(this.dI(), this);
        }
        super.b_();
        this.gi();
    }

    @Override
    public void a(gu $$0, boolean $$1) {
        this.ci = $$0;
        this.ch = $$1;
    }

    public boolean gf() {
        return this.ch;
    }

    private void gi() {
        this.bZ = this.bW;
        this.bY = this.bX;
        this.bX += (float)(this.ay() || this.bM() ? -1 : 4) * 0.3f;
        this.bX = apa.a(this.bX, 0.0f, 1.0f);
        if (!this.ay() && this.cf < 1.0f) {
            this.cf = 1.0f;
        }
        this.cf *= 0.9f;
        eei $$0 = this.dl();
        if (!this.ay() && $$0.d < 0.0) {
            this.f($$0.d(1.0, 0.6, 1.0));
        }
        this.bW += this.cf * 2.0f;
    }

    public static boolean a(cmm $$0, bfj $$1) {
        bgb $$3;
        if (!$$1.bs() || $$1.aQ() || $$0.z.a(2) != 0) {
            return false;
        }
        List<bgb> $$2 = $$0.a(bgb.class, $$1.cE().g(20.0), cb);
        if (!$$2.isEmpty() && !($$3 = $$2.get($$0.z.a($$2.size()))).aQ()) {
            amg $$4 = bsb.b($$3.ae());
            $$0.a(null, $$1.dn(), $$1.dp(), $$1.dt(), $$4, $$1.cY(), 0.7f, bsb.a($$0.z));
            return true;
        }
        return false;
    }

    @Override
    public bdx b(byo $$0, bdw $$1) {
        cfz $$2 = $$0.b($$1);
        if (!this.q() && cd.contains($$2.d())) {
            if (!$$0.fO().d) {
                $$2.h(1);
            }
            if (!this.aQ()) {
                this.dI().a(null, this.dn(), this.dp(), this.dt(), amh.qX, this.cY(), 1.0f, 1.0f + (this.af.i() - this.af.i()) * 0.2f);
            }
            if (!this.dI().B) {
                if (this.af.a(10) == 0) {
                    this.f($$0);
                    this.dI().a((bfj)this, (byte)7);
                } else {
                    this.dI().a((bfj)this, (byte)6);
                }
            }
            return bdx.a(this.dI().B);
        }
        if ($$2.a(cc)) {
            if (!$$0.fO().d) {
                $$2.h(1);
            }
            this.b(new bfa(bfc.s, 900));
            if ($$0.f() || !this.co()) {
                this.a(this.dJ().a($$0), Float.MAX_VALUE);
            }
            return bdx.a(this.dI().B);
        }
        if (!this.gl() && this.q() && this.l($$0)) {
            if (!this.dI().B) {
                this.z(!this.fY());
            }
            return bdx.a(this.dI().B);
        }
        return super.b($$0, $$1);
    }

    @Override
    public boolean m(cfz $$0) {
        return false;
    }

    public static boolean c(bfn<bsb> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
        return $$1.a_($$3.d()).a(amw.bR) && bsb.a($$1, $$3);
    }

    @Override
    protected void a(double $$0, boolean $$1, dcb $$2, gu $$3) {
    }

    @Override
    public boolean a(brl $$0) {
        return false;
    }

    @Override
    @Nullable
    public bfe a(aif $$0, bfe $$1) {
        return null;
    }

    @Override
    public boolean z(bfj $$0) {
        return $$0.a(this.dJ().b(this), 3.0f);
    }

    @Override
    @Nullable
    public amg s() {
        return bsb.a(this.dI(), this.dI().z);
    }

    public static amg a(cmm $$0, apf $$1) {
        if ($$0.ai() != bdu.a && $$1.a(1000) == 0) {
            ArrayList $$2 = Lists.newArrayList(ce.keySet());
            return bsb.b((bfn)$$2.get($$1.a($$2.size())));
        }
        return amh.qV;
    }

    private static amg b(bfn<?> $$0) {
        return ce.getOrDefault($$0, amh.qV);
    }

    @Override
    protected amg d(ben $$0) {
        return amh.qZ;
    }

    @Override
    protected amg g_() {
        return amh.qW;
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        this.a(amh.rH, 0.15f, 1.0f);
    }

    @Override
    protected boolean aP() {
        return this.Z > this.cg;
    }

    @Override
    protected void aO() {
        this.a(amh.qY, 0.15f, 1.0f);
        this.cg = this.Z + this.bX / 2.0f;
    }

    @Override
    public float eS() {
        return bsb.a(this.af);
    }

    public static float a(apf $$0) {
        return ($$0.i() - $$0.i()) * 0.2f + 1.0f;
    }

    @Override
    public ami cY() {
        return ami.g;
    }

    @Override
    public boolean bp() {
        return true;
    }

    @Override
    protected void A(bfj $$0) {
        if ($$0 instanceof byo) {
            return;
        }
        super.A($$0);
    }

    @Override
    public boolean a(ben $$0, float $$1) {
        if (this.b($$0)) {
            return false;
        }
        if (!this.dI().B) {
            this.z(false);
        }
        return super.a($$0, $$1);
    }

    public b gg() {
        return bsb$b.a(this.am.b(ca));
    }

    @Override
    public void a(b $$0) {
        this.am.b(ca, $$0.h);
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(ca, 0);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("Variant", this.gg().h);
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.a(bsb$b.a($$0.h("Variant")));
    }

    @Override
    public boolean gl() {
        return !this.ay();
    }

    @Override
    public eei cG() {
        return new eei(0.0, 0.5f * this.cF(), this.dd() * 0.4f);
    }

    @Override
    public /* synthetic */ Object c() {
        return this.gg();
    }

    public static final class b
    extends Enum<b>
    implements apr {
        public static final /* enum */ b a = new b(0, "red_blue");
        public static final /* enum */ b b = new b(1, "blue");
        public static final /* enum */ b c = new b(2, "green");
        public static final /* enum */ b d = new b(3, "yellow_blue");
        public static final /* enum */ b e = new b(4, "gray");
        public static final Codec<b> f;
        private static final IntFunction<b> g;
        final int h;
        private final String i;
        private static final /* synthetic */ b[] j;

        public static b[] values() {
            return (b[])j.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(int $$0, String $$1) {
            this.h = $$0;
            this.i = $$1;
        }

        public int a() {
            return this.h;
        }

        public static b a(int $$0) {
            return g.apply($$0);
        }

        @Override
        public String c() {
            return this.i;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c, d, e};
        }

        static {
            j = bsb$b.b();
            f = apr.a(b::values);
            g = anu.a(b::a, bsb$b.values(), anu.a.c);
        }
    }

    static class a
    extends boh {
        public a(bgi $$0, double $$1) {
            super($$0, $$1);
        }

        @Override
        @Nullable
        protected eei h() {
            eei $$0 = null;
            if (this.b.aV()) {
                $$0 = bqt.a(this.b, 15, 15);
            }
            if (this.b.ec().i() >= this.j) {
                $$0 = this.k();
            }
            return $$0 == null ? super.h() : $$0;
        }

        @Nullable
        private eei k() {
            gu $$0 = this.b.di();
            gu.a $$1 = new gu.a();
            gu.a $$2 = new gu.a();
            Iterable<gu> $$3 = gu.b(apa.a(this.b.dn() - 3.0), apa.a(this.b.dp() - 6.0), apa.a(this.b.dt() - 3.0), apa.a(this.b.dn() + 3.0), apa.a(this.b.dp() + 6.0), apa.a(this.b.dt() + 3.0));
            for (gu $$4 : $$3) {
                dcb $$5;
                boolean $$6;
                if ($$0.equals($$4) || !($$6 = ($$5 = this.b.dI().a_($$2.a((hz)$$4, ha.a))).b() instanceof ctu || $$5.a(amw.t)) || !this.b.dI().t($$4) || !this.b.dI().t($$1.a((hz)$$4, ha.b))) continue;
                return eei.c($$4);
            }
            return null;
        }
    }
}

