/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvs
extends bwc
implements bgg {
    private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
    private static final bhe d = new bhe(c, "Attacking speed boost", (double)0.15f, bhe.a.a);
    private static final int e = 400;
    private static final int bT = 600;
    private static final aby<Optional<dcb>> bU = acb.a(bvs.class, aca.j);
    private static final aby<Boolean> bV = acb.a(bvs.class, aca.k);
    private static final aby<Boolean> bW = acb.a(bvs.class, aca.k);
    private int bX = Integer.MIN_VALUE;
    private int bY;
    private static final bdi bZ = apw.a(20, 39);
    private int ca;
    @Nullable
    private UUID cb;

    public bvs(bfn<? extends bvs> $$0, cmm $$1) {
        super((bfn<? extends bwc>)$$0, $$1);
        this.r(1.0f);
        this.a(dxp.j, -1.0f);
    }

    @Override
    protected void x() {
        this.bO.a(0, new bmp(this));
        this.bO.a(1, new a(this));
        this.bO.a(2, new bnf(this, 1.0, false));
        this.bO.a(7, new boi((bgi)this, 1.0, 0.0f));
        this.bO.a(8, new bnd(this, byo.class, 8.0f));
        this.bO.a(8, new bnq(this));
        this.bO.a(10, new b(this));
        this.bO.a(11, new d(this));
        this.bP.a(1, new c(this, this::a_));
        this.bP.a(2, new bon(this, new Class[0]));
        this.bP.a(3, new boo<bvt>((bgb)this, bvt.class, true, false));
        this.bP.a(4, new bou<bvs>(this, false));
    }

    public static bhf.a q() {
        return bwc.ge().a(bhg.a, 40.0).a(bhg.d, 0.3f).a(bhg.f, 7.0).a(bhg.b, 64.0);
    }

    @Override
    public void h(@Nullable bfz $$0) {
        super.h($$0);
        bhc $$1 = this.a(bhg.d);
        if ($$0 == null) {
            this.bY = 0;
            this.am.b(bV, false);
            this.am.b(bW, false);
            $$1.d(d);
        } else {
            this.bY = this.ag;
            this.am.b(bV, true);
            if (!$$1.a(d)) {
                $$1.b(d);
            }
        }
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(bU, Optional.empty());
        this.am.a(bV, false);
        this.am.a(bW, false);
    }

    @Override
    public void c() {
        this.a(bZ.a(this.af));
    }

    @Override
    public void a(int $$0) {
        this.ca = $$0;
    }

    @Override
    public int a() {
        return this.ca;
    }

    @Override
    public void a(@Nullable UUID $$0) {
        this.cb = $$0;
    }

    @Override
    @Nullable
    public UUID b() {
        return this.cb;
    }

    public void r() {
        if (this.ag >= this.bX + 400) {
            this.bX = this.ag;
            if (!this.aQ()) {
                this.dI().a(this.dn(), this.dr(), this.dt(), amh.hg, this.cY(), 2.5f, 1.0f, false);
            }
        }
    }

    @Override
    public void a(aby<?> $$0) {
        if (bV.equals($$0) && this.ga() && this.dI().B) {
            this.r();
        }
        super.a($$0);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        dcb $$1 = this.fY();
        if ($$1 != null) {
            $$0.a("carriedBlockState", rd.a($$1));
        }
        this.c($$0);
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        dcb $$1 = null;
        if ($$0.b("carriedBlockState", 10) && ($$1 = rd.a(this.dI().a(jc.e), $$0.p("carriedBlockState"))).i()) {
            $$1 = null;
        }
        this.d($$1);
        this.a(this.dI(), $$0);
    }

    boolean g(byo $$0) {
        cfz $$1 = $$0.fN().j.get(3);
        if ($$1.a(cpo.ef.k())) {
            return false;
        }
        eei $$2 = $$0.f(1.0f).d();
        eei $$3 = new eei(this.dn() - $$0.dn(), this.dr() - $$0.dr(), this.dt() - $$0.dt());
        double $$4 = $$3.f();
        double $$5 = $$2.b($$3 = $$3.d());
        if ($$5 > 1.0 - 0.025 / $$4) {
            return $$0.B(this);
        }
        return false;
    }

    @Override
    protected float b(bgl $$0, bfk $$1) {
        return 2.55f;
    }

    @Override
    public void b_() {
        if (this.dI().B) {
            for (int $$0 = 0; $$0 < 2; ++$$0) {
                this.dI().a(iv.X, this.d(0.5), this.dq() - 0.25, this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
            }
        }
        this.bk = false;
        if (!this.dI().B) {
            this.a((aif)this.dI(), true);
        }
        super.b_();
    }

    @Override
    public boolean fb() {
        return true;
    }

    @Override
    protected void W() {
        float $$0;
        if (this.dI().N() && this.ag >= this.bY + 600 && ($$0 = this.bj()) > 0.5f && this.dI().g(this.di()) && this.af.i() * 30.0f < ($$0 - 0.4f) * 2.0f) {
            this.h((bfz)null);
            this.w();
        }
        super.W();
    }

    protected boolean w() {
        if (this.dI().r_() || !this.bs()) {
            return false;
        }
        double $$0 = this.dn() + (this.af.j() - 0.5) * 64.0;
        double $$1 = this.dp() + (double)(this.af.a(64) - 32);
        double $$2 = this.dt() + (this.af.j() - 0.5) * 64.0;
        return this.r($$0, $$1, $$2);
    }

    boolean a(bfj $$0) {
        eei $$1 = new eei(this.dn() - $$0.dn(), this.e(0.5) - $$0.dr(), this.dt() - $$0.dt());
        $$1 = $$1.d();
        double $$2 = 16.0;
        double $$3 = this.dn() + (this.af.j() - 0.5) * 8.0 - $$1.c * 16.0;
        double $$4 = this.dp() + (double)(this.af.a(16) - 8) - $$1.d * 16.0;
        double $$5 = this.dt() + (this.af.j() - 0.5) * 8.0 - $$1.e * 16.0;
        return this.r($$3, $$4, $$5);
    }

    private boolean r(double $$0, double $$1, double $$2) {
        gu.a $$3 = new gu.a($$0, $$1, $$2);
        while ($$3.v() > this.dI().C_() && !this.dI().a_($$3).d()) {
            $$3.c(ha.a);
        }
        dcb $$4 = this.dI().a_($$3);
        boolean $$5 = $$4.d();
        boolean $$6 = $$4.u().a(anb.a);
        if (!$$5 || $$6) {
            return false;
        }
        eei $$7 = this.dg();
        boolean $$8 = this.b($$0, $$1, $$2, true);
        if ($$8) {
            this.dI().a(dgl.S, $$7, dgl.a.a(this));
            if (!this.aQ()) {
                this.dI().a(null, this.J, this.K, this.L, amh.hh, this.cY(), 1.0f, 1.0f);
                this.a(amh.hh, 1.0f, 1.0f);
            }
        }
        return $$8;
    }

    @Override
    protected amg s() {
        return this.fZ() ? amh.hf : amh.hc;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.he;
    }

    @Override
    protected amg g_() {
        return amh.hd;
    }

    @Override
    protected void a(ben $$0, int $$1, boolean $$2) {
        super.a($$0, $$1, $$2);
        dcb $$3 = this.fY();
        if ($$3 != null) {
            cfz $$4 = new cfz(cgc.ou);
            $$4.a(ckk.v, 1);
            dzq.a $$5 = new dzq.a((aif)this.dI()).a(ebw.f, this.dg()).a(ebw.i, $$4).b(ebw.a, this);
            List<cfz> $$6 = $$3.a($$5);
            for (cfz $$7 : $$6) {
                this.b($$7);
            }
        }
    }

    public void d(@Nullable dcb $$0) {
        this.am.b(bU, Optional.ofNullable($$0));
    }

    @Nullable
    public dcb fY() {
        return this.am.b(bU).orElse(null);
    }

    @Override
    public boolean a(ben $$0, float $$1) {
        if (this.b($$0)) {
            return false;
        }
        boolean $$2 = $$0.c() instanceof bzr;
        if ($$0.a(amy.j) || $$2) {
            boolean $$3 = $$2 && this.a($$0, (bzr)$$0.c(), $$1);
            for (int $$4 = 0; $$4 < 64; ++$$4) {
                if (!this.w()) continue;
                return true;
            }
            return $$3;
        }
        boolean $$5 = super.a($$0, $$1);
        if (!this.dI().r_() && !($$0.d() instanceof bfz) && this.af.a(10) != 0) {
            this.w();
        }
        return $$5;
    }

    private boolean a(ben $$0, bzr $$1, float $$2) {
        boolean $$6;
        cfz $$3 = $$1.j();
        chw $$4 = chy.d($$3);
        List<bfa> $$5 = chy.a($$3);
        boolean bl2 = $$6 = $$4 == chz.c && $$5.isEmpty();
        if ($$6) {
            return super.a($$0, $$2);
        }
        return false;
    }

    public boolean fZ() {
        return this.am.b(bV);
    }

    public boolean ga() {
        return this.am.b(bW);
    }

    public void gb() {
        this.am.b(bW, true);
    }

    @Override
    public boolean T() {
        return super.T() || this.fY() != null;
    }

    static class a
    extends bmv {
        private final bvs a;
        @Nullable
        private bfz b;

        public a(bvs $$0) {
            this.a = $$0;
            this.a(EnumSet.of(bmv.a.c, bmv.a.a));
        }

        @Override
        public boolean a() {
            this.b = this.a.j();
            if (!(this.b instanceof byo)) {
                return false;
            }
            double $$0 = this.b.f((bfj)this.a);
            if ($$0 > 256.0) {
                return false;
            }
            return this.a.g((byo)this.b);
        }

        @Override
        public void c() {
            this.a.J().n();
        }

        @Override
        public void e() {
            this.a.E().a(this.b.dn(), this.b.dr(), this.b.dt());
        }
    }

    static class b
    extends bmv {
        private final bvs a;

        public b(bvs $$0) {
            this.a = $$0;
        }

        @Override
        public boolean a() {
            if (this.a.fY() == null) {
                return false;
            }
            if (!this.a.dI().X().b(cmi.c)) {
                return false;
            }
            return this.a.ec().a(b.b(2000)) == 0;
        }

        @Override
        public void e() {
            apf $$0 = this.a.ec();
            cmm $$1 = this.a.dI();
            int $$2 = apa.a(this.a.dn() - 1.0 + $$0.j() * 2.0);
            int $$3 = apa.a(this.a.dp() + $$0.j() * 2.0);
            int $$4 = apa.a(this.a.dt() - 1.0 + $$0.j() * 2.0);
            gu $$5 = new gu($$2, $$3, $$4);
            dcb $$6 = $$1.a_($$5);
            gu $$7 = $$5.d();
            dcb $$8 = $$1.a_($$7);
            dcb $$9 = this.a.fY();
            if ($$9 == null) {
                return;
            }
            if (this.a($$1, $$5, $$9 = cpn.b($$9, this.a.dI(), $$5), $$6, $$8, $$7)) {
                $$1.a($$5, $$9, 3);
                $$1.a(dgl.i, $$5, dgl.a.a(this.a, $$9));
                this.a.d((dcb)null);
            }
        }

        private boolean a(cmm $$0, gu $$1, dcb $$2, dcb $$3, dcb $$4, gu $$5) {
            return $$3.i() && !$$4.i() && !$$4.a(cpo.F) && $$4.r($$0, $$5) && $$2.a((cmp)$$0, $$1) && $$0.a_(this.a, eed.a(eei.a($$1))).isEmpty();
        }
    }

    static class d
    extends bmv {
        private final bvs a;

        public d(bvs $$0) {
            this.a = $$0;
        }

        @Override
        public boolean a() {
            if (this.a.fY() != null) {
                return false;
            }
            if (!this.a.dI().X().b(cmi.c)) {
                return false;
            }
            return this.a.ec().a(bvs$d.b(20)) == 0;
        }

        @Override
        public void e() {
            apf $$0 = this.a.ec();
            cmm $$1 = this.a.dI();
            int $$2 = apa.a(this.a.dn() - 2.0 + $$0.j() * 4.0);
            int $$3 = apa.a(this.a.dp() + $$0.j() * 3.0);
            int $$4 = apa.a(this.a.dt() - 2.0 + $$0.j() * 4.0);
            gu $$5 = new gu($$2, $$3, $$4);
            dcb $$6 = $$1.a_($$5);
            eei $$7 = new eei((double)this.a.dm() + 0.5, (double)$$3 + 0.5, (double)this.a.ds() + 0.5);
            eei $$8 = new eei((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
            eee $$9 = $$1.a(new clv($$7, $$8, clv.a.b, clv.b.a, this.a));
            boolean $$10 = $$9.a().equals($$5);
            if ($$6.a(amw.aj) && $$10) {
                $$1.a($$5, false);
                $$1.a(dgl.f, $$5, dgl.a.a(this.a, $$6));
                this.a.d($$6.b().n());
            }
        }
    }

    static class c
    extends boo<byo> {
        private final bvs i;
        @Nullable
        private byo j;
        private int k;
        private int l;
        private final bqm m;
        private final bqm n = bqm.a().d();
        private final Predicate<bfz> o;

        public c(bvs $$0, @Nullable Predicate<bfz> $$12) {
            super($$0, byo.class, 10, false, false, $$12);
            this.i = $$0;
            this.o = $$1 -> ($$0.g((byo)$$1) || $$0.a_((bfz)$$1)) && !$$0.w((bfj)$$1);
            this.m = bqm.a().a(this.l()).a(this.o);
        }

        @Override
        public boolean a() {
            this.j = this.i.dI().a(this.m, this.i);
            return this.j != null;
        }

        @Override
        public void c() {
            this.k = this.a(5);
            this.l = 0;
            this.i.gb();
        }

        @Override
        public void d() {
            this.j = null;
            super.d();
        }

        @Override
        public boolean b() {
            if (this.j != null) {
                if (!this.o.test(this.j)) {
                    return false;
                }
                this.i.a((bfj)this.j, 10.0f, 10.0f);
                return true;
            }
            if (this.c != null) {
                if (this.i.w(this.c)) {
                    return false;
                }
                if (this.n.a(this.i, this.c)) {
                    return true;
                }
            }
            return super.b();
        }

        @Override
        public void e() {
            if (this.i.j() == null) {
                super.a((bfz)null);
            }
            if (this.j != null) {
                if (--this.k <= 0) {
                    this.c = this.j;
                    this.j = null;
                    super.c();
                }
            } else {
                if (this.c != null && !this.i.bM()) {
                    if (this.i.g((byo)this.c)) {
                        if (this.c.f((bfj)this.i) < 16.0) {
                            this.i.w();
                        }
                        this.l = 0;
                    } else if (this.c.f((bfj)this.i) > 256.0 && this.l++ >= this.a(30) && this.i.a((bfj)this.c)) {
                        this.l = 0;
                    }
                }
                super.e();
            }
        }
    }
}

