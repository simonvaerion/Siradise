/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwh
extends bzw {
    private static final Predicate<bfj> e = $$0 -> $$0.bs() && !($$0 instanceof bwh);
    private static final double bT = 0.3;
    private static final double bU = 0.35;
    private static final int bV = 8356754;
    private static final double bW = 0.5725490196078431;
    private static final double bX = 0.5137254901960784;
    private static final double bY = 0.4980392156862745;
    private static final int bZ = 10;
    public static final int b = 40;
    private int ca;
    private int cb;
    private int cc;

    public bwh(bfn<? extends bwh> $$0, cmm $$1) {
        super((bfn<? extends bzw>)$$0, $$1);
        this.r(1.0f);
        this.bJ = 20;
        this.a(dxp.v, 0.0f);
    }

    @Override
    protected void x() {
        super.x();
        this.bO.a(0, new bmp(this));
        this.bO.a(4, new a());
        this.bO.a(5, new boi(this, 0.4));
        this.bO.a(6, new bnd(this, byo.class, 6.0f));
        this.bO.a(10, new bnd(this, bgb.class, 8.0f));
        this.bP.a(2, new bon(this, bzw.class).a(new Class[0]));
        this.bP.a(3, new boo<byo>((bgb)this, byo.class, true));
        this.bP.a(4, new boo<bxw>((bgb)this, bxw.class, true, $$0 -> !$$0.h_()));
        this.bP.a(4, new boo<brx>((bgb)this, brx.class, true));
    }

    @Override
    protected void P() {
        boolean $$0 = !(this.cL() instanceof bgb) || this.cL().ae().a(amz.b);
        boolean $$1 = !(this.cW() instanceof cah);
        this.bO.a(bmv.a.a, $$0);
        this.bO.a(bmv.a.c, $$0 && $$1);
        this.bO.a(bmv.a.b, $$0);
        this.bO.a(bmv.a.d, $$0);
    }

    public static bhf.a q() {
        return bwc.ge().a(bhg.a, 100.0).a(bhg.d, 0.3).a(bhg.c, 0.75).a(bhg.f, 12.0).a(bhg.g, 1.5).a(bhg.b, 32.0);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("AttackTick", this.ca);
        $$0.a("StunTick", this.cb);
        $$0.a("RoarTick", this.cc);
    }

    @Override
    public void a(qr $$0) {
        super.a($$0);
        this.ca = $$0.h("AttackTick");
        this.cb = $$0.h("StunTick");
        this.cc = $$0.h("RoarTick");
    }

    @Override
    public amg Y_() {
        return amh.ts;
    }

    @Override
    public int fC() {
        return 45;
    }

    @Override
    public double bx() {
        return 2.1;
    }

    @Override
    @Nullable
    public bfz cL() {
        bfz $$0;
        bfj bfj2;
        return !this.fQ() && (bfj2 = this.cO()) instanceof bfz ? ($$0 = (bfz)bfj2) : null;
    }

    @Override
    public void b_() {
        super.b_();
        if (!this.bs()) {
            return;
        }
        if (this.eT()) {
            this.a(bhg.d).a(0.0);
        } else {
            double $$0 = this.j() != null ? 0.35 : 0.3;
            double $$1 = this.a(bhg.d).b();
            this.a(bhg.d).a(apa.d(0.1, $$1, $$0));
        }
        if (this.O && this.dI().X().b(cmi.c)) {
            boolean $$2 = false;
            eed $$3 = this.cE().g(0.2);
            for (gu $$4 : gu.b(apa.a($$3.a), apa.a($$3.b), apa.a($$3.c), apa.a($$3.d), apa.a($$3.e), apa.a($$3.f))) {
                dcb $$5 = this.dI().a_($$4);
                cpn $$6 = $$5.b();
                if (!($$6 instanceof ctu)) continue;
                $$2 = this.dI().a($$4, true, this) || $$2;
            }
            if (!$$2 && this.ay()) {
                this.eW();
            }
        }
        if (this.cc > 0) {
            --this.cc;
            if (this.cc == 10) {
                this.gk();
            }
        }
        if (this.ca > 0) {
            --this.ca;
        }
        if (this.cb > 0) {
            --this.cb;
            this.gj();
            if (this.cb == 0) {
                this.a(amh.tx, 1.0f, 1.0f);
                this.cc = 20;
            }
        }
    }

    private void gj() {
        if (this.af.a(6) == 0) {
            double $$0 = this.dn() - (double)this.dd() * Math.sin(this.aV * ((float)Math.PI / 180)) + (this.af.j() * 0.6 - 0.3);
            double $$1 = this.dp() + (double)this.de() - 0.3;
            double $$2 = this.dt() + (double)this.dd() * Math.cos(this.aV * ((float)Math.PI / 180)) + (this.af.j() * 0.6 - 0.3);
            this.dI().a(iv.v, $$0, $$1, $$2, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
        }
    }

    @Override
    protected boolean eT() {
        return super.eT() || this.ca > 0 || this.cb > 0 || this.cc > 0;
    }

    @Override
    public boolean B(bfj $$0) {
        if (this.cb > 0 || this.cc > 0) {
            return false;
        }
        return super.B($$0);
    }

    @Override
    protected void e(bfz $$0) {
        if (this.cc == 0) {
            if (this.af.j() < 0.5) {
                this.cb = 40;
                this.a(amh.tw, 1.0f, 1.0f);
                this.dI().a((bfj)this, (byte)39);
                $$0.g((bfj)this);
            } else {
                this.a((bfj)$$0);
            }
            $$0.S = true;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void gk() {
        if (this.bs()) {
            void var3_5;
            List<bfj> $$0 = this.dI().a(bfz.class, this.cE().g(4.0), e);
            for (bfz bfz2 : $$0) {
                if (!(bfz2 instanceof bvk)) {
                    bfz2.a(this.dJ().b(this), 6.0f);
                }
                this.a((bfj)bfz2);
            }
            eei $$2 = this.cE().f();
            boolean bl2 = false;
            while (var3_5 < 40) {
                double $$4 = this.af.k() * 0.2;
                double $$5 = this.af.k() * 0.2;
                double $$6 = this.af.k() * 0.2;
                this.dI().a(iv.W, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
                ++var3_5;
            }
            this.a(dgl.u);
        }
    }

    private void a(bfj $$0) {
        double $$1 = $$0.dn() - this.dn();
        double $$2 = $$0.dt() - this.dt();
        double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
        $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 4) {
            this.ca = 10;
            this.a(amh.tr, 1.0f, 1.0f);
        } else if ($$0 == 39) {
            this.cb = 40;
        }
        super.b($$0);
    }

    public int r() {
        return this.ca;
    }

    public int fY() {
        return this.cb;
    }

    public int gi() {
        return this.cc;
    }

    @Override
    public boolean z(bfj $$0) {
        this.ca = 10;
        this.dI().a((bfj)this, (byte)4);
        this.a(amh.tr, 1.0f, 1.0f);
        return super.z($$0);
    }

    @Override
    @Nullable
    protected amg s() {
        return amh.tq;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.tu;
    }

    @Override
    protected amg g_() {
        return amh.tt;
    }

    @Override
    protected void b(gu $$0, dcb $$1) {
        this.a(amh.tv, 0.15f, 1.0f);
    }

    @Override
    public boolean a(cmp $$0) {
        return !$$0.d(this.cE());
    }

    @Override
    public void a(int $$0, boolean $$1) {
    }

    @Override
    public boolean fZ() {
        return false;
    }

    class a
    extends bnf {
        public a() {
            super(bwh.this, 1.0, true);
        }

        @Override
        protected double a(bfz $$0) {
            float $$1 = bwh.this.dd() - 0.1f;
            return $$1 * 2.0f * ($$1 * 2.0f) + $$0.dd();
        }
    }
}

