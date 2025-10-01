/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bsm
extends brl {
    private static final aby<gu> bW = acb.a(bsm.class, aca.n);
    private static final aby<Boolean> bX = acb.a(bsm.class, aca.k);
    private static final aby<Boolean> bY = acb.a(bsm.class, aca.k);
    private static final aby<gu> bZ = acb.a(bsm.class, aca.n);
    private static final aby<Boolean> ca = acb.a(bsm.class, aca.k);
    private static final aby<Boolean> cb = acb.a(bsm.class, aca.k);
    public static final ciz bT = ciz.a(cpo.bw.k());
    int cc;
    public static final Predicate<bfz> bU = $$0 -> $$0.h_() && !$$0.aV();

    public bsm(bfn<? extends bsm> $$0, cmm $$1) {
        super((bfn<? extends brl>)$$0, $$1);
        this.a(dxp.j, 0.0f);
        this.a(dxp.t, -1.0f);
        this.a(dxp.s, -1.0f);
        this.a(dxp.r, -1.0f);
        this.bL = new e(this);
        this.r(1.0f);
    }

    public void i(gu $$0) {
        this.am.b(bW, $$0);
    }

    gu fY() {
        return this.am.b(bW);
    }

    void j(gu $$0) {
        this.am.b(bZ, $$0);
    }

    gu ge() {
        return this.am.b(bZ);
    }

    public boolean q() {
        return this.am.b(bX);
    }

    void w(boolean $$0) {
        this.am.b(bX, $$0);
    }

    public boolean r() {
        return this.am.b(bY);
    }

    void x(boolean $$0) {
        this.cc = $$0 ? 1 : 0;
        this.am.b(bY, $$0);
    }

    boolean gf() {
        return this.am.b(ca);
    }

    void y(boolean $$0) {
        this.am.b(ca, $$0);
    }

    boolean gg() {
        return this.am.b(cb);
    }

    void z(boolean $$0) {
        this.am.b(cb, $$0);
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(bW, gu.b);
        this.am.a(bX, false);
        this.am.a(bZ, gu.b);
        this.am.a(ca, false);
        this.am.a(cb, false);
        this.am.a(bY, false);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("HomePosX", this.fY().u());
        $$0.a("HomePosY", this.fY().v());
        $$0.a("HomePosZ", this.fY().w());
        $$0.a("HasEgg", this.q());
        $$0.a("TravelPosX", this.ge().u());
        $$0.a("TravelPosY", this.ge().v());
        $$0.a("TravelPosZ", this.ge().w());
    }

    @Override
    public void a(qr $$0) {
        int $$1 = $$0.h("HomePosX");
        int $$2 = $$0.h("HomePosY");
        int $$3 = $$0.h("HomePosZ");
        this.i(new gu($$1, $$2, $$3));
        super.a($$0);
        this.w($$0.q("HasEgg"));
        int $$4 = $$0.h("TravelPosX");
        int $$5 = $$0.h("TravelPosY");
        int $$6 = $$0.h("TravelPosZ");
        this.j(new gu($$4, $$5, $$6));
    }

    @Override
    @Nullable
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        this.i(this.di());
        this.j(gu.b);
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    public static boolean c(bfn<bsm> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
        return $$3.v() < $$1.t_() + 4 && cye.a($$1, $$3) && bsm.a($$1, $$3);
    }

    @Override
    protected void x() {
        this.bO.a(0, new f(this, 1.2));
        this.bO.a(1, new a(this, 1.0));
        this.bO.a(1, new d(this, 1.0));
        this.bO.a(2, new bod(this, 1.1, bT, false));
        this.bO.a(3, new c(this, 1.0));
        this.bO.a(4, new b(this, 1.0));
        this.bO.a(7, new i(this, 1.0));
        this.bO.a(8, new bnd(this, byo.class, 8.0f));
        this.bO.a(9, new h(this, 1.0, 100));
    }

    public static bhf.a w() {
        return bgb.y().a(bhg.a, 30.0).a(bhg.d, 0.25);
    }

    @Override
    public boolean cw() {
        return false;
    }

    @Override
    public boolean dN() {
        return true;
    }

    @Override
    public bge eN() {
        return bge.e;
    }

    @Override
    public int M() {
        return 200;
    }

    @Override
    @Nullable
    protected amg s() {
        if (!this.aV() && this.ay() && !this.h_()) {
            return amh.yc;
        }
        return super.s();
    }

    @Override
    protected void e(float $$0) {
        super.e($$0 * 1.5f);
    }

    @Override
    protected amg aJ() {
        return amh.yn;
    }

    @Override
    @Nullable
    protected amg d(ben $$0) {
        if (this.h_()) {
            return amh.yj;
        }
        return amh.yi;
    }

    @Override
    @Nullable
    protected amg g_() {
        if (this.h_()) {
            return amh.ye;
        }
        return amh.yd;
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        amg $$2 = this.h_() ? amh.ym : amh.yl;
        this.a($$2, 0.15f, 1.0f);
    }

    @Override
    public boolean fZ() {
        return super.fZ() && !this.q();
    }

    @Override
    protected float aI() {
        return this.Y + 0.15f;
    }

    @Override
    public float dV() {
        return this.h_() ? 0.3f : 1.0f;
    }

    @Override
    protected bpj b(cmm $$0) {
        return new g(this, $$0);
    }

    @Override
    @Nullable
    public bfe a(aif $$0, bfe $$1) {
        return bfn.bd.a($$0);
    }

    @Override
    public boolean m(cfz $$0) {
        return $$0.a(cpo.bw.k());
    }

    @Override
    public float a(gu $$0, cmp $$1) {
        if (!this.gf() && $$1.b_($$0).a(anb.a)) {
            return 10.0f;
        }
        if (cye.a($$1, $$0)) {
            return 10.0f;
        }
        return $$1.v($$0);
    }

    @Override
    public void b_() {
        super.b_();
        if (this.bs() && this.r() && this.cc >= 1 && this.cc % 5 == 0) {
            gu $$0 = this.di();
            if (cye.a(this.dI(), $$0)) {
                this.dI().c(2001, $$0, cpn.i(this.dI().a_($$0.d())));
            }
        }
    }

    @Override
    protected void m() {
        super.m();
        if (!this.h_() && this.dI().X().b(cmi.f)) {
            this.a(cgc.nD, 1);
        }
    }

    @Override
    public void h(eei $$0) {
        if (this.cU() && this.aV()) {
            this.a(0.1f, $$0);
            this.a(bgf.a, this.dl());
            this.f(this.dl().a(0.9));
            if (!(this.j() != null || this.gf() && this.fY().a(this.dg(), 20.0))) {
                this.f(this.dl().b(0.0, -0.005, 0.0));
            }
        } else {
            super.h($$0);
        }
    }

    @Override
    public boolean a(byo $$0) {
        return false;
    }

    @Override
    public void a(aif $$0, bfy $$1) {
        this.a(this.dJ().b(), Float.MAX_VALUE);
    }

    static class e
    extends bly {
        private final bsm l;

        e(bsm $$0) {
            super($$0);
            this.l = $$0;
        }

        private void g() {
            if (this.l.aV()) {
                this.l.f(this.l.dl().b(0.0, 0.005, 0.0));
                if (!this.l.fY().a(this.l.dg(), 16.0)) {
                    this.l.w(Math.max(this.l.fa() / 2.0f, 0.08f));
                }
                if (this.l.h_()) {
                    this.l.w(Math.max(this.l.fa() / 3.0f, 0.06f));
                }
            } else if (this.l.ay()) {
                this.l.w(Math.max(this.l.fa() / 2.0f, 0.06f));
            }
        }

        @Override
        public void a() {
            double $$2;
            double $$1;
            this.g();
            if (this.k != bly.a.b || this.l.J().l()) {
                this.l.w(0.0f);
                return;
            }
            double $$0 = this.e - this.l.dn();
            double $$3 = Math.sqrt($$0 * $$0 + ($$1 = this.f - this.l.dp()) * $$1 + ($$2 = this.g - this.l.dt()) * $$2);
            if ($$3 < (double)1.0E-5f) {
                this.d.w(0.0f);
                return;
            }
            $$1 /= $$3;
            float $$4 = (float)(apa.d($$2, $$0) * 57.2957763671875) - 90.0f;
            this.l.a_(this.a(this.l.dy(), $$4, 90.0f));
            this.l.aV = this.l.dy();
            float $$5 = (float)(this.h * this.l.b(bhg.d));
            this.l.w(apa.i(0.125f, this.l.fa(), $$5));
            this.l.f(this.l.dl().b(0.0, (double)this.l.fa() * $$1 * 0.1, 0.0));
        }
    }

    static class f
    extends bno {
        f(bsm $$0, double $$1) {
            super($$0, $$1);
        }

        @Override
        public boolean a() {
            if (!this.h()) {
                return false;
            }
            gu $$0 = this.a(this.b.dI(), this.b, 7);
            if ($$0 != null) {
                this.d = $$0.u();
                this.e = $$0.v();
                this.f = $$0.w();
                return true;
            }
            return this.i();
        }
    }

    static class a
    extends bmh {
        private final bsm d;

        a(bsm $$0, double $$1) {
            super($$0, $$1);
            this.d = $$0;
        }

        @Override
        public boolean a() {
            return super.a() && !this.d.q();
        }

        @Override
        protected void g() {
            aig $$0 = this.a.gb();
            if ($$0 == null && this.c.gb() != null) {
                $$0 = this.c.gb();
            }
            if ($$0 != null) {
                $$0.a(amr.P);
                ai.o.a($$0, this.a, this.c, null);
            }
            this.d.w(true);
            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gd();
            this.c.gd();
            apf $$1 = this.a.ec();
            if (this.b.X().b(cmi.f)) {
                this.b.b(new bfp(this.b, this.a.dn(), this.a.dp(), this.a.dt(), $$1.a(7) + 1));
            }
        }
    }

    static class d
    extends bni {
        private final bsm g;

        d(bsm $$0, double $$1) {
            super($$0, $$1, 16);
            this.g = $$0;
        }

        @Override
        public boolean a() {
            if (this.g.q() && this.g.fY().a(this.g.dg(), 9.0)) {
                return super.a();
            }
            return false;
        }

        @Override
        public boolean b() {
            return super.b() && this.g.q() && this.g.fY().a(this.g.dg(), 9.0);
        }

        @Override
        public void e() {
            super.e();
            gu $$0 = this.g.di();
            if (!this.g.aV() && this.m()) {
                if (this.g.cc < 1) {
                    this.g.x(true);
                } else if (this.g.cc > this.a(200)) {
                    cmm $$1 = this.g.dI();
                    $$1.a(null, $$0, amh.yk, ami.e, 0.3f, 0.9f + $$1.z.i() * 0.2f);
                    gu $$2 = this.e.c();
                    dcb $$3 = (dcb)cpo.mf.n().a(cye.e, this.g.af.a(4) + 1);
                    $$1.a($$2, $$3, 3);
                    $$1.a(dgl.i, $$2, dgl.a.a(this.g, $$3));
                    this.g.w(false);
                    this.g.x(false);
                    this.g.s(600);
                }
                if (this.g.r()) {
                    ++this.g.cc;
                }
            }
        }

        @Override
        protected boolean a(cmp $$0, gu $$1) {
            if (!$$0.t($$1.c())) {
                return false;
            }
            return cye.b($$0, $$1);
        }
    }

    static class c
    extends bni {
        private static final int g = 1200;
        private final bsm h;

        c(bsm $$0, double $$1) {
            super($$0, $$0.h_() ? 2.0 : $$1, 24);
            this.h = $$0;
            this.f = -1;
        }

        @Override
        public boolean b() {
            return !this.h.aV() && this.d <= 1200 && this.a(this.h.dI(), this.e);
        }

        @Override
        public boolean a() {
            if (this.h.h_() && !this.h.aV()) {
                return super.a();
            }
            if (!(this.h.gf() || this.h.aV() || this.h.q())) {
                return super.a();
            }
            return false;
        }

        @Override
        public boolean l() {
            return this.d % 160 == 0;
        }

        @Override
        protected boolean a(cmp $$0, gu $$1) {
            return $$0.a_($$1).a(cpo.G);
        }
    }

    static class b
    extends bmv {
        private final bsm a;
        private final double b;
        private boolean c;
        private int d;
        private static final int e = 600;

        b(bsm $$0, double $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public boolean a() {
            if (this.a.h_()) {
                return false;
            }
            if (this.a.q()) {
                return true;
            }
            if (this.a.ec().a(bsm$b.b(700)) != 0) {
                return false;
            }
            return !this.a.fY().a(this.a.dg(), 64.0);
        }

        @Override
        public void c() {
            this.a.y(true);
            this.c = false;
            this.d = 0;
        }

        @Override
        public void d() {
            this.a.y(false);
        }

        @Override
        public boolean b() {
            return !this.a.fY().a(this.a.dg(), 7.0) && !this.c && this.d <= this.a(600);
        }

        @Override
        public void e() {
            gu $$0 = this.a.fY();
            boolean $$1 = $$0.a(this.a.dg(), 16.0);
            if ($$1) {
                ++this.d;
            }
            if (this.a.J().l()) {
                eei $$2 = eei.c($$0);
                eei $$3 = bqq.a((bgi)this.a, 16, 3, $$2, 0.3141592741012573);
                if ($$3 == null) {
                    $$3 = bqq.a((bgi)this.a, 8, 7, $$2, 1.5707963705062866);
                }
                if ($$3 != null && !$$1 && !this.a.dI().a_(gu.a($$3)).a(cpo.G)) {
                    $$3 = bqq.a((bgi)this.a, 16, 5, $$2, 1.5707963705062866);
                }
                if ($$3 == null) {
                    this.c = true;
                    return;
                }
                this.a.J().a($$3.c, $$3.d, $$3.e, this.b);
            }
        }
    }

    static class i
    extends bmv {
        private final bsm a;
        private final double b;
        private boolean c;

        i(bsm $$0, double $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public boolean a() {
            return !this.a.gf() && !this.a.q() && this.a.aV();
        }

        @Override
        public void c() {
            int $$0 = 512;
            int $$1 = 4;
            apf $$2 = this.a.af;
            int $$3 = $$2.a(1025) - 512;
            int $$4 = $$2.a(9) - 4;
            int $$5 = $$2.a(1025) - 512;
            if ((double)$$4 + this.a.dp() > (double)(this.a.dI().t_() - 1)) {
                $$4 = 0;
            }
            gu $$6 = gu.a((double)$$3 + this.a.dn(), (double)$$4 + this.a.dp(), (double)$$5 + this.a.dt());
            this.a.j($$6);
            this.a.z(true);
            this.c = false;
        }

        @Override
        public void e() {
            if (this.a.J().l()) {
                eei $$0 = eei.c(this.a.ge());
                eei $$1 = bqq.a((bgi)this.a, 16, 3, $$0, 0.3141592741012573);
                if ($$1 == null) {
                    $$1 = bqq.a((bgi)this.a, 8, 7, $$0, 1.5707963705062866);
                }
                if ($$1 != null) {
                    int $$2 = apa.a($$1.c);
                    int $$3 = apa.a($$1.e);
                    int $$4 = 34;
                    if (!this.a.dI().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                        $$1 = null;
                    }
                }
                if ($$1 == null) {
                    this.c = true;
                    return;
                }
                this.a.J().a($$1.c, $$1.d, $$1.e, this.b);
            }
        }

        @Override
        public boolean b() {
            return !this.a.J().l() && !this.c && !this.a.gf() && !this.a.gc() && !this.a.q();
        }

        @Override
        public void d() {
            this.a.z(false);
            super.d();
        }
    }

    static class h
    extends bns {
        private final bsm i;

        h(bsm $$0, double $$1, int $$2) {
            super($$0, $$1, $$2);
            this.i = $$0;
        }

        @Override
        public boolean a() {
            if (!(this.b.aV() || this.i.gf() || this.i.q())) {
                return super.a();
            }
            return false;
        }
    }

    static class g
    extends bpg {
        g(bsm $$0, cmm $$1) {
            super($$0, $$1);
        }

        @Override
        public boolean a(gu $$0) {
            bsm $$1;
            bgb bgb2 = this.a;
            if (bgb2 instanceof bsm && ($$1 = (bsm)bgb2).gg()) {
                return this.b.a_($$0).a(cpo.G);
            }
            return !this.b.a_($$0.d()).i();
        }
    }
}

