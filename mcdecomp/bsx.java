/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.serialization.Dynamic
 *  javax.annotation.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bsx
extends btk
implements bgk,
bgp,
bgq {
    public static final ciz bT = ciz.a(cgc.eA);
    public static final int bU = 55;
    public static final int bW = 30;
    private static final float cu = 0.1f;
    private static final float cv = 1.4285f;
    private static final float cw = 22.2222f;
    private static final int cx = 5;
    private static final int cy = 40;
    private static final int cz = 52;
    private static final int cA = 80;
    private static final float cB = 1.43f;
    public static final aby<Boolean> bX = acb.a(bsx.class, aca.k);
    public static final aby<Long> bY = acb.a(bsx.class, aca.c);
    public final bff bZ = new bff();
    public final bff ca = new bff();
    public final bff cb = new bff();
    public final bff cc = new bff();
    public final bff cd = new bff();
    private static final bfk cC = bfk.b(bfn.l.k(), bfn.l.l() - 1.43f);
    private int cD = 0;
    private int cE = 0;

    public bsx(bfn<? extends bsx> $$0, cmm $$1) {
        super((bfn<? extends btk>)$$0, $$1);
        this.r(1.5f);
        this.bL = new b();
        bpi $$2 = (bpi)this.J();
        $$2.a(true);
        $$2.e(true);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("LastPoseTick", this.am.b(bY));
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        long $$1 = $$0.i("LastPoseTick");
        if ($$1 < 0L) {
            this.b(bgl.k);
        }
        this.a($$1);
    }

    public static bhf.a q() {
        return bsx.gy().a(bhg.a, 32.0).a(bhg.d, 0.09f).a(bhg.m, 0.42f);
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(bX, false);
        this.am.a(bY, 0L);
    }

    @Override
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        bsy.a(this, $$0.y_());
        this.b($$0.C().V());
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    protected bha.b<bsx> dL() {
        return bsy.a();
    }

    @Override
    protected void x() {
    }

    @Override
    protected bha<?> a(Dynamic<?> $$0) {
        return bsy.a(this.dL().a($$0));
    }

    @Override
    public bfk a(bgl $$0) {
        return $$0 == bgl.k ? cC.a(this.dV()) : super.a($$0);
    }

    @Override
    protected float b(bgl $$0, bfk $$1) {
        return $$1.b - 0.1f;
    }

    @Override
    public double d() {
        return 0.5;
    }

    @Override
    protected void W() {
        this.dI().ad().a("camelBrain");
        bha<?> $$0 = this.dK();
        $$0.a((aif)this.dI(), this);
        this.dI().ad().c();
        this.dI().ad().a("camelActivityUpdate");
        bsy.a(this);
        this.dI().ad().c();
        super.W();
    }

    @Override
    public void l() {
        super.l();
        if (this.w() && this.cD < 50 && (this.ay() || this.aV() || this.bM())) {
            this.w(false);
        }
        if (this.cD > 0) {
            --this.cD;
            if (this.cD == 0) {
                this.dI().a(null, this.di(), amh.cS, ami.g, 1.0f, 1.0f);
            }
        }
        if (this.dI().r_()) {
            this.gK();
        }
        if (this.r()) {
            this.a((bfj)this, 30.0f);
        }
        if (this.gg() && this.aV()) {
            this.gl();
        }
    }

    private void gK() {
        if (this.cE <= 0) {
            this.cE = this.af.a(40) + 80;
            this.cc.a(this.ag);
        } else {
            --this.cE;
        }
        if (this.gh()) {
            this.cb.a();
            this.cd.a();
            if (this.gL()) {
                this.bZ.b(this.ag);
                this.ca.a();
            } else {
                this.bZ.a();
                this.ca.b(this.ag);
            }
        } else {
            this.bZ.a();
            this.ca.a();
            this.cd.a(this.w(), this.ag);
            this.cb.a(this.gi() && this.gm() >= 0L, this.ag);
        }
    }

    @Override
    protected void v(float $$0) {
        float $$2;
        if (this.al() == bgl.a && !this.cd.c()) {
            float $$1 = Math.min($$0 * 6.0f, 1.0f);
        } else {
            $$2 = 0.0f;
        }
        this.aR.a($$2, 0.2f);
    }

    @Override
    public void h(eei $$0) {
        if (this.r() && this.ay()) {
            this.f(this.dl().d(0.0, 1.0, 0.0));
            $$0 = $$0.d(0.0, 1.0, 0.0);
        }
        super.h($$0);
    }

    @Override
    protected void a(byo $$0, eei $$1) {
        super.a($$0, $$1);
        if ($$0.bn > 0.0f && this.gg() && !this.gi()) {
            this.gk();
        }
    }

    public boolean r() {
        return this.gg() || this.gi();
    }

    @Override
    protected float e(byo $$0) {
        float $$1 = $$0.bV() && this.W_() == 0 ? 0.1f : 0.0f;
        return (float)this.b(bhg.d) + $$1;
    }

    @Override
    protected eeh l(bfz $$0) {
        if (this.r()) {
            return new eeh(this.dA(), this.dy());
        }
        return super.l($$0);
    }

    @Override
    protected eei b(byo $$0, eei $$1) {
        if (this.r()) {
            return eei.b;
        }
        return super.b($$0, $$1);
    }

    @Override
    public boolean a() {
        return !this.r() && super.a();
    }

    @Override
    public void b(int $$0) {
        if (!this.i() || this.cD > 0 || !this.ay()) {
            return;
        }
        super.b($$0);
    }

    @Override
    public boolean dB() {
        return true;
    }

    @Override
    protected void b(float $$0, eei $$1) {
        double $$2 = this.b(bhg.m) * (double)this.aG() + (double)this.eV();
        this.g(this.bD().d(1.0, 0.0, 1.0).d().a((double)(22.2222f * $$0) * this.b(bhg.d) * (double)this.aH()).b(0.0, (double)(1.4285f * $$0) * $$2, 0.0));
        this.cD = 55;
        this.w(true);
        this.at = true;
    }

    public boolean w() {
        return this.am.b(bX);
    }

    public void w(boolean $$0) {
        this.am.b(bX, $$0);
    }

    public boolean fY() {
        return this.dK().a(bpb.Y, bpc.a);
    }

    @Override
    public void c(int $$0) {
        this.a(amh.cR, 1.0f, 1.0f);
        this.w(true);
    }

    @Override
    public void b() {
    }

    @Override
    public int W_() {
        return this.cD;
    }

    @Override
    protected amg s() {
        return amh.cQ;
    }

    @Override
    protected amg g_() {
        return amh.cT;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.cV;
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        if ($$1.w() == cxa.j) {
            this.a(amh.da, 1.0f, 1.0f);
        } else {
            this.a(amh.cZ, 1.0f, 1.0f);
        }
    }

    @Override
    public boolean m(cfz $$0) {
        return bT.a($$0);
    }

    @Override
    public bdx b(byo $$0, bdw $$1) {
        cfz $$2 = $$0.b($$1);
        if ($$0.fD() && !this.h_()) {
            this.b($$0);
            return bdx.a(this.dI().B);
        }
        bdx $$3 = $$2.a($$0, (bfz)this, $$1);
        if ($$3.a()) {
            return $$3;
        }
        if (this.m($$2)) {
            return this.c($$0, $$2);
        }
        if (this.cN().size() < 2 && !this.h_()) {
            this.f($$0);
        }
        return bdx.a(this.dI().B);
    }

    @Override
    protected void C(float $$0) {
        if ($$0 > 6.0f && this.gg() && !this.gi()) {
            this.gk();
        }
    }

    @Override
    protected boolean a(byo $$0, cfz $$1) {
        boolean $$4;
        boolean $$3;
        boolean $$2;
        if (!this.m($$1)) {
            return false;
        }
        boolean bl2 = $$2 = this.er() < this.eI();
        if ($$2) {
            this.s(2.0f);
        }
        boolean bl3 = $$3 = this.gn() && this.h() == 0 && this.fZ();
        if ($$3) {
            this.g($$0);
        }
        if ($$4 = this.h_()) {
            this.dI().a(iv.K, this.d(1.0), this.dq() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dI().B) {
                this.b_(10);
            }
        }
        if ($$2 || $$3 || $$4) {
            amg $$5;
            if (!this.aQ() && ($$5 = this.gf()) != null) {
                this.dI().a(null, this.dn(), this.dp(), this.dt(), $$5, this.cY(), 1.0f, 1.0f + (this.af.i() - this.af.i()) * 0.2f);
            }
            return true;
        }
        return false;
    }

    @Override
    protected boolean ge() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(brl $$0) {
        if ($$0 == this) return false;
        if (!($$0 instanceof bsx)) return false;
        bsx $$1 = (bsx)$$0;
        if (!this.gG()) return false;
        if (!$$1.gG()) return false;
        return true;
    }

    @Nullable
    public bsx b(aif $$0, bfe $$1) {
        return bfn.l.a($$0);
    }

    @Override
    @Nullable
    protected amg gf() {
        return amh.cU;
    }

    @Override
    protected void f(ben $$0, float $$1) {
        this.gl();
        super.f($$0, $$1);
    }

    @Override
    protected void a(bfj $$0, bfj.a $$1) {
        int $$2 = this.cN().indexOf($$0);
        if ($$2 < 0) {
            return;
        }
        boolean $$3 = $$2 == 0;
        float $$4 = 0.5f;
        float $$5 = (float)(this.dD() ? (double)0.01f : this.a($$3, 0.0f) + $$0.bw());
        if (this.cN().size() > 1) {
            if (!$$3) {
                $$4 = -0.7f;
            }
            if ($$0 instanceof brl) {
                $$4 += 0.2f;
            }
        }
        eei $$6 = new eei(0.0, 0.0, $$4).b(-this.aV * ((float)Math.PI / 180));
        $$1.accept($$0, this.dn() + $$6.c, this.dp() + (double)$$5, this.dt() + $$6.e);
        this.a($$0);
    }

    private double a(boolean $$0, float $$1) {
        double $$2 = this.bx();
        float $$3 = this.dV() * 1.43f;
        float $$4 = $$3 - this.dV() * 0.2f;
        float $$5 = $$3 - $$4;
        boolean $$6 = this.gi();
        boolean $$7 = this.gg();
        if ($$6) {
            float $$12;
            int $$11;
            int $$8;
            int n2 = $$8 = $$7 ? 40 : 52;
            if ($$7) {
                int $$9 = 28;
                float $$10 = $$0 ? 0.5f : 0.1f;
            } else {
                $$11 = $$0 ? 24 : 32;
                $$12 = $$0 ? 0.6f : 0.35f;
            }
            float $$13 = apa.a((float)this.gm() + $$1, 0.0f, (float)$$8);
            boolean $$14 = $$13 < (float)$$11;
            float $$15 = $$14 ? $$13 / (float)$$11 : ($$13 - (float)$$11) / (float)($$8 - $$11);
            float $$16 = $$3 - $$12 * $$4;
            $$2 += $$7 ? (double)apa.i($$15, $$14 ? $$3 : $$16, $$14 ? $$16 : $$5) : (double)apa.i($$15, $$14 ? $$5 - $$3 : $$5 - $$16, $$14 ? $$5 - $$16 : 0.0f);
        }
        if ($$7 && !$$6) {
            $$2 += (double)$$5;
        }
        return $$2;
    }

    @Override
    public eei p(float $$0) {
        return new eei(0.0, this.a(true, $$0) - (double)(0.2f * this.dV()), this.dd() * 0.56f);
    }

    @Override
    public double bx() {
        return this.a((bgl)(this.gg() ? bgl.k : bgl.a)).b - (this.h_() ? 0.35f : 0.6f);
    }

    @Override
    public void j(bfj $$0) {
        if (this.cL() != $$0) {
            this.a($$0);
        }
    }

    private void a(bfj $$0) {
        $$0.o(this.dy());
        float $$1 = $$0.dy();
        float $$2 = apa.g($$1 - this.dy());
        float $$3 = apa.a($$2, -160.0f, 160.0f);
        $$0.M += $$3 - $$2;
        float $$4 = $$1 + $$3 - $$2;
        $$0.a_($$4);
        $$0.n($$4);
    }

    private void a(bfj $$0, float $$1) {
        float $$2 = $$0.cm();
        float $$3 = apa.g(this.aV - $$2);
        float $$4 = apa.a(apa.g(this.aV - $$2), -$$1, $$1);
        float $$5 = $$2 + $$3 - $$4;
        $$0.n($$5);
    }

    @Override
    public int fC() {
        return 30;
    }

    @Override
    protected boolean o(bfj $$0) {
        return this.cN().size() <= 2;
    }

    @Override
    @Nullable
    public bfz cL() {
        bfj $$0;
        if (!this.cN().isEmpty() && this.i() && ($$0 = this.cN().get(0)) instanceof bfz) {
            bfz $$1 = (bfz)$$0;
            return $$1;
        }
        return null;
    }

    @Override
    protected void V() {
        super.V();
        za.a(this);
    }

    public boolean gg() {
        return this.am.b(bY) < 0L;
    }

    public boolean gh() {
        return this.gm() < 0L != this.gg();
    }

    public boolean gi() {
        long $$0 = this.gm();
        return $$0 < (long)(this.gg() ? 40 : 52);
    }

    private boolean gL() {
        return this.gg() && this.gm() < 40L && this.gm() >= 0L;
    }

    public void gj() {
        if (this.gg()) {
            return;
        }
        this.a(amh.cX, 1.0f, 1.0f);
        this.b(bgl.k);
        this.a(-this.dI().V());
    }

    public void gk() {
        if (!this.gg()) {
            return;
        }
        this.a(amh.cY, 1.0f, 1.0f);
        this.b(bgl.a);
        this.a(this.dI().V());
    }

    public void gl() {
        this.b(bgl.a);
        this.b(this.dI().V());
    }

    @VisibleForTesting
    public void a(long $$0) {
        this.am.b(bY, $$0);
    }

    private void b(long $$0) {
        this.a(Math.max(0L, $$0 - 52L - 1L));
    }

    public long gm() {
        return this.dI().V() - Math.abs(this.am.b(bY));
    }

    @Override
    public amg R_() {
        return amh.cW;
    }

    @Override
    public void a(aby<?> $$0) {
        if (!this.al && bX.equals($$0)) {
            this.cD = this.cD == 0 ? 55 : this.cD;
        }
        super.a($$0);
    }

    @Override
    protected blt D() {
        return new a(this);
    }

    @Override
    public boolean gn() {
        return true;
    }

    @Override
    public void b(byo $$0) {
        if (!this.dI().B) {
            $$0.a(this, this.co);
        }
    }

    @Override
    @Nullable
    public /* synthetic */ bfe a(aif aif2, bfe bfe2) {
        return this.b(aif2, bfe2);
    }

    class b
    extends bly {
        public b() {
            super(bsx.this);
        }

        @Override
        public void a() {
            if (this.k == bly.a.b && !bsx.this.fO() && bsx.this.gg() && !bsx.this.gi()) {
                bsx.this.gk();
            }
            super.a();
        }
    }

    class a
    extends blt {
        public a(bsx $$0) {
            super($$0);
        }

        @Override
        public void a() {
            if (!bsx.this.r()) {
                super.a();
            }
        }
    }
}

