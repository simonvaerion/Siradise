/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brt
extends bsn {
    private static final aby<gu> d = acb.a(brt.class, aca.n);
    private static final aby<Boolean> e = acb.a(brt.class, aca.k);
    private static final aby<Integer> bT = acb.a(brt.class, aca.b);
    static final bqm bU = bqm.b().a(10.0).d();
    public static final int b = 4800;
    private static final int bV = 2400;
    public static final Predicate<bvh> c = $$0 -> !$$0.r() && $$0.bs() && $$0.aV();

    public brt(bfn<? extends brt> $$0, cmm $$1) {
        super((bfn<? extends bsn>)$$0, $$1);
        this.bL = new bma(this, 85, 10, 0.02f, 0.1f, true);
        this.bK = new blz(this, 10);
        this.s(true);
    }

    @Override
    @Nullable
    public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
        this.j(this.ce());
        this.b_(0.0f);
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public boolean dN() {
        return false;
    }

    @Override
    protected void b(int $$0) {
    }

    public void i(gu $$0) {
        this.am.b(d, $$0);
    }

    public gu q() {
        return this.am.b(d);
    }

    public boolean r() {
        return this.am.b(e);
    }

    public void w(boolean $$0) {
        this.am.b(e, $$0);
    }

    public int w() {
        return this.am.b(bT);
    }

    public void c(int $$0) {
        this.am.b(bT, $$0);
    }

    @Override
    protected void a_() {
        super.a_();
        this.am.a(d, gu.b);
        this.am.a(e, false);
        this.am.a(bT, 2400);
    }

    @Override
    public void b(qr $$0) {
        super.b($$0);
        $$0.a("TreasurePosX", this.q().u());
        $$0.a("TreasurePosY", this.q().v());
        $$0.a("TreasurePosZ", this.q().w());
        $$0.a("GotFish", this.r());
        $$0.a("Moistness", this.w());
    }

    @Override
    public void a(qr $$0) {
        int $$1 = $$0.h("TreasurePosX");
        int $$2 = $$0.h("TreasurePosY");
        int $$3 = $$0.h("TreasurePosZ");
        this.i(new gu($$1, $$2, $$3));
        super.a($$0);
        this.w($$0.q("GotFish"));
        this.c($$0.h("Moistness"));
    }

    @Override
    protected void x() {
        this.bO.a(0, new bmg(this));
        this.bO.a(0, new bof(this));
        this.bO.a(1, new a(this));
        this.bO.a(2, new b(this, 4.0));
        this.bO.a(4, new bnt(this, 1.0, 10));
        this.bO.a(4, new bnq(this));
        this.bO.a(5, new bnd(this, byo.class, 6.0f));
        this.bO.a(5, new bml(this, 10));
        this.bO.a(6, new bnf(this, 1.2f, true));
        this.bO.a(8, new c());
        this.bO.a(8, new bmq(this));
        this.bO.a(9, new bmc<bvy>(this, bvy.class, 8.0f, 1.0, 1.0));
        this.bP.a(1, new bon(this, bvy.class).a(new Class[0]));
    }

    public static bhf.a fY() {
        return bgb.y().a(bhg.a, 10.0).a(bhg.d, 1.2f).a(bhg.f, 3.0);
    }

    @Override
    protected bpj b(cmm $$0) {
        return new bpl(this, $$0);
    }

    @Override
    public boolean z(bfj $$0) {
        boolean $$1 = $$0.a(this.dJ().b(this), (float)((int)this.b(bhg.f)));
        if ($$1) {
            this.a((bfz)this, $$0);
            this.a(amh.fR, 1.0f, 1.0f);
        }
        return $$1;
    }

    @Override
    public int ce() {
        return 4800;
    }

    @Override
    protected int n(int $$0) {
        return this.ce();
    }

    @Override
    protected float b(bgl $$0, bfk $$1) {
        return 0.3f;
    }

    @Override
    public int X() {
        return 1;
    }

    @Override
    public int fC() {
        return 1;
    }

    @Override
    protected boolean l(bfj $$0) {
        return true;
    }

    @Override
    public boolean f(cfz $$0) {
        bfo $$1 = bgb.h($$0);
        if (!this.c($$1).b()) {
            return false;
        }
        return $$1 == bfo.a && super.f($$0);
    }

    @Override
    protected void b(bvh $$0) {
        cfz $$1;
        if (this.c(bfo.a).b() && this.j($$1 = $$0.j())) {
            this.a($$0);
            this.a(bfo.a, $$1);
            this.e(bfo.a);
            this.a((bfj)$$0, $$1.L());
            $$0.ai();
        }
    }

    @Override
    public void l() {
        super.l();
        if (this.fQ()) {
            this.j(this.ce());
            return;
        }
        if (this.aX()) {
            this.c(2400);
        } else {
            this.c(this.w() - 1);
            if (this.w() <= 0) {
                this.a(this.dJ().r(), 1.0f);
            }
            if (this.ay()) {
                this.f(this.dl().b((this.af.i() * 2.0f - 1.0f) * 0.2f, 0.5, (this.af.i() * 2.0f - 1.0f) * 0.2f));
                this.a_(this.af.i() * 360.0f);
                this.c(false);
                this.at = true;
            }
        }
        if (this.dI().B && this.aV() && this.dl().g() > 0.03) {
            eei $$0 = this.f(0.0f);
            float $$1 = apa.b(this.dy() * ((float)Math.PI / 180)) * 0.3f;
            float $$2 = apa.a(this.dy() * ((float)Math.PI / 180)) * 0.3f;
            float $$3 = 1.2f - this.af.i() * 0.7f;
            for (int $$4 = 0; $$4 < 2; ++$$4) {
                this.dI().a(iv.am, this.dn() - $$0.c * (double)$$3 + (double)$$1, this.dp() - $$0.d, this.dt() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
                this.dI().a(iv.am, this.dn() - $$0.c * (double)$$3 - (double)$$1, this.dp() - $$0.d, this.dt() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 38) {
            this.a(iv.K);
        } else {
            super.b($$0);
        }
    }

    private void a(it $$0) {
        for (int $$1 = 0; $$1 < 7; ++$$1) {
            double $$2 = this.af.k() * 0.01;
            double $$3 = this.af.k() * 0.01;
            double $$4 = this.af.k() * 0.01;
            this.dI().a($$0, this.d(1.0), this.dq() + 0.2, this.g(1.0), $$2, $$3, $$4);
        }
    }

    @Override
    protected bdx b(byo $$0, bdw $$1) {
        cfz $$2 = $$0.b($$1);
        if (!$$2.b() && $$2.a(ane.ao)) {
            if (!this.dI().B) {
                this.a(amh.fT, 1.0f, 1.0f);
            }
            this.w(true);
            if (!$$0.fO().d) {
                $$2.h(1);
            }
            return bdx.a(this.dI().B);
        }
        return super.b($$0, $$1);
    }

    @Override
    protected amg d(ben $$0) {
        return amh.fU;
    }

    @Override
    @Nullable
    protected amg g_() {
        return amh.fS;
    }

    @Override
    @Nullable
    protected amg s() {
        return this.aV() ? amh.fQ : amh.fP;
    }

    @Override
    protected amg aK() {
        return amh.fX;
    }

    @Override
    protected amg aJ() {
        return amh.fY;
    }

    protected boolean fZ() {
        gu $$0 = this.J().h();
        if ($$0 != null) {
            return $$0.a(this.dg(), 12.0);
        }
        return false;
    }

    @Override
    public void h(eei $$0) {
        if (this.cV() && this.aV()) {
            this.a(this.fa(), $$0);
            this.a(bgf.a, this.dl());
            this.f(this.dl().a(0.9));
            if (this.j() == null) {
                this.f(this.dl().b(0.0, -0.005, 0.0));
            }
        } else {
            super.h($$0);
        }
    }

    @Override
    public boolean a(byo $$0) {
        return true;
    }

    static class a
    extends bmv {
        private final brt a;
        private boolean b;

        a(brt $$0) {
            this.a = $$0;
            this.a(EnumSet.of(bmv.a.a, bmv.a.b));
        }

        @Override
        public boolean J_() {
            return false;
        }

        @Override
        public boolean a() {
            return this.a.r() && this.a.cf() >= 100;
        }

        @Override
        public boolean b() {
            gu $$0 = this.a.q();
            return !gu.a((double)$$0.u(), this.a.dp(), (double)$$0.w()).a(this.a.dg(), 4.0) && !this.b && this.a.cf() >= 100;
        }

        @Override
        public void c() {
            if (!(this.a.dI() instanceof aif)) {
                return;
            }
            aif $$0 = (aif)this.a.dI();
            this.b = false;
            this.a.J().n();
            gu $$1 = this.a.di();
            gu $$2 = $$0.a(anh.b, $$1, 50, false);
            if ($$2 == null) {
                this.b = true;
                return;
            }
            this.a.i($$2);
            $$0.a((bfj)this.a, (byte)38);
        }

        @Override
        public void d() {
            gu $$0 = this.a.q();
            if (gu.a((double)$$0.u(), this.a.dp(), (double)$$0.w()).a(this.a.dg(), 4.0) || this.b) {
                this.a.w(false);
            }
        }

        @Override
        public void e() {
            cmm $$0 = this.a.dI();
            if (this.a.fZ() || this.a.J().l()) {
                gu $$3;
                eei $$1 = eei.b(this.a.q());
                eei $$2 = bqq.a((bgi)this.a, 16, 1, $$1, 0.3926991f);
                if ($$2 == null) {
                    $$2 = bqq.a((bgi)this.a, 8, 4, $$1, 1.5707963705062866);
                }
                if (!($$2 == null || $$0.b_($$3 = gu.a($$2)).a(anb.a) && $$0.a_($$3).a((cls)$$0, $$3, dxu.b))) {
                    $$2 = bqq.a((bgi)this.a, 8, 5, $$1, 1.5707963705062866);
                }
                if ($$2 == null) {
                    this.b = true;
                    return;
                }
                this.a.E().a($$2.c, $$2.d, $$2.e, this.a.fC() + 20, this.a.X());
                this.a.J().a($$2.c, $$2.d, $$2.e, 1.3);
                if ($$0.z.a(this.a(80)) == 0) {
                    $$0.a((bfj)this.a, (byte)38);
                }
            }
        }
    }

    static class b
    extends bmv {
        private final brt a;
        private final double b;
        @Nullable
        private byo c;

        b(brt $$0, double $$1) {
            this.a = $$0;
            this.b = $$1;
            this.a(EnumSet.of(bmv.a.a, bmv.a.b));
        }

        @Override
        public boolean a() {
            this.c = this.a.dI().a(bU, this.a);
            if (this.c == null) {
                return false;
            }
            return this.c.bW() && this.a.j() != this.c;
        }

        @Override
        public boolean b() {
            return this.c != null && this.c.bW() && this.a.f((bfj)this.c) < 256.0;
        }

        @Override
        public void c() {
            this.c.b(new bfa(bfc.D, 100), this.a);
        }

        @Override
        public void d() {
            this.c = null;
            this.a.J().n();
        }

        @Override
        public void e() {
            this.a.E().a(this.c, (float)(this.a.fC() + 20), (float)this.a.X());
            if (this.a.f((bfj)this.c) < 6.25) {
                this.a.J().n();
            } else {
                this.a.J().a((bfj)this.c, this.b);
            }
            if (this.c.bW() && this.c.dI().z.a(6) == 0) {
                this.c.b(new bfa(bfc.D, 100), this.a);
            }
        }
    }

    class c
    extends bmv {
        private int b;

        c() {
        }

        @Override
        public boolean a() {
            if (this.b > brt.this.ag) {
                return false;
            }
            List<bvh> $$0 = brt.this.dI().a(bvh.class, brt.this.cE().c(8.0, 8.0, 8.0), c);
            return !$$0.isEmpty() || !brt.this.c(bfo.a).b();
        }

        @Override
        public void c() {
            List<bvh> $$0 = brt.this.dI().a(bvh.class, brt.this.cE().c(8.0, 8.0, 8.0), c);
            if (!$$0.isEmpty()) {
                brt.this.J().a((bfj)$$0.get(0), (double)1.2f);
                brt.this.a(amh.fW, 1.0f, 1.0f);
            }
            this.b = 0;
        }

        @Override
        public void d() {
            cfz $$0 = brt.this.c(bfo.a);
            if (!$$0.b()) {
                this.a($$0);
                brt.this.a(bfo.a, cfz.b);
                this.b = brt.this.ag + brt.this.af.a(100);
            }
        }

        @Override
        public void e() {
            List<bvh> $$0 = brt.this.dI().a(bvh.class, brt.this.cE().c(8.0, 8.0, 8.0), c);
            cfz $$1 = brt.this.c(bfo.a);
            if (!$$1.b()) {
                this.a($$1);
                brt.this.a(bfo.a, cfz.b);
            } else if (!$$0.isEmpty()) {
                brt.this.J().a((bfj)$$0.get(0), (double)1.2f);
            }
        }

        private void a(cfz $$0) {
            if ($$0.b()) {
                return;
            }
            double $$1 = brt.this.dr() - (double)0.3f;
            bvh $$2 = new bvh(brt.this.dI(), brt.this.dn(), $$1, brt.this.dt(), $$0);
            $$2.b(40);
            $$2.c(brt.this.ct());
            float $$3 = 0.3f;
            float $$4 = brt.this.af.i() * ((float)Math.PI * 2);
            float $$5 = 0.02f * brt.this.af.i();
            $$2.o(0.3f * -apa.a(brt.this.dy() * ((float)Math.PI / 180)) * apa.b(brt.this.dA() * ((float)Math.PI / 180)) + apa.b($$4) * $$5, 0.3f * apa.a(brt.this.dA() * ((float)Math.PI / 180)) * 1.5f, 0.3f * apa.b(brt.this.dy() * ((float)Math.PI / 180)) * apa.b(brt.this.dA() * ((float)Math.PI / 180)) + apa.a($$4) * $$5);
            brt.this.dI().b($$2);
        }
    }
}

