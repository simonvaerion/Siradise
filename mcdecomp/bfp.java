/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;

public class bfp
extends bfj {
    private static final int b = 6000;
    private static final int c = 20;
    private static final int d = 8;
    private static final int e = 40;
    private static final double f = 0.5;
    private int g;
    private int h = 5;
    private int i;
    private int j = 1;
    private byo k;

    public bfp(cmm $$0, double $$1, double $$2, double $$3, int $$4) {
        this((bfn<? extends bfp>)bfn.J, $$0);
        this.e($$1, $$2, $$3);
        this.a_((float)(this.af.j() * 360.0));
        this.o((this.af.j() * (double)0.2f - (double)0.1f) * 2.0, this.af.j() * 0.2 * 2.0, (this.af.j() * (double)0.2f - (double)0.1f) * 2.0);
        this.i = $$4;
    }

    public bfp(bfn<? extends bfp> $$0, cmm $$1) {
        super($$0, $$1);
    }

    @Override
    protected bfj.b aS() {
        return bfj.b.a;
    }

    @Override
    protected void a_() {
    }

    @Override
    public void l() {
        eei $$0;
        double $$1;
        super.l();
        this.J = this.dn();
        this.K = this.dp();
        this.L = this.dt();
        if (this.a(anb.a)) {
            this.p();
        } else if (!this.aR()) {
            this.f(this.dl().b(0.0, -0.03, 0.0));
        }
        if (this.dI().b_(this.di()).a(anb.b)) {
            this.o((this.af.i() - this.af.i()) * 0.2f, 0.2f, (this.af.i() - this.af.i()) * 0.2f);
        }
        if (!this.dI().b(this.cE())) {
            this.m(this.dn(), (this.cE().b + this.cE().e) / 2.0, this.dt());
        }
        if (this.ag % 20 == 1) {
            this.o();
        }
        if (this.k != null && (this.k.G_() || this.k.es())) {
            this.k = null;
        }
        if (this.k != null && ($$1 = ($$0 = new eei(this.k.dn() - this.dn(), this.k.dp() + (double)this.k.cF() / 2.0 - this.dp(), this.k.dt() - this.dt())).g()) < 64.0) {
            double $$2 = 1.0 - Math.sqrt($$1) / 8.0;
            this.f(this.dl().e($$0.d().a($$2 * $$2 * 0.1)));
        }
        this.a(bgf.a, this.dl());
        float $$3 = 0.98f;
        if (this.ay()) {
            $$3 = this.dI().a_(this.aE()).b().h() * 0.98f;
        }
        this.f(this.dl().d($$3, 0.98, $$3));
        if (this.ay()) {
            this.f(this.dl().d(1.0, -0.9, 1.0));
        }
        ++this.g;
        if (this.g >= 6000) {
            this.ai();
        }
    }

    @Override
    protected gu aE() {
        return this.d(0.999999f);
    }

    private void o() {
        if (this.k == null || this.k.f(this) > 64.0) {
            this.k = this.dI().a((bfj)this, 8.0);
        }
        if (this.dI() instanceof aif) {
            List<bfp> $$0 = this.dI().a(dfz.a(bfp.class), this.cE().g(0.5), this::a);
            for (bfp $$1 : $$0) {
                this.b($$1);
            }
        }
    }

    public static void a(aif $$0, eei $$1, int $$2) {
        while ($$2 > 0) {
            int $$3 = bfp.b($$2);
            $$2 -= $$3;
            if (bfp.b($$0, $$1, $$3)) continue;
            $$0.b(new bfp($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
        }
    }

    private static boolean b(aif $$0, eei $$1, int $$22) {
        eed $$3 = eed.a($$1, 1.0, 1.0, 1.0);
        int $$4 = $$0.y_().a(40);
        List<bfp> $$5 = $$0.a(dfz.a(bfp.class), $$3, (? super T $$2) -> bfp.a($$2, $$4, $$22));
        if (!$$5.isEmpty()) {
            bfp $$6 = $$5.get(0);
            ++$$6.j;
            $$6.g = 0;
            return true;
        }
        return false;
    }

    private boolean a(bfp $$0) {
        return $$0 != this && bfp.a($$0, this.af(), this.i);
    }

    private static boolean a(bfp $$0, int $$1, int $$2) {
        return !$$0.dD() && ($$0.af() - $$1) % 40 == 0 && $$0.i == $$2;
    }

    private void b(bfp $$0) {
        this.j += $$0.j;
        this.g = Math.min(this.g, $$0.g);
        $$0.ai();
    }

    private void p() {
        eei $$0 = this.dl();
        this.o($$0.c * (double)0.99f, Math.min($$0.d + (double)5.0E-4f, (double)0.06f), $$0.e * (double)0.99f);
    }

    @Override
    protected void bd() {
    }

    @Override
    public boolean a(ben $$0, float $$1) {
        if (this.b($$0)) {
            return false;
        }
        if (this.dI().B) {
            return true;
        }
        this.bl();
        this.h = (int)((float)this.h - $$1);
        if (this.h <= 0) {
            this.ai();
        }
        return true;
    }

    @Override
    public void b(qr $$0) {
        $$0.a("Health", (short)this.h);
        $$0.a("Age", (short)this.g);
        $$0.a("Value", (short)this.i);
        $$0.a("Count", this.j);
    }

    @Override
    public void a(qr $$0) {
        this.h = $$0.g("Health");
        this.g = $$0.g("Age");
        this.i = $$0.g("Value");
        this.j = Math.max($$0.h("Count"), 1);
    }

    @Override
    public void b_(byo $$0) {
        if (this.dI().B) {
            return;
        }
        if ($$0.bW == 0) {
            $$0.bW = 2;
            $$0.a((bfj)this, 1);
            int $$1 = this.a($$0, this.i);
            if ($$1 > 0) {
                $$0.d($$1);
            }
            --this.j;
            if (this.j == 0) {
                this.ai();
            }
        }
    }

    private int a(byo $$0, int $$1) {
        Map.Entry<bfo, cfz> $$2 = cki.a(ckk.L, $$0, cfz::j);
        if ($$2 != null) {
            cfz $$3 = $$2.getValue();
            int $$4 = Math.min(this.d(this.i), $$3.k());
            $$3.b($$3.k() - $$4);
            int $$5 = $$1 - this.c($$4);
            if ($$5 > 0) {
                return this.a($$0, $$5);
            }
            return 0;
        }
        return $$1;
    }

    private int c(int $$0) {
        return $$0 / 2;
    }

    private int d(int $$0) {
        return $$0 * 2;
    }

    public int j() {
        return this.i;
    }

    public int k() {
        if (this.i >= 2477) {
            return 10;
        }
        if (this.i >= 1237) {
            return 9;
        }
        if (this.i >= 617) {
            return 8;
        }
        if (this.i >= 307) {
            return 7;
        }
        if (this.i >= 149) {
            return 6;
        }
        if (this.i >= 73) {
            return 5;
        }
        if (this.i >= 37) {
            return 4;
        }
        if (this.i >= 17) {
            return 3;
        }
        if (this.i >= 7) {
            return 2;
        }
        if (this.i >= 3) {
            return 1;
        }
        return 0;
    }

    public static int b(int $$0) {
        if ($$0 >= 2477) {
            return 2477;
        }
        if ($$0 >= 1237) {
            return 1237;
        }
        if ($$0 >= 617) {
            return 617;
        }
        if ($$0 >= 307) {
            return 307;
        }
        if ($$0 >= 149) {
            return 149;
        }
        if ($$0 >= 73) {
            return 73;
        }
        if ($$0 >= 37) {
            return 37;
        }
        if ($$0 >= 17) {
            return 17;
        }
        if ($$0 >= 7) {
            return 7;
        }
        if ($$0 >= 3) {
            return 3;
        }
        return 1;
    }

    @Override
    public boolean cn() {
        return false;
    }

    @Override
    public uo<ur> S() {
        return new ut(this);
    }

    @Override
    public ami cY() {
        return ami.i;
    }
}

