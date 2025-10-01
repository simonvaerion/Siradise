/*
 * Decompiled with CFR 0.152.
 */
public class bzq
extends bzm {
    public bzq(bfn<? extends bzq> $$0, cmm $$1) {
        super((bfn<? extends bzm>)$$0, $$1);
    }

    public bzq(cmm $$0, bfz $$1) {
        super((bfn<? extends bzm>)bfn.I, $$1, $$0);
    }

    public bzq(cmm $$0, double $$1, double $$2, double $$3) {
        super((bfn<? extends bzm>)bfn.I, $$1, $$2, $$3, $$0);
    }

    @Override
    protected cfu k() {
        return cgc.te;
    }

    @Override
    protected float p() {
        return 0.07f;
    }

    @Override
    protected void a(eeg $$0) {
        super.a($$0);
        if (this.dI() instanceof aif) {
            this.dI().c(2002, this.di(), chy.a(chz.c));
            int $$1 = 3 + this.dI().z.a(5) + this.dI().z.a(5);
            bfp.a((aif)this.dI(), this.dg(), $$1);
            this.ai();
        }
    }
}

