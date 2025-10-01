/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class btk
extends brl
implements bds,
bfs,
bgh,
bgk,
bgq {
    public static final int ce = 400;
    public static final int cf = 499;
    public static final int cg = 500;
    public static final double ch = 0.15;
    private static final float bT = (float)btk.b(() -> 0.0);
    private static final float bU = (float)btk.b(() -> 1.0);
    private static final float bW = (float)btk.a(() -> 0.0);
    private static final float bX = (float)btk.a(() -> 1.0);
    private static final float bY = btk.a((int $$0) -> 0);
    private static final float bZ = btk.a((int $$0) -> $$0 - 1);
    private static final float ca = 0.25f;
    private static final float cb = 0.5f;
    private static final Predicate<bfz> cc = $$0 -> $$0 instanceof btk && ((btk)$$0).gs();
    private static final bqm cd = bqm.b().a(16.0).d().a(cc);
    private static final ciz cu = ciz.a(cgc.oI, cgc.qM, cpo.ij.k(), cgc.nF, cgc.tq, cgc.pm, cgc.pn);
    private static final aby<Byte> cv = acb.a(btk.class, aca.a);
    private static final int cw = 2;
    private static final int cx = 4;
    private static final int cy = 8;
    private static final int cz = 16;
    private static final int cA = 32;
    private static final int cB = 64;
    public static final int ci = 0;
    public static final int cj = 1;
    public static final int ck = 2;
    private int cC;
    private int cD;
    private int cE;
    public int cl;
    public int cm;
    protected boolean cn;
    protected bee co;
    protected int cp;
    protected float cq;
    protected boolean cr;
    private float cF;
    private float cG;
    private float cH;
    private float cI;
    private float cJ;
    private float cK;
    protected boolean cs = true;
    protected int ct;
    @Nullable
    private UUID cL;

    protected btk(bfn<? extends btk> $$0, cmm $$1) {
        super((bfn<? extends brl>)$$0, $$1);
        this.r(1.0f);
        this.gu();
    }

    @Override
    protected void x() {
        this.bO.a(1, new bno(this, 1.2));
        this.bO.a(1, new bnz(this, 1.2));
        this.bO.a(2, new bmh(this, 1.0, btk.class));
        this.bO.a(4, new bmu(this, 1.0));
        this.bO.a(6, new boi(this, 0.7));
        this.bO.a(7, new bnd(this, byo.class, 6.0f));
        this.bO.a(8, new bnq(this));
        if (this.ge()) {
            this.bO.a(9, new bnr(this));
        }
        this.go();
    }

    protected void go() {
        this.bO.a(0, new bmp(this));
        this.bO.a(3, new bod(this, 1.25, ciz.a(cgc.tq, cgc.pm, cgc.pn), false));
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(cv, (byte)0);
    }

    protected boolean t(int $$0) {
        return (this.am.b(cv) & $$0) != 0;
    }

    protected void d(int $$0, boolean $$1) {
        byte $$2 = this.am.b(cv);
        if ($$1) {
            this.am.b(cv, (byte)($$2 | $$0));
        } else {
            this.am.b(cv, (byte)($$2 & ~$$0));
        }
    }

    public boolean gn() {
        return this.t(2);
    }

    @Override
    @Nullable
    public UUID U_() {
        return this.cL;
    }

    public void b(@Nullable UUID $$0) {
        this.cL = $$0;
    }

    public boolean gp() {
        return this.cn;
    }

    public void x(boolean $$0) {
        this.d(2, $$0);
    }

    public void y(boolean $$0) {
        this.cn = $$0;
    }

    @Override
    protected void C(float $$0) {
        if ($$0 > 6.0f && this.gq()) {
            this.A(false);
        }
    }

    public boolean gq() {
        return this.t(16);
    }

    public boolean gr() {
        return this.t(32);
    }

    public boolean gs() {
        return this.t(8);
    }

    public void z(boolean $$0) {
        this.d(8, $$0);
    }

    @Override
    public boolean g() {
        return this.bs() && !this.h_() && this.gn();
    }

    @Override
    public void a(@Nullable ami $$0) {
        this.co.a(0, new cfz(cgc.mZ));
    }

    public void b(byo $$0, cfz $$1) {
        if (this.l($$1)) {
            this.co.a(1, $$1.c(1));
            if (!$$0.fO().d) {
                $$1.h(1);
            }
        }
    }

    @Override
    public boolean i() {
        return this.t(4);
    }

    public int gt() {
        return this.cp;
    }

    public void u(int $$0) {
        this.cp = $$0;
    }

    public int v(int $$0) {
        int $$1 = apa.a(this.gt() + $$0, 0, this.gz());
        this.u($$1);
        return $$1;
    }

    @Override
    public boolean bp() {
        return !this.bN();
    }

    private void q() {
        amg $$0;
        this.fY();
        if (!this.aQ() && ($$0 = this.gf()) != null) {
            this.dI().a(null, this.dn(), this.dp(), this.dt(), $$0, this.cY(), 1.0f, 1.0f + (this.af.i() - this.af.i()) * 0.2f);
        }
    }

    @Override
    public boolean a(float $$0, float $$1, ben $$2) {
        int $$3;
        if ($$0 > 1.0f) {
            this.a(amh.ln, 0.4f, 1.0f);
        }
        if (($$3 = this.d($$0, $$1)) <= 0) {
            return false;
        }
        this.a($$2, (float)$$3);
        if (this.bN()) {
            for (bfj $$4 : this.cR()) {
                $$4.a($$2, (float)$$3);
            }
        }
        this.eE();
        return true;
    }

    @Override
    protected int d(float $$0, float $$1) {
        return apa.f(($$0 * 0.5f - 3.0f) * $$1);
    }

    protected int V_() {
        return 2;
    }

    protected void gu() {
        bee $$0 = this.co;
        this.co = new bee(this.V_());
        if ($$0 != null) {
            $$0.b(this);
            int $$1 = Math.min($$0.b(), this.co.b());
            for (int $$2 = 0; $$2 < $$1; ++$$2) {
                cfz $$3 = $$0.a($$2);
                if ($$3.b()) continue;
                this.co.a($$2, $$3.p());
            }
        }
        this.co.a(this);
        this.gv();
    }

    protected void gv() {
        if (this.dI().B) {
            return;
        }
        this.d(4, !this.co.a(0).b());
    }

    @Override
    public void a(bdq $$0) {
        boolean $$1 = this.i();
        this.gv();
        if (this.ag > 20 && !$$1 && this.i()) {
            this.a(this.R_(), 0.5f, 1.0f);
        }
    }

    public double gw() {
        return this.b(bhg.m);
    }

    @Override
    public boolean a(ben $$0, float $$1) {
        boolean $$2 = super.a($$0, $$1);
        if ($$2 && this.af.a(3) == 0) {
            this.gD();
        }
        return $$2;
    }

    protected boolean ge() {
        return true;
    }

    @Nullable
    protected amg gf() {
        return null;
    }

    @Nullable
    protected amg gx() {
        return null;
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        if ($$1.k()) {
            return;
        }
        dcb $$2 = this.dI().a_($$0.c());
        cxa $$3 = $$1.w();
        if ($$2.a(cpo.dN)) {
            $$3 = $$2.w();
        }
        if (this.bN() && this.cs) {
            ++this.ct;
            if (this.ct > 5 && this.ct % 3 == 0) {
                this.a($$3);
            } else if (this.ct <= 5) {
                this.a(amh.lq, $$3.a() * 0.15f, $$3.b());
            }
        } else if (this.b($$3)) {
            this.a(amh.lq, $$3.a() * 0.15f, $$3.b());
        } else {
            this.a(amh.lp, $$3.a() * 0.15f, $$3.b());
        }
    }

    private boolean b(cxa $$0) {
        return $$0 == cxa.b || $$0 == cxa.aP || $$0 == cxa.B || $$0 == cxa.aQ || $$0 == cxa.aO;
    }

    protected void a(cxa $$0) {
        this.a(amh.lk, $$0.a() * 0.15f, $$0.b());
    }

    public static bhf.a gy() {
        return bgb.y().a(bhg.m).a(bhg.a, 53.0).a(bhg.d, 0.225f);
    }

    @Override
    public int fE() {
        return 6;
    }

    public int gz() {
        return 100;
    }

    @Override
    protected float eR() {
        return 0.8f;
    }

    @Override
    public int M() {
        return 400;
    }

    @Override
    public void b(byo $$0) {
        if (!this.dI().B && (!this.bN() || this.u($$0)) && this.gn()) {
            $$0.a(this, this.co);
        }
    }

    public bdx c(byo $$0, cfz $$1) {
        boolean $$2 = this.a($$0, $$1);
        if (!$$0.fO().d) {
            $$1.h(1);
        }
        if (this.dI().B) {
            return bdx.b;
        }
        return $$2 ? bdx.a : bdx.d;
    }

    protected boolean a(byo $$0, cfz $$1) {
        boolean $$2 = false;
        float $$3 = 0.0f;
        int $$4 = 0;
        int $$5 = 0;
        if ($$1.a(cgc.oI)) {
            $$3 = 2.0f;
            $$4 = 20;
            $$5 = 3;
        } else if ($$1.a(cgc.qM)) {
            $$3 = 1.0f;
            $$4 = 30;
            $$5 = 3;
        } else if ($$1.a(cpo.ij.k())) {
            $$3 = 20.0f;
            $$4 = 180;
        } else if ($$1.a(cgc.nF)) {
            $$3 = 3.0f;
            $$4 = 60;
            $$5 = 3;
        } else if ($$1.a(cgc.tq)) {
            $$3 = 4.0f;
            $$4 = 60;
            $$5 = 5;
            if (!this.dI().B && this.gn() && this.h() == 0 && !this.gc()) {
                $$2 = true;
                this.g($$0);
            }
        } else if ($$1.a(cgc.pm) || $$1.a(cgc.pn)) {
            $$3 = 10.0f;
            $$4 = 240;
            $$5 = 10;
            if (!this.dI().B && this.gn() && this.h() == 0 && !this.gc()) {
                $$2 = true;
                this.g($$0);
            }
        }
        if (this.er() < this.eI() && $$3 > 0.0f) {
            this.s($$3);
            $$2 = true;
        }
        if (this.h_() && $$4 > 0) {
            this.dI().a(iv.K, this.d(1.0), this.dq() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dI().B) {
                this.b_($$4);
            }
            $$2 = true;
        }
        if ($$5 > 0 && ($$2 || !this.gn()) && this.gt() < this.gz()) {
            $$2 = true;
            if (!this.dI().B) {
                this.v($$5);
            }
        }
        if ($$2) {
            this.q();
            this.a(dgl.m);
        }
        return $$2;
    }

    protected void f(byo $$0) {
        this.A(false);
        this.B(false);
        if (!this.dI().B) {
            $$0.a_(this.dy());
            $$0.b_(this.dA());
            $$0.k(this);
        }
    }

    @Override
    public boolean eT() {
        return super.eT() && this.bN() && this.i() || this.gq() || this.gr();
    }

    @Override
    public boolean m(cfz $$0) {
        return cu.a($$0);
    }

    private void r() {
        this.cl = 1;
    }

    @Override
    protected void eu() {
        super.eu();
        if (this.co == null) {
            return;
        }
        for (int $$0 = 0; $$0 < this.co.b(); ++$$0) {
            cfz $$1 = this.co.a($$0);
            if ($$1.b() || cki.e($$1)) continue;
            this.b($$1);
        }
    }

    @Override
    public void b_() {
        if (this.af.a(200) == 0) {
            this.r();
        }
        super.b_();
        if (this.dI().B || !this.bs()) {
            return;
        }
        if (this.af.a(900) == 0 && this.aN == 0) {
            this.s(1.0f);
        }
        if (this.gB()) {
            if (!this.gq() && !this.bN() && this.af.a(300) == 0 && this.dI().a_(this.di().d()).a(cpo.i)) {
                this.A(true);
            }
            if (this.gq() && ++this.cC > 50) {
                this.cC = 0;
                this.A(false);
            }
        }
        this.gA();
    }

    protected void gA() {
        btk $$0;
        if (this.gs() && this.h_() && !this.gq() && ($$0 = this.dI().a(btk.class, cd, this, this.dn(), this.dp(), this.dt(), this.cE().g(16.0))) != null && this.f((bfj)$$0) > 4.0) {
            this.bN.a((bfj)$$0, 0);
        }
    }

    public boolean gB() {
        return true;
    }

    @Override
    public void l() {
        super.l();
        if (this.cD > 0 && ++this.cD > 30) {
            this.cD = 0;
            this.d(64, false);
        }
        if (this.cV() && this.cE > 0 && ++this.cE > 20) {
            this.cE = 0;
            this.B(false);
        }
        if (this.cl > 0 && ++this.cl > 8) {
            this.cl = 0;
        }
        if (this.cm > 0) {
            ++this.cm;
            if (this.cm > 300) {
                this.cm = 0;
            }
        }
        this.cG = this.cF;
        if (this.gq()) {
            this.cF += (1.0f - this.cF) * 0.4f + 0.05f;
            if (this.cF > 1.0f) {
                this.cF = 1.0f;
            }
        } else {
            this.cF += (0.0f - this.cF) * 0.4f - 0.05f;
            if (this.cF < 0.0f) {
                this.cF = 0.0f;
            }
        }
        this.cI = this.cH;
        if (this.gr()) {
            this.cG = this.cF = 0.0f;
            this.cH += (1.0f - this.cH) * 0.4f + 0.05f;
            if (this.cH > 1.0f) {
                this.cH = 1.0f;
            }
        } else {
            this.cr = false;
            this.cH += (0.8f * this.cH * this.cH * this.cH - this.cH) * 0.6f - 0.05f;
            if (this.cH < 0.0f) {
                this.cH = 0.0f;
            }
        }
        this.cK = this.cJ;
        if (this.t(64)) {
            this.cJ += (1.0f - this.cJ) * 0.7f + 0.05f;
            if (this.cJ > 1.0f) {
                this.cJ = 1.0f;
            }
        } else {
            this.cJ += (0.0f - this.cJ) * 0.7f - 0.05f;
            if (this.cJ < 0.0f) {
                this.cJ = 0.0f;
            }
        }
    }

    @Override
    public bdx b(byo $$0, bdw $$1) {
        if (this.bN() || this.h_()) {
            return super.b($$0, $$1);
        }
        if (this.gn() && $$0.fD()) {
            this.b($$0);
            return bdx.a(this.dI().B);
        }
        cfz $$2 = $$0.b($$1);
        if (!$$2.b()) {
            bdx $$3 = $$2.a($$0, (bfz)this, $$1);
            if ($$3.a()) {
                return $$3;
            }
            if (this.gH() && this.l($$2) && !this.gI()) {
                this.b($$0, $$2);
                return bdx.a(this.dI().B);
            }
        }
        this.f($$0);
        return bdx.a(this.dI().B);
    }

    private void fY() {
        if (!this.dI().B) {
            this.cD = 1;
            this.d(64, true);
        }
    }

    public void A(boolean $$0) {
        this.d(16, $$0);
    }

    public void B(boolean $$0) {
        if ($$0) {
            this.A(false);
        }
        this.d(32, $$0);
    }

    @Nullable
    public amg gC() {
        return this.s();
    }

    public void gD() {
        if (this.ge() && this.cV()) {
            this.cE = 1;
            this.B(true);
        }
    }

    public void gE() {
        if (!this.gr()) {
            this.gD();
            amg $$0 = this.gx();
            if ($$0 != null) {
                this.a($$0, this.eR(), this.eS());
            }
        }
    }

    public boolean h(byo $$0) {
        this.b($$0.ct());
        this.x(true);
        if ($$0 instanceof aig) {
            ai.x.a((aig)$$0, this);
        }
        this.dI().a((bfj)this, (byte)7);
        return true;
    }

    @Override
    protected void a(byo $$0, eei $$1) {
        super.a($$0, $$1);
        eeh $$2 = this.l($$0);
        this.a($$2.j, $$2.i);
        this.aV = this.aX = this.dy();
        this.M = this.aX;
        if (this.cU()) {
            if ($$1.e <= 0.0) {
                this.ct = 0;
            }
            if (this.ay()) {
                this.y(false);
                if (this.cq > 0.0f && !this.gp()) {
                    this.b(this.cq, $$1);
                }
                this.cq = 0.0f;
            }
        }
    }

    protected eeh l(bfz $$0) {
        return new eeh($$0.dA() * 0.5f, $$0.dy());
    }

    @Override
    protected eei b(byo $$0, eei $$1) {
        if (this.ay() && this.cq == 0.0f && this.gr() && !this.cr) {
            return eei.b;
        }
        float $$2 = $$0.bl * 0.5f;
        float $$3 = $$0.bn;
        if ($$3 <= 0.0f) {
            $$3 *= 0.25f;
        }
        return new eei($$2, 0.0, $$3);
    }

    @Override
    protected float e(byo $$0) {
        return (float)this.b(bhg.d);
    }

    protected void b(float $$0, eei $$1) {
        double $$2 = this.gw() * (double)$$0 * (double)this.aG();
        double $$3 = $$2 + (double)this.eV();
        eei $$4 = this.dl();
        this.o($$4.c, $$3, $$4.e);
        this.y(true);
        this.at = true;
        if ($$1.e > 0.0) {
            float $$5 = apa.a(this.dy() * ((float)Math.PI / 180));
            float $$6 = apa.b(this.dy() * ((float)Math.PI / 180));
            this.f(this.dl().b(-0.4f * $$5 * $$0, 0.0, 0.4f * $$6 * $$0));
        }
    }

    protected void gF() {
        this.a(amh.lm, 0.4f, 1.0f);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("EatingHaystack", this.gq());
        $$0.a("Bred", this.gs());
        $$0.a("Temper", this.gt());
        $$0.a("Tame", this.gn());
        if (this.U_() != null) {
            $$0.a("Owner", this.U_());
        }
        if (!this.co.a(0).b()) {
            $$0.a("SaddleItem", this.co.a(0).b(new qr()));
        }
    }

    @Override
    public void a(qr $$0) {
        cfz $$4;
        UUID $$3;
        super.a($$0);
        this.A($$0.q("EatingHaystack"));
        this.z($$0.q("Bred"));
        this.u($$0.h("Temper"));
        this.x($$0.q("Tame"));
        if ($$0.b("Owner")) {
            UUID $$1 = $$0.a("Owner");
        } else {
            String $$2 = $$0.l("Owner");
            $$3 = alj.a(this.cI(), $$2);
        }
        if ($$3 != null) {
            this.b($$3);
        }
        if ($$0.b("SaddleItem", 10) && ($$4 = cfz.a($$0.p("SaddleItem"))).a(cgc.mZ)) {
            this.co.a(0, $$4);
        }
        this.gv();
    }

    @Override
    public boolean a(brl $$0) {
        return false;
    }

    protected boolean gG() {
        return !this.bN() && !this.bM() && this.gn() && !this.h_() && this.er() >= this.eI() && this.gc();
    }

    @Override
    @Nullable
    public bfe a(aif $$0, bfe $$1) {
        return null;
    }

    protected void a(bfe $$0, btk $$1) {
        this.a($$0, $$1, bhg.a, (double)bY, (double)bZ);
        this.a($$0, $$1, bhg.m, (double)bW, (double)bX);
        this.a($$0, $$1, bhg.d, (double)bT, (double)bU);
    }

    private void a(bfe $$0, btk $$1, bhb $$2, double $$3, double $$4) {
        double $$5 = btk.a(this.c($$2), $$0.c($$2), $$3, $$4, this.af);
        $$1.a($$2).a($$5);
    }

    static double a(double $$0, double $$1, double $$2, double $$3, apf $$4) {
        double $$8;
        if ($$3 <= $$2) {
            throw new IllegalArgumentException("Incorrect range for an attribute");
        }
        $$0 = apa.a($$0, $$2, $$3);
        $$1 = apa.a($$1, $$2, $$3);
        double $$5 = 0.15 * ($$3 - $$2);
        double $$7 = ($$0 + $$1) / 2.0;
        double $$6 = Math.abs($$0 - $$1) + $$5 * 2.0;
        double $$9 = $$7 + $$6 * ($$8 = ($$4.j() + $$4.j() + $$4.j()) / 3.0 - 0.5);
        if ($$9 > $$3) {
            double $$10 = $$9 - $$3;
            return $$3 - $$10;
        }
        if ($$9 < $$2) {
            double $$11 = $$2 - $$9;
            return $$2 + $$11;
        }
        return $$9;
    }

    public float D(float $$0) {
        return apa.i($$0, this.cG, this.cF);
    }

    public float E(float $$0) {
        return apa.i($$0, this.cI, this.cH);
    }

    public float F(float $$0) {
        return apa.i($$0, this.cK, this.cJ);
    }

    @Override
    public void b(int $$0) {
        if (!this.i()) {
            return;
        }
        if ($$0 < 0) {
            $$0 = 0;
        } else {
            this.cr = true;
            this.gD();
        }
        this.cq = $$0 >= 90 ? 1.0f : 0.4f + 0.4f * (float)$$0 / 90.0f;
    }

    @Override
    public boolean a() {
        return this.i();
    }

    @Override
    public void c(int $$0) {
        this.cr = true;
        this.gD();
        this.gF();
    }

    @Override
    public void b() {
    }

    protected void C(boolean $$0) {
        iy $$1 = $$0 ? iv.M : iv.Z;
        for (int $$2 = 0; $$2 < 7; ++$$2) {
            double $$3 = this.af.k() * 0.02;
            double $$4 = this.af.k() * 0.02;
            double $$5 = this.af.k() * 0.02;
            this.dI().a($$1, this.d(1.0), this.dq() + 0.5, this.g(1.0), $$3, $$4, $$5);
        }
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 7) {
            this.C(true);
        } else if ($$0 == 6) {
            this.C(false);
        } else {
            super.b($$0);
        }
    }

    @Override
    protected void a(bfj $$0, bfj.a $$1) {
        super.a($$0, $$1);
        if (this.cI > 0.0f) {
            float $$2 = apa.a(this.aV * ((float)Math.PI / 180));
            float $$3 = apa.b(this.aV * ((float)Math.PI / 180));
            float $$4 = 0.7f * this.cI;
            float $$5 = 0.15f * this.cI;
            $$1.accept($$0, this.dn() + (double)($$4 * $$2), this.dp() + this.bx() + $$0.bw() + (double)$$5, this.dt() - (double)($$4 * $$3));
            if ($$0 instanceof bfz) {
                ((bfz)$$0).aV = this.aV;
            }
        }
    }

    protected static float a(IntUnaryOperator $$0) {
        return 15.0f + (float)$$0.applyAsInt(8) + (float)$$0.applyAsInt(9);
    }

    protected static double a(DoubleSupplier $$0) {
        return (double)0.4f + $$0.getAsDouble() * 0.2 + $$0.getAsDouble() * 0.2 + $$0.getAsDouble() * 0.2;
    }

    protected static double b(DoubleSupplier $$0) {
        return ((double)0.45f + $$0.getAsDouble() * 0.3 + $$0.getAsDouble() * 0.3 + $$0.getAsDouble() * 0.3) * 0.25;
    }

    @Override
    public boolean i_() {
        return false;
    }

    @Override
    protected float b(bgl $$0, bfk $$1) {
        return $$1.b * 0.95f;
    }

    public boolean gH() {
        return false;
    }

    public boolean gI() {
        return !this.c(bfo.e).b();
    }

    public boolean l(cfz $$0) {
        return false;
    }

    private bgs a(final int $$0, final Predicate<cfz> $$1) {
        return new bgs(){

            @Override
            public cfz a() {
                return btk.this.co.a($$0);
            }

            @Override
            public boolean a(cfz $$02) {
                if (!$$1.test($$02)) {
                    return false;
                }
                btk.this.co.a($$0, $$02);
                btk.this.gv();
                return true;
            }
        };
    }

    @Override
    public bgs a_(int $$02) {
        int $$2;
        int $$1 = $$02 - 400;
        if ($$1 >= 0 && $$1 < 2 && $$1 < this.co.b()) {
            if ($$1 == 0) {
                return this.a($$1, (cfz $$0) -> $$0.b() || $$0.a(cgc.mZ));
            }
            if ($$1 == 1) {
                if (!this.gH()) {
                    return bgs.b;
                }
                return this.a($$1, (cfz $$0) -> $$0.b() || this.l((cfz)$$0));
            }
        }
        if (($$2 = $$02 - 500 + 2) >= 2 && $$2 < this.co.b()) {
            return bgs.a(this.co, $$2);
        }
        return super.a_($$02);
    }

    @Override
    @Nullable
    public bfz cL() {
        bfj bfj2 = this.cO();
        if (bfj2 instanceof bgb) {
            bgb $$0 = (bgb)bfj2;
            return $$0;
        }
        if (this.i() && (bfj2 = this.cO()) instanceof byo) {
            byo $$1 = (byo)bfj2;
            return $$1;
        }
        return null;
    }

    @Nullable
    private eei a(eei $$0, bfz $$1) {
        double $$2 = this.dn() + $$0.c;
        double $$3 = this.cE().b;
        double $$4 = this.dt() + $$0.e;
        gu.a $$5 = new gu.a();
        block0: for (bgl $$6 : $$1.fv()) {
            $$5.b($$2, $$3, $$4);
            double $$7 = this.cE().e + 0.75;
            do {
                double $$8 = this.dI().i($$5);
                if ((double)$$5.v() + $$8 > $$7) continue block0;
                if (cak.a($$8)) {
                    eed $$9 = $$1.g($$6);
                    eei $$10 = new eei($$2, (double)$$5.v() + $$8, $$4);
                    if (cak.a(this.dI(), $$1, $$9.c($$10))) {
                        $$1.b($$6);
                        return $$10;
                    }
                }
                $$5.c(ha.b);
            } while ((double)$$5.v() < $$7);
        }
        return null;
    }

    @Override
    public eei b(bfz $$0) {
        eei $$1 = btk.a(this.dd(), (double)$$0.dd(), this.dy() + ($$0.fh() == bft.b ? 90.0f : -90.0f));
        eei $$2 = this.a($$1, $$0);
        if ($$2 != null) {
            return $$2;
        }
        eei $$3 = btk.a(this.dd(), (double)$$0.dd(), this.dy() + ($$0.fh() == bft.a ? 90.0f : -90.0f));
        eei $$4 = this.a($$3, $$0);
        if ($$4 != null) {
            return $$4;
        }
        return this.dg();
    }

    protected void a(apf $$0) {
    }

    @Override
    @Nullable
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        if ($$3 == null) {
            $$3 = new bfe.a(0.2f);
        }
        this.a($$0.y_());
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    public boolean b(bdq $$0) {
        return this.co != $$0;
    }

    public int gJ() {
        return this.M();
    }

    @Override
    public /* synthetic */ cmd e() {
        return super.dI();
    }
}

