/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.UUID;

public class bws
extends bzw
implements bwg {
    private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
    private static final bhe e = new bhe(b, "Drinking speed penalty", -0.25, bhe.a.a);
    private static final aby<Boolean> bT = acb.a(bws.class, aca.k);
    private int bU;
    private boq<bzw> bV;
    private bop<byo> bW;

    public bws(bfn<? extends bws> $$0, cmm $$1) {
        super((bfn<? extends bzw>)$$0, $$1);
    }

    @Override
    protected void x() {
        super.x();
        this.bV = new boq<bzw>(this, bzw.class, true, $$0 -> $$0 != null && this.gn() && $$0.ae() != bfn.bj);
        this.bW = new bop<byo>(this, byo.class, 10, true, false, null);
        this.bO.a(1, new bmp(this));
        this.bO.a(2, new bnu(this, 1.0, 60, 10.0f));
        this.bO.a(2, new boi(this, 1.0));
        this.bO.a(3, new bnd(this, byo.class, 8.0f));
        this.bO.a(3, new bnq(this));
        this.bP.a(1, new bon(this, bzw.class));
        this.bP.a(2, this.bV);
        this.bP.a(3, this.bW);
    }

    @Override
    protected void a_() {
        super.a_();
        this.aj().a(bT, false);
    }

    @Override
    protected amg s() {
        return amh.zS;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.zW;
    }

    @Override
    protected amg g_() {
        return amh.zU;
    }

    public void y(boolean $$0) {
        this.aj().b(bT, $$0);
    }

    public boolean q() {
        return this.aj().b(bT);
    }

    public static bhf.a r() {
        return bwc.ge().a(bhg.a, 26.0).a(bhg.d, 0.25);
    }

    @Override
    public void b_() {
        if (!this.dI().B && this.bs()) {
            this.bV.k();
            if (this.bV.i() <= 0) {
                this.bW.a(true);
            } else {
                this.bW.a(false);
            }
            if (this.q()) {
                if (this.bU-- <= 0) {
                    List<bfa> $$1;
                    this.y(false);
                    cfz $$0 = this.eO();
                    this.a(bfo.a, cfz.b);
                    if ($$0.a(cgc.rv) && ($$1 = chy.a($$0)) != null) {
                        for (bfa $$2 : $$1) {
                            this.b(new bfa($$2));
                        }
                    }
                    this.a(bhg.d).d(e);
                }
            } else {
                chw $$3 = null;
                if (this.af.i() < 0.15f && ((bfj)this).a(anb.a) && !this.a(bfc.m)) {
                    $$3 = chz.y;
                } else if (this.af.i() < 0.15f && (this.bL() || this.et() != null && this.et().a(amy.i)) && !this.a(bfc.l)) {
                    $$3 = chz.n;
                } else if (this.af.i() < 0.05f && this.er() < this.eI()) {
                    $$3 = chz.A;
                } else if (this.af.i() < 0.5f && this.j() != null && !this.a(bfc.a) && this.j().f((bfj)this) > 121.0) {
                    $$3 = chz.p;
                }
                if ($$3 != null) {
                    this.a(bfo.a, chy.a(new cfz(cgc.rv), $$3));
                    this.bU = this.eO().r();
                    this.y(true);
                    if (!this.aQ()) {
                        this.dI().a(null, this.dn(), this.dp(), this.dt(), amh.zV, this.cY(), 1.0f, 0.8f + this.af.i() * 0.4f);
                    }
                    bhc $$4 = this.a(bhg.d);
                    $$4.d(e);
                    $$4.b(e);
                }
            }
            if (this.af.i() < 7.5E-4f) {
                this.dI().a((bfj)this, (byte)15);
            }
        }
        super.b_();
    }

    @Override
    public amg Y_() {
        return amh.zT;
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 15) {
            for (int $$1 = 0; $$1 < this.af.a(35) + 10; ++$$1) {
                this.dI().a(iv.ah, this.dn() + this.af.k() * (double)0.13f, this.cE().e + 0.5 + this.af.k() * (double)0.13f, this.dt() + this.af.k() * (double)0.13f, 0.0, 0.0, 0.0);
            }
        } else {
            super.b($$0);
        }
    }

    @Override
    protected float e(ben $$0, float $$1) {
        $$1 = super.e($$0, $$1);
        if ($$0.d() == this) {
            $$1 = 0.0f;
        }
        if ($$0.a(amy.k)) {
            $$1 *= 0.15f;
        }
        return $$1;
    }

    @Override
    public void a(bfz $$0, float $$1) {
        if (this.q()) {
            return;
        }
        eei $$2 = $$0.dl();
        double $$3 = $$0.dn() + $$2.c - this.dn();
        double $$4 = $$0.dr() - (double)1.1f - this.dp();
        double $$5 = $$0.dt() + $$2.e - this.dt();
        double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
        chw $$7 = chz.C;
        if ($$0 instanceof bzw) {
            $$7 = $$0.er() <= 4.0f ? chz.A : chz.H;
            this.h((bfz)null);
        } else if ($$6 >= 8.0 && !$$0.a(bfc.b)) {
            $$7 = chz.s;
        } else if ($$0.er() >= 8.0f && !$$0.a(bfc.s)) {
            $$7 = chz.E;
        } else if ($$6 <= 3.0 && !$$0.a(bfc.r) && this.af.i() < 0.25f) {
            $$7 = chz.N;
        }
        bzr $$8 = new bzr(this.dI(), this);
        $$8.a(chy.a(new cfz(cgc.uu), $$7));
        $$8.b_($$8.dA() - -20.0f);
        $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75f, 8.0f);
        if (!this.aQ()) {
            this.dI().a(null, this.dn(), this.dp(), this.dt(), amh.zX, this.cY(), 1.0f, 0.8f + this.af.i() * 0.4f);
        }
        this.dI().b($$8);
    }

    @Override
    protected float b(bgl $$0, bfk $$1) {
        return 1.62f;
    }

    @Override
    public void a(int $$0, boolean $$1) {
    }

    @Override
    public boolean fZ() {
        return false;
    }
}

