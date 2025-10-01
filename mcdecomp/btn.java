/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  javax.annotation.Nullable
 */
import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class btn
extends btj
implements bgy<d>,
bwg {
    private static final int bU = 5;
    private static final ciz bW = ciz.a(cgc.oI, cpo.ij.k());
    private static final aby<Integer> bX = acb.a(btn.class, aca.b);
    private static final aby<Integer> bY = acb.a(btn.class, aca.b);
    private static final aby<Integer> bZ = acb.a(btn.class, aca.b);
    boolean ca;
    @Nullable
    private btn cb;
    @Nullable
    private btn cc;

    public btn(bfn<? extends btn> $$0, cmm $$1) {
        super((bfn<? extends btj>)$$0, $$1);
    }

    public boolean gh() {
        return false;
    }

    private void w(int $$0) {
        this.am.b(bX, Math.max(1, Math.min(5, $$0)));
    }

    private void b(apf $$0) {
        int $$1 = $$0.i() < 0.04f ? 5 : 3;
        this.w(1 + $$0.a($$1));
    }

    public int gi() {
        return this.am.b(bX);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("Variant", this.gk().g);
        $$0.a("Strength", this.gi());
        if (!this.co.a(1).b()) {
            $$0.a("DecorItem", this.co.a(1).b(new qr()));
        }
    }

    @Override
    public void a(qr $$0) {
        this.w($$0.h("Strength"));
        super.a($$0);
        this.a(btn$d.a($$0.h("Variant")));
        if ($$0.b("DecorItem", 10)) {
            this.co.a(1, cfz.a($$0.p("DecorItem")));
        }
        this.gv();
    }

    @Override
    protected void x() {
        this.bO.a(0, new bmp(this));
        this.bO.a(1, new bnz(this, 1.2));
        this.bO.a(2, new bnc(this, 2.1f));
        this.bO.a(3, new bnu(this, 1.25, 40, 20.0f));
        this.bO.a(3, new bno(this, 1.2));
        this.bO.a(4, new bmh(this, 1.0));
        this.bO.a(5, new bod(this, 1.25, ciz.a(cgc.hh), false));
        this.bO.a(6, new bmu(this, 1.0));
        this.bO.a(7, new boi(this, 0.7));
        this.bO.a(8, new bnd(this, byo.class, 6.0f));
        this.bO.a(9, new bnq(this));
        this.bP.a(1, new c(this));
        this.bP.a(2, new a(this));
    }

    public static bhf.a gj() {
        return btn.q().a(bhg.b, 40.0);
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(bX, 0);
        this.am.a(bY, -1);
        this.am.a(bZ, 0);
    }

    public d gk() {
        return btn$d.a(this.am.b(bZ));
    }

    @Override
    public void a(d $$0) {
        this.am.b(bZ, $$0.g);
    }

    @Override
    protected int V_() {
        if (this.r()) {
            return 2 + 3 * this.gg();
        }
        return super.V_();
    }

    @Override
    protected void a(bfj $$0, bfj.a $$1) {
        if (!this.u($$0)) {
            return;
        }
        float $$2 = apa.b(this.aV * ((float)Math.PI / 180));
        float $$3 = apa.a(this.aV * ((float)Math.PI / 180));
        float $$4 = 0.3f;
        $$1.accept($$0, this.dn() + (double)(0.3f * $$3), this.dp() + this.bx() + $$0.bw(), this.dt() - (double)(0.3f * $$2));
    }

    @Override
    public double bx() {
        return (double)this.de() * 0.6;
    }

    @Override
    @Nullable
    public bfz cL() {
        return null;
    }

    @Override
    public boolean m(cfz $$0) {
        return bW.a($$0);
    }

    @Override
    protected boolean a(byo $$0, cfz $$1) {
        amg $$6;
        int $$2 = 0;
        int $$3 = 0;
        float $$4 = 0.0f;
        boolean $$5 = false;
        if ($$1.a(cgc.oI)) {
            $$2 = 10;
            $$3 = 3;
            $$4 = 2.0f;
        } else if ($$1.a(cpo.ij.k())) {
            $$2 = 90;
            $$3 = 6;
            $$4 = 10.0f;
            if (this.gn() && this.h() == 0 && this.fZ()) {
                $$5 = true;
                this.g($$0);
            }
        }
        if (this.er() < this.eI() && $$4 > 0.0f) {
            this.s($$4);
            $$5 = true;
        }
        if (this.h_() && $$2 > 0) {
            this.dI().a(iv.K, this.d(1.0), this.dq() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dI().B) {
                this.b_($$2);
            }
            $$5 = true;
        }
        if ($$3 > 0 && ($$5 || !this.gn()) && this.gt() < this.gz()) {
            $$5 = true;
            if (!this.dI().B) {
                this.v($$3);
            }
        }
        if ($$5 && !this.aQ() && ($$6 = this.gf()) != null) {
            this.dI().a(null, this.dn(), this.dp(), this.dt(), this.gf(), this.cY(), 1.0f, 1.0f + (this.af.i() - this.af.i()) * 0.2f);
        }
        return $$5;
    }

    @Override
    public boolean eT() {
        return this.es() || this.gq();
    }

    @Override
    @Nullable
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        d $$7;
        apf $$5 = $$0.y_();
        this.b($$5);
        if ($$3 instanceof b) {
            d $$6 = ((b)$$3).a;
        } else {
            $$7 = ac.a(btn$d.values(), $$5);
            $$3 = new b($$7);
        }
        this.a($$7);
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    protected boolean ge() {
        return false;
    }

    @Override
    protected amg gx() {
        return amh.mx;
    }

    @Override
    protected amg s() {
        return amh.mw;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.mB;
    }

    @Override
    protected amg g_() {
        return amh.mz;
    }

    @Override
    @Nullable
    protected amg gf() {
        return amh.mA;
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        this.a(amh.mD, 0.15f, 1.0f);
    }

    @Override
    protected void fY() {
        this.a(amh.my, 1.0f, (this.af.i() - this.af.i()) * 0.2f + 1.0f);
    }

    @Override
    public int gg() {
        return this.gi();
    }

    @Override
    public boolean gH() {
        return true;
    }

    @Override
    public boolean gI() {
        return !this.co.a(1).b();
    }

    @Override
    public boolean l(cfz $$0) {
        return $$0.a(ane.g);
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public void a(bdq $$0) {
        cen $$1 = this.gl();
        super.a($$0);
        cen $$2 = this.gl();
        if (this.ag > 20 && $$2 != null && $$2 != $$1) {
            this.a(amh.mE, 0.5f, 1.0f);
        }
    }

    @Override
    protected void gv() {
        if (this.dI().B) {
            return;
        }
        super.gv();
        this.a(btn.n(this.co.a(1)));
    }

    @Override
    private void a(@Nullable cen $$0) {
        this.am.b(bY, $$0 == null ? -1 : $$0.a());
    }

    @Nullable
    private static cen n(cfz $$0) {
        cpn $$1 = cpn.a($$0.d());
        if ($$1 instanceof czb) {
            return ((czb)$$1).a();
        }
        return null;
    }

    @Nullable
    public cen gl() {
        int $$0 = this.am.b(bY);
        return $$0 == -1 ? null : cen.a($$0);
    }

    @Override
    public int gz() {
        return 30;
    }

    @Override
    public boolean a(brl $$0) {
        return $$0 != this && $$0 instanceof btn && this.gG() && ((btn)$$0).gG();
    }

    @Nullable
    public btn b(aif $$0, bfe $$1) {
        btn $$2 = this.gm();
        if ($$2 != null) {
            this.a($$1, $$2);
            btn $$3 = (btn)$$1;
            int $$4 = this.af.a(Math.max(this.gi(), $$3.gi())) + 1;
            if (this.af.i() < 0.03f) {
                ++$$4;
            }
            $$2.w($$4);
            $$2.a(this.af.h() ? this.gk() : $$3.gk());
        }
        return $$2;
    }

    @Nullable
    protected btn gm() {
        return bfn.aj.a(this.dI());
    }

    private void m(bfz $$0) {
        bzf $$1 = new bzf(this.dI(), this);
        double $$2 = $$0.dn() - this.dn();
        double $$3 = $$0.e(0.3333333333333333) - $$1.dp();
        double $$4 = $$0.dt() - this.dt();
        double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * (double)0.2f;
        $$1.c($$2, $$3 + $$5, $$4, 1.5f, 10.0f);
        if (!this.aQ()) {
            this.dI().a(null, this.dn(), this.dp(), this.dt(), amh.mC, this.cY(), 1.0f, 1.0f + (this.af.i() - this.af.i()) * 0.2f);
        }
        this.dI().b($$1);
        this.ca = true;
    }

    void D(boolean $$0) {
        this.ca = $$0;
    }

    @Override
    public boolean a(float $$0, float $$1, ben $$2) {
        int $$3 = this.d($$0, $$1);
        if ($$3 <= 0) {
            return false;
        }
        if ($$0 >= 6.0f) {
            this.a($$2, (float)$$3);
            if (this.bN()) {
                for (bfj $$4 : this.cR()) {
                    $$4.a($$2, (float)$$3);
                }
            }
        }
        this.eE();
        return true;
    }

    public void gK() {
        if (this.cb != null) {
            this.cb.cc = null;
        }
        this.cb = null;
    }

    @Override
    public void a(btn $$0) {
        this.cb = $$0;
        this.cb.cc = this;
    }

    public boolean gL() {
        return this.cc != null;
    }

    public boolean gM() {
        return this.cb != null;
    }

    @Nullable
    public btn gN() {
        return this.cb;
    }

    @Override
    protected double fX() {
        return 2.0;
    }

    @Override
    protected void gA() {
        if (!this.gM() && this.h_()) {
            super.gA();
        }
    }

    @Override
    public boolean gB() {
        return false;
    }

    @Override
    public void a(bfz $$0, float $$1) {
        this.m($$0);
    }

    @Override
    public eei cG() {
        return new eei(0.0, 0.75 * (double)this.cF(), (double)this.dd() * 0.5);
    }

    @Override
    @Nullable
    public /* synthetic */ bfe a(aif aif2, bfe bfe2) {
        return this.b(aif2, bfe2);
    }

    @Override
    public /* synthetic */ Object c() {
        return this.gk();
    }

    public static final class d
    extends Enum<d>
    implements apr {
        public static final /* enum */ d a = new d(0, "creamy");
        public static final /* enum */ d b = new d(1, "white");
        public static final /* enum */ d c = new d(2, "brown");
        public static final /* enum */ d d = new d(3, "gray");
        public static final Codec<d> e;
        private static final IntFunction<d> f;
        final int g;
        private final String h;
        private static final /* synthetic */ d[] i;

        public static d[] values() {
            return (d[])i.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private d(int $$0, String $$1) {
            this.g = $$0;
            this.h = $$1;
        }

        public int a() {
            return this.g;
        }

        public static d a(int $$0) {
            return f.apply($$0);
        }

        @Override
        public String c() {
            return this.h;
        }

        private static /* synthetic */ d[] b() {
            return new d[]{a, b, c, d};
        }

        static {
            i = btn$d.b();
            e = apr.a(d::values);
            f = anu.a(d::a, btn$d.values(), anu.a.c);
        }
    }

    static class c
    extends bon {
        public c(btn $$0) {
            super($$0, new Class[0]);
        }

        @Override
        public boolean b() {
            if (this.e instanceof btn) {
                btn $$0 = (btn)this.e;
                if ($$0.ca) {
                    $$0.D(false);
                    return false;
                }
            }
            return super.b();
        }
    }

    static class a
    extends boo<bso> {
        public a(btn $$02) {
            super($$02, bso.class, 16, false, true, $$0 -> !((bso)$$0).q());
        }

        @Override
        protected double l() {
            return super.l() * 0.25;
        }
    }

    static class b
    extends bfe.a {
        public final d a;

        b(d $$0) {
            super(true);
            this.a = $$0;
        }
    }
}

