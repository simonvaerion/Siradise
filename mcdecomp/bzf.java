/*
 * Decompiled with CFR 0.152.
 */
public class bzf
extends bzg {
    public bzf(bfn<? extends bzf> $$0, cmm $$1) {
        super((bfn<? extends bzg>)$$0, $$1);
    }

    public bzf(cmm $$0, btn $$1) {
        this((bfn<? extends bzf>)bfn.ak, $$0);
        this.b((bfj)$$1);
        this.e($$1.dn() - (double)($$1.dd() + 1.0f) * 0.5 * (double)apa.a($$1.aV * ((float)Math.PI / 180)), $$1.dr() - (double)0.1f, $$1.dt() + (double)($$1.dd() + 1.0f) * 0.5 * (double)apa.b($$1.aV * ((float)Math.PI / 180)));
    }

    @Override
    public void l() {
        super.l();
        eei $$0 = this.dl();
        eeg $$1 = bzh.a((bfj)this, this::a);
        this.a($$1);
        double $$2 = this.dn() + $$0.c;
        double $$3 = this.dp() + $$0.d;
        double $$4 = this.dt() + $$0.e;
        this.C();
        float $$5 = 0.99f;
        float $$6 = 0.06f;
        if (this.dI().a(this.cE()).noneMatch(dca.a::i)) {
            this.ai();
            return;
        }
        if (this.aY()) {
            this.ai();
            return;
        }
        this.f($$0.a((double)0.99f));
        if (!this.aR()) {
            this.f(this.dl().b(0.0, -0.06f, 0.0));
        }
        this.e($$2, $$3, $$4);
    }

    @Override
    protected void a(eef $$0) {
        super.a($$0);
        bfj bfj2 = this.v();
        if (bfj2 instanceof bfz) {
            bfz $$1 = (bfz)bfj2;
            $$0.a().a(this.dJ().a((bfj)this, $$1), 1.0f);
        }
    }

    @Override
    protected void a(eee $$0) {
        super.a($$0);
        if (!this.dI().B) {
            this.ai();
        }
    }

    @Override
    protected void a_() {
    }

    @Override
    public void a(us $$0) {
        super.a($$0);
        double $$1 = $$0.h();
        double $$2 = $$0.i();
        double $$3 = $$0.j();
        for (int $$4 = 0; $$4 < 7; ++$$4) {
            double $$5 = 0.4 + 0.1 * (double)$$4;
            this.dI().a(iv.ab, this.dn(), this.dp(), this.dt(), $$1 * $$5, $$2, $$3 * $$5);
        }
        this.o($$1, $$2, $$3);
    }
}

