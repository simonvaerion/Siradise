/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class bwa
extends bwm
implements bwg {
    private static final int e = 4;
    private static final int bT = 3;
    private static final int bU = 3;
    private int bV;
    private final eei[][] bW;

    public bwa(bfn<? extends bwa> $$0, cmm $$1) {
        super((bfn<? extends bwm>)$$0, $$1);
        this.bJ = 5;
        this.bW = new eei[2][4];
        for (int $$2 = 0; $$2 < 4; ++$$2) {
            this.bW[0][$$2] = eei.b;
            this.bW[1][$$2] = eei.b;
        }
    }

    @Override
    protected void x() {
        super.x();
        this.bO.a(0, new bmp(this));
        this.bO.a(1, new bwm.b(this));
        this.bO.a(4, new b());
        this.bO.a(5, new a());
        this.bO.a(6, new bnv<bwa>(this, 0.5, 20, 15.0f));
        this.bO.a(8, new bns(this, 0.6));
        this.bO.a(9, new bnd(this, byo.class, 3.0f, 1.0f));
        this.bO.a(10, new bnd(this, bgb.class, 8.0f));
        this.bP.a(1, new bon(this, bzw.class).a(new Class[0]));
        this.bP.a(2, new boo<byo>((bgb)this, byo.class, true).c(300));
        this.bP.a(3, new boo<bxw>((bgb)this, bxw.class, false).c(300));
        this.bP.a(3, new boo<brx>((bgb)this, brx.class, false).c(300));
    }

    public static bhf.a r() {
        return bwc.ge().a(bhg.d, 0.5).a(bhg.b, 18.0).a(bhg.a, 32.0);
    }

    @Override
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        this.a(bfo.a, new cfz(cgc.nG));
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    protected void a_() {
        super.a_();
    }

    @Override
    public eed j_() {
        return this.cE().c(3.0, 0.0, 3.0);
    }

    @Override
    public void b_() {
        super.b_();
        if (this.dI().B && this.cb()) {
            --this.bV;
            if (this.bV < 0) {
                this.bV = 0;
            }
            if (this.aL == 1 || this.ag % 1200 == 0) {
                this.bV = 3;
                float $$0 = -6.0f;
                int $$1 = 13;
                for (int $$2 = 0; $$2 < 4; ++$$2) {
                    this.bW[0][$$2] = this.bW[1][$$2];
                    this.bW[1][$$2] = new eei((double)(-6.0f + (float)this.af.a(13)) * 0.5, Math.max(0, this.af.a(6) - 4), (double)(-6.0f + (float)this.af.a(13)) * 0.5);
                }
                for (int $$3 = 0; $$3 < 16; ++$$3) {
                    this.dI().a(iv.f, this.d(0.5), this.dq(), this.f(0.5), 0.0, 0.0, 0.0);
                }
                this.dI().a(this.dn(), this.dp(), this.dt(), amh.lG, this.cY(), 1.0f, 1.0f, false);
            } else if (this.aL == this.aM - 1) {
                this.bV = 3;
                for (int $$4 = 0; $$4 < 4; ++$$4) {
                    this.bW[0][$$4] = this.bW[1][$$4];
                    this.bW[1][$$4] = new eei(0.0, 0.0, 0.0);
                }
            }
        }
    }

    @Override
    public amg Y_() {
        return amh.lC;
    }

    public eei[] D(float $$0) {
        if (this.bV <= 0) {
            return this.bW[1];
        }
        double $$1 = ((float)this.bV - $$0) / 3.0f;
        $$1 = Math.pow($$1, 0.25);
        eei[] $$2 = new eei[4];
        for (int $$3 = 0; $$3 < 4; ++$$3) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
        }
        return $$2;
    }

    @Override
    public boolean p(bfj $$0) {
        if (super.p($$0)) {
            return true;
        }
        if ($$0 instanceof bfz && ((bfz)$$0).eN() == bge.d) {
            return this.cd() == null && $$0.cd() == null;
        }
        return false;
    }

    @Override
    protected amg s() {
        return amh.lC;
    }

    @Override
    protected amg g_() {
        return amh.lE;
    }

    @Override
    protected amg d(ben $$0) {
        return amh.lF;
    }

    @Override
    protected amg fY() {
        return amh.lD;
    }

    @Override
    public void a(int $$0, boolean $$1) {
    }

    @Override
    public void a(bfz $$0, float $$1) {
        cfz $$2 = this.g(this.b(bzh.a(this, cgc.nG)));
        byu $$3 = bzh.a(this, $$2, $$1);
        double $$4 = $$0.dn() - this.dn();
        double $$5 = $$0.e(0.3333333333333333) - $$3.dp();
        double $$6 = $$0.dt() - this.dt();
        double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
        $$3.c($$4, $$5 + $$7 * (double)0.2f, $$6, 1.6f, 14 - this.dI().ai().a() * 4);
        this.a(amh.vA, 1.0f, 1.0f / (this.ec().i() * 0.4f + 0.8f));
        this.dI().b($$3);
    }

    @Override
    public bvk.a q() {
        if (this.gi()) {
            return bvk.a.c;
        }
        if (this.fS()) {
            return bvk.a.d;
        }
        return bvk.a.a;
    }

    class b
    extends bwm.c {
        b() {
            super(bwa.this);
        }

        @Override
        public boolean a() {
            if (!super.a()) {
                return false;
            }
            return !bwa.this.a(bfc.n);
        }

        @Override
        protected int h() {
            return 20;
        }

        @Override
        protected int i() {
            return 340;
        }

        @Override
        protected void k() {
            bwa.this.b(new bfa(bfc.n, 1200));
        }

        @Override
        @Nullable
        protected amg l() {
            return amh.lI;
        }

        @Override
        protected bwm.a m() {
            return bwm.a.e;
        }
    }

    class a
    extends bwm.c {
        private int e;

        a() {
            super(bwa.this);
        }

        @Override
        public boolean a() {
            if (!super.a()) {
                return false;
            }
            if (bwa.this.j() == null) {
                return false;
            }
            if (bwa.this.j().af() == this.e) {
                return false;
            }
            return bwa.this.dI().d_(bwa.this.di()).a(bdu.c.ordinal());
        }

        @Override
        public void c() {
            super.c();
            bfz $$0 = bwa.this.j();
            if ($$0 != null) {
                this.e = $$0.af();
            }
        }

        @Override
        protected int h() {
            return 20;
        }

        @Override
        protected int i() {
            return 180;
        }

        @Override
        protected void k() {
            bwa.this.j().b(new bfa(bfc.o, 400), bwa.this);
        }

        @Override
        protected amg l() {
            return amh.lH;
        }

        @Override
        protected bwm.a m() {
            return bwm.a.f;
        }
    }
}

