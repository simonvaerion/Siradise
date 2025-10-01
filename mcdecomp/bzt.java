/*
 * Decompiled with CFR 0.152.
 */
public class bzt
extends byv {
    private static final aby<Boolean> e = acb.a(bzt.class, aca.k);

    public bzt(bfn<? extends bzt> $$0, cmm $$1) {
        super((bfn<? extends byv>)$$0, $$1);
    }

    public bzt(cmm $$0, bfz $$1, double $$2, double $$3, double $$4) {
        super(bfn.bm, $$1, $$2, $$3, $$4, $$0);
    }

    @Override
    protected float o() {
        return this.p() ? 0.73f : super.o();
    }

    @Override
    public boolean bL() {
        return false;
    }

    @Override
    public float a(cme $$0, cls $$1, gu $$2, dcb $$3, dxe $$4, float $$5) {
        if (this.p() && buv.d($$3)) {
            return Math.min(0.8f, $$5);
        }
        return $$5;
    }

    @Override
    protected void a(eef $$0) {
        boolean $$5;
        super.a($$0);
        if (this.dI().B) {
            return;
        }
        bfj $$1 = $$0.a();
        bfj $$2 = this.v();
        if ($$2 instanceof bfz) {
            bfz $$3 = (bfz)$$2;
            boolean $$4 = $$1.a(this.dJ().a(this, (bfj)$$3), 8.0f);
            if ($$4) {
                if ($$1.bs()) {
                    this.a($$3, $$1);
                } else {
                    $$3.s(5.0f);
                }
            }
        } else {
            $$5 = $$1.a(this.dJ().o(), 5.0f);
        }
        if ($$5 && $$1 instanceof bfz) {
            bfz $$6 = (bfz)$$1;
            int $$7 = 0;
            if (this.dI().ai() == bdu.c) {
                $$7 = 10;
            } else if (this.dI().ai() == bdu.d) {
                $$7 = 40;
            }
            if ($$7 > 0) {
                $$6.b(new bfa(bfc.t, 20 * $$7, 1), this.A());
            }
        }
    }

    @Override
    protected void a(eeg $$0) {
        super.a($$0);
        if (!this.dI().B) {
            this.dI().a((bfj)this, this.dn(), this.dp(), this.dt(), 1.0f, false, cmm.a.c);
            this.ai();
        }
    }

    @Override
    public boolean bo() {
        return false;
    }

    @Override
    public boolean a(ben $$0, float $$1) {
        return false;
    }

    @Override
    protected void a_() {
        this.am.a(e, false);
    }

    public boolean p() {
        return this.am.b(e);
    }

    public void a(boolean $$0) {
        this.am.b(e, $$0);
    }

    @Override
    protected boolean aa_() {
        return false;
    }
}

