/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import javax.annotation.Nullable;

public class car
extends caf {
    private static final byte c = 10;
    private int d = -1;

    public car(bfn<? extends car> $$0, cmm $$1) {
        super($$0, $$1);
    }

    public car(cmm $$0, double $$1, double $$2, double $$3) {
        super(bfn.aZ, $$0, $$1, $$2, $$3);
    }

    @Override
    public caf.a t() {
        return caf.a.d;
    }

    @Override
    public dcb w() {
        return cpo.ck.n();
    }

    @Override
    public void l() {
        double $$0;
        super.l();
        if (this.d > 0) {
            --this.d;
            this.dI().a(iv.Z, this.dn(), this.dp() + 0.5, this.dt(), 0.0, 0.0, 0.0);
        } else if (this.d == 0) {
            this.h(this.dl().i());
        }
        if (this.O && ($$0 = this.dl().i()) >= (double)0.01f) {
            this.h($$0);
        }
    }

    @Override
    public boolean a(ben $$0, float $$1) {
        byu $$3;
        bfj $$2 = $$0.c();
        if ($$2 instanceof byu && ($$3 = (byu)$$2).bL()) {
            ben $$4 = this.dJ().d(this, $$0.d());
            this.a($$4, $$3.dl().g());
        }
        return super.a($$0, $$1);
    }

    @Override
    public void a(ben $$0) {
        double $$1 = this.dl().i();
        if ($$0.a(amy.i) || $$0.a(amy.l) || $$1 >= (double)0.01f) {
            if (this.d < 0) {
                this.A();
                this.d = this.af.a(20) + this.af.a(20);
            }
            return;
        }
        super.a($$0);
    }

    @Override
    protected cfu j() {
        return cgc.nd;
    }

    protected void h(double $$0) {
        this.a((ben)null, $$0);
    }

    protected void a(@Nullable ben $$0, double $$1) {
        if (!this.dI().B) {
            double $$2 = Math.sqrt($$1);
            if ($$2 > 5.0) {
                $$2 = 5.0;
            }
            this.dI().a(this, $$0, null, this.dn(), this.dp(), this.dt(), (float)(4.0 + this.af.j() * 1.5 * $$2), false, cmm.a.d);
            this.ai();
        }
    }

    @Override
    public boolean a(float $$0, float $$1, ben $$2) {
        if ($$0 >= 3.0f) {
            float $$3 = $$0 / 10.0f;
            this.h((double)($$3 * $$3));
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void a(int $$0, int $$1, int $$2, boolean $$3) {
        if ($$3 && this.d < 0) {
            this.A();
        }
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 10) {
            this.A();
        } else {
            super.b($$0);
        }
    }

    public void A() {
        this.d = 80;
        if (!this.dI().B) {
            this.dI().a((bfj)this, (byte)10);
            if (!this.aQ()) {
                this.dI().a(null, this.dn(), this.dp(), this.dt(), amh.xF, ami.e, 1.0f, 1.0f);
            }
        }
    }

    public int C() {
        return this.d;
    }

    public boolean D() {
        return this.d > -1;
    }

    @Override
    public float a(cme $$0, cls $$1, gu $$2, dcb $$3, dxe $$4, float $$5) {
        if (this.D() && ($$3.a(amw.N) || $$1.a_($$2.c()).a(amw.N))) {
            return 0.0f;
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public boolean a(cme $$0, cls $$1, gu $$2, dcb $$3, float $$4) {
        if (this.D() && ($$3.a(amw.N) || $$1.a_($$2.c()).a(amw.N))) {
            return false;
        }
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    protected void a(qr $$0) {
        super.a($$0);
        if ($$0.b("TNTFuse", 99)) {
            this.d = $$0.h("TNTFuse");
        }
    }

    @Override
    protected void b(qr $$0) {
        super.b($$0);
        $$0.a("TNTFuse", this.d);
    }
}

