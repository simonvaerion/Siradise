/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  javax.annotation.Nullable
 */
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class bro
extends bgv
implements bgy<brp> {
    public static final double bW = 0.6;
    public static final double bX = 0.8;
    public static final double bY = 1.33;
    private static final ciz bZ = ciz.a(cgc.ql, cgc.qm);
    private static final aby<brp> ca = acb.a(bro.class, aca.w);
    private static final aby<Boolean> cb = acb.a(bro.class, aca.k);
    private static final aby<Boolean> cc = acb.a(bro.class, aca.k);
    private static final aby<Integer> cd = acb.a(bro.class, aca.b);
    private a<byo> ce;
    @Nullable
    private bod cf;
    private float cg;
    private float ch;
    private float ci;
    private float cj;
    private float ck;
    private float cl;

    public bro(bfn<? extends bro> $$0, cmm $$1) {
        super((bfn<? extends bgv>)$$0, $$1);
    }

    public acq ge() {
        return this.gf().a();
    }

    @Override
    protected void x() {
        this.cf = new c(this, 0.6, bZ, true);
        this.bO.a(1, new bmp(this));
        this.bO.a(1, new bno(this, 1.5));
        this.bO.a(2, new boa(this));
        this.bO.a(3, new b(this));
        this.bO.a(4, this.cf);
        this.bO.a(5, new bmi(this, 1.1, 8));
        this.bO.a(6, new bmt(this, 1.0, 10.0f, 5.0f, false));
        this.bO.a(7, new bmj(this, 0.8));
        this.bO.a(8, new bnb(this, 0.3f));
        this.bO.a(9, new bnl(this));
        this.bO.a(10, new bmh(this, 0.8));
        this.bO.a(11, new boi((bgi)this, 0.8, 1.0000001E-5f));
        this.bO.a(12, new bnd(this, byo.class, 10.0f));
        this.bP.a(1, new bor<bsf>(this, bsf.class, false, null));
        this.bP.a(1, new bor<bsm>(this, bsm.class, false, bsm.bU));
    }

    public brp gf() {
        return this.am.b(ca);
    }

    @Override
    public void a(brp $$0) {
        this.am.b(ca, $$0);
    }

    public void A(boolean $$0) {
        this.am.b(cb, $$0);
    }

    public boolean gg() {
        return this.am.b(cb);
    }

    public void B(boolean $$0) {
        this.am.b(cc, $$0);
    }

    public boolean gh() {
        return this.am.b(cc);
    }

    public cen gi() {
        return cen.a(this.am.b(cd));
    }

    @Override
    public void a(cen $$0) {
        this.am.b(cd, $$0.a());
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(ca, jb.aj.e(brp.b));
        this.am.a(cb, false);
        this.am.a(cc, false);
        this.am.a(cd, cen.o.a());
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("variant", jb.aj.b(this.gf()).toString());
        $$0.a("CollarColor", (byte)this.gi().a());
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        brp $$1 = jb.aj.a(acq.a($$0.l("variant")));
        if ($$1 != null) {
            this.a($$1);
        }
        if ($$0.b("CollarColor", 99)) {
            this.a(cen.a($$0.h("CollarColor")));
        }
    }

    @Override
    public void W() {
        if (this.G().b()) {
            double $$0 = this.G().c();
            if ($$0 == 0.6) {
                this.b(bgl.f);
                this.g(false);
            } else if ($$0 == 1.33) {
                this.b(bgl.a);
                this.g(true);
            } else {
                this.b(bgl.a);
                this.g(false);
            }
        } else {
            this.b(bgl.a);
            this.g(false);
        }
    }

    @Override
    @Nullable
    protected amg s() {
        if (this.q()) {
            if (this.gc()) {
                return amh.dq;
            }
            if (this.af.a(4) == 0) {
                return amh.dr;
            }
            return amh.dj;
        }
        return amh.dk;
    }

    @Override
    public int M() {
        return 120;
    }

    public void gj() {
        this.a(amh.dn, this.eR(), this.eS());
    }

    @Override
    protected amg d(ben $$0) {
        return amh.dp;
    }

    @Override
    protected amg g_() {
        return amh.dl;
    }

    public static bhf.a gk() {
        return bgb.y().a(bhg.a, 10.0).a(bhg.d, 0.3f).a(bhg.f, 3.0);
    }

    @Override
    protected void a(byo $$0, bdw $$1, cfz $$2) {
        if (this.m($$2)) {
            this.a(amh.dm, 1.0f, 1.0f);
        }
        super.a($$0, $$1, $$2);
    }

    private float gl() {
        return (float)this.b(bhg.f);
    }

    @Override
    public boolean z(bfj $$0) {
        return $$0.a(this.dJ().b(this), this.gl());
    }

    @Override
    public void l() {
        super.l();
        if (this.cf != null && this.cf.i() && !this.q() && this.ag % 100 == 0) {
            this.a(amh.do, 1.0f, 1.0f);
        }
        this.gm();
    }

    private void gm() {
        if ((this.gg() || this.gh()) && this.ag % 5 == 0) {
            this.a(amh.dq, 0.6f + 0.4f * (this.af.i() - this.af.i()), 1.0f);
        }
        this.gn();
        this.go();
    }

    private void gn() {
        this.ch = this.cg;
        this.cj = this.ci;
        if (this.gg()) {
            this.cg = Math.min(1.0f, this.cg + 0.15f);
            this.ci = Math.min(1.0f, this.ci + 0.08f);
        } else {
            this.cg = Math.max(0.0f, this.cg - 0.22f);
            this.ci = Math.max(0.0f, this.ci - 0.13f);
        }
    }

    private void go() {
        this.cl = this.ck;
        this.ck = this.gh() ? Math.min(1.0f, this.ck + 0.1f) : Math.max(0.0f, this.ck - 0.13f);
    }

    public float D(float $$0) {
        return apa.i($$0, this.ch, this.cg);
    }

    public float E(float $$0) {
        return apa.i($$0, this.cj, this.ci);
    }

    public float F(float $$0) {
        return apa.i($$0, this.cl, this.ck);
    }

    @Nullable
    public bro b(aif $$0, bfe $$1) {
        bro $$2 = bfn.m.a($$0);
        if ($$2 != null && $$1 instanceof bro) {
            bro $$3 = (bro)$$1;
            if (this.af.h()) {
                $$2.a(this.gf());
            } else {
                $$2.a($$3.gf());
            }
            if (this.q()) {
                $$2.b(this.U_());
                $$2.x(true);
                if (this.af.h()) {
                    $$2.a(this.gi());
                } else {
                    $$2.a($$3.gi());
                }
            }
        }
        return $$2;
    }

    @Override
    public boolean a(brl $$0) {
        if (!this.q()) {
            return false;
        }
        if (!($$0 instanceof bro)) {
            return false;
        }
        bro $$1 = (bro)$$0;
        return $$1.q() && super.a($$0);
    }

    @Override
    @Nullable
    public bgt a(cnb $$02, bdv $$12, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        $$3 = super.a($$02, $$12, $$2, $$3, $$4);
        boolean $$5 = $$02.an() > 0.9f;
        anl<brp> $$6 = $$5 ? amx.b : amx.a;
        jb.aj.b($$6).flatMap($$1 -> $$1.a($$02.y_())).ifPresent($$0 -> this.a((brp)$$0.a()));
        aif $$7 = $$02.C();
        if ($$7.a().a(this.di(), anh.g).b()) {
            this.a(jb.aj.e(brp.k));
            this.fF();
        }
        return $$3;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public bdx b(byo $$0, bdw $$1) {
        bdx $$6;
        cfz $$2 = $$0.b($$1);
        cfu $$3 = $$2.d();
        if (this.dI().B) {
            if (this.q() && this.l($$0)) {
                return bdx.a;
            }
            if (this.m($$2) && (this.er() < this.eI() || !this.q())) {
                return bdx.a;
            }
            return bdx.d;
        }
        if (this.q()) {
            if (this.l($$0)) {
                if ($$3 instanceof ceo) {
                    cen $$4 = ((ceo)$$3).d();
                    if ($$4 != this.gi()) {
                        this.a($$4);
                        if (!$$0.fO().d) {
                            $$2.h(1);
                        }
                        this.fF();
                        return bdx.b;
                    }
                } else {
                    if ($$3.u() && this.m($$2) && this.er() < this.eI()) {
                        this.a($$0, $$1, $$2);
                        this.s((float)$$3.v().a());
                        return bdx.b;
                    }
                    bdx $$5 = super.b($$0, $$1);
                    if (!$$5.a() || this.h_()) {
                        this.z(!this.fY());
                    }
                    return $$5;
                }
            }
        } else if (this.m($$2)) {
            this.a($$0, $$1, $$2);
            if (this.af.a(3) == 0) {
                this.f($$0);
                this.z(true);
                this.dI().a((bfj)this, (byte)7);
            } else {
                this.dI().a((bfj)this, (byte)6);
            }
            this.fF();
            return bdx.b;
        }
        if (($$6 = super.b($$0, $$1)).a()) {
            this.fF();
        }
        return $$6;
    }

    @Override
    public boolean m(cfz $$0) {
        return bZ.a($$0);
    }

    @Override
    protected float b(bgl $$0, bfk $$1) {
        return $$1.b * 0.5f;
    }

    @Override
    public boolean h(double $$0) {
        return !this.q() && this.ag > 2400;
    }

    @Override
    protected void r() {
        if (this.ce == null) {
            this.ce = new a<byo>(this, byo.class, 16.0f, 0.8, 1.33);
        }
        this.bO.a(this.ce);
        if (!this.q()) {
            this.bO.a(4, this.ce);
        }
    }

    @Override
    public boolean bQ() {
        return this.bU() || super.bQ();
    }

    @Override
    @Nullable
    public /* synthetic */ bfe a(aif aif2, bfe bfe2) {
        return this.b(aif2, bfe2);
    }

    @Override
    public /* synthetic */ Object c() {
        return this.gf();
    }

    static class c
    extends bod {
        @Nullable
        private byo c;
        private final bro d;

        public c(bro $$0, double $$1, ciz $$2, boolean $$3) {
            super($$0, $$1, $$2, $$3);
            this.d = $$0;
        }

        @Override
        public void e() {
            super.e();
            if (this.c == null && this.a.ec().a(this.a(600)) == 0) {
                this.c = this.b;
            } else if (this.a.ec().a(this.a(500)) == 0) {
                this.c = null;
            }
        }

        @Override
        protected boolean h() {
            if (this.c != null && this.c.equals(this.b)) {
                return false;
            }
            return super.h();
        }

        @Override
        public boolean a() {
            return super.a() && !this.d.q();
        }
    }

    static class b
    extends bmv {
        private final bro a;
        @Nullable
        private byo b;
        @Nullable
        private gu c;
        private int d;

        public b(bro $$0) {
            this.a = $$0;
        }

        @Override
        public boolean a() {
            if (!this.a.q()) {
                return false;
            }
            if (this.a.fY()) {
                return false;
            }
            bfz $$0 = this.a.I_();
            if ($$0 instanceof byo) {
                this.b = (byo)$$0;
                if (!$$0.fy()) {
                    return false;
                }
                if (this.a.f((bfj)this.b) > 100.0) {
                    return false;
                }
                gu $$12 = this.b.di();
                dcb $$2 = this.a.dI().a_($$12);
                if ($$2.a(amw.R)) {
                    this.c = $$2.d(cpg.aC).map($$1 -> $$12.a($$1.g())).orElseGet(() -> new gu($$12));
                    return !this.h();
                }
            }
            return false;
        }

        private boolean h() {
            List<bro> $$0 = this.a.dI().a(bro.class, new eed(this.c).g(2.0));
            for (bro $$1 : $$0) {
                if ($$1 == this.a || !$$1.gg() && !$$1.gh()) continue;
                return true;
            }
            return false;
        }

        @Override
        public boolean b() {
            return this.a.q() && !this.a.fY() && this.b != null && this.b.fy() && this.c != null && !this.h();
        }

        @Override
        public void c() {
            if (this.c != null) {
                this.a.y(false);
                this.a.J().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1f);
            }
        }

        @Override
        public void d() {
            this.a.A(false);
            float $$0 = this.a.dI().f(1.0f);
            if (this.b.fR() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dI().y_().i() < 0.7) {
                this.i();
            }
            this.d = 0;
            this.a.B(false);
            this.a.J().n();
        }

        private void i() {
            apf $$0 = this.a.ec();
            gu.a $$1 = new gu.a();
            $$1.g(this.a.fO() ? this.a.fP().di() : this.a.di());
            this.a.b($$1.u() + $$0.a(11) - 5, $$1.v() + $$0.a(5) - 2, $$1.w() + $$0.a(11) - 5, false);
            $$1.g(this.a.di());
            dzs $$2 = this.a.dI().n().aH().getLootTable(dzg.am);
            dzq $$3 = new dzq.a((aif)this.a.dI()).a(ebw.f, this.a.dg()).a(ebw.a, this.a).a(ebv.h);
            ObjectArrayList<cfz> $$4 = $$2.a($$3);
            for (cfz $$5 : $$4) {
                this.a.dI().b(new bvh(this.a.dI(), (double)$$1.u() - (double)apa.a(this.a.aV * ((float)Math.PI / 180)), $$1.v(), (double)$$1.w() + (double)apa.b(this.a.aV * ((float)Math.PI / 180)), $$5));
            }
        }

        @Override
        public void e() {
            if (this.b != null && this.c != null) {
                this.a.y(false);
                this.a.J().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1f);
                if (this.a.f((bfj)this.b) < 2.5) {
                    ++this.d;
                    if (this.d > this.a(16)) {
                        this.a.A(true);
                        this.a.B(false);
                    } else {
                        this.a.a((bfj)this.b, 45.0f, 45.0f);
                        this.a.B(true);
                    }
                } else {
                    this.a.A(false);
                }
            }
        }
    }

    static class a<T extends bfz>
    extends bmc<T> {
        private final bro i;

        public a(bro $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
            super($$0, $$1, $$2, $$3, $$4, bfm.e::test);
            this.i = $$0;
        }

        @Override
        public boolean a() {
            return !this.i.q() && super.a();
        }

        @Override
        public boolean b() {
            return !this.i.q() && super.b();
        }
    }
}

