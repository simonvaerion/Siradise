/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
import com.google.common.collect.Sets;
import java.util.LinkedHashSet;
import java.util.UUID;
import javax.annotation.Nullable;

public class bwp
extends brl
implements bfw,
bgq {
    private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
    private static final bhe bU = new bhe(bT, "Strider suffocating modifier", (double)-0.34f, bhe.a.b);
    private static final float bW = 0.35f;
    private static final float bX = 0.55f;
    private static final ciz bY = ciz.a(cgc.dh);
    private static final ciz bZ = ciz.a(cgc.dh, cgc.ng);
    private static final aby<Integer> ca = acb.a(bwp.class, aca.b);
    private static final aby<Boolean> cb = acb.a(bwp.class, aca.k);
    private static final aby<Boolean> cc = acb.a(bwp.class, aca.k);
    private final bfv cd;
    @Nullable
    private bod ce;
    @Nullable
    private bno cf;

    public bwp(bfn<? extends bwp> $$0, cmm $$1) {
        super((bfn<? extends brl>)$$0, $$1);
        this.cd = new bfv(this.am, ca, cc);
        this.H = true;
        this.a(dxp.j, -1.0f);
        this.a(dxp.i, 0.0f);
        this.a(dxp.n, 0.0f);
        this.a(dxp.o, 0.0f);
    }

    public static boolean c(bfn<bwp> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
        gu.a $$5 = $$3.j();
        do {
            $$5.c(ha.b);
        } while ($$1.b_($$5).a(anb.b));
        return $$1.a_($$5).i();
    }

    @Override
    public void a(aby<?> $$0) {
        if (ca.equals($$0) && this.dI().B) {
            this.cd.a();
        }
        super.a($$0);
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(ca, 0);
        this.am.a(cb, false);
        this.am.a(cc, false);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        this.cd.a($$0);
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.cd.b($$0);
    }

    @Override
    public boolean i() {
        return this.cd.d();
    }

    @Override
    public boolean g() {
        return this.bs() && !this.h_();
    }

    @Override
    public void a(@Nullable ami $$0) {
        this.cd.a(true);
        if ($$0 != null) {
            this.dI().a(null, this, amh.wr, $$0, 0.5f, 1.0f);
        }
    }

    @Override
    protected void x() {
        this.cf = new bno(this, 1.65);
        this.bO.a(1, this.cf);
        this.bO.a(2, new bmh(this, 1.0));
        this.ce = new bod(this, 1.4, bZ, false);
        this.bO.a(3, this.ce);
        this.bO.a(4, new a(this, 1.0));
        this.bO.a(5, new bmu(this, 1.0));
        this.bO.a(7, new bns(this, 1.0, 60));
        this.bO.a(8, new bnd(this, byo.class, 8.0f));
        this.bO.a(8, new bnq(this));
        this.bO.a(9, new bnd(this, bwp.class, 8.0f));
    }

    public void w(boolean $$0) {
        this.am.b(cb, $$0);
        bhc $$1 = this.a(bhg.d);
        if ($$1 != null) {
            $$1.b(bT);
            if ($$0) {
                $$1.b(bU);
            }
        }
    }

    public boolean q() {
        return this.am.b(cb);
    }

    @Override
    public boolean a(dxe $$0) {
        return $$0.a(anb.b);
    }

    @Override
    public double bx() {
        float $$0 = Math.min(0.25f, this.aR.a());
        float $$1 = this.aR.b();
        return (double)this.de() - 0.19 + (double)(0.12f * apa.b($$1 * 1.5f) * 2.0f * $$0);
    }

    @Override
    public boolean a(cmp $$0) {
        return $$0.f(this);
    }

    @Override
    @Nullable
    public bfz cL() {
        byo $$0;
        bfj bfj2 = this.cO();
        if (bfj2 instanceof byo && (($$0 = (byo)bfj2).eO().a(cgc.ng) || $$0.eP().a(cgc.ng))) {
            return $$0;
        }
        return null;
    }

    @Override
    public eei b(bfz $$0) {
        eei[] $$1 = new eei[]{bwp.a(this.dd(), (double)$$0.dd(), $$0.dy()), bwp.a(this.dd(), (double)$$0.dd(), $$0.dy() - 22.5f), bwp.a(this.dd(), (double)$$0.dd(), $$0.dy() + 22.5f), bwp.a(this.dd(), (double)$$0.dd(), $$0.dy() - 45.0f), bwp.a(this.dd(), (double)$$0.dd(), $$0.dy() + 45.0f)};
        LinkedHashSet $$2 = Sets.newLinkedHashSet();
        double $$3 = this.cE().e;
        double $$4 = this.cE().b - 0.5;
        gu.a $$5 = new gu.a();
        for (eei $$6 : $$1) {
            $$5.b(this.dn() + $$6.c, $$3, this.dt() + $$6.e);
            for (double $$7 = $$3; $$7 > $$4; $$7 -= 1.0) {
                $$2.add($$5.i());
                $$5.c(ha.a);
            }
        }
        for (gu $$8 : $$2) {
            double $$9;
            if (this.dI().b_($$8).a(anb.b) || !cak.a($$9 = this.dI().i($$8))) continue;
            eei $$10 = eei.a($$8, $$9);
            for (bgl $$11 : $$0.fv()) {
                eed $$12 = $$0.g($$11);
                if (!cak.a(this.dI(), $$0, $$12.c($$10))) continue;
                $$0.b($$11);
                return $$10;
            }
        }
        return new eei(this.dn(), this.cE().e, this.dt());
    }

    @Override
    protected void a(byo $$0, eei $$1) {
        this.a($$0.dy(), $$0.dA() * 0.5f);
        this.aV = this.aX = this.dy();
        this.M = this.aX;
        this.cd.b();
        super.a($$0, $$1);
    }

    @Override
    protected eei b(byo $$0, eei $$1) {
        return new eei(0.0, 0.0, 1.0);
    }

    @Override
    protected float e(byo $$0) {
        return (float)(this.b(bhg.d) * (double)(this.q() ? 0.35f : 0.55f) * (double)this.cd.c());
    }

    @Override
    protected float aI() {
        return this.Y + 0.6f;
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        this.a(this.bi() ? amh.wp : amh.wo, 1.0f, 1.0f);
    }

    @Override
    public boolean a() {
        return this.cd.a(this.ec());
    }

    @Override
    protected void a(double $$0, boolean $$1, dcb $$2, gu $$3) {
        this.aM();
        if (this.bi()) {
            this.n();
            return;
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void l() {
        if (this.fY() && this.af.a(140) == 0) {
            this.a(amh.wk, 1.0f, this.eS());
        } else if (this.w() && this.af.a(60) == 0) {
            this.a(amh.wl, 1.0f, this.eS());
        }
        if (!this.fQ()) {
            bwp $$3;
            dcb $$0 = this.dI().a_(this.di());
            dcb $$1 = this.be();
            boolean $$2 = $$0.a(amw.aS) || $$1.a(amw.aS) || this.b(anb.b) > 0.0;
            bfj bfj2 = this.cW();
            boolean $$4 = bfj2 instanceof bwp && ($$3 = (bwp)bfj2).q();
            this.w(!$$2 || $$4);
        }
        super.l();
        this.ge();
        this.aM();
    }

    private boolean w() {
        return this.cf != null && this.cf.k();
    }

    private boolean fY() {
        return this.ce != null && this.ce.i();
    }

    @Override
    protected boolean z() {
        return true;
    }

    private void ge() {
        if (this.bi()) {
            een $$0 = een.a(this);
            if (!$$0.a(cua.c, this.di(), true) || this.dI().b_(this.di().c()).a(anb.b)) {
                this.f(this.dl().a(0.5).b(0.0, 0.05, 0.0));
            } else {
                this.c(true);
            }
        }
    }

    public static bhf.a r() {
        return bgb.y().a(bhg.d, 0.175f).a(bhg.b, 16.0);
    }

    @Override
    protected amg s() {
        if (this.w() || this.fY()) {
            return null;
        }
        return amh.wj;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.wn;
    }

    @Override
    protected amg g_() {
        return amh.wm;
    }

    @Override
    protected boolean o(bfj $$0) {
        return !this.bN() && !((bfj)this).a(anb.b);
    }

    @Override
    public boolean fb() {
        return true;
    }

    @Override
    public boolean bL() {
        return false;
    }

    @Override
    protected bpj b(cmm $$0) {
        return new b(this, $$0);
    }

    @Override
    public float a(gu $$0, cmp $$1) {
        if ($$1.a_($$0).u().a(anb.b)) {
            return 10.0f;
        }
        return this.bi() ? Float.NEGATIVE_INFINITY : 0.0f;
    }

    @Nullable
    public bwp b(aif $$0, bfe $$1) {
        return bfn.aV.a($$0);
    }

    @Override
    public boolean m(cfz $$0) {
        return bY.a($$0);
    }

    @Override
    protected void eu() {
        super.eu();
        if (this.i()) {
            this.a((cml)cgc.mZ);
        }
    }

    @Override
    public bdx b(byo $$0, bdw $$1) {
        boolean $$2 = this.m($$0.b($$1));
        if (!$$2 && this.i() && !this.bN() && !$$0.fD()) {
            if (!this.dI().B) {
                $$0.k(this);
            }
            return bdx.a(this.dI().B);
        }
        bdx $$3 = super.b($$0, $$1);
        if (!$$3.a()) {
            cfz $$4 = $$0.b($$1);
            if ($$4.a(cgc.mZ)) {
                return $$4.a($$0, (bfz)this, $$1);
            }
            return bdx.d;
        }
        if ($$2 && !this.aQ()) {
            this.dI().a(null, this.dn(), this.dp(), this.dt(), amh.wq, this.cY(), 1.0f, 1.0f + (this.af.i() - this.af.i()) * 0.2f);
        }
        return $$3;
    }

    @Override
    public eei cG() {
        return new eei(0.0, 0.6f * this.cF(), this.dd() * 0.4f);
    }

    @Override
    @Nullable
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        if (this.h_()) {
            return super.a($$0, $$1, $$2, $$3, $$4);
        }
        apf $$5 = $$0.y_();
        if ($$5.a(30) == 0) {
            bgb $$6 = bfn.bs.a($$0.C());
            if ($$6 != null) {
                $$3 = this.a($$0, $$1, $$6, new bwv.b(bwv.a($$5), false));
                $$6.a(bfo.a, new cfz(cgc.ng));
                this.a((ami)null);
            }
        } else if ($$5.a(10) == 0) {
            bfe $$7 = bfn.aV.a($$0.C());
            if ($$7 != null) {
                $$7.c_(-24000);
                $$3 = this.a($$0, $$1, $$7, null);
            }
        } else {
            $$3 = new bfe.a(0.5f);
        }
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    private bgt a(cnb $$0, bdv $$1, bgb $$2, @Nullable bgt $$3) {
        $$2.b(this.dn(), this.dp(), this.dt(), this.dy(), 0.0f);
        $$2.a($$0, $$1, bgd.g, $$3, null);
        $$2.a((bfj)this, true);
        return new bfe.a(0.0f);
    }

    @Override
    @Nullable
    public /* synthetic */ bfe a(aif aif2, bfe bfe2) {
        return this.b(aif2, bfe2);
    }

    static class a
    extends bni {
        private final bwp g;

        a(bwp $$0, double $$1) {
            super($$0, $$1, 8, 2);
            this.g = $$0;
        }

        @Override
        public gu k() {
            return this.e;
        }

        @Override
        public boolean b() {
            return !this.g.bi() && this.a(this.g.dI(), this.e);
        }

        @Override
        public boolean a() {
            return !this.g.bi() && super.a();
        }

        @Override
        public boolean l() {
            return this.d % 20 == 0;
        }

        @Override
        protected boolean a(cmp $$0, gu $$1) {
            return $$0.a_($$1).a(cpo.H) && $$0.a_($$1.c()).a((cls)$$0, $$1, dxu.a);
        }
    }

    static class b
    extends bpi {
        b(bwp $$0, cmm $$1) {
            super($$0, $$1);
        }

        @Override
        protected dxv a(int $$0) {
            this.o = new dxy();
            this.o.a(true);
            return new dxv(this.o, $$0);
        }

        @Override
        protected boolean a(dxp $$0) {
            if ($$0 == dxp.i || $$0 == dxp.o || $$0 == dxp.n) {
                return true;
            }
            return super.a($$0);
        }

        @Override
        public boolean a(gu $$0) {
            return this.b.a_($$0).a(cpo.H) || super.a($$0);
        }
    }
}

