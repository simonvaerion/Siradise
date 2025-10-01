/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;

public class fiz
extends fiv {
    private eei g = eei.b;
    private int cl;

    public fiz(few $$0, GameProfile $$1) {
        super($$0, $$1);
        this.r(1.0f);
        this.ae = true;
    }

    @Override
    public boolean a(double $$0) {
        double $$1 = this.cE().a() * 10.0;
        if (Double.isNaN($$1)) {
            $$1 = 1.0;
        }
        return $$0 < ($$1 *= 64.0 * fiz.cx()) * $$1;
    }

    @Override
    public boolean a(ben $$0, float $$1) {
        return true;
    }

    @Override
    public void l() {
        super.l();
        this.q(false);
    }

    @Override
    public void b_() {
        float $$4;
        if (this.bo > 0) {
            double $$0 = this.dn() + (this.bp - this.dn()) / (double)this.bo;
            double $$1 = this.dp() + (this.bq - this.dp()) / (double)this.bo;
            double $$2 = this.dt() + (this.br - this.dt()) / (double)this.bo;
            this.a_(this.dy() + (float)apa.d(this.bs - (double)this.dy()) / (float)this.bo);
            this.b_(this.dA() + (float)(this.bt - (double)this.dA()) / (float)this.bo);
            --this.bo;
            this.e($$0, $$1, $$2);
            this.a(this.dy(), this.dA());
        }
        if (this.bv > 0) {
            this.aX += (float)(apa.d(this.bu - (double)this.aX) / (double)this.bv);
            --this.bv;
        }
        if (this.cl > 0) {
            this.g(new eei((this.g.c - this.dl().c) / (double)this.cl, (this.g.d - this.dl().d) / (double)this.cl, (this.g.e - this.dl().e) / (double)this.cl));
            --this.cl;
        }
        this.bU = this.bV;
        this.eL();
        if (!this.ay() || this.es()) {
            float $$3 = 0.0f;
        } else {
            $$4 = (float)Math.min(0.1, this.dl().h());
        }
        this.bV += ($$4 - this.bV) * 0.4f;
        this.dI().ad().a("push");
        this.fd();
        this.dI().ad().c();
    }

    @Override
    public void l(double $$0, double $$1, double $$2) {
        this.g = new eei($$0, $$1, $$2);
        this.cl = this.ae().p() + 1;
    }

    @Override
    protected void fH() {
    }

    @Override
    public void a(sw $$0) {
        enn $$1 = enn.N();
        $$1.l.d().a($$0);
    }
}

